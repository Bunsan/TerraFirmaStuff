package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.util.IIcon;

public class BlockClayChiseled2 extends BlockClayChiseled
{
    public BlockClayChiseled2()
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
}