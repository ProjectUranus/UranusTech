"""Import/check item material amounts against the GT6 OP prefix definitions."""

import argparse
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
MODELS = ROOT / "src/main/java/dev/lasm/uranustech/data/ItemGeneratorModelMap.kt"
GT6_PREFIXES = Path("G:/gregtech6/src/main/java/gregapi/data/OP.java")


def prefixes():
    source = GT6_PREFIXES.read_text(encoding="utf-8")
    result = {}
    for line in source.splitlines():
        name = re.match(r'\s*\w+\s*=\s*create\("(\w+)"', line)
        if not name:
            continue
        amount = re.search(r'\.setMaterialStats\(([^,)]+)', line)
        if amount:
            expression = re.sub(r'\b(U\d*)\b', r'CS.\1', amount[1].strip())
            result[name[1].lower()] = re.sub(r'\s*([*+-])\s*', r' \1 ', expression)
        elif ".setOreStats(" in line:
            # GT6 ore prefixes deliberately use mAmount = -1, not mWeight.
            result[name[1].lower()] = "-1L"
    return result


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--write", action="store_true")
    args = parser.parse_args()
    source = MODELS.read_text(encoding="utf-8")
    values = prefixes()
    pattern = r'^(\s+[A-Z_0-9]+\("[a-z0-9_]+", "([a-z0-9_]+)")(?:, ([^)]+))?(\)[,;])'
    count = 0

    def replace(match):
        nonlocal count
        count += 1
        expected = values[match[2]]
        if args.write:
            return f"{match[1]}, {expected}{match[4]}"
        if match[3] != expected:
            raise ValueError(f"Incorrect material amount for {match[2]}: {match[3]} != {expected}")
        return match[0]

    updated = re.sub(pattern, replace, source, flags=re.MULTILINE)
    assert count == 102, count
    if args.write:
        MODELS.write_text(updated, encoding="utf-8", newline="\n")
    print(f"{'Imported' if args.write else 'Verified'} {count} material amounts against GT6.")
    for icon in ("ingotdouble", "dusttiny", "billet", "crushedpurified", "oreraw"):
        print(f"{icon}: {values[icon]}")


if __name__ == "__main__":
    main()
