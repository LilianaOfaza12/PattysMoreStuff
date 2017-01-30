package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class BlockDye extends Block {

    public BlockDye(String unlocalizedName) {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }


}
