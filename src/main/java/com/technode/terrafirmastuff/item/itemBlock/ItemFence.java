package com.technode.terrafirmastuff.item.itemBlock;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.bioxx.tfc.api.Constant.Global;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ItemFence extends ItemTerraBlock
{
    public ItemFence(Block par1)
    {
        super(par1);
        metaNames = new String[16];
        System.arraycopy(Global.WOOD_ALL, 0, metaNames, 0, 16);
    }

    @Override
    public void registerIcons(IIconRegister registerer) {}
}