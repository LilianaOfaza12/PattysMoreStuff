package com.stc.pattysmorestuff;

import com.stc.pattysmorestuff.items.ItemInfoBook;
import com.stc.pattysmorestuff.tools.items.ItemObsidianIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 10/01/2017.
 */
public class ModPMS {

    public static Item obsidian_ingot;
    public static Item info_book;


    public static void init() {

        obsidian_ingot = new ItemObsidianIngot("obsidian_ingot");
        info_book = new ItemInfoBook("info_book");
        register(obsidian_ingot);
        register(info_book);

    }

    public static void registerRenders() {

        registerRender(obsidian_ingot);
        registerRender(info_book);

    }


    public static void register(Item item) {
        GameRegistry.register(item);
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }
}
