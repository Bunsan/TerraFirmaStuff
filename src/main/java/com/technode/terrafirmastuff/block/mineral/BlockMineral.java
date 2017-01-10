package com.technode.terrafirmastuff.block.mineral;

import com.technode.terrafirmastuff.block.BlockDecor;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockMineral extends BlockDecor {

    public BlockMineral()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[Reference.MINERALS.length];
        System.arraycopy(Reference.MINERALS, 0, names, 0, Reference.MINERALS.length);
        icons = new IIcon[names.length];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < names.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "mineral/" + "block" + names[i]);

    }
}