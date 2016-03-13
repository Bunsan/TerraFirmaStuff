package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemBlockClayChiseled2 extends ItemBlockClayChiseled
{
    public ItemBlockClayChiseled2(Block b)
    {
        super(b);
        metaNames = new String[Reference.COLOURS.length-16];
        System.arraycopy(Reference.COLOURS, 16, metaNames, 0, Reference.COLOURS.length-16);
    }

    @Override
    public String getUnlocalizedName(ItemStack is)
    {
        try
        {
            int meta = is.getItemDamage();
            if(meta > 15) meta -= 16;
            if(metaNames != null && meta < metaNames.length)
                return getUnlocalizedName().concat("." + metaNames[meta]);
        }
        catch(Exception ex)
        {
            LogHelper.error(ex.getLocalizedMessage());
        }
        return "Unknown";
    }
}