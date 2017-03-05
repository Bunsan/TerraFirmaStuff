package com.technode.terrafirmastuff.block.metal;

import com.bioxx.tfc.Core.TFC_Textures;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.item.itemBlock.ItemOilLampMod4;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockOilLampMod4 extends BlockOilLampMod {
    private IIcon[] icons;

    public BlockOilLampMod4() {
        super();
        this.setTickRandomly(true);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < 5; i++)
        {
            list.add(ItemOilLampMod4.getFullLamp(i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        int m = meta & 7;
        if (side == 0 || side == 1) {
            if (m == 0)
                return TFC_Textures.sheetElectrum;
            else if (m == 1)
                return TFC_Textures.sheetCupronickel;
            else if (m == 2)
                return TFC_Textures.sheetOsmium;
            else if (m == 3)
                return TFC_Textures.sheetAluminum;
            else if (m == 4)
                return TFC_Textures.sheetTungsten;
            else return TFC_Textures.sheetCopper;

        } else return icons[m];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registerer) {
        icons = new IIcon[5];
        icons[0] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/ElectrumLamp");
        icons[1] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/CupronickelLamp");
        icons[2] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/OsmiumLamp");
        icons[3] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/AluminumLamp");
        icons[4] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/TungstenLamp");

    }
}