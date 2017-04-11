package com.stc.pattysmorestuff.random.items;

import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;


public class ItemWandLight extends Item {

	public ItemWandLight(String name) {
		super();
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.setMaxDamage(ConfigPreInit.lightWandMaxDamage);
		this.setCreativeTab(ModTabs.tabPattysMisc);
	}

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("\u00A7cThis item is not repairable");

    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

	    worldIn.setBlockState(pos.up(1), ModBlocks.glowair.getDefaultState(), 0);
        if(!player.capabilities.isCreativeMode) {
            player.getHeldItem(hand).damageItem(1, player);
        }
	    return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
	






