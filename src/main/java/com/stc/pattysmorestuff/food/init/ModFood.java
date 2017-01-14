package com.stc.pattysmorestuff.food.init;

import com.stc.pattysmorestuff.food.items.ItemAppleDiamond;
import com.stc.pattysmorestuff.food.items.ItemAppleEmerald;
import com.stc.pattysmorestuff.food.items.ItemAppleIron;
import com.stc.pattysmorestuff.food.items.ItemCustomFood;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 21/12/2016.
 */
public class ModFood {

    public static Item fried_egg;
    public static Item bacon_raw;
    public static Item bacon_cooked;
    public static Item baguette_roll;
    public static Item baguette_bacon;
    public static Item baguette_egg;
    public static Item baguette_eggbacon;


    public static Item iron_apple;
    public static Item diamond_apple;
    public static Item emerald_apple;


    public static void init() {

        fried_egg = new ItemCustomFood("fried_egg", 4, 0.4F,false);
        bacon_raw = new ItemCustomFood("bacon_raw", 3, 0.3F,true);
        bacon_cooked = new ItemCustomFood("bacon_cooked", 7, 0.7F,true);
        baguette_roll = new ItemCustomFood("baguette_roll", 5, 0.7F, false);
        baguette_bacon = new ItemCustomFood("baguette_bacon", 8, 0.8F, false);
        baguette_egg = new ItemCustomFood("baguette_egg", 6, 0.7F, false);
        baguette_eggbacon = new ItemCustomFood("baguette_eggbacon", 9, 1.0F, false);


        iron_apple = new ItemAppleIron("iron_apple",4, 1.2F, false).setAlwaysEdible();
        diamond_apple = new ItemAppleDiamond("diamond_apple",4, 1.2F, false).setAlwaysEdible();
        emerald_apple = new ItemAppleEmerald("emerald_apple",4, 1.2F, false).setAlwaysEdible();

        register(fried_egg);
        register(bacon_raw);
        register(bacon_cooked);
        register(baguette_roll);
        register(baguette_bacon);
        register(baguette_egg);
        register(baguette_eggbacon);

        register(iron_apple);
        register(diamond_apple);
        register(emerald_apple);
    }

    public static void register(Item item) {
        GameRegistry.register(item);

    }

    public static void registerRenders() {

        registerRender(fried_egg);
        registerRender(bacon_raw);
        registerRender(bacon_cooked);
        registerRender(baguette_roll);
        registerRender(baguette_bacon);
        registerRender(baguette_egg);
        registerRender(baguette_eggbacon);

        for (int i = 0; i < 2; i++) {
            registerRenderWithMeta(iron_apple, i);
            registerRenderWithMeta(diamond_apple, i);
            registerRenderWithMeta(emerald_apple, i);
        }
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }

    private static void registerRenderWithMeta(Item item, int meta) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, meta, modResLoc);
    }
}
