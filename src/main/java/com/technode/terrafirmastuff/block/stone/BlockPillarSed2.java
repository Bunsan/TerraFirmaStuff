package com.technode.terrafirmastuff.block.stone;

import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockPillarSed2 extends BlockPillarSed {

    public BlockPillarSed2()
    {
        super();
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[4];
        System.arraycopy(Reference.STONE_SED, 4, names, 0, 4);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }
}
