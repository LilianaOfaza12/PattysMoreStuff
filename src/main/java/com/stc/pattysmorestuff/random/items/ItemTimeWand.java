package com.stc.pattysmorestuff.random.items;

import com.stc.pattysmorestuff.ConfigPreInit;
import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by patrick on 07/01/2017.
 */
public class ItemTimeWand extends Item {

    public ItemTimeWand(String name) {

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxDamage(ConfigPreInit.timeWandMaxDamage);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModTabs.tabPattysMisc);

    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("\u00A7cThis item is not repairable");

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if (worldIn.isDaytime()) {
            worldIn.setWorldTime(13000);
            playerIn.getHeldItem(handIn).damageItem(1, playerIn);
        } else if (!worldIn.isDaytime()) {
            worldIn.setWorldTime(1000);
            playerIn.getHeldItem(handIn).damageItem(1, playerIn);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
