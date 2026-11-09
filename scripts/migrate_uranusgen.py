"""Migrate only main resources; preserve Gradle and generated files byte for byte."""

import argparse
import ast
import hashlib
import json
import re
import zipfile
from pathlib import Path

SOURCE = Path(r"G:\UranusGen")
TARGET = Path(r"G:\UranusTech")
REPORT = TARGET / "scripts/uranusgen_migration_report.json"


def digest(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def protected_files():
    paths = [TARGET / name for name in (
        "build.gradle", "settings.gradle", "gradle.properties", "gradlew", "gradlew.bat"
    )]
    paths += list((TARGET / "gradle").rglob("*"))
    paths += list((TARGET / "src/generated").rglob("*"))
    return {str(path.relative_to(TARGET)): digest(path) for path in paths if path.is_file()}


def materials():
    result = {}
    for path in (TARGET / "src/main/java/dev/lasm/uranustech/data/materials").glob("*.kt"):
        source = path.read_text(encoding="utf-8-sig")
        starts = list(re.finditer(r'\bmaterial\("([a-z0-9_]+)"\)\s*\{', source))
        for index, match in enumerate(starts):
            end = starts[index + 1].start() if index + 1 < len(starts) else len(source)
            body = source[match.end():end]
            if not any(token in body for token in (
                "MaterialTag.ItemGenerator.ORES", "MaterialTag.ItemGenerator.simple()",
                "MaterialTag.ItemGenerator.simpleGem()"
            )):
                continue
            name = re.search(r'\bname\s*=\s*"([^"]+)"', body)
            material_id = match[1]
            # MaterialBuilder's default is the literal ID, so give unnamed ores a readable title.
            result[material_id] = name[1] if name else material_id.replace("_", " ").title()
    return result


def migrate():
    report = {"protected": protected_files(), "copied": [], "skipped": []}
    for source in (SOURCE / "src/main/resources").rglob("*"):
        if not source.is_file():
            continue
        relative = source.relative_to(SOURCE / "src/main/resources")
        resource_path = relative.as_posix()
        if (
            resource_path == "uranusgen.mixins.json"
            or "/lang/" in resource_path
            or (source.suffix == ".json" and source.stem.startswith("dense_ore"))
            or resource_path == "assets/uranusgen/textures/block/ore_dense.png"
            or resource_path == "data/minecraft/tags/block/needs_stone_tool.json"
        ):
            report["skipped"].append(resource_path)
            continue
        destination = TARGET / "src/main/resources" / Path(resource_path.replace("uranusgen", "uranustech"))
        if destination.exists():
            raise RuntimeError(f"Refusing to overwrite existing resource: {destination}")
        destination.parent.mkdir(parents=True, exist_ok=True)
        if source.suffix in {".json", ".mcmeta", ".md"}:
            text = source.read_text(encoding="utf-8-sig").replace("uranusgen:", "uranustech:")
            text = text.replace("UranusGen's", "UranusTech's")
            destination.write_text(text, encoding="utf-8", newline="\n")
        else:
            destination.write_bytes(source.read_bytes())
        report["copied"].append(str(destination.relative_to(TARGET)))

    lang_path = TARGET / "src/main/resources/assets/uranustech/lang/en_us.json"
    existing_text = lang_path.read_text(encoding="utf-8")
    existing = json.loads(existing_text)
    incoming = json.loads((SOURCE / "src/main/resources/assets/uranusgen/lang/en_us.json").read_text(encoding="utf-8"))
    additions = {}
    for key, value in incoming.items():
        # The four dummy gem items are replaced by the existing material item forms.
        if key.startswith("item.uranusgen.") and key.rsplit(".", 1)[-1] in {
            "blue_sapphire", "orange_sapphire", "yellow_sapphire", "ruby"
        }:
            continue
        key = key.replace("uranusgen", "uranustech")
        if key not in existing:
            additions[key] = value.replace("UranusGen Geology", "UranusTech Geology")
    additions.update({
        "pack.uranustech.geology": "UranusTech Geology",
        "pack.uranustech.geology.description": "Generated geology models, tags and ore loot",
        "block.uranustech.crude_oil": "Crude Oil",
        "fluid_type.uranustech.crude_oil": "Crude Oil",
    })
    additions = {key: value for key, value in additions.items() if key not in existing}
    # Append only: keep all existing translations and their formatting intact.
    end = existing_text.rfind("}")
    prefix = existing_text[:end].rstrip()
    serialized = json.dumps(additions, ensure_ascii=False, indent=2)[2:-2]
    lang_path.write_text(prefix + ",\n" + serialized + "\n}\n", encoding="utf-8", newline="\n")
    report["localizations_added"] = len(additions)
    report["ore_materials"] = materials()
    REPORT.write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding="utf-8")
    print(f"Copied {len(report['copied'])} main resources; added {len(additions)} translations; {len(materials())} ore materials.")


def migrate_tools():
    report = json.loads(REPORT.read_text(encoding="utf-8"))
    for source_name, target_name in (
        ("generate_rock_variant_resources.py", "generate_uranusgen_rock_resources.py"),
    ):
        destination = TARGET / "scripts" / target_name
        if destination.exists():
            raise RuntimeError(f"Refusing to overwrite existing script: {destination}")
        code = (SOURCE / "scripts" / source_name).read_text(encoding="utf-8").replace("uranusgen", "uranustech")
        if source_name == "generate_rock_variant_resources.py":
            code = code.replace(
                '    lang = json.loads(lang_path.read_text(encoding="utf-8"))',
                '    original_lang = lang_path.read_text(encoding="utf-8")\n'
                '    lang = json.loads(original_lang)\n'
                '    existing_keys = set(lang)'
            )
            code = code.replace(
                "    write_json(lang_path, lang)",
                '    additions = {key: value for key, value in lang.items() if key not in existing_keys}\n'
                '    if additions:\n'
                '        end = original_lang.rfind("}")\n'
                '        serialized = json.dumps(additions, ensure_ascii=False, indent=2)[2:-2]\n'
                '        lang_path.write_text(original_lang[:end].rstrip() + ",\\n" + serialized + "\\n}\\n", encoding="utf-8")'
            )
        else:
            # uv can resolve the optional image library without changing this project's pyproject.toml.
            code = '# /// script\n# requires-python = ">=3.14"\n# dependencies = ["pillow>=11.0.0"]\n# ///\n\n' + code
        destination.write_text(code, encoding="utf-8", newline="\n")
        report.setdefault("scripts_copied", []).append(str(destination.relative_to(TARGET)))
    REPORT.write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding="utf-8")
    print("Migrated rock resource-maintenance script; existing Python project configuration retained.")


def verify():
    report = json.loads(REPORT.read_text(encoding="utf-8"))
    if report["protected"] != protected_files():
        raise RuntimeError("Gradle or generated files changed")
    for script in [__file__] + [str(TARGET / name) for name in report.get("scripts_copied", [])
                               if (TARGET / name).exists()]:
        ast.parse(Path(script).read_text(encoding="utf-8"), filename=script)
    resource_root = TARGET / "src/main/resources"
    copied = {
        name.removeprefix("src/main/resources/").replace("\\", "/") for name in report["copied"]
    }
    checked = 0
    for path in resource_root.rglob("*.json"):
        if path.read_bytes().startswith(b"\xef\xbb\xbf"):
            raise RuntimeError(f"UTF-8 BOM: {path}")
        value = json.loads(path.read_text(encoding="utf-8"))
        if path.relative_to(resource_root).as_posix() in copied and "uranusgen:" in json.dumps(value):
            raise RuntimeError(f"Old namespace: {path}")
        checked += 1
    lang = json.loads((resource_root / "assets/uranustech/lang/en_us.json").read_text(encoding="utf-8"))
    for material_id in report["ore_materials"]:
        if f"block.uranustech.{material_id}_dense_ore" not in lang:
            raise RuntimeError(f"Missing ore localization: {material_id}")
    for source in (SOURCE / "src/main/resources/assets/uranusgen/textures").rglob("*.png"):
        if source.name == "ore_dense.png":
            continue
        relative = source.relative_to(SOURCE / "src/main/resources/assets/uranusgen")
        if digest(source) != digest(resource_root / "assets/uranustech" / relative):
            raise RuntimeError(f"Migrated texture differs from source: {source}")
    print(f"Validated {checked} main JSON resources; Gradle and generated hashes unchanged.")
    verify_resource_references(resource_root, report)


def verify_resource_references(root, report):
    code = (TARGET / "src/main/java/dev/lasm/uranustech/geology/init/UranusGenBlocks.kt").read_text(encoding="utf-8")
    rocks = set(re.findall(r'\brock\("([a-z_]+)"', code))
    forms_section = code.split("val textureVariants = listOf(", 1)[1].split(")", 1)[0]
    forms = re.findall(r'"([a-z_]+)"', forms_section)
    block_ids = set(rocks)
    for rock in rocks:
        block_ids.update(f"{rock}_{form}" for form in forms)
        for form in ("stone", "cobble", "bricks", "smooth"):
            stem = rock if form == "stone" else f"{rock}_{form}"
            block_ids.update(f"{stem}_{shape}" for shape in ("stairs", "slab", "wall"))
    assert len(block_ids) == 280, len(block_ids)
    block_ids.add("crude_oil")
    ore_ids = {f"{material_id}_{suffix}" for material_id in report["ore_materials"]
               for suffix in ("ore", "bedrock_ore", "dense_ore", "dust_ore", "small_ore")}
    block_ids.update(ore_ids)
    known_items = block_ids | {"crude_oil_bucket"}
    vanilla_jar = TARGET / "build/moddev/artifacts/neoforge-21.1.256-client-extra-aka-minecraft-resources.jar"
    with zipfile.ZipFile(vanilla_jar) as archive:
        vanilla = set(archive.namelist())

    def exists_resource(kind, value):
        if value.startswith("#"):
            return
        namespace, path = value.split(":", 1)
        resource = f"assets/{namespace}/{kind}/{path}" + (".png" if kind == "textures" else ".json")
        if namespace == "minecraft":
            assert resource in vanilla, resource
        else:
            assert (root / resource).is_file(), resource

    def check_items(value, context):
        if isinstance(value, str) and value.startswith("uranustech:"):
            assert value.split(":", 1)[1] in known_items, (context, value)
        elif isinstance(value, dict):
            for child in value.values():
                check_items(child, context)
        elif isinstance(value, list):
            for child in value:
                check_items(child, context)

    def models_in_state(value):
        if isinstance(value, dict):
            for key, child in value.items():
                if key == "model":
                    exists_resource("models", child)
                else:
                    models_in_state(child)
        elif isinstance(value, list):
            for child in value:
                models_in_state(child)

    for path in (root / "assets/uranustech/models").rglob("*.json"):
        model = json.loads(path.read_text(encoding="utf-8"))
        if "parent" in model:
            exists_resource("models", model["parent"])
        for texture in model.get("textures", {}).values():
            exists_resource("textures", texture)
    for path in (root / "assets/uranustech/blockstates").glob("*.json"):
        assert path.stem in block_ids, path
        models_in_state(json.loads(path.read_text(encoding="utf-8")))
    for block_id in block_ids - {"crude_oil"} - ore_ids:
        assert (root / f"assets/uranustech/blockstates/{block_id}.json").is_file(), block_id
        assert (root / f"assets/uranustech/models/item/{block_id}.json").is_file(), block_id
        assert (root / f"data/uranustech/loot_table/blocks/{block_id}.json").is_file(), block_id
    for category in ("recipe", "loot_table"):
        for path in (root / f"data/uranustech/{category}").rglob("*.json"):
            data = json.loads(path.read_text(encoding="utf-8"))
            # random_sequence is a loot-table resource location rather than an item ID.
            data.pop("random_sequence", None)
            check_items(data, path)
    strata = json.loads((root / "data/uranustech/worldgen/configured_feature/overworld_strata.json").read_text(encoding="utf-8"))
    check_items(strata["config"]["fallback_rocks"], "strata fallback")
    for rule in strata["config"]["biome_rules"]:
        check_items(rule["rocks"], "strata biome")
        if rule["biomes"].startswith("#uranustech:"):
            biome_tag = rule["biomes"].split(":", 1)[1]
            assert (root / f"data/uranustech/tags/worldgen/biome/{biome_tag}.json").is_file()
    vein = json.loads((root / "data/uranustech/worldgen/configured_feature/sapphire_vein.json").read_text(encoding="utf-8"))
    for layer in ("top", "bottom", "between", "spread"):
        assert vein["config"][layer].split(":", 1)[1] in report["ore_materials"], layer
    for texture in ("crude_oil_still", "crude_oil_flow"):
        exists_resource("textures", f"uranustech:block/{texture}")
    print("Validated 280 rock blockstates, item models and loot tables; model/texture/recipe/worldgen references resolve.")


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--verify", action="store_true")
    parser.add_argument("--tools", action="store_true")
    args = parser.parse_args()
    if args.verify:
        verify()
    elif args.tools:
        migrate_tools()
    else:
        migrate()
