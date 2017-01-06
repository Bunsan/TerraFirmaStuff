package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockStoneSed extends ItemBlockBase
{
    public ItemBlockStoneSed(Block b)
    {
        super(b);
        metaNames = new String[Reference.STONE_SED.length];
        System.arraycopy(Reference.STONE_SED, 0, metaNames, 0, Reference.STONE_SED.length);
    }

}