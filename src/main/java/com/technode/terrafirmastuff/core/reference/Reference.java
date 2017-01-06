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

    // Common references for meta names, etc.

    public static final String[] COLOURS = {
            "White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple",
            "Blue", "Brown", "Green", "Red", "Black", "Base"
    };

    public static final String[] CLAY_STYLES = {
            "Baked", "Paver", "Circle", "Brick", "Tile", "Pillar", "Chiseled"
    };

    public static final String[] MINERALS = {
            "Jet", "Serpentine", "Quartz"
    };

    /* Stone Types */
    public static final String[] STONE_IGIN = {"Granite", "Diorite", "Gabbro"};
    public static final String[] STONE_SED  = {"Shale", "Claystone", "RockSalt", "Limestone", "Conglomerate", "Dolomite", "Chert", "Chalk"};
    public static final String[] STONE_IGEX = {"Rhyolite", "Basalt", "Andesite", "Dacite"};
    public static final String[] STONE_MM   = {"Quartzite", "Slate", "Phyllite", "Schist", "Gneiss", "Marble"};
}
