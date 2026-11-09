"""Generate ore vein, contact ore and small ore data from the GT6 world generation tables.

Vein names come from GT6's `ore.large.*` entries and small ore names from its `ore.small.*` entries,
translated to this project's naming. The materials they yield are mapped to this project's material
ids, and an entry is only written when the target material exists and actually has ore blocks. The
name and the materials stay independent, which is what lets a pack repoint a vein or a small ore.

The three kinds stay separate registries, and the script writes one entry list per kind into the single
geology configured feature. That feature's per-biome rock layers are hand maintained and only read
here, never rewritten.

Only overworld data is generated. The Mars, Moon and other GT6 dimension entries are out of scope
until this project generates those dimensions.
"""

import json
import pathlib
import re
import sys

ROOT = pathlib.Path(__file__).resolve().parents[1]
MATERIALS = ROOT / "src/main/java/dev/lasm/uranustech/data/materials"
DSL = ROOT / "src/main/java/dev/lasm/uranustech/api/chemical/material/Material.kt"
VEIN_DIR = ROOT / "src/main/resources/data/uranustech/uranustech/ore_vein"
SMALL_DIR = ROOT / "src/main/resources/data/uranustech/uranustech/small_ore"
DOUBLE_DIR = ROOT / "src/main/resources/data/uranustech/uranustech/double_layer_ore"
GEOLOGY_CONFIG = ROOT / "src/main/resources/data/uranustech/worldgen/configured_feature/geology.json"


# GT6 rock type -> this project's host rock names, read from HostRockType.
#
# GT6 has far more rock types than this project carries. A rock with no counterpart is mapped to null
# and its ores are then published without a host restriction rather than against the wrong rock, since
# restricting an ore to a rock that does not exist would remove it from the world.
# GT6 rock key -> the HostRockType name the codec accepts. Keys absent from ROCK_NAMES have no
# counterpart here and cannot be used in contact ore data.
ROCK_NAMES = {
    "STONE": "stone",
    "GRANITE": "granite",
    "GRANITE_RED": "granite_red",
    "GRANITE_BLACK": "granite_black",
    "DIORITE": "diorite",
    "ANDESITE": "andesite",
    "THOLEIITIC_BASALT": "tholeiitic_basalt",
    "MARBLE": "marble",
    "LIMESTONE": "limestone",
    "KOMATIITE": "komatiite",
    "GREENSCHIST": "greenschist",
    "BLUESCHIST": "blueschist",
    "KIMBERLITE": "kimberlite",
    "QUARTZITE": "quartzite",
}

ROCKS = {
    "Stone": ["stone"],
    "Granite": ["granite"],
    "GraniteRed": ["granite_red"],
    "GraniteBlack": ["granite_black"],
    "Diorite": ["diorite"],
    "Andesite": ["andesite"],
    "Basalt": ["tholeiitic_basalt"],
    "Marble": ["marble"],
    "Limestone": ["limestone"],
    "Komatiite": ["komatiite"],
    "SchistGreen": ["greenschist"],
    "SchistBlue": ["blueschist"],
    "Kimberlite": ["kimberlite"],
    "Quartzite": ["quartzite"],
}

# GT6's per-rock ore lists: rock -> materials that only appear in that rock.
#
# These come from the `StoneLayer.LAYERS` entries in Loader_Worldgen. A material listed here is
# restricted to those rocks; a material that appears under no rock keeps its biome and height rules
# only. GT6 material names are used; resolve() maps them to this project's ids.
LAYER_ORES = {
    "Kimberlite": ["Diamond", "Spinel", "BalasRuby"],
    "Komatiite": ["MgCO3", "OREMATS.Cinnabar", "Redstone", "Pyrite"],
    "Basalt": ["Asbestos", "FluoriteWhite", "S", "OREMATS.Bastnasite", "Monazite", "MnO2",
               "Peridot", "Uvarovite", "Grossular", "OREMATS.Chromite"],
    "Marble": ["OREMATS.Cassiterite", "Dioptase", "OREMATS.Stannite", "OREMATS.Kesterite",
               "OREMATS.Sphalerite", "OREMATS.Chalcopyrite", "Pyrite"],
    "Limestone": ["Bone", "NaCl", "OREMATS.Stibnite", "OREMATS.Galena", "Pb",
                  "OREMATS.Arsenopyrite", "OREMATS.Wulfenite", "OREMATS.Powellite",
                  "OREMATS.Molybdenite", "OREMATS.Tetrahedrite", "Cu", "OREMATS.Scheelite",
                  "OREMATS.Wolframite", "OREMATS.Ferberite", "OREMATS.Huebnerite",
                  "OREMATS.Tungstate", "OREMATS.YellowLimonite", "OREMATS.BrownLimonite",
                  "OREMATS.Malachite", "Azurite"],
    "GraniteBlack": ["OREMATS.Cooperite", "OREMATS.Sperrylite", "Ir", "Emerald", "Aquamarine",
                     "Morganite", "Heliodor", "Goshenite", "Bixbite", "Maxixe"],
    "GraniteRed": ["OREMATS.Pitchblende", "OREMATS.Uraninite", "OREMATS.Tantalite",
                   "OREMATS.Columbite", "OREMATS.Coltan"],
    "Granite": ["BlueTopaz", "Topaz", "Apatite", "PO4", "Phosphorite", "PhosphorusRed"],
    "Diorite": ["Sapphire", "GreenSapphire", "YellowSapphire", "OrangeSapphire", "BlueSapphire",
                "PurpleSapphire", "Ruby", "OREMATS.Garnierite", "OREMATS.Pentlandite",
                "OREMATS.Cobaltite", "Craponite", "Amethyst", "Alexandrite"],
    "SchistGreen": ["Andradite", "Almandine"],
    "SchistBlue": ["Spessartine", "Pyrope"],
    "Quartzite": ["Niter", "CertusQuartz", "OREMATS.Barite"],
}

# GT6's contact ores, from the `StoneLayer.bothsides` and `topbottom` calls.
#
# (first rock, second rock, both directions, ore, min_y, max_y, weight, density)
#
# The rock names are GT6 keys, mapped through ROCK_NAMES. GT6's coal, lignite and oilshale layers are
# absent because this project has no rock blocks for them, so their contact ore (amber) is omitted
# rather than placed against the wrong rock.
DOUBLE_LAYERS = [
    ("KOMATIITE", "THOLEIITIC_BASALT", True, "Perlite", 0, 16, 1, 12),
    ("LIMESTONE", "THOLEIITIC_BASALT", True, "Ilmenite", 0, 32, 1, 8),
    ("MARBLE", "QUARTZITE", True, "Kyanite", 32, 72, 1, 6),
    ("LIMESTONE", "QUARTZITE", True, "Lepidolite", 16, 48, 1, 6),
    ("BLUESCHIST", "GREENSCHIST", True, "Spodumene", 32, 64, 1, 8),
    ("KIMBERLITE", "THOLEIITIC_BASALT", True, "Diamond", 0, 32, 1, 3),
    ("GRANITE", "MARBLE", True, "Diatomite", 16, 64, 1, 12),
    ("DIORITE", "MARBLE", True, "Alunite", 32, 80, 1, 8),
    ("GREENSCHIST", "LIMESTONE", True, "Glauconite", 32, 80, 1, 6),
    ("GRANITE_BLACK", "MARBLE", True, "Lapis", 0, 48, 4, 4),
    ("GRANITE_BLACK", "MARBLE", True, "Pyrite", 0, 48, 2, 4),
    ("GRANITE_BLACK", "GRANITE", True, "Zircon", 0, 32, 1, 8),
    ("GRANITE_BLACK", "GRANITE_RED", True, "Zircon", 0, 32, 1, 8),
    ("GRANITE_BLACK", "GREENSCHIST", True, "Biotite", 16, 48, 1, 8),
    ("GRANITE_RED", "QUARTZITE", True, "Vermiculite", 48, 80, 1, 8),
    ("GRANITE_RED", "GREENSCHIST", True, "Asbestos", 16, 48, 1, 8),
    ("STONE", "MARBLE", True, "Zeolite", 16, 48, 1, 8),
    ("STONE", "LIMESTONE", True, "Pollucite", 16, 48, 1, 12),
    ("STONE", "DIORITE", True, "Niter", 10, 40, 1, 8),
    ("DIORITE", "KIMBERLITE", True, "Opal", 48, 64, 1, 6),
    ("ANDESITE", "THOLEIITIC_BASALT", True, "Perlite", 0, 16, 1, 10),
    ("QUARTZITE", "STONE", True, "CertusQuartz", 16, 48, 1, 8),
]

# (name, min_y, max_y, amount, GT6 OreDictMaterial name)
# Each entry independently scatters its amount in each chunk, as in GT6.
SMALL_ORES = [
    ("copper", 60, 120, 16, "Cu"),
    ("chalcopyrite", 60, 120, 16, "Chalcopyrite"),
    ("malachite", 40, 70, 8, "Malachite"),
    ("tin", 60, 120, 16, "Sn"),
    ("cassiterite", 60, 120, 16, "Cassiterite"),
    ("zinc", 40, 70, 4, "Zn"),
    ("sphalerite", 30, 60, 12, "Sphalerite"),
    ("smithsonite", 30, 60, 2, "Smithsonite"),
    ("stibnite", 20, 40, 2, "Stibnite"),
    ("bismuth", 80, 120, 8, "Bi"),
    ("lead", 40, 80, 16, "Pb"),
    ("galena", 40, 80, 16, "Galena"),
    ("silver", 20, 40, 4, "Silver"),
    ("gold", 20, 40, 4, "Gold"),
    ("pyrite", 20, 40, 4, "Pyrite"),
    ("hematite", 40, 80, 24, "IronOxide"),
    ("pyrolusite", 20, 40, 4, "ManganeseDioxide"),
    ("garnierite", 20, 40, 4, "Garnierite"),
    ("pentlandite", 20, 40, 4, "Pentlandite"),
    ("scheelite", 5, 50, 1, "Scheelite"),
    ("salt", 40, 80, 6, "NaCl"),
    ("borax", 10, 40, 4, "Borax"),
    ("asbestos", 20, 40, 8, "Asbestos"),
    ("diamond", 5, 10, 2, "Diamond"),
    ("amber", 5, 70, 1, "Amber"),
    ("redstone", 5, 20, 16, "Redstone"),
    ("lapis", 20, 40, 8, "Lapis"),
    ("azurite", 20, 40, 4, "Azurite"),
    ("coal", 40, 100, 36, "Coal"),
    ("graphite", 5, 10, 2, "Graphite"),
    ("sulfur", 5, 15, 8, "S"),
]

# (vein name, min_y, max_y, weight, density, size, bottom, top, between, spread)
# The four roles are GT6 OreDictMaterial names; None means the role is unused.
VEINS = [
    ("lignite", 50, 130, 160, 8, 32, "Lignite", "Lignite", "Lignite", "Coal"),
    ("coal", 50, 80, 80, 6, 32, "Coal", "Coal", "Coal", "Lignite"),
    ("apatite", 40, 60, 60, 3, 16, "Apatite", "Apatite", "PhosphorusBlue", "PO4"),
    ("lapis", 20, 50, 40, 5, 16, "Lazurite", "Sodalite", "Lapis", "Azurite"),
    ("bauxite", 50, 90, 80, 4, 24, "Bauxite", "Bauxite", "Bauxite", "Ilmenite"),
    ("iodine_salt", 50, 60, 30, 3, 24, "KIO3", "NaCl", "Borax", "Zeolite"),
    ("rock_salt", 50, 60, 30, 3, 24, "KCl", "Coltan", "Lepidolite", "Spodumene"),
    ("asbestos", 10, 40, 30, 3, 16, "Chromite", "Talc", "Gypsum", "Asbestos"),
    ("sapphire", 10, 40, 30, 3, 16, "BlueSapphire", "OrangeSapphire", "YellowSapphire", "Ruby"),
    ("sapphire_2", 10, 40, 30, 3, 16, "GreenSapphire", "Ruby", "BlueSapphire", "PurpleSapphire"),
    ("garnet", 10, 40, 60, 3, 16, "Almandine", "Pyrope", "Andradite", "Uvarovite"),
    ("pitchblende", 10, 40, 40, 3, 16, "Pitchblende", "Pitchblende", "Uraninite", "Uraninite"),
    ("monazite", 20, 40, 30, 3, 16, "Bastnasite", "Bastnasite", "Monazite", "Neodymium"),
    ("diamond", 5, 20, 40, 2, 16, "Graphite", "Graphite", "Diamond", "Graphite"),
    ("galena", 30, 60, 40, 5, 16, "Galena", "Galena", "Silver", "Lead"),
    ("quartz", 40, 80, 60, 3, 16, "MilkyQuartz", "Barite", "CertusQuartz", "CertusQuartz"),
    ("peridot", 10, 40, 60, 3, 16, "Kyanite", "MagnesiumCarbonate", "Peridot", "Glauconite"),
    ("gold", 20, 30, 5, 3, 16, "Pyrite", "Chalcopyrite", "Arsenopyrite", "Gold"),
    ("platinum", 40, 50, 5, 3, 16, "Cooperite", "Palladium", "Sperrylite", "Iridium"),
    ("molybdenum", 20, 50, 5, 3, 16, "Wulfenite", "Molybdenite", "Molybdenum", "Powellite"),
    ("cassiterite", 40, 90, 170, 5, 24, "Stannite", "Kesterite", "Huebnerite", "Cassiterite"),
    ("tungstate", 20, 50, 10, 3, 16, "Scheelite", "Russellite", "Tungstate", "Pinalite"),
    ("manganese", 20, 30, 20, 3, 16, "Grossular", "Spessartine", "ManganeseDioxide", "Coltan"),
    ("beryllium", 5, 30, 15, 3, 16, "Aquamarine", "Maxixe", "Emerald", "Thorium"),
    ("beryllium_2", 5, 30, 15, 3, 16, "Bixbite", "Goshenite", "Heliodor", "Morganite"),
    ("titanium", 10, 40, 40, 3, 16, "TitaniumDioxide", "TitaniumDioxide", "Zircon", "Ilmenite"),
    ("nickel", 10, 40, 40, 3, 16, "Garnierite", "Nickel", "Cobaltite", "Pentlandite"),
    ("redstone", 10, 40, 60, 3, 24, "Redstone", "Redstone", "Ruby", "Cinnabar"),
    ("tetrahedrite", 70, 120, 150, 4, 24, "Tetrahedrite", "Tetrahedrite", "Copper", "Stibnite"),
    ("iron", 10, 40, 120, 4, 24, "BrownLimonite", "YellowLimonite", "IronOxide", "Malachite"),
    ("copper", 10, 30, 80, 4, 24, "Chalcopyrite", "IronOxide", "Pyrite", "Copper"),
]

# GT6 OreDictMaterial name -> this project's material id.
#
# Two kinds of entry live here. Some names simply differ (`NaCl` is `Salt`). Others are ambiguous:
# this project has several materials sharing a display name, such as Ruby and Balas Ruby, or Copper
# and the `any_copper` alias stub, and the stub must not win the lookup.
ALIASES = {
    # Names that differ from this project's display name.
    "Lignite": "lignite",
    "Sn": "tin",
    "Lapis": "lapis",
    "Oilshale": "oil_shale",
    "BalasRuby": "balas_ruby",
    "Zn": "zinc",
    "Bi": "bismuth",
    "S": "sulfur",
    "NaCl": "salt",
    "KCl": "rock_salt",
    "IronOxide": "hematite",
    "ManganeseDioxide": "pyrolusite",
    "MagnesiumCarbonate": "magnesium_carbonate",
    "Coltan": "coltan",
    "Neodymium": "neodymium",
    # Ambiguous display names.
    "Cu": "copper",
    "Pb": "lead",
    "Ag": "silver",
    "Au": "gold",
    "Ni": "nickel",
    "Copper": "copper",
    "Lead": "lead",
    "Silver": "silver",
    "Gold": "gold",
    "Nickel": "nickel",
    "Palladium": "palladium",
    "Iridium": "iridium",
    "Molybdenum": "molybdenum",
    "Thorium": "thorium",
    "Ruby": "ruby",
    "Diamond": "diamond",
    "Emerald": "emerald",
}


# GT6 names with no counterpart here: the material does not exist in this project, so no amount of
# mapping can produce an ore block. Kept explicit so that a missing entry is a decision rather than a
# silent gap; the vein or small ore still works from its remaining data.
DROPPED = {
    "PhosphorusBlue": "no phosphorus sulphide material",
    "PO4": "no phosphate material",
    "Cooperite": "no cooperite material",
    "Sperrylite": "no sperrylite material",
    "KIO3": "no potassium iodate material",
    "TitaniumDioxide": "no titanium dioxide material",
    "KCl": "Rock Salt is an alias stub for Sylvite, which has no ore blocks here",
}


def load_generator_presets():
    """The item generator tags each shorthand preset covers, read from the material DSL."""
    source = DSL.read_text(encoding="utf-8")
    presets = {}
    for match in re.finditer(r"fun (\w+)\(\)(?:[^=]*)=\s*listOf\((.*?)\)", source, re.S):
        presets[match.group(1)] = set(re.findall(r"\b[A-Z][A-Z_]*\b", match.group(2)))
    return presets


def load_materials():
    """Map material id -> display name, whether it has ore blocks, and whether it is a stub."""
    result = {}
    pattern = re.compile(
        r'^    val (\w+) = material\("([a-z0-9_]+)"\)\s*\{(.*?)(?=^    val |\Z)', re.M | re.S
    )
    presets = load_generator_presets()
    for path in sorted(MATERIALS.glob("*.kt")):
        source = path.read_text(encoding="utf-8")
        for match in pattern.finditer(source):
            body = match.group(3)
            name = re.search(r'\bname\s*=\s*"([^"]+)"', body)
            tags = set(re.findall(r"MaterialTag\.ItemGenerator\.(\w+)\b", body))
            for preset, covered in presets.items():
                if f"MaterialTag.ItemGenerator.{preset}()" in body:
                    tags.update(covered)
            result[match.group(2)] = {
                "name": name.group(1) if name else match.group(2).replace("_", " ").title(),
                "ores": "ORES" in tags,
                "invalid": "INVALID_MATERIAL" in body,
            }
    if len(result) < 1000:
        raise SystemExit(f"Only found {len(result)} materials; the material files changed shape")
    return result


def by_display_name(materials):
    """Index non-stub materials by display name.

    Several names appear twice, once on a real material and once on an invalid alias entry whose id
    starts with `any_`. Only the real one can carry ore blocks, so those stubs are skipped. A name
    that is still ambiguous after that has to be listed in ALIASES, because resolve() refuses to
    guess.
    """
    index = {}
    for material_id, data in materials.items():
        if data["invalid"] or material_id.startswith("any_"):
            continue
        index.setdefault(data["name"].replace(" ", ""), []).append(material_id)
    return index


def qualify(material_id):
    """Material references are written as full resource locations."""
    return f"uranustech:{material_id}"


def host_rocks_of(gt6_name):
    """The host rock names a GT6 material is restricted to, or an empty list for no restriction.

    The names are the ones the codec accepts, which are the serialized (lowercase) forms; the GT6 keys
    in LAYER_ORES are only used to build them.
    """
    result = []
    for rock, materials in LAYER_ORES.items():
        if gt6_name not in materials:
            continue
        name = ROCK_NAMES.get(rock.upper())
        if name is None:
            # The rock this ore belongs to has no counterpart here, so the ore is left unrestricted
            # rather than restricted to a rock that does not exist.
            continue
        result.append(name)
    return result


def resolve(gt6_name, materials, names):
    """Material id for a GT6 name, or None when this project has no ore for it.

    Returns None in three cases, all of which are legitimate and reported: the role has no
    counterpart here, the material exists but carries no ore blocks, or the material is an invalid
    alias entry. An alias that points at nothing is a bug in this file and raises.
    """
    if gt6_name is None or gt6_name in DROPPED:
        return None
    material_id = ALIASES.get(gt6_name)
    if material_id is None:
        candidates = names.get(gt6_name, [])
        if len(candidates) != 1:
            raise SystemExit(
                f"Cannot resolve {gt6_name}: candidates {candidates}. Add it to ALIASES or DROPPED."
            )
        material_id = candidates[0]
    data = materials.get(material_id)
    if data is None:
        raise SystemExit(f"ALIASES[{gt6_name}] points at missing material {material_id}")
    if data["invalid"] or not data["ores"]:
        return None
    return material_id


def main():
    materials = load_materials()
    names = by_display_name(materials)

    vein_ids, dropped = write_veins(materials, names)
    small_ids = write_small_ores(materials, names)
    contact_ids = write_double_layers(materials, names)
    write_config(vein_ids, contact_ids, small_ids)

    print(f"Wrote {len(vein_ids)} ore veins, {len(small_ids)} small ores "
          f"and {len(contact_ids)} contact ores")
    if dropped:
        print(f"Dropped {len(dropped)} vein roles with no ore in this project:")
        for vein, role, gt6_name in dropped:
            print(f"  {vein}.{role}: {gt6_name}")


def write_config(vein_ids, contact_ids, small_ids):
    """Update the entry lists of the one configured feature.

    Only the entry lists are written: the per-biome rock layers are hand maintained, because they are a
    design decision about the world rather than a mapping from a GT6 table, and the script must not
    read Kotlin sources to reconstruct them.
    """
    configured = json.loads(GEOLOGY_CONFIG.read_text(encoding="utf-8"))
    config = configured["config"]
    config["veins"] = [f"uranustech:{name}" for name in vein_ids]
    config["contact_ores"] = [f"uranustech:{name}" for name in contact_ids]
    config["small_ores"] = [f"uranustech:{name}" for name in small_ids]
    GEOLOGY_CONFIG.write_text(json.dumps(configured, indent=2) + "\n", encoding="utf-8")


def write_veins(materials, names):
    VEIN_DIR.mkdir(parents=True, exist_ok=True)
    for stale in VEIN_DIR.glob("*.json"):
        stale.unlink()

    ids = []
    dropped = []
    for vein, min_y, max_y, weight, density, size, bottom, top, between, spread in VEINS:
        config = {"weight": weight, "density": density, "size": size, "min_y": min_y, "max_y": max_y}
        roles = {"bottom": bottom, "top": top, "between": between, "spread": spread}
        for role, gt6_name in roles.items():
            material_id = resolve(gt6_name, materials, names)
            if material_id is None:
                if gt6_name is not None:
                    dropped.append((vein, role, gt6_name))
                continue
            config[role] = qualify(material_id)

        # GT6 ties each role's material to the rock layer it sits in, so the restriction is only
        # meaningful when every role that is present agrees on the same rock set. A vein whose roles
        # disagree, or one with a role that has no restriction, stays unrestricted.
        host_sets = {frozenset(host_rocks_of(gt6_name)) for role, gt6_name in roles.items()
                     if role in config and host_rocks_of(gt6_name)}
        if len(host_sets) == 1:
            hosts = sorted(next(iter(host_sets)))
            config["host_rocks"] = hosts

        if not any(role in config for role in ("bottom", "top", "between", "spread")):
            raise SystemExit(f"Vein {vein} resolved to no ore roles")
        (VEIN_DIR / f"{vein}.json").write_text(json.dumps(config, indent=2) + "\n", encoding="utf-8")
        ids.append(vein)

    return ids, dropped


def write_small_ores(materials, names):
    SMALL_DIR.mkdir(parents=True, exist_ok=True)
    for stale in SMALL_DIR.glob("*.json"):
        stale.unlink()

    ids = []
    for name, min_y, max_y, amount, gt6_name in SMALL_ORES:
        material_id = resolve(gt6_name, materials, names)
        if material_id is None:
            raise SystemExit(f"Small ore {name} references {gt6_name}, which has no ore here")
        config = {
            "material": qualify(material_id),
            "min_y": min_y,
            "max_y": max_y,
            "amount": amount,
        }
        hosts = sorted(set(host_rocks_of(gt6_name)))
        if hosts:
            config["host_rocks"] = hosts
        (SMALL_DIR / f"{name}.json").write_text(json.dumps(config, indent=2) + "\n", encoding="utf-8")
        ids.append(name)

    return ids


def write_double_layers(materials, names):
    DOUBLE_DIR.mkdir(parents=True, exist_ok=True)
    for stale in DOUBLE_DIR.glob("*.json"):
        stale.unlink()

    ids = []
    for index, (first, second, both, gt6_ore, min_y, max_y, weight, density) in enumerate(DOUBLE_LAYERS):
        material_id = resolve(gt6_ore, materials, names)
        if material_id is None:
            print(f"Skipped contact ore {gt6_ore} between {first} and {second}: no ore here")
            continue
        for rock in (first, second):
            if rock not in ROCK_NAMES:
                raise SystemExit(f"Contact ore {gt6_ore} references unknown rock {rock}")
        name = f"{material_id}_{first.lower()}_{second.lower()}"
        config = {
            "first": ROCK_NAMES[first],
            "second": ROCK_NAMES[second],
            "weight": weight,
            "density": density,
            "min_y": min_y,
            "max_y": max_y,
            "both_directions": both,
            "ore": qualify(material_id),
        }
        (DOUBLE_DIR / f"{name}.json").write_text(json.dumps(config, indent=2) + "\n", encoding="utf-8")
        ids.append(name)

    return ids


if __name__ == "__main__":
    sys.exit(main())
