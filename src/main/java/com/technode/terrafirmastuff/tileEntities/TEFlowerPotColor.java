package com.technode.terrafirmastuff.tileEntities;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TEFlowerPotColor extends TileEntity
{
    private Item flowerPotItem;
    private int flowerPotData;
    public int type;

    public TEFlowerPotColor() {}

    public TEFlowerPotColor(int dye, Item item, int meta)
    {
        this.type = dye;
        this.flowerPotItem = item;
        this.flowerPotData = meta;
    }

    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        nbt.setInteger("Item", Item.getIdFromItem(this.flowerPotItem));
        nbt.setInteger("Data", this.flowerPotData);
        nbt.setInteger("Color", this.type);
    }

    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.flowerPotItem = Item.getItemById(nbt.getInteger("Item"));
        this.flowerPotData = nbt.getInteger("Data");
        this.type =nbt.getInteger("Color");
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setInteger("Color", type);
        this.writeToNBT(nbt);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 5, nbt);
    }

    public void func_145964_a(Item item, int meta)
    {
        this.flowerPotItem = item;
        this.flowerPotData = meta;
    }

    public Item getFlowerPotItem()
    {
        return this.flowerPotItem;
    }

    public int getFlowerPotData()
    {
        return this.flowerPotData;
    }
}