package com.stc.pattysmorestuff.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by patrick on 15/02/2017.
 */
public class RecipeRemover {


    public static void removeRecipe() {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> recipeIterator = recipes.iterator();

        while (recipeIterator.hasNext()) {
            ItemStack stack = recipeIterator.next().getRecipeOutput();
            if(stack != null && stack.getItem() == Items.BOOK) {
                recipeIterator.remove();
            }
        }
    }

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
