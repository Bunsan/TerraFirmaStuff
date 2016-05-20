package com.technode.terrafirmastuff.tools;

import com.bioxx.tfc.api.Tools.ChiselMode;
import com.technode.terrafirmastuff.block.BlockBase;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.ModDetails;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ChiselMode_Paver extends ChiselMode {
    //private static String name;
    private static ResourceLocation resourcelocation = new ResourceLocation(ModDetails.ModID, ModDetails.AssetPathGui + "icons.png");
    private static int textureU, textureV, div;

    public ChiselMode_Paver(String n){
        //name = n;
        textureU = 100;
        textureV = 0;
        div = 1;
    }

    @Override
    public ResourceLocation getResourceLocation(){
        return resourcelocation;
    }

    @Override
    public int getTextureU(){
        return textureU;
    }

    @Override
    public int getTextureV(){
        return textureV;
    }

    @Override
    public int getDivX(Block block)
    {
        if(block instanceof BlockBase){
            return div;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getDivY(Block block){
        if(block instanceof BlockBase){
            return div;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getDivZ(Block block){
        if(block instanceof BlockBase){
            return div;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean onUsedHandler(World world, EntityPlayer player, int x, int y, int z, Block id, int meta, int side, float hitX, float hitY, float hitZ){
        if (world.getBlock(x, y, z) == ModBlocks.clayStained || world.getBlock(x, y, z) == ModBlocks.clayStained2) {
            int hasChisel = hasChisel(player);
            if (hasChisel >= 0) {
                if (id == ModBlocks.clayStained) {
                    world.setBlock(x, y, z, ModBlocks.clayStainedPaver, meta, 0x2);
                } else if (id == ModBlocks.clayStained2) {
                    world.setBlock(x, y, z, ModBlocks.clayStainedPaver2, meta, 0x2);
                }
                player.inventory.mainInventory[hasChisel].damageItem(1, player);
                return true;
            }
        }
        return false;
    }
}
