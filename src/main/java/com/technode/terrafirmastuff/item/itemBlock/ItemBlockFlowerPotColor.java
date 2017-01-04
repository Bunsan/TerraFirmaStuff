package com.technode.terrafirmastuff.item.itemBlock;

import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockFlowerPotColor extends ItemBlockBase {

    public ItemBlockFlowerPotColor(Block b) {
        super(b);
        metaNames = new String[16];
        System.arraycopy(Reference.COLOURS, 0, metaNames, 0, 16);
    }
}
