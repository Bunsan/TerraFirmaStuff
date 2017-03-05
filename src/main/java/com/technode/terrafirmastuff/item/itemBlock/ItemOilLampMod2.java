package com.technode.terrafirmastuff.item.itemBlock;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFCFluids;
import com.technode.terrafirmastuff.core.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class ItemOilLampMod2 extends ItemOilLampMod {

    public ItemOilLampMod2(Block b) {
        super(b);
        this.metaNames = new String[]{"Bismuth", "Copper", "WroughtIron", "Lead", "Nickel", "Unknown"};
    }

    @Override
    public Metal getMetalType(ItemStack is) {
        int meta = is.getItemDamage();
        switch (meta) {
            case 0:
                return Global.BISMUTH;
            case 1:
                return Global.COPPER;
            case 2:
                return Global.WROUGHTIRON;
            case 3:
                return Global.LEAD;
            case 4:
                return Global.NICKEL;
            case 5:
                return Global.UNKNOWN;

            default:
                return Global.UNKNOWN;
        }
    }

    public static ItemStack getFullLamp(int meta)
    {
        ItemStack is = new ItemStack(ModBlocks.oilLampMod2, 1, meta);
        FluidStack fs = new FluidStack(TFCFluids.OLIVEOIL, 250);
        is.setTagCompound(fs.writeToNBT(new NBTTagCompound()));
        return is;
    }

}
