package com.technode.terrafirmastuff.block.clay;

import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;

public class BlockClayPillarHoriz2 extends BlockClayPillarHoriz
{
    public BlockClayPillarHoriz2(int off)
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
        if (meta >= ((BlockClayPillarVert2) ModBlocks.clayStainedPillarVert2).sideIcons.length)
            meta = 0;

        if(dir == 0)
        {
            if(side == 0 || side == 1)
                return ((BlockClayPillarVert2) ModBlocks.clayStainedPillarVert2).sideIcons[meta];
            else if(side == 2 || side == 3)
                return ((BlockClayPillarVert2) ModBlocks.clayStainedPillarVert2).topIcons[meta];
            else
                return ((BlockClayPillarVert2) ModBlocks.clayStainedPillarVert2).rotatedSideIcons[meta];
        }
        else
        {
            if(side == 0 || side == 1 || side == 2 || side == 3)
                return ((BlockClayPillarVert2) ModBlocks.clayStainedPillarVert2).rotatedSideIcons[meta];
            else
                return ((BlockClayPillarVert2) ModBlocks.clayStainedPillarVert2).topIcons[meta];
        }
    }

    @Override
    public int damageDropped(int dmg)
    {
        return (dmg & 7) + offset + 16; //NOPMD
    }
}
