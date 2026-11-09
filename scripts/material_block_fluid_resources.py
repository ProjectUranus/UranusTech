"""Append en_us names and check textures for material block/fluid registrations."""

import argparse
import json
import re
from collections import Counter
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
JAVA = ROOT / "src/main/java/dev/lasm/uranustech"
LANG = ROOT / "src/main/resources/assets/uranustech/lang/en_us.json"
TEXTURES = ROOT / "src/main/resources/assets/uranustech/textures/block/materialicons"

# Human-facing GT6 form names; the matching enum suffixes are verified below.
BLOCK_NAMES = {
    "ORE": ("Ores", "{name} Ore"),
    "ORE_BEDROCK": ("Bedrock Ores", "Bedrock {name} Ore"),
    "ORE_DENSE": ("Dense Ores", "Dense {name} Ore"),
    "ORE_DUST": ("Dust Ores", "{name} Gravel Ore"),
    "ORE_SMALL": ("Small Ores", "Small {name} Ore"),
    "BLOCK_RAW": ("Raw Ore Blocks", "Block of Raw {name}"),
    "BLOCK_GEM": ("Gem Blocks", "Block of {name}"),
    "BLOCK_DUST": ("Dust Blocks", "Block of {name} Dust"),
    "BLOCK_INGOT": ("Ingot Blocks", "Block of {name} Ingots"),
    "BLOCK_PLATE": ("Plate Blocks", "Block of {name} Plates"),
    "BLOCK_PLATE_GEM": ("Gem Plate Blocks", "Block of {name} Gem Plates"),
    "BLOCK_SOLID": ("Cast Metal Blocks", "Block of Solid {name}"),
    "CASING_MACHINE": ("Machine Casings", "{name} Machine Casing"),
    "CASING_MACHINE_DOUBLE": ("Robust Machine Casings", "Robust {name} Machine Casing"),
    "CASING_MACHINE_QUADRUPLE": ("Reinforced Machine Casings", "Reinforced {name} Machine Casing"),
    "CASING_MACHINE_DENSE": ("Dense Machine Casings", "Dense {name} Machine Casing"),
    "FRAME_GT": ("Frames", "{name} Frame"),
    "CRATE_GT_RAW": ("Partial Crates of Raw Ore", "Partial Crate of Raw {name}"),
    "CRATE_GT_GEM": ("Partial Crates of Gems", "Partial Crate of {name} Gems"),
    "CRATE_GT_DUST": ("Partial Crates of Dust", "Partial Crate of {name} Dust"),
    "CRATE_GT_INGOT": ("Partial Crates of Ingots", "Partial Crate of {name} Ingots"),
    "CRATE_GT_PLATE": ("Partial Crates of Plates", "Partial Crate of {name} Plates"),
    "CRATE_GT_PLATE_GEM": ("Partial Crates of Gem Plates", "Partial Crate of {name} Gem Plates"),
    "CRATE_GT_64_RAW": ("Crates of Raw Ore", "Crate of Raw {name}"),
    "CRATE_GT_64_GEM": ("Crates of Gems", "Crate of {name} Gems"),
    "CRATE_GT_64_DUST": ("Crates of Dust", "Crate of {name} Dust"),
    "CRATE_GT_64_INGOT": ("Crates of Ingots", "Crate of {name} Ingots"),
    "CRATE_GT_64_PLATE": ("Crates of Plates", "Crate of {name} Plates"),
    "CRATE_GT_64_PLATE_GEM": ("Crates of Gem Plates", "Crate of {name} Gem Plates"),
}
FLUID_NAMES = {
    "LIQUID": ("Liquid Buckets", "Liquid {name}"),
    "MOLTEN": ("Molten Material Buckets", "Molten {name}"),
    "GAS": ("Gas Buckets", "{name} Gas"),
    "PLASMA": ("Plasma Buckets", "{name} Plasma"),
}


def enum_forms(filename, names):
    source = (JAVA / "data" / filename).read_text(encoding="utf-8")
    forms = dict((name, (suffix, icon)) for name, suffix, icon in re.findall(
        r'^\s+(\w+)\("([a-z0-9_]+)", "([a-z0-9_]+)"', source, re.MULTILINE
    ))
    if forms.keys() != names.keys():
        raise ValueError(f"Translation templates do not match {filename}: {forms.keys() ^ names.keys()}")
    return forms


def materials():
    presets = {}
    material_source = (JAVA / "api/chemical/material/Material.kt").read_text(encoding="utf-8")
    for preset in ("simple", "simpleGem"):
        match = re.search(rf'fun {preset}\(\).*?listOf\((.*?)\)', material_source, re.DOTALL)
        presets[preset] = set(re.findall(r'\b[A-Z][A-Z_]+\b', match[1]))
    result = []
    for path in sorted((JAVA / "data/materials").glob("*.kt")):
        source = path.read_text(encoding="utf-8")
        starts = list(re.finditer(r'\bmaterial\("([a-z0-9_]+)"\)\s*\{', source))
        for index, match in enumerate(starts):
            end = starts[index + 1].start() if index + 1 < len(starts) else len(source)
            body = source[match.end():end]
            material_id = match[1]
            name = re.search(r'\bname\s*=\s*("(?:[^"\\]|\\.)*")', body)
            icon = re.search(r'\biconSet\s*=\s*IconSet\.(\w+)', body)
            tags = set(re.findall(r'MaterialTag\.ItemGenerator\.(\w+)\b', body))
            for preset, values in presets.items():
                if f"MaterialTag.ItemGenerator.{preset}()" in body:
                    tags.update(values)
            result.append({
                "id": material_id,
                "name": json.loads(name[1]) if name else material_id.replace("_", " ").title(),
                "icon": (icon[1].lower() if icon and icon[1] != "NONE" else "dull"),
                "tags": tags,
                "smithable": "MaterialTag.Processing.SMITHABLE" in body,
                "translucent": "MaterialTag.Properties.TRANSPARENT" in body,
                "invalid": "MaterialTag.Properties.INVALID_MATERIAL" in body,
            })
    if len({material["id"] for material in result}) != len(result):
        raise ValueError("Duplicate material ids")
    return result


def fluid_forms(material):
    if material["invalid"]:
        return set()
    tags = material["tags"]
    result = {form for tag, form in (("LIQUID", "LIQUID"), ("GASES", "GAS"), ("MOLTEN", "MOLTEN"))
              if tag in tags}
    if material["id"] == "oxygen":
        result.add("LIQUID")
    if material["id"] in {"helium", "nitrogen"}:
        result.add("PLASMA")
    return result


def fluid_id(material, form):
    if form == "LIQUID":
        return "liquid_oxygen" if material["id"] == "oxygen" else material["id"]
    if form == "MOLTEN":
        return f'molten_{material["id"]}'
    if form == "GAS":
        return material["id"]
    return f'plasma_{material["id"]}'


def block_forms(material):
    tags = material["tags"]
    result = set()
    def storage(form):
        result.update((f"BLOCK_{form}", f"CRATE_GT_{form}", f"CRATE_GT_64_{form}"))
    for tag, form in (("ORES", "RAW"), ("DUSTS", "DUST"), ("GEMS", "GEM"), ("INGOTS", "INGOT")):
        if tag in tags:
            storage(form)
    if "ORES" in tags:
        result.update(("ORE", "ORE_BEDROCK", "ORE_DENSE", "ORE_DUST", "ORE_SMALL"))
    if "INGOTS" in tags:
        result.add("BLOCK_SOLID")
    if "PLATES" in tags:
        if "INGOTS" in tags or "GEMS" not in tags:
            storage("PLATE")
        if "GEMS" in tags:
            storage("PLATE_GEM")
    if "STICKS" in tags:
        result.add("FRAME_GT")
    if "PARTS" in tags and material["smithable"]:
        result.update(("CASING_MACHINE", "CASING_MACHINE_DOUBLE", "CASING_MACHINE_QUADRUPLE", "CASING_MACHINE_DENSE"))
    return result


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--verify", action="store_true", help="Check without changing en_us.json")
    parser.add_argument("--remove-legacy-ores", action="store_true", help="Remove obsolete UranusGen ore names")
    args = parser.parse_args()
    if args.verify and args.remove_legacy_ores:
        parser.error("--verify cannot remove localizations")
    blocks = enum_forms("BlockGeneratorModelMap.kt", BLOCK_NAMES)
    fluids = enum_forms("FluidGeneratorModel.kt", FLUID_NAMES)
    host_source = (JAVA / "geology/api/HostRockType.kt").read_text(encoding="utf-8")
    ore_hosts = re.findall(r'^\s+[A-Z_]+\("([a-z_]+)"\)', host_source, re.MULTILINE)
    additions = {
        "pack.uranustech.materials": "UranusTech Materials",
        "pack.uranustech.materials.description": "Generated material models, blockstates, tags and loot",
    }
    block_counts, fluid_counts = Counter(), Counter()
    models, textures, ids = set(), set(), set()
    for material in materials():
        name = material["name"]
        for form in sorted(block_forms(material)):
            suffix, icon = blocks[form]
            identifier = f'{material["id"]}_{suffix}'
            if identifier in ids:
                raise ValueError(f"Duplicate registration: {identifier}")
            ids.add(identifier)
            title, template = BLOCK_NAMES[form]
            additions[f"block.uranustech.{identifier}"] = template.format(name=name)
            additions[f"itemGroup.uranustech.material.{suffix}"] = title
            block_counts[form] += 1
            textures.add((material["icon"], icon))
            translucent = material["translucent"] and not (form.startswith("CRATE_") or form.startswith("ORE"))
            if form in {"ORE", "ORE_DENSE", "ORE_SMALL"}:
                hosts = ore_hosts
            else:
                hosts = ["bedrock" if form == "ORE_BEDROCK" else "gravel" if form == "ORE_DUST" else None]
            models.update((material["icon"], icon, translucent, host) for host in hosts)
        for state in sorted(fluid_forms(material)):
            suffix, icon = fluids[state]
            identifier = fluid_id(material, state)
            if identifier in ids:
                raise ValueError(f"Duplicate registration: {identifier}")
            ids.add(identifier)
            title, template = FLUID_NAMES[state]
            fluid_name = name if identifier == material["id"] else template.format(name=name)
            additions[f"fluid_type.uranustech.{identifier}"] = fluid_name
            additions[f"block.uranustech.{identifier}"] = fluid_name
            additions[f"item.uranustech.{identifier}_bucket"] = f"{fluid_name} Bucket"
            additions[f"itemGroup.uranustech.material.{suffix}"] = title
            fluid_counts[state] += 1
            textures.add((material["icon"], icon))

    missing = [str(TEXTURES / icon_set / f"{icon}.png") for icon_set, icon in sorted(textures)
               if not (TEXTURES / icon_set / f"{icon}.png").is_file()]
    if missing:
        raise ValueError("Missing textures:\n" + "\n".join(missing))
    for path in TEXTURES.rglob("*"):
        if not re.fullmatch(r"[a-z0-9_./-]+", path.relative_to(TEXTURES).as_posix()):
            raise ValueError(f"Invalid ResourceLocation path: {path}")
        if path.is_file() and path.name.endswith(".mcmeta"):
            json.loads(path.read_text(encoding="utf-8"))

    text = LANG.read_text(encoding="utf-8")
    existing = json.loads(text)
    legacy_keys = {key for key in existing if key.startswith("block.uranustech.dense_ore_")
                   or key == "itemGroup.uranustech.dense_ores"} if args.remove_legacy_ores else set()
    if legacy_keys:
        # Remove whole obsolete entries while preserving unrelated localization formatting.
        lines = []
        for line in text.splitlines(keepends=True):
            key = re.match(r'^\s*("(?:[^"\\]|\\.)*")\s*:', line)
            if not key or json.loads(key[1]) not in legacy_keys:
                lines.append(line)
        text = "".join(lines)
        expected = {key: value for key, value in existing.items() if key not in legacy_keys}
        if json.loads(text) != expected:
            raise ValueError("Cannot remove legacy localization entries without changing other translations")
        existing = expected
    additions = {key: value for key, value in additions.items() if key not in existing}
    if args.verify:
        if additions:
            raise ValueError(f"Missing {len(additions)} localizations")
    elif additions:
        # Append only; preserve all existing translations and use explicit UTF-8 without BOM.
        prefix = text[:text.rfind("}")].rstrip()
        body = json.dumps(additions, ensure_ascii=False, indent=2)[2:-2]
        LANG.write_text(prefix + ",\n" + body + "\n}\n", encoding="utf-8", newline="\n")
        json.loads(LANG.read_text(encoding="utf-8"))
    elif legacy_keys:
        LANG.write_text(text, encoding="utf-8", newline="\n")
    print(f"{sum(block_counts.values())} block registrations, {len(models)} shared block models.")
    print(f"Ore registrations: {dict((form, count) for form, count in sorted(block_counts.items()) if form.startswith('ORE'))}")
    print(f"Fluid registrations: {dict(sorted(fluid_counts.items()))}")
    print(f"Verified {len(textures)} texture references; appended {len(additions) if not args.verify else 0} localizations.")
    if legacy_keys:
        print(f"Removed {len(legacy_keys)} obsolete ore localizations.")


if __name__ == "__main__":
    main()
