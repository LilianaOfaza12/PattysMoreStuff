package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.blocks.*;
import com.stc.pattysmorestuff.blocks.blender.BlockBlender;
import com.stc.pattysmorestuff.blocks.crates.*;
import com.stc.pattysmorestuff.blocks.jar.BlockJar;
import com.stc.pattysmorestuff.blocks.ores.BlockColoredOre;
import com.stc.pattysmorestuff.blocks.ores.BlockEnderPearlOre;
import com.stc.pattysmorestuff.blocks.reinforced.BlockReinforcedGlass;
import com.stc.pattysmorestuff.blocks.reinforced.BlockReinforcedObsidian;
import com.stc.pattysmorestuff.blocks.stairs.BlockCustomStairs;
import com.stc.pattysmorestuff.blocks.stairs.BlockGlassStairs;
import com.stc.pattysmorestuff.blocks.stairs.BlockSlimeStairs;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ModBlocks {

    public static BlockColoredOre dye_ore = new BlockColoredOre("dye_ore");
    public static BlockEnderPearlOre ender_pearl_ore = new BlockEnderPearlOre("ender_pearl_ore");

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

    public static BlockBlender blender_white = new BlockBlender("blender_white");
    public static BlockBlender blender_orange = new BlockBlender("blender_orange");
    public static BlockBlender blender_magenta = new BlockBlender("blender_magenta");
    public static BlockBlender blender_light_blue = new BlockBlender("blender_light_blue");
    public static BlockBlender blender_yellow = new BlockBlender("blender_yellow");
    public static BlockBlender blender_lime = new BlockBlender("blender_lime");
    public static BlockBlender blender_pink = new BlockBlender("blender_pink");
    public static BlockBlender blender_gray = new BlockBlender("blender_gray");
    public static BlockBlender blender_silver = new BlockBlender("blender_silver");
    public static BlockBlender blender_cyan = new BlockBlender("blender_cyan");
    public static BlockBlender blender_purple = new BlockBlender("blender_purple");
    public static BlockBlender blender_blue = new BlockBlender("blender_blue");
    public static BlockBlender blender_brown = new BlockBlender("blender_brown");
    public static BlockBlender blender_green = new BlockBlender("blender_green");
    public static BlockBlender blender_red = new BlockBlender("blender_red");
    public static BlockBlender blender_black = new BlockBlender("blender_black");
    public static BlockPolishedStone polished_stone = new BlockPolishedStone("polished_stone");
    public static BlockGlowstoneBrick glowstone_brick = new BlockGlowstoneBrick("glowstone_brick");
    public static BlockIllumination glowair = new BlockIllumination("glowair");
    public static BlockEnder ender_pearl_block = new BlockEnder("ender_pearl_block");
    public static BlockEnder ender_brick = new BlockEnder("ender_brick");
    public static BlockLantern lantern_white = new BlockLantern("lantern_white");
    public static BlockLantern lantern_orange = new BlockLantern("lantern_orange");
    public static BlockLantern lantern_magenta = new BlockLantern("lantern_magenta");
    public static BlockLantern lantern_light_blue = new BlockLantern("lantern_light_blue");
    public static BlockLantern lantern_yellow = new BlockLantern("lantern_yellow");
    public static BlockLantern lantern_lime = new BlockLantern("lantern_lime");
    public static BlockLantern lantern_pink = new BlockLantern("lantern_pink");
    public static BlockLantern lantern_gray = new BlockLantern("lantern_gray");
    public static BlockLantern lantern_silver = new BlockLantern("lantern_silver");
    public static BlockLantern lantern_cyan = new BlockLantern("lantern_cyan");
    public static BlockLantern lantern_purple = new BlockLantern("lantern_purple");
    public static BlockLantern lantern_blue = new BlockLantern("lantern_blue");
    public static BlockLantern lantern_brown = new BlockLantern("lantern_brown");
    public static BlockLantern lantern_green = new BlockLantern("lantern_green");
    public static BlockLantern lantern_red = new BlockLantern("lantern_red");
    public static BlockLantern lantern_black = new BlockLantern("lantern_black");
    public static BlockCeilingLight ceiling_light_white = new BlockCeilingLight("ceiling_light_white");
    public static BlockCeilingLight ceiling_light_orange = new BlockCeilingLight("ceiling_light_orange");
    public static BlockCeilingLight ceiling_light_magenta = new BlockCeilingLight("ceiling_light_magenta");
    public static BlockCeilingLight ceiling_light_baby_blue = new BlockCeilingLight("ceiling_light_baby_blue");
    public static BlockCeilingLight ceiling_light_yellow = new BlockCeilingLight("ceiling_light_yellow");
    public static BlockCeilingLight ceiling_light_lime = new BlockCeilingLight("ceiling_light_lime");
    public static BlockCeilingLight ceiling_light_pink = new BlockCeilingLight("ceiling_light_pink");
    public static BlockCeilingLight ceiling_light_gray = new BlockCeilingLight("ceiling_light_gray");
    public static BlockCeilingLight ceiling_light_silver = new BlockCeilingLight("ceiling_light_silver");
    public static BlockCeilingLight ceiling_light_cyan = new BlockCeilingLight("ceiling_light_cyan");
    public static BlockCeilingLight ceiling_light_purple = new BlockCeilingLight("ceiling_light_purple");
    public static BlockCeilingLight ceiling_light_blue = new BlockCeilingLight("ceiling_light_blue");
    public static BlockCeilingLight ceiling_light_brown = new BlockCeilingLight("ceiling_light_brown");
    public static BlockCeilingLight ceiling_light_green = new BlockCeilingLight("ceiling_light_green");
    public static BlockCeilingLight ceiling_light_red = new BlockCeilingLight("ceiling_light_red");
    public static BlockCeilingLight ceiling_light_black = new BlockCeilingLight("ceiling_light_black");
    /*public static BlockPolishedStone polished_endstone = new BlockPolishedStone("polished_endstone");
    public static BlockPolishedStone polished_obsidian = new BlockPolishedStone("polished_obsidian");
    public static BlockPolishedStone polished_netherrack = new BlockPolishedStone("polished_netherrack");
    public static BlockPolishedStone polished_prismarine = new BlockPolishedStone("polished_prismarine");
    public static BlockPolishedStone polished_prismarine_dark = new BlockPolishedStone("polished_prismarine_dark");
    public static BlockPolishedStone polished_glowstone = new BlockPolishedStone("polished_glowstone");*/

    public static BlockCustomStairs snow_stairs = new BlockCustomStairs("snow_stairs", Blocks.SNOW.getDefaultState());
    public static BlockCustomStairs ice_stairs = new BlockCustomStairs("ice_stairs", Blocks.ICE.getDefaultState());
    public static BlockCustomStairs packed_ice_stairs = new BlockCustomStairs("packed_ice_stairs", Blocks.PACKED_ICE.getDefaultState());
    public static BlockGlassStairs glass_stairs = new BlockGlassStairs("glass_stairs", Blocks.GLASS.getDefaultState());
    public static BlockCustomStairs glowstone_stairs = new BlockCustomStairs("glowstone_stairs", Blocks.GLOWSTONE.getDefaultState());
    public static BlockCustomStairs sea_lantern_stairs = new BlockCustomStairs("sea_lantern_stairs", Blocks.SEA_LANTERN.getDefaultState());
    public static BlockCustomStairs iron_stairs = new BlockCustomStairs("iron_stairs", Blocks.IRON_BLOCK.getDefaultState());
    public static BlockCustomStairs gold_stairs = new BlockCustomStairs("gold_stairs", Blocks.GOLD_BLOCK.getDefaultState());
    public static BlockCustomStairs lapis_stairs = new BlockCustomStairs("lapis_stairs", Blocks.LAPIS_BLOCK.getDefaultState());
    public static BlockCustomStairs emerald_stairs = new BlockCustomStairs("emerald_stairs", Blocks.EMERALD_BLOCK.getDefaultState());
    public static BlockCustomStairs diamond_stairs = new BlockCustomStairs("diamond_stairs", Blocks.DIAMOND_BLOCK.getDefaultState());
    public static BlockCustomStairs redstone_stairs = new BlockCustomStairs("redstone_stairs", Blocks.REDSTONE_BLOCK.getDefaultState());
    public static BlockCustomStairs coal_stairs = new BlockCustomStairs("coal_stairs", Blocks.COAL_BLOCK.getDefaultState());
    public static BlockCustomStairs stone_stairs = new BlockCustomStairs("stone_stairs", Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE));
    public static BlockCustomStairs granite_stairs = new BlockCustomStairs("granite_stairs",  Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE));
    public static BlockCustomStairs smooth_granite_stairs = new BlockCustomStairs("smooth_granite_stairs",  Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE_SMOOTH));
    public static BlockCustomStairs diorite_stairs = new BlockCustomStairs("diorite_stairs",  Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE));
    public static BlockCustomStairs smooth_diorite_stairs = new BlockCustomStairs("smooth_diorite_stairs",  Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE_SMOOTH));
    public static BlockCustomStairs andesite_stairs = new BlockCustomStairs("andesite_stairs",  Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE));
    public static BlockCustomStairs smooth_andesite_stairs = new BlockCustomStairs("smooth_andesite_stairs",  Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE_SMOOTH));
    public static BlockCustomStairs mossy_stairs = new BlockCustomStairs("mossy_stairs", Blocks.MOSSY_COBBLESTONE.getDefaultState());
    public static BlockCustomStairs obsidian_stairs = new BlockCustomStairs("obsidian_stairs", Blocks.OBSIDIAN.getDefaultState());
    public static BlockCustomStairs prismarine_stairs = new BlockCustomStairs("prismarine_stairs", Blocks.PRISMARINE.getDefaultState().withProperty(BlockPrismarine.VARIANT, BlockPrismarine.EnumType.ROUGH));
    public static BlockCustomStairs prismarine_brick_stairs = new BlockCustomStairs("prismarine_brick_stairs", Blocks.PRISMARINE.getDefaultState().withProperty(BlockPrismarine.VARIANT, BlockPrismarine.EnumType.BRICKS));
    public static BlockCustomStairs prismarine_dark_stairs = new BlockCustomStairs("prismarine_dark_stairs", Blocks.PRISMARINE.getDefaultState().withProperty(BlockPrismarine.VARIANT, BlockPrismarine.EnumType.DARK));
    public static BlockCustomStairs endstone_stairs = new BlockCustomStairs("endstone_stairs", Blocks.END_STONE.getDefaultState());
    public static BlockCustomStairs sandstone_chiseled_stairs = new BlockCustomStairs("sandstone_chiseled_stairs", Blocks.SANDSTONE.getDefaultState().withProperty(BlockSandStone.TYPE, BlockSandStone.EnumType.CHISELED));
    public static BlockCustomStairs smooth_sandstone_stairs = new BlockCustomStairs("smooth_sandstone_stairs", Blocks.SANDSTONE.getDefaultState().withProperty(BlockSandStone.TYPE, BlockSandStone.EnumType.SMOOTH));
    public static BlockCustomStairs sandstone_red_chiseled_stairs = new BlockCustomStairs("sandstone_red_chiseled_stairs", Blocks.RED_SANDSTONE.getDefaultState().withProperty(BlockRedSandstone.TYPE, BlockRedSandstone.EnumType.CHISELED));
    public static BlockCustomStairs smooth_red_sandstone_stairs = new BlockCustomStairs("smooth_red_sandstone_stairs", Blocks.RED_SANDSTONE.getDefaultState().withProperty(BlockRedSandstone.TYPE, BlockRedSandstone.EnumType.SMOOTH));
    public static BlockCustomStairs quartz_chiseled_stairs = new BlockCustomStairs("quartz_chiseled_stairs", Blocks.QUARTZ_BLOCK.getDefaultState().withProperty(BlockQuartz.VARIANT, BlockQuartz.EnumType.CHISELED));
    public static BlockCustomStairs quartz_pillar_stairs = new BlockCustomStairs("quartz_pillar_stairs", Blocks.QUARTZ_BLOCK.getDefaultState().withProperty(BlockQuartz.VARIANT, BlockQuartz.EnumType.LINES_Y));
    public static BlockCustomStairs mossy_brick_stairs = new BlockCustomStairs("mossy_brick_stairs", Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.MOSSY));
    public static BlockCustomStairs cracked_brick_stairs = new BlockCustomStairs("cracked_brick_stairs", Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.CRACKED));
    public static BlockCustomStairs chiseled_brick_stairs = new BlockCustomStairs("chiseled_brick_stairs", Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.CHISELED));
    public static BlockCustomStairs bookshelf_stairs = new BlockCustomStairs("bookshelf_stairs", Blocks.BOOKSHELF.getDefaultState());
    public static BlockCustomStairs brown_mushroom_stairs = new BlockCustomStairs("brown_mushroom_stairs", Blocks.BROWN_MUSHROOM.getDefaultState());
    public static BlockCustomStairs red_mushroom_stairs = new BlockCustomStairs("red_mushroom_stairs", Blocks.RED_MUSHROOM.getDefaultState());
    public static BlockCustomStairs oak_log_stairs = new BlockCustomStairs("oak_log_stairs", Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockOldLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    public static BlockCustomStairs spruce_log_stairs = new BlockCustomStairs("spruce_log_stairs", Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty(BlockOldLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    public static BlockCustomStairs birch_log_stairs = new BlockCustomStairs("birch_log_stairs", Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.BIRCH).withProperty(BlockOldLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    public static BlockCustomStairs jungle_log_stairs = new BlockCustomStairs("jungle_log_stairs", Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockOldLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    public static BlockCustomStairs acacia_log_stairs = new BlockCustomStairs("acacia_log_stairs", Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.ACACIA).withProperty(BlockOldLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    public static BlockCustomStairs dark_oak_log_stairs = new BlockCustomStairs("dark_oak_log_stairs", Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.DARK_OAK).withProperty(BlockOldLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    public static BlockSlimeStairs slime_stairs = new BlockSlimeStairs("slime_stairs", Blocks.SLIME_BLOCK.getDefaultState());
    public static BlockCustomStairs dirt_stairs= new BlockCustomStairs("dirt_stairs", Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
    public static BlockCustomStairs coarse_dirt_stairs = new BlockCustomStairs("coarse_dirt_stairs", Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT));
    public static BlockCustomStairs podzol_stairs = new BlockCustomStairs("podzol_stairs", Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.PODZOL));
    public static BlockCustomStairs sand_stairs = new BlockCustomStairs("sand_stairs", Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, BlockSand.EnumType.SAND));
    public static BlockCustomStairs red_sand_stairs = new BlockCustomStairs("red_sand_stairs", Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, BlockSand.EnumType.RED_SAND));
    public static BlockCustomStairs gravel_stairs = new BlockCustomStairs("gravel_stairs", Blocks.GRAVEL.getDefaultState());
    public static BlockCustomStairs hay_stairs = new BlockCustomStairs("hay_stairs", Blocks.HAY_BLOCK.getDefaultState());
    public static BlockCustomStairs clay_stairs = new BlockCustomStairs("clay_stairs", Blocks.CLAY.getDefaultState());
    public static BlockCustomStairs soulsand_stairs = new BlockCustomStairs("soulsand_stairs", Blocks.SOUL_SAND.getDefaultState());
    public static BlockCustomStairs netherrack_stairs = new BlockCustomStairs("netherrack_stairs", Blocks.NETHERRACK.getDefaultState());
    public static BlockCustomStairs hardened_clay_stairs = new BlockCustomStairs("hardened_clay_stairs", Blocks.HARDENED_CLAY.getDefaultState());
    public static BlockNetherStar netherstar_block = new BlockNetherStar("netherstar_block");

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
                blender_white,
                blender_orange,
                blender_magenta,
                blender_light_blue,
                blender_yellow,
                blender_lime,
                blender_pink,
                blender_gray,
                blender_silver,
                blender_cyan,
                blender_purple,
                blender_blue,
                blender_brown,
                blender_green,
                blender_red,
                blender_black,
                polished_stone,
                glowstone_brick,
                glowair,
                ender_pearl_block,
                ender_brick,
                lantern_white,
                lantern_orange,
                lantern_magenta,
                lantern_light_blue,
                lantern_yellow,
                lantern_lime,
                lantern_pink,
                lantern_gray,
                lantern_silver,
                lantern_cyan,
                lantern_purple,
                lantern_blue,
                lantern_brown,
                lantern_green,
                lantern_red,
                lantern_black,
                ceiling_light_white,
                ceiling_light_orange,
                ceiling_light_magenta,
                ceiling_light_baby_blue,
                ceiling_light_yellow,
                ceiling_light_lime,
                ceiling_light_pink,
                ceiling_light_gray,
                ceiling_light_silver,
                ceiling_light_cyan,
                ceiling_light_purple,
                ceiling_light_blue,
                ceiling_light_brown,
                ceiling_light_green,
                ceiling_light_red,
                ceiling_light_black,
                snow_stairs,
                ice_stairs,
                packed_ice_stairs,
                glass_stairs,
                glowstone_stairs,
                sea_lantern_stairs,
                iron_stairs,
                gold_stairs,
                lapis_stairs,
                emerald_stairs,
                diamond_stairs,
                redstone_stairs,
                coal_stairs,
                stone_stairs,
                granite_stairs,
                smooth_granite_stairs,
                diorite_stairs,
                smooth_diorite_stairs,
                andesite_stairs,
                smooth_andesite_stairs,
                mossy_stairs,
                obsidian_stairs,
                prismarine_stairs,
                prismarine_brick_stairs,
                prismarine_dark_stairs,
                endstone_stairs,
                sandstone_chiseled_stairs,
                smooth_sandstone_stairs,
                sandstone_red_chiseled_stairs,
                smooth_red_sandstone_stairs,
                quartz_chiseled_stairs,
                quartz_pillar_stairs,
                mossy_brick_stairs,
                cracked_brick_stairs,
                chiseled_brick_stairs,
                bookshelf_stairs,
                brown_mushroom_stairs,
                red_mushroom_stairs,
                oak_log_stairs,
                spruce_log_stairs,
                birch_log_stairs,
                jungle_log_stairs,
                acacia_log_stairs,
                dark_oak_log_stairs,
                slime_stairs,
                dirt_stairs,
                coarse_dirt_stairs,
                podzol_stairs,
                sand_stairs,
                red_sand_stairs,
                gravel_stairs,
                hay_stairs,
                clay_stairs,
                soulsand_stairs,
                netherrack_stairs,
                hardened_clay_stairs,
                netherstar_block

                /*polished_endstone,
                polished_obsidian,
                polished_netherrack,
                polished_prismarine,
                polished_prismarine_dark,
                polished_glowstone*/

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
                blender_white.createItemBlock(),
                blender_orange.createItemBlock(),
                blender_magenta.createItemBlock(),
                blender_light_blue.createItemBlock(),
                blender_yellow.createItemBlock(),
                blender_lime.createItemBlock(),
                blender_pink.createItemBlock(),
                blender_gray.createItemBlock(),
                blender_silver.createItemBlock(),
                blender_cyan.createItemBlock(),
                blender_purple.createItemBlock(),
                blender_blue.createItemBlock(),
                blender_brown.createItemBlock(),
                blender_green.createItemBlock(),
                blender_red.createItemBlock(),
                blender_black.createItemBlock(),
                polished_stone.createItemBlock(),
                glowstone_brick.createItemBlock(),
                glowair.createItemBlock(),
                ender_pearl_block.createItemBlock(),
                ender_brick.createItemBlock(),
                lantern_white.createItemBlock(),
                lantern_orange.createItemBlock(),
                lantern_magenta.createItemBlock(),
                lantern_light_blue.createItemBlock(),
                lantern_yellow.createItemBlock(),
                lantern_lime.createItemBlock(),
                lantern_pink.createItemBlock(),
                lantern_gray.createItemBlock(),
                lantern_silver.createItemBlock(),
                lantern_cyan.createItemBlock(),
                lantern_purple.createItemBlock(),
                lantern_blue.createItemBlock(),
                lantern_brown.createItemBlock(),
                lantern_green.createItemBlock(),
                lantern_red.createItemBlock(),
                lantern_black.createItemBlock(),
                ceiling_light_white.createItemBlock(),
                ceiling_light_orange.createItemBlock(),
                ceiling_light_magenta.createItemBlock(),
                ceiling_light_baby_blue.createItemBlock(),
                ceiling_light_yellow.createItemBlock(),
                ceiling_light_lime.createItemBlock(),
                ceiling_light_pink.createItemBlock(),
                ceiling_light_gray.createItemBlock(),
                ceiling_light_silver.createItemBlock(),
                ceiling_light_cyan.createItemBlock(),
                ceiling_light_purple.createItemBlock(),
                ceiling_light_blue.createItemBlock(),
                ceiling_light_brown.createItemBlock(),
                ceiling_light_green.createItemBlock(),
                ceiling_light_red.createItemBlock(),
                ceiling_light_black.createItemBlock(),
                snow_stairs.createItemBlock(),
                ice_stairs.createItemBlock(),
                packed_ice_stairs.createItemBlock(),
                glass_stairs.createItemBlock(),
                glowstone_stairs.createItemBlock(),
                sea_lantern_stairs.createItemBlock(),
                iron_stairs.createItemBlock(),
                gold_stairs.createItemBlock(),
                lapis_stairs.createItemBlock(),
                emerald_stairs.createItemBlock(),
                diamond_stairs.createItemBlock(),
                redstone_stairs.createItemBlock(),
                coal_stairs.createItemBlock(),
                stone_stairs.createItemBlock(),
                granite_stairs.createItemBlock(),
                smooth_granite_stairs.createItemBlock(),
                diorite_stairs.createItemBlock(),
                smooth_diorite_stairs.createItemBlock(),
                andesite_stairs.createItemBlock(),
                smooth_andesite_stairs.createItemBlock(),
                mossy_stairs.createItemBlock(),
                obsidian_stairs.createItemBlock(),
                prismarine_stairs.createItemBlock(),
                prismarine_brick_stairs.createItemBlock(),
                prismarine_dark_stairs.createItemBlock(),
                endstone_stairs.createItemBlock(),
                sandstone_chiseled_stairs.createItemBlock(),
                smooth_sandstone_stairs.createItemBlock(),
                sandstone_red_chiseled_stairs.createItemBlock(),
                smooth_red_sandstone_stairs.createItemBlock(),
                quartz_chiseled_stairs.createItemBlock(),
                quartz_pillar_stairs.createItemBlock(),
                mossy_brick_stairs.createItemBlock(),
                cracked_brick_stairs.createItemBlock(),
                chiseled_brick_stairs.createItemBlock(),
                bookshelf_stairs.createItemBlock(),
                brown_mushroom_stairs.createItemBlock(),
                red_mushroom_stairs.createItemBlock(),
                oak_log_stairs.createItemBlock(),
                spruce_log_stairs.createItemBlock(),
                birch_log_stairs.createItemBlock(),
                jungle_log_stairs.createItemBlock(),
                acacia_log_stairs.createItemBlock(),
                dark_oak_log_stairs.createItemBlock(),
                slime_stairs.createItemBlock(),
                dirt_stairs.createItemBlock(),
                coarse_dirt_stairs.createItemBlock(),
                podzol_stairs.createItemBlock(),
                sand_stairs.createItemBlock(),
                red_sand_stairs.createItemBlock(),
                gravel_stairs.createItemBlock(),
                hay_stairs.createItemBlock(),
                clay_stairs.createItemBlock(),
                soulsand_stairs.createItemBlock(),
                netherrack_stairs.createItemBlock(),
                hardened_clay_stairs.createItemBlock(),
                netherstar_block.createItemBlock()
                /*polished_endstone.createItemBlock(),
                polished_obsidian.createItemBlock(),
                polished_netherrack.createItemBlock(),
                polished_prismarine.createItemBlock(),
                polished_prismarine_dark.createItemBlock(),
                polished_glowstone.createItemBlock()*/
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
        registerBlockRender(blender_white);
        registerBlockRender(blender_orange);
        registerBlockRender(blender_magenta);
        registerBlockRender(blender_light_blue);
        registerBlockRender(blender_yellow);
        registerBlockRender(blender_lime);
        registerBlockRender(blender_pink);
        registerBlockRender(blender_gray);
        registerBlockRender(blender_silver);
        registerBlockRender(blender_cyan);
        registerBlockRender(blender_purple);
        registerBlockRender(blender_blue);
        registerBlockRender(blender_brown);
        registerBlockRender(blender_green);
        registerBlockRender(blender_red);
        registerBlockRender(blender_black);
        registerBlockRender(polished_stone);
        registerBlockRender(glowstone_brick);
        registerBlockRender(glowair);
        registerBlockRender(ender_pearl_block);
        registerBlockRender(ender_brick);
        registerBlockRender(lantern_white);
        registerBlockRender(lantern_orange);
        registerBlockRender(lantern_magenta);
        registerBlockRender(lantern_light_blue);
        registerBlockRender(lantern_yellow);
        registerBlockRender(lantern_lime);
        registerBlockRender(lantern_pink);
        registerBlockRender(lantern_gray);
        registerBlockRender(lantern_silver);
        registerBlockRender(lantern_cyan);
        registerBlockRender(lantern_purple);
        registerBlockRender(lantern_blue);
        registerBlockRender(lantern_brown);
        registerBlockRender(lantern_green);
        registerBlockRender(lantern_red);
        registerBlockRender(lantern_black);
        registerBlockRender(ceiling_light_white);
        registerBlockRender(ceiling_light_orange);
        registerBlockRender(ceiling_light_magenta);
        registerBlockRender(ceiling_light_baby_blue);
        registerBlockRender(ceiling_light_yellow);
        registerBlockRender(ceiling_light_lime);
        registerBlockRender(ceiling_light_pink);
        registerBlockRender(ceiling_light_gray);
        registerBlockRender(ceiling_light_silver);
        registerBlockRender(ceiling_light_cyan);
        registerBlockRender(ceiling_light_purple);
        registerBlockRender(ceiling_light_blue);
        registerBlockRender(ceiling_light_brown);
        registerBlockRender(ceiling_light_green);
        registerBlockRender(ceiling_light_red);
        registerBlockRender(ceiling_light_black);
        registerBlockRender(snow_stairs);
        registerBlockRender(ice_stairs);
        registerBlockRender(packed_ice_stairs);
        registerBlockRender(glass_stairs);
        registerBlockRender(glowstone_stairs);
        registerBlockRender(sea_lantern_stairs);
        registerBlockRender(iron_stairs);
        registerBlockRender(gold_stairs);
        registerBlockRender(lapis_stairs);
        registerBlockRender(emerald_stairs);
        registerBlockRender(diamond_stairs);
        registerBlockRender(redstone_stairs);
        registerBlockRender(coal_stairs);
        registerBlockRender(stone_stairs);
        registerBlockRender(granite_stairs);
        registerBlockRender(smooth_granite_stairs);
        registerBlockRender(diorite_stairs);
        registerBlockRender(smooth_diorite_stairs);
        registerBlockRender(andesite_stairs);
        registerBlockRender(smooth_andesite_stairs);
        registerBlockRender(mossy_stairs);
        registerBlockRender(obsidian_stairs);
        registerBlockRender(prismarine_stairs);
        registerBlockRender(prismarine_brick_stairs);
        registerBlockRender(prismarine_dark_stairs);
        registerBlockRender(endstone_stairs);
        registerBlockRender(sandstone_chiseled_stairs);
        registerBlockRender(smooth_sandstone_stairs);
        registerBlockRender(sandstone_red_chiseled_stairs);
        registerBlockRender(smooth_red_sandstone_stairs);
        registerBlockRender(quartz_chiseled_stairs);
        registerBlockRender(quartz_pillar_stairs);
        registerBlockRender(mossy_brick_stairs);
        registerBlockRender(cracked_brick_stairs);
        registerBlockRender(chiseled_brick_stairs);
        registerBlockRender(bookshelf_stairs);
        registerBlockRender(brown_mushroom_stairs);
        registerBlockRender(red_mushroom_stairs);
        registerBlockRender(oak_log_stairs);
        registerBlockRender(spruce_log_stairs);
        registerBlockRender(birch_log_stairs);
        registerBlockRender(jungle_log_stairs);
        registerBlockRender(acacia_log_stairs);
        registerBlockRender(dark_oak_log_stairs);
        registerBlockRender(slime_stairs);
        registerBlockRender(dirt_stairs);
        registerBlockRender(coarse_dirt_stairs);
        registerBlockRender(podzol_stairs);
        registerBlockRender(sand_stairs);
        registerBlockRender(red_sand_stairs);
        registerBlockRender(gravel_stairs);
        registerBlockRender(hay_stairs);
        registerBlockRender(clay_stairs);
        registerBlockRender(soulsand_stairs);
        registerBlockRender(netherrack_stairs);
        registerBlockRender(hardened_clay_stairs);
        registerBlockRender(netherstar_block);

        /*registerBlockRender(polished_endstone);
        registerBlockRender(polished_obsidian);
        registerBlockRender(polished_netherrack);
        registerBlockRender(polished_prismarine);
        registerBlockRender(polished_prismarine_dark);
        registerBlockRender(polished_glowstone);*/

    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }
}
