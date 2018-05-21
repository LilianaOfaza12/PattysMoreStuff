package com.stc.pattysmorestuff.items.food;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood {

    public ItemCustomFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysFood);
    }

}
