package com.stc.pattysmorestuff.food.items;


import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;


/**
 * Created by patrick on 21/12/2016.
 */
public class ItemCustomFood extends ItemFood {


    public ItemCustomFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysFood);
    }
}
