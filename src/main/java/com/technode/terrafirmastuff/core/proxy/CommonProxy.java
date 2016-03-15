package com.technode.terrafirmastuff.core.proxy;

import com.bioxx.tfc.api.Tools.ChiselManager;
import com.technode.terrafirmastuff.tools.*;

public abstract class CommonProxy
{
    public void registerChiselModes()
    {
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Paver("Paver"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Circle("Circle"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Brick("Brick"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Tile("Tile"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Chiseled("Chiseled"));
        ChiselManager.getInstance().addChiselMode(new ChiselMode_Pillar("Pillar"));

    }
    public void hideNEIItems() {}
}
