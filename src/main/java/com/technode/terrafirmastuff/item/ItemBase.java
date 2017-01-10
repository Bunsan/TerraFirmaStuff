package com.technode.terrafirmastuff.item;

import com.bioxx.tfc.Items.ItemTerra;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemBase extends ItemTerra {
    private IIcon[] icons;

    public ItemBase() {
        super();
        this.hasSubtypes = true;
        this.setMaxDamage(0);
        setCreativeTab(CreativeTab.TFS_TAB);
        this.metaNames = Reference.POWDER;
        this.icons = new IIcon[metaNames.length];
    }

    @Override
    public IIcon getIconFromDamage(int meta) {
        return icons[meta];
    }

    @Override
    public void registerIcons(IIconRegister registerer) {
        for (int i = 0; i < metaNames.length; i++) {
            icons[i] = registerer.registerIcon(ModDetails.ModID + ":" + metaNames[i]);
        }
    }

    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List list) {
        for (int i = 0; i < metaNames.length; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }
}