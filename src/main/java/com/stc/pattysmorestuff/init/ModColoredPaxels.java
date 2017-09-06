package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.tools.ItemPaxel;
import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModColoredPaxels {

    public static Item black_paxel = new ItemPaxel("black_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item red_paxel = new ItemPaxel("red_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item green_paxel = new ItemPaxel("green_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item brown_paxel = new ItemPaxel("brown_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item blue_paxel = new ItemPaxel("blue_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item purple_paxel = new ItemPaxel("purple_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item cyan_paxel = new ItemPaxel("cyan_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item lightgray_paxel = new ItemPaxel("lightgray_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item gray_paxel = new ItemPaxel("gray_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item pink_paxel = new ItemPaxel("pink_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item lime_paxel = new ItemPaxel("lime_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item yellow_paxel = new ItemPaxel("yellow_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item lightblue_paxel = new ItemPaxel("lightblue_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item magenta_paxel = new ItemPaxel("magenta_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item orange_paxel = new ItemPaxel("orange_paxel", ConfigPreInit.DYE_PAXEL);
    public static Item white_paxel = new ItemPaxel("white_paxel", ConfigPreInit.DYE_PAXEL);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                black_paxel, red_paxel, green_paxel, brown_paxel, blue_paxel, purple_paxel, cyan_paxel, lightgray_paxel,
                gray_paxel, pink_paxel, lime_paxel, yellow_paxel, lightblue_paxel, magenta_paxel, orange_paxel, white_paxel


        );
    }

    public static void registerModels() {

        registerItemRender(black_paxel);
        registerItemRender(red_paxel);
        registerItemRender(green_paxel);
        registerItemRender(brown_paxel);
        registerItemRender(blue_paxel);
        registerItemRender(purple_paxel);
        registerItemRender(cyan_paxel);
        registerItemRender(lightgray_paxel);
        registerItemRender(gray_paxel);
        registerItemRender(pink_paxel);
        registerItemRender(lime_paxel);
        registerItemRender(yellow_paxel);
        registerItemRender(lightblue_paxel);
        registerItemRender(magenta_paxel);
        registerItemRender(orange_paxel);
        registerItemRender(white_paxel);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
