package com.technode.terrafirmastuff.core;

import com.technode.terrafirmastuff.core.utility.LogHelper;
import com.technode.terrafirmastuff.item.ItemClayBrick;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{

    public static Item clayRawBrick;
    public static Item clayBrick;

    public static void registerItems()
    {
        GameRegistry.registerItem(clayRawBrick, clayRawBrick.getUnlocalizedName());
        GameRegistry.registerItem(clayBrick, clayBrick.getUnlocalizedName());
    }

    public static void itemReferences()
    {
        clayRawBrick = new ItemClayBrick().setUnlocalizedName("clayRawBrick");
        clayBrick = new ItemClayBrick().setUnlocalizedName("clayBrick");

        registerItems();

        LogHelper.info("Finished Loading Items");
    }
}
