package com.technode.terrafirmastuff.tools;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.bioxx.tfc.api.Tools.ChiselMode;
import com.technode.terrafirmastuff.block.BlockBase;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.ModDetails;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ChiselMode_Circle extends ChiselMode {
    //private static String name;
    private static ResourceLocation resourcelocation = new ResourceLocation(ModDetails.ModID, ModDetails.AssetPathGui + "icons.png");
    private static int textureU, textureV, div;

    public ChiselMode_Circle(String n) {
        //name = n;
        textureU = 80;
        textureV = 0;
        div = 1;
    }

    @Override
    public ResourceLocation getResourceLocation() {
        return resourcelocation;
    }

    @Override
    public int getTextureU() {
        return textureU;
    }

    @Override
    public int getTextureV() {
        return textureV;
    }

    @Override
    public int getDivX(Block block) {
        if (block instanceof BlockBase) {
            return div;
        } else {
            return 0;
        }
    }

    @Override
    public int getDivY(Block block) {
        if (block instanceof BlockBase) {
            return div;
        } else {
            return 0;
        }
    }

    @Override
    public int getDivZ(Block block) {
        if (block instanceof BlockBase) {
            return div;
        } else {
            return 0;
        }
    }

    @Override
    public boolean onUsedHandler(World world, EntityPlayer player, int x, int y, int z, Block id, int meta, int side, float hitX, float hitY, float hitZ) {

        if(TFC_Core.isNaturalStone(world.getBlock(x, y, z)) && TFC_Core.isNaturalStone(world.getBlock(x, y + 1, z)) && TFC_Core.isNaturalStone(world.getBlock(x, y+2, z))) {
            return false;
        }

        if (world.getBlock(x, y, z) == ModBlocks.clayStainedPaver || world.getBlock(x, y, z) == ModBlocks.clayStained ||
                world.getBlock(x, y, z) == ModBlocks.clayStainedPaver2 || world.getBlock(x, y, z) == ModBlocks.clayStained2 ||
                world.getBlock(x, y, z) == TFCBlocks.stoneSed || world.getBlock(x, y, z) == TFCBlocks.stoneSedSmooth ||
                world.getBlock(x, y, z) == TFCBlocks.stoneMM || world.getBlock(x, y, z) == TFCBlocks.stoneMMSmooth ||
                world.getBlock(x, y, z) == TFCBlocks.stoneIgEx || world.getBlock(x, y, z) == TFCBlocks.stoneIgExSmooth ||
                world.getBlock(x, y, z) == TFCBlocks.stoneIgIn || world.getBlock(x, y, z) == TFCBlocks.stoneIgInSmooth) {

            int hasChisel = hasChisel(player);
            if (hasChisel >= 0) {
                if (id == ModBlocks.clayStainedPaver || id == ModBlocks.clayStained) {
                    world.setBlock(x, y, z, ModBlocks.clayStainedCircle, meta, 0x2);
                } else if (id == ModBlocks.clayStainedPaver2 || id == ModBlocks.clayStained2) {
                    world.setBlock(x, y, z, ModBlocks.clayStainedCircle2, meta, 0x2);
                } else if (id == TFCBlocks.stoneSed || id == TFCBlocks.stoneSedSmooth) {
                    world.setBlock(x, y, z, ModBlocks.stoneSedCircle, meta, 0x2);
                } else if (id == TFCBlocks.stoneMM || id == TFCBlocks.stoneMMSmooth) {
                    world.setBlock(x, y, z, ModBlocks.stoneMMCircle, meta, 0x2);
                } else if (id == TFCBlocks.stoneIgEx || id == TFCBlocks.stoneIgExSmooth) {
                    world.setBlock(x, y, z, ModBlocks.stoneIgExCircle, meta, 0x2);
                } else if (id == TFCBlocks.stoneIgIn || id == TFCBlocks.stoneIgInSmooth) {
                    world.setBlock(x, y, z, ModBlocks.stoneIgInCircle, meta, 0x2);
                }
                player.inventory.mainInventory[hasChisel].damageItem(1, player);
                return true;
            }
        }
        return false;
    }
}
