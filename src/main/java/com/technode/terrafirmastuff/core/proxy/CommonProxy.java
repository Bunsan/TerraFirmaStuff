package com.technode.terrafirmastuff.core.proxy;

import com.bioxx.tfc.api.Tools.ChiselManager;
import com.technode.terrafirmastuff.handler.ServerTickHandler;
import com.technode.terrafirmastuff.tileentity.TEOilLampMod;
import com.technode.terrafirmastuff.tools.ChiselMode_Chiseled;
import com.technode.terrafirmastuff.tools.ChiselMode_Circle;
import com.technode.terrafirmastuff.tools.ChiselMode_Paver;
import com.technode.terrafirmastuff.tools.ChiselMode_Pillar;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy
{
    public void registerChiselModes()
    {
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Paver("Paver"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Circle("Circle"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Chiseled("Chiseled"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Pillar("Pillar"));

    }
    public void hideNEIItems() {}

    public void registerRenderInformation()
    {
        // NOOP on server
    }

    public void registerWailaClasses()
    {
        FMLInterModComms.sendMessage("Waila", "register", "com.technode.terrafirmastuff.core.compat.WAILADataMod.onCallbackRegister");// Block
    }

    public void registerTileEntities(boolean b)
    {
        GameRegistry.registerTileEntity(TEOilLampMod.class, "Oil Lamp Mod");

    }

    public void registerTickHandler()
    {
        FMLCommonHandler.instance().bus().register(new ServerTickHandler());
    }

}
