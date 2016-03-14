package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;


public class ItemBlockClayRotatable3 extends ItemBlockBase
{
    public ItemBlockClayRotatable3(Block b)
    {
        super(b);
        metaNames = new String[4];
        System.arraycopy(Reference.COLOURS, 8, metaNames, 0, 4);
    }
}
