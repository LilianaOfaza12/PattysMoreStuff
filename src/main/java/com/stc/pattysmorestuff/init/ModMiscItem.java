package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.ItemBase;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

public class ModMiscItem {

    public static Item obsidian_ingot = new ItemBase("obsidian_ingot");


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                obsidian_ingot

        );
    }

    public static void registerModels() {

        registerItemRender(obsidian_ingot);

    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);


    }
}
