package com.stc.pattysmorestuff.items.armor;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ItemMoreArmor extends ItemArmor {

    public ItemMoreArmor(String unlocalizedName, ArmorMaterial material, String armorType, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabPattysArmor);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        if(!player.inventory.armorInventory.isEmpty()) {

            world.setLightFor(EnumSkyBlock.BLOCK, player.getPosition().down(), 1);
        }

        super.onArmorTick(world, player, itemStack);
    }
}
