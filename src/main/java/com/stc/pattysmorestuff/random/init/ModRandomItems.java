package com.stc.pattysmorestuff.random.init;

import com.stc.pattysmorestuff.random.items.ItemInfWaterBucket;
import com.stc.pattysmorestuff.random.items.ItemTimeWand;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by StuffTheChicken on 31/12/2016.
 */
public class ModRandomItems {

    public static Item inf_water_bucket;
    public static Item time_wand;


    public static void init() {

        inf_water_bucket = new ItemInfWaterBucket("inf_water_bucket", Blocks.FLOWING_WATER);
        time_wand = new ItemTimeWand("time_wand");


        register(inf_water_bucket);
        register(time_wand);
    }

    public static void registerRenders() {

        registerRender(inf_water_bucket);
        registerRender(time_wand);

    }
    public static void register(Item item) {
        GameRegistry.register(item);
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }
}
