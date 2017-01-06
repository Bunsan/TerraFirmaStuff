package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayRotatable extends ItemBlockBase
{
    public ItemBlockClayRotatable(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.COLOURS, 0, metaNames, 0, 4);
        System.arraycopy(Reference.COLOURS, 0, metaNames, 4, 4);
        System.arraycopy(Reference.COLOURS, 0, metaNames, 8, 4);
        System.arraycopy(Reference.COLOURS, 0, metaNames, 12, 4);
    }
}
