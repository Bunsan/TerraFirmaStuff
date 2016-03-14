package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayRotatable5 extends ItemBlockBase
{
    public ItemBlockClayRotatable5(Block b)
    {
        super(b);
        metaNames = new String[1];
        System.arraycopy(Reference.COLOURS, 16, metaNames, 0, 1);
    }
}