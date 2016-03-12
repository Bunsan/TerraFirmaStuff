package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockClayRaw extends BlockClayDecor
{
    public BlockClayRaw(Material material)
    {
        super(Material.clay);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        icons = new IIcon[1];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
            icons[0] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "clay/"+"blockClayRaw");
    }
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < 1; i++)
            list.add(new ItemStack(this,1,i));
    }
}

