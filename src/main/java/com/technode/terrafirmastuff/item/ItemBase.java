package com.technode.terrafirmastuff.item;

import com.bioxx.tfc.Items.ItemTerra;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import net.minecraft.client.renderer.texture.IIconRegister;
;
import net.minecraft.util.IIcon;

public class ItemBase extends ItemTerra {
    private IIcon[] icons;

    public ItemBase() {
        super();
        setCreativeTab(CreativeTab.TFS_TAB);
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        if(this.metaNames == null)
        {
            if(this.iconString != null)
                this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + this.textureFolder + this.getIconString());
            else
                this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + this.textureFolder + this.getUnlocalizedName().replace("item.", ""));
        }
        else
        {
            metaIcons = new IIcon[metaNames.length];
            for(int i = 0; i < metaNames.length; i++)
            {
                metaIcons[i] = registerer.registerIcon(ModDetails.ModID + ":" + this.textureFolder + metaNames[i]);
            }

            //This will prevent NullPointerException errors with other mods like NEI
            this.itemIcon = metaIcons[0];
        }
    }
}