package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.blocks.BlockDye;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class ModBlocks {

    public static Block dye_black_block;
    public static Block dye_red_block;
    public static Block dye_green_block;
    public static Block dye_brown_block;
    public static Block dye_purple_block;
    public static Block dye_cyan_block;
    public static Block dye_silver_block;
    public static Block dye_gray_block;
    public static Block dye_pink_block;
    public static Block dye_lime_block;
    public static Block dye_yellow_block;
    public static Block dye_light_blue_block;
    public static Block dye_magenta_block;
    public static Block dye_orange_block;
    public static Block dye_white_block;

    public static Block dye_black_stairs;
    public static Block dye_red_stairs;
    public static Block dye_green_stairs;
    public static Block dye_brown_stairs;
    public static Block dye_blue_stairs;
    public static Block dye_purple_stairs;
    public static Block dye_cyan_stairs;
    public static Block dye_silver_stairs;
    public static Block dye_gray_stairs;
    public static Block dye_pink_stairs;
    public static Block dye_lime_stairs;
    public static Block dye_yellow_stairs;
    public static Block dye_light_blue_stairs;
    public static Block dye_magenta_stairs;
    public static Block dye_orange_stairs;
    public static Block dye_white_stairs;

    public static Block stonebrick_white;
    public static Block stonebrick_orange;
    public static Block stonebrick_magenta;
    public static Block stonebrick_light_blue;
    public static Block stonebrick_yellow;
    public static Block stonebrick_lime;
    public static Block stonebrick_pink;
    public static Block stonebrick_gray;
    public static Block stonebrick_silver;
    public static Block stonebrick_cyan;
    public static Block stonebrick_purple;
    public static Block stonebrick_blue;
    public static Block stonebrick_brown;
    public static Block stonebrick_green;
    public static Block stonebrick_red;
    public static Block stonebrick_black;

    public static Block stonebrick_black_stairs;
    public static Block stonebrick_red_stairs;
    public static Block stonebrick_green_stairs;
    public static Block stonebrick_brown_stairs;
    public static Block stonebrick_blue_stairs;
    public static Block stonebrick_purple_stairs;
    public static Block stonebrick_cyan_stairs;
    public static Block stonebrick_silver_stairs;
    public static Block stonebrick_gray_stairs;
    public static Block stonebrick_pink_stairs;
    public static Block stonebrick_lime_stairs;
    public static Block stonebrick_yellow_stairs;
    public static Block stonebrick_light_blue_stairs;
    public static Block stonebrick_magenta_stairs;
    public static Block stonebrick_orange_stairs;
    public static Block stonebrick_white_stairs;

    public static Block acacia_planks_brick;
    public static Block birch_planks_brick;
    public static Block dark_oak_planks_brick;
    public static Block jungle_planks_brick;
    public static Block oak_planks_brick;
    public static Block spruce_planks_brick;

    public static Block acacia_planks_brick_stairs;
    public static Block birch_planks_brick_stairs;
    public static Block dark_oak_planks_brick_stairs;
    public static Block jungle_planks_brick_stairs;
    public static Block oak_planks_brick_stairs;
    public static Block spruce_planks_brick_stairs;

    public static Block oak_storage_crate;
    public static Block spruce_storage_crate;
    public static Block birch_storage_crate;
    public static Block jungle_storage_crate;
    public static Block big_oak_storage_crate;
    public static Block acacia_storage_crate;

    public static Block dye_ore;
    public static Block ender_pearl_ore;

    public static Block cookie_jar_white;
    public static Block cookie_jar_orange;
    public static Block cookie_jar_magenta;
    public static Block cookie_jar_yellow;
    public static Block cookie_jar_light_blue;
    public static Block cookie_jar_lime;
    public static Block cookie_jar_pink;
    public static Block cookie_jar_gray;
    public static Block cookie_jar_silver;
    public static Block cookie_jar_cyan;
    public static Block cookie_jar_purple;
    public static Block cookie_jar_blue;
    public static Block cookie_jar_brown;
    public static Block cookie_jar_green;
    public static Block cookie_jar_red;
    public static Block cookie_jar_black;

    public static void init() {
        registerBlock(dye_white_block = new BlockDye("dye_white_block"));
        registerBlock(dye_orange_block = new BlockDye("dye_orange_block"));
        registerBlock(dye_magenta_block = new BlockDye("dye_magenta_block"));
        registerBlock(dye_light_blue_block = new BlockDye("dye_light_blue_block"));
        registerBlock(dye_yellow_block = new BlockDye("dye_yellow_block"));
        registerBlock(dye_lime_block = new BlockDye("dye_lime_block"));
        registerBlock(dye_pink_block = new BlockDye("dye_pink_block"));
        registerBlock(dye_gray_block = new BlockDye("dye_gray_block"));
        registerBlock(dye_silver_block = new BlockDye("dye_silver_block"));
        registerBlock(dye_cyan_block = new BlockDye("dye_cyan_block"));
        registerBlock(dye_purple_block = new BlockDye("dye_purple_block"));
        registerBlock(dye_brown_block = new BlockDye("dye_brown_block"));
        registerBlock(dye_green_block = new BlockDye("dye_green_block"));
        registerBlock(dye_red_block = new BlockDye("dye_red_block"));
        registerBlock(dye_black_block = new BlockDye("dye_black_block"));

        registerBlock(dye_white_stairs = new BlockDyeStairs("dye_white_stairs", dye_white_block.getDefaultState()));
        registerBlock(dye_orange_stairs = new BlockDyeStairs("dye_orange_stairs", dye_orange_block.getDefaultState()));
        registerBlock(dye_magenta_stairs = new BlockDyeStairs("dye_magenta_stairs", dye_magenta_block.getDefaultState()));
        registerBlock(dye_light_blue_stairs = new BlockDyeStairs("dye_light_blue_stairs", dye_light_blue_block.getDefaultState()));
        registerBlock(dye_yellow_stairs = new BlockDyeStairs("dye_yellow_stairs", dye_yellow_block.getDefaultState()));
        registerBlock(dye_lime_stairs = new BlockDyeStairs("dye_lime_stairs", dye_lime_block.getDefaultState()));
        registerBlock(dye_pink_stairs = new BlockDyeStairs("dye_pink_stairs", dye_pink_block.getDefaultState()));
        registerBlock(dye_gray_stairs = new BlockDyeStairs("dye_gray_stairs", dye_gray_block.getDefaultState()));
        registerBlock(dye_silver_stairs = new BlockDyeStairs("dye_silver_stairs", dye_silver_block.getDefaultState()));
        registerBlock(dye_cyan_stairs = new BlockDyeStairs("dye_cyan_stairs", dye_cyan_block.getDefaultState()));
        registerBlock(dye_purple_stairs = new BlockDyeStairs("dye_purple_stairs", dye_purple_block.getDefaultState()));
        registerBlock(dye_blue_stairs = new BlockDyeStairs("dye_blue_stairs", Blocks.LAPIS_BLOCK.getDefaultState()));
        registerBlock(dye_brown_stairs = new BlockDyeStairs("dye_brown_stairs", dye_brown_block.getDefaultState()));
        registerBlock(dye_green_stairs = new BlockDyeStairs("dye_green_stairs", dye_green_block.getDefaultState()));
        registerBlock(dye_red_stairs = new BlockDyeStairs("dye_red_stairs", dye_red_block.getDefaultState()));
        registerBlock(dye_black_stairs = new BlockDyeStairs("dye_black_stairs", dye_black_block.getDefaultState()));

        registerBlock(stonebrick_white = new BlockDye("stonebrick_white"));
        registerBlock(stonebrick_orange = new BlockDye("stonebrick_orange"));
        registerBlock(stonebrick_magenta = new BlockDye("stonebrick_magenta"));
        registerBlock(stonebrick_light_blue = new BlockDye("stonebrick_light_blue"));
        registerBlock(stonebrick_yellow = new BlockDye("stonebrick_yellow"));
        registerBlock(stonebrick_lime = new BlockDye("stonebrick_lime"));
        registerBlock(stonebrick_pink = new BlockDye("stonebrick_pink"));
        registerBlock(stonebrick_gray = new BlockDye("stonebrick_gray"));
        registerBlock(stonebrick_silver = new BlockDye("stonebrick_silver"));
        registerBlock(stonebrick_cyan = new BlockDye("stonebrick_cyan"));
        registerBlock(stonebrick_purple = new BlockDye("stonebrick_purple"));
        registerBlock(stonebrick_blue = new BlockDye("stonebrick_blue"));
        registerBlock(stonebrick_green = new BlockDye("stonebrick_green"));
        registerBlock(stonebrick_brown = new BlockDye("stonebrick_brown"));
        registerBlock(stonebrick_red = new BlockDye("stonebrick_red"));
        registerBlock(stonebrick_black = new BlockDye("stonebrick_black"));

        registerBlock(stonebrick_white_stairs = new BlockDyeStairs("stonebrick_white_stairs", stonebrick_white.getDefaultState()));
        registerBlock(stonebrick_orange_stairs = new BlockDyeStairs("stonebrick_orange_stairs", stonebrick_orange.getDefaultState()));
        registerBlock(stonebrick_magenta_stairs = new BlockDyeStairs("stonebrick_magenta_stairs", stonebrick_magenta.getDefaultState()));
        registerBlock(stonebrick_light_blue_stairs = new BlockDyeStairs("stonebrick_light_blue_stairs", stonebrick_light_blue.getDefaultState()));
        registerBlock(stonebrick_yellow_stairs = new BlockDyeStairs("stonebrick_yellow_stairs", stonebrick_yellow.getDefaultState()));
        registerBlock(stonebrick_lime_stairs = new BlockDyeStairs("stonebrick_lime_stairs", stonebrick_lime.getDefaultState()));
        registerBlock(stonebrick_pink_stairs = new BlockDyeStairs("stonebrick_pink_stairs", stonebrick_pink.getDefaultState()));
        registerBlock(stonebrick_gray_stairs = new BlockDyeStairs("stonebrick_gray_stairs", stonebrick_gray.getDefaultState()));
        registerBlock(stonebrick_silver_stairs = new BlockDyeStairs("stonebrick_silver_stairs", stonebrick_silver.getDefaultState()));
        registerBlock(stonebrick_cyan_stairs = new BlockDyeStairs("stonebrick_cyan_stairs", stonebrick_cyan.getDefaultState()));
        registerBlock(stonebrick_purple_stairs = new BlockDyeStairs("stonebrick_purple_stairs", stonebrick_purple.getDefaultState()));
        registerBlock(stonebrick_blue_stairs = new BlockDyeStairs("stonebrick_blue_stairs", stonebrick_blue.getDefaultState()));
        registerBlock(stonebrick_brown_stairs = new BlockDyeStairs("stonebrick_brown_stairs", stonebrick_brown.getDefaultState()));
        registerBlock(stonebrick_green_stairs = new BlockDyeStairs("stonebrick_green_stairs", stonebrick_green.getDefaultState()));
        registerBlock(stonebrick_red_stairs = new BlockDyeStairs("stonebrick_red_stairs", stonebrick_red.getDefaultState()));
        registerBlock(stonebrick_black_stairs = new BlockDyeStairs("stonebrick_black_stairs", stonebrick_black.getDefaultState()));

        registerBlock(oak_planks_brick = new BlockWoodBrickPlanks("oak_planks_brick"));
        registerBlock(spruce_planks_brick = new BlockWoodBrickPlanks("spruce_planks_brick"));
        registerBlock(birch_planks_brick = new BlockWoodBrickPlanks("birch_planks_brick"));
        registerBlock(jungle_planks_brick = new BlockWoodBrickPlanks("jungle_planks_brick"));
        registerBlock(acacia_planks_brick = new BlockWoodBrickPlanks("acacia_planks_brick"));
        registerBlock(dark_oak_planks_brick = new BlockWoodBrickPlanks("dark_oak_planks_brick"));

        registerBlock(oak_planks_brick_stairs = new BlockDyeStairs("oak_planks_brick_stairs", oak_planks_brick.getDefaultState()));
        registerBlock(spruce_planks_brick_stairs = new BlockDyeStairs("spruce_planks_brick_stairs", spruce_planks_brick.getDefaultState()));
        registerBlock(birch_planks_brick_stairs = new BlockDyeStairs("birch_planks_brick_stairs", birch_planks_brick.getDefaultState()));
        registerBlock(jungle_planks_brick_stairs = new BlockDyeStairs("jungle_planks_brick_stairs", jungle_planks_brick.getDefaultState()));
        registerBlock(acacia_planks_brick_stairs = new BlockDyeStairs("acacia_planks_brick_stairs", acacia_planks_brick.getDefaultState()));
        registerBlock(dark_oak_planks_brick_stairs = new BlockDyeStairs("dark_oak_planks_brick_stairs", dark_oak_planks_brick.getDefaultState()));

        registerBlock(oak_storage_crate = new BlockOakCrate("oak_storage_crate"));
        registerBlock(spruce_storage_crate = new BlockSpruceCrate("spruce_storage_crate"));
        registerBlock(birch_storage_crate = new BlockBirchCrate("birch_storage_crate"));
        registerBlock(jungle_storage_crate = new BlockJungleCrate("jungle_storage_crate"));
        registerBlock(acacia_storage_crate = new BlockAcaciaCrate("acacia_storage_crate"));
        registerBlock(big_oak_storage_crate = new BlockBigOakCrate("big_oak_storage_crate"));

        registerBlock(dye_ore = new BlockDyeOre("dye_ore"));
        registerBlock(ender_pearl_ore = new BlockEnderPearlOre("ender_pearl_ore"));

        registerBlock(cookie_jar_white = new BlockJar("cookie_jar_white"));
        registerBlock(cookie_jar_orange = new BlockJar("cookie_jar_orange"));
        registerBlock(cookie_jar_magenta = new BlockJar("cookie_jar_magenta"));
        registerBlock(cookie_jar_light_blue = new BlockJar("cookie_jar_light_blue"));
        registerBlock(cookie_jar_yellow = new BlockJar("cookie_jar_yellow"));
        registerBlock(cookie_jar_lime = new BlockJar("cookie_jar_lime"));
        registerBlock(cookie_jar_pink = new BlockJar("cookie_jar_pink"));
        registerBlock(cookie_jar_gray = new BlockJar("cookie_jar_gray"));
        registerBlock(cookie_jar_silver = new BlockJar("cookie_jar_silver"));
        registerBlock(cookie_jar_cyan = new BlockJar("cookie_jar_cyan"));
        registerBlock(cookie_jar_purple = new BlockJar("cookie_jar_purple"));
        registerBlock(cookie_jar_blue = new BlockJar("cookie_jar_blue"));
        registerBlock(cookie_jar_brown = new BlockJar("cookie_jar_brown"));
        registerBlock(cookie_jar_green = new BlockJar("cookie_jar_green"));
        registerBlock(cookie_jar_red = new BlockJar("cookie_jar_red"));
        registerBlock(cookie_jar_black = new BlockJar("cookie_jar_black"));
    }

    public static void registerRenders() {

        registerRender(dye_black_block);
        registerRender(dye_red_block);
        registerRender(dye_green_block);
        registerRender(dye_brown_block);
        registerRender(dye_purple_block);
        registerRender(dye_cyan_block);
        registerRender(dye_silver_block);
        registerRender(dye_gray_block);
        registerRender(dye_pink_block);
        registerRender(dye_lime_block);
        registerRender(dye_yellow_block);
        registerRender(dye_light_blue_block);
        registerRender(dye_magenta_block);
        registerRender(dye_orange_block);
        registerRender(dye_white_block);

        registerRender(dye_white_stairs);
        registerRender(dye_orange_stairs);
        registerRender(dye_magenta_stairs);
        registerRender(dye_light_blue_stairs);
        registerRender(dye_yellow_stairs);
        registerRender(dye_lime_stairs);
        registerRender(dye_pink_stairs);
        registerRender(dye_gray_stairs);
        registerRender(dye_silver_stairs);
        registerRender(dye_cyan_stairs);
        registerRender(dye_purple_stairs);
        registerRender(dye_blue_stairs);
        registerRender(dye_brown_stairs);
        registerRender(dye_green_stairs);
        registerRender(dye_red_stairs);
        registerRender(dye_black_stairs);

        registerRender(stonebrick_white);
        registerRender(stonebrick_orange);
        registerRender(stonebrick_magenta);
        registerRender(stonebrick_light_blue);
        registerRender(stonebrick_yellow);
        registerRender(stonebrick_lime);
        registerRender(stonebrick_pink);
        registerRender(stonebrick_gray);
        registerRender(stonebrick_silver);
        registerRender(stonebrick_cyan);
        registerRender(stonebrick_purple);
        registerRender(stonebrick_blue);
        registerRender(stonebrick_brown);
        registerRender(stonebrick_green);
        registerRender(stonebrick_red);
        registerRender(stonebrick_black);

        registerRender(stonebrick_white_stairs);
        registerRender(stonebrick_orange_stairs);
        registerRender(stonebrick_magenta_stairs);
        registerRender(stonebrick_light_blue_stairs);
        registerRender(stonebrick_yellow_stairs);
        registerRender(stonebrick_lime_stairs);
        registerRender(stonebrick_pink_stairs);
        registerRender(stonebrick_gray_stairs);
        registerRender(stonebrick_silver_stairs);
        registerRender(stonebrick_cyan_stairs);
        registerRender(stonebrick_purple_stairs);
        registerRender(stonebrick_blue_stairs);
        registerRender(stonebrick_brown_stairs);
        registerRender(stonebrick_green_stairs);
        registerRender(stonebrick_red_stairs);
        registerRender(stonebrick_black_stairs);

        registerRender(acacia_planks_brick);
        registerRender(birch_planks_brick);
        registerRender(dark_oak_planks_brick);
        registerRender(jungle_planks_brick);
        registerRender(oak_planks_brick);
        registerRender(spruce_planks_brick);

        registerRender(acacia_planks_brick_stairs);
        registerRender(birch_planks_brick_stairs);
        registerRender(dark_oak_planks_brick_stairs);
        registerRender(jungle_planks_brick_stairs);
        registerRender(oak_planks_brick_stairs);
        registerRender(spruce_planks_brick_stairs);

        registerRender(dye_ore);
        registerRender(ender_pearl_ore);

        registerRender(cookie_jar_white);
        registerRender(cookie_jar_orange);
        registerRender(cookie_jar_magenta);
        registerRender(cookie_jar_light_blue);
        registerRender(cookie_jar_yellow);
        registerRender(cookie_jar_lime);
        registerRender(cookie_jar_pink);
        registerRender(cookie_jar_gray);
        registerRender(cookie_jar_silver);
        registerRender(cookie_jar_cyan);
        registerRender(cookie_jar_purple);
        registerRender(cookie_jar_blue);
        registerRender(cookie_jar_brown);
        registerRender(cookie_jar_green);
        registerRender(cookie_jar_red);
        registerRender(cookie_jar_black);

        registerRender(oak_storage_crate);
        registerRender(spruce_storage_crate);
        registerRender(birch_storage_crate);
        registerRender(jungle_storage_crate);
        registerRender(big_oak_storage_crate);
        registerRender(acacia_storage_crate);
    }

    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    private static void registerRender(Block item) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(item), 0, new ModelResourceLocation(new ResourceLocation(Strings.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}
