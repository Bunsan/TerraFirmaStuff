package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockClayPillar extends ItemBlockBase
{
    public ItemBlockClayPillar(Block b)
    {
        super(b);
        metaNames = new String[4];
        System.arraycopy(Reference.COLOURS, 0, metaNames, 0, 4);
    }
}
