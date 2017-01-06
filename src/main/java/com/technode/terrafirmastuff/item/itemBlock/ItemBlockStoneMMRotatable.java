package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneMMRotatable extends ItemBlockBase
{
    public ItemBlockStoneMMRotatable(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.STONE_MM, 0, metaNames, 0, 4);
        System.arraycopy(Reference.STONE_MM, 0, metaNames, 4, 4);
        System.arraycopy(Reference.STONE_MM, 0, metaNames, 8, 4);
        System.arraycopy(Reference.STONE_MM, 0, metaNames, 12, 4);
    }
}