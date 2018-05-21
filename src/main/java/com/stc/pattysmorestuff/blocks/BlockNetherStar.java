package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.items.ItemStarBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNetherStar extends Block{

    public BlockNetherStar(String name) {

        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabPattysBlocks);
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {

        super.onBlockAdded(worldIn, pos, state);
    }

    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
        return true;
    }

    public Item createItemBlock() {

        return new ItemStarBlock(this).setRegistryName(getRegistryName());

    }

}
