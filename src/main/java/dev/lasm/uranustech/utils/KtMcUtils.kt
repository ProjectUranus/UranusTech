package dev.lasm.uranustech.utils

import dev.lasm.uranustech.UranusTech.MODID
import net.minecraft.resources.ResourceLocation

fun rloc(namespace: String, path: String) = ResourceLocation.fromNamespaceAndPath(namespace, path)
fun rloc(path: String) = ResourceLocation.fromNamespaceAndPath(MODID, path)