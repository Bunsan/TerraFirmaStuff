package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.Reference;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockClayPillarVert2 extends ItemBlockClayPillarVert
{
    public ItemBlockClayPillarVert2(Block b)
    {
        super(b);
        metaNames = new String[Reference.COLOURS.length-16];
        System.arraycopy(Reference.COLOURS, 16, metaNames, 0, Reference.COLOURS.length-16);
    }

    @Override
    public String getUnlocalizedName(ItemStack is)
    {
        try
        {
            int meta = is.getItemDamage();
            if(meta > 15) meta -= 16;
            if(metaNames != null && meta < metaNames.length)
                return getUnlocalizedName().concat("." + metaNames[meta]);
        }
        catch(Exception ex)
        {
            LogHelper.error(ex.getLocalizedMessage());
        }
        return "Unknown";
    }
    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if(!world.isRemote)
        {
            int m = itemstack.getItemDamage();
            Block block = ModBlocks.clayStainedPillarVert2;

            if(side == 0 && block.canPlaceBlockAt(world, x, y-1, z) && world.canPlaceEntityOnSide(ModBlocks.clayStainedPillarVert2, x, y-1, z, false, side, null, itemstack))
            {
                world.setBlock(x, y-1, z, block, m,0x2);
                itemstack.stackSize = itemstack.stackSize-1;
                //  playSound(world, x, y, z);
            }
            else if(side == 1 && block.canPlaceBlockAt(world, x, y+1, z) && world.canPlaceEntityOnSide(ModBlocks.clayStainedPillarVert2, x, y+1, z, false, side, null, itemstack))
            {
                world.setBlock(x, y+1, z, block, m,0x2);
                itemstack.stackSize = itemstack.stackSize-1;
                //playSound(world, x, y, z);
            }
            else if(side == 2 && block.canPlaceBlockAt(world, x, y, z-1) && world.canPlaceEntityOnSide(ModBlocks.clayStainedPillarVert2, x, y, z-1, false, side, null, itemstack))
            {
                setSide(world, itemstack, m, side, x, y, z-1);
            }
            else if(side == 3 && block.canPlaceBlockAt(world, x, y, z+1) && world.canPlaceEntityOnSide(ModBlocks.clayStainedPillarVert2, x, y, z+1, false, side, null, itemstack))
            {
                setSide(world, itemstack, m, side, x, y, z+1);
            }
            else if(side == 4 && block.canPlaceBlockAt(world, x-1, y, z) && world.canPlaceEntityOnSide(ModBlocks.clayStainedPillarVert2, x-1, y, z, false, side, null, itemstack))
            {
                setSide(world, itemstack, m, side, x-1, y, z);
            }
            else if(side == 5 && block.canPlaceBlockAt(world, x+1, y, z) && world.canPlaceEntityOnSide(ModBlocks.clayStainedPillarVert2, x+1, y, z, false, side, null, itemstack))
            {
                setSide(world, itemstack, m, side, x+1, y, z);
            }
            return true;
        }
        return false;
    }

    public void setSide(World world, ItemStack itemstack, int m, int side, int x, int y, int z)
    {
        // don't call this function with side==0 or side==1, it won't do anything

        int meta = m % 8;
        Block clay = ModBlocks.clayStainedPillarHoriz3;
        switch (m/8) {
            case 1:
                clay = ModBlocks.clayStainedPillarHoriz3;
                break;
        }

        if (side == 2 || side == 3) {
            world.setBlock(x, y, z, clay, meta, 0x2);
            itemstack.stackSize = itemstack.stackSize-1;
            // playSound(world, x, y, z);
        }
        else if (side == 4 || side == 5) {
            world.setBlock(x, y, z, clay, meta | 8, 0x2);
            itemstack.stackSize = itemstack.stackSize-1;
            //  playSound(world, x, y, z);
        }
    }
}
