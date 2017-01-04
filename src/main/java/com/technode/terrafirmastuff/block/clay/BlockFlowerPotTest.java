package com.technode.terrafirmastuff.block.clay;

import com.bioxx.tfc.Blocks.BlockTerraContainer;
import com.bioxx.tfc.TileEntities.TEChest;
import com.bioxx.tfc.api.TFCBlocks;
import com.technode.terrafirmastuff.core.ModDetails;
import com.technode.terrafirmastuff.core.reference.CreativeTab;
import com.technode.terrafirmastuff.core.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockFlowerPotTest extends BlockTerraContainer {

    protected String[] metanames;
    protected IIcon[] icons;

    public BlockFlowerPotTest() {
        super(Material.circuits);
        this.setBlockBoundsForItemRender();
        this.setCreativeTab(CreativeTab.TFS_TAB);
        metanames = new String[16];
        System.arraycopy(Reference.COLOURS, 0, metanames, 0, 16);
        icons = new IIcon[metanames.length];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < metanames.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "clay/"+"blockFlowerPot"+metanames[i]);

    }
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < metanames.length; i++)
            list.add(new ItemStack(this,1,i));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
        if(side == 1 && meta == 0) {
            return icons[0];
        }
        else return super.getIcon(side, meta);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int var2)
    {
        return new TileEntityFlowerPot();
    }
    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender() {
        float f = 0.375F;
        float f1 = f / 2.0F;
        this.setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube() {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock() {
        return false;
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.inventory.getCurrentItem();

        if (itemstack != null) {
            TileEntityFlowerPot teFlowerPot = this.getTileEntity(world, x, y, z);

            if (teFlowerPot != null) {
                if (teFlowerPot.getFlowerPotItem() != null) {
                    Boolean hit = side == 1;
                    if (player.isSneaking() && hit) {
                        ItemStack dropContents = (new ItemStack(teFlowerPot.getFlowerPotItem(), 1, teFlowerPot.getFlowerPotData()));
                        EntityItem itemDropped = new EntityItem(world, x, y, z, dropContents);
                        world.spawnEntityInWorld(itemDropped);
                    }
                    return false; // There is already something in the flower pot.
                }

                Item item = itemstack.getItem();
                int meta = itemstack.getItemDamage();

                if (this.validItem(item, meta)) {
                    teFlowerPot.func_145964_a(item, meta); // Set Item and Data
                    teFlowerPot.markDirty();

                    if (!world.setBlockMetadataWithNotify(x, y, z, meta, 2)) {
                        world.markBlockForUpdate(x, y, z);
                    }

                    if (!player.capabilities.isCreativeMode && --itemstack.stackSize <= 0) {
                        player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
                    }

                    return true;
                } else {
                    return false; // Invalid Item
                }
            } else {
                return false; // Null flower pot tile entity
            }
        } else {
            return false; // Empty hand
        }
    }

    private boolean validItem(Item item, int meta) {
        if (item instanceof ItemBlock) {
            Block block = Block.getBlockFromItem(item);

            // TFC Blocks
            if (block == TFCBlocks.cactus || block == TFCBlocks.flora || block == TFCBlocks.flowers || block == TFCBlocks.flowers2 ||
                    block == TFCBlocks.fungi || block == TFCBlocks.sapling || block == TFCBlocks.sapling2 || block == TFCBlocks.tallGrass && meta == 1 /*Fern*/ ||
                    block == TFCBlocks.fruitTreeSapling)
                return true;

            // Vanilla Blocks
            if (block == Blocks.yellow_flower || block == Blocks.red_flower || block == Blocks.cactus || block == Blocks.brown_mushroom ||
                    block == Blocks.red_mushroom || block == Blocks.sapling || block == Blocks.deadbush || block == Blocks.tallgrass && meta == 2 /*Fern*/)
                return true;
        }
        // Currently not possible to render non-ItemBlocks in the flower pot. -Kitty
		/*else if (item == TFCItems.FruitTreeSapling)
			return true;*/
        return false;
    }

    private TileEntityFlowerPot getTileEntity(World world, int x, int y, int z) {
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null && tileentity instanceof TileEntityFlowerPot ? (TileEntityFlowerPot) tileentity : null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getItemIconName() {
        return ModDetails.ModID + ":" + "flowerPotColor" + metanames;
    }

    @Override
    public Item getItemDropped(int i, Random rand, int j) {
        return Item.getItemFromBlock(TFCBlocks.flowerPot);
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
        TileEntityFlowerPot teFlowerPot = this.getTileEntity(world, x, y, z);

        if (teFlowerPot != null) {
            return new ItemStack(teFlowerPot.getFlowerPotItem(), 1, teFlowerPot.getFlowerPotData());
        }
        return new ItemStack(TFCBlocks.flowerPot);
    }

    /**
     * The type of render function that is called for this block
     */
    @Override
    public int getRenderType() {
        return TFCBlocks.flowerPotRenderId;
    }

//**************************

    private boolean func_149928_a(Block p_149928_1_, int p_149928_2_) {
        return p_149928_1_ != Blocks.yellow_flower && p_149928_1_ != Blocks.red_flower && p_149928_1_ != Blocks.cactus && p_149928_1_ != Blocks.brown_mushroom && p_149928_1_ != Blocks.red_mushroom && p_149928_1_ != Blocks.sapling && p_149928_1_ != Blocks.deadbush ? p_149928_1_ == Blocks.tallgrass && p_149928_2_ == 2 : true;
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        TileEntityFlowerPot tileentityflowerpot = this.func_149929_e(p_149694_1_, p_149694_2_, p_149694_3_, p_149694_4_);
        return tileentityflowerpot != null && tileentityflowerpot.getFlowerPotItem() != null ? tileentityflowerpot.getFlowerPotItem() : Items.flower_pot;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_) {
        TileEntityFlowerPot tileentityflowerpot = this.func_149929_e(p_149643_1_, p_149643_2_, p_149643_3_, p_149643_4_);
        return tileentityflowerpot != null && tileentityflowerpot.getFlowerPotItem() != null ? tileentityflowerpot.getFlowerPotData() : 0;
    }

    /**
     * Returns true only if block is flowerPot
     */
    @SideOnly(Side.CLIENT)
    public boolean isFlowerPot() {
        return true;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_) {
        return super.canPlaceBlockAt(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_) && World.doesBlockHaveSolidTopSurface(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
        if (!World.doesBlockHaveSolidTopSurface(p_149695_1_, p_149695_2_, p_149695_3_ - 1, p_149695_4_)) {
            this.dropBlockAsItem(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_), 0);
            p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_, p_149695_4_);
        }
    }
/*
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata) {
        super.breakBlock(world, x, y, z, block, metadata);
    }
*/
    /**
     * Called when the block is attempted to be harvested
     */
    public void onBlockHarvested(World p_149681_1_, int p_149681_2_, int p_149681_3_, int p_149681_4_, int p_149681_5_, EntityPlayer p_149681_6_) {
        super.onBlockHarvested(p_149681_1_, p_149681_2_, p_149681_3_, p_149681_4_, p_149681_5_, p_149681_6_);

        if (p_149681_6_.capabilities.isCreativeMode) {
            TileEntityFlowerPot tileentityflowerpot = this.func_149929_e(p_149681_1_, p_149681_2_, p_149681_3_, p_149681_4_);

            if (tileentityflowerpot != null) {
                tileentityflowerpot.func_145964_a(Item.getItemById(0), 0);
            }
        }
    }

    private TileEntityFlowerPot func_149929_e(World p_149929_1_, int p_149929_2_, int p_149929_3_, int p_149929_4_) {
        TileEntity tileentity = p_149929_1_.getTileEntity(p_149929_2_, p_149929_3_, p_149929_4_);
        return tileentity != null && tileentity instanceof TileEntityFlowerPot ? (TileEntityFlowerPot) tileentity : null;
    }


    /*============================FORGE START=====================================*/
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
        TileEntityFlowerPot te = this.func_149929_e(world, x, y, z);
        if (te != null && te.getFlowerPotItem() != null)
            ret.add(new ItemStack(te.getFlowerPotItem(), 1, te.getFlowerPotData()));
        return ret;
    }

    @Override
    public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) {
        if (willHarvest) return true; //If it will harvest, delay deletion of the block until after getDrops
        return super.removedByPlayer(world, player, x, y, z, willHarvest);
    }

    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    @Override
    public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int meta) {
        super.harvestBlock(world, player, x, y, z, meta);
        world.setBlockToAir(x, y, z);
    }
    /*===========================FORGE END==========================================*/
}