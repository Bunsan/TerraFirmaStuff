package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.Handlers.TFCFuelHandler;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import com.technode.terrafirmastuff.item.ItemBase;
import com.technode.terrafirmastuff.item.ItemClayBrick;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{

    public static Item clayRawBrick;
    public static Item clayBrick;
    public static Item powder;
    public static Item stickBunch;
    public static Item twine;

    public static void registerItems()
    {
        GameRegistry.registerItem(clayRawBrick, clayRawBrick.getUnlocalizedName());
        GameRegistry.registerItem(clayBrick, clayBrick.getUnlocalizedName());
        GameRegistry.registerItem(powder, powder.getUnlocalizedName());
        GameRegistry.registerItem(stickBunch, stickBunch.getUnlocalizedName());
        GameRegistry.registerItem(twine, twine.getUnlocalizedName());
    }

    public static void itemReferences()
    {
        clayRawBrick = new ItemClayBrick().setUnlocalizedName("clayRawBrick");
        clayBrick = new ItemClayBrick().setUnlocalizedName("clayBrick");
        powder = new ItemBase().setMetaNames(Reference.POWDER).setUnlocalizedName("powder").setCreativeTab(CreativeTab.TFS_TAB);
        stickBunch = new ItemBase().setUnlocalizedName("stickBunch").setCreativeTab(CreativeTab.TFS_TAB).setTextureName("stickBunch");
        twine = new ItemBase().setUnlocalizedName("twine").setCreativeTab(CreativeTab.TFS_TAB).setTextureName("twine");

        registerItems();

        LogHelper.info("Finished Loading Items");
    }

    public static void registerFurnaceFuel()
    {
        TFCFuelHandler.registerFuel(stickBunch, 900);
        TFCFuelHandler.registerFuel(Item.getItemFromBlock(ModBlocks.stickBundle), 7200);
    }
}
