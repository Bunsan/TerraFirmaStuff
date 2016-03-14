package com.technode.terrafirmastuff.core.reference;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.ModDetails;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs TFS_TAB = new CreativeTabs(ModDetails.ModID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.clayStainedPaver2);
        }
    };
}
