package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneIgIn extends ItemBlockBase
{
    public ItemBlockStoneIgIn(Block b)
    {
        super(b);
        metaNames = new String[Reference.STONE_IGIN.length];
        System.arraycopy(Reference.STONE_IGIN, 0, metaNames, 0, Reference.STONE_IGIN.length);
    }

}
