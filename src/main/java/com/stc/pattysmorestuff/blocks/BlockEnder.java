package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockEnder extends Block {

    public BlockEnder(String name) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(5.0F);
        setResistance(10.0F);
        setCreativeTab(ModTabs.tabPattysBlocks);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
