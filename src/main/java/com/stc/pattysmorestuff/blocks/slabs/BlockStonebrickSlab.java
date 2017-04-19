package com.stc.pattysmorestuff.blocks.slabs;

import com.stc.pattysmorestuff.blocks.init.ModBlockOther;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by twiist on 19/04/2017.
 */
public abstract class BlockStonebrickSlab extends BlockSlab {

    public BlockStonebrickSlab(String unlocalizedName) {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setHardness(2.0F);
        this.setResistance(10.0F);

        //Set the default state
        IBlockState state = this.blockState.getBaseState();
        if (!this.isDouble()) {
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }
        setDefaultState(state);
        this.useNeighborBrightness = true; //Makes it so that you don't get dark patches on the block
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return EnumBlockHalf.BOTTOM;
    }

    /**
     * Make it so that meta data won't work with our block
     */
    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (!this.isDouble())
            return this.getDefaultState().withProperty(HALF,
                    EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble())
            return 0;
        return ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        if (state.getBlock() == ModBlockOther.stonebrick_black_slab_double || state.getBlock() == ModBlockOther.stonebrick_black_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_black_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_red_slab_double || state.getBlock() == ModBlockOther.stonebrick_red_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_red_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_green_slab_double || state.getBlock() == ModBlockOther.stonebrick_green_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_green_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_brown_slab_double || state.getBlock() == ModBlockOther.stonebrick_brown_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_brown_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_blue_slab_double || state.getBlock() == ModBlockOther.stonebrick_blue_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_blue_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_purple_slab_double || state.getBlock() == ModBlockOther.stonebrick_purple_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_purple_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_cyan_slab_double || state.getBlock() == ModBlockOther.stonebrick_cyan_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_cyan_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_silver_slab_double || state.getBlock() == ModBlockOther.stonebrick_silver_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_silver_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_gray_slab_double || state.getBlock() == ModBlockOther.stonebrick_gray_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_gray_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_pink_slab_double || state.getBlock() == ModBlockOther.stonebrick_pink_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_pink_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_lime_slab_double || state.getBlock() == ModBlockOther.stonebrick_lime_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_lime_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_yellow_slab_double || state.getBlock() == ModBlockOther.stonebrick_yellow_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_yellow_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_light_blue_slab_double || state.getBlock() == ModBlockOther.stonebrick_light_blue_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_light_blue_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_magenta_slab_double || state.getBlock() == ModBlockOther.stonebrick_magenta_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_magenta_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_orange_slab_double || state.getBlock() == ModBlockOther.stonebrick_orange_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_orange_slab_half);
        } else if (state.getBlock() == ModBlockOther.stonebrick_white_slab_double || state.getBlock() == ModBlockOther.stonebrick_white_slab_half) {
            return Item.getItemFromBlock(ModBlockOther.stonebrick_white_slab_half);
        }

        return null;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{HALF});
    }
}

