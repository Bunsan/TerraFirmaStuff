package com.technode.terrafirmastuff.block.wood;

import com.bioxx.tfc.Blocks.Vanilla.BlockTFCFence;
import com.bioxx.tfc.Reference;
import com.bioxx.tfc.api.Constant.Global;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockFence extends BlockTFCFence {

    public BlockFence(String str, Material mat) {
            super(str, mat);
            woodNames = new String[16];
            System.arraycopy(Global.WOOD_ALL, 0, woodNames, 0, 16);
            iconsPost = new IIcon[woodNames.length];
            iconsPostTop = new IIcon[woodNames.length];
            this.setCreativeTab(CreativeTab.TFS_TAB);
        }
        @Override
        public void registerBlockIcons(IIconRegister iconRegisterer)
        {
            for(int i = 0; i < woodNames.length; i++)
            {
                iconsPost[i] = iconRegisterer.registerIcon(Reference.MOD_ID + ":" + "wood/" + woodNames[i] + " Plank");
                iconsPostTop[i] = iconRegisterer.registerIcon(Reference.MOD_ID + ":" + "wood/" + woodNames[i] + " Plank");
            }
        }

        /**
         * Returns true if the specified block can be connected by a fence
         */

        @Override
        public boolean canConnectFenceTo(IBlockAccess bAccess, int x, int y, int z)
        {
            Block block = bAccess.getBlock(x, y, z);

        if (ModBlocks.canFenceConnectTo(block))
            return true;
        else
            return block != this && block.getMaterial().isOpaque() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false;
        }
}
