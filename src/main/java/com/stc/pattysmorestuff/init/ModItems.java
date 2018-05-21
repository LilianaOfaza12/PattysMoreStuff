package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.*;
import com.stc.pattysmorestuff.items.food.ItemKnife;
import com.stc.pattysmorestuff.items.wands.ItemLightWand;
import com.stc.pattysmorestuff.items.wands.ItemTimeWand;
import com.stc.pattysmorestuff.items.wands.ItemWeatherWand;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ModItems {

    public static Item inf_water_bucket = new ItemInfWaterBucket("inf_water_bucket", Blocks.FLOWING_WATER);
    public static Item inf_lava_bucket = new ItemInfLavaBucket("inf_lava_bucket", Blocks.FLOWING_LAVA);
    public static Item time_wand = new ItemTimeWand("time_wand");
    public static Item light_wand = new ItemLightWand("light_wand");
    public static Item weather_wand = new ItemWeatherWand("weather_wand");
    public static Item iron_knife = new ItemKnife("iron_knife");


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                inf_water_bucket,
                inf_lava_bucket,
                time_wand,
                light_wand,
                weather_wand,
                iron_knife.setContainerItem(iron_knife)

        );
    }

    public static void registerModels() {

        registerItemRender(inf_water_bucket);
        registerItemRender(inf_lava_bucket);
        registerItemRender(time_wand);
        registerItemRender(light_wand);
        registerItemRender(weather_wand);
        registerItemRender(iron_knife);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);


    }

}
