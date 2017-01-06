package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayRotatable5 extends ItemBlockBase
{
    public ItemBlockClayRotatable5(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.COLOURS, 16, metaNames, 0, 1);
        System.arraycopy(Reference.COLOURS, 16, metaNames, 4, 1);
        System.arraycopy(Reference.COLOURS, 16, metaNames, 8, 1);
        System.arraycopy(Reference.COLOURS, 16, metaNames, 12, 1);
    }
}