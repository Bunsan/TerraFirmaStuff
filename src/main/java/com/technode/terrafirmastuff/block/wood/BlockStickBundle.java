package com.technode.terrafirmastuff.block.wood;

import com.bioxx.tfc.Blocks.BlockTerra;
import com.bioxx.tfc.Blocks.Terrain.BlockCobble;
import com.bioxx.tfc.Blocks.Terrain.BlockSand;
import com.bioxx.tfc.Core.TFC_Core;
import com.technode.terrafirmastuff.core.ModBlocks;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.IFluidBlock;

public class BlockStickBundle extends BlockTerra
{
    protected IIcon iconsPost;
    protected IIcon iconsPostTop;

    public BlockStickBundle()
    {
        super(Material.wood);
        this.setCreativeTab(CreativeTab.TFS_TAB);
        this.setBlockBounds(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        /*this.blockIcon = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "wood/" + "StickBundleSide");*/
        this.iconsPost = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "wood/" + "StickBundleSide");
        this.iconsPostTop = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "wood/" + "StickBundleTop");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.iconsPostTop : side == 0 ? this.iconsPostTop : this.iconsPost;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return getCollisionBoundingBoxFromPoolIBlockAccess(world, x, y, z).getOffsetBoundingBox(x, y, z);
    }

    private AxisAlignedBB getCollisionBoundingBoxFromPoolIBlockAccess(IBlockAccess blockAccess, int x, int y, int z)
    {
        double minX = 0.25; double minY = 0.0; double minZ = 0.25;
        double maxX = 0.75; double maxY = 1.0; double maxZ = 0.75;

        return AxisAlignedBB.getBoundingBox(minX, minY, minZ, maxX, maxY, maxZ);
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z)
    {
        AxisAlignedBB aabb = getCollisionBoundingBoxFromPoolIBlockAccess(blockAccess, x, y, z);
        this.setBlockBounds((float)aabb.minX, (float)aabb.minY, (float)aabb.minZ, (float)aabb.maxX, (float)aabb.maxY, (float)aabb.maxZ);
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {

        double minX = 0.25;
        double minY = 0.0;
        double minZ = 0.25;
        double maxX = 0.75;
        double maxY = 1.0;
        double maxZ = 0.75;

        return AxisAlignedBB.getBoundingBox(x + minX, y + minY, z + minZ, x + maxX, y + maxY, z + maxZ);

    }

    @Override
    public int getRenderType()
    {
        return ModBlocks.stickBundleID;
    }

    public boolean canConnect(IBlockAccess bAccess, int x, int y, int z) { return false; }

    @Override
    public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l)
    {
        //Random R = new Random();
        //dropBlockAsItem(world, i, j, k, new ItemStack(idDropped(0,R,l), 1, l+13));

        //super.harvestBlock(world, entityplayer, i, j, k, l);
        dropBlockAsItem(world, i, j, k, new ItemStack(this, 1, l));
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        if(!world.isRemote)
        {
            Block b = world.getBlock(x, y+1, z);
            if(TFC_Core.isSoilOrGravel(b) || b instanceof BlockCobble || b instanceof BlockSand)
            {
                TFC_Core.setBlockToAirWithDrops(world, x, y, z);
            }
            if(world.isAirBlock(x, y-1, z)
                    || world.getBlock(x, y-1, z) instanceof IFluidBlock || world.getBlock(x, y+1, z) instanceof IFluidBlock
                    || world.getBlock(x-1, y, z) instanceof IFluidBlock || world.getBlock(x+1, y, z) instanceof IFluidBlock
                    || world.getBlock(x, y, z-1) instanceof IFluidBlock || world.getBlock(x, y, z+1) instanceof IFluidBlock)
            {
                TFC_Core.setBlockToAirWithDrops(world, x, y, z);
            }
        }
    }

    @Override
    public void onPostBlockPlaced(World world, int x, int y, int z, int meta) {
        if(!world.isRemote)
        {
            if(world.isAirBlock(x, y-1, z)
                    || world.getBlock(x, y-1, z) instanceof BlockLiquid || world.getBlock(x, y+1, z) instanceof BlockLiquid
                    || world.getBlock(x-1, y, z) instanceof BlockLiquid || world.getBlock(x+1, y, z) instanceof BlockLiquid
                    || world.getBlock(x, y, z-1) instanceof BlockLiquid || world.getBlock(x, y, z+1) instanceof BlockLiquid)
            {
                TFC_Core.setBlockToAirWithDrops(world, x, y, z);
            }
        }
    }

    @Override
    public boolean getBlocksMovement(IBlockAccess bAccess, int x, int y, int z)
    {
        return true;
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
        entity.motionX *= 0.1D;
        entity.motionZ *= 0.1D;
    }

   /* @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        if(world.isAirBlock(x, y-1, z) || world.getBlock(x, y-1, z).getMaterial() == Material.water ||
                world.getBlock(x, y-1, z).getMaterial() == Material.lava) {
            return false;
        }
        return true;
    }*/

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {

        return canBlockStay(world, x, y, z) && super.canPlaceBlockAt(world, x, y, z);
    }

    @Override
    public boolean isBlockNormalCube()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1iBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }
}
