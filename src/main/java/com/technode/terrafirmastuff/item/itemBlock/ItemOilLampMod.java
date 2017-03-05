package com.technode.terrafirmastuff.item.itemBlock;

import com.bioxx.tfc.Items.ItemBlocks.ItemOilLamp;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFCFluids;
import com.technode.terrafirmastuff.core.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

public class ItemOilLampMod extends ItemOilLamp {
    public ItemOilLampMod(Block b)
    {
        super(b);
        this.metaNames = new String[]{ "BismuthBronze", "BlackBronze", "BlackSteel", "Brass", "Bronze", "RedSteel" };
    }

    @Override
    public Metal getMetalType(ItemStack is)
    {
        int meta = is.getItemDamage();
        switch(meta)
        {
            case 0: return Global.BISMUTHBRONZE;
            case 1: return Global.BLACKBRONZE;
            case 2: return Global.BLACKSTEEL;
            case 3: return Global.BRASS;
            case 4: return Global.BRONZE;
            case 5: return Global.REDSTEEL;

            default : return Global.UNKNOWN;
        }
    }

    public static ItemStack getFullLamp(int meta)
    {
        ItemStack is = new ItemStack(ModBlocks.oilLampMod, 1, meta);
        FluidStack fs = new FluidStack(TFCFluids.OLIVEOIL, 250);
        is.setTagCompound(fs.writeToNBT(new NBTTagCompound()));
        return is;
    }
}
