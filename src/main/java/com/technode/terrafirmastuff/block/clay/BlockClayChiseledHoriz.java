package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class BlockClayChiseledHoriz extends BlockClayChiseledVert {

    protected int offset;

    public BlockClayChiseledHoriz(int off)
    {
        super();
        this.setCreativeTab(null);
        offset = off;
        names = new String[16];
        System.arraycopy(Reference.COLOURS, off, names, 0, 8);
        System.arraycopy(Reference.COLOURS, off, names, 8, 8);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        int dir = meta >> 3;
        meta = (meta & 7) + offset; //NOPMD

        if(dir == 0)
        {
            if(side == 0 || side == 1)
                return ((BlockClayChiseledVert) ModBlocks.clayStainedChiseledVert).sideIcons[meta];
            else if(side == 2 || side == 3)
                return ((BlockClayChiseledVert) ModBlocks.clayStainedChiseledVert).topIcons[meta];
            else
                return ((BlockClayChiseledVert) ModBlocks.clayStainedChiseledVert).rotatedSideIcons[meta];
        }
        else
        {
            if(side == 0 || side == 1 || side == 2 || side == 3)
                return ((BlockClayChiseledVert) ModBlocks.clayStainedChiseledVert).rotatedSideIcons[meta];
            else
                return ((BlockClayChiseledVert) ModBlocks.clayStainedChiseledVert).topIcons[meta];
        }
    }

    @Override
    public int damageDropped(int dmg)
    {
        return (dmg & 7) + offset; //NOPMD
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SideOnly(Side.CLIENT)
    @Override
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for(int i = 0; i < (names.length + 1) / 2; i++)
            list.add(new ItemStack(this, 1, i));
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
        int dir = MathHelper.floor_double(entityliving.rotationYaw * 4F / 360F + 0.5D) & 3;
        int metadata = world.getBlockMetadata(x, y, z);

        if(dir == 1 || dir == 3)
            world.setBlockMetadataWithNotify(x, y, z, metadata + 8, 3);
    }
}
