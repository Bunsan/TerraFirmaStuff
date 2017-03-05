package com.technode.terrafirmastuff.item.itemBlock;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFCFluids;
import com.technode.terrafirmastuff.core.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class ItemOilLampMod4 extends ItemOilLampMod {
    public ItemOilLampMod4(Block b) {
        super(b);
        this.metaNames = new String[]{"Electrum", "Cupronickel", "Osmium", "Aluminum", "Tungsten"};
    }

    @Override
    public Metal getMetalType(ItemStack is) {
        int meta = is.getItemDamage();
        switch (meta) {
            case 0:
                return Global.ELECTRUM;
            case 1:
                return Global.CUPRONICKEL;
            case 2:
                return Global.OSMIUM;
            case 3:
                return Global.ALUMINUM;
            case 4:
                return Global.TUNGSTEN;

            default:
                return Global.UNKNOWN;
        }
    }

    public static ItemStack getFullLamp(int meta)
    {
        ItemStack is = new ItemStack(ModBlocks.oilLampMod4, 1, meta);
        FluidStack fs = new FluidStack(TFCFluids.OLIVEOIL, 250);
        is.setTagCompound(fs.writeToNBT(new NBTTagCompound()));
        return is;
    }
}
