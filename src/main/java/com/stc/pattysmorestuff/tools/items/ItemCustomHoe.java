package com.stc.pattysmorestuff.tools.items;

import com.stc.pattysmorestuff.ModTabs;
import com.stc.pattysmorestuff.PattysMoreStuff;
import net.minecraft.item.ItemHoe;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class ItemCustomHoe extends ItemHoe {


    public ItemCustomHoe(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysTools);
    }

}
