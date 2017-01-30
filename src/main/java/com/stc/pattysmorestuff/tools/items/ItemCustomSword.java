package com.stc.pattysmorestuff.tools.items;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class ItemCustomSword extends ItemSword {


    public ItemCustomSword(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysTools);
    }

}
