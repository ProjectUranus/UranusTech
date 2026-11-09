# AGENTS.md - Developer and AI Agent Guide

This document provides essential information for developers and AI agents working on this Minecraft mod's codebase.

## Project Overview

This is a Minecraft NeoForge 1.21.1 mod. See README.md for a description of what this mod does. The project is written in Java and uses Gradle as its build system.

## Coding Style & Naming Conventions
Target Java 21 with 4-space indentation and UTF-8 encoding (WITHOUT BOM), matching the Gradle toolchain configuration. Follow existing packages under `dev.lasm.uranustech`, mirroring existing sub-packages like `customization`, `events`, and `platform` to keep cross-loader boundaries clear. Name resources with the `uranustech` prefix (e.g., `uranustech.mixins.json`, `uranustech.accesswidener`) so Gradle and the loaders resolve them consistently. Prefer explicit nullability annotations from `jsr305`, keep Mixin classes lightweight, and document multi-step flows with concise comments.

## Localization
- Always add en_us localizations for the features you add. Only en_us.
- Maintain hand-written translations in `scripts/lang/static_en_us.json` and generated translation formatting in `scripts/lang/en_us.json.jinja`.
- Material names and properties used for localization generation are maintained in `scripts/lang/en_us.materials.json`, keyed by material id. Update this data when adding or changing material names, item generator tags, smithability, transparency, or validity.
- Block and fluid form suffixes and Jinja name templates are maintained in `scripts/lang/en_us.forms.json.jinja`.
- Material block and fluid translations are generated from these JSON sources by `scripts/generate_lang.py`; the generator must not read Kotlin source files, and generated entries in `en_us.json` must not be edited by hand.
- After changing localization sources, run `uv run --project scripts python scripts/generate_lang.py` from the project root to write `src/main/resources/assets/uranustech/lang/en_us.json`.
- Run `uv run --project scripts python scripts/generate_lang.py --check` to verify the generated file is up to date without modifying it.
- Always read and write language sources and generated JSON with explicit UTF-8 without BOM encoding.

## Library Sources
You have access to some of the most important library sources used by Minecraft, like full LWJGL and JOML sources in the `library_cached_sources` folder. Make sure to check the sources when working on tasks that involve working with libraries used by Minecraft.

## Git & Run/Compile
- NEVER try to run git commands.
- Agents may write and run scripts in the `scripts` folder using `uv` and Python.
- The Python project and its dependencies are declared in `scripts/pyproject.toml` and locked in `scripts/uv.lock`.
- Agents may run `gradlew build`.
- Do not run or compile the project using other commands.

## Design Decisions
Owner decisions are recorded in `docs/`. Read the relevant file before changing the related code.
- `docs/materials.md`: built-in materials are initialized before NeoForge registries, because blocks, items and fluids are generated from them. Keep this order and do not move built-in materials to a datapack registry. Item and block forms stay hard-coded enums, because other systems must not add forms.
- `docs/resources.md`: item and block models are generated at runtime from shared templates, and colours come from `UtBlockColors` and `UtItemColors`. Never add per-material model JSON files or datagen providers. Assets copied from GT6 stay checked in.
- `docs/porting-rules.md`: never copy any line of GT6. Understand what it does and write new, modern code. Use Kotlin features and fastutil collections for performance. The one exception is `data/CS.java` (GT6 constants): use it, do not port or replace it.
- `docs/worldgen.md`: rock layers, ore veins and small ores are datapack registries (`uranustech:ore_vein`, `uranustech:small_ore`) consumed by three features in the `underground_ores` step. Veins are sparse by design: one block per column per role. All world generation state must be immutable or concurrent, because chunk generation is multi-threaded. Vanilla overworld ores are removed by a biome modifier.

## Project Scope
- The example block, example item and example tab in `UranusTech.kt` are template leftovers and may be deleted (together with their en_us entries).
- Keep `Config.kt` and the dependencies in `build.gradle` (LDLib2, JEI, EMI, Jade) as they are, even though nothing uses them yet.
