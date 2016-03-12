package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayChiseledHoriz extends ItemBlockBase
{
    public ItemBlockClayChiseledHoriz(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.COLOURS, 0, metaNames, 0, 8);
        System.arraycopy(Reference.COLOURS, 0, metaNames, 8, 8);
    }
}
