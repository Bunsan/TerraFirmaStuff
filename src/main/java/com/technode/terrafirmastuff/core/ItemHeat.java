package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRegistry;
import net.minecraft.item.ItemStack;

public class ItemHeat
{
    public static void setupItemHeat() {
        HeatRegistry manager = HeatRegistry.getInstance();

        for(int i = 0; i < 16; i++) {
            ItemStack input = new ItemStack((ModBlocks.clayRawColor), 1, i);
            ItemStack output = new ItemStack((ModBlocks.clayStained), 1, i);

            manager.addIndex(new HeatIndex(input, 1, 600, output).setMinMax(output.getItemDamage()));
        }
        for(int i = 0; i < 17; i++)
        {
            ItemStack input2 = new ItemStack((ModItems.clayRawBrick), 1, i);
            ItemStack output2 = new ItemStack((ModItems.clayBrick), 1, i);

            manager.addIndex(new HeatIndex(input2, 1, 150, output2).setMinMax(output2.getItemDamage()));
        }

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.clayRaw, 1, 0), 1, 600, new ItemStack(ModBlocks.clayStained2, 1)));
    }
}
