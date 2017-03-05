package com.technode.terrafirmastuff.item.itemBlock;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFCFluids;
import com.technode.terrafirmastuff.core.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class ItemOilLampMod3 extends ItemOilLampMod {
    public ItemOilLampMod3(Block b) {
        super(b);
        this.metaNames = new String[]{"PigIron", "Steel", "Tin", "Zinc"};
    }

    @Override
    public Metal getMetalType(ItemStack is) {
        int meta = is.getItemDamage();
        switch (meta) {
            case 0:
                return Global.PIGIRON;
            case 1:
                return Global.STEEL;
            case 2:
                return Global.TIN;
            case 3:
                return Global.ZINC;

            default:
                return Global.UNKNOWN;
        }
    }

    public static ItemStack getFullLamp(int meta)
    {
        ItemStack is = new ItemStack(ModBlocks.oilLampMod3, 1, meta);
        FluidStack fs = new FluidStack(TFCFluids.OLIVEOIL, 250);
        is.setTagCompound(fs.writeToNBT(new NBTTagCompound()));
        return is;
    }
}