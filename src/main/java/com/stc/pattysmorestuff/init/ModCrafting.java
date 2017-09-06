package com.stc.pattysmorestuff.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 23/07/2017.
 */
public class ModCrafting {

    public static void furnaceRecipes() {

        GameRegistry.addSmelting(new ItemStack(Items.EGG, 1), new ItemStack(ModFood.fried_egg), 0.35F);
        GameRegistry.addSmelting(new ItemStack(ModFood.bacon_raw, 1), new ItemStack(ModFood.bacon_cooked),0.35F);
        GameRegistry.addSmelting(new ItemStack(ModFood.sausage_raw, 1), new ItemStack(ModFood.sausage_cooked),0.35F);
        GameRegistry.addSmelting(new ItemStack(ModFood.flour, 1), new ItemStack(Items.BREAD),0.35F);
        GameRegistry.addSmelting(new ItemStack(ModFood.raw_chicken_wing, 1), new ItemStack(ModFood.cooked_chicken_wing),0.35F);
        GameRegistry.addSmelting(new ItemStack(Items.BREAD, 1), new ItemStack(ModFood.toast),0.35F);

    }
}
