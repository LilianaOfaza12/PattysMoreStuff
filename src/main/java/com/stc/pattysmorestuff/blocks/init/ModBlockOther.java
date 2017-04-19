package com.stc.pattysmorestuff.blocks.init;

import com.stc.pattysmorestuff.blocks.BlockDye;
import com.stc.pattysmorestuff.blocks.BlockDyeStonebrick;
import com.stc.pattysmorestuff.blocks.BlockDyeFence;
import com.stc.pattysmorestuff.blocks.BlockDyeFenceGate;
import com.stc.pattysmorestuff.blocks.slabs.*;
import com.stc.pattysmorestuff.blocks.stairs.BlockDyeStairs;
import com.stc.pattysmorestuff.blocks.stairs.BlockStonebrickStairs;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 06/03/2017.
 */
public class ModBlockOther {

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

    public static BlockDyeSlabHalf dye_black_slab_half;
    public static BlockDyeSlabDouble dye_black_slab_double;

    public static BlockDyeSlabHalf dye_red_slab_half;
    public static BlockDyeSlabDouble dye_red_slab_double;

    public static BlockDyeSlabHalf dye_green_slab_half;
    public static BlockDyeSlabDouble dye_green_slab_double;

    public static BlockDyeSlabHalf dye_brown_slab_half;
    public static BlockDyeSlabDouble dye_brown_slab_double;

    public static BlockDyeSlabHalf dye_blue_slab_half;
    public static BlockDyeSlabDouble dye_blue_slab_double;

    public static BlockDyeSlabHalf dye_purple_slab_half;
    public static BlockDyeSlabDouble dye_purple_slab_double;

    public static BlockDyeSlabHalf dye_cyan_slab_half;
    public static BlockDyeSlabDouble dye_cyan_slab_double;

    public static BlockDyeSlabHalf dye_silver_slab_half;
    public static BlockDyeSlabDouble dye_silver_slab_double;

    public static BlockDyeSlabHalf dye_gray_slab_half;
    public static BlockDyeSlabDouble dye_gray_slab_double;

    public static BlockDyeSlabHalf dye_pink_slab_half;
    public static BlockDyeSlabDouble dye_pink_slab_double;

    public static BlockDyeSlabHalf dye_lime_slab_half;
    public static BlockDyeSlabDouble dye_lime_slab_double;

    public static BlockDyeSlabHalf dye_yellow_slab_half;
    public static BlockDyeSlabDouble dye_yellow_slab_double;

    public static BlockDyeSlabHalf dye_light_blue_slab_half;
    public static BlockDyeSlabDouble dye_light_blue_slab_double;

    public static BlockDyeSlabHalf dye_magenta_slab_half;
    public static BlockDyeSlabDouble dye_magenta_slab_double;

    public static BlockDyeSlabHalf dye_orange_slab_half;
    public static BlockDyeSlabDouble dye_orange_slab_double;

    public static BlockDyeSlabHalf dye_white_slab_half;
    public static BlockDyeSlabDouble dye_white_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_black_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_black_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_red_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_red_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_green_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_green_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_brown_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_brown_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_blue_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_blue_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_purple_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_purple_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_cyan_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_cyan_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_silver_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_silver_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_gray_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_gray_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_pink_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_pink_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_lime_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_lime_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_yellow_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_yellow_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_light_blue_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_light_blue_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_magenta_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_magenta_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_orange_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_orange_slab_double;

    public static BlockStonebrickSlabHalf stonebrick_white_slab_half;
    public static BlockStonebrickSlabDouble stonebrick_white_slab_double;

    public static Block dye_black_fence;
    public static Block dye_red_fence;
    public static Block dye_green_fence;
    public static Block dye_brown_fence;
    public static Block dye_blue_fence;
    public static Block dye_purple_fence;
    public static Block dye_cyan_fence;
    public static Block dye_silver_fence;
    public static Block dye_gray_fence;
    public static Block dye_pink_fence;
    public static Block dye_lime_fence;
    public static Block dye_yellow_fence;
    public static Block dye_light_blue_fence;
    public static Block dye_magenta_fence;
    public static Block dye_orange_fence;
    public static Block dye_white_fence;

    public static Block stonebrick_black_fence;
    public static Block stonebrick_red_fence;
    public static Block stonebrick_green_fence;
    public static Block stonebrick_brown_fence;
    public static Block stonebrick_blue_fence;
    public static Block stonebrick_purple_fence;
    public static Block stonebrick_cyan_fence;
    public static Block stonebrick_silver_fence;
    public static Block stonebrick_gray_fence;
    public static Block stonebrick_pink_fence;
    public static Block stonebrick_lime_fence;
    public static Block stonebrick_yellow_fence;
    public static Block stonebrick_light_blue_fence;
    public static Block stonebrick_magenta_fence;
    public static Block stonebrick_orange_fence;
    public static Block stonebrick_white_fence;

    public static BlockDyeFenceGate dye_black_fence_gate;
    public static BlockDyeFenceGate dye_red_fence_gate;
    public static BlockDyeFenceGate dye_green_fence_gate;
    public static BlockDyeFenceGate dye_brown_fence_gate;
    public static BlockDyeFenceGate dye_blue_fence_gate;
    public static BlockDyeFenceGate dye_purple_fence_gate;
    public static BlockDyeFenceGate dye_cyan_fence_gate;
    public static BlockDyeFenceGate dye_silver_fence_gate;
    public static BlockDyeFenceGate dye_gray_fence_gate;
    public static BlockDyeFenceGate dye_pink_fence_gate;
    public static BlockDyeFenceGate dye_lime_fence_gate;
    public static BlockDyeFenceGate dye_yellow_fence_gate;
    public static BlockDyeFenceGate dye_light_blue_fence_gate;
    public static BlockDyeFenceGate dye_magenta_fence_gate;
    public static BlockDyeFenceGate dye_orange_fence_gate;
    public static BlockDyeFenceGate dye_white_fence_gate;

    public static BlockDyeFenceGate stonebrick_black_fence_gate;
    public static BlockDyeFenceGate stonebrick_red_fence_gate;
    public static BlockDyeFenceGate stonebrick_green_fence_gate;
    public static BlockDyeFenceGate stonebrick_brown_fence_gate;
    public static BlockDyeFenceGate stonebrick_blue_fence_gate;
    public static BlockDyeFenceGate stonebrick_purple_fence_gate;
    public static BlockDyeFenceGate stonebrick_cyan_fence_gate;
    public static BlockDyeFenceGate stonebrick_silver_fence_gate;
    public static BlockDyeFenceGate stonebrick_gray_fence_gate;
    public static BlockDyeFenceGate stonebrick_pink_fence_gate;
    public static BlockDyeFenceGate stonebrick_lime_fence_gate;
    public static BlockDyeFenceGate stonebrick_yellow_fence_gate;
    public static BlockDyeFenceGate stonebrick_light_blue_fence_gate;
    public static BlockDyeFenceGate stonebrick_magenta_fence_gate;
    public static BlockDyeFenceGate stonebrick_orange_fence_gate;
    public static BlockDyeFenceGate stonebrick_white_fence_gate;


    public static void init() {


        registerBlock(dye_white_stairs = new BlockDyeStairs("dye_white_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.WHITE)));
        registerBlock(dye_orange_stairs = new BlockDyeStairs("dye_orange_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.ORANGE)));
        registerBlock(dye_magenta_stairs = new BlockDyeStairs("dye_magenta_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.MAGENTA)));
        registerBlock(dye_light_blue_stairs = new BlockDyeStairs("dye_light_blue_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.LIGHT_BLUE)));
        registerBlock(dye_yellow_stairs = new BlockDyeStairs("dye_yellow_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.YELLOW)));
        registerBlock(dye_lime_stairs = new BlockDyeStairs("dye_lime_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.LIME)));
        registerBlock(dye_pink_stairs = new BlockDyeStairs("dye_pink_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.PINK)));
        registerBlock(dye_gray_stairs = new BlockDyeStairs("dye_gray_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.GRAY)));
        registerBlock(dye_silver_stairs = new BlockDyeStairs("dye_silver_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.LIGHT_GRAY)));
        registerBlock(dye_cyan_stairs = new BlockDyeStairs("dye_cyan_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.CYAN)));
        registerBlock(dye_purple_stairs = new BlockDyeStairs("dye_purple_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.PURPLE)));
        registerBlock(dye_blue_stairs = new BlockDyeStairs("dye_blue_stairs", Blocks.LAPIS_BLOCK.getDefaultState()));
        registerBlock(dye_brown_stairs = new BlockDyeStairs("dye_brown_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.BROWN)));
        registerBlock(dye_green_stairs = new BlockDyeStairs("dye_green_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.GREEN)));
        registerBlock(dye_red_stairs = new BlockDyeStairs("dye_red_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.RED)));
        registerBlock(dye_black_stairs = new BlockDyeStairs("dye_black_stairs", ModBlocks.dye_block.getDefaultState().withProperty(BlockDye.TYPE, EnumHandler.BlockType.BLACK)));

        registerBlock(stonebrick_white_stairs = new BlockStonebrickStairs("stonebrick_white_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.WHITE)));
        registerBlock(stonebrick_orange_stairs = new BlockStonebrickStairs("stonebrick_orange_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.ORANGE)));
        registerBlock(stonebrick_magenta_stairs = new BlockStonebrickStairs("stonebrick_magenta_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.MAGENTA)));
        registerBlock(stonebrick_light_blue_stairs = new BlockStonebrickStairs("stonebrick_light_blue_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.LIGHT_BLUE)));
        registerBlock(stonebrick_yellow_stairs = new BlockStonebrickStairs("stonebrick_yellow_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.YELLOW)));
        registerBlock(stonebrick_lime_stairs = new BlockStonebrickStairs("stonebrick_lime_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.LIME)));
        registerBlock(stonebrick_pink_stairs = new BlockStonebrickStairs("stonebrick_pink_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.PINK)));
        registerBlock(stonebrick_gray_stairs = new BlockStonebrickStairs("stonebrick_gray_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.GRAY)));
        registerBlock(stonebrick_silver_stairs = new BlockStonebrickStairs("stonebrick_silver_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.SILVER)));
        registerBlock(stonebrick_cyan_stairs = new BlockStonebrickStairs("stonebrick_cyan_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.CYAN)));
        registerBlock(stonebrick_purple_stairs = new BlockStonebrickStairs("stonebrick_purple_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.PURPLE)));
        registerBlock(stonebrick_blue_stairs = new BlockStonebrickStairs("stonebrick_blue_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.BLUE)));
        registerBlock(stonebrick_brown_stairs = new BlockStonebrickStairs("stonebrick_brown_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.BROWN)));
        registerBlock(stonebrick_green_stairs = new BlockStonebrickStairs("stonebrick_green_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.GREEN)));
        registerBlock(stonebrick_red_stairs = new BlockStonebrickStairs("stonebrick_red_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.RED)));
        registerBlock(stonebrick_black_stairs = new BlockStonebrickStairs("stonebrick_black_stairs", ModBlocks.stonebrick.getDefaultState().withProperty(BlockDyeStonebrick.TYPE, EnumHandler.BrickType.BLACK)));

        dye_black_slab_half = new BlockDyeSlabHalf("dye_black_slab_half");
        dye_black_slab_double = new BlockDyeSlabDouble("dye_black_slab_double");

        dye_red_slab_half = new BlockDyeSlabHalf("dye_red_slab_half");
        dye_red_slab_double = new BlockDyeSlabDouble("dye_red_slab_double");

        dye_green_slab_half = new BlockDyeSlabHalf("dye_green_slab_half");
        dye_green_slab_double = new BlockDyeSlabDouble("dye_green_slab_double");

        dye_brown_slab_half = new BlockDyeSlabHalf("dye_brown_slab_half");
        dye_brown_slab_double = new BlockDyeSlabDouble("dye_brown_slab_double");

        dye_blue_slab_half = new BlockDyeSlabHalf("dye_blue_slab_half");
        dye_blue_slab_double = new BlockDyeSlabDouble("dye_blue_slab_double");

        dye_purple_slab_half = new BlockDyeSlabHalf("dye_purple_slab_half");
        dye_purple_slab_double = new BlockDyeSlabDouble("dye_purple_slab_double");

        dye_cyan_slab_half = new BlockDyeSlabHalf("dye_cyan_slab_half");
        dye_cyan_slab_double = new BlockDyeSlabDouble("dye_cyan_slab_double");

        dye_gray_slab_half = new BlockDyeSlabHalf("dye_gray_slab_half");
        dye_gray_slab_double = new BlockDyeSlabDouble("dye_gray_slab_double");

        dye_silver_slab_half = new BlockDyeSlabHalf("dye_silver_slab_half");
        dye_silver_slab_double = new BlockDyeSlabDouble("dye_silver_slab_double");

        dye_pink_slab_half = new BlockDyeSlabHalf("dye_pink_slab_half");
        dye_pink_slab_double = new BlockDyeSlabDouble("dye_pink_slab_double");

        dye_lime_slab_half = new BlockDyeSlabHalf("dye_lime_slab_half");
        dye_lime_slab_double = new BlockDyeSlabDouble("dye_lime_slab_double");

        dye_yellow_slab_half = new BlockDyeSlabHalf("dye_yellow_slab_half");
        dye_yellow_slab_double = new BlockDyeSlabDouble("dye_yellow_slab_double");

        dye_light_blue_slab_half = new BlockDyeSlabHalf("dye_light_blue_slab_half");
        dye_light_blue_slab_double = new BlockDyeSlabDouble("dye_light_blue_slab_double");

        dye_magenta_slab_half = new BlockDyeSlabHalf("dye_magenta_slab_half");
        dye_magenta_slab_double = new BlockDyeSlabDouble("dye_magenta_slab_double");

        dye_orange_slab_half = new BlockDyeSlabHalf("dye_orange_slab_half");
        dye_orange_slab_double = new BlockDyeSlabDouble("dye_orange_slab_double");

        dye_white_slab_half = new BlockDyeSlabHalf("dye_white_slab_half");
        dye_white_slab_double = new BlockDyeSlabDouble("dye_white_slab_double");

        registerBlock(dye_white_slab_half, new ItemSlab(dye_white_slab_half, dye_white_slab_half, dye_white_slab_double));
        GameRegistry.register(dye_white_slab_double);

        registerBlock(dye_orange_slab_half, new ItemSlab(dye_orange_slab_half, dye_orange_slab_half, dye_orange_slab_double));
        GameRegistry.register(dye_orange_slab_double);

        registerBlock(dye_magenta_slab_half, new ItemSlab(dye_magenta_slab_half, dye_magenta_slab_half, dye_magenta_slab_double));
        GameRegistry.register(dye_magenta_slab_double);

        registerBlock(dye_light_blue_slab_half, new ItemSlab(dye_light_blue_slab_half, dye_light_blue_slab_half, dye_light_blue_slab_double));
        GameRegistry.register(dye_light_blue_slab_double);

        registerBlock(dye_yellow_slab_half, new ItemSlab(dye_yellow_slab_half, dye_yellow_slab_half, dye_yellow_slab_double));
        GameRegistry.register(dye_yellow_slab_double);

        registerBlock(dye_lime_slab_half, new ItemSlab(dye_lime_slab_half, dye_lime_slab_half, dye_lime_slab_double));
        GameRegistry.register(dye_lime_slab_double);

        registerBlock(dye_pink_slab_half, new ItemSlab(dye_pink_slab_half, dye_pink_slab_half, dye_pink_slab_double));
        GameRegistry.register(dye_pink_slab_double);

        registerBlock(dye_silver_slab_half, new ItemSlab(dye_silver_slab_half, dye_silver_slab_half, dye_silver_slab_double));
        GameRegistry.register(dye_silver_slab_double);

        registerBlock(dye_gray_slab_half, new ItemSlab(dye_gray_slab_half, dye_gray_slab_half, dye_gray_slab_double));
        GameRegistry.register(dye_gray_slab_double);

        registerBlock(dye_cyan_slab_half, new ItemSlab(dye_cyan_slab_half, dye_cyan_slab_half, dye_cyan_slab_double));
        GameRegistry.register(dye_cyan_slab_double);

        registerBlock(dye_purple_slab_half, new ItemSlab(dye_purple_slab_half, dye_purple_slab_half, dye_purple_slab_double));
        GameRegistry.register(dye_purple_slab_double);

        registerBlock(dye_blue_slab_half, new ItemSlab(dye_blue_slab_half, dye_blue_slab_half, dye_blue_slab_double));
        GameRegistry.register(dye_blue_slab_double);

        registerBlock(dye_brown_slab_half, new ItemSlab(dye_brown_slab_half, dye_brown_slab_half, dye_brown_slab_double));
        GameRegistry.register(dye_brown_slab_double);

        registerBlock(dye_green_slab_half, new ItemSlab(dye_green_slab_half, dye_green_slab_half, dye_green_slab_double));
        GameRegistry.register(dye_green_slab_double);

        registerBlock(dye_red_slab_half, new ItemSlab(dye_red_slab_half, dye_red_slab_half, dye_red_slab_double));
        GameRegistry.register(dye_red_slab_double);

        registerBlock(dye_black_slab_half, new ItemSlab(dye_black_slab_half, dye_black_slab_half, dye_black_slab_double));
        GameRegistry.register(dye_black_slab_double);

        stonebrick_black_slab_half = new BlockStonebrickSlabHalf("stonebrick_black_slab_half");
        stonebrick_black_slab_double = new BlockStonebrickSlabDouble("stonebrick_black_slab_double");

        stonebrick_red_slab_half = new BlockStonebrickSlabHalf("stonebrick_red_slab_half");
        stonebrick_red_slab_double = new BlockStonebrickSlabDouble("stonebrick_red_slab_double");

        stonebrick_green_slab_half = new BlockStonebrickSlabHalf("stonebrick_green_slab_half");
        stonebrick_green_slab_double = new BlockStonebrickSlabDouble("stonebrick_green_slab_double");

        stonebrick_brown_slab_half = new BlockStonebrickSlabHalf("stonebrick_brown_slab_half");
        stonebrick_brown_slab_double = new BlockStonebrickSlabDouble("stonebrick_brown_slab_double");

        stonebrick_blue_slab_half = new BlockStonebrickSlabHalf("stonebrick_blue_slab_half");
        stonebrick_blue_slab_double = new BlockStonebrickSlabDouble("stonebrick_blue_slab_double");

        stonebrick_purple_slab_half = new BlockStonebrickSlabHalf("stonebrick_purple_slab_half");
        stonebrick_purple_slab_double = new BlockStonebrickSlabDouble("stonebrick_purple_slab_double");

        stonebrick_cyan_slab_half = new BlockStonebrickSlabHalf("stonebrick_cyan_slab_half");
        stonebrick_cyan_slab_double = new BlockStonebrickSlabDouble("stonebrick_cyan_slab_double");

        stonebrick_gray_slab_half = new BlockStonebrickSlabHalf("stonebrick_gray_slab_half");
        stonebrick_gray_slab_double = new BlockStonebrickSlabDouble("stonebrick_gray_slab_double");

        stonebrick_silver_slab_half = new BlockStonebrickSlabHalf("stonebrick_silver_slab_half");
        stonebrick_silver_slab_double = new BlockStonebrickSlabDouble("stonebrick_silver_slab_double");

        stonebrick_pink_slab_half = new BlockStonebrickSlabHalf("stonebrick_pink_slab_half");
        stonebrick_pink_slab_double = new BlockStonebrickSlabDouble("stonebrick_pink_slab_double");

        stonebrick_lime_slab_half = new BlockStonebrickSlabHalf("stonebrick_lime_slab_half");
        stonebrick_lime_slab_double = new BlockStonebrickSlabDouble("stonebrick_lime_slab_double");

        stonebrick_yellow_slab_half = new BlockStonebrickSlabHalf("stonebrick_yellow_slab_half");
        stonebrick_yellow_slab_double = new BlockStonebrickSlabDouble("stonebrick_yellow_slab_double");

        stonebrick_light_blue_slab_half = new BlockStonebrickSlabHalf("stonebrick_light_blue_slab_half");
        stonebrick_light_blue_slab_double = new BlockStonebrickSlabDouble("stonebrick_light_blue_slab_double");

        stonebrick_magenta_slab_half = new BlockStonebrickSlabHalf("stonebrick_magenta_slab_half");
        stonebrick_magenta_slab_double = new BlockStonebrickSlabDouble("stonebrick_magenta_slab_double");

        stonebrick_orange_slab_half = new BlockStonebrickSlabHalf("stonebrick_orange_slab_half");
        stonebrick_orange_slab_double = new BlockStonebrickSlabDouble("stonebrick_orange_slab_double");

        stonebrick_white_slab_half = new BlockStonebrickSlabHalf("stonebrick_white_slab_half");
        stonebrick_white_slab_double = new BlockStonebrickSlabDouble("stonebrick_white_slab_double");

        registerBlock(stonebrick_white_slab_half, new ItemSlab(stonebrick_white_slab_half, stonebrick_white_slab_half, stonebrick_white_slab_double));
        GameRegistry.register(stonebrick_white_slab_double);

        registerBlock(stonebrick_orange_slab_half, new ItemSlab(stonebrick_orange_slab_half, stonebrick_orange_slab_half, stonebrick_orange_slab_double));
        GameRegistry.register(stonebrick_orange_slab_double);

        registerBlock(stonebrick_magenta_slab_half, new ItemSlab(stonebrick_magenta_slab_half, stonebrick_magenta_slab_half, stonebrick_magenta_slab_double));
        GameRegistry.register(stonebrick_magenta_slab_double);

        registerBlock(stonebrick_light_blue_slab_half, new ItemSlab(stonebrick_light_blue_slab_half, stonebrick_light_blue_slab_half, stonebrick_light_blue_slab_double));
        GameRegistry.register(stonebrick_light_blue_slab_double);

        registerBlock(stonebrick_yellow_slab_half, new ItemSlab(stonebrick_yellow_slab_half, stonebrick_yellow_slab_half, stonebrick_yellow_slab_double));
        GameRegistry.register(stonebrick_yellow_slab_double);

        registerBlock(stonebrick_lime_slab_half, new ItemSlab(stonebrick_lime_slab_half, stonebrick_lime_slab_half, stonebrick_lime_slab_double));
        GameRegistry.register(stonebrick_lime_slab_double);

        registerBlock(stonebrick_pink_slab_half, new ItemSlab(stonebrick_pink_slab_half, stonebrick_pink_slab_half, stonebrick_pink_slab_double));
        GameRegistry.register(stonebrick_pink_slab_double);

        registerBlock(stonebrick_silver_slab_half, new ItemSlab(stonebrick_silver_slab_half, stonebrick_silver_slab_half, stonebrick_silver_slab_double));
        GameRegistry.register(stonebrick_silver_slab_double);

        registerBlock(stonebrick_gray_slab_half, new ItemSlab(stonebrick_gray_slab_half, stonebrick_gray_slab_half, stonebrick_gray_slab_double));
        GameRegistry.register(stonebrick_gray_slab_double);

        registerBlock(stonebrick_cyan_slab_half, new ItemSlab(stonebrick_cyan_slab_half, stonebrick_cyan_slab_half, stonebrick_cyan_slab_double));
        GameRegistry.register(stonebrick_cyan_slab_double);

        registerBlock(stonebrick_purple_slab_half, new ItemSlab(stonebrick_purple_slab_half, stonebrick_purple_slab_half, stonebrick_purple_slab_double));
        GameRegistry.register(stonebrick_purple_slab_double);

        registerBlock(stonebrick_blue_slab_half, new ItemSlab(stonebrick_blue_slab_half, stonebrick_blue_slab_half, stonebrick_blue_slab_double));
        GameRegistry.register(stonebrick_blue_slab_double);

        registerBlock(stonebrick_brown_slab_half, new ItemSlab(stonebrick_brown_slab_half, stonebrick_brown_slab_half, stonebrick_brown_slab_double));
        GameRegistry.register(stonebrick_brown_slab_double);

        registerBlock(stonebrick_green_slab_half, new ItemSlab(stonebrick_green_slab_half, stonebrick_green_slab_half, stonebrick_green_slab_double));
        GameRegistry.register(stonebrick_green_slab_double);

        registerBlock(stonebrick_red_slab_half, new ItemSlab(stonebrick_red_slab_half, stonebrick_red_slab_half, stonebrick_red_slab_double));
        GameRegistry.register(stonebrick_red_slab_double);

        registerBlock(stonebrick_black_slab_half, new ItemSlab(stonebrick_black_slab_half, stonebrick_black_slab_half, stonebrick_black_slab_double));
        GameRegistry.register(stonebrick_black_slab_double);

        registerBlock(dye_white_fence = new BlockDyeFence("dye_white_fence"));
        registerBlock(dye_orange_fence = new BlockDyeFence("dye_orange_fence"));
        registerBlock(dye_magenta_fence = new BlockDyeFence("dye_magenta_fence"));
        registerBlock(dye_light_blue_fence = new BlockDyeFence("dye_light_blue_fence"));
        registerBlock(dye_yellow_fence = new BlockDyeFence("dye_yellow_fence"));
        registerBlock(dye_lime_fence = new BlockDyeFence("dye_lime_fence"));
        registerBlock(dye_pink_fence = new BlockDyeFence("dye_pink_fence"));
        registerBlock(dye_gray_fence = new BlockDyeFence("dye_gray_fence"));
        registerBlock(dye_silver_fence = new BlockDyeFence("dye_silver_fence"));
        registerBlock(dye_cyan_fence = new BlockDyeFence("dye_cyan_fence"));
        registerBlock(dye_purple_fence = new BlockDyeFence("dye_purple_fence"));
        registerBlock(dye_blue_fence = new BlockDyeFence("dye_blue_fence"));
        registerBlock(dye_brown_fence = new BlockDyeFence("dye_brown_fence"));
        registerBlock(dye_green_fence = new BlockDyeFence("dye_green_fence"));
        registerBlock(dye_red_fence = new BlockDyeFence("dye_red_fence"));
        registerBlock(dye_black_fence = new BlockDyeFence("dye_black_fence"));

        registerBlock(stonebrick_white_fence = new BlockDyeFence("stonebrick_white_fence"));
        registerBlock(stonebrick_orange_fence = new BlockDyeFence("stonebrick_orange_fence"));
        registerBlock(stonebrick_magenta_fence = new BlockDyeFence("stonebrick_magenta_fence"));
        registerBlock(stonebrick_light_blue_fence = new BlockDyeFence("stonebrick_light_blue_fence"));
        registerBlock(stonebrick_yellow_fence = new BlockDyeFence("stonebrick_yellow_fence"));
        registerBlock(stonebrick_lime_fence = new BlockDyeFence("stonebrick_lime_fence"));
        registerBlock(stonebrick_pink_fence = new BlockDyeFence("stonebrick_pink_fence"));
        registerBlock(stonebrick_gray_fence = new BlockDyeFence("stonebrick_gray_fence"));
        registerBlock(stonebrick_silver_fence = new BlockDyeFence("stonebrick_silver_fence"));
        registerBlock(stonebrick_cyan_fence = new BlockDyeFence("stonebrick_cyan_fence"));
        registerBlock(stonebrick_purple_fence = new BlockDyeFence("stonebrick_purple_fence"));
        registerBlock(stonebrick_blue_fence = new BlockDyeFence("stonebrick_blue_fence"));
        registerBlock(stonebrick_brown_fence = new BlockDyeFence("stonebrick_brown_fence"));
        registerBlock(stonebrick_green_fence = new BlockDyeFence("stonebrick_green_fence"));
        registerBlock(stonebrick_red_fence = new BlockDyeFence("stonebrick_red_fence"));
        registerBlock(stonebrick_black_fence = new BlockDyeFence("stonebrick_black_fence"));

        registerBlock(dye_white_fence_gate = new BlockDyeFenceGate("dye_white_fence_gate"));
        registerBlock(dye_orange_fence_gate = new BlockDyeFenceGate("dye_orange_fence_gate"));
        registerBlock(dye_magenta_fence_gate = new BlockDyeFenceGate("dye_magenta_fence_gate"));
        registerBlock(dye_light_blue_fence_gate = new BlockDyeFenceGate("dye_light_blue_fence_gate"));
        registerBlock(dye_yellow_fence_gate = new BlockDyeFenceGate("dye_yellow_fence_gate"));
        registerBlock(dye_lime_fence_gate = new BlockDyeFenceGate("dye_lime_fence_gate"));
        registerBlock(dye_pink_fence_gate = new BlockDyeFenceGate("dye_pink_fence_gate"));
        registerBlock(dye_gray_fence_gate = new BlockDyeFenceGate("dye_gray_fence_gate"));
        registerBlock(dye_silver_fence_gate = new BlockDyeFenceGate("dye_silver_fence_gate"));
        registerBlock(dye_cyan_fence_gate = new BlockDyeFenceGate("dye_cyan_fence_gate"));
        registerBlock(dye_purple_fence_gate = new BlockDyeFenceGate("dye_purple_fence_gate"));
        registerBlock(dye_blue_fence_gate = new BlockDyeFenceGate("dye_blue_fence_gate"));
        registerBlock(dye_brown_fence_gate = new BlockDyeFenceGate("dye_brown_fence_gate"));
        registerBlock(dye_green_fence_gate = new BlockDyeFenceGate("dye_green_fence_gate"));
        registerBlock(dye_red_fence_gate = new BlockDyeFenceGate("dye_red_fence_gate"));
        registerBlock(dye_black_fence_gate = new BlockDyeFenceGate("dye_black_fence_gate"));

        registerBlock(stonebrick_white_fence_gate = new BlockDyeFenceGate("stonebrick_white_fence_gate"));
        registerBlock(stonebrick_orange_fence_gate = new BlockDyeFenceGate("stonebrick_orange_fence_gate"));
        registerBlock(stonebrick_magenta_fence_gate = new BlockDyeFenceGate("stonebrick_magenta_fence_gate"));
        registerBlock(stonebrick_light_blue_fence_gate = new BlockDyeFenceGate("stonebrick_light_blue_fence_gate"));
        registerBlock(stonebrick_yellow_fence_gate = new BlockDyeFenceGate("stonebrick_yellow_fence_gate"));
        registerBlock(stonebrick_lime_fence_gate = new BlockDyeFenceGate("stonebrick_lime_fence_gate"));
        registerBlock(stonebrick_pink_fence_gate = new BlockDyeFenceGate("stonebrick_pink_fence_gate"));
        registerBlock(stonebrick_gray_fence_gate = new BlockDyeFenceGate("stonebrick_gray_fence_gate"));
        registerBlock(stonebrick_silver_fence_gate = new BlockDyeFenceGate("stonebrick_silver_fence_gate"));
        registerBlock(stonebrick_cyan_fence_gate = new BlockDyeFenceGate("stonebrick_cyan_fence_gate"));
        registerBlock(stonebrick_purple_fence_gate = new BlockDyeFenceGate("stonebrick_purple_fence_gate"));
        registerBlock(stonebrick_blue_fence_gate = new BlockDyeFenceGate("stonebrick_blue_fence_gate"));
        registerBlock(stonebrick_brown_fence_gate = new BlockDyeFenceGate("stonebrick_brown_fence_gate"));
        registerBlock(stonebrick_green_fence_gate = new BlockDyeFenceGate("stonebrick_green_fence_gate"));
        registerBlock(stonebrick_red_fence_gate = new BlockDyeFenceGate("stonebrick_red_fence_gate"));
        registerBlock(stonebrick_black_fence_gate = new BlockDyeFenceGate("stonebrick_black_fence_gate"));
    }

    public static void registerRenders() {
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

        registerRender(dye_black_slab_half);
        registerRender(dye_red_slab_half);
        registerRender(dye_green_slab_half);
        registerRender(dye_brown_slab_half);
        registerRender(dye_blue_slab_half);
        registerRender(dye_purple_slab_half);
        registerRender(dye_cyan_slab_half);
        registerRender(dye_silver_slab_half);
        registerRender(dye_gray_slab_half);
        registerRender(dye_pink_slab_half);
        registerRender(dye_lime_slab_half);
        registerRender(dye_yellow_slab_half);
        registerRender(dye_light_blue_slab_half);
        registerRender(dye_magenta_slab_half);
        registerRender(dye_orange_slab_half);
        registerRender(dye_white_slab_half);

        registerRender(stonebrick_black_slab_half);
        registerRender(stonebrick_red_slab_half);
        registerRender(stonebrick_green_slab_half);
        registerRender(stonebrick_brown_slab_half);
        registerRender(stonebrick_blue_slab_half);
        registerRender(stonebrick_purple_slab_half);
        registerRender(stonebrick_cyan_slab_half);
        registerRender(stonebrick_silver_slab_half);
        registerRender(stonebrick_gray_slab_half);
        registerRender(stonebrick_pink_slab_half);
        registerRender(stonebrick_lime_slab_half);
        registerRender(stonebrick_yellow_slab_half);
        registerRender(stonebrick_light_blue_slab_half);
        registerRender(stonebrick_magenta_slab_half);
        registerRender(stonebrick_orange_slab_half);
        registerRender(stonebrick_white_slab_half);

        registerRender(dye_white_fence);
        registerRender(dye_orange_fence);
        registerRender(dye_magenta_fence);
        registerRender(dye_light_blue_fence);
        registerRender(dye_yellow_fence);
        registerRender(dye_lime_fence);
        registerRender(dye_pink_fence);
        registerRender(dye_gray_fence);
        registerRender(dye_silver_fence);
        registerRender(dye_cyan_fence);
        registerRender(dye_purple_fence);
        registerRender(dye_blue_fence);
        registerRender(dye_brown_fence);
        registerRender(dye_green_fence);
        registerRender(dye_red_fence);
        registerRender(dye_black_fence);

        registerRender(stonebrick_white_fence);
        registerRender(stonebrick_orange_fence);
        registerRender(stonebrick_magenta_fence);
        registerRender(stonebrick_light_blue_fence);
        registerRender(stonebrick_yellow_fence);
        registerRender(stonebrick_lime_fence);
        registerRender(stonebrick_pink_fence);
        registerRender(stonebrick_gray_fence);
        registerRender(stonebrick_silver_fence);
        registerRender(stonebrick_cyan_fence);
        registerRender(stonebrick_purple_fence);
        registerRender(stonebrick_blue_fence);
        registerRender(stonebrick_brown_fence);
        registerRender(stonebrick_green_fence);
        registerRender(stonebrick_red_fence);
        registerRender(stonebrick_black_fence);

        registerRender(dye_white_fence_gate);
        registerRender(dye_orange_fence_gate);
        registerRender(dye_magenta_fence_gate);
        registerRender(dye_light_blue_fence_gate);
        registerRender(dye_yellow_fence_gate);
        registerRender(dye_lime_fence_gate);
        registerRender(dye_pink_fence_gate);
        registerRender(dye_gray_fence_gate);
        registerRender(dye_silver_fence_gate);
        registerRender(dye_cyan_fence_gate);
        registerRender(dye_purple_fence_gate);
        registerRender(dye_blue_fence_gate);
        registerRender(dye_brown_fence_gate);
        registerRender(dye_green_fence_gate);
        registerRender(dye_red_fence_gate);
        registerRender(dye_black_fence_gate);

        registerRender(stonebrick_white_fence_gate);
        registerRender(stonebrick_orange_fence_gate);
        registerRender(stonebrick_magenta_fence_gate);
        registerRender(stonebrick_light_blue_fence_gate);
        registerRender(stonebrick_yellow_fence_gate);
        registerRender(stonebrick_lime_fence_gate);
        registerRender(stonebrick_pink_fence_gate);
        registerRender(stonebrick_gray_fence_gate);
        registerRender(stonebrick_silver_fence_gate);
        registerRender(stonebrick_cyan_fence_gate);
        registerRender(stonebrick_purple_fence_gate);
        registerRender(stonebrick_blue_fence_gate);
        registerRender(stonebrick_brown_fence_gate);
        registerRender(stonebrick_green_fence_gate);
        registerRender(stonebrick_red_fence_gate);
        registerRender(stonebrick_black_fence_gate);
    }

    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }


    public static void registerBlock(Block block, ItemBlock itemBlock) {
        block.setCreativeTab(ModTabs.tabPattysBlocks);
        GameRegistry.register(block);
        GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
    }

    private static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Strings.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }
    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }


}
