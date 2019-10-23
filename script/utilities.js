const fs = require('fs');
const { join } = require('path');
const matpath = 'src/main/resources/assets/uranustech/textures/block/stones';

for (const iconset of fs.readdirSync(matpath)) {
    for (const icon of fs.readdirSync(join(matpath, iconset))) {
        fs.rename(join(matpath, iconset, icon), join(matpath, iconset, icon.toLowerCase()), err => err == null)
    }
}

function replaceIcon(str) {
    return str.replace('block_', '');
}

function toUnderscore(str) {
    return str.replace(/([A-Z])/g, function (x, y) { return "_" + y.toLowerCase() }).replace(/^_/, "")
}