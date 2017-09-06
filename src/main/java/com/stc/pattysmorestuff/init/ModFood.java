package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.*;
import com.stc.pattysmorestuff.items.drinks.ItemChocolateMilk;
import com.stc.pattysmorestuff.items.drinks.ItemDrinkable;
import com.stc.pattysmorestuff.items.drinks.ItemMilkBottle;
import com.stc.pattysmorestuff.items.drinks.ItemRedBull;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModFood {

    public static Item fried_egg = new ItemCustomFood("fried_egg", 4, 0.4F,false);
    public static Item bacon_raw = new ItemCustomFood("bacon_raw", 3, 0.3F,true);
    public static Item bacon_cooked = new ItemCustomFood("bacon_cooked", 7, 0.7F,true);
    public static Item sausage_raw = new ItemCustomFood("sausage_raw", 3, 0.3F,true);
    public static Item sausage_cooked = new ItemCustomFood("sausage_cooked", 7, 0.7F,true);
    public static Item baguette_roll = new ItemCustomFood("baguette_roll", 5, 0.7F, false);
    public static Item baguette_bacon = new ItemCustomFood("baguette_bacon", 8, 0.8F, false);
    public static Item baguette_egg = new ItemCustomFood("baguette_egg", 6, 0.7F, false);
    public static Item baguette_eggbacon = new ItemCustomFood("baguette_eggbacon", 9, 1.0F, false);
    public static Item baguette_sausage = new ItemCustomFood("baguette_sausage", 8, 0.8F, false);
    public static Item baguette_baconsausage = new ItemCustomFood("baguette_baconsausage", 8, 0.8F, false);
    public static Item baguette_eggsausage = new ItemCustomFood("baguette_eggsausage", 6, 0.7F, false);
    public static Item baguette_eggbaconsausage = new ItemCustomFood("baguette_eggbaconsausage", 9, 1.0F, false);
    public static Item apple_pie = new ItemCustomFood("apple_pie", 8, 0.3F, false);
    public static Item toast = new ItemCustomFood("toast", 7, 1.2F, false);
    public static Item flour = new ItemBase("flour").setCreativeTab(ModTabs.tabPattysFood);
    public static Item fruit_salad = new ItemCustomFood("fruit_salad", 6, 1.6F, false);
    public static Item apple_juice = new ItemDrinkable("apple_juice", 4, 0.3F, false);
    public static Item melon_juice = new ItemDrinkable("melon_juice", 2, 0.3F, false);
    public static Item carrot_juice = new ItemDrinkable("carrot_juice", 3, 0.6F, false);
    public static Item beetroot_juice = new ItemDrinkable("beetroot_juice", 1, 0.6F, false);
    public static Item pumpkin_juice = new ItemDrinkable("pumpkin_juice", 5, 0.3F, false);
    public static Item bottle_milk = new ItemMilkBottle("bottle_milk", 1, 0.6F, false);
    public static Item bottle_chocolate_milk = new ItemChocolateMilk("bottle_chocolate_milk", 1, 0.6F, false);
    public static Item redbull = new ItemRedBull("redbull", 1, 0.3F, false);
    public static Item raw_chicken_wing = new ItemCustomFood("raw_chicken_wing", 1, 0.5F, false);
    public static Item cooked_chicken_wing = new ItemCustomFood("cooked_chicken_wing", 1, 0.8F, false);

    public static Item apple_slushie = new ItemDrinkable("apple_slushie", 4, 0.3F, false);
    public static Item melon_slushie = new ItemDrinkable("melon_slushie", 2, 0.3F, false);
    public static Item carrot_slushie = new ItemDrinkable("carrot_slushie", 3, 0.6F, false);
    public static Item beetroot_slushie = new ItemDrinkable("beetroot_slushie", 1, 0.6F, false);
    public static Item pumpkin_slushie = new ItemDrinkable("pumpkin_slushie", 5, 0.3F, false);

    public static Item apple_smoothie = new ItemDrinkable("apple_smoothie", 4, 0.3F, false);
    public static Item melon_smoothie = new ItemDrinkable("melon_smoothie", 2, 0.3F, false);
    public static Item carrot_smoothie = new ItemDrinkable("carrot_smoothie", 3, 0.6F, false);
    public static Item beetroot_smoothie = new ItemDrinkable("beetroot_smoothie", 1, 0.6F, false);
    public static Item pumpkin_smoothie = new ItemDrinkable("pumpkin_smoothie", 5, 0.3F, false);

    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
            fried_egg, bacon_raw, bacon_cooked, sausage_raw, sausage_cooked, baguette_roll, baguette_bacon,
            baguette_egg, baguette_eggbacon, baguette_sausage, baguette_baconsausage, baguette_eggsausage,
                baguette_eggbaconsausage, apple_pie, toast, fruit_salad, apple_juice, melon_juice, carrot_juice,
                beetroot_juice, pumpkin_juice, bottle_milk, bottle_chocolate_milk, flour, redbull, raw_chicken_wing,
                cooked_chicken_wing, apple_slushie, melon_slushie, carrot_slushie, beetroot_slushie, pumpkin_slushie,
                apple_smoothie, melon_smoothie, carrot_smoothie, beetroot_smoothie, pumpkin_smoothie
        );

    }

    public static void registerModels() {


            registerItemRender(fried_egg);
            registerItemRender(bacon_raw);
            registerItemRender(bacon_cooked);
            registerItemRender(sausage_raw);
            registerItemRender(sausage_cooked);
            registerItemRender(baguette_roll);
            registerItemRender(baguette_bacon);
            registerItemRender(baguette_egg);
            registerItemRender(baguette_eggbacon);
            registerItemRender(baguette_sausage);
            registerItemRender(baguette_baconsausage);
            registerItemRender(baguette_eggsausage);
            registerItemRender(baguette_eggbaconsausage);
            registerItemRender(apple_pie);
            registerItemRender(toast);
            registerItemRender(fruit_salad);
            registerItemRender(apple_juice);
            registerItemRender(melon_juice);
            registerItemRender(carrot_juice);
            registerItemRender(beetroot_juice);
            registerItemRender(pumpkin_juice);
            registerItemRender(bottle_milk);
            registerItemRender(bottle_chocolate_milk);
            registerItemRender(flour);
            registerItemRender(redbull);
            registerItemRender(raw_chicken_wing);
            registerItemRender(cooked_chicken_wing);
            registerItemRender(apple_slushie);
            registerItemRender(melon_slushie);
            registerItemRender(carrot_slushie);
            registerItemRender(beetroot_slushie);
            registerItemRender(pumpkin_slushie);
            registerItemRender(apple_smoothie);
            registerItemRender(melon_smoothie);
            registerItemRender(carrot_smoothie);
            registerItemRender(beetroot_smoothie);
            registerItemRender(pumpkin_smoothie);

    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerItemRender(Item item, int meta) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
