package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


/**
 * Created by StuffTheChicken on 02/08/2017.
 */
public class BlockGlowstoneBrick extends Block {

    public BlockGlowstoneBrick(String name) {
        super(Material.GLASS);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(0.3F);
        setLightLevel(1.0F);
        setCreativeTab(ModTabs.tabPattysBlocks);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
