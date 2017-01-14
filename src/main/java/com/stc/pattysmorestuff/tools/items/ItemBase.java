package com.stc.pattysmorestuff.tools.items;

import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by peeweebirch70 on 13/11/2016.
 */
public class ItemBase extends Item {

    public ItemBase(String name) {
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }
}
