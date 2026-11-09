# Resources and models

## Item and block models are generated at runtime

Decision (owner): models are dynamic JSON, not checked-in files and not datagen output.

Why: generating them with data providers would write tens of thousands of JSON files and overwhelm the project folder. Most of these files share one template and differ only in colour.

How it works:
- `UranusTechDynamicResourcePack` (see `data/resource/`) builds the model and blockstate JSON in memory. `DynamicResourcePackCache` serializes each resource once and shares the bytes between all paths that use it.
- `UranusTechDynamicRecipePack` provides generated material blasting recipes as server data, without per-material recipe files.
- The per-material colour is not in the model. It is applied as a tint by `UtBlockColors`, `UtItemColors` and `UtFluidColors` in `client/model/`.
- Many items and blocks point at one shared model through a small alias model.

Rules for new work:
- Do not add per-material model, blockstate or item JSON files to `src/main/resources`, and do not add datagen providers for them.
- If a new form needs a different look, add a new shared template and let the colour handlers tint it. Do not generate one file per material.
- New shared resources should go through `DynamicResourcePackCache` so each is serialized once.

## Assets copied from GT6 stay in the repo

Textures and other assets copied from GT6 stay checked in under `src/main/resources/assets/uranustech/` (about 15,000 textures). Do not move them to a generated or downloaded location. Keep `ATTRIBUTION.md` in that folder up to date when adding assets.

The existing static geology files (blockstates, recipes, loot tables) are also checked in. The owner has not asked to change that.
