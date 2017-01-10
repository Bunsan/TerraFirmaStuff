package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockMineralRotatable extends ItemBlockBase
{
    public ItemBlockMineralRotatable(Block b)
    {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.MINERALS, 0, metaNames, 0, 3);
        System.arraycopy(Reference.MINERALS, 0, metaNames, 4, 3);
        System.arraycopy(Reference.MINERALS, 0, metaNames, 8, 3);
        System.arraycopy(Reference.MINERALS, 0, metaNames, 12, 3);
    }
}