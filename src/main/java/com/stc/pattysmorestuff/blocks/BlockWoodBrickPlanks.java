package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by StuffTheChicken on 10/01/2017.
 */
public class BlockWoodBrickPlanks extends Block {
    public BlockWoodBrickPlanks(String name) {
        super(Material.WOOD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }
}
