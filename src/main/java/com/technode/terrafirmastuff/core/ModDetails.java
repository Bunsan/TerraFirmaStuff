package com.technode.terrafirmastuff.core;

public class ModDetails
{
    public static final String ModID = "terrafirmastuff";
    public static final String ModName = "TerraFirmaStuff";

    public static final int VersionMajor = 0;
    public static final int VersionMinor = 1;
    public static final int VersionRevision = 2;

    public static final String ModVersion = VersionMajor + "." + VersionMinor + "." + VersionRevision;

    public static final String ModChannel = "terrafirmastuff";
    public static final String SERVER_PROXY_CLASS = "com.technode.terrafirmastuff.core.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.technode.terrafirmastuff.core.proxy.ClientProxy";
    public static final String GUI_FACTORY_CLASS = "com.technode.terrafirmastuff.client.gui.GuiFactory";

    public static final String AssetPath = "/assets/" + ModID + "/";
    public static final String AssetPathGui = "textures/gui/";

    public static final String ConfigFilePath = "/config/";
    public static final String ConfigFileName = "TerraFirmaStuff.cfg";

    public static final int GuiOffset = 10000;

    public static final String MODID_NEI = "NotEnoughItems";
    public static final String MODID_TFC = "terrafirmacraft";
    public static final String MODID_WAILA = "Waila";

    public static final String MODNAME_NEI = "Not Enough Items";
    public static final String MODNAME_TFC = "TerraFirmaCraft";
    public static final String MODNAME_WAILA = "Waila";
}
