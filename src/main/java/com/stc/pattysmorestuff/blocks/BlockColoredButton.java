package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import javax.annotation.Nullable;

public class BlockColoredButton extends BlockButton {


    public BlockColoredButton(String name) {
        super(false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabPattysButtons);
    }

    protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos)
    {
        worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
    }

    protected void playReleaseSound(World worldIn, BlockPos pos)
    {
        worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
