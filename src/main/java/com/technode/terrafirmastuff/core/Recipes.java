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
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStained, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStained2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPaver, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPaver2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedCircle, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedCircle2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedBrick, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedBrick2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedTile, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedTile2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedChiseledVert, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedChiseledVert2, 1, 0), 'D', "dye" + colour[i]));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.clayStainedPillarVert, 1, i), "CCC", "CDC", "CCC", 'C', new ItemStack(ModBlocks.clayStainedPillarVert2, 1, 0), 'D', "dye" + colour[i]));
            }
        }
    }
}
