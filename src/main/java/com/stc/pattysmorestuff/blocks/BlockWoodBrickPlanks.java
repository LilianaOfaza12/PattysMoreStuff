package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by patrick on 10/01/2017.
 */
public class BlockWoodBrickPlanks extends Block {
    public BlockWoodBrickPlanks(String name) {
        super(Material.WOOD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }
}
