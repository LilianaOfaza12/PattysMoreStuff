package com.stc.pattysmorestuff.items.init;

import com.stc.pattysmorestuff.items.*;
import com.stc.pattysmorestuff.tools.items.ItemObsidianIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by StuffTheChicken on 10/01/2017.
 */
@GameRegistry.ObjectHolder("pattysmorestuff")
public class ModPMS {

    public static Item obsidian_ingot;
    public static Item ring_of_flight;
    public static Item bat_wings;

    public static Item amulet_haste;
    public static Item amulet_fire;
    public static Item amulet_breath;
    public static Item amulet_jump;
    public static Item amulet_night;
    public static Item amulet_regen;
    public static Item amulet_resist;
    public static Item amulet_speed;
    public static Item amulet_strength;


    public static void init() {

        obsidian_ingot = new ItemObsidianIngot("obsidian_ingot");
        register(obsidian_ingot);

        if(Loader.isModLoaded("baubles")) {
                bat_wings = new ItemBatWing("bat_wings");
                ring_of_flight = new ItemRingOfFlight("ring_of_flight");
                amulet_haste = new ItemAmuletHaste("amulet_haste");
                amulet_fire = new ItemAmuletFire("amulet_fire");
                amulet_breath = new ItemAmuletBreath("amulet_breath");
                amulet_jump = new ItemAmuletJump("amulet_jump");
                amulet_night = new ItemAmuletNight("amulet_night");
                amulet_regen = new ItemAmuletRegen("amulet_regen");
                amulet_resist = new ItemAmuletResist("amulet_resist");
                amulet_speed = new ItemAmuletSpeed("amulet_speed");
                amulet_strength = new ItemAmuletStrength("amulet_strength");
                register(bat_wings);
                register(ring_of_flight);
                register(amulet_haste);
                register(amulet_fire);
                register(amulet_breath);
                register(amulet_jump);
                register(amulet_night);
                register(amulet_regen);
                register(amulet_resist);
                register(amulet_speed);
                register(amulet_strength);
        }
    }

    public static void registerRenders() {

        registerRender(obsidian_ingot);

        if(Loader.isModLoaded("baubles")) {
            registerRender(bat_wings);
            registerRender(ring_of_flight);
            registerRender(amulet_haste);
            registerRender(amulet_fire);
            registerRender(amulet_breath);
            registerRender(amulet_jump);
            registerRender(amulet_night);
            registerRender(amulet_regen);
            registerRender(amulet_resist);
            registerRender(amulet_speed);
            registerRender(amulet_strength);

        }
    }


    public static void register(Item item) {
        GameRegistry.register(item);
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }
}
