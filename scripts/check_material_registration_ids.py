"""Check generated material registration names, allowing all tool heads as an upper bound."""

import json
import re
from collections import defaultdict

from material_block_fluid_resources import JAVA, LANG, block_forms, fluid_forms, fluid_id, materials


def suffixes(filename):
    source = (JAVA / "data" / filename).read_text(encoding="utf-8")
    return re.findall(r'^\s+[A-Z_0-9]+\("([a-z0-9_]+)",', source, re.MULTILINE)


def main():
    definitions = materials()
    item_suffixes = suffixes("ItemGeneratorModelMap.kt")
    item_source = (JAVA / "data/ItemGeneratorModelMap.kt").read_text(encoding="utf-8")
    item_forms = dict(re.findall(r'^\s+([A-Z_0-9]+)\("([a-z0-9_]+)",', item_source, re.MULTILINE))
    mappings = {
        tag: set(re.findall(r'\b[A-Z][A-Z_0-9]+\b', body))
        for tag, body in re.findall(r'MaterialTag.ItemGenerator.(\w+) to setOf\((.*?)\)', item_source, re.DOTALL)
    }
    block_source = (JAVA / "data/BlockGeneratorModelMap.kt").read_text(encoding="utf-8")
    block_suffixes = dict(re.findall(r'^\s+([A-Z_0-9]+)\("([a-z0-9_]+)",', block_source, re.MULTILINE))
    fluid_suffixes = suffixes("FluidGeneratorModel.kt")
    tool_materials = set()
    for path in (JAVA / "data/materials").glob("*.kt"):
        source = path.read_text(encoding="utf-8")
        bodies = re.split(r'\bmaterial\("([a-z0-9_]+)"\)\s*\{', source)
        for identifier, body in zip(bodies[1::2], bodies[2::2]):
            if "MaterialTag.Properties.HAS_TOOL_STATS" in body:
                tool_materials.add(identifier)
    candidates = defaultdict(list)
    for material in definitions:
        forms = set().union(*(mappings[tag] for tag in material["tags"] if tag in mappings))
        if material["tags"] & {"DUSTS", "GEMS", "INGOTS"}:
            forms.add("SCRAP")
        # Conservatively allow every tool head for materials with tool stats.
        if material["id"] in tool_materials:
            forms.update(form for form in item_forms if form.startswith("TOOL_HEAD_"))
        for form in sorted(forms):
            suffix = item_forms[form]
            candidates[f'{material["id"]}_{suffix}'].append((material["id"], suffix))
    collisions = {name: forms for name, forms in candidates.items() if len(forms) > 1}
    print(f"Materials: {len(definitions)}; item forms: {len(item_suffixes)}")
    for name, forms in sorted(collisions.items()):
        print(f"Ambiguous: {name}: {forms}")

    # Enabled item forms, with an upper bound for tool heads, avoid duplicating
    # Kotlin's detailed tool properties and quality checks.
    item_ids = set()
    for name, forms in candidates.items():
        for material, suffix in forms:
            resolved = f"{material}/{suffix}" if name in collisions else name
            assert re.fullmatch(r"[a-z0-9_./-]+", resolved), resolved
            assert resolved not in item_ids, resolved
            item_ids.add(resolved)
    block_ids = set()
    fluid_ids = set()
    for material in definitions:
        for form in block_forms(material):
            suffix = block_suffixes[form]
            name = f'{material["id"]}_{suffix}'
            assert name not in item_ids, f"Item/BlockItem collision: {name}"
            assert name not in block_ids, f"Block collision: {name}"
            item_ids.add(name)
            block_ids.add(name)
        states = fluid_forms(material)
        assert {state.lower() for state in states} <= set(fluid_suffixes)
        for state in states:
            name = fluid_id(material, state)
            for fluid in (name, f"flowing_{name}"):
                assert fluid not in fluid_ids, f"Fluid collision: {fluid}"
                fluid_ids.add(fluid)
            assert name not in block_ids, f"Fluid block collision: {name}"
            block_ids.add(name)
            bucket = f"{name}_bucket"
            assert bucket not in item_ids, f"Bucket collision: {bucket}"
            item_ids.add(bucket)
    translations = json.loads(LANG.read_text(encoding="utf-8"))
    by_material = {material["id"]: material for material in definitions}
    examples = {
        "oxygen": {"LIQUID": "liquid_oxygen", "GAS": "oxygen"},
        "water": {},
        "iron": {"MOLTEN": "molten_iron"},
        "helium": {"GAS": "helium", "PLASMA": "plasma_helium"},
        "crude_oil": {"LIQUID": "crude_oil"},
    }
    for material, forms in examples.items():
        assert fluid_forms(by_material[material]) == forms.keys(), material
        for form, expected in forms.items():
            assert fluid_id(by_material[material], form) == expected, (material, form)
            assert expected in fluid_ids, expected
            assert f"fluid_type.uranustech.{expected}" in translations, expected
            assert f"item.uranustech.{expected}_bucket" in translations, expected
        print(f"Verified {material}: {', '.join(forms.values())}")
    assert "plasma_oxygen" not in fluid_ids
    assert "iron_gas" not in fluid_ids
    assert "water_gas" not in fluid_ids
    assert not LANG.read_bytes().startswith(b"\xef\xbb\xbf"), "Localization has a UTF-8 BOM"
    print(f"Unique potential registrations: {len(item_ids)} items, "
          f"{len(block_ids)} blocks, {len(fluid_ids)} fluids")


if __name__ == "__main__":
    main()
