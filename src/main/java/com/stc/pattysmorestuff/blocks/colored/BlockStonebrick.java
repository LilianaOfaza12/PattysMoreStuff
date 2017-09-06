package com.stc.pattysmorestuff.blocks.colored;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by patrick on 02/08/2017.
 */
public class BlockStonebrick extends Block {

    public BlockStonebrick(String unlocalizedName) {
        super(Material.IRON);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        setCreativeTab(ModTabs.tabPattysBlocks);
    }


    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }


    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

}
