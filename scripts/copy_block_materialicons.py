"""Copy GT6 block material icons using ResourceLocation-compatible names."""

import hashlib
import re
import shutil
from pathlib import Path


SOURCE = Path(
    r"E:\Backup\2025-5-28\source\repos\gregtech6\src\main\resources"
    r"\assets\gregtech\textures\blocks\materialicons"
)
TARGET = (
    Path(__file__).resolve().parents[1]
    / "src/main/resources/assets/uranustech/textures/block/materialicons"
)


def digest(path: Path) -> bytes:
    with path.open("rb") as stream:
        return hashlib.file_digest(stream, "sha256").digest()


def main() -> None:
    if not SOURCE.is_dir():
        raise FileNotFoundError(SOURCE)

    entries: dict[Path, Path] = {}
    for source in sorted(SOURCE.rglob("*")):
        if source.is_symlink():
            raise ValueError(f"Unexpected symbolic link: {source}")
        relative = source.relative_to(SOURCE)
        normalized = Path(
            *(re.sub(r"[^a-z0-9_.-]", "_", part.lower()) for part in relative.parts)
        )
        if normalized in entries:
            raise ValueError(
                f"Name collision: {source} and {entries[normalized]} -> {normalized}"
            )
        destination = TARGET / normalized
        if destination.exists() and destination.is_dir() != source.is_dir():
            raise ValueError(f"File/directory conflict: {destination}")
        entries[normalized] = source

    TARGET.mkdir(parents=True, exist_ok=True)
    files = directories = 0
    for relative, source in entries.items():
        destination = TARGET / relative
        if source.is_dir():
            destination.mkdir(parents=True, exist_ok=True)
            directories += 1
        else:
            destination.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(source, destination)
            if digest(source) != digest(destination):
                raise ValueError(f"Content mismatch: {destination}")
            files += 1

    for destination in TARGET.rglob("*"):
        relative = destination.relative_to(TARGET).as_posix()
        if not re.fullmatch(r"[a-z0-9_.\-/]+", relative):
            raise ValueError(f"Invalid resource path: {relative}")

    print(f"Copied and verified {files} files in {directories} directories.")
    print(f"Destination: {TARGET}")


if __name__ == "__main__":
    main()
