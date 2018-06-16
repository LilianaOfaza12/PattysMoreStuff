package com.stc.pattysmorestuff.blocks.fences;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


/**
 * Created by StuffTheChicken on 07/03/2017.
 */
public class BlockDyeFence extends BlockFence {



    public BlockDyeFence(String name) {
        super(Material.CLOTH, MapColor.CLOTH);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3);
        this.setResistance(5);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
        this.useNeighborBrightness = true;

    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
