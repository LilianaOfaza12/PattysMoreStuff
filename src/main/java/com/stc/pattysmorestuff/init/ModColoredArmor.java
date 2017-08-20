package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.armor.ItemMoreArmor;
import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 20/07/2017.
 */
public class ModColoredArmor {

    public static Item black_helmet = new ItemMoreArmor("black_helmet", ConfigPreInit.DYE_ARMOR_BLACK, "black", EntityEquipmentSlot.HEAD);
    public static Item black_chestplate = new ItemMoreArmor("black_chestplate", ConfigPreInit.DYE_ARMOR_BLACK, "black", EntityEquipmentSlot.CHEST);
    public static Item black_leggings = new ItemMoreArmor("black_leggings", ConfigPreInit.DYE_ARMOR_BLACK, "black", EntityEquipmentSlot.LEGS);
    public static Item black_boots = new ItemMoreArmor("black_boots", ConfigPreInit.DYE_ARMOR_BLACK, "black", EntityEquipmentSlot.FEET);
    public static Item red_helmet = new ItemMoreArmor("red_helmet", ConfigPreInit.DYE_ARMOR_RED, "red", EntityEquipmentSlot.HEAD);
    public static Item red_chestplate = new ItemMoreArmor("red_chestplate", ConfigPreInit.DYE_ARMOR_RED, "red", EntityEquipmentSlot.CHEST);
    public static Item red_leggings = new ItemMoreArmor("red_leggings", ConfigPreInit.DYE_ARMOR_RED, "red", EntityEquipmentSlot.LEGS);
    public static Item red_boots = new ItemMoreArmor("red_boots", ConfigPreInit.DYE_ARMOR_RED, "red", EntityEquipmentSlot.FEET);
    public static Item green_helmet = new ItemMoreArmor("green_helmet", ConfigPreInit.DYE_ARMOR_GREEN, "green", EntityEquipmentSlot.HEAD);
    public static Item green_chestplate = new ItemMoreArmor("green_chestplate", ConfigPreInit.DYE_ARMOR_GREEN, "green", EntityEquipmentSlot.CHEST);
    public static Item green_leggings = new ItemMoreArmor("green_leggings", ConfigPreInit.DYE_ARMOR_GREEN, "green", EntityEquipmentSlot.LEGS);
    public static Item green_boots = new ItemMoreArmor("green_boots", ConfigPreInit.DYE_ARMOR_GREEN, "green", EntityEquipmentSlot.FEET);
    public static Item brown_helmet = new ItemMoreArmor("brown_helmet", ConfigPreInit.DYE_ARMOR_BROWN, "brown", EntityEquipmentSlot.HEAD);
    public static Item brown_chestplate = new ItemMoreArmor("brown_chestplate", ConfigPreInit.DYE_ARMOR_BROWN, "brown", EntityEquipmentSlot.CHEST);
    public static Item brown_leggings = new ItemMoreArmor("brown_leggings", ConfigPreInit.DYE_ARMOR_BROWN, "brown", EntityEquipmentSlot.LEGS);
    public static Item brown_boots = new ItemMoreArmor("brown_boots", ConfigPreInit.DYE_ARMOR_BROWN, "brown", EntityEquipmentSlot.FEET);
    public static Item lapis_helmet = new ItemMoreArmor("lapis_helmet", ConfigPreInit.DYE_ARMOR_BLUE, "lapis", EntityEquipmentSlot.HEAD);
    public static Item lapis_chestplate = new ItemMoreArmor("lapis_chestplate", ConfigPreInit.DYE_ARMOR_BLUE, "lapis", EntityEquipmentSlot.CHEST);
    public static Item lapis_leggings = new ItemMoreArmor("lapis_leggings", ConfigPreInit.DYE_ARMOR_BLUE, "lapis", EntityEquipmentSlot.LEGS);
    public static Item lapis_boots = new ItemMoreArmor("lapis_boots", ConfigPreInit.DYE_ARMOR_BLUE, "lapis", EntityEquipmentSlot.FEET);
    public static Item purple_helmet = new ItemMoreArmor("purple_helmet", ConfigPreInit.DYE_ARMOR_PURPLE, "purple", EntityEquipmentSlot.HEAD);
    public static Item purple_chestplate = new ItemMoreArmor("purple_chestplate", ConfigPreInit.DYE_ARMOR_PURPLE, "purple", EntityEquipmentSlot.CHEST);
    public static Item purple_leggings = new ItemMoreArmor("purple_leggings", ConfigPreInit.DYE_ARMOR_PURPLE, "purple", EntityEquipmentSlot.LEGS);
    public static Item purple_boots = new ItemMoreArmor("purple_boots", ConfigPreInit.DYE_ARMOR_PURPLE, "purple", EntityEquipmentSlot.FEET);
    public static Item cyan_helmet = new ItemMoreArmor("cyan_helmet", ConfigPreInit.DYE_ARMOR_CYAN, "cyan", EntityEquipmentSlot.HEAD);
    public static Item cyan_chestplate = new ItemMoreArmor("cyan_chestplate", ConfigPreInit.DYE_ARMOR_CYAN, "cyan", EntityEquipmentSlot.CHEST);
    public static Item cyan_leggings = new ItemMoreArmor("cyan_leggings", ConfigPreInit.DYE_ARMOR_CYAN, "cyan", EntityEquipmentSlot.LEGS);
    public static Item cyan_boots = new ItemMoreArmor("cyan_boots", ConfigPreInit.DYE_ARMOR_CYAN, "cyan", EntityEquipmentSlot.FEET);
    public static Item light_gray_helmet = new ItemMoreArmor("light_gray_helmet", ConfigPreInit.DYE_ARMOR_SILVER, "light_gray", EntityEquipmentSlot.HEAD);
    public static Item light_gray_chestplate = new ItemMoreArmor("light_gray_chestplate", ConfigPreInit.DYE_ARMOR_SILVER, "light_gray", EntityEquipmentSlot.CHEST);
    public static Item light_gray_leggings = new ItemMoreArmor("light_gray_leggings", ConfigPreInit.DYE_ARMOR_SILVER, "light_gray", EntityEquipmentSlot.LEGS);
    public static Item light_gray_boots = new ItemMoreArmor("light_gray_boots", ConfigPreInit.DYE_ARMOR_SILVER, "light_gray", EntityEquipmentSlot.FEET);
    public static Item gray_helmet = new ItemMoreArmor("gray_helmet", ConfigPreInit.DYE_ARMOR_GRAY, "gray", EntityEquipmentSlot.HEAD);
    public static Item gray_chestplate = new ItemMoreArmor("gray_chestplate", ConfigPreInit.DYE_ARMOR_GRAY, "gray", EntityEquipmentSlot.CHEST);
    public static Item gray_leggings = new ItemMoreArmor("gray_leggings", ConfigPreInit.DYE_ARMOR_GRAY, "gray", EntityEquipmentSlot.LEGS);
    public static Item gray_boots = new ItemMoreArmor("gray_boots", ConfigPreInit.DYE_ARMOR_GRAY, "gray", EntityEquipmentSlot.FEET);
    public static Item pink_helmet = new ItemMoreArmor("pink_helmet", ConfigPreInit.DYE_ARMOR_PINK, "pink", EntityEquipmentSlot.HEAD);
    public static Item pink_chestplate = new ItemMoreArmor("pink_chestplate", ConfigPreInit.DYE_ARMOR_PINK, "pink", EntityEquipmentSlot.CHEST);
    public static Item pink_leggings = new ItemMoreArmor("pink_leggings", ConfigPreInit.DYE_ARMOR_PINK, "pink", EntityEquipmentSlot.LEGS);
    public static Item pink_boots = new ItemMoreArmor("pink_boots", ConfigPreInit.DYE_ARMOR_PINK, "pink", EntityEquipmentSlot.FEET);
    public static Item lime_helmet = new ItemMoreArmor("lime_helmet", ConfigPreInit.DYE_ARMOR_LIME, "lime", EntityEquipmentSlot.HEAD);
    public static Item lime_chestplate = new ItemMoreArmor("lime_chestplate", ConfigPreInit.DYE_ARMOR_LIME, "lime", EntityEquipmentSlot.CHEST);
    public static Item lime_leggings = new ItemMoreArmor("lime_leggings", ConfigPreInit.DYE_ARMOR_LIME, "lime", EntityEquipmentSlot.LEGS);
    public static Item lime_boots = new ItemMoreArmor("lime_boots", ConfigPreInit.DYE_ARMOR_LIME, "lime", EntityEquipmentSlot.FEET);
    public static Item yellow_helmet = new ItemMoreArmor("yellow_helmet", ConfigPreInit.DYE_ARMOR_YELLOW, "yellow", EntityEquipmentSlot.HEAD);
    public static Item yellow_chestplate = new ItemMoreArmor("yellow_chestplate", ConfigPreInit.DYE_ARMOR_YELLOW, "yellow", EntityEquipmentSlot.CHEST);
    public static Item yellow_leggings = new ItemMoreArmor("yellow_leggings", ConfigPreInit.DYE_ARMOR_YELLOW, "yellow", EntityEquipmentSlot.LEGS);
    public static Item yellow_boots = new ItemMoreArmor("yellow_boots", ConfigPreInit.DYE_ARMOR_YELLOW, "yellow", EntityEquipmentSlot.FEET);
    public static Item light_blue_helmet = new ItemMoreArmor("light_blue_helmet", ConfigPreInit.DYE_ARMOR_LIGHT_BLUE, "light_blue", EntityEquipmentSlot.HEAD);
    public static Item light_blue_chestplate = new ItemMoreArmor("light_blue_chestplate", ConfigPreInit.DYE_ARMOR_LIGHT_BLUE, "light_blue", EntityEquipmentSlot.CHEST);
    public static Item light_blue_leggings = new ItemMoreArmor("light_blue_leggings", ConfigPreInit.DYE_ARMOR_LIGHT_BLUE, "light_blue", EntityEquipmentSlot.LEGS);
    public static Item light_blue_boots = new ItemMoreArmor("light_blue_boots", ConfigPreInit.DYE_ARMOR_LIGHT_BLUE, "light_blue", EntityEquipmentSlot.FEET);
    public static Item magenta_helmet = new ItemMoreArmor("magenta_helmet", ConfigPreInit.DYE_ARMOR_MAGENTA, "magenta", EntityEquipmentSlot.HEAD);
    public static Item magenta_chestplate = new ItemMoreArmor("magenta_chestplate", ConfigPreInit.DYE_ARMOR_MAGENTA, "magenta", EntityEquipmentSlot.CHEST);
    public static Item magenta_leggings = new ItemMoreArmor("magenta_leggings", ConfigPreInit.DYE_ARMOR_MAGENTA, "magenta", EntityEquipmentSlot.LEGS);
    public static Item magenta_boots = new ItemMoreArmor("magenta_boots", ConfigPreInit.DYE_ARMOR_MAGENTA, "magenta", EntityEquipmentSlot.FEET);
    public static Item orange_helmet = new ItemMoreArmor("orange_helmet", ConfigPreInit.DYE_ARMOR_ORANGE, "orange", EntityEquipmentSlot.HEAD);
    public static Item orange_chestplate = new ItemMoreArmor("orange_chestplate", ConfigPreInit.DYE_ARMOR_ORANGE, "orange", EntityEquipmentSlot.CHEST);
    public static Item orange_leggings = new ItemMoreArmor("orange_leggings", ConfigPreInit.DYE_ARMOR_ORANGE, "orange", EntityEquipmentSlot.LEGS);
    public static Item orange_boots = new ItemMoreArmor("orange_boots", ConfigPreInit.DYE_ARMOR_ORANGE, "orange", EntityEquipmentSlot.FEET);
    public static Item white_helmet = new ItemMoreArmor("white_helmet", ConfigPreInit.DYE_ARMOR_WHITE, "white", EntityEquipmentSlot.HEAD);
    public static Item white_chestplate = new ItemMoreArmor("white_chestplate", ConfigPreInit.DYE_ARMOR_WHITE, "white", EntityEquipmentSlot.CHEST);
    public static Item white_leggings = new ItemMoreArmor("white_leggings", ConfigPreInit.DYE_ARMOR_WHITE, "white", EntityEquipmentSlot.LEGS);
    public static Item white_boots = new ItemMoreArmor("white_boots", ConfigPreInit.DYE_ARMOR_WHITE, "white", EntityEquipmentSlot.FEET);

    public static void register(IForgeRegistry<Item> registry) {

            registry.registerAll(

                    black_helmet, black_chestplate, black_leggings, black_boots,
                    red_helmet, red_chestplate, red_leggings, red_boots,
                    green_helmet, green_chestplate, green_leggings, green_boots,
                    brown_helmet, brown_chestplate, brown_leggings, brown_boots,
                    lapis_helmet, lapis_chestplate, lapis_leggings, lapis_boots,
                    purple_helmet, purple_chestplate, purple_leggings, purple_boots,
                    cyan_helmet, cyan_chestplate, cyan_leggings, cyan_boots,
                    light_gray_helmet, light_gray_chestplate, light_gray_leggings, light_gray_boots,
                    gray_helmet, gray_chestplate, gray_leggings, gray_boots,
                    pink_helmet, pink_chestplate, pink_leggings, pink_boots,
                    lime_helmet, lime_chestplate, lime_leggings, lime_boots,
                    yellow_helmet, yellow_chestplate, yellow_leggings, yellow_boots,
                    light_blue_helmet, light_blue_chestplate, light_blue_leggings, light_blue_boots,
                    magenta_helmet, magenta_chestplate, magenta_leggings, magenta_boots,
                    orange_helmet, orange_chestplate, orange_leggings, orange_boots,
                    white_helmet, white_chestplate, white_leggings, white_boots

            );
    }

    public static void registerModels() {

        registerItemRender(black_helmet);
        registerItemRender(black_chestplate);
        registerItemRender(black_leggings);
        registerItemRender(black_boots);
        registerItemRender(red_helmet);
        registerItemRender(red_chestplate);
        registerItemRender(red_leggings);
        registerItemRender(red_boots);
        registerItemRender(green_helmet);
        registerItemRender(green_chestplate);
        registerItemRender(green_leggings);
        registerItemRender(green_boots);
        registerItemRender(brown_helmet);
        registerItemRender(brown_chestplate);
        registerItemRender(brown_leggings);
        registerItemRender(brown_boots);
        registerItemRender(lapis_helmet);
        registerItemRender(lapis_chestplate);
        registerItemRender(lapis_leggings);
        registerItemRender(lapis_boots);
        registerItemRender(purple_helmet);
        registerItemRender(purple_chestplate);
        registerItemRender(purple_leggings);
        registerItemRender(purple_boots);
        registerItemRender(cyan_helmet);
        registerItemRender(cyan_chestplate);
        registerItemRender(cyan_leggings);
        registerItemRender(cyan_boots);
        registerItemRender(light_gray_helmet);
        registerItemRender(light_gray_chestplate);
        registerItemRender(light_gray_leggings);
        registerItemRender(light_gray_boots);
        registerItemRender(gray_helmet);
        registerItemRender(gray_chestplate);
        registerItemRender(gray_leggings);
        registerItemRender(gray_boots);
        registerItemRender(pink_helmet);
        registerItemRender(pink_chestplate);
        registerItemRender(pink_leggings);
        registerItemRender(pink_boots);
        registerItemRender(lime_helmet);
        registerItemRender(lime_chestplate);
        registerItemRender(lime_leggings);
        registerItemRender(lime_boots);
        registerItemRender(yellow_helmet);
        registerItemRender(yellow_chestplate);
        registerItemRender(yellow_leggings);
        registerItemRender(yellow_boots);
        registerItemRender(light_blue_helmet);
        registerItemRender(light_blue_chestplate);
        registerItemRender(light_blue_leggings);
        registerItemRender(light_blue_boots);
        registerItemRender(magenta_helmet);
        registerItemRender(magenta_chestplate);
        registerItemRender(magenta_leggings);
        registerItemRender(magenta_boots);
        registerItemRender(orange_helmet);
        registerItemRender(orange_chestplate);
        registerItemRender(orange_leggings);
        registerItemRender(orange_boots);
        registerItemRender(white_helmet);
        registerItemRender(white_chestplate);
        registerItemRender(white_leggings);
        registerItemRender(white_boots);

    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
