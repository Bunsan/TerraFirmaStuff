package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

import com.technode.terrafirmastuff.TerraFirmaStuff;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import net.minecraft.item.ItemStack;

public class Recipes
{
    public static final int WILD = OreDictionary.WILDCARD_VALUE;

    public static void registerRecipes()
    {
        //Stone Stuff
        for (int j = 0; j < Global.STONE_IGIN.length; j++)
        {
            //Tiles
            GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneIgInTile, 4, j), "XPX", "PPP", "XPX",
                    'P', new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_IGIN_START), 'X', new ItemStack(TFCItems.mortar, 1));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_IGIN_START), new ItemStack(TFCItems.looseRock, 1, j + Global.STONE_IGIN_START), "itemChisel"));
        }

        for (int j = 0; j < Global.STONE_SED.length; j++)
        {
            //Tiles
            GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneSedTile, 4, j), "XPX", "PPP", "XPX",
                    'P', new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_SED_START), 'X', new ItemStack(TFCItems.mortar, 1));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_SED_START), new ItemStack(TFCItems.looseRock, 1, j + Global.STONE_SED_START), "itemChisel"));
        }

        for (int j = 0; j < Global.STONE_IGEX.length; j++)
        {
            //Tiles
            GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneIgExTile, 4, j), "XPX", "PPP", "XPX",
                    'P', new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_IGEX_START), 'X', new ItemStack(TFCItems.mortar, 1));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_IGEX_START), new ItemStack(TFCItems.looseRock, 1, j + Global.STONE_IGEX_START), "itemChisel"));
        }

        for (int j = 0; j < Global.STONE_MM.length; j++)
        {
            //Tiles
            GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneMMTile, 4, j), "XPX", "PPP", "XPX",
                    'P', new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_MM_START), 'X', new ItemStack(TFCItems.mortar, 1));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.stoneBrick, 1, j + Global.STONE_MM_START), new ItemStack(TFCItems.looseRock, 1, j + Global.STONE_MM_START), "itemChisel"));
        }

        String[] colour = new String[16];
        System.arraycopy(Reference.COLOURS, 0, colour, 0, 16);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayRaw, 1, 0), "CSC","S S","CSC", 'C', "lumpClay", 'S', new ItemStack(TFCItems.straw)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.clayRawBrick, 4, 16), new ItemStack(ModBlocks.clayRaw, 1, 0), new ItemStack(TFCItems.ceramicMold, 1, 1)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedBrick2, 1, 0), "B B", " M ", "B B", 'B', new ItemStack(ModItems.clayBrick, 1, 16), 'M', new ItemStack(TFCItems.mortar)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedTile2, 1, 0), " B ", "BMB", " B ", 'B', new ItemStack(ModItems.clayBrick, 1, 16), 'M', new ItemStack(TFCItems.mortar)));

            for(int i = 0; i < colour.length; i++) {

                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayRawColor, 1, i), "CSC", "SDS", "CSC", 'C', "lumpClay", 'S', new ItemStack(TFCItems.straw), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.clayRawBrick, 4, i), new ItemStack(ModBlocks.clayRawColor, 1, i), new ItemStack(TFCItems.ceramicMold, 1, 1)));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedBrick, 1, i), "B B", " M ", "B B", 'B', new ItemStack(ModItems.clayBrick, 1, i), 'M', new ItemStack(TFCItems.mortar)));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedTile, 1, i), " B ", "BMB", " B ", 'B', new ItemStack(ModItems.clayBrick, 1, i), 'M', new ItemStack(TFCItems.mortar)));
            }

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mineralBlock, 4, 0), "MmM", "mMm", "MmM", 'M', new ItemStack(TFCItems.powder, 1, 10), 'm', new ItemStack(TFCItems.mortar)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mineralBlock, 4, 1), "MmM", "mMm", "MmM", 'M', new ItemStack(TFCItems.powder, 1, 11), 'm', new ItemStack(TFCItems.mortar)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mineralBlock, 4, 2), "MmM", "mMm", "MmM", 'M', new ItemStack(TFCItems.powder, 1, 12), 'm', new ItemStack(TFCItems.mortar)));

        // Dyes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 3), "dyeRed", "dyeGreen"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 5), "dyeRed", "dyeBlue"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 6), "dyeBlue", "dyeGreen"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 3, 7), "dyeWhite", "dyeWhite", "dyeBlack"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 7), "dyeWhite", "dyeGray"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 8), "dyeWhite", "dyeBlack"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 9), "dyeRed", "dyeWhite"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 2, 10), "dyeGreen", "dyeWhite"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 4, 13), "dyeRed", "dyeRed", "dyeWhite", "dyeBlue"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 3, 13), "dyeRed", "dyePink", "dyeBlue"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.dye, 1, 14), "dyeRed", "dyeYellow"));
    }
}
