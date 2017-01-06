package com.technode.terrafirmastuff.block.stone;

import com.technode.terrafirmastuff.block.BlockDecor;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockTileIgIn extends BlockDecor {

    public BlockTileIgIn()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[Reference.STONE_IGIN.length];
        System.arraycopy(Reference.STONE_IGIN, 0, names, 0, Reference.STONE_IGIN.length);
        icons = new IIcon[names.length];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < names.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "stone/"+"block" + names[i] + "Tile");

    }
}