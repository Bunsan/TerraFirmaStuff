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
        clayRaw = new BlockClayRaw(Material.clay) {}.setHardness(6F).setResistance(1F).setStepSound(Block.soundTypeGravel).setBlockName("RawClay");
        clayStained = new BlockClay(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClay");
        clayStained2 = new BlockClay2(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClay2");
        clayStainedPaver = new BlockClayPaver(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPaver");
        clayStainedPaver2 = new BlockClayPaver2(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPaver2");
        clayStainedTile = new BlockClayTile(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayTile");
        clayStainedTile2 = new BlockClayTile2(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayTile2");
        clayStainedBrick = new BlockClayBrick(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayBrick");
        clayStainedBrick2 = new BlockClayBrick2(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayBrick2");
        clayStainedCircle = new BlockClayCircle(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayCircle");
        clayStainedCircle2 = new BlockClayCircle2(Material.rock) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayCircle2");
        clayStainedChiseledVert = new BlockClayChiseledVert() {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseledVert");
        clayStainedChiseledVert2 = new BlockClayChiseledVert2() {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseledVert2");
        clayStainedChiseledHoriz = new BlockClayChiseledHoriz(0) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseledHoriz");
        clayStainedChiseledHoriz2 = new BlockClayChiseledHoriz(8) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseledHoriz2");
        clayStainedChiseledHoriz3 = new BlockClayChiseledHoriz2(0) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayChiseledHoriz3");
        clayStainedPillarVert = new BlockClayPillarVert() {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillarVert");
        clayStainedPillarVert2 = new BlockClayPillarVert2() {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillarVert2");
        clayStainedPillarHoriz = new BlockClayPillarHoriz(0) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillarHoriz");
        clayStainedPillarHoriz2 = new BlockClayPillarHoriz(8) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillarHoriz2");
        clayStainedPillarHoriz3 = new BlockClayPillarHoriz2(0) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeStone).setBlockName("StainedClayPillarHoriz3");

        registerBlocks();

        LogHelper.info("Finished Loading Blocks");
    }
}
