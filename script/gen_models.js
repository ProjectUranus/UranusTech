const fs = require('fs');

const modid = 'uranustech';
const tools = ['hammer', 'file', 'sword', 'saw', 'screwdriver', 'chisel'];
let rocks = `ANDESITE, BASALT, BLUESCHIST, DIORITE, GRANITE, BLACK_GRANITE, RED_GRANITE, GREENSCHIST, KIMBERLITE, KOMATIITE, LIMESTONE, MARBLE, DARK_PRISMARINE, LIGHT_PRISMARINE, QUARTZITE, STONE`;
let rockForms = `STONE, SMALL_BRICKS, SMALL_TILES, SMOOTH, BRICKS, BRICKS_CHISELED, BRICKS_CRACKED, BRICKS_MOSSY, BRICKS_REDSTONE, BRICKS_REINFORCED, COBBLE, COBBLE_MOSSY, SQUARE_BRICKS, TILES, WINDMILL_TILES_A, WINDMILL_TILES_B`;

rocks = rocks.toLowerCase().split(', ');
rockForms = rockForms.toLowerCase().split(', ');

for (const matfile of fs.readdirSync('run/materials')) {
    fs.readFile('run/materials/' + matfile, (err, data) => {
        if (err) console.error(err);
        const mat = JSON.parse(data.toString('utf-8'));
        /*
        let handle = mat.handleMaterial.startsWith('any')
            ? { tag: `${modid}:${mat.handleMaterial}_stick` }
            : { item: `${modid}:${mat.handleMaterial}_stick` };

        if (mat.tags.includes('PROPERTIES.HAS_TOOL_STATS')) {
            for (const tool of tools) {
                fs.writeFile(
                    `recipes/${mat.name}_${tool}.json`,
                    JSON.stringify({
                        type: 'minecraft:crafting_shapeless',
                        group: 'tools',
                        ingredients: [
                            { item: `${modid}:${mat.name}_tool_head_${tool}` },
                            handle
                        ],
                        result: {
                            item: `${modid}:${mat.name}_${tool}`
                        }
                    }),
                    err => {
                        if (err) console.error(err);
                    }
                );
            }
        }
        */
        console.log(
            '    ' +
                mat.name.toUpperCase() +
                ' = materialRegistry[Identifier(MODID, "' +
                mat.name +
                '")]!!'
        );
    });
}
