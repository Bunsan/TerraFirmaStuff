package com.technode.terrafirmastuff.block.metal;

import com.bioxx.tfc.Core.TFC_Textures;
import com.bioxx.tfc.Reference;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.item.itemBlock.ItemOilLampMod2;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockOilLampMod2 extends BlockOilLampMod {
    private IIcon[] icons;

    public BlockOilLampMod2() {
        super();
        this.setTickRandomly(true);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < 6; i++)
        {
            list.add(ItemOilLampMod2.getFullLamp(i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        int m = meta & 7;
        if (side == 0 || side == 1) {
            if (m == 0)
                return TFC_Textures.sheetBismuth;
            else if (m == 1)
                return TFC_Textures.sheetCopper;
            else if (m == 2)
                return TFC_Textures.sheetWroughtIron;
            else if (m == 3)
                return TFC_Textures.sheetLead;
            else if (m == 4)
                return TFC_Textures.sheetNickel;
            else if (m == 5)
                return TFC_Textures.sheetBlueSteel;

            else return TFC_Textures.sheetCopper;

        } else return icons[m];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registerer) {
        icons = new IIcon[6];
        icons[0] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/BismuthLamp");
        icons[1] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/CopperLamp");
        icons[2] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/WroughtIronLamp");
        icons[3] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/LeadLamp");
        icons[4] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/NickelLamp");
        icons[5] = registerer.registerIcon(Reference.MOD_ID + ":" + "metal/BlueSteelLamp");

    }
}