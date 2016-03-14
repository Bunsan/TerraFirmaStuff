package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRegistry;
import net.minecraft.item.ItemStack;

public class ItemHeat
{
    public static void setupItemHeat()
    {
        HeatRegistry manager = HeatRegistry.getInstance();

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.clayRaw, 1, 0), 1, 600, new ItemStack(ModBlocks.clayStained2, 1, 0)));
    }
}
