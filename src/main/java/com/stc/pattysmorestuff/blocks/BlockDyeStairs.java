package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

/**
 * Created by patrick on 08/01/2017.
 */
public class BlockDyeStairs extends BlockStairs {

    public BlockDyeStairs(String name, IBlockState modelState) {
        super(modelState);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }
}
