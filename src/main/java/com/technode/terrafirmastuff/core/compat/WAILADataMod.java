package com.technode.terrafirmastuff.core.compat;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.TFCFluids;
import com.bioxx.tfc.api.TFCOptions;
import com.bioxx.tfc.api.Util.Helper;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.tileentity.TEOilLampMod;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;

public class WAILADataMod implements IWailaDataProvider {

    @Override
    public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {
        TileEntity tileEntity = accessor.getTileEntity();
        if (tileEntity instanceof TEOilLampMod) {
        return oilLampStack(accessor, config); }
        else
            return null;
    }

    @Override
    public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
    {
        TileEntity tileEntity = accessor.getTileEntity();

        if (tileEntity instanceof TEOilLampMod)
            currenttip = oilLampBody(itemStack, currenttip, accessor, config);
        return currenttip;
    }
    @Override
    public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        Block block = accessor.getBlock();
        TileEntity tileEntity = accessor.getTileEntity();

        if (tileEntity instanceof TEOilLampMod)
            currenttip = oilLampBody(itemStack, currenttip, accessor, config);
        return currenttip;
    }

    @Override
    public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
    {
        return currenttip;
    }

    @Override
    public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te, NBTTagCompound tag, World world, int x, int y, int z)
    {
        if (te != null)
            te.writeToNBT(tag);
        return tag;
    }

    public static void onCallbackRegister(IWailaRegistrar reg)
    {
        reg.registerStackProvider(new WAILADataMod(), TEOilLampMod.class);
        reg.registerBodyProvider(new WAILADataMod(), TEOilLampMod.class);
        reg.registerNBTProvider(new WAILADataMod(), TEOilLampMod.class);
    }

    public ItemStack oilLampStack(IWailaDataAccessor accessor, IWailaConfigHandler config)
    {
        int meta = accessor.getMetadata();
        ItemStack itemstack = null;

        if (accessor.getBlock() == ModBlocks.oilLampMod)
        {
            if ((meta & 8) != 0)
                meta -= 8;
            itemstack = new ItemStack(ModBlocks.oilLampMod, 1, meta);
            return itemstack;
        }
        else if (accessor.getBlock() == ModBlocks.oilLampMod2)
        {
            if ((meta & 8) != 0)
                meta -= 8;
            itemstack = new ItemStack(ModBlocks.oilLampMod2, 1, meta);
            return itemstack;
        }
        else if (accessor.getBlock() == ModBlocks.oilLampMod3)
        {
            if ((meta & 8) != 0)
                meta -= 8;
            itemstack = new ItemStack(ModBlocks.oilLampMod3, 1, meta);
            return itemstack;
        }
        return null;
    }

    public List<String> oilLampBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config)
    {
        NBTTagCompound tag = accessor.getNBTData();
        if (tag.hasKey("Fuel"))
        {
            FluidStack fuel = FluidStack.loadFluidStackFromNBT(tag.getCompoundTag("Fuel"));
            int hours = fuel.amount * TFCOptions.oilLampFuelMult / 8;
            if (fuel.getFluid() == TFCFluids.OLIVEOIL)
                currenttip.add(hours + " " + TFC_Core.translate("gui.hoursRemaining") + " (" + Helper.roundNumber((hours / (250f * TFCOptions.oilLampFuelMult)) * 100f, 10) + "%)");
            else if (fuel.getFluid() == TFCFluids.LAVA)
                currenttip.add(TFC_Core.translate("gui.infinite") + " " + TFC_Core.translate("gui.hoursRemaining"));
        }
        return currenttip;
    }

}
