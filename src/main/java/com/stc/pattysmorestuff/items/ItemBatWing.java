package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by patrick on 28/02/2017.
 */
public class ItemBatWing extends Item {

    public ItemBatWing(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysBaubles);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }
}
