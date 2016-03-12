package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockClayChiseledVert extends BlockClayDecor {

    public BlockClayChiseledVert()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        this.names = new String[16];
        System.arraycopy(Reference.COLOURS, 0, names, 0, 16);
        this.sideIcons = new IIcon[names.length];
        this.topIcons = new IIcon[names.length];
        this.rotatedSideIcons = new IIcon[names.length];
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if (side == 0 || side == 1)
            return topIcons[meta];
        return sideIcons[meta];
    }

    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
        for(int i = 0; i < names.length; i++)
        {
            sideIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "clay/" + "blockHardenedClayChiseledSide" + names[i]);
            topIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "clay/" + "blockHardenedClayChiseledTop" + names[i]);
            rotatedSideIcons[i] = reg.registerIcon(ModDetails.ModID + ":" + "clay/" + "blockHardenedClayChiseledSideRotate" + names[i]);
        }
    }
}
