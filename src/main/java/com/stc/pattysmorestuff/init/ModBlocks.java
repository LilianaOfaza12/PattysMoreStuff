package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.blocks.*;
import com.stc.pattysmorestuff.blocks.blender.BlockBlender;
import com.stc.pattysmorestuff.blocks.crates.*;
import com.stc.pattysmorestuff.blocks.jar.BlockJar;
import com.stc.pattysmorestuff.blocks.ores.BlockColoredOre;
import com.stc.pattysmorestuff.blocks.ores.BlockEnderPearlOre;
import com.stc.pattysmorestuff.blocks.reinforced.BlockReinforcedGlass;
import com.stc.pattysmorestuff.blocks.reinforced.BlockReinforcedObsidian;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
                glowair
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
                glowair.createItemBlock()
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


    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }
}
