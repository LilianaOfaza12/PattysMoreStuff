package com.stc.pattysmorestuff.blocks.init;

import com.stc.pattysmorestuff.blocks.*;
import com.stc.pattysmorestuff.blocks.item.ItemBlockMeta;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.stc.pattysmorestuff.tabs.ModTabs;
import com.stc.pattysmorestuff.blocks.crates.*;
import com.stc.pattysmorestuff.blocks.ores.BlockDyeOre;
import com.stc.pattysmorestuff.blocks.ores.BlockEnderPearlOre;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by StuffTheChicken on 14/11/2016.
 */
public class ModBlocks {

    public static Block dye_ore;
    public static Block ender_pearl_ore;

    public static Block dye_block;
    public static Block stonebrick;

    public static Block oak_storage_crate;
    public static Block spruce_storage_crate;
    public static Block birch_storage_crate;
    public static Block jungle_storage_crate;
    public static Block big_oak_storage_crate;
    public static Block acacia_storage_crate;

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

    public static Block reinforced_obsidian;
    public static Block reinforced_glass;
    public static Block glowair;

    public static void init() {

        dye_ore = new BlockDyeOre("dye_ore");
        registerBlock(dye_ore, new ItemBlockMeta(dye_ore));

        ender_pearl_ore = new BlockEnderPearlOre("ender_pearl_ore");
        registerBlock(ender_pearl_ore, new ItemBlockMeta(ender_pearl_ore));

        dye_block = new BlockDye("dye_block");
        registerBlock(dye_block, new ItemBlockMeta(dye_block));

        stonebrick = new BlockDyeStonebrick("stonebrick");
        registerBlock(stonebrick, new ItemBlockMeta(stonebrick));

        registerBlock(oak_storage_crate = new BlockOakCrate("oak_storage_crate"));
        registerBlock(spruce_storage_crate = new BlockSpruceCrate("spruce_storage_crate"));
        registerBlock(birch_storage_crate = new BlockBirchCrate("birch_storage_crate"));
        registerBlock(jungle_storage_crate = new BlockJungleCrate("jungle_storage_crate"));
        registerBlock(acacia_storage_crate = new BlockAcaciaCrate("acacia_storage_crate"));
        registerBlock(big_oak_storage_crate = new BlockBigOakCrate("big_oak_storage_crate"));

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

        registerBlock(reinforced_obsidian = new BlockReinforcedObsidian("reinforced_obsidian"));
        registerBlock(reinforced_glass = new BlockReinforcedGlass("reinforced_glass", false));
        glowair = new BlockHiddenLight("glowair");
        registerBlock(glowair);
    }

    public static void registerRenders() {

        for(int i = 0; i < EnumHandler.BlockType.values().length; i++) {
            registerRender(dye_block, i, "dye_block_" + EnumHandler.BlockType.values()[i].getName());
        }

        for(int i = 0; i < EnumHandler.BrickType.values().length; i++) {
            registerRender(stonebrick, i, "stonebrick_" + EnumHandler.BrickType.values()[i].getName());
        }

        for(int i = 0; i < EnumHandler.OreType.values().length; i++) {
            registerRender(dye_ore, i, "dye_ore_" + EnumHandler.OreType.values()[i].getName());
            registerRender(ender_pearl_ore, i, "ender_pearl_ore_" + EnumHandler.OreType.values()[i].getName());
        }

        registerRender(oak_storage_crate);
        registerRender(spruce_storage_crate);
        registerRender(birch_storage_crate);
        registerRender(jungle_storage_crate);
        registerRender(big_oak_storage_crate);
        registerRender(acacia_storage_crate);

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

        registerRender(reinforced_obsidian);
        registerRender(reinforced_glass);
        registerRender(glowair);
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
