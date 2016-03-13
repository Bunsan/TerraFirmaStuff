package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockClayPillar4 extends ItemBlockClayPillar {
    public ItemBlockClayPillar4(Block b) {
        super(b);
        metaNames = new String[4];
        System.arraycopy(Reference.COLOURS, 12, metaNames, 0, 4);
    }
}