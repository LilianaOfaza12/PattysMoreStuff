package com.stc.pattysmorestuff.armor.items;

import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by peeweebirch70 on 13/11/2016.
 */
public class ItemMoreArmor extends ItemArmor {

    public ItemMoreArmor(String unlocalizedName, ArmorMaterial material, String armorType, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabPattysArmor);
    }
}
