# Porting rules

## Understand GT6, do not copy it

Decision (owner): no line of GT6 source may be copied into this project.

The GT6 codebase (1.7.10, at `/mnt/g/gregtech6`) is very different from 1.21.1 NeoForge. Port by understanding what a GT6 system does and why, then write the newest, modern implementation for this project.

How to apply:
- Read GT6 for behaviour, data and balance: what a machine does, what a recipe produces, what a material's properties mean. Do not transliterate its classes, method bodies, comments or structure.
- Do not mirror GT6 patterns that exist only because of 1.7.10 or its tooling, such as the `CS` constants class with single-letter names, tile entities extending large base classes, metadata-based items and global static mutable lists.
- Use current idioms: Kotlin, NeoForge registries, data components, capabilities, codecs and stream codecs for networking, and datapack recipes where they fit.
- Names, structure and comments are written fresh. Behaviour and numbers (for example amounts, melting points and tool stats) are facts about the game and can be reproduced.

### Exception: `data/CS.java`

Decision (owner): `data/CS.java` is an exception to the no-copy rule. It holds important GT6 constants (the material unit `CS.U` and its divisions, fluid units, and so on). Use it as it is.

How to apply:
- Reference constants from `CS` when you need them, instead of redefining them elsewhere.
- Do not port, rewrite, rename or replace `CS.java`, and do not split it into Kotlin constants.
- The exception covers only this file. Everything else still follows the no-copy rule above.

## Performance

Decision (owner): there are performance expectations. Use Kotlin features and the fastutil library.

fastutil is already on the classpath because Minecraft bundles it (`utils/KtFastUtils.kt` uses it).

How to apply:
- Prefer fastutil primitive collections (`Int2ObjectOpenHashMap`, `Object2IntOpenHashMap`, `IntArrayList`, `Long2ObjectOpenHashMap` and the like) over boxed `HashMap<Int, ...>`, `ArrayList<Int>` and similar, especially on hot paths such as world generation, rendering, colour handlers and ticking.
- Use `Reference2ObjectOpenHashMap` or `Reference2IntOpenHashMap` for identity-keyed lookups (blocks, items, registry holders) instead of `IdentityHashMap`.
- Use Kotlin features that avoid allocation: `inline` functions, value classes, `EnumMap` or arrays indexed by ordinal for enum keys, sequences only when they help, and `buildList`/`buildSet` only outside hot paths.
- Build lookup tables once at load time and keep them immutable. Do not rebuild them per call, per tick or per chunk.
- World generation runs on several threads, so shared state must be immutable or safely published.
- Measure before and after for anything large, such as the registration of thousands of materials and forms.

Existing code that does not follow this yet (for example `IdentityHashMap` and boxed `Int` values in `UtItemColors`) can be moved over when it is next changed.
