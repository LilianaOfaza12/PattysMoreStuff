package com.stc.pattysmorestuff.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemStarBlock extends ItemBlock
{
    protected final Block block;

    public ItemStarBlock(Block block)
    {
        super(block);
        this.block = block;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
