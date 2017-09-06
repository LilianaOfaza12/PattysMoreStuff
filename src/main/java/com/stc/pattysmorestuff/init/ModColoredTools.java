package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.items.tools.*;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModColoredTools {

    public static Item black_pickaxe = new ItemPick("black_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item black_axe = new ItemAx("black_axe", ConfigPreInit.DYE_TOOL);
    public static Item black_shovel = new ItemShovel("black_shovel", ConfigPreInit.DYE_TOOL);
    public static Item black_hoe = new ItemCustomHoe("black_hoe", ConfigPreInit.DYE_TOOL);
    public static Item black_sword = new ItemCustomSword("black_sword", ConfigPreInit.DYE_TOOL);

    public static Item red_pickaxe = new ItemPick("red_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item red_axe = new ItemAx("red_axe", ConfigPreInit.DYE_TOOL);
    public static Item red_shovel = new ItemShovel("red_shovel", ConfigPreInit.DYE_TOOL);
    public static Item red_hoe = new ItemCustomHoe("red_hoe", ConfigPreInit.DYE_TOOL);
    public static Item red_sword = new ItemCustomSword("red_sword", ConfigPreInit.DYE_TOOL);

    public static Item green_pickaxe = new ItemPick("green_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item green_axe = new ItemAx("green_axe", ConfigPreInit.DYE_TOOL);
    public static Item green_shovel = new ItemShovel("green_shovel", ConfigPreInit.DYE_TOOL);
    public static Item green_hoe = new ItemCustomHoe("green_hoe", ConfigPreInit.DYE_TOOL);
    public static Item green_sword = new ItemCustomSword("green_sword", ConfigPreInit.DYE_TOOL);

    public static Item brown_pickaxe = new ItemPick("brown_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item brown_axe = new ItemAx("brown_axe", ConfigPreInit.DYE_TOOL);
    public static Item brown_shovel = new ItemShovel("brown_shovel", ConfigPreInit.DYE_TOOL);
    public static Item brown_hoe = new ItemCustomHoe("brown_hoe", ConfigPreInit.DYE_TOOL);
    public static Item brown_sword = new ItemCustomSword("brown_sword", ConfigPreInit.DYE_TOOL);

    public static Item blue_pickaxe = new ItemPick("blue_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item blue_axe = new ItemAx("blue_axe", ConfigPreInit.DYE_TOOL);
    public static Item blue_shovel = new ItemShovel("blue_shovel", ConfigPreInit.DYE_TOOL);
    public static Item blue_hoe = new ItemCustomHoe("blue_hoe", ConfigPreInit.DYE_TOOL);
    public static Item blue_sword = new ItemCustomSword("blue_sword", ConfigPreInit.DYE_TOOL);

    public static Item purple_pickaxe = new ItemPick("purple_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item purple_axe = new ItemAx("purple_axe", ConfigPreInit.DYE_TOOL);
    public static Item purple_shovel = new ItemShovel("purple_shovel", ConfigPreInit.DYE_TOOL);
    public static Item purple_hoe = new ItemCustomHoe("purple_hoe", ConfigPreInit.DYE_TOOL);
    public static Item purple_sword = new ItemCustomSword("purple_sword", ConfigPreInit.DYE_TOOL);

    public static Item cyan_pickaxe = new ItemPick("cyan_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item cyan_axe = new ItemAx("cyan_axe", ConfigPreInit.DYE_TOOL);
    public static Item cyan_shovel = new ItemShovel("cyan_shovel", ConfigPreInit.DYE_TOOL);
    public static Item cyan_hoe = new ItemCustomHoe("cyan_hoe", ConfigPreInit.DYE_TOOL);
    public static Item cyan_sword = new ItemCustomSword("cyan_sword", ConfigPreInit.DYE_TOOL);

    public static Item lightgray_pickaxe = new ItemPick("lightgray_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item lightgray_axe = new ItemAx("lightgray_axe", ConfigPreInit.DYE_TOOL);
    public static Item lightgray_shovel = new ItemShovel("lightgray_shovel", ConfigPreInit.DYE_TOOL);
    public static Item lightgray_hoe = new ItemCustomHoe("lightgray_hoe", ConfigPreInit.DYE_TOOL);
    public static Item lightgray_sword = new ItemCustomSword("lightgray_sword", ConfigPreInit.DYE_TOOL);

    public static Item gray_pickaxe = new ItemPick("gray_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item gray_axe = new ItemAx("gray_axe", ConfigPreInit.DYE_TOOL);
    public static Item gray_shovel = new ItemShovel("gray_shovel", ConfigPreInit.DYE_TOOL);
    public static Item gray_hoe = new ItemCustomHoe("gray_hoe", ConfigPreInit.DYE_TOOL);
    public static Item gray_sword = new ItemCustomSword("gray_sword", ConfigPreInit.DYE_TOOL);

    public static Item pink_pickaxe = new ItemPick("pink_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item pink_axe = new ItemAx("pink_axe", ConfigPreInit.DYE_TOOL);
    public static Item pink_shovel = new ItemShovel("pink_shovel", ConfigPreInit.DYE_TOOL);
    public static Item pink_hoe = new ItemCustomHoe("pink_hoe", ConfigPreInit.DYE_TOOL);
    public static Item pink_sword = new ItemCustomSword("pink_sword", ConfigPreInit.DYE_TOOL);

    public static Item lime_pickaxe = new ItemPick("lime_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item lime_axe = new ItemAx("lime_axe", ConfigPreInit.DYE_TOOL);
    public static Item lime_shovel = new ItemShovel("lime_shovel", ConfigPreInit.DYE_TOOL);
    public static Item lime_hoe = new ItemCustomHoe("lime_hoe", ConfigPreInit.DYE_TOOL);
    public static Item lime_sword = new ItemCustomSword("lime_sword", ConfigPreInit.DYE_TOOL);

    public static Item yellow_pickaxe = new ItemPick("yellow_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item yellow_axe = new ItemAx("yellow_axe", ConfigPreInit.DYE_TOOL);
    public static Item yellow_shovel = new ItemShovel("yellow_shovel", ConfigPreInit.DYE_TOOL);
    public static Item yellow_hoe = new ItemCustomHoe("yellow_hoe", ConfigPreInit.DYE_TOOL);
    public static Item yellow_sword = new ItemCustomSword("yellow_sword", ConfigPreInit.DYE_TOOL);

    public static Item lightblue_pickaxe = new ItemPick("lightblue_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item lightblue_axe = new ItemAx("lightblue_axe", ConfigPreInit.DYE_TOOL);
    public static Item lightblue_shovel = new ItemShovel("lightblue_shovel", ConfigPreInit.DYE_TOOL);
    public static Item lightblue_hoe = new ItemCustomHoe("lightblue_hoe", ConfigPreInit.DYE_TOOL);
    public static Item lightblue_sword = new ItemCustomSword("lightblue_sword", ConfigPreInit.DYE_TOOL);

    public static Item magenta_pickaxe = new ItemPick("magenta_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item magenta_axe = new ItemAx("magenta_axe", ConfigPreInit.DYE_TOOL);
    public static Item magenta_shovel = new ItemShovel("magenta_shovel", ConfigPreInit.DYE_TOOL);
    public static Item magenta_hoe = new ItemCustomHoe("magenta_hoe", ConfigPreInit.DYE_TOOL);
    public static Item magenta_sword = new ItemCustomSword("magenta_sword", ConfigPreInit.DYE_TOOL);

    public static Item orange_pickaxe = new ItemPick("orange_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item orange_axe = new ItemAx("orange_axe", ConfigPreInit.DYE_TOOL);
    public static Item orange_shovel = new ItemShovel("orange_shovel", ConfigPreInit.DYE_TOOL);
    public static Item orange_hoe = new ItemCustomHoe("orange_hoe", ConfigPreInit.DYE_TOOL);
    public static Item orange_sword = new ItemCustomSword("orange_sword", ConfigPreInit.DYE_TOOL);

    public static Item white_pickaxe = new ItemPick("white_pickaxe", ConfigPreInit.DYE_TOOL);
    public static Item white_axe = new ItemAx("white_axe", ConfigPreInit.DYE_TOOL);
    public static Item white_shovel = new ItemShovel("white_shovel", ConfigPreInit.DYE_TOOL);
    public static Item white_hoe = new ItemCustomHoe("white_hoe", ConfigPreInit.DYE_TOOL);
    public static Item white_sword = new ItemCustomSword("white_sword", ConfigPreInit.DYE_TOOL);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                black_pickaxe, black_axe, black_shovel, black_sword, black_hoe,
                red_pickaxe, red_axe, red_shovel, red_sword, red_hoe,
                green_pickaxe, green_axe, green_shovel, green_sword, green_hoe,
                brown_pickaxe, brown_axe, brown_shovel, brown_sword, brown_hoe,
                blue_pickaxe, blue_axe, blue_shovel, blue_sword, blue_hoe,
                purple_pickaxe, purple_axe, purple_shovel, purple_sword, purple_hoe,
                cyan_pickaxe, cyan_axe, cyan_shovel, cyan_sword, cyan_hoe,
                lightgray_pickaxe, lightgray_axe, lightgray_shovel, lightgray_sword, lightgray_hoe,
                gray_pickaxe, gray_axe, gray_shovel, gray_sword, gray_hoe,
                pink_pickaxe, pink_axe, pink_shovel, pink_sword, pink_hoe,
                lime_pickaxe, lime_axe, lime_shovel, lime_sword, lime_hoe,
                yellow_pickaxe, yellow_axe, yellow_shovel, yellow_sword, yellow_hoe,
                lightblue_pickaxe, lightblue_axe, lightblue_shovel, lightblue_sword, lightblue_hoe,
                magenta_pickaxe, magenta_axe, magenta_shovel, magenta_sword, magenta_hoe,
                orange_pickaxe, orange_axe, orange_shovel, orange_sword, orange_hoe,
                white_pickaxe, white_axe, white_shovel, white_sword, white_hoe

        );
    }

    public static void registerModels() {

        registerItemRender(white_pickaxe);
        registerItemRender(white_axe);
        registerItemRender(white_shovel);
        registerItemRender(white_hoe);
        registerItemRender(white_sword);
        registerItemRender(orange_pickaxe);
        registerItemRender(orange_axe);
        registerItemRender(orange_shovel);
        registerItemRender(orange_hoe);
        registerItemRender(orange_sword);
        registerItemRender(magenta_pickaxe);
        registerItemRender(magenta_axe);
        registerItemRender(magenta_shovel);
        registerItemRender(magenta_hoe);
        registerItemRender(magenta_sword);
        registerItemRender(lightblue_pickaxe);
        registerItemRender(lightblue_axe);
        registerItemRender(lightblue_shovel);
        registerItemRender(lightblue_hoe);
        registerItemRender(lightblue_sword);
        registerItemRender(yellow_pickaxe);
        registerItemRender(yellow_axe);
        registerItemRender(yellow_shovel);
        registerItemRender(yellow_hoe);
        registerItemRender(yellow_sword);
        registerItemRender(lime_pickaxe);
        registerItemRender(lime_axe);
        registerItemRender(lime_shovel);
        registerItemRender(lime_hoe);
        registerItemRender(lime_sword);
        registerItemRender(pink_pickaxe);
        registerItemRender(pink_axe);
        registerItemRender(pink_shovel);
        registerItemRender(pink_hoe);
        registerItemRender(pink_sword);
        registerItemRender(gray_pickaxe);
        registerItemRender(gray_axe);
        registerItemRender(gray_shovel);
        registerItemRender(gray_hoe);
        registerItemRender(gray_sword);
        registerItemRender(lightgray_pickaxe);
        registerItemRender(lightgray_axe);
        registerItemRender(lightgray_shovel);
        registerItemRender(lightgray_hoe);
        registerItemRender(lightgray_sword);
        registerItemRender(cyan_pickaxe);
        registerItemRender(cyan_axe);
        registerItemRender(cyan_shovel);
        registerItemRender(cyan_hoe);
        registerItemRender(cyan_sword);
        registerItemRender(purple_pickaxe);
        registerItemRender(purple_axe);
        registerItemRender(purple_shovel);
        registerItemRender(purple_hoe);
        registerItemRender(purple_sword);
        registerItemRender(blue_pickaxe);
        registerItemRender(blue_axe);
        registerItemRender(blue_shovel);
        registerItemRender(blue_hoe);
        registerItemRender(blue_sword);
        registerItemRender(brown_pickaxe);
        registerItemRender(brown_axe);
        registerItemRender(brown_shovel);
        registerItemRender(brown_hoe);
        registerItemRender(brown_sword);
        registerItemRender(green_pickaxe);
        registerItemRender(green_axe);
        registerItemRender(green_shovel);
        registerItemRender(green_hoe);
        registerItemRender(green_sword);
        registerItemRender(red_pickaxe);
        registerItemRender(red_axe);
        registerItemRender(red_shovel);
        registerItemRender(red_hoe);
        registerItemRender(red_sword);
        registerItemRender(black_pickaxe);
        registerItemRender(black_axe);
        registerItemRender(black_shovel);
        registerItemRender(black_hoe);
        registerItemRender(black_sword);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
