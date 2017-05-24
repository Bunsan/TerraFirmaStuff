package com.technode.terrafirmastuff.handler;

import com.technode.terrafirmastuff.core.Recipes;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.world.World;

public class ServerTickHandler
{
    @SubscribeEvent
    public void onServerWorldTick(TickEvent.WorldTickEvent event)
    {
        World world = event.world;

        if (event.phase == TickEvent.Phase.START)
        {
            if (world.provider.dimensionId == 0 && !Recipes.areAnvilRecipesRegistered())
            {
                Recipes.registerAnvilRecipes(world);
            }
        }
    }
}

