package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockClayChiseled extends ItemBlockBase
{
    public ItemBlockClayChiseled(Block b)
    {
        super(b);
        metaNames = new String[Reference.COLOURS.length];
        System.arraycopy(Reference.COLOURS, 0, metaNames, 0, Reference.COLOURS.length);
    }
}
