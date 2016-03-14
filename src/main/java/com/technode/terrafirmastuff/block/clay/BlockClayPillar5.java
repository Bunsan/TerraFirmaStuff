package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.util.IIcon;

public class BlockClayPillar5 extends BlockClayPillar
{
    public BlockClayPillar5()
    {
        super();
        this.setCreativeTab(CreativeTab.TFS_TAB);
        this.names = new String[1];
        System.arraycopy(Reference.COLOURS, 16, names, 0, 1);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }
}