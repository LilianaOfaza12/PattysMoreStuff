package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by patrick on 20/07/2017.
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
}
