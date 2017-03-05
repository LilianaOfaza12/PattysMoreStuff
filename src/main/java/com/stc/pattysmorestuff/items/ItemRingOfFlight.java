package com.stc.pattysmorestuff.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by patrick on 11/02/2017.
 */
public class ItemRingOfFlight extends Item implements IBauble{


    public ItemRingOfFlight(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysBaubles);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.RING;
    }

    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        EntityPlayer e = (EntityPlayer)player;
        e.capabilities.allowFlying = true;
    }

    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 1.9f);
        EntityPlayer e = (EntityPlayer)player;
        e.capabilities.allowFlying = true;
    }

    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 2f);
        EntityPlayer e = (EntityPlayer)player;
        e.capabilities.allowFlying = false;
        e.capabilities.isFlying = false;
    }

    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }
}
