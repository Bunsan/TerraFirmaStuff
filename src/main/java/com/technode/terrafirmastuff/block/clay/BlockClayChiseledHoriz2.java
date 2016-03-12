package com.technode.terrafirmastuff.block.clay;

import com.bioxx.tfc.Blocks.Flora.BlockLogNatural2;
import com.bioxx.tfc.api.TFCBlocks;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;

public class BlockClayChiseledHoriz2 extends BlockClayChiseledHoriz
{
    public BlockClayChiseledHoriz2(int off)
    {
        super(off);
        int size = Reference.COLOURS.length - 16 - off;
        if(size < 0) size = 0;
        this.setCreativeTab(null);
        names = new String[size * 2];
        if(off < Reference.COLOURS.length - 16)
        {
            System.arraycopy(Reference.COLOURS, 16, names, 0, size);
            System.arraycopy(Reference.COLOURS, 16, names, size, size);
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        int dir = meta >> 3;
        meta = (meta & 7) + offset; //NOPMD
        if (meta >= ((BlockClayChiseledVert2) ModBlocks.clayStainedChiseledVert2).sideIcons.length)
            meta = 0;

        if(dir == 0)
        {
            if(side == 0 || side == 1)
                return ((BlockClayChiseledVert2) ModBlocks.clayStainedChiseledVert2).sideIcons[meta];
            else if(side == 2 || side == 3)
                return ((BlockClayChiseledVert2) ModBlocks.clayStainedChiseledVert2).topIcons[meta];
            else
                return ((BlockClayChiseledVert2) ModBlocks.clayStainedChiseledVert2).rotatedSideIcons[meta];
        }
        else
        {
            if(side == 0 || side == 1 || side == 2 || side == 3)
                return ((BlockClayChiseledVert2) ModBlocks.clayStainedChiseledVert2).rotatedSideIcons[meta];
            else
                return ((BlockClayChiseledVert2) ModBlocks.clayStainedChiseledVert2).topIcons[meta];
        }
    }

    @Override
    public int damageDropped(int dmg)
    {
        return (dmg & 7) + offset + 16; //NOPMD
    }
}
