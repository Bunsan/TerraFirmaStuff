package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayPillar2 extends ItemBlockClayPillar
{
    public ItemBlockClayPillar2(Block b)
    {
        super(b);
        metaNames = new String[3];
        System.arraycopy(Reference.COLOURS, 3, metaNames, 0, 3);
    }
}
