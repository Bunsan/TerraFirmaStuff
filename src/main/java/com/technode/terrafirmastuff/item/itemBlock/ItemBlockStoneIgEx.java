package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneIgEx extends ItemBlockBase
{
    public ItemBlockStoneIgEx(Block b)
    {
        super(b);
        metaNames = new String[Reference.STONE_IGEX.length];
        System.arraycopy(Reference.STONE_IGEX, 0, metaNames, 0, Reference.STONE_IGEX.length);
    }

}