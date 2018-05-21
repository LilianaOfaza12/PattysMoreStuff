package com.stc.pattysmorestuff.items.tools;

import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.init.ModTools;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;


/**
 * Created by StuffTheChicken on 21/07/2017.
 */
public class ItemBattleaxe extends ItemSword {


    private float speed;
    private ToolMaterial material;

    public ItemBattleaxe(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.maxStackSize = 1;
        this.setCreativeTab(ModTabs.tabPattysBattleaxe);
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        if (stack.getItem() == ModTools.magmacream_battle_axe) {
            stack.addEnchantment(Enchantment.getEnchantmentByID(20), 3);
        }
        super.onCreated(stack, worldIn, playerIn);
    }

}
