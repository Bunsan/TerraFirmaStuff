package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneMMRotatable2 extends ItemBlockBase
{
    public ItemBlockStoneMMRotatable2(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.STONE_MM, 4, metaNames, 0, 2);
        System.arraycopy(Reference.STONE_MM, 4, metaNames, 4, 2);
        System.arraycopy(Reference.STONE_MM, 4, metaNames, 8, 2);
        System.arraycopy(Reference.STONE_MM, 4, metaNames, 12, 2);
    }
}