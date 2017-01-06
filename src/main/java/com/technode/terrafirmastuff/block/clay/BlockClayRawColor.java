package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.block.BlockDecor;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockClayRawColor extends BlockDecor
{
    public BlockClayRawColor()
    {
        super(Material.clay);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[16];
        System.arraycopy(Reference.COLOURS, 0, names, 0, 16);
        icons = new IIcon[names.length];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < names.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "clay/"+"blockClayRaw"+names[i]);    }
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < 16; i++)
            list.add(new ItemStack(this,1,i));
    }
}