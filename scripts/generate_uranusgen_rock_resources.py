import json
import zipfile
from pathlib import Path


ROOT = Path(__file__).resolve().parent.parent
RESOURCES = ROOT / "src/main/resources"
ASSETS = RESOURCES / "assets/uranustech"
DATA = RESOURCES / "data/uranustech"

ROCKS = {
    "granite_black": ("Black Granite", "black_granite", 3),
    "granite_red": ("Red Granite", "red_granite", 3),
    "tholeiitic_basalt": ("Tholeiitic Basalt", "basalt", 2),
    "marble": ("Marble", "marble", 0),
    "limestone": ("Limestone", "limestone", 0),
    "komatiite": ("Komatiite", "komatiite", 2),
    "greenschist": ("Greenschist", "greenschist", 0),
    "blueschist": ("Blueschist", "blueschist", 0),
    "kimberlite": ("Kimberlite", "kimberlite", 2),
    "quartzite": ("Quartzite", "quartzite", 0),
}

FORMS = {
    "cobble": ("Cobblestone", "cobble"),
    "cobble_mossy": ("Mossy Cobblestone", "cobble_mossy"),
    "small_bricks": ("Small Bricks", "small_bricks"),
    "small_tiles": ("Small Tiles", "small_tiles"),
    "smooth": ("Smooth", "smooth"),
    "bricks": ("Bricks", "bricks"),
    "bricks_chiseled": ("Chiseled Bricks", "bricks_chiseled"),
    "bricks_cracked": ("Cracked Bricks", "bricks_cracked"),
    "bricks_mossy": ("Mossy Bricks", "bricks_mossy"),
    "bricks_redstone": ("Redstone Bricks", "bricks_redstone"),
    "bricks_reinforced": ("Reinforced Bricks", "bricks_reinforced"),
    "square_bricks": ("Squared Bricks", "square_bricks"),
    "tiles": ("Tiles", "tiles"),
    "windmill_tiles_a": ("Windmill Tiles A", "windmill_tiles_a"),
    "windmill_tiles_b": ("Windmill Tiles B", "windmill_tiles_b"),
}

SHAPES = {
    "stairs": "Stairs",
    "slab": "Slab",
    "wall": "Wall",
}
SHAPE_FORMS = ("stone", "cobble", "bricks", "smooth")


def write_json(path: Path, value: object) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value, indent=2) + "\n", encoding="utf-8")


def shaped_recipe(recipe_id: str, pattern: list[str], key: dict[str, str], result: str,
                 count: int = 1, category: str = "building") -> None:
    write_json(DATA / f"recipe/{recipe_id}.json", {
        "type": "minecraft:crafting_shaped",
        "category": category,
        "pattern": pattern,
        "key": {symbol: {"item": item} for symbol, item in key.items()},
        "result": {"count": count, "id": f"uranustech:{result}"},
    })


def shapeless_recipe(recipe_id: str, ingredients: list[str], result: str, count: int = 1) -> None:
    write_json(DATA / f"recipe/{recipe_id}.json", {
        "type": "minecraft:crafting_shapeless",
        "category": "building",
        "ingredients": [{"item": item} for item in ingredients],
        "result": {"count": count, "id": f"uranustech:{result}"},
    })


def stonecutting_recipe(recipe_id: str, ingredient: str, result: str, count: int = 1) -> None:
    write_json(DATA / f"recipe/{recipe_id}.json", {
        "type": "minecraft:stonecutting",
        "category": "building",
        "ingredient": {"item": ingredient},
        "result": {"count": count, "id": f"uranustech:{result}"},
    })


def smelting_recipe(recipe_id: str, ingredient: str, result: str) -> None:
    write_json(DATA / f"recipe/{recipe_id}.json", {
        "type": "minecraft:smelting",
        "category": "blocks",
        "cookingtime": 200,
        "experience": 0.1,
        "ingredient": {"item": ingredient},
        "result": {"id": f"uranustech:{result}"},
    })


def add_shape_recipes(rock_id: str, form: str) -> None:
    source = rock_id if form == "stone" else f"{rock_id}_{form}"
    for shape in SHAPES:
        result = f"{source}_{shape}"
        if shape == "stairs":
            shaped_recipe(f"{result}", ["#  ", "## ", "###"], {"#": f"uranustech:{source}"}, result, 4)
            stonecutting_recipe(f"{result}_from_{source}_stonecutting", f"uranustech:{source}", result)
        elif shape == "slab":
            shaped_recipe(f"{result}", ["###"], {"#": f"uranustech:{source}"}, result, 6)
            stonecutting_recipe(f"{result}_from_{source}_stonecutting", f"uranustech:{source}", result, 2)
        else:
            shaped_recipe(f"{result}", ["###", "###"], {"#": f"uranustech:{source}"}, result, 6, "misc")
            stonecutting_recipe(f"{result}_from_{source}_stonecutting", f"uranustech:{source}", result)


def add_rock_recipes(rock_id: str) -> None:
    cobble = f"{rock_id}_cobble"
    bricks = f"{rock_id}_bricks"
    smooth = f"{rock_id}_smooth"

    smelting_recipe(f"{rock_id}_from_cobble_smelting", f"uranustech:{cobble}", rock_id)
    smelting_recipe(f"{smooth}_from_{rock_id}_smelting", f"uranustech:{rock_id}", smooth)
    smelting_recipe(f"{rock_id}_bricks_cracked_from_smelting", f"uranustech:{bricks}", f"{bricks}_cracked")

    shaped_recipe(bricks, ["##", "##"], {"#": f"uranustech:{rock_id}"}, bricks, 4)
    shaped_recipe(f"{bricks}_from_smooth", ["##", "##"], {"#": f"uranustech:{smooth}"}, bricks, 4)
    stonecutting_recipe(f"{bricks}_from_{rock_id}_stonecutting", f"uranustech:{rock_id}", bricks)

    shapeless_recipe(f"{cobble}_mossy", [f"uranustech:{cobble}", "minecraft:vine"], f"{cobble}_mossy")
    shapeless_recipe(f"{bricks}_mossy", [f"uranustech:{bricks}", "minecraft:vine"], f"{bricks}_mossy")

    shaped_recipe(f"{rock_id}_small_bricks", ["# ", " #"], {"#": f"uranustech:{smooth}"}, f"{rock_id}_small_bricks", 2)
    shaped_recipe(f"{rock_id}_small_tiles", ["##"], {"#": f"uranustech:{smooth}"}, f"{rock_id}_small_tiles", 2)
    shaped_recipe(f"{rock_id}_tiles", ["#", "#"], {"#": f"uranustech:{smooth}"}, f"{rock_id}_tiles", 2)
    shaped_recipe(f"{rock_id}_windmill_tiles_a", [" #", "# "], {"#": f"uranustech:{smooth}"}, f"{rock_id}_windmill_tiles_a", 2)
    shapeless_recipe(f"{rock_id}_windmill_tiles_b", [f"uranustech:{rock_id}_windmill_tiles_a"], f"{rock_id}_windmill_tiles_b")
    shapeless_recipe(f"{rock_id}_windmill_tiles_a_from_b", [f"uranustech:{rock_id}_windmill_tiles_b"], f"{rock_id}_windmill_tiles_a")
    shapeless_recipe(f"{rock_id}_square_bricks", [f"uranustech:{rock_id}_tiles"], f"{rock_id}_square_bricks")

    chiseled = f"{bricks}_chiseled"
    shaped_recipe(chiseled, ["#", "#"], {"#": f"uranustech:{bricks}_slab"}, chiseled)
    stonecutting_recipe(f"{chiseled}_from_{bricks}_stonecutting", f"uranustech:{bricks}", chiseled)

    shaped_recipe(f"{bricks}_redstone", ["#R"], {"#": f"uranustech:{bricks}", "R": "minecraft:redstone"}, f"{bricks}_redstone")
    shaped_recipe(f"{bricks}_reinforced", ["I#"], {"I": "minecraft:iron_ingot", "#": f"uranustech:{bricks}"}, f"{bricks}_reinforced")

    for form in SHAPE_FORMS:
        add_shape_recipes(rock_id, form)


def model_textures(texture: str) -> dict[str, str]:
    return {"all": texture}


def rock_loot_table(rock_id: str) -> dict[str, object]:
    return {
        "type": "minecraft:block",
        "pools": [{
            "bonus_rolls": 0.0,
            "entries": [{
                "type": "minecraft:alternatives",
                "children": [
                    {
                        "type": "minecraft:item",
                        "conditions": [{
                            "condition": "minecraft:match_tool",
                            "predicate": {
                                "predicates": {
                                    "minecraft:enchantments": [{
                                        "enchantments": "minecraft:silk_touch",
                                        "levels": {"min": 1},
                                    }],
                                },
                            },
                        }],
                        "name": f"uranustech:{rock_id}",
                    },
                    {
                        "type": "minecraft:item",
                        "conditions": [{"condition": "minecraft:survives_explosion"}],
                        "name": f"uranustech:{rock_id}_cobble",
                    },
                ],
            }],
            "rolls": 1.0,
        }],
        "random_sequence": f"uranustech:blocks/{rock_id}",
    }


def block_model(texture: str) -> dict[str, object]:
    return {
        "parent": "minecraft:block/cube_all",
        "textures": model_textures(texture),
    }


def simple_block_resources(block_id: str, texture: str) -> None:
    write_json(ASSETS / f"blockstates/{block_id}.json", {
        "variants": {"": {"model": f"uranustech:block/{block_id}"}},
    })
    write_json(ASSETS / f"models/block/{block_id}.json", block_model(texture))
    write_json(ASSETS / f"models/item/{block_id}.json", {
        "parent": f"uranustech:block/{block_id}",
    })
    write_json(DATA / f"loot_table/blocks/{block_id}.json", {
        "type": "minecraft:block",
        "pools": [{
            "rolls": 1,
            "entries": [{"type": "minecraft:item", "name": f"uranustech:{block_id}"}],
            "conditions": [{"condition": "minecraft:survives_explosion"}],
        }],
    })


def stair_model(block_id: str, texture: str, shape: str) -> dict[str, object]:
    parent = {
        "stairs": "minecraft:block/stairs",
        "inner": "minecraft:block/inner_stairs",
        "outer": "minecraft:block/outer_stairs",
    }[shape]
    return {
        "parent": parent,
        "textures": {"bottom": texture, "top": texture, "side": texture},
    }


def replace_model_prefix(value: object, old: str, new: str) -> object:
    if isinstance(value, dict):
        return {key: replace_model_prefix(item, old, new) for key, item in value.items()}
    if isinstance(value, list):
        return [replace_model_prefix(item, old, new) for item in value]
    if isinstance(value, str) and value.startswith(old):
        return new + value[len(old):]
    return value


def add_stairs_resources(block_id: str, texture: str, template: dict[str, object]) -> None:
    old_prefix = "minecraft:block/stone_brick_stairs"
    new_prefix = f"uranustech:block/{block_id}"
    state = replace_model_prefix(template, old_prefix, new_prefix)
    write_json(ASSETS / f"blockstates/{block_id}.json", state)
    for shape in ("stairs", "inner", "outer"):
        suffix = "" if shape == "stairs" else f"_{shape}"
        write_json(ASSETS / f"models/block/{block_id}{suffix}.json", stair_model(block_id, texture, shape))
    write_json(ASSETS / f"models/item/{block_id}.json", {"parent": f"uranustech:block/{block_id}"})
    write_json(DATA / f"loot_table/blocks/{block_id}.json", {
        "type": "minecraft:block",
        "pools": [{"rolls": 1, "entries": [{"type": "minecraft:item", "name": f"uranustech:{block_id}"}],
                   "conditions": [{"condition": "minecraft:survives_explosion"}]}],
    })


def add_slab_resources(block_id: str, texture: str, double_model: str) -> None:
    write_json(ASSETS / f"blockstates/{block_id}.json", {
        "variants": {
            "type=bottom": {"model": f"uranustech:block/{block_id}"},
            "type=double": {"model": double_model},
            "type=top": {"model": f"uranustech:block/{block_id}_top"},
        },
    })
    for suffix, parent in (("", "minecraft:block/slab"), ("_top", "minecraft:block/slab_top")):
        write_json(ASSETS / f"models/block/{block_id}{suffix}.json", {
            "parent": parent,
            "textures": {"bottom": texture, "top": texture, "side": texture},
        })
    write_json(ASSETS / f"models/item/{block_id}.json", {"parent": f"uranustech:block/{block_id}"})
    write_json(DATA / f"loot_table/blocks/{block_id}.json", {
        "type": "minecraft:block",
        "pools": [{"rolls": 1, "entries": [{"type": "minecraft:item", "name": f"uranustech:{block_id}"}],
                   "conditions": [{"condition": "minecraft:survives_explosion"}]}],
    })


def add_wall_resources(block_id: str, texture: str, template: dict[str, object]) -> None:
    old_prefix = "minecraft:block/cobblestone_wall"
    new_prefix = f"uranustech:block/{block_id}"
    write_json(ASSETS / f"blockstates/{block_id}.json", replace_model_prefix(template, old_prefix, new_prefix))
    parents = {
        "post": "minecraft:block/template_wall_post",
        "side": "minecraft:block/template_wall_side",
        "side_tall": "minecraft:block/template_wall_side_tall",
        "inventory": "minecraft:block/wall_inventory",
    }
    for suffix, parent in parents.items():
        model_id = f"{block_id}_{suffix}"
        write_json(ASSETS / f"models/block/{model_id}.json", {
            "parent": parent,
            "textures": {"wall": texture},
        })
    write_json(ASSETS / f"models/item/{block_id}.json", {"parent": f"uranustech:block/{block_id}_inventory"})
    write_json(DATA / f"loot_table/blocks/{block_id}.json", {
        "type": "minecraft:block",
        "pools": [{"rolls": 1, "entries": [{"type": "minecraft:item", "name": f"uranustech:{block_id}"}],
                   "conditions": [{"condition": "minecraft:survives_explosion"}]}],
    })


def read_vanilla_state_templates() -> tuple[dict[str, object], dict[str, object]]:
    jars = sorted((ROOT / "build/moddev/artifacts").glob("*-client-extra-aka-minecraft-resources.jar"))
    if not jars:
        raise FileNotFoundError("Minecraft resources jar not found under build/moddev/artifacts")
    with zipfile.ZipFile(jars[-1]) as archive:
        stairs = json.loads(archive.read("assets/minecraft/blockstates/stone_brick_stairs.json"))
        wall = json.loads(archive.read("assets/minecraft/blockstates/cobblestone_wall.json"))
    return stairs, wall


def main() -> None:
    stairs_template, wall_template = read_vanilla_state_templates()
    lang_path = ASSETS / "lang/en_us.json"
    original_lang = lang_path.read_text(encoding="utf-8")
    lang = json.loads(original_lang)
    existing_keys = set(lang)
    for rock_id, (rock_name, texture_dir, _harvest_level) in ROCKS.items():
        add_rock_recipes(rock_id)
        texture_root = ASSETS / f"textures/block/stones/{rock_id}"
        for form, (form_name, texture_name) in FORMS.items():
            texture_file = texture_root / f"{texture_name}.png"
            if not texture_file.is_file():
                raise FileNotFoundError(texture_file)
            block_id = f"{rock_id}_{form}"
            texture = f"uranustech:block/stones/{rock_id}/{texture_name}"
            simple_block_resources(block_id, texture)
            lang[f"block.uranustech.{block_id}"] = f"{rock_name} {form_name}"

        base_model = ASSETS / f"models/block/{rock_id}.json"
        write_json(base_model, block_model(f"uranustech:block/stones/{rock_id}/stone"))
        write_json(DATA / f"loot_table/blocks/{rock_id}.json", rock_loot_table(rock_id))

        for form in SHAPE_FORMS:
            block_id = rock_id if form == "stone" else f"{rock_id}_{form}"
            texture_name = "stone" if form == "stone" else FORMS[form][1]
            texture = f"uranustech:block/stones/{rock_id}/{texture_name}"
            shape_stem = rock_id if form == "stone" else block_id
            for shape, shape_name in SHAPES.items():
                shape_id = f"{shape_stem}_{shape}"
                if shape == "stairs":
                    add_stairs_resources(shape_id, texture, stairs_template)
                elif shape == "slab":
                    double_model = f"uranustech:block/{block_id}"
                    add_slab_resources(shape_id, texture, double_model)
                else:
                    add_wall_resources(shape_id, texture, wall_template)
                lang[f"block.uranustech.{shape_id}"] = f"{rock_name} {shape_name}" if form == "stone" else f"{rock_name} {FORMS[form][0]} {shape_name}"

    additions = {key: value for key, value in lang.items() if key not in existing_keys}
    if additions:
        end = original_lang.rfind("}")
        serialized = json.dumps(additions, ensure_ascii=False, indent=2)[2:-2]
        lang_path.write_text(original_lang[:end].rstrip() + ",\n" + serialized + "\n}\n", encoding="utf-8")


if __name__ == "__main__":
    main()
