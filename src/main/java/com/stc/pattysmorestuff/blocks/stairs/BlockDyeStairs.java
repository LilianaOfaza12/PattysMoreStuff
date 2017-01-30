package com.stc.pattysmorestuff.blocks.stairs;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

/**
 * Created by StuffTheChicken on 08/01/2017.
 */
public class BlockDyeStairs extends BlockStairs {

    public BlockDyeStairs(String name, IBlockState modelState) {
        super(modelState);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }
}
