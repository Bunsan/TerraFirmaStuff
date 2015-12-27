package com.technode.terrafirmastuff.core.reference;

import com.technode.terrafirmastuff.core.TFSItems;
import com.technode.terrafirmastuff.items.ItemMetalDust;
import com.technode.terrafirmastuff.items.ItemMetalNugget;

public class ItemReferences extends TFSItems
{
    public static void itemReferences()
    {
        smallMetalChunk = new ItemMetalNugget().setUnlocalizedName("MetalNugget");
        metalDust = new ItemMetalDust().setUnlocalizedName("MetalDust");

        registerItems();
    }
}
