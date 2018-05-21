package com.stc.pattysmorestuff.items.armor;

import com.stc.pattysmorestuff.init.ModArmor;
import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ItemStarArmor extends ItemArmor {

    public ItemStarArmor(String unlocalizedName, ArmorMaterial material, String armorType, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabPattysArmor);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModArmor.nether_star_helmet
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModArmor.nether_star_chestplate
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModArmor.nether_star_leggings
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModArmor.nether_star_boots) {

            if (!player.capabilities.isCreativeMode) {
                if (!player.capabilities.allowFlying) {
                    player.capabilities.allowFlying = true;

                }
            }
        } else {
            if (!player.capabilities.isCreativeMode) {
                player.capabilities.isFlying = false;
                player.capabilities.allowFlying = false;

            }
        }
    }

}
