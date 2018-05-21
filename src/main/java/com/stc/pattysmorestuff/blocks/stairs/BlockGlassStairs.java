package com.stc.pattysmorestuff.blocks.stairs;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import java.util.Random;


public class BlockGlassStairs extends BlockStairs {

    protected final Material blockMaterial;

    public BlockGlassStairs(String name, IBlockState modelState) {
        super(modelState);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(0.3F);
        this.setCreativeTab(ModTabs.tabPattysStairs);
        this.useNeighborBrightness = true;
        this.fullBlock = false;
        this.translucent = true;
        this.blockMaterial = Material.GLASS;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return this.fullBlock;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
