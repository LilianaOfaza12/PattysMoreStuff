package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

/**
 * Created by patrick on 21/07/2017.
 */
public class ItemCustomSword extends ItemSword {


    public ItemCustomSword(String name, Item.ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysTools);
    }
}
