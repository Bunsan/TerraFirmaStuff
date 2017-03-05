package com.technode.terrafirmastuff.block.metal;

import com.bioxx.tfc.Core.TFC_Textures;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.item.itemBlock.ItemOilLampMod3;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockOilLampMod3 extends BlockOilLampMod {
    private IIcon[] icons;

    public BlockOilLampMod3() {
        super();
        this.setTickRandomly(true);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < 4; i++)
        {
            list.add(ItemOilLampMod3.getFullLamp(i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        int m = meta & 7;
        if (side == 0 || side == 1) {
            if (m == 0)
                return TFC_Textures.sheetPigIron;
            else if (m == 1)
                return TFC_Textures.sheetSteel;
            if (m == 2)
                return TFC_Textures.sheetTin;
            else if (m == 3)
                return TFC_Textures.sheetZinc;

            else return TFC_Textures.sheetCopper;

        } else return icons[m];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registerer) {
        icons = new IIcon[4];
        icons[0] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/PigIronLamp");
        icons[1] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/SteelLamp");
        icons[2] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/TinLamp");
        icons[3] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/ZincLamp");


    }
}