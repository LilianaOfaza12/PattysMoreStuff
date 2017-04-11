package com.stc.pattysmorestuff.blocks;

import java.util.List;
import java.util.Random;

import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class BlockHiddenLight extends Block
{
    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 0, 0, 0);
    private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0, 0, 0, 0, 0, 0);


    public float light =  ConfigPreInit.lightlevel/10F;

	public BlockHiddenLight(String name)
    {
        super(Material.AIR);
        this.setLightOpacity(-2);
        this.setLightLevel(light);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHarvestLevel(null, 0);

        if(ConfigPreInit.enableCreativeAir == true) {
        	this.setCreativeTab(ModTabs.tabPattysBlocks);
        }
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return  EnumBlockRenderType.INVISIBLE;
    }

    public int quantityDropped(Random par1Random)
    {
        return 0;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOUNDING_BOX;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean p_185477_7_) {
        super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }


    protected boolean canSilkHarvest()
    {
        return false;
    }
}