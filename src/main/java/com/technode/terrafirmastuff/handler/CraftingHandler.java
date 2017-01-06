package com.technode.terrafirmastuff.handler;



import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Items.Pottery.ItemPotteryBase;
import com.bioxx.tfc.api.TFCItems;
import com.technode.terrafirmastuff.item.ItemClayBrick;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class CraftingHandler
{
        @SubscribeEvent
        public void onCrafting (PlayerEvent.ItemCraftedEvent e)
        //(EntityPlayer player, ItemStack itemstack, IInventory iinventory)
        {
            EntityPlayer player = e.player;
            ItemStack itemstack = e.crafting;
            Item item = itemstack.getItem();
            int itemDamage = itemstack.getItemDamage();
            IInventory iinventory = e.craftMatrix;

            if (iinventory != null) {

                if(!player.worldObj.isRemote && item instanceof ItemClayBrick)
                {
                    for (int i = 0; i < iinventory.getSizeInventory(); i++)
                    {
                        ItemStack is = iinventory.getStackInSlot(i);
                        if (is == null)
                            continue;
                        else if (is.getItem() instanceof ItemPotteryBase)
                        {
                            TFC_Core.giveItemToPlayer(new ItemStack(TFCItems.ceramicMold, 1, 1), player);
                            break;
                        }
                    }
                }
            }
        }

    public static void handleItem(EntityPlayer entityplayer, IInventory iinventory, List<ItemStack> items)
    {
        for (int i = 0; i < iinventory.getSizeInventory(); i++ )
        {
            if (iinventory.getStackInSlot(i) == null)
                continue;
            for (ItemStack is : items)
                damageItem(entityplayer, iinventory, i, is.getItem());
        }
    }

    public static void damageItem(EntityPlayer entityplayer, IInventory iinventory, int i, Item shiftedindex)
    {
        if(iinventory.getStackInSlot(i).getItem() == shiftedindex)
        {
            int index = i;
            ItemStack item = iinventory.getStackInSlot(index).copy();
            if(item != null)
            {
                item.damageItem(1 , entityplayer);
                if (item.getItemDamage() != 0 || entityplayer.capabilities.isCreativeMode)
                {
                    iinventory.setInventorySlotContents(index, item);
                    iinventory.getStackInSlot(index).stackSize = iinventory.getStackInSlot(index).stackSize + 1;
                    if(iinventory.getStackInSlot(index).stackSize > 2)
                        iinventory.getStackInSlot(index).stackSize = 2;
                }
            }
        }
    }
}