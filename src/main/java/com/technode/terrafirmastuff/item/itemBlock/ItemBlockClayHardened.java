package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayHardened extends ItemBlockBase
{
    public ItemBlockClayHardened(Block b)
    {
        super(b);
        metaNames = Reference.CLAY_STYLES;
    }
}
