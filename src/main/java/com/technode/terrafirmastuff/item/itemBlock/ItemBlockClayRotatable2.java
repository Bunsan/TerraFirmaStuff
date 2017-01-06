package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayRotatable2 extends ItemBlockBase
{
    public ItemBlockClayRotatable2(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.COLOURS, 4, metaNames, 0, 4);
        System.arraycopy(Reference.COLOURS, 4, metaNames, 4, 4);
        System.arraycopy(Reference.COLOURS, 4, metaNames, 8, 4);
        System.arraycopy(Reference.COLOURS, 4, metaNames, 12, 4);
    }
}