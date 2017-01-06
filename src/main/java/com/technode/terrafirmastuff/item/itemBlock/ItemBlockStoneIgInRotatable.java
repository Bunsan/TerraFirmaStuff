package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneIgInRotatable extends ItemBlockBase
{
    public ItemBlockStoneIgInRotatable(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.STONE_IGIN, 0, metaNames, 0, 3);
        System.arraycopy(Reference.STONE_IGIN, 0, metaNames, 4, 3);
        System.arraycopy(Reference.STONE_IGIN, 0, metaNames, 8, 3);
        System.arraycopy(Reference.STONE_IGIN, 0, metaNames, 12, 3);
    }
}