package com.technode.terrafirmastuff.item.itemBlock;


import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemBlockClayRaw extends ItemBlockBase
{
    public ItemBlockClayRaw(Block b)
    {
        super(b);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void addInformation(ItemStack is, EntityPlayer player, List arraylist, boolean flag)
    {
        super.addInformation(is, player, arraylist, flag);
            arraylist.add(EnumChatFormatting.DARK_GRAY + "Raw Clay");
    }
}
