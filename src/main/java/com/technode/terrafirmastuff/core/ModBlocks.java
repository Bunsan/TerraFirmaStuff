package com.technode.terrafirmastuff.core;

import com.technode.terrafirmastuff.block.clay.*;
import com.technode.terrafirmastuff.block.metal.BlockOilLampMod;
import com.technode.terrafirmastuff.block.metal.BlockOilLampMod2;
import com.technode.terrafirmastuff.block.metal.BlockOilLampMod3;
import com.technode.terrafirmastuff.block.metal.BlockOilLampMod4;
import com.technode.terrafirmastuff.block.mineral.BlockMineral;
import com.technode.terrafirmastuff.block.mineral.BlockMineralChiseled;
import com.technode.terrafirmastuff.block.mineral.BlockMineralPillar;
import com.technode.terrafirmastuff.block.stone.*;
import com.technode.terrafirmastuff.block.wood.BlockFence;
import com.technode.terrafirmastuff.block.wood.BlockFence2;
import com.technode.terrafirmastuff.block.wood.BlockStickBundle;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import com.technode.terrafirmastuff.item.itemBlock.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks
{
    public static Block clayRaw;
    public static Block clayRawColor;
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
    public static Block stoneSedTile;
    public static Block stoneMMTile;
    public static Block stoneIgInTile;
    public static Block stoneIgExTile;
    public static Block stoneSedCircle;
    public static Block stoneMMCircle;
    public static Block stoneIgInCircle;
    public static Block stoneIgExCircle;
    public static Block stoneSedPillar;
    public static Block stoneSedPillar2;
    public static Block stoneMMPillar;
    public static Block stoneMMPillar2;
    public static Block stoneIgInPillar;
    public static Block stoneIgExPillar;

    public static Block mineralBlock;
    public static Block mineralChiseled;
    public static Block mineralPillar;

    public static Block fence;
    public static Block fence2;

    public static Block stickBundle;

    public static Block oilLampMod;
    public static Block oilLampMod2;
    public static Block oilLampMod3;
    public static Block oilLampMod4;

    public static int stickBundleID;
    public static int oilLampModRenderId;


    public static void registerBlocks()
    {
        GameRegistry.registerBlock(clayRaw, ItemBlockClayRaw.class, "clayRaw");
        GameRegistry.registerBlock(clayRawColor, ItemBlockClayRawColor.class, "clayRawColor");
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

        GameRegistry.registerBlock(stoneSedTile, ItemBlockStoneSed.class, "stoneSedTile");
        GameRegistry.registerBlock(stoneMMTile, ItemBlockStoneMM.class, "stoneMMTile");
        GameRegistry.registerBlock(stoneIgInTile, ItemBlockStoneIgIn.class, "stoneIgInTile");
        GameRegistry.registerBlock(stoneIgExTile, ItemBlockStoneIgEx.class, "stoneIgExTile");
        GameRegistry.registerBlock(stoneSedCircle, ItemBlockStoneSed.class, "stoneSedCircle");
        GameRegistry.registerBlock(stoneMMCircle, ItemBlockStoneMM.class, "stoneMMCircle");
        GameRegistry.registerBlock(stoneIgInCircle, ItemBlockStoneIgIn.class, "stoneIgInCircle");
        GameRegistry.registerBlock(stoneIgExCircle, ItemBlockStoneIgEx.class, "stoneIgExCircle");
        GameRegistry.registerBlock(stoneSedPillar, ItemBlockStoneSedRotatable.class, "stoneSedPillar");
        GameRegistry.registerBlock(stoneSedPillar2, ItemBlockStoneSedRotatable2.class, "stoneSedPillar2");
        GameRegistry.registerBlock(stoneMMPillar, ItemBlockStoneMMRotatable.class, "stoneMMPillar");
        GameRegistry.registerBlock(stoneMMPillar2, ItemBlockStoneMMRotatable2.class, "stoneMMPillar2");
        GameRegistry.registerBlock(stoneIgInPillar, ItemBlockStoneIgInRotatable.class, "stoneIgInPillar");
        GameRegistry.registerBlock(stoneIgExPillar, ItemBlockStoneIgExRotatable.class, "stoneIgExPillar");

        GameRegistry.registerBlock(mineralBlock, ItemBlockMineral.class, "mineralBlock");
        GameRegistry.registerBlock(mineralChiseled, ItemBlockMineralRotatable.class, "mineralChiseled");
        GameRegistry.registerBlock(mineralPillar, ItemBlockMineralRotatable.class, "mineralPillar");

        GameRegistry.registerBlock(fence, ItemFence.class, "Fence");
        GameRegistry.registerBlock(fence2, ItemFence2.class, "Fence2");

        GameRegistry.registerBlock(stickBundle, "StickBundle");

        GameRegistry.registerBlock(oilLampMod, ItemOilLampMod.class, "OilLampMod");
        GameRegistry.registerBlock(oilLampMod2, ItemOilLampMod2.class, "OilLampMod2");
        GameRegistry.registerBlock(oilLampMod3, ItemOilLampMod3.class, "OilLampMod3");
        GameRegistry.registerBlock(oilLampMod4, ItemOilLampMod4.class, "OilLampMod4");

    }

    public static void blockReferences()
    {
        clayRaw = new BlockClayRaw() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeGravel).setBlockName("RawClay");
        clayRawColor = new BlockClayRawColor() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeGravel).setBlockName("RawClayColor");
        clayStained = new BlockClay() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClay");
        clayStained2 = new BlockClay2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClay2");
        clayStainedPaver = new BlockClayPaver() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPaver");
        clayStainedPaver2 = new BlockClayPaver2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPaver2");
        clayStainedTile = new BlockClayTile() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayTile");
        clayStainedTile2 = new BlockClayTile2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayTile2");
        clayStainedBrick = new BlockClayBrick() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayBrick");
        clayStainedBrick2 = new BlockClayBrick2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayBrick2");
        clayStainedCircle = new BlockClayCircle() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayCircle");
        clayStainedCircle2 = new BlockClayCircle2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayCircle2");
        clayStainedChiseled = new BlockClayChiseled() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseled");
        clayStainedChiseled2 = new BlockClayChiseled2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseled2");
        clayStainedChiseled3 = new BlockClayChiseled3() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseled3");
        clayStainedChiseled4 = new BlockClayChiseled4() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseled4");
        clayStainedChiseled5 = new BlockClayChiseled5() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseled5");
        clayStainedPillar = new BlockClayPillar() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillar");
        clayStainedPillar2 = new BlockClayPillar2() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillar2");
        clayStainedPillar3 = new BlockClayPillar3() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillar3");
        clayStainedPillar4 = new BlockClayPillar4() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillar4");
        clayStainedPillar5 = new BlockClayPillar5() {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillar5");

        stoneSedTile = new BlockTileSed() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneSedTile");
        stoneMMTile = new BlockTileMM() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneMMTile");
        stoneIgInTile = new BlockTileIgIn() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneIgInTile");
        stoneIgExTile = new BlockTileIgEx() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneIgExTile");
        stoneSedCircle = new BlockCircleSed() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneSedCircle");
        stoneMMCircle = new BlockCircleMM() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneMMCircle");
        stoneIgInCircle = new BlockCircleIgIn() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneIgInCircle");
        stoneIgExCircle = new BlockCircleIgEx() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneIgExCircle");
        stoneSedPillar = new BlockPillarSed() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneSedPillar");
        stoneSedPillar2 = new BlockPillarSed2() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneSedPillar2");
        stoneMMPillar = new BlockPillarMM() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneMMPillar");
        stoneMMPillar2 = new BlockPillarMM2() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneMMPillar2");
        stoneIgInPillar = new BlockPillarIgIn() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneIgInPillar");
        stoneIgExPillar = new BlockPillarIgEx() {}.setHardness(6F).setResistance(40F).setStepSound(Block.soundTypeStone).setBlockName("StoneIgExPillar");

        mineralBlock = new BlockMineral() {}.setHardness(3F).setResistance(20F).setStepSound(Block.soundTypeStone).setBlockName("MineralBlock");
        mineralChiseled = new BlockMineralChiseled() {}.setHardness(3F).setResistance(20F).setStepSound(Block.soundTypeStone).setBlockName("MineralChiseled");
        mineralPillar = new BlockMineralPillar() {}.setHardness(3F).setResistance(20F).setStepSound(Block.soundTypeStone).setBlockName("MineralPillar");

        fence = new BlockFence("Fence", Material.wood).setBlockName("Fence").setHardness(2);
        fence2 = new BlockFence2("Fence2", Material.wood).setBlockName("Fence").setHardness(2);

        stickBundle = new BlockStickBundle().setHardness(0.5F).setResistance(1.0F).setBlockName("StickBundle");

        oilLampMod = new BlockOilLampMod().setHardness(1F).setBlockName("OilLampMod");
        oilLampMod2 = new BlockOilLampMod2().setHardness(1F).setBlockName("OilLampMod");
        oilLampMod3 = new BlockOilLampMod3().setHardness(1F).setBlockName("OilLampMod");
        oilLampMod4 = new BlockOilLampMod4().setHardness(1F).setBlockName("OilLampMod");

        registerBlocks();

        LogHelper.info("Finished Loading Blocks");
    }
    public static void setupFire()
    {
        Blocks.fire.setFireInfo(fence, 5, 20);
        Blocks.fire.setFireInfo(fence2, 5, 20);
        Blocks.fire.setFireInfo(stickBundle, 5, 20);
    }
}
