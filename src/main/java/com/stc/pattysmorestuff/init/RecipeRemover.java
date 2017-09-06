package com.stc.pattysmorestuff.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by patrick on 02/08/2017.
 */
public class RecipeRemover {



    public static void removeFurnaceRecipe (ItemStack resultItem)
    {
        Map<ItemStack, ItemStack> recipes = FurnaceRecipes.instance().getSmeltingList();
        for (Iterator<Map.Entry<ItemStack,ItemStack>> entries = recipes.entrySet().iterator(); entries.hasNext(); ){
            Map.Entry<ItemStack,ItemStack> entry = entries.next();
            ItemStack result = entry.getValue();
            if (ItemStack.areItemStacksEqual(result, resultItem)){ // If the output matches the specified ItemStack,
                entries.remove(); // Remove the recipe
            }
        }
    }
}
