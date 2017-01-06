package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockClay2 extends BlockClay
{
    public BlockClay2()
    {
        super();
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[Reference.COLOURS.length-16];
        System.arraycopy(Reference.COLOURS, 16, names, 0, Reference.COLOURS.length-16);
        icons = new IIcon[names.length];
    }
}
