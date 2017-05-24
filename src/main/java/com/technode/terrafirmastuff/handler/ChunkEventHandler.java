package com.technode.terrafirmastuff.handler;

import com.technode.terrafirmastuff.core.Recipes;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.WorldEvent;

import static com.bioxx.tfc.api.Crafting.AnvilManager.world;

public class ChunkEventHandler
{
    @SubscribeEvent
    public void onLoadWorld(WorldEvent.Load event) {
        if (!event.world.isRemote && event.world.provider.dimensionId == 0 && !Recipes.areAnvilRecipesRegistered())
        {
            Recipes.registerAnvilRecipes(world);
        }
    }
}