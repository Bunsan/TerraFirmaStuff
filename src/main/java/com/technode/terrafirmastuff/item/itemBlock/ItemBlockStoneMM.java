package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneMM extends ItemBlockBase
{
    public ItemBlockStoneMM(Block b)
    {
        super(b);
        metaNames = new String[Reference.STONE_MM.length];
        System.arraycopy(Reference.STONE_MM, 0, metaNames, 0, Reference.STONE_MM.length);
    }

}
