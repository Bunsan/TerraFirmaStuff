package com.technode.terrafirmastuff.core;

import com.technode.terrafirmastuff.item.itemBlock.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block clayRaw;
    public static Block clayStained;
    public static Block clayStained2;
    public static Block clayStainedPaver;
    public static Block clayStainedPaver2;
    public static Block clayStainedTile;
    public static Block clayStainedTile2;
    public static Block clayStainedBrick;
    public static Block clayStainedBrick2;
    public static Block clayStainedCircle;
    public static Block clayStainedCircle2;
    public static Block clayStainedChiseled;
    public static Block clayStainedChiseled2;
    public static Block clayStainedChiseled3;
    public static Block clayStainedChiseled4;
    public static Block clayStainedChiseled5;
    public static Block clayStainedPillar;
    public static Block clayStainedPillar2;
    public static Block clayStainedPillar3;
    public static Block clayStainedPillar4;
    public static Block clayStainedPillar5;
    public static Block flowerPotColor;

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(clayRaw, ItemBlockClayRaw.class, "clayRaw");
        GameRegistry.registerBlock(clayStained, ItemBlockClay.class, "clayStained");
        GameRegistry.registerBlock(clayStained2, ItemBlockClay2.class, "clayStained2");
        GameRegistry.registerBlock(clayStainedPaver, ItemBlockClay.class, "clayStainedPaver");
        GameRegistry.registerBlock(clayStainedPaver2, ItemBlockClay2.class, "clayStainedPaver2");
        GameRegistry.registerBlock(clayStainedTile, ItemBlockClay.class, "clayStainedTile");
        GameRegistry.registerBlock(clayStainedTile2, ItemBlockClay2.class, "clayStainedTile2");
        GameRegistry.registerBlock(clayStainedBrick, ItemBlockClay.class, "clayStainedBrick");
        GameRegistry.registerBlock(clayStainedBrick2, ItemBlockClay2.class, "clayStainedBrick2");
        GameRegistry.registerBlock(clayStainedCircle, ItemBlockClay.class, "clayStainedCircle");
        GameRegistry.registerBlock(clayStainedCircle2, ItemBlockClay2.class, "clayStainedCircle2");
        GameRegistry.registerBlock(clayStainedChiseled, ItemBlockClayRotatable.class, "clayStainedChiseled");
        GameRegistry.registerBlock(clayStainedChiseled2, ItemBlockClayRotatable2.class, "clayStainedChiseled2");
        GameRegistry.registerBlock(clayStainedChiseled3, ItemBlockClayRotatable3.class, "clayStainedChiseled3");
        GameRegistry.registerBlock(clayStainedChiseled4, ItemBlockClayRotatable4.class, "clayStainedChiseled4");
        GameRegistry.registerBlock(clayStainedChiseled5, ItemBlockClayRotatable5.class, "clayStainedChiseled5");
        GameRegistry.registerBlock(clayStainedPillar, ItemBlockClayRotatable.class, "clayStainedPillar");
        GameRegistry.registerBlock(clayStainedPillar2, ItemBlockClayRotatable2.class, "clayStainedPillar2");
        GameRegistry.registerBlock(clayStainedPillar3, ItemBlockClayRotatable3.class, "clayStainedPillar3");
        GameRegistry.registerBlock(clayStainedPillar4, ItemBlockClayRotatable4.class, "clayStainedPillar4");
        GameRegistry.registerBlock(clayStainedPillar5, ItemBlockClayRotatable5.class, "clayStainedPillar5");
        GameRegistry.registerBlock(flowerPotColor, ItemBlockFlowerPotColor.class, "FlowerPotColor");
    }
}
