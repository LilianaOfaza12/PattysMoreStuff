package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.blocks.stairs.BlockColoredStairs;
import com.stc.pattysmorestuff.blocks.colored.BlockDye;
import com.stc.pattysmorestuff.blocks.colored.BlockStonebrick;
import com.stc.pattysmorestuff.blocks.stairs.BlockGlassStairs;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by StuffTheChicken on 02/08/2017.
 */
public class ModColoredBlocks {

    public static BlockDye dye_block_black = new BlockDye("dye_block_black");
    public static BlockDye dye_block_red = new BlockDye("dye_block_red");
    public static BlockDye dye_block_green = new BlockDye("dye_block_green");
    public static BlockDye dye_block_brown = new BlockDye("dye_block_brown");
    public static BlockDye dye_block_purple = new BlockDye("dye_block_purple");
    public static BlockDye dye_block_cyan = new BlockDye("dye_block_cyan");
    public static BlockDye dye_block_light_gray = new BlockDye("dye_block_light_gray");
    public static BlockDye dye_block_gray = new BlockDye("dye_block_gray");
    public static BlockDye dye_block_pink = new BlockDye("dye_block_pink");
    public static BlockDye dye_block_lime = new BlockDye("dye_block_lime");
    public static BlockDye dye_block_yellow = new BlockDye("dye_block_yellow");
    public static BlockDye dye_block_light_blue = new BlockDye("dye_block_light_blue");
    public static BlockDye dye_block_magenta = new BlockDye("dye_block_magenta");
    public static BlockDye dye_block_orange = new BlockDye("dye_block_orange");
    public static BlockDye dye_block_white = new BlockDye("dye_block_white");

    public static BlockColoredStairs dye_white_stairs  = new BlockColoredStairs("dye_white_stairs", dye_block_white.getDefaultState());
    public static BlockColoredStairs dye_orange_stairs  = new BlockColoredStairs("dye_orange_stairs", dye_block_orange.getDefaultState());
    public static BlockColoredStairs dye_magenta_stairs  = new BlockColoredStairs("dye_magenta_stairs", dye_block_magenta.getDefaultState());
    public static BlockColoredStairs dye_light_blue_stairs  = new BlockColoredStairs("dye_light_blue_stairs", dye_block_light_blue.getDefaultState());
    public static BlockColoredStairs dye_yellow_stairs  = new BlockColoredStairs("dye_yellow_stairs", dye_block_yellow.getDefaultState());
    public static BlockColoredStairs dye_lime_stairs  = new BlockColoredStairs("dye_lime_stairs", dye_block_lime.getDefaultState());
    public static BlockColoredStairs dye_pink_stairs  = new BlockColoredStairs("dye_pink_stairs", dye_block_pink.getDefaultState());
    public static BlockColoredStairs dye_gray_stairs  = new BlockColoredStairs("dye_gray_stairs", dye_block_gray.getDefaultState());
    public static BlockColoredStairs dye_silver_stairs  = new BlockColoredStairs("dye_silver_stairs", dye_block_light_gray.getDefaultState());
    public static BlockColoredStairs dye_cyan_stairs  = new BlockColoredStairs("dye_cyan_stairs", dye_block_cyan.getDefaultState());
    public static BlockColoredStairs dye_purple_stairs  = new BlockColoredStairs("dye_purple_stairs", dye_block_purple.getDefaultState());
    public static BlockColoredStairs dye_blue_stairs  = new BlockColoredStairs("dye_blue_stairs", Blocks.LAPIS_BLOCK.getDefaultState());
    public static BlockColoredStairs dye_brown_stairs  = new BlockColoredStairs("dye_brown_stairs", dye_block_brown.getDefaultState());
    public static BlockColoredStairs dye_green_stairs  = new BlockColoredStairs("dye_green_stairs", dye_block_green.getDefaultState());
    public static BlockColoredStairs dye_red_stairs  = new BlockColoredStairs("dye_red_stairs", dye_block_red.getDefaultState());
    public static BlockColoredStairs dye_black_stairs  = new BlockColoredStairs("dye_black_stairs", dye_block_black.getDefaultState());

    public static BlockStonebrick stonebrick_black = new BlockStonebrick("stonebrick_black");
    public static BlockStonebrick stonebrick_red = new BlockStonebrick("stonebrick_red");
    public static BlockStonebrick stonebrick_green = new BlockStonebrick("stonebrick_green");
    public static BlockStonebrick stonebrick_brown = new BlockStonebrick("stonebrick_brown");
    public static BlockStonebrick stonebrick_blue = new BlockStonebrick("stonebrick_blue");
    public static BlockStonebrick stonebrick_purple = new BlockStonebrick("stonebrick_purple");
    public static BlockStonebrick stonebrick_cyan = new BlockStonebrick("stonebrick_cyan");
    public static BlockStonebrick stonebrick_silver = new BlockStonebrick("stonebrick_silver");
    public static BlockStonebrick stonebrick_gray = new BlockStonebrick("stonebrick_gray");
    public static BlockStonebrick stonebrick_pink = new BlockStonebrick("stonebrick_pink");
    public static BlockStonebrick stonebrick_lime = new BlockStonebrick("stonebrick_lime");
    public static BlockStonebrick stonebrick_yellow = new BlockStonebrick("stonebrick_yellow");
    public static BlockStonebrick stonebrick_light_blue = new BlockStonebrick("stonebrick_light_blue");
    public static BlockStonebrick stonebrick_magenta = new BlockStonebrick("stonebrick_magenta");
    public static BlockStonebrick stonebrick_orange = new BlockStonebrick("stonebrick_orange");
    public static BlockStonebrick stonebrick_white = new BlockStonebrick("stonebrick_white");

    public static BlockColoredStairs stonebrick_white_stairs  = new BlockColoredStairs("stonebrick_white_stairs", stonebrick_white.getDefaultState());
    public static BlockColoredStairs stonebrick_orange_stairs  = new BlockColoredStairs("stonebrick_orange_stairs", stonebrick_orange.getDefaultState());
    public static BlockColoredStairs stonebrick_magenta_stairs  = new BlockColoredStairs("stonebrick_magenta_stairs", stonebrick_magenta.getDefaultState());
    public static BlockColoredStairs stonebrick_light_blue_stairs  = new BlockColoredStairs("stonebrick_light_blue_stairs", stonebrick_light_blue.getDefaultState());
    public static BlockColoredStairs stonebrick_yellow_stairs  = new BlockColoredStairs("stonebrick_yellow_stairs", stonebrick_yellow.getDefaultState());
    public static BlockColoredStairs stonebrick_lime_stairs  = new BlockColoredStairs("stonebrick_lime_stairs", stonebrick_lime.getDefaultState());
    public static BlockColoredStairs stonebrick_pink_stairs  = new BlockColoredStairs("stonebrick_pink_stairs", stonebrick_pink.getDefaultState());
    public static BlockColoredStairs stonebrick_gray_stairs  = new BlockColoredStairs("stonebrick_gray_stairs", stonebrick_gray.getDefaultState());
    public static BlockColoredStairs stonebrick_silver_stairs  = new BlockColoredStairs("stonebrick_silver_stairs", stonebrick_silver.getDefaultState());
    public static BlockColoredStairs stonebrick_cyan_stairs  = new BlockColoredStairs("stonebrick_cyan_stairs", stonebrick_cyan.getDefaultState());
    public static BlockColoredStairs stonebrick_purple_stairs  = new BlockColoredStairs("stonebrick_purple_stairs", stonebrick_purple.getDefaultState());
    public static BlockColoredStairs stonebrick_blue_stairs  = new BlockColoredStairs("stonebrick_blue_stairs", stonebrick_blue.getDefaultState());
    public static BlockColoredStairs stonebrick_brown_stairs  = new BlockColoredStairs("stonebrick_brown_stairs", stonebrick_brown.getDefaultState());
    public static BlockColoredStairs stonebrick_green_stairs  = new BlockColoredStairs("stonebrick_green_stairs", stonebrick_green.getDefaultState());
    public static BlockColoredStairs stonebrick_red_stairs  = new BlockColoredStairs("stonebrick_red_stairs", stonebrick_red.getDefaultState());
    public static BlockColoredStairs stonebrick_black_stairs  = new BlockColoredStairs("stonebrick_black_stairs", stonebrick_black.getDefaultState());

    public static BlockColoredStairs concrete_white_stairs  = new BlockColoredStairs("concrete_white_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
    public static BlockColoredStairs concrete_orange_stairs  = new BlockColoredStairs("concrete_orange_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
    public static BlockColoredStairs concrete_magenta_stairs  = new BlockColoredStairs("concrete_magenta_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
    public static BlockColoredStairs concrete_light_blue_stairs  = new BlockColoredStairs("concrete_light_blue_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
    public static BlockColoredStairs concrete_yellow_stairs  = new BlockColoredStairs("concrete_yellow_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
    public static BlockColoredStairs concrete_lime_stairs  = new BlockColoredStairs("concrete_lime_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
    public static BlockColoredStairs concrete_pink_stairs  = new BlockColoredStairs("concrete_pink_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
    public static BlockColoredStairs concrete_gray_stairs  = new BlockColoredStairs("concrete_gray_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
    public static BlockColoredStairs concrete_silver_stairs  = new BlockColoredStairs("concrete_silver_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
    public static BlockColoredStairs concrete_cyan_stairs  = new BlockColoredStairs("concrete_cyan_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
    public static BlockColoredStairs concrete_purple_stairs  = new BlockColoredStairs("concrete_purple_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
    public static BlockColoredStairs concrete_blue_stairs  = new BlockColoredStairs("concrete_blue_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
    public static BlockColoredStairs concrete_brown_stairs  = new BlockColoredStairs("concrete_brown_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
    public static BlockColoredStairs concrete_green_stairs  = new BlockColoredStairs("concrete_green_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
    public static BlockColoredStairs concrete_red_stairs  = new BlockColoredStairs("concrete_red_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
    public static BlockColoredStairs concrete_black_stairs  = new BlockColoredStairs("concrete_black_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

    public static BlockColoredStairs wool_white_stairs = new BlockColoredStairs("wool_white_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
    public static BlockColoredStairs wool_orange_stairs = new BlockColoredStairs("wool_orange_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
    public static BlockColoredStairs wool_magenta_stairs = new BlockColoredStairs("wool_magenta_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
    public static BlockColoredStairs wool_light_blue_stairs = new BlockColoredStairs("wool_light_blue_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
    public static BlockColoredStairs wool_yellow_stairs = new BlockColoredStairs("wool_yellow_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
    public static BlockColoredStairs wool_lime_stairs = new BlockColoredStairs("wool_lime_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
    public static BlockColoredStairs wool_pink_stairs = new BlockColoredStairs("wool_pink_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
    public static BlockColoredStairs wool_gray_stairs = new BlockColoredStairs("wool_gray_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
    public static BlockColoredStairs wool_silver_stairs = new BlockColoredStairs("wool_silver_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
    public static BlockColoredStairs wool_cyan_stairs = new BlockColoredStairs("wool_cyan_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
    public static BlockColoredStairs wool_purple_stairs = new BlockColoredStairs("wool_purple_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
    public static BlockColoredStairs wool_blue_stairs = new BlockColoredStairs("wool_blue_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
    public static BlockColoredStairs wool_brown_stairs = new BlockColoredStairs("wool_brown_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
    public static BlockColoredStairs wool_green_stairs = new BlockColoredStairs("wool_green_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
    public static BlockColoredStairs wool_red_stairs = new BlockColoredStairs("wool_red_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
    public static BlockColoredStairs wool_black_stairs = new BlockColoredStairs("wool_black_stairs", Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

    public static BlockColoredStairs clay_white_stairs = new BlockColoredStairs("clay_white_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
    public static BlockColoredStairs clay_orange_stairs = new BlockColoredStairs("clay_orange_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
    public static BlockColoredStairs clay_magenta_stairs = new BlockColoredStairs("clay_magenta_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
    public static BlockColoredStairs clay_light_blue_stairs = new BlockColoredStairs("clay_light_blue_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
    public static BlockColoredStairs clay_yellow_stairs = new BlockColoredStairs("clay_yellow_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
    public static BlockColoredStairs clay_lime_stairs = new BlockColoredStairs("clay_lime_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
    public static BlockColoredStairs clay_pink_stairs = new BlockColoredStairs("clay_pink_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
    public static BlockColoredStairs clay_gray_stairs = new BlockColoredStairs("clay_gray_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
    public static BlockColoredStairs clay_silver_stairs = new BlockColoredStairs("clay_silver_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
    public static BlockColoredStairs clay_cyan_stairs = new BlockColoredStairs("clay_cyan_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
    public static BlockColoredStairs clay_purple_stairs = new BlockColoredStairs("clay_purple_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
    public static BlockColoredStairs clay_blue_stairs = new BlockColoredStairs("clay_blue_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
    public static BlockColoredStairs clay_brown_stairs = new BlockColoredStairs("clay_brown_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
    public static BlockColoredStairs clay_green_stairs = new BlockColoredStairs("clay_green_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
    public static BlockColoredStairs clay_red_stairs = new BlockColoredStairs("clay_red_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
    public static BlockColoredStairs clay_black_stairs = new BlockColoredStairs("clay_black_stairs", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

    public static BlockGlassStairs glass_white_stairs = new BlockGlassStairs("glass_white_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
    public static BlockGlassStairs glass_orange_stairs = new BlockGlassStairs("glass_orange_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
    public static BlockGlassStairs glass_magenta_stairs = new BlockGlassStairs("glass_magenta_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
    public static BlockGlassStairs glass_light_blue_stairs = new BlockGlassStairs("glass_light_blue_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
    public static BlockGlassStairs glass_yellow_stairs = new BlockGlassStairs("glass_yellow_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
    public static BlockGlassStairs glass_lime_stairs = new BlockGlassStairs("glass_lime_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
    public static BlockGlassStairs glass_pink_stairs = new BlockGlassStairs("glass_pink_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
    public static BlockGlassStairs glass_gray_stairs = new BlockGlassStairs("glass_gray_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
    public static BlockGlassStairs glass_silver_stairs = new BlockGlassStairs("glass_silver_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
    public static BlockGlassStairs glass_cyan_stairs = new BlockGlassStairs("glass_cyan_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
    public static BlockGlassStairs glass_purple_stairs = new BlockGlassStairs("glass_purple_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
    public static BlockGlassStairs glass_blue_stairs = new BlockGlassStairs("glass_blue_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
    public static BlockGlassStairs glass_brown_stairs = new BlockGlassStairs("glass_brown_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
    public static BlockGlassStairs glass_green_stairs = new BlockGlassStairs("glass_green_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
    public static BlockGlassStairs glass_red_stairs = new BlockGlassStairs("glass_red_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
    public static BlockGlassStairs glass_black_stairs = new BlockGlassStairs("glass_black_stairs", Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

    public static void registerBlocks(final IForgeRegistry<Block> event) {
        final Block[] blocks = {
            dye_block_white, dye_block_orange, dye_block_magenta, dye_block_light_blue, dye_block_yellow,
                dye_block_lime, dye_block_pink, dye_block_light_gray, dye_block_gray,
                dye_block_cyan, dye_block_purple, dye_block_brown, dye_block_green,
                dye_block_red, dye_block_black, dye_white_stairs, dye_orange_stairs,
                dye_magenta_stairs, dye_light_blue_stairs, dye_yellow_stairs,
                dye_lime_stairs, dye_pink_stairs, dye_gray_stairs, dye_silver_stairs,
                dye_cyan_stairs, dye_purple_stairs, dye_blue_stairs, dye_brown_stairs,
                dye_green_stairs, dye_red_stairs, dye_black_stairs, stonebrick_white,
                stonebrick_orange, stonebrick_magenta, stonebrick_light_blue,
                stonebrick_yellow, stonebrick_lime, stonebrick_pink,
                stonebrick_silver, stonebrick_gray, stonebrick_cyan,
                stonebrick_purple, stonebrick_blue ,stonebrick_brown, stonebrick_green,
                stonebrick_red, stonebrick_black, stonebrick_white_stairs,
                stonebrick_orange_stairs, stonebrick_magenta_stairs, stonebrick_light_blue_stairs,
                stonebrick_yellow_stairs, stonebrick_lime_stairs, stonebrick_pink_stairs,
                stonebrick_gray_stairs, stonebrick_silver_stairs, stonebrick_cyan_stairs,
                stonebrick_purple_stairs, stonebrick_blue_stairs, stonebrick_brown_stairs,
                stonebrick_green_stairs, stonebrick_red_stairs, stonebrick_black_stairs,
                concrete_white_stairs, concrete_orange_stairs, concrete_magenta_stairs,
                concrete_light_blue_stairs, concrete_yellow_stairs, concrete_lime_stairs,
                concrete_pink_stairs, concrete_gray_stairs, concrete_silver_stairs,
                concrete_cyan_stairs, concrete_purple_stairs, concrete_blue_stairs,
                concrete_brown_stairs, concrete_green_stairs, concrete_red_stairs,
                concrete_black_stairs, wool_white_stairs, wool_orange_stairs,
                wool_magenta_stairs, wool_light_blue_stairs, wool_yellow_stairs,
                wool_lime_stairs, wool_pink_stairs, wool_gray_stairs, wool_silver_stairs,
                wool_cyan_stairs, wool_purple_stairs, wool_blue_stairs, wool_brown_stairs,
                wool_green_stairs, wool_red_stairs, wool_black_stairs, clay_white_stairs, clay_orange_stairs,
                clay_magenta_stairs, clay_light_blue_stairs, clay_yellow_stairs,
                clay_lime_stairs, clay_pink_stairs, clay_gray_stairs, clay_silver_stairs,
                clay_cyan_stairs, clay_purple_stairs, clay_blue_stairs, clay_brown_stairs,
                clay_green_stairs, clay_red_stairs, clay_black_stairs, glass_white_stairs, glass_orange_stairs,
                glass_magenta_stairs, glass_light_blue_stairs, glass_yellow_stairs,
                glass_lime_stairs, glass_pink_stairs, glass_gray_stairs, glass_silver_stairs,
                glass_cyan_stairs, glass_purple_stairs, glass_blue_stairs, glass_brown_stairs,
                glass_green_stairs, glass_red_stairs, glass_black_stairs

        };
        event.registerAll(blocks);
    }


    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(

                dye_block_white.createItemBlock(),
                dye_block_orange.createItemBlock(),
                dye_block_magenta.createItemBlock(),
                dye_block_light_blue.createItemBlock(),
                dye_block_yellow.createItemBlock(),
                dye_block_lime.createItemBlock(),
                dye_block_pink.createItemBlock(),
                dye_block_light_gray.createItemBlock(),
                dye_block_gray.createItemBlock(),
                dye_block_cyan.createItemBlock(),
                dye_block_purple.createItemBlock(),
                dye_block_brown.createItemBlock(),
                dye_block_green.createItemBlock(),
                dye_block_red.createItemBlock(),
                dye_block_black.createItemBlock(),

                dye_white_stairs.createItemBlock(),
                dye_orange_stairs.createItemBlock(),
                dye_magenta_stairs.createItemBlock(),
                dye_light_blue_stairs.createItemBlock(),
                dye_yellow_stairs.createItemBlock(),
                dye_lime_stairs.createItemBlock(),
                dye_pink_stairs.createItemBlock(),
                dye_gray_stairs.createItemBlock(),
                dye_silver_stairs.createItemBlock(),
                dye_cyan_stairs.createItemBlock(),
                dye_purple_stairs.createItemBlock(),
                dye_blue_stairs.createItemBlock(),
                dye_brown_stairs.createItemBlock(),
                dye_green_stairs.createItemBlock(),
                dye_red_stairs.createItemBlock(),
                dye_black_stairs.createItemBlock(),

                stonebrick_white.createItemBlock(),
                stonebrick_orange.createItemBlock(),
                stonebrick_magenta.createItemBlock(),
                stonebrick_light_blue.createItemBlock(),
                stonebrick_yellow.createItemBlock(),
                stonebrick_lime.createItemBlock(),
                stonebrick_pink.createItemBlock(),
                stonebrick_silver.createItemBlock(),
                stonebrick_gray.createItemBlock(),
                stonebrick_cyan.createItemBlock(),
                stonebrick_purple.createItemBlock(),
                stonebrick_blue.createItemBlock(),
                stonebrick_brown.createItemBlock(),
                stonebrick_green.createItemBlock(),
                stonebrick_red.createItemBlock(),
                stonebrick_black.createItemBlock(),

                stonebrick_white_stairs.createItemBlock(),
                stonebrick_orange_stairs.createItemBlock(),
                stonebrick_magenta_stairs.createItemBlock(),
                stonebrick_light_blue_stairs.createItemBlock(),
                stonebrick_yellow_stairs.createItemBlock(),
                stonebrick_lime_stairs.createItemBlock(),
                stonebrick_pink_stairs.createItemBlock(),
                stonebrick_gray_stairs.createItemBlock(),
                stonebrick_silver_stairs.createItemBlock(),
                stonebrick_cyan_stairs.createItemBlock(),
                stonebrick_purple_stairs.createItemBlock(),
                stonebrick_blue_stairs.createItemBlock(),
                stonebrick_brown_stairs.createItemBlock(),
                stonebrick_green_stairs.createItemBlock(),
                stonebrick_red_stairs.createItemBlock(),
                stonebrick_black_stairs.createItemBlock(),

                concrete_white_stairs.createItemBlock(),
                concrete_orange_stairs.createItemBlock(),
                concrete_magenta_stairs.createItemBlock(),
                concrete_light_blue_stairs.createItemBlock(),
                concrete_yellow_stairs.createItemBlock(),
                concrete_lime_stairs.createItemBlock(),
                concrete_pink_stairs.createItemBlock(),
                concrete_gray_stairs.createItemBlock(),
                concrete_silver_stairs.createItemBlock(),
                concrete_cyan_stairs.createItemBlock(),
                concrete_purple_stairs.createItemBlock(),
                concrete_blue_stairs.createItemBlock(),
                concrete_brown_stairs.createItemBlock(),
                concrete_green_stairs.createItemBlock(),
                concrete_red_stairs.createItemBlock(),
                concrete_black_stairs.createItemBlock(),

                wool_white_stairs.createItemBlock(),
                wool_orange_stairs.createItemBlock(),
                wool_magenta_stairs.createItemBlock(),
                wool_light_blue_stairs.createItemBlock(),
                wool_yellow_stairs.createItemBlock(),
                wool_lime_stairs.createItemBlock(),
                wool_pink_stairs.createItemBlock(),
                wool_gray_stairs.createItemBlock(),
                wool_silver_stairs.createItemBlock(),
                wool_cyan_stairs.createItemBlock(),
                wool_purple_stairs.createItemBlock(),
                wool_blue_stairs.createItemBlock(),
                wool_brown_stairs.createItemBlock(),
                wool_green_stairs.createItemBlock(),
                wool_red_stairs.createItemBlock(),
                wool_black_stairs.createItemBlock(),

                clay_white_stairs.createItemBlock(),
                clay_orange_stairs.createItemBlock(),
                clay_magenta_stairs.createItemBlock(),
                clay_light_blue_stairs.createItemBlock(),
                clay_yellow_stairs.createItemBlock(),
                clay_lime_stairs.createItemBlock(),
                clay_pink_stairs.createItemBlock(),
                clay_gray_stairs.createItemBlock(),
                clay_silver_stairs.createItemBlock(),
                clay_cyan_stairs.createItemBlock(),
                clay_purple_stairs.createItemBlock(),
                clay_blue_stairs.createItemBlock(),
                clay_brown_stairs.createItemBlock(),
                clay_green_stairs.createItemBlock(),
                clay_red_stairs.createItemBlock(),
                clay_black_stairs.createItemBlock(),

                glass_white_stairs.createItemBlock(),
                glass_orange_stairs.createItemBlock(),
                glass_magenta_stairs.createItemBlock(),
                glass_light_blue_stairs.createItemBlock(),
                glass_yellow_stairs.createItemBlock(),
                glass_lime_stairs.createItemBlock(),
                glass_pink_stairs.createItemBlock(),
                glass_gray_stairs.createItemBlock(),
                glass_silver_stairs.createItemBlock(),
                glass_cyan_stairs.createItemBlock(),
                glass_purple_stairs.createItemBlock(),
                glass_blue_stairs.createItemBlock(),
                glass_brown_stairs.createItemBlock(),
                glass_green_stairs.createItemBlock(),
                glass_red_stairs.createItemBlock(),
                glass_black_stairs.createItemBlock()


        );
    }

    public static void registerModels() {

        registerBlockRender(dye_block_black);
        registerBlockRender(dye_block_red);
        registerBlockRender(dye_block_green);
        registerBlockRender(dye_block_brown);
        registerBlockRender(dye_block_purple);
        registerBlockRender(dye_block_cyan);
        registerBlockRender(dye_block_light_gray);
        registerBlockRender(dye_block_gray);
        registerBlockRender(dye_block_pink);
        registerBlockRender(dye_block_lime);
        registerBlockRender(dye_block_yellow);
        registerBlockRender(dye_block_light_blue);
        registerBlockRender(dye_block_magenta);
        registerBlockRender(dye_block_orange);
        registerBlockRender(dye_block_white);

        registerBlockRender(dye_white_stairs);
        registerBlockRender(dye_orange_stairs);
        registerBlockRender(dye_magenta_stairs);
        registerBlockRender(dye_light_blue_stairs);
        registerBlockRender(dye_yellow_stairs);
        registerBlockRender(dye_lime_stairs);
        registerBlockRender(dye_pink_stairs);
        registerBlockRender(dye_gray_stairs);
        registerBlockRender(dye_silver_stairs);
        registerBlockRender(dye_cyan_stairs);
        registerBlockRender(dye_purple_stairs);
        registerBlockRender(dye_blue_stairs);
        registerBlockRender(dye_brown_stairs);
        registerBlockRender(dye_green_stairs);
        registerBlockRender(dye_red_stairs);
        registerBlockRender(dye_black_stairs);

        registerBlockRender(stonebrick_black);
        registerBlockRender(stonebrick_red);
        registerBlockRender(stonebrick_green);
        registerBlockRender(stonebrick_brown);
        registerBlockRender(stonebrick_purple);
        registerBlockRender(stonebrick_blue);
        registerBlockRender(stonebrick_cyan);
        registerBlockRender(stonebrick_silver);
        registerBlockRender(stonebrick_gray);
        registerBlockRender(stonebrick_pink);
        registerBlockRender(stonebrick_lime);
        registerBlockRender(stonebrick_yellow);
        registerBlockRender(stonebrick_light_blue);
        registerBlockRender(stonebrick_magenta);
        registerBlockRender(stonebrick_orange);
        registerBlockRender(stonebrick_white);

        registerBlockRender(stonebrick_white_stairs);
        registerBlockRender(stonebrick_orange_stairs);
        registerBlockRender(stonebrick_magenta_stairs);
        registerBlockRender(stonebrick_light_blue_stairs);
        registerBlockRender(stonebrick_yellow_stairs);
        registerBlockRender(stonebrick_lime_stairs);
        registerBlockRender(stonebrick_pink_stairs);
        registerBlockRender(stonebrick_gray_stairs);
        registerBlockRender(stonebrick_silver_stairs);
        registerBlockRender(stonebrick_cyan_stairs);
        registerBlockRender(stonebrick_purple_stairs);
        registerBlockRender(stonebrick_blue_stairs);
        registerBlockRender(stonebrick_brown_stairs);
        registerBlockRender(stonebrick_green_stairs);
        registerBlockRender(stonebrick_red_stairs);
        registerBlockRender(stonebrick_black_stairs);

        registerBlockRender(concrete_white_stairs);
        registerBlockRender(concrete_orange_stairs);
        registerBlockRender(concrete_magenta_stairs);
        registerBlockRender(concrete_light_blue_stairs);
        registerBlockRender(concrete_yellow_stairs);
        registerBlockRender(concrete_lime_stairs);
        registerBlockRender(concrete_pink_stairs);
        registerBlockRender(concrete_gray_stairs);
        registerBlockRender(concrete_silver_stairs);
        registerBlockRender(concrete_cyan_stairs);
        registerBlockRender(concrete_purple_stairs);
        registerBlockRender(concrete_blue_stairs);
        registerBlockRender(concrete_brown_stairs);
        registerBlockRender(concrete_green_stairs);
        registerBlockRender(concrete_red_stairs);
        registerBlockRender(concrete_black_stairs);

        registerBlockRender(wool_white_stairs);
        registerBlockRender(wool_orange_stairs);
        registerBlockRender(wool_magenta_stairs);
        registerBlockRender(wool_light_blue_stairs);
        registerBlockRender(wool_yellow_stairs);
        registerBlockRender(wool_lime_stairs);
        registerBlockRender(wool_pink_stairs);
        registerBlockRender(wool_gray_stairs);
        registerBlockRender(wool_silver_stairs);
        registerBlockRender(wool_cyan_stairs);
        registerBlockRender(wool_purple_stairs);
        registerBlockRender(wool_blue_stairs);
        registerBlockRender(wool_brown_stairs);
        registerBlockRender(wool_green_stairs);
        registerBlockRender(wool_red_stairs);
        registerBlockRender(wool_black_stairs);

        registerBlockRender(clay_white_stairs);
        registerBlockRender(clay_orange_stairs);
        registerBlockRender(clay_magenta_stairs);
        registerBlockRender(clay_light_blue_stairs);
        registerBlockRender(clay_yellow_stairs);
        registerBlockRender(clay_lime_stairs);
        registerBlockRender(clay_pink_stairs);
        registerBlockRender(clay_gray_stairs);
        registerBlockRender(clay_silver_stairs);
        registerBlockRender(clay_cyan_stairs);
        registerBlockRender(clay_purple_stairs);
        registerBlockRender(clay_blue_stairs);
        registerBlockRender(clay_brown_stairs);
        registerBlockRender(clay_green_stairs);
        registerBlockRender(clay_red_stairs);
        registerBlockRender(clay_black_stairs);

        registerBlockRender(glass_white_stairs);
        registerBlockRender(glass_orange_stairs);
        registerBlockRender(glass_magenta_stairs);
        registerBlockRender(glass_light_blue_stairs);
        registerBlockRender(glass_yellow_stairs);
        registerBlockRender(glass_lime_stairs);
        registerBlockRender(glass_pink_stairs);
        registerBlockRender(glass_gray_stairs);
        registerBlockRender(glass_silver_stairs);
        registerBlockRender(glass_cyan_stairs);
        registerBlockRender(glass_purple_stairs);
        registerBlockRender(glass_blue_stairs);
        registerBlockRender(glass_brown_stairs);
        registerBlockRender(glass_green_stairs);
        registerBlockRender(glass_red_stairs);
        registerBlockRender(glass_black_stairs);


    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }
}
