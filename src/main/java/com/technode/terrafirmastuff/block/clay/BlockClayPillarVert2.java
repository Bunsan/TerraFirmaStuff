package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockClayPillarVert2 extends BlockClayPillarVert
{
    public BlockClayPillarVert2()
    {
        super();
        //this.setCreativeTab(CreativeTab.TFS_TAB);
        this.names = new String[Reference.COLOURS.length-16];
        System.arraycopy(Reference.COLOURS, 16, names, 0, Reference.COLOURS.length-16);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta += 16;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if (meta >= names.length)
            meta = 0;
        if (side == 0 || side == 1)
            return topIcons[meta];
        return sideIcons[meta];
    }
}