package com.stc.pattysmorestuff.tools.init;

import com.stc.pattysmorestuff.ConfigPreInit;
import com.stc.pattysmorestuff.tools.items.ItemPaxel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class ModToolDyePaxels {

    public static Item black_paxel;
    public static Item red_paxel;
    public static Item green_paxel;
    public static Item brown_paxel;
    public static Item blue_paxel;
    public static Item purple_paxel;
    public static Item cyan_paxel;
    public static Item lightgray_paxel;
    public static Item gray_paxel;
    public static Item pink_paxel;
    public static Item lime_paxel;
    public static Item yellow_paxel;
    public static Item lightblue_paxel;
    public static Item magenta_paxel;
    public static Item orange_paxel;
    public static Item white_paxel;

    public static void init() {
        black_paxel = new ItemPaxel("black_paxel", ConfigPreInit.DYE_PAXEL);
        red_paxel = new ItemPaxel("red_paxel", ConfigPreInit.DYE_PAXEL);
        green_paxel = new ItemPaxel("green_paxel", ConfigPreInit.DYE_PAXEL);
        brown_paxel = new ItemPaxel("brown_paxel", ConfigPreInit.DYE_PAXEL);
        blue_paxel = new ItemPaxel("blue_paxel", ConfigPreInit.DYE_PAXEL);
        purple_paxel = new ItemPaxel("purple_paxel", ConfigPreInit.DYE_PAXEL);
        cyan_paxel = new ItemPaxel("cyan_paxel", ConfigPreInit.DYE_PAXEL);
        lightgray_paxel = new ItemPaxel("lightgray_paxel", ConfigPreInit.DYE_PAXEL);
        gray_paxel = new ItemPaxel("gray_paxel", ConfigPreInit.DYE_PAXEL);
        pink_paxel = new ItemPaxel("pink_paxel", ConfigPreInit.DYE_PAXEL);
        lime_paxel = new ItemPaxel("lime_paxel", ConfigPreInit.DYE_PAXEL);
        yellow_paxel = new ItemPaxel("yellow_paxel", ConfigPreInit.DYE_PAXEL);
        lightblue_paxel = new ItemPaxel("lightblue_paxel", ConfigPreInit.DYE_PAXEL);
        magenta_paxel = new ItemPaxel("magenta_paxel", ConfigPreInit.DYE_PAXEL);
        orange_paxel = new ItemPaxel("orange_paxel", ConfigPreInit.DYE_PAXEL);
        white_paxel = new ItemPaxel("white_paxel", ConfigPreInit.DYE_PAXEL);

        register(black_paxel);
        register(red_paxel);
        register(green_paxel);
        register(brown_paxel);
        register(blue_paxel);
        register(purple_paxel);
        register(cyan_paxel);
        register(lightgray_paxel);
        register(gray_paxel);
        register(pink_paxel);
        register(lime_paxel);
        register(yellow_paxel);
        register(lightblue_paxel);
        register(magenta_paxel);
        register(orange_paxel);
        register(white_paxel);
    }

    public static void register(Item item) {
        GameRegistry.register(item);
    }

    public static void registerRenders() {
        registerRender(black_paxel);
        registerRender(red_paxel);
        registerRender(green_paxel);
        registerRender(brown_paxel);
        registerRender(blue_paxel);
        registerRender(purple_paxel);
        registerRender(cyan_paxel);
        registerRender(lightgray_paxel);
        registerRender(gray_paxel);
        registerRender(pink_paxel);
        registerRender(lime_paxel);
        registerRender(yellow_paxel);
        registerRender(lightblue_paxel);
        registerRender(magenta_paxel);
        registerRender(orange_paxel);
        registerRender(white_paxel);
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }
}
