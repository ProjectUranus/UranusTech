package com.projecturanus.uranustech.common.command

import com.mojang.brigadier.LiteralMessage
import com.mojang.brigadier.StringReader
import com.mojang.brigadier.arguments.ArgumentType
import com.mojang.brigadier.context.CommandContext
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType
import com.mojang.brigadier.suggestion.Suggestions
import com.mojang.brigadier.suggestion.SuggestionsBuilder
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.common.materialRegistry
import net.minecraft.util.Identifier
import java.util.concurrent.CompletableFuture


object MaterialArgumentType : ArgumentType<Material> {
    val examples = listOf("uranustech:iron", "xxx:mat")

    override fun parse(reader: StringReader): Material? {
        val id = Identifier.fromCommandInput(reader)
        if (!materialRegistry.containsId(id))
            throw SimpleCommandExceptionType(LiteralMessage("")).createWithContext(reader)
        return materialRegistry[id]
    }

    override fun <S : Any?> listSuggestions(context: CommandContext<S>, builder: SuggestionsBuilder): CompletableFuture<Suggestions> {
        return CompletableFuture.supplyAsync {
            materialRegistry.ids.filter { it.toString().startsWith(builder.remaining) }.forEach { builder.suggest(it.toString()) }
            builder.build()
        }
    }

    override fun getExamples(): Collection<String> {
        return examples
    }
}
