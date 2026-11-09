# Material system

## Built-in materials are initialized before NeoForge registries

Decision (owner): the current material system is satisfactory and stays as it is.

Built-in materials must be defined during mod construction, before NeoForge's registry system runs. `initAllMaterials()` in `UranusTech.kt` does this, and each `material(...)` call adds the material to `UranusTech.BUILTIN_MATERIALS`.

The Block, Item and Fluid registrations are generated from `BUILTIN_MATERIALS`, so the materials must already exist when those `DeferredRegister`s are filled. This is why `material()` registers as a side effect and why `initAllMaterials()` is called early.

Consequences:
- Do not move built-in material definitions to a datapack or other late-loaded registry. Datapack data loads after the static registries, so it cannot decide which blocks, items and fluids exist.
- Do not change the order of `initAllMaterials()`, the `UranusTechMaterial*.register*()` calls and `DeferredRegister.register(bus)` in `UranusTech.kt` without checking that the materials still exist first.
- Do not treat the side-effect registration in `material()` as a bug to clean up.

## The material list and its data files

The owner treats the material questions (which materials to keep, and where the data comes from) as answered by the decision above. Do not prune materials or restructure `data/materials/*.kt` unless the owner asks.

## Item forms are a fixed enum

Item forms (ingot, plate, dust and so on) are the `ItemGeneratorModel` enum, and block forms are the `BlockGeneratorModel` enum. They stay hard-coded enums.

The owner does not want other systems (other mods, datapacks, addons) to add item forms. Do not make forms data-driven or registry-based.
