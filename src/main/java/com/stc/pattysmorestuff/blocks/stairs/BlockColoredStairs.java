package com.stc.pattysmorestuff.blocks.stairs;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by patrick on 22/07/2017.
 */
public class BlockColoredStairs  extends BlockStairs {

    public BlockColoredStairs(String name, IBlockState modelState) {
        super(modelState);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
