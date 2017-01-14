package com.stc.pattysmorestuff.tools.items;

import com.stc.pattysmorestuff.ModTabs;
import net.minecraft.item.Item;

/**
 * Created by peeweebirch70 on 13/11/2016.
 */
public class ItemObsidianIngot extends Item {

    public ItemObsidianIngot(String name) {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysMisc);
    }
}
