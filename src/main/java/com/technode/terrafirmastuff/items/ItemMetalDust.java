package com.technode.terrafirmastuff.items;

import com.technode.terrafirmastuff.core.ModDetails;

import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMetalDust extends ItemMetal
{
    public ItemMetalDust()
    {
        super();
        this.setWeight(EnumWeight.MEDIUM);
        this.setSize(EnumSize.VERYSMALL);
        metalAmount = 100;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        if(metaNames != null && itemstack.getItemDamage() < metaNames.length)
            return getUnlocalizedName().concat("." + metaNames[itemstack.getItemDamage()]);
        return super.getUnlocalizedName(itemstack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registerer)
    {
        metaIcons = new IIcon[metaNames.length];
        for(int i = 0; i < metaNames.length; i++)
        {
            metaIcons[i] = registerer.registerIcon(ModDetails.ModID + ":" + textureFolder + metaNames[i] + " Dust");
        }
    }
}
