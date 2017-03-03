package com.technode.terrafirmastuff.render;

import com.bioxx.tfc.api.TFCBlocks;
import com.technode.terrafirmastuff.block.wood.BlockStickBundle;
import com.technode.terrafirmastuff.core.ModBlocks;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;

public class ModRendererStickBundle implements ISimpleBlockRenderingHandler
{
    public static boolean renderBlockStickBundle(BlockStickBundle stickBundleBlock, int x, int y, int z, RenderBlocks renderBlocks)
    {
        renderBlocks.setRenderBounds(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
        renderBlocks.renderStandardBlock(stickBundleBlock, x, y, z);
        return true;

    }

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID,
                                     RenderBlocks renderer)
    {
        renderer.setOverrideBlockTexture(block.getIcon(0, metadata));
        if (modelID == ModBlocks.stickBundleID)
        {
            renderer.setRenderBounds(0.25f, 0.25f, 0f, 0.75f, 0.75f, 1f);
            renderInvBlock(block, renderer);
        }
        else if (modelID == TFCBlocks.woodSupportRenderIdV)
        {
            renderer.setRenderBounds(0.25f, 0f, 0.25f, 0.75f, 1f, 0.75f);
            renderInvBlock(block, renderer);
        }
        renderer.clearOverrideBlockTexture();
    }



    /*public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
        if (modelId == ModBlocks.stickBundleID && block instanceof BlockStickBundle) {
            return renderBlockStickBundle((BlockStickBundle)block, x, y, z, renderer);
        }
        return false;
    }*/

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderblocks)
    {
        BlockStickBundle par1BlockStickBundle = (BlockStickBundle)block;
        boolean flag = false;
        float f = 0.375F;
        float f1 = 0.625F;
        renderblocks.setRenderBounds(f, 0.0D, f, f1, 1.0D, f1);
        renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);
        flag = true;
        boolean flag1 = false;
        boolean flag2 = false;

        if (par1BlockStickBundle.canConnect(renderblocks.blockAccess, x - 1, y, z) || par1BlockStickBundle.canConnect(renderblocks.blockAccess, x + 1, y, z))
            flag1 = true;

        if (par1BlockStickBundle.canConnect(renderblocks.blockAccess, x, y, z - 1) || par1BlockStickBundle.canConnect(renderblocks.blockAccess, x, y, z + 1))
            flag2 = true;

        boolean flag3 = par1BlockStickBundle.canConnect(renderblocks.blockAccess, x - 1, y, z);
        boolean flag4 = par1BlockStickBundle.canConnect(renderblocks.blockAccess, x + 1, y, z);
        boolean flag5 = par1BlockStickBundle.canConnect(renderblocks.blockAccess, x, y, z - 1);
        boolean flag6 = par1BlockStickBundle.canConnect(renderblocks.blockAccess, x, y, z + 1);

        if (!flag1 && !flag2)
            flag1 = true;

        f = 0.4375F;
        f1 = 0.5625F;
        float f2 = 0.75F;
        float f3 = 0.9375F;
        float f4 = flag3 ? 0.0F : f;
        float f5 = flag4 ? 1.0F : f1;
        float f6 = flag5 ? 0.0F : f;
        float f7 = flag6 ? 1.0F : f1;

        if (flag1)
        {
            renderblocks.setRenderBounds(f4, f2+0.001, f+0.001, f5, f3+0.001, f1+0.001);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);

            renderblocks.setRenderBounds(f5, f2, f1-0.001, f4, f3, f-0.001);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);

            flag = true;
        }

        if (flag2)
        {
            renderblocks.setRenderBounds(f-0.001, f2+0.001, f6, f1-0.001, f3+0.001, f7);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);

            renderblocks.setRenderBounds(f1+0.001, f2, f7, f+0.001, f3, f6);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);
            flag = true;
        }

        f2 = 0.375F;
        f3 = 0.5625F;

        if (flag1)
        {
            renderblocks.setRenderBounds(f4, f2+0.001, f+0.001, f5, f3+0.001, f1+0.001);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);

            renderblocks.setRenderBounds(f5, f2, f1-0.001, f4, f3, f-0.001);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);

            flag = true;
        }

        if (flag2)
        {
            renderblocks.setRenderBounds(f-0.001, f2+0.001, f6, f1-0.001, f3+0.001, f7);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);

            renderblocks.setRenderBounds(f1+0.001, f2, f7, f+0.001, f3, f6);
            renderblocks.renderStandardBlock(par1BlockStickBundle, x, y, z);
            flag = true;
        }

        par1BlockStickBundle.setBlockBoundsBasedOnState(renderblocks.blockAccess, x, y, z);
        return flag;
    }

    public boolean shouldRender3DInInventory(final int modelId) {
        return true;
    }

    public int getRenderId() {
        //return 0;
        return ModBlocks.stickBundleID;
    }

    public static void renderInvBlock(Block block, RenderBlocks renderer)
    {
        Tessellator var14 = Tessellator.instance;
        var14.startDrawingQuads();
        var14.setNormal(0.0F, -1.0F, 0.0F);
        renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(0, 0));
        var14.draw();
        var14.startDrawingQuads();
        var14.setNormal(0.0F, 1.0F, 0.0F);
        renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(1, 0));
        var14.draw();
        var14.startDrawingQuads();
        var14.setNormal(0.0F, 0.0F, -1.0F);
        renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(2, 0));
        var14.draw();
        var14.startDrawingQuads();
        var14.setNormal(0.0F, 0.0F, 1.0F);
        renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(3, 0));
        var14.draw();
        var14.startDrawingQuads();
        var14.setNormal(-1.0F, 0.0F, 0.0F);
        renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(4, 0));
        var14.draw();
        var14.startDrawingQuads();
        var14.setNormal(1.0F, 0.0F, 0.0F);
        renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(5, 0));
        var14.draw();
    }
}
