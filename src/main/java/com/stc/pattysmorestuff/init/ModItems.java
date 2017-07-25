package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.ItemBase;
import com.stc.pattysmorestuff.items.ItemInfWaterBucket;
import com.stc.pattysmorestuff.items.ItemTimeWand;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 20/07/2017.
 */
public class ModItems {

    public static Item obsidian_ingot = new ItemBase("obsidian_ingot");
    public static Item inf_water_bucket = new ItemInfWaterBucket("inf_water_bucket", Blocks.FLOWING_WATER);
    public static Item time_wand = new ItemTimeWand("time_wand");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                obsidian_ingot,
                inf_water_bucket,
                time_wand

        );
    }

    public static void registerModels() {

        registerItemRender(obsidian_ingot);
        registerItemRender(inf_water_bucket);
        registerItemRender(time_wand);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);


    }

}
