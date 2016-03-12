package com.technode.terrafirmastuff.block;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.TFCOptions;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public abstract class BlockBase extends Block
{
    protected BlockBase()
    {
        super(Material.rock);
    }

    protected BlockBase(Material material)
    {
        super(material);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack is)
    {
        if(TFCOptions.enableDebugMode && world.isRemote)
        {
            int metadata = world.getBlockMetadata(x, y, z);
            LogHelper.info("Meta=" + (new StringBuilder()).append(getUnlocalizedName()).append(":").append(metadata).toString());
        }
    }

    @Override
    public boolean canBeReplacedByLeaves(IBlockAccess world, int x, int y, int z)
    {
        return false;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int side, float hitX, float hitY, float hitZ)
    {
        if(TFCOptions.enableDebugMode && world.isRemote)
        {
            int metadata = world.getBlockMetadata(x, y, z);
            LogHelper.info("Meta = " + (new StringBuilder()).append(getUnlocalizedName()).append(":").append(metadata).toString());
        }
        return false;
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
        onBlockPlacedBy(world, x, y, z, entityliving, null);
    }

    @Override
    public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int meta)
    {
        super.harvestBlock(world, player, x, y, z, meta);
        TFC_Core.addPlayerExhaustion(player, 0.001f);
    }
}