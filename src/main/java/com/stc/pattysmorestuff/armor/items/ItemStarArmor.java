package com.stc.pattysmorestuff.armor.items;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by peeweebirch70 on 13/11/2016.
 */
public class ItemStarArmor extends ItemArmor {

    public ItemStarArmor(String unlocalizedName, ArmorMaterial material, String armorType, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabPattysArmor);
    }
    @SideOnly(Side.CLIENT)
    public boolean func_77636_d(ItemStack stack) {
        return true;
    }

}
