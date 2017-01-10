package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemBlockMineral extends ItemBlockBase
{
    public ItemBlockMineral(Block b)
    {
        super(b);
        metaNames = new String[Reference.MINERALS.length];
        System.arraycopy(Reference.MINERALS, 0, metaNames, 0, Reference.MINERALS.length);
    }

}