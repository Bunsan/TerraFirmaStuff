package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.util.IIcon;

public class BlockClayPillar2 extends BlockClayPillar
{
    public BlockClayPillar2()
    {
        super();
        this.setCreativeTab(CreativeTab.TFS_TAB);
        this.names = new String[3];
        System.arraycopy(Reference.COLOURS, 3, names, 0, 3);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }
}
