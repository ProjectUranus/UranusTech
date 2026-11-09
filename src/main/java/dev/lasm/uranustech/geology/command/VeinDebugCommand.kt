package dev.lasm.uranustech.geology.command

import com.mojang.brigadier.arguments.IntegerArgumentType
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.geology.worldgen.OreVein
import dev.lasm.uranustech.geology.worldgen.VeinBounds
import dev.lasm.uranustech.geology.worldgen.VeinOrigin
import dev.lasm.uranustech.geology.worldgen.VeinRegistry
import net.minecraft.ChatFormatting
import net.minecraft.commands.CommandSourceStack
import net.minecraft.commands.Commands
import net.minecraft.core.HolderSet
import net.minecraft.core.SectionPos
import net.minecraft.network.chat.Component

/**
 * `/uranustech vein [radius]` reports the ore veins that affect the caller's chunk.
 *
 * This exists because the usual question about world generation is "why is there no ore here", and
 * answering it from the log alone means reproducing the geometry by hand. The command reads nothing
 * from the level and writes nothing; it runs the same [VeinRegistry] selection and [VeinBounds]
 * geometry the feature uses, so what it prints is what generation decided.
 *
 * `radius` is how many chunks around the caller to list origins for, beyond the ones that reach the
 * caller's own chunk. The default of 0 lists only the veins that can affect the caller's chunk.
 */
object VeinDebugCommand {
    fun register(parent: LiteralArgumentBuilder<CommandSourceStack>): LiteralArgumentBuilder<CommandSourceStack> =
        parent.then(
            Commands.literal("vein")
                .executes { context -> report(context.source, 0) }
                .then(
                    Commands.argument("radius", IntegerArgumentType.integer(0, 16))
                        .executes { context -> report(context.source, IntegerArgumentType.getInteger(context, "radius")) }
                )
        )

    private fun report(source: CommandSourceStack, radius: Int): Int {
        val level = source.level
        val position = source.position
        val chunkX = SectionPos.blockToSectionCoord(position.x.toInt())
        val chunkZ = SectionPos.blockToSectionCoord(position.z.toInt())
        val seed = level.seed
        val registry = source.server.registryAccess().registryOrThrow(UranusTech.ORE_VEIN_REGISTRY_KEY)
        val allVeins = HolderSet.direct(registry.holders().toList())
        if (allVeins.size() == 0) {
            source.sendFailure(Component.literal("No ore veins are loaded"))
            return 0
        }

        source.sendSuccess({
            literal(
                "Vein report: chunk ($chunkX, $chunkZ), seed $seed, ${allVeins.size()} veins loaded",
                ChatFormatting.GOLD
            )
        }, false)

        // The veins that can actually write into this chunk, in origin order.
        val affecting = VeinRegistry.select(seed, chunkX, chunkZ, allVeins)
        if (affecting.isEmpty()) {
            source.sendSuccess({
                literal("No vein origin reaches this chunk. Origins are every third chunk.", ChatFormatting.GRAY)
            }, false)
        }
        for ((origin, vein) in affecting) {
            val bounds = VeinBounds.of(seed, origin, vein)
            val name = registry.getKey(vein)?.toString() ?: "(inline)"
            source.sendSuccess({
                literal("$name from origin (${origin.chunkX}, ${origin.chunkZ})", ChatFormatting.AQUA)
            }, false)
            source.sendSuccess({
                literal(
                    "  x ${bounds.minX}..${bounds.maxX}  z ${bounds.minZ}..${bounds.maxZ}" +
                        "  centre y ${bounds.centerY}  (bottom y ${bounds.centerY - 1}..${bounds.centerY + 1}," +
                        " top y ${bounds.centerY + 3}..${bounds.centerY + 5})",
                    ChatFormatting.DARK_AQUA
                )
            }, false)
            val rocks = if (vein.hostRocks.isEmpty()) "any rock" else vein.hostRocks.joinToString(", ")
            source.sendSuccess({
                literal(
                    "  weight ${vein.weight}  density ${vein.density}  size ${vein.size}" +
                        "  min_y ${vein.minY}  max_y ${vein.maxY}  rocks: $rocks",
                    ChatFormatting.DARK_AQUA
                )
            }, false)
            source.sendSuccess({ roles(vein) }, false)
        }

        if (radius > 0) {
            source.sendSuccess({
                literal("Origins within $radius chunks (d = chunk distance from you):", ChatFormatting.YELLOW)
            }, false)
            for (origin in originsAround(chunkX, chunkZ, radius)) {
                val vein = VeinRegistry.veinAt(seed, origin, allVeins) ?: continue
                val bounds = VeinBounds.of(seed, origin, vein)
                val name = registry.getKey(vein)?.toString() ?: "(inline)"
                val distance = maxOf(kotlin.math.abs(origin.chunkX - chunkX), kotlin.math.abs(origin.chunkZ - chunkZ))
                source.sendSuccess({
                    literal(
                        "  (${origin.chunkX}, ${origin.chunkZ}) d=$distance $name" +
                            "  x ${bounds.minX}..${bounds.maxX}  z ${bounds.minZ}..${bounds.maxZ}" +
                            "  centre y ${bounds.centerY}",
                        ChatFormatting.GRAY
                    )
                }, false)
            }
        }

        return affecting.size
    }

    /** Every origin chunk within [radius] chunks of the given chunk, in a stable order. */
    private fun originsAround(chunkX: Int, chunkZ: Int, radius: Int): List<VeinOrigin> {
        val result = ArrayList<VeinOrigin>()
        for (x in chunkX - radius..chunkX + radius) {
            if (Math.floorMod(x, VeinRegistry.CHUNK_STRIDE) != 1) continue
            for (z in chunkZ - radius..chunkZ + radius) {
                if (Math.floorMod(z, VeinRegistry.CHUNK_STRIDE) != 1) continue
                result += VeinOrigin(x, z)
            }
        }
        return result
    }

    private fun roles(vein: OreVein): Component {
        val roles = buildList {
            if (vein.bottom !== dev.lasm.uranustech.geology.worldgen.OreRef.None) add("bottom=${vein.bottom}")
            if (vein.top !== dev.lasm.uranustech.geology.worldgen.OreRef.None) add("top=${vein.top}")
            if (vein.between !== dev.lasm.uranustech.geology.worldgen.OreRef.None) add("between=${vein.between}")
            if (vein.spread !== dev.lasm.uranustech.geology.worldgen.OreRef.None) add("spread=${vein.spread}")
        }
        return literal("  " + roles.joinToString("  "), ChatFormatting.DARK_GRAY)
    }

    private fun literal(text: String, color: ChatFormatting): Component =
        Component.literal(text).withStyle(color)
}
