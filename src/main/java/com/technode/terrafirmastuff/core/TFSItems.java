package com.technode.terrafirmastuff.core;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class TFSItems
{
    public static Item smallMetalChunk;
    public static Item metalDust;

    public static void registerItems()
    {
        GameRegistry.registerItem(smallMetalChunk, smallMetalChunk.getUnlocalizedName());
        GameRegistry.registerItem(metalDust, metalDust.getUnlocalizedName());
    }
}
