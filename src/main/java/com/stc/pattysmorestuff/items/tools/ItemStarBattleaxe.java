package com.stc.pattysmorestuff.items.tools;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by StuffTheChicken on 21/07/2017.
 */
public class ItemStarBattleaxe extends ItemSword {


    public ItemStarBattleaxe(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.maxStackSize = 1;
        this.setCreativeTab(ModTabs.tabPattysBattleaxe);

    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
