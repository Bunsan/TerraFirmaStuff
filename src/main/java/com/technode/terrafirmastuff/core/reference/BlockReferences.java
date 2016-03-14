package com.technode.terrafirmastuff.core.reference;

import com.technode.terrafirmastuff.block.clay.*;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockReferences extends ModBlocks
{
    public static void blockReferences()
    {
        clayRaw = new BlockClayRaw(Material.clay) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeGravel).setBlockName("RawClay");
        clayStained = new BlockClay(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClay");
        clayStained2 = new BlockClay2(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClay2");
        clayStainedPaver = new BlockClayPaver(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPaver");
        clayStainedPaver2 = new BlockClayPaver2(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPaver2");
        clayStainedTile = new BlockClayTile(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayTile");
        clayStainedTile2 = new BlockClayTile2(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayTile2");
        clayStainedBrick = new BlockClayBrick(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayBrick");
        clayStainedBrick2 = new BlockClayBrick2(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayBrick2");
        clayStainedCircle = new BlockClayCircle(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayCircle");
        clayStainedCircle2 = new BlockClayCircle2(Material.rock) {}.setHardness(1F).setResistance(2.5F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayCircle2");
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

        registerBlocks();

        LogHelper.info("Finished Loading Blocks");
    }
}
