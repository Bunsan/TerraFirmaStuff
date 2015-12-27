package com.technode.terrafirmastuff.core.reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

import org.lwjgl.input.Keyboard;

import net.minecraft.util.StatCollector;

public class Reference {

    public static String translation(String s)
    {
        return StatCollector.translateToLocal(s);
    }

    public static boolean showShiftInformation()
    {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
    }

    public static boolean showCtrlInformation()
    {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && Keyboard.isKeyDown(Keyboard.KEY_LCONTROL);
    }
}
