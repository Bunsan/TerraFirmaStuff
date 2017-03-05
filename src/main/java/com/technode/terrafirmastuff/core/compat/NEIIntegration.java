package com.technode.terrafirmastuff.core.compat;

import codechicken.nei.api.API;
import com.technode.terrafirmastuff.core.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class NEIIntegration {
    public static void hideNEIItems() {
        API.hideItem(new ItemStack(Blocks.clay));
        API.hideItem(new ItemStack(Blocks.hardened_clay));
        API.hideItem(new ItemStack(Blocks.stained_hardened_clay, 1, OreDictionary.WILDCARD_VALUE));
        API.hideItem(new ItemStack(ModBlocks.oilLampMod2, 1, 5));
    }
}
