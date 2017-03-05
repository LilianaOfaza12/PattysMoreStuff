package com.stc.pattysmorestuff.random.items;

import java.util.List;

import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.tabs.ModTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemWeatherWand extends Item{
	

    public ItemWeatherWand(String name) {

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxDamage(250);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModTabs.tabPattysMisc);

    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("\u00A7cThis item is not repairable");

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if (worldIn.isRaining()) {
            worldIn.setRainStrength(0);
            playerIn.getHeldItem(handIn).damageItem(1, playerIn);
        } else if (!worldIn.isRaining()) {
            worldIn.setRainStrength(1);
            playerIn.getHeldItem(handIn).damageItem(1, playerIn);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
