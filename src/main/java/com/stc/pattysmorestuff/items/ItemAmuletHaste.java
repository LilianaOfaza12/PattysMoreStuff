package com.stc.pattysmorestuff.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

/**
 * Created by StuffTheChicken on 12/02/2017.
 */
public class ItemAmuletHaste extends Item implements IBauble {

    public ItemAmuletHaste(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysBaubles);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.AMULET;
    }

    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        if (itemstack.getItemDamage()==0 && player.ticksExisted%39==0) {
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE,416,0,true,true));
        }
    }

    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 1.9f);

    }

    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 2f);
    }

    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }


}
