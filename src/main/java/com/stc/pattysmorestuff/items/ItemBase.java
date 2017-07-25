package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by patrick on 20/07/2017.
 */
public class ItemBase extends Item {
    public ItemBase(String unlocalizedName) {
        setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
        setCreativeTab(ModTabs.tabPattysMisc);
    }
}
