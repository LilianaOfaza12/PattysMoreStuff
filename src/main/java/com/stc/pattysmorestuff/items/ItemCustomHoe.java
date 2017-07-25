package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.item.ItemHoe;

/**
 * Created by patrick on 21/07/2017.
 */
public class ItemCustomHoe extends ItemHoe {


    public ItemCustomHoe(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysTools);
    }
}
