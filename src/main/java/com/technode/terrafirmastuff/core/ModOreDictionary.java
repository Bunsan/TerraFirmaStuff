package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.TFCItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void registerOreDict() {
        final int WILD = OreDictionary.WILDCARD_VALUE;

        //Wood & Trees
        OreDictionary.registerOre("fenceWood", new ItemStack(ModBlocks.fence, 1, WILD));
        OreDictionary.registerOre("fenceWood", new ItemStack(ModBlocks.fence2, 1, WILD));
    }
}