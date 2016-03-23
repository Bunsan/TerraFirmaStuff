package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.TFCItems;

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
        String[] colour = new String[16];
        System.arraycopy(Reference.COLOURS, 0, colour, 0, 16);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayRaw, 1, 0), "CSC","SCS","CSC", 'C', "lumpClay", 'S', new ItemStack(TFCItems.straw)));
        {
            for(int i = 0; i < colour.length; i++) {

                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStained, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStained2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPaver, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPaver2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedCircle, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedCircle2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedBrick, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedBrick2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedTile, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedTile2, 1, 0), 'D', "dye" + colour[i]));
                if (i < 4 ) {
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedChiseled, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedChiseled5, 1, 0), 'D', "dye" + colour[i]));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPillar, 8, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPillar5, 1, 0), 'D', "dye" + colour[i]));
                }
                else if (i < 8)
                {
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedChiseled2, 8, (i - 4)), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedChiseled5, 1, 0), 'D', "dye" + colour[i]));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPillar2, 8, (i - 4)), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPillar5, 1, 0), 'D', "dye" + colour[i]));
                }
                else if (i < 12)
                {
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedChiseled3, 8, (i - 8)), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedChiseled5, 1, 0), 'D', "dye" + colour[i]));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPillar3, 8, (i - 8)), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPillar5, 1, 0), 'D', "dye" + colour[i]));
                }
                else
                {
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedChiseled4, 8, (i - 12)), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedChiseled5, 1, 0), 'D', "dye" + colour[i]));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPillar4, 8, (i - 12)), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPillar5, 1, 0), 'D', "dye" + colour[i]));
                }
            }
        }

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
