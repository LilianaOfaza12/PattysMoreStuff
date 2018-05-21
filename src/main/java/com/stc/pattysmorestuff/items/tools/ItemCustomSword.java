package com.stc.pattysmorestuff.items.tools;

import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.init.ModTools;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

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

    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        if (stack.getItem() == ModTools.magma_cream_sword) {
            stack.addEnchantment(Enchantment.getEnchantmentByID(20), 3);
        }
        super.onCreated(stack, worldIn, playerIn);
    }
}
