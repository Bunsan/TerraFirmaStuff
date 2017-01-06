package com.technode.terrafirmastuff.block.stone;

import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockPillarMM2 extends BlockPillarMM {

    public BlockPillarMM2()
    {
        super();
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[2];
        System.arraycopy(Reference.STONE_MM, 4, names, 0, 2);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }
}
