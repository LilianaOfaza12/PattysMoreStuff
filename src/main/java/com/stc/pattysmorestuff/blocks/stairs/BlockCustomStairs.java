package com.stc.pattysmorestuff.blocks.stairs;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCustomStairs extends BlockStairs {

    public BlockCustomStairs(String name, IBlockState modelState) {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabPattysStairs);
        this.useNeighborBrightness = true;
    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }



    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
