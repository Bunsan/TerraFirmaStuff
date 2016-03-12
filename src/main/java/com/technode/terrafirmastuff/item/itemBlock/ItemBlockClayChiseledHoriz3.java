package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import com.technode.terrafirmastuff.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemBlockClayChiseledHoriz3 extends ItemBlockBase
{
    public ItemBlockClayChiseledHoriz3(Block b)
    {
        super(b);
        int size = Reference.COLOURS.length - 16;
        metaNames = new String[size * 2];
        System.arraycopy(Reference.COLOURS, 16, metaNames, 0, size);
        System.arraycopy(Reference.COLOURS, 16, metaNames, size, size);
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
