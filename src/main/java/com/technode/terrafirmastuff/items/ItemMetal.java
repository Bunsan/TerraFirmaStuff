package com.technode.terrafirmastuff.items;

import com.technode.terrafirmastuff.core.reference.Reference;

import com.bioxx.tfc.api.Constant.Global;

import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemMetal extends ItemTFS implements ISmeltable
{
    public short metalAmount;

    public ItemMetal()
    {
        super();
        setMaxDamage(0);
        setHasSubtypes(true);
        metalAmount = 10;
        metaNames = new String[] {
                "Bismuth", "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze", "Copper", "Gold",
                "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
                "Red Steel", "Rose Gold", "Silver", "Steel", "Sterling Silver", "Tin", "Zinc"};
        setFolder("metal/");
    }

    @Override
    public void addExtraInformation(ItemStack is, EntityPlayer player, List<String> arraylist)
    {
        if(getMetalType(is) != null)
        {
            if (Reference.showShiftInformation())
            {
                arraylist.add(Reference.translation("gui.units") + ": " + getMetalReturnAmount(is));
            }
            else
            {
                arraylist.add(Reference.translation("gui.ShowHelp"));
            }
        }
    }

    @Override
    public Metal getMetalType(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Global.BISMUTH;
            case 1: return Global.BISMUTHBRONZE;
            case 2: return Global.BLACKBRONZE;
            case 3: return Global.BLACKSTEEL;
            case 4: return Global.BLUESTEEL;
            case 5: return Global.BRASS;
            case 6: return Global.BRONZE;
            case 7: return Global.COPPER;
            case 8: return Global.GOLD;
            case 9: return Global.WROUGHTIRON;
            case 10: return Global.LEAD;
            case 11: return Global.NICKEL;
            case 12: return Global.PIGIRON;
            case 13: return Global.PLATINUM;
            case 14: return Global.REDSTEEL;
            case 15: return Global.ROSEGOLD;
            case 16: return Global.SILVER;
            case 17: return Global.STEEL;
            case 18: return Global.STERLINGSILVER;
            case 19: return Global.TIN;
            case 20: return Global.ZINC;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return metalAmount;
        }
        return 0;
    }

    @Override
    public boolean isSmeltable(ItemStack is)
    {
        switch(is.getItemDamage())
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            default:
                return false;
        }
    }

    @Override
    public ISmeltable.EnumTier getSmeltTier(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return ISmeltable.EnumTier.TierI;
        }
        return ISmeltable.EnumTier.TierX;
    }

}


