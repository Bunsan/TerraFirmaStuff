package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClay extends ItemBlockBase
{
    public ItemBlockClay(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.COLOURS, 0, metaNames, 0, 16);
    }

}
