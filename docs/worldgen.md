# World generation and ore veins

Owner request over time: improve the world generation, use Minecraft's modern worldgen (registries,
codecs, placed features, biome modifiers), build rock layers and then generate ore veins inside them,
with veins defined as data whose name is not the material name. Then: make generation thread safe,
make veins as sparse as GT6's, add a separate small ore feature, and disable vanilla ore generation.

The code lives in `dev.lasm.uranustech.geology`. The data lives in `data/uranustech/worldgen`,
`data/uranustech/uranustech`, `data/uranustech/tags` and `data/uranustech/neoforge`.

## What exists

One feature, `uranustech:geology`, in the `underground_ores` step. It places the rock layers and every
ore in them in a single pass.

It was four features once, one per kind, in this order: `rock_layers`, `ore_veins`, `contact_ores`,
`small_ores`. That is wrong at a boundary, because the later features had to decide their ore by
*reading back* the rock the earlier one wrote. A chunk border is where that breaks: the neighbouring
chunk may not have written its rock yet, so the same column can get ore in one chunk and not in the
other. It is also slower, because the world is read once per feature per position.

So the rock for a position is derived from the layer noise directly and the ore is written into that
rock. The only thing read from the world is whether the block may be replaced at all, which is settled
before this step runs. Within one position a vein role wins, then a contact ore, then a small ore, then
the rock itself. GT6's `WorldgenStoneLayers` does the same thing in one column walk.

At `y <= 0`, the layer noise is overridden and the host rock is always vanilla deepslate. Veins and
small ores in this range use their deepslate ore state even when their normal `host_rocks` restriction
names another rock. Their configured height ranges are ignored in this layer: veins use a deterministic
centre within the deepslate range and small ores scatter across that range. Both are thinned to roughly
one quarter of their usual density there. Above zero, the configured rock layers, heights and host
restrictions apply as usual.

The data is still four files and three registries; only the order they are consulted in lives in
[GeologyFeature]. The vanilla ore features are still removed rather than left in place, because they
run in this same step and would otherwise generate on top of the new terrain.

## Veins

### Vein names are their own registry

`OreVein` is a datapack entry in `uranustech:ore_vein`, addressed by name: `uranustech:sapphire` is the
sapphire vein, and what it places is what the entry says. For that entry it is blue, orange and yellow
sapphire plus ruby, but name and materials are independent, so a pack can repoint a vein or add one
that shares nothing with its name.

```json
{
  "weight": 30, "density": 3, "size": 16, "min_y": 10, "max_y": 40,
  "host_rocks": ["diorite"],
  "bottom": "uranustech:blue_sapphire", "top": "uranustech:orange_sapphire",
  "between": "uranustech:yellow_sapphire", "spread": "uranustech:ruby"
}
```

A role is either a material id or a list of block states. A material expands to that material's ore
block, `uranustech:<material>_ore`, whose `host_rock` property supplies the host rock variants. A
material without an ore block is a load error, so a bad reference fails at startup with the vein's name
rather than leaving a hole.

`host_rocks` restricts the vein to those rock types and is omitted when it should appear anywhere. This
is the GT6 rule that a material belongs to the rock layer it sits in: sapphire is a diorite ore, diamond
is a kimberlite ore, and so on. The generator derives it from GT6's per-layer ore lists and only writes
it when every role of the vein agrees on the same set, because a restriction that one role does not
satisfy would silently remove that role from the world.

### Shape, and why it is sparse

From GT6's `WorldgenOresLarge`:

- `bottom` occupies `centre-1 .. centre+1`, `top` `centre+3 .. centre+5`.
- `between` is one block at `centre+2`, `spread` one block in `centre-1 .. centre+5`.
- **One block per column per role**, at a y drawn for that column.
- Density thins the columns: the chance denominator is the distance from the column to the *further*
  end of the vein divided by the density. Most columns in a large vein are therefore empty rock, and
  only the two tips are reliably filled.

The "one block per column" rule is what makes a vein ore in rock rather than a solid mass. Placing at
every y of the band instead triples the thickness, which is what made the first implementation far too
dense. `VeinDensity` holds that rule and the falloff.

### Chunks are independent

The feature is placed once per chunk and writes only inside it. A block inside a vein is decided from
the vein's origin chunk plus its own coordinates, so the neighbouring chunk that generates the same
vein later produces exactly the matching part, and chunk generation order cannot change the result.
`VeinRegistry.select` walks the origins within `REACH` chunks and keeps whose body overlaps the chunk
being generated. `ColumnOverlays` then turns those veins into a sorted list of ore positions for one
column, which is what the column walk consumes.

This is also why the feature may only use the plain block accessors: it runs during feature decoration,
where the level is a `WorldGenRegion` that serves only the chunks it has loaded, at `FEATURES` status.
Asking it for a chunk at `FULL` throws `Requested chunk unavailable during world generation`, and
iterating a chunk's section palette (the natural way to do a bulk replacement) is not available.

## Small ores

`SmallOre` is a datapack entry in `uranustech:small_ore`: one material, a height range, an amount and an
optional host rock restriction.

```json
{ "material": "uranustech:diamond", "min_y": 5, "max_y": 10, "amount": 2,
  "host_rocks": ["kimberlite"] }
```

Every configured small ore independently places `max(1, amount/2 + rand(amount)/2)` single blocks per chunk
at random positions in its height range, which matches GT6's `WorldgenOresSmall` behavior. They are separate
from veins because they are a different thing in the world: a vein is a large named multi-material
body, while a small ore is a hint that tells you what is nearby. When two deposits choose the same
position, the later entry in the configured list wins.

The chunk's positions are drawn before the column walk rather than during it, so `Scatter` can sort
them by column and y and the walk can consume each column with a cursor. A column keeps its first
[Scatter.SLOTS] positions and drops the rest; GT6's amounts stay far below that, and drawing more
positions than there are blocks in a column would only overlap.

## Contact ores (double layers)

`DoubleLayerOre` is a datapack entry in `uranustech:double_layer_ore`. This is GT6's "double layer" ore:
where two different rock types meet, the seam may hold a different ore again.

```json
{ "first": "komatiite", "second": "tholeiitic_basalt", "weight": 1, "density": 12,
  "min_y": 0, "max_y": 16, "both_directions": true, "ore": "uranustech:perlite" }
```

`both_directions` reproduces GT6's two helpers: `bothsides(A, B)` matches either order, while
`topbottom(A, B)` matches only `A` above `B`. The feature walks each column for rock type changes and
writes the ore into the contact block, so a seam gains a line of single blocks rather than a layer of
its own.

GT6's coal, lignite and oilshale are rock types rather than ores, and their contact ore is amber. This
project has no rock blocks for them, so those entries are omitted rather than placed against the wrong
rock.

## Tags

- `uranustech:geology_replaceable`: what generated geology may replace (vanilla stone and deepslate, and
  the rock layers).
- `uranustech:rock_layers`: the rock blocks, for recipes and other mods to match on.

There is one replaceable tag rather than the two there were when the layers and the ore were separate
features, because there is now one pass: nothing has to distinguish "what a layer may overwrite" from
"what an ore may overwrite".

## Thread safety

Chunk generation runs on several workers at once, and feature instances are shared across all of them.
Every piece of shared state in the geology package is therefore either immutable after construction or
a concurrent map:

- `OreResolver` and `SmallOreResolver` cache resolved block states in `ConcurrentHashMap`, built under
  `computeIfAbsent`, and return immutable maps.
- `WeightedTableCache` holds the per holder set weight tables, built once under `computeIfAbsent`.
- `LayerNoise` computes its offset table in a static initialiser and then only reads it.
- The features hold no mutable fields. Everything else is a local, a `MutableBlockPos` created per
  call, or one of the per-column scratch structures, all of which are per worker by construction.
- No code draws from a shared `RandomSource`. Every decision is a hash of the world seed and
  coordinates, so two workers cannot influence each other's results, and the same question always gets
  the same answer.

## Vanilla ores are removed

`biome_modifier/remove_vanilla_overworld_ores.json` removes every overworld ore feature in
`underground_ores`: the stone variants, coal, iron, gold, redstone, diamond, lapis, emerald, copper,
clay, dirt, gravel, tuff and infested stone. `biome_modifier/overworld_geology.json` adds the mod's one
feature in the same step.

Both halves are needed. The vanilla features run in `underground_ores`, after `raw_generation`, so
leaving them in would generate them on top of the rock layers and veins, and the layers would be
overwritten rather than replaced.

## Validation

`OreVeinValidator` resolves every vein role and every small ore at `ServerAboutToStartEvent`, reporting
the offending entry by name once at startup rather than failing part way through world generation. It
also warms the caches.

## Debugging

`/uranustech vein [radius]` reports the veins that can write into the caller's chunk, with their
bounds, centre height, y bands, weight, density, size and roles. `radius` also lists every origin
within that many chunks and the vein each was assigned.

It reads nothing from the level and runs the same `VeinRegistry` and `VeinBounds` code as generation,
so what it prints is what generation decided. The usual reason to run it is "why is there no ore here":
if no origin reaches the chunk, the spot is simply between veins, since origins are every third chunk.

## Scripts

`scripts/generate_geology_data.py` writes the 31 overworld veins, 22 contact ores and 31 small ores
from the GT6 tables in `Loader_Worldgen`, and updates the three entry lists of the one configured
feature. It resolves each GT6 material name against the generated material files, so it cannot emit an
entry whose material has no ore blocks. The feature's per-biome rock layers are hand maintained and
are only read, never rewritten, because they are a design decision about the world rather than a
mapping from a GT6 table.

Three tables in the script carry the GT6 data and the mapping onto this project:

- `LAYER_ORES` is GT6's per-rock ore list. It is what produces `host_rocks`, so a material ends up
  restricted to the rock layer it belongs to in GT6.
- `ROCK_NAMES` maps GT6 rock keys to the `HostRockType` names the codec accepts. A rock with no
  counterpart here leaves its ores unrestricted rather than restricting them to a rock that does not
  exist.
- `ALIASES` maps GT6 material names whose display name differs or is ambiguous, and `DROPPED` lists
  names with no counterpart here. Both are checked, so a mapping that stops working raises instead of
  silently dropping a role.

Run it with `uv run --project scripts python scripts/generate_geology_data.py` from the project root.

## Not done yet

- Bedrock ores, which in GT6 sit in the bedrock floor of a vein.
- Indicator rock items on the surface above a vein.
- The Mars, Moon, End and other dimension tables.
- Fluid springs and the GT6 dungeons.
