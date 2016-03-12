package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockClayPaver extends BlockClayDecor {

    public BlockClayPaver(Material material)
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[16];
        System.arraycopy(Reference.COLOURS, 0, names, 0, 16);
        icons = new IIcon[names.length];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < names.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "clay/"+"blockHardenedClayPaver"+names[i]);

    }
}
