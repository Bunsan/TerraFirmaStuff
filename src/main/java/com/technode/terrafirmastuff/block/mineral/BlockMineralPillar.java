package com.technode.terrafirmastuff.block.mineral;

import com.technode.terrafirmastuff.block.BlockRotatableDecor;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockMineralPillar extends BlockRotatableDecor {

    public BlockMineralPillar()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        names = new String[Reference.MINERALS.length];
        System.arraycopy(Reference.MINERALS, 0, names, 0, Reference.MINERALS.length);
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
            sideIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "mineral/" + "block" + names[i] + "PillarSide");
            topIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "mineral/" + "block" + names[i] + "PillarTop");
            rotatedSideIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "mineral/" + "block" + names[i] + "PillarSideRotate");
        }
    }
}