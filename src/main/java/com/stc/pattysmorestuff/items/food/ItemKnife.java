package com.stc.pattysmorestuff.items.food;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.item.Item;

/**
 * Created by patrick on 02/08/2017.
 */
public class ItemKnife extends Item {

    public ItemKnife(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.setNoRepair();
        this.setCreativeTab(ModTabs.tabPattysFood);
    }
}
