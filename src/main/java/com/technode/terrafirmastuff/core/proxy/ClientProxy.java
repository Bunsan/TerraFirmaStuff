package com.technode.terrafirmastuff.core.proxy;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.compat.NEIIntegration;
import com.technode.terrafirmastuff.render.ModRendererStickBundle;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
    public void hideNEIItems() {if (Loader.isModLoaded("NotEnoughItems")) NEIIntegration.hideNEIItems();}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerRenderInformation() {
    		RenderingRegistry.registerBlockHandler(ModBlocks.stickBundleID = RenderingRegistry.getNextAvailableRenderId(), new ModRendererStickBundle());
    }
}
