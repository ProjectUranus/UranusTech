"""Lowercase block iconset textures and their metadata without changing file contents."""

import hashlib
import json
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
ICONSETS = ROOT / "src/main/resources/assets/uranustech/textures/block/iconsets"


def main():
    files = sorted(path for path in ICONSETS.rglob("*") if path.is_file())
    targets = set()
    plan = []
    for path in files:
        target = path.with_name(path.name.lower())
        identifier = target.relative_to(ICONSETS).as_posix().lower()
        if identifier in targets:
            raise ValueError(f"Lowercase name collision: {target}")
        targets.add(identifier)
        if target.exists() and not path.samefile(target):
            raise ValueError(f"Destination already exists: {target}")
        if path.name != target.name:
            plan.append((path, target, hashlib.sha256(path.read_bytes()).digest()))

    for path, target, digest in plan:
        # A temporary name makes case-only renames reliable on Windows.
        temporary = path.with_name(path.name + ".lowercase-tmp")
        if temporary.exists():
            raise ValueError(f"Temporary path already exists: {temporary}")
        path.rename(temporary)
        try:
            temporary.rename(target)
        except OSError:
            temporary.rename(path)
            raise
        if hashlib.sha256(target.read_bytes()).digest() != digest:
            raise ValueError(f"File content changed: {target}")

    for path in ICONSETS.rglob("*"):
        if path.is_file():
            if path.name != path.name.lower():
                raise ValueError(f"Uppercase filename remains: {path}")
            if path.name.endswith(".png.mcmeta"):
                json.loads(path.read_text(encoding="utf-8"))
                if not path.with_suffix("").is_file():
                    raise ValueError(f"Missing texture for metadata: {path}")
    if not (ICONSETS / "crate.png").is_file():
        raise ValueError("Missing crate.png")
    print(f"Renamed {len(plan)} files; verified unchanged contents and texture metadata.")


if __name__ == "__main__":
    main()
