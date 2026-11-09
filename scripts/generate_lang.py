"""Render the English language file from static translations and material data."""

import argparse
import json
from pathlib import Path

from jinja2 import Environment, FileSystemLoader, StrictUndefined

ROOT = Path(__file__).resolve().parents[1]
LANG_DIR = Path(__file__).resolve().parent / "lang"
STATIC_LANG = LANG_DIR / "static_en_us.json"
MATERIALS_LANG = LANG_DIR / "en_us.materials.json"
FORMS_TEMPLATE = "en_us.forms.json.jinja"
TEMPLATE = "en_us.json.jinja"
OUTPUT = ROOT / "src/main/resources/assets/uranustech/lang/en_us.json"


def material_records():
    records = load_json(MATERIALS_LANG)
    if not isinstance(records, dict):
        raise ValueError("Material localizations must be an object keyed by material id")
    result = []
    for material_id, properties in records.items():
        if not isinstance(properties, dict) or not isinstance(properties.get("name"), str):
            raise ValueError(f"Invalid material localization record: {material_id}")
        result.append({
            **properties,
            "id": material_id,
            "tags": set(properties.get("tags", [])),
        })
    return result


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


def material_translations(environment):
    forms = json.loads(environment.get_template(FORMS_TEMPLATE).render())
    blocks = forms["blocks"]
    fluids = forms["fluids"]
    translations = {}

    for material in material_records():
        name = material["name"]
        for form in block_forms(material):
            block_form = blocks[form]
            suffix = block_form["suffix"]
            identifier = f'{material["id"]}_{suffix}'
            key = f"block.uranustech.{identifier}"
            translations[key] = environment.from_string(block_form["name"]).render(name=name)

        for form in fluid_forms(material):
            fluid_form = fluids[form]
            suffix = fluid_form["suffix"]
            identifier = fluid_id(material, form)
            title = fluid_form["tab"]
            name_template = fluid_form["name"]
            fluid_name = name if identifier == material["id"] else environment.from_string(
                name_template
            ).render(name=name)
            translations[f"fluid_type.uranustech.{identifier}"] = fluid_name
            translations[f"block.uranustech.{identifier}"] = fluid_name
            translations[f"item.uranustech.{identifier}_bucket"] = f"{fluid_name} Bucket"
            translations[f"itemGroup.uranustech.material.{suffix}"] = title

    return translations


def load_json(path):
    return json.loads(path.read_text(encoding="utf-8"))


def template_environment():
    environment = Environment(
        loader=FileSystemLoader(LANG_DIR),
        autoescape=False,
        undefined=StrictUndefined,
        keep_trailing_newline=True,
    )
    environment.filters["json"] = lambda value: json.dumps(value, ensure_ascii=False)
    return environment


def render(translations, environment):
    return environment.get_template(TEMPLATE).render(entries=sorted(translations.items()))


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--check", action="store_true", help="Fail if the output is out of date")
    args = parser.parse_args()

    environment = template_environment()
    generated = material_translations(environment)
    static = load_json(STATIC_LANG)
    conflicts = static.keys() & generated.keys()
    if conflicts:
        raise ValueError(f"Static and generated translations conflict: {sorted(conflicts)[:10]}")

    translations = static | generated
    output = render(translations, environment)
    if args.check:
        current = OUTPUT.read_text(encoding="utf-8")
        if current != output:
            raise SystemExit("en_us.json is out of date; run scripts/generate_lang.py")
        print(f"Verified {len(translations)} English localizations.")
        return

    OUTPUT.write_text(output, encoding="utf-8", newline="\n")
    parsed = load_json(OUTPUT)
    if parsed != translations:
        raise ValueError("Rendered language file does not match its source translations")
    if OUTPUT.read_bytes().startswith(b"\xef\xbb\xbf"):
        raise ValueError("en_us.json must be UTF-8 without BOM")
    print(f"Generated {len(translations)} English localizations ({len(generated)} material entries).")


if __name__ == "__main__":
    main()
