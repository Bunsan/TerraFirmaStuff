package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Crafting.QuernManager;
import com.bioxx.tfc.api.Crafting.QuernRecipe;
import com.bioxx.tfc.api.TFCItems;

import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.crafting.FurnaceRecipes;
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

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mineralBlock, 4, 0), "MmM", "mMm", "MmM", 'M', new ItemStack(ModItems.powder, 1, 0), 'm', new ItemStack(TFCItems.mortar)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mineralBlock, 4, 1), "MmM", "mMm", "MmM", 'M', new ItemStack(ModItems.powder, 1, 1), 'm', new ItemStack(TFCItems.mortar)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.mineralBlock, 4, 2), "MmM", "mMm", "MmM", 'M', new ItemStack(ModItems.powder, 1, 2), 'm', new ItemStack(TFCItems.mortar)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.stickBundle), "stickWood", "stickWood", "stickWood", "stickWood", "stickWood", "stickWood", "stickWood", "stickWood", "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TFCItems.stick, 9, 0), new ItemStack(ModItems.stickBundle)));

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

        // Fences
        for(int i = 0; i < Global.WOOD_ALL.length; i++) {
            int l = i % 16;
            if (i == l) {
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.fence, 2, i), "PSP", "PSP", "P P", 'S', "stickWood", 'P', new ItemStack(TFCItems.singlePlank, 1, i)));
            }
            else if(i/16 == 1)
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.fence2, 2, l), "PSP", "PSP", "P P", 'S', "stickWood", 'P', new ItemStack(TFCItems.singlePlank, 1, i)));
            }
        }

        // Furnace
        for(int i = 0; i < 16; i++) {
            ItemStack input = new ItemStack((ModBlocks.clayRawColor), 1, i);
            ItemStack output = new ItemStack((ModBlocks.clayStained), 1, i);

            FurnaceRecipes.smelting().func_151394_a(input, output, 0.0F);
        }
        for(int i = 0; i < 17; i++)
        {
            ItemStack input2 = new ItemStack((ModItems.clayRawBrick), 1, i);
            ItemStack output2 = new ItemStack((ModItems.clayBrick), 1, i);

            FurnaceRecipes.smelting().func_151394_a(input2, output2, 0.0F);
        }

        FurnaceRecipes.smelting().func_151394_a(new ItemStack(ModBlocks.clayRaw, 1, 0), new ItemStack(ModBlocks.clayStained2, 1), 0.0F);

        registerQuernRecipes();

    }
    private static void registerQuernRecipes() {
        QuernManager manager = QuernManager.getInstance();

        manager.addRecipe(new QuernRecipe(new ItemStack(TFCItems.oreChunk, 1, 24), new ItemStack(ModItems.powder, 1, 0)));//Jet to Jet Powder
        manager.addRecipe(new QuernRecipe(new ItemStack(TFCItems.oreChunk, 1, 30), new ItemStack(ModItems.powder, 1, 1)));//Serpentine to Serepentine Powder
        manager.addRecipe(new QuernRecipe(new ItemStack(Items.quartz, 1), new ItemStack(ModItems.powder, 1, 2)));//Quartz to Quartz Powder
    }
}
