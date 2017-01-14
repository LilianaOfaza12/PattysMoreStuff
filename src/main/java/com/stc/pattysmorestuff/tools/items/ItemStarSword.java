package com.stc.pattysmorestuff.tools.items;

import com.stc.pattysmorestuff.ModTabs;
import com.stc.pattysmorestuff.PattysMoreStuff;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class ItemStarSword extends ItemSword {

    public ItemStarSword(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysTools);
    }

    @SideOnly(Side.CLIENT)
    public boolean func_77636_d(ItemStack stack) {
        return true;
    }
}
