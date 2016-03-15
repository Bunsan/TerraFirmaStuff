package com.technode.terrafirmastuff.core.proxy;

import com.technode.terrafirmastuff.core.compat.NEIIntegration;
import cpw.mods.fml.common.Loader;

public class ClientProxy extends CommonProxy
{
    public void hideNEIItems() {if (Loader.isModLoaded("NotEnoughItems")) NEIIntegration.hideNEIItems();}
}
