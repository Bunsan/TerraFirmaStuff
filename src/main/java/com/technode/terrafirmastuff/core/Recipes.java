package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import net.minecraft.item.ItemStack;

public class Recipes
{
    public static final int WILD = OreDictionary.WILDCARD_VALUE;

    public static void registerRecipes()
    {
        //Ingot -> Nugget
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 0), new ItemStack(TFCItems.bismuthIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 1), new ItemStack(TFCItems.bismuthBronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 2), new ItemStack(TFCItems.blackBronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 3), new ItemStack(TFCItems.blackSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 4), new ItemStack(TFCItems.blueSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 5), new ItemStack(TFCItems.brassIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 6), new ItemStack(TFCItems.bronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 7), new ItemStack(TFCItems.copperIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 8), new ItemStack(TFCItems.goldIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 9), new ItemStack(TFCItems.wroughtIronIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 10), new ItemStack(TFCItems.leadIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 11), new ItemStack(TFCItems.nickelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 12), new ItemStack(TFCItems.pigIronIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 13), new ItemStack(TFCItems.platinumIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 14), new ItemStack(TFCItems.redSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 15), new ItemStack(TFCItems.roseGoldIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 16), new ItemStack(TFCItems.silverIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 17), new ItemStack(TFCItems.steelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 18), new ItemStack(TFCItems.sterlingSilverIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 19), new ItemStack(TFCItems.tinIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFSItems.smallMetalChunk, 10, 20), new ItemStack(TFCItems.zincIngot), "itemChisel"));
    }
}
