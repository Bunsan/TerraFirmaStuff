package com.technode.terrafirmastuff.block.clay;

import com.bioxx.tfc.api.TFCBlocks;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockClayPillar extends BlockClayRotatableDecor {

    public BlockClayPillar()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        this.names = new String[4];
        System.arraycopy(Reference.COLOURS, 0, names, 0, 4);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }

    @SideOnly(Side.CLIENT)
    @Override
    protected IIcon getSideIcon(int meta)
    {
        if ((meta & 12) == 0) {
            return this.sideIcons[meta];
        } else if ((meta & 12) == 8) {
            return this.sideIcons[meta];
        }
        return this.rotatedSideIcons[meta];
    }

    @SideOnly(Side.CLIENT)
    @Override
    protected IIcon getTopIcon(int meta)
    {
        return this.topIcons[meta];
    }

    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
        for(int i = 0; i < names.length; i++)
        {
            sideIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "clay/" + "blockHardenedClayPillarSide" + names[i]);
            topIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "clay/" + "blockHardenedClayPillarTop" + names[i]);
            rotatedSideIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "clay/" + "blockHardenedClayPillarSideRotate" + names[i]);
        }
    }
}
