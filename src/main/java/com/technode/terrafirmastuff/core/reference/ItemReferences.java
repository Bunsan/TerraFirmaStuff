package com.technode.terrafirmastuff.core.reference;

import com.technode.terrafirmastuff.core.ModItems;
import com.technode.terrafirmastuff.core.utility.LogHelper;

public class ItemReferences extends ModItems
{
    public static void itemReferences()
    {
        registerItems();

        LogHelper.info("Finished Loading Items");
    }
}
