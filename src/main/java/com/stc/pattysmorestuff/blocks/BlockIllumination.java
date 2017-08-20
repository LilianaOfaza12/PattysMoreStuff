package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

/**
 * Created by patrick on 02/08/2017.
 */
public class BlockIllumination extends Block {

    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 0, 0, 0);
    private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0, 0, 0, 0, 0, 0);


    public float light =  ConfigPreInit.lightlevel/10F;


    public BlockIllumination(String name) {
        super(Material.AIR);
        setUnlocalizedName(name);
        setRegistryName(name);
        setLightOpacity(-2);
        setLightLevel(light);
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

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

}
