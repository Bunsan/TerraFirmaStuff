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
    public static Block clayStainedChiseledVert;
    public static Block clayStainedChiseledVert2;
    public static Block clayStainedChiseledHoriz;
    public static Block clayStainedChiseledHoriz2;
    public static Block clayStainedChiseledHoriz3;
    public static Block clayStainedPillarVert;
    public static Block clayStainedPillarVert2;
    public static Block clayStainedPillarHoriz;
    public static Block clayStainedPillarHoriz2;
    public static Block clayStainedPillarHoriz3;

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(clayRaw, "clayRaw");
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
        GameRegistry.registerBlock(clayStainedChiseledVert, ItemBlockClayChiseledVert.class, "clayStainedChiseledVert");
        GameRegistry.registerBlock(clayStainedChiseledVert2, ItemBlockClayChiseledVert2.class, "clayStainedChiseledVert2");
        GameRegistry.registerBlock(clayStainedChiseledHoriz, ItemBlockClayChiseledHoriz.class, "clayStainedChiseledHoriz");
        GameRegistry.registerBlock(clayStainedChiseledHoriz2, ItemBlockClayChiseledHoriz2.class, "clayStainedChiseledHoriz2");
        GameRegistry.registerBlock(clayStainedChiseledHoriz3, ItemBlockClayChiseledHoriz3.class, "clayStainedChiseledHoriz3");
        GameRegistry.registerBlock(clayStainedPillarVert, ItemBlockClayPillarVert.class, "clayStainedPillarVert");
        GameRegistry.registerBlock(clayStainedPillarVert2, ItemBlockClayPillarVert2.class, "clayStainedPillarVert2");
        GameRegistry.registerBlock(clayStainedPillarHoriz, ItemBlockClayPillarHoriz.class, "clayStainedPillarHoriz");
        GameRegistry.registerBlock(clayStainedPillarHoriz2, ItemBlockClayPillarHoriz2.class, "clayStainedPillarHoriz2");
        GameRegistry.registerBlock(clayStainedPillarHoriz3, ItemBlockClayPillarHoriz3.class, "clayStainedPillarHoriz3");
    }
}
