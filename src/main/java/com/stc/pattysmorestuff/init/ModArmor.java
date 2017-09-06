package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.armor.ItemMoreArmor;
import com.stc.pattysmorestuff.items.tools.ItemStarArmor;
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
public class ModArmor {

    public static Item nether_star_helmet = new ItemStarArmor("nether_star_helmet", ConfigPreInit.NETHER_STAR_ARMOR, "nether_star", EntityEquipmentSlot.HEAD);
    public static Item nether_star_chestplate = new ItemStarArmor("nether_star_chestplate", ConfigPreInit.NETHER_STAR_ARMOR, "nether_star", EntityEquipmentSlot.CHEST);
    public static Item nether_star_leggings = new ItemStarArmor("nether_star_leggings", ConfigPreInit.NETHER_STAR_ARMOR, "nether_star", EntityEquipmentSlot.LEGS);
    public static Item nether_star_boots = new ItemStarArmor("nether_star_boots", ConfigPreInit.NETHER_STAR_ARMOR, "nether_star", EntityEquipmentSlot.FEET);

    public static Item obsidian_helmet = new ItemMoreArmor("obsidian_helmet", ConfigPreInit.OBSIDIAN_ARMOR, "obsidian", EntityEquipmentSlot.HEAD);
    public static Item obsidian_chestplate = new ItemMoreArmor("obsidian_chestplate", ConfigPreInit.OBSIDIAN_ARMOR, "obsidian", EntityEquipmentSlot.CHEST);
    public static Item obsidian_leggings = new ItemMoreArmor("obsidian_leggings", ConfigPreInit.OBSIDIAN_ARMOR, "obsidian", EntityEquipmentSlot.LEGS);
    public static Item obsidian_boots = new ItemMoreArmor("obsidian_boots", ConfigPreInit.OBSIDIAN_ARMOR, "obsidian", EntityEquipmentSlot.FEET);

    public static Item emerald_helmet = new ItemMoreArmor("emerald_helmet", ConfigPreInit.EMERALD_ARMOR, "emerald", EntityEquipmentSlot.HEAD);
    public static Item emerald_chestplate = new ItemMoreArmor("emerald_chestplate", ConfigPreInit.EMERALD_ARMOR, "emerald", EntityEquipmentSlot.CHEST);
    public static Item emerald_leggings = new ItemMoreArmor("emerald_leggings", ConfigPreInit.EMERALD_ARMOR, "emerald", EntityEquipmentSlot.LEGS);
    public static Item emerald_boots = new ItemMoreArmor("emerald_boots", ConfigPreInit.EMERALD_ARMOR, "emerald", EntityEquipmentSlot.FEET);

    public static Item ender_helmet = new ItemMoreArmor("ender_helmet", ConfigPreInit.ENDER_ARMOR, "ender", EntityEquipmentSlot.HEAD);
    public static Item ender_chestplate = new ItemMoreArmor("ender_chestplate", ConfigPreInit.ENDER_ARMOR, "ender", EntityEquipmentSlot.CHEST);
    public static Item ender_leggings = new ItemMoreArmor("ender_leggings", ConfigPreInit.ENDER_ARMOR, "ender", EntityEquipmentSlot.LEGS);
    public static Item ender_boots = new ItemMoreArmor("ender_boots", ConfigPreInit.ENDER_ARMOR, "ender", EntityEquipmentSlot.FEET);

    public static Item blaze_helmet = new ItemMoreArmor("blaze_helmet", ConfigPreInit.BLAZE_ARMOR, "blaze", EntityEquipmentSlot.HEAD);
    public static Item blaze_chestplate = new ItemMoreArmor("blaze_chestplate", ConfigPreInit.BLAZE_ARMOR, "blaze", EntityEquipmentSlot.CHEST);
    public static Item blaze_leggings = new ItemMoreArmor("blaze_leggings", ConfigPreInit.BLAZE_ARMOR, "blaze", EntityEquipmentSlot.LEGS);
    public static Item blaze_boots = new ItemMoreArmor("blaze_boots", ConfigPreInit.BLAZE_ARMOR, "blaze", EntityEquipmentSlot.FEET);

    public static Item slime_helmet = new ItemMoreArmor("slime_helmet", ConfigPreInit.SLIME_ARMOR, "slime", EntityEquipmentSlot.HEAD);
    public static Item slime_chestplate = new ItemMoreArmor("slime_chestplate", ConfigPreInit.SLIME_ARMOR, "slime", EntityEquipmentSlot.CHEST);
    public static Item slime_leggings = new ItemMoreArmor("slime_leggings", ConfigPreInit.SLIME_ARMOR, "slime", EntityEquipmentSlot.CHEST);
    public static Item slime_boots = new ItemMoreArmor("slime_boots", ConfigPreInit.SLIME_ARMOR, "slime", EntityEquipmentSlot.CHEST);

    public static Item coal_helmet = new ItemMoreArmor("coal_helmet", ConfigPreInit.COAL_ARMOR, "coal", EntityEquipmentSlot.HEAD);
    public static Item coal_chestplate = new ItemMoreArmor("coal_chestplate", ConfigPreInit.COAL_ARMOR, "coal", EntityEquipmentSlot.CHEST);
    public static Item coal_leggings = new ItemMoreArmor("coal_leggings", ConfigPreInit.COAL_ARMOR, "coal", EntityEquipmentSlot.LEGS);
    public static Item coal_boots  = new ItemMoreArmor("coal_boots", ConfigPreInit.COAL_ARMOR, "coal", EntityEquipmentSlot.FEET);

    public static Item quartz_helmet = new ItemMoreArmor("quartz_helmet", ConfigPreInit.QUARTZ_ARMOR, "quartz", EntityEquipmentSlot.HEAD);
    public static Item quartz_chestplate = new ItemMoreArmor("quartz_chestplate", ConfigPreInit.QUARTZ_ARMOR, "quartz", EntityEquipmentSlot.CHEST);
    public static Item quartz_leggings = new ItemMoreArmor("quartz_leggings", ConfigPreInit.QUARTZ_ARMOR, "quartz", EntityEquipmentSlot.LEGS);
    public static Item quartz_boots = new ItemMoreArmor("quartz_boots", ConfigPreInit.QUARTZ_ARMOR, "quartz", EntityEquipmentSlot.FEET);

    public static Item flint_helmet = new ItemMoreArmor("flint_helmet", ConfigPreInit.FLINT_ARMOR, "flint", EntityEquipmentSlot.HEAD);
    public static Item flint_chestplate = new ItemMoreArmor("flint_chestplate", ConfigPreInit.FLINT_ARMOR, "flint", EntityEquipmentSlot.CHEST);
    public static Item flint_leggings = new ItemMoreArmor("flint_leggings", ConfigPreInit.FLINT_ARMOR, "flint", EntityEquipmentSlot.LEGS);
    public static Item flint_boots = new ItemMoreArmor("flint_boots", ConfigPreInit.FLINT_ARMOR, "flint", EntityEquipmentSlot.FEET);

    public static Item gunpowder_helmet = new ItemMoreArmor("gunpowder_helmet", ConfigPreInit.GUNPOWDER_ARMOR, "gunpowder", EntityEquipmentSlot.HEAD);
    public static Item gunpowder_chestplate = new ItemMoreArmor("gunpowder_chestplate", ConfigPreInit.GUNPOWDER_ARMOR, "gunpowder", EntityEquipmentSlot.CHEST);
    public static Item gunpowder_leggings = new ItemMoreArmor("gunpowder_leggings", ConfigPreInit.GUNPOWDER_ARMOR, "gunpowder", EntityEquipmentSlot.LEGS);
    public static Item gunpowder_boots = new ItemMoreArmor("gunpowder_boots", ConfigPreInit.GUNPOWDER_ARMOR, "gunpowder", EntityEquipmentSlot.FEET);

    public static Item glowstone_helmet = new ItemMoreArmor("glowstone_helmet", ConfigPreInit.GLOWSTONE_ARMOR, "glowstone", EntityEquipmentSlot.HEAD);
    public static Item glowstone_chestplate = new ItemMoreArmor("glowstone_chestplate", ConfigPreInit.GLOWSTONE_ARMOR, "glowstone", EntityEquipmentSlot.CHEST);
    public static Item glowstone_leggings = new ItemMoreArmor("glowstone_leggings", ConfigPreInit.GLOWSTONE_ARMOR, "glowstone", EntityEquipmentSlot.LEGS);
    public static Item glowstone_boots = new ItemMoreArmor("glowstone_boots", ConfigPreInit.GLOWSTONE_ARMOR, "glowstone", EntityEquipmentSlot.FEET);

    public static Item brick_helmet = new ItemMoreArmor("brick_helmet", ConfigPreInit.BRICK_ARMOR, "brick", EntityEquipmentSlot.HEAD);
    public static Item brick_chestplate = new ItemMoreArmor("brick_chestplate", ConfigPreInit.BRICK_ARMOR, "brick", EntityEquipmentSlot.CHEST);
    public static Item brick_leggings = new ItemMoreArmor("brick_leggings", ConfigPreInit.BRICK_ARMOR, "brick", EntityEquipmentSlot.LEGS);
    public static Item brick_boots = new ItemMoreArmor("brick_boots", ConfigPreInit.BRICK_ARMOR, "brick", EntityEquipmentSlot.FEET);

    public static Item nether_brick_helmet = new ItemMoreArmor("nether_brick_helmet", ConfigPreInit.NETHER_BRICK_ARMOR, "nether_brick", EntityEquipmentSlot.HEAD);
    public static Item nether_brick_chestplate = new ItemMoreArmor("nether_brick_chestplate", ConfigPreInit.NETHER_BRICK_ARMOR, "nether_brick", EntityEquipmentSlot.CHEST);
    public static Item nether_brick_leggings = new ItemMoreArmor("nether_brick_leggings", ConfigPreInit.NETHER_BRICK_ARMOR, "nether_brick", EntityEquipmentSlot.LEGS);
    public static Item nether_brick_boots = new ItemMoreArmor("nether_brick_boots", ConfigPreInit.NETHER_BRICK_ARMOR, "nether_brick", EntityEquipmentSlot.FEET);

    public static Item redstone_helmet = new ItemMoreArmor("redstone_helmet", ConfigPreInit.REDSTONE_ARMOR, "redstone", EntityEquipmentSlot.HEAD);
    public static Item redstone_chestplate = new ItemMoreArmor("redstone_chestplate", ConfigPreInit.REDSTONE_ARMOR, "redstone", EntityEquipmentSlot.CHEST);
    public static Item redstone_leggings = new ItemMoreArmor("redstone_leggings", ConfigPreInit.REDSTONE_ARMOR, "redstone", EntityEquipmentSlot.LEGS);
    public static Item redstone_boots = new ItemMoreArmor("redstone_boots", ConfigPreInit.REDSTONE_ARMOR, "redstone", EntityEquipmentSlot.FEET);

    public static Item snow_helmet = new ItemMoreArmor("snow_helmet", ConfigPreInit.SNOW_ARMOR, "snow", EntityEquipmentSlot.HEAD);
    public static Item snow_chestplate = new ItemMoreArmor("snow_chestplate", ConfigPreInit.SNOW_ARMOR, "snow", EntityEquipmentSlot.CHEST);
    public static Item snow_leggings = new ItemMoreArmor("snow_leggings", ConfigPreInit.SNOW_ARMOR, "snow", EntityEquipmentSlot.LEGS);
    public static Item snow_boots = new ItemMoreArmor("snow_boots", ConfigPreInit.SNOW_ARMOR, "snow", EntityEquipmentSlot.FEET);

    public static Item magma_cream_helmet = new ItemMoreArmor("magma_cream_helmet", ConfigPreInit.MAGMA_CREAM_ARMOR, "magma_cream", EntityEquipmentSlot.HEAD);
    public static Item magma_cream_chestplate = new ItemMoreArmor("magma_cream_chestplate", ConfigPreInit.MAGMA_CREAM_ARMOR, "magma_cream", EntityEquipmentSlot.CHEST);
    public static Item magma_cream_leggings = new ItemMoreArmor("magma_cream_leggings", ConfigPreInit.MAGMA_CREAM_ARMOR, "magma_cream", EntityEquipmentSlot.CHEST);
    public static Item magma_cream_boots = new ItemMoreArmor("magma_cream_boots", ConfigPreInit.MAGMA_CREAM_ARMOR, "magma_cream", EntityEquipmentSlot.FEET);

    public static Item sandstone_helmet = new ItemMoreArmor("sandstone_helmet", ConfigPreInit.SANDSTONE_ARMOR, "sandstone", EntityEquipmentSlot.HEAD);
    public static Item sandstone_chestplate = new ItemMoreArmor("sandstone_chestplate", ConfigPreInit.SANDSTONE_ARMOR, "sandstone", EntityEquipmentSlot.CHEST);
    public static Item sandstone_leggings = new ItemMoreArmor("sandstone_leggings", ConfigPreInit.SANDSTONE_ARMOR, "sandstone", EntityEquipmentSlot.LEGS);
    public static Item sandstone_boots = new ItemMoreArmor("sandstone_boots", ConfigPreInit.SANDSTONE_ARMOR, "sandstone", EntityEquipmentSlot.FEET);

    public static Item soul_sand_helmet = new ItemMoreArmor("soul_sand_helmet", ConfigPreInit.SOUL_SAND_ARMOR, "soul_sand", EntityEquipmentSlot.HEAD);
    public static Item soul_sand_chestplate = new ItemMoreArmor("soul_sand_chestplate", ConfigPreInit.SOUL_SAND_ARMOR, "soul_sand", EntityEquipmentSlot.CHEST);
    public static Item soul_sand_leggings = new ItemMoreArmor("soul_sand_leggings", ConfigPreInit.SOUL_SAND_ARMOR, "soul_sand", EntityEquipmentSlot.LEGS);
    public static Item soul_sand_boots = new ItemMoreArmor("soul_sand_boots", ConfigPreInit.SOUL_SAND_ARMOR, "soul_sand", EntityEquipmentSlot.FEET);

    public static Item clay_helmet = new ItemMoreArmor("clay_helmet", ConfigPreInit.CLAY_ARMOR, "clay", EntityEquipmentSlot.HEAD);
    public static Item clay_chestplate = new ItemMoreArmor("clay_chestplate", ConfigPreInit.CLAY_ARMOR, "clay", EntityEquipmentSlot.CHEST);
    public static Item clay_leggings = new ItemMoreArmor("clay_leggings", ConfigPreInit.CLAY_ARMOR, "clay", EntityEquipmentSlot.LEGS);
    public static Item clay_boots = new ItemMoreArmor("clay_boots", ConfigPreInit.CLAY_ARMOR, "clay", EntityEquipmentSlot.FEET);

    public static Item red_netherbrick_helmet = new ItemMoreArmor("red_netherbrick_helmet", ConfigPreInit.RED_NETHER_BRICK_ARMOR, "red_nether_brick", EntityEquipmentSlot.HEAD);
    public static Item red_netherbrick_chestplate = new ItemMoreArmor("red_netherbrick_chestplate", ConfigPreInit.RED_NETHER_BRICK_ARMOR, "red_nether_brick", EntityEquipmentSlot.CHEST);
    public static Item red_netherbrick_leggings = new ItemMoreArmor("red_netherbrick_leggings", ConfigPreInit.RED_NETHER_BRICK_ARMOR, "red_nether_brick", EntityEquipmentSlot.LEGS);
    public static Item red_netherbrick_boots = new ItemMoreArmor("red_netherbrick_boots", ConfigPreInit.RED_NETHER_BRICK_ARMOR, "red_nether_brick", EntityEquipmentSlot.FEET);



    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
                nether_star_helmet, nether_star_chestplate, nether_star_leggings, nether_star_boots,
                obsidian_helmet, obsidian_chestplate, obsidian_leggings, obsidian_boots,
                emerald_helmet, emerald_chestplate, emerald_leggings, emerald_boots,
                ender_helmet, ender_chestplate, ender_leggings, ender_boots,
                blaze_helmet, blaze_chestplate, blaze_leggings, blaze_boots,
                slime_helmet, slime_chestplate, slime_leggings, slime_boots,
                coal_helmet, coal_chestplate, coal_leggings, coal_boots,
                quartz_helmet, quartz_chestplate, quartz_leggings, quartz_boots,
                flint_helmet, flint_chestplate, flint_leggings, flint_boots,
                gunpowder_helmet, gunpowder_chestplate, gunpowder_leggings, gunpowder_boots,
                glowstone_helmet, glowstone_chestplate, glowstone_leggings, glowstone_boots,
                brick_helmet, brick_chestplate, brick_leggings, brick_boots,
                nether_brick_helmet, nether_brick_chestplate, nether_brick_leggings, nether_brick_boots,
                redstone_helmet, redstone_chestplate, redstone_leggings, redstone_boots,
                snow_helmet, snow_chestplate, snow_leggings, snow_boots,
                magma_cream_helmet, magma_cream_chestplate, magma_cream_leggings, magma_cream_boots,
                sandstone_helmet, sandstone_chestplate, sandstone_leggings, sandstone_boots,
                soul_sand_helmet, soul_sand_chestplate, soul_sand_leggings, soul_sand_boots,
                clay_helmet, clay_chestplate, clay_leggings, clay_boots,
                red_netherbrick_helmet, red_netherbrick_chestplate, red_netherbrick_leggings, red_netherbrick_boots
        );
    }

    public static void registerModels() {

        registerItemRender(nether_star_helmet);
        registerItemRender(nether_star_chestplate);
        registerItemRender(nether_star_leggings);
        registerItemRender(nether_star_boots);

        registerItemRender(obsidian_helmet);
        registerItemRender(obsidian_chestplate);
        registerItemRender(obsidian_leggings);
        registerItemRender(obsidian_boots);

        registerItemRender(emerald_helmet);
        registerItemRender(emerald_chestplate);
        registerItemRender(emerald_leggings);
        registerItemRender(emerald_boots);

        registerItemRender(ender_helmet);
        registerItemRender(ender_chestplate);
        registerItemRender(ender_leggings);
        registerItemRender(ender_boots);

        registerItemRender(blaze_helmet);
        registerItemRender(blaze_chestplate);
        registerItemRender(blaze_leggings);
        registerItemRender(blaze_boots);

        registerItemRender(slime_helmet);
        registerItemRender(slime_chestplate);
        registerItemRender(slime_leggings);
        registerItemRender(slime_boots);

        registerItemRender(coal_helmet);
        registerItemRender(coal_chestplate);
        registerItemRender(coal_leggings);
        registerItemRender(coal_boots);

        registerItemRender(quartz_helmet);
        registerItemRender(quartz_chestplate);
        registerItemRender(quartz_leggings);
        registerItemRender(quartz_boots);

        registerItemRender(flint_helmet);
        registerItemRender(flint_chestplate);
        registerItemRender(flint_leggings);
        registerItemRender(flint_boots);

        registerItemRender(gunpowder_helmet);
        registerItemRender(gunpowder_chestplate);
        registerItemRender(gunpowder_leggings);
        registerItemRender(gunpowder_boots);

        registerItemRender(glowstone_helmet);
        registerItemRender(glowstone_chestplate);
        registerItemRender(glowstone_leggings);
        registerItemRender(glowstone_boots);

        registerItemRender(brick_helmet);
        registerItemRender(brick_chestplate);
        registerItemRender(brick_leggings);
        registerItemRender(brick_boots);

        registerItemRender(nether_brick_helmet);
        registerItemRender(nether_brick_chestplate);
        registerItemRender(nether_brick_leggings);
        registerItemRender(nether_brick_boots);

        registerItemRender(redstone_helmet);
        registerItemRender(redstone_chestplate);
        registerItemRender(redstone_leggings);
        registerItemRender(redstone_boots);

        registerItemRender(snow_helmet);
        registerItemRender(snow_chestplate);
        registerItemRender(snow_leggings);
        registerItemRender(snow_boots);

        registerItemRender(magma_cream_helmet);
        registerItemRender(magma_cream_chestplate);
        registerItemRender(magma_cream_leggings);
        registerItemRender(magma_cream_boots);

        registerItemRender(sandstone_helmet);
        registerItemRender(sandstone_chestplate);
        registerItemRender(sandstone_leggings);
        registerItemRender(sandstone_boots);

        registerItemRender(soul_sand_helmet);
        registerItemRender(soul_sand_chestplate);
        registerItemRender(soul_sand_leggings);
        registerItemRender(soul_sand_boots);

        registerItemRender(clay_helmet);
        registerItemRender(clay_chestplate);
        registerItemRender(clay_leggings);
        registerItemRender(clay_boots);

        registerItemRender(red_netherbrick_helmet);
        registerItemRender(red_netherbrick_chestplate);
        registerItemRender(red_netherbrick_leggings);
        registerItemRender(red_netherbrick_boots);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
