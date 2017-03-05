package com.technode.terrafirmastuff.core;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRaw;
import com.bioxx.tfc.api.HeatRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemHeat
{
    public static void setupItemHeat() {
        HeatRegistry manager = HeatRegistry.getInstance();

        final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

        HeatRaw bismuthRaw = new HeatRaw(0.14, 270);
        HeatRaw bismuthBronzeRaw = new HeatRaw(0.35, 985);
        HeatRaw blackBronzeRaw = new HeatRaw(0.35, 1070);
        HeatRaw blackSteelRaw = new HeatRaw(0.35, 1485);
        HeatRaw blueSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw brassRaw = new HeatRaw(0.35, 930);
        HeatRaw bronzeRaw = new HeatRaw(0.35, 950);
        HeatRaw copperRaw = new HeatRaw(0.35, 1080);
        HeatRaw goldRaw = new HeatRaw(0.6, 1060);
        HeatRaw ironRaw = new HeatRaw(0.35, 1535);
        HeatRaw leadRaw = new HeatRaw(0.22, 328);
        HeatRaw nickelRaw = new HeatRaw(0.48, 1453);
        HeatRaw pigIronRaw = new HeatRaw(0.35, 1500);
        HeatRaw platinumRaw = new HeatRaw(0.35, 1730);
        HeatRaw redSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw roseGoldRaw = new HeatRaw(0.35, 960);
        HeatRaw silverRaw = new HeatRaw(0.48, 961);
        HeatRaw steelRaw = new HeatRaw(0.35, 1540);//sh = 0.63F; boil = 3500; melt = 1540;
        HeatRaw sterlingSilverRaw = new HeatRaw(0.35, 900);//sh = 0.72F; boil = 2212; melt = 893;
        HeatRaw tinRaw = new HeatRaw(0.14, 230);
        HeatRaw zincRaw = new HeatRaw(0.21, 420);//sh = 0.66F; boil = 907; melt = 420;
        HeatRaw osmiumRaw = new HeatRaw(0.35, 2200); //actual is 3027
        HeatRaw aluminumRaw = new HeatRaw(0.35, 980);
        HeatRaw tungstenRaw = new HeatRaw(0.35, 2200); //actual is 3422
        HeatRaw electrumRaw = new HeatRaw(0.55, 1060);
        HeatRaw cupronickelRaw = new HeatRaw(0.48, 1453);

        for(int i = 0; i < 16; i++) {
            ItemStack input = new ItemStack((ModBlocks.clayRawColor), 1, i);
            ItemStack output = new ItemStack((ModBlocks.clayStained), 1, i);

            manager.addIndex(new HeatIndex(input, 1, 600, output).setMinMax(output.getItemDamage()));
        }
        for(int i = 0; i < 17; i++)
        {
            ItemStack input2 = new ItemStack((ModItems.clayRawBrick), 1, i);
            ItemStack output2 = new ItemStack((ModItems.clayBrick), 1, i);

            manager.addIndex(new HeatIndex(input2, 1, 150, output2).setMinMax(output2.getItemDamage()));
        }

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.clayRaw, 1, 0), 1, 600, new ItemStack(ModBlocks.clayStained2, 1)));

        //Lamp->Unshaped
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod, 1, 0), bismuthBronzeRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod, 1, 1), blackBronzeRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod, 1, 2), blackSteelRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod, 1, 3), brassRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod, 1, 4), bronzeRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod, 1, 5), redSteelRaw, null));

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod2, 1, 0), bismuthRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod2, 1, 1), copperRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod2, 1, 2), ironRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod2, 1, 3), leadRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod2, 1, 4), nickelRaw, null));

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod3, 1, 0), pigIronRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod3, 1, 1), steelRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod3, 1, 2), tinRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod3, 1, 3), zincRaw, null));


        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod4, 1, 0), electrumRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod4, 1, 1), cupronickelRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod4, 1, 2), osmiumRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod4, 1, 3), aluminumRaw, null));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.oilLampMod4, 1, 4), tungstenRaw, null));
    }
}
