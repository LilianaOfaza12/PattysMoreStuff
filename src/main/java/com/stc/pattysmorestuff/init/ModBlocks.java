package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.blocks.*;
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
 * Created by patrick on 20/07/2017.
 */
public class ModBlocks {

    public static BlockColoredOre dye_ore = new BlockColoredOre("dye_ore");
    public static BlockEnderPearlOre ender_pearl_ore = new BlockEnderPearlOre("ender_pearl_ore");

    public static BlockColoredStairs dye_white_stairs  = new BlockColoredStairs("dye_white_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
    public static BlockColoredStairs dye_orange_stairs  = new BlockColoredStairs("dye_orange_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
    public static BlockColoredStairs dye_magenta_stairs  = new BlockColoredStairs("dye_magenta_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
    public static BlockColoredStairs dye_light_blue_stairs  = new BlockColoredStairs("dye_light_blue_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
    public static BlockColoredStairs dye_yellow_stairs  = new BlockColoredStairs("dye_yellow_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
    public static BlockColoredStairs dye_lime_stairs  = new BlockColoredStairs("dye_lime_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
    public static BlockColoredStairs dye_pink_stairs  = new BlockColoredStairs("dye_pink_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
    public static BlockColoredStairs dye_gray_stairs  = new BlockColoredStairs("dye_gray_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
    public static BlockColoredStairs dye_silver_stairs  = new BlockColoredStairs("dye_silver_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
    public static BlockColoredStairs dye_cyan_stairs  = new BlockColoredStairs("dye_cyan_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
    public static BlockColoredStairs dye_purple_stairs  = new BlockColoredStairs("dye_purple_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
    public static BlockColoredStairs dye_blue_stairs  = new BlockColoredStairs("dye_blue_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
    public static BlockColoredStairs dye_brown_stairs  = new BlockColoredStairs("dye_brown_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
    public static BlockColoredStairs dye_green_stairs  = new BlockColoredStairs("dye_green_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
    public static BlockColoredStairs dye_red_stairs  = new BlockColoredStairs("dye_red_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
    public static BlockColoredStairs dye_black_stairs  = new BlockColoredStairs("dye_black_stairs", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));

    public static BlockOakCrate oak_storage_crate = new BlockOakCrate("oak_storage_crate");
    public static BlockSpruceCrate spruce_storage_crate = new BlockSpruceCrate("spruce_storage_crate");
    public static BlockBirchCrate birch_storage_crate = new BlockBirchCrate("birch_storage_crate");
    public static BlockJungleCrate jungle_storage_crate = new BlockJungleCrate("jungle_storage_crate");
    public static BlockAcaciaCrate acacia_storage_crate = new BlockAcaciaCrate("acacia_storage_crate");
    public static BlockBigOakCrate big_oak_storage_crate = new BlockBigOakCrate("big_oak_storage_crate");

    public static BlockJar cookie_jar_white = new BlockJar("cookie_jar_white");
    public static BlockJar cookie_jar_orange = new BlockJar("cookie_jar_orange");
    public static BlockJar cookie_jar_magenta = new BlockJar("cookie_jar_magenta");
    public static BlockJar cookie_jar_light_blue = new BlockJar("cookie_jar_light_blue");
    public static BlockJar cookie_jar_yellow = new BlockJar("cookie_jar_yellow");
    public static BlockJar cookie_jar_lime = new BlockJar("cookie_jar_lime");
    public static BlockJar cookie_jar_pink = new BlockJar("cookie_jar_pink");
    public static BlockJar cookie_jar_gray = new BlockJar("cookie_jar_gray");
    public static BlockJar cookie_jar_silver = new BlockJar("cookie_jar_silver");
    public static BlockJar cookie_jar_cyan = new BlockJar("cookie_jar_cyan");
    public static BlockJar cookie_jar_purple = new BlockJar("cookie_jar_purple");
    public static BlockJar cookie_jar_blue = new BlockJar("cookie_jar_blue");
    public static BlockJar cookie_jar_brown = new BlockJar("cookie_jar_brown");
    public static BlockJar cookie_jar_green = new BlockJar("cookie_jar_green");
    public static BlockJar cookie_jar_red = new BlockJar("cookie_jar_red");
    public static BlockJar cookie_jar_black = new BlockJar("cookie_jar_black");

    public static BlockReinforcedObsidian reinforced_obsidian = new BlockReinforcedObsidian("reinforced_obsidian");
    public static BlockReinforcedGlass reinforced_glass = new BlockReinforcedGlass("reinforced_glass", false);

    public static void registerBlocks(final IForgeRegistry<Block> event) {
        final Block[] blocks = {
                dye_ore,
                ender_pearl_ore,
                oak_storage_crate,
                spruce_storage_crate,
                birch_storage_crate,
                jungle_storage_crate,
                acacia_storage_crate,
                big_oak_storage_crate,
                cookie_jar_white,
                cookie_jar_orange,
                cookie_jar_magenta,
                cookie_jar_light_blue,
                cookie_jar_yellow,
                cookie_jar_lime,
                cookie_jar_pink,
                cookie_jar_gray,
                cookie_jar_silver,
                cookie_jar_cyan,
                cookie_jar_purple,
                cookie_jar_blue,
                cookie_jar_brown,
                cookie_jar_green,
                cookie_jar_red,
                cookie_jar_black,
                reinforced_obsidian,
                reinforced_glass,
                dye_white_stairs,
                dye_orange_stairs,
                dye_magenta_stairs,
                dye_light_blue_stairs,
                dye_yellow_stairs,
                dye_lime_stairs,
                dye_pink_stairs,
                dye_gray_stairs,
                dye_silver_stairs,
                dye_cyan_stairs,
                dye_purple_stairs,
                dye_blue_stairs,
                dye_brown_stairs,
                dye_green_stairs,
                dye_red_stairs,
                dye_black_stairs
        };

        event.registerAll(blocks);
    }


    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                dye_ore.createItemBlock(),
                ender_pearl_ore.createItemBlock(),
                oak_storage_crate.createItemBlock(),
                spruce_storage_crate.createItemBlock(),
                birch_storage_crate.createItemBlock(),
                jungle_storage_crate.createItemBlock(),
                acacia_storage_crate.createItemBlock(),
                big_oak_storage_crate.createItemBlock(),
                cookie_jar_white.createItemBlock(),
                cookie_jar_orange.createItemBlock(),
                cookie_jar_magenta.createItemBlock(),
                cookie_jar_light_blue.createItemBlock(),
                cookie_jar_yellow.createItemBlock(),
                cookie_jar_lime.createItemBlock(),
                cookie_jar_pink.createItemBlock(),
                cookie_jar_gray.createItemBlock(),
                cookie_jar_silver.createItemBlock(),
                cookie_jar_cyan.createItemBlock(),
                cookie_jar_purple.createItemBlock(),
                cookie_jar_blue.createItemBlock(),
                cookie_jar_brown.createItemBlock(),
                cookie_jar_green.createItemBlock(),
                cookie_jar_red.createItemBlock(),
                cookie_jar_black.createItemBlock(),
                reinforced_obsidian.createItemBlock(),
                reinforced_glass.createItemBlock(),
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
                dye_black_stairs.createItemBlock()
        );
    }

    public static void registerModels() {
        registerBlockRender(dye_ore);
        registerBlockRender(ender_pearl_ore);
        registerBlockRender(oak_storage_crate);
        registerBlockRender(spruce_storage_crate);
        registerBlockRender(birch_storage_crate);
        registerBlockRender(jungle_storage_crate);
        registerBlockRender(acacia_storage_crate);
        registerBlockRender(big_oak_storage_crate);
        registerBlockRender(cookie_jar_white);
        registerBlockRender(cookie_jar_orange);
        registerBlockRender(cookie_jar_magenta);
        registerBlockRender(cookie_jar_light_blue);
        registerBlockRender(cookie_jar_yellow);
        registerBlockRender(cookie_jar_lime);
        registerBlockRender(cookie_jar_pink);
        registerBlockRender(cookie_jar_gray);
        registerBlockRender(cookie_jar_silver);
        registerBlockRender(cookie_jar_cyan);
        registerBlockRender(cookie_jar_purple);
        registerBlockRender(cookie_jar_blue);
        registerBlockRender(cookie_jar_brown);
        registerBlockRender(cookie_jar_green);
        registerBlockRender(cookie_jar_red);
        registerBlockRender(cookie_jar_black);
        registerBlockRender(reinforced_obsidian);
        registerBlockRender(reinforced_glass);
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


    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }
}
