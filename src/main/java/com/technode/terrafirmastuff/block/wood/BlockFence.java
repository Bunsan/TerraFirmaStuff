package com.technode.terrafirmastuff.block.wood;

import com.bioxx.tfc.Blocks.Vanilla.BlockTFCFence;
import com.bioxx.tfc.Reference;
import com.bioxx.tfc.api.Constant.Global;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

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
}
