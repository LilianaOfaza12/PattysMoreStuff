package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.blocks.BlockColoredButton;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

public class ModButtons {

    public static BlockColoredButton white_button = new BlockColoredButton("white_button");
    public static BlockColoredButton orange_button = new BlockColoredButton("orange_button");
    public static BlockColoredButton magenta_button = new BlockColoredButton("magenta_button");
    public static BlockColoredButton light_blue_button = new BlockColoredButton("light_blue_button");
    public static BlockColoredButton yellow_button = new BlockColoredButton("yellow_button");
    public static BlockColoredButton lime_button = new BlockColoredButton("lime_button");
    public static BlockColoredButton pink_button = new BlockColoredButton("pink_button");
    public static BlockColoredButton gray_button = new BlockColoredButton("gray_button");
    public static BlockColoredButton silver_button = new BlockColoredButton("silver_button");
    public static BlockColoredButton cyan_button = new BlockColoredButton("cyan_button");
    public static BlockColoredButton purple_button = new BlockColoredButton("purple_button");
    public static BlockColoredButton blue_button = new BlockColoredButton("blue_button");
    public static BlockColoredButton brown_button = new BlockColoredButton("brown_button");
    public static BlockColoredButton green_button = new BlockColoredButton("green_button");
    public static BlockColoredButton red_button = new BlockColoredButton("red_button");
    public static BlockColoredButton black_button = new BlockColoredButton("black_button");

    public static BlockColoredButton spruce_button = new BlockColoredButton("spruce_button");
    public static BlockColoredButton birch_button = new BlockColoredButton("birch_button");
    public static BlockColoredButton jungle_button = new BlockColoredButton("jungle_button");
    public static BlockColoredButton acacia_button = new BlockColoredButton("acacia_button");
    public static BlockColoredButton dark_oak_button = new BlockColoredButton("dark_oak_button");

    public static void registerBlocks(final IForgeRegistry<Block> event) {
        final Block[] blocks = {
                white_button, orange_button, magenta_button,
                light_blue_button, yellow_button, lime_button, pink_button, gray_button,
                silver_button, cyan_button, purple_button, blue_button, brown_button,
                green_button, red_button, black_button, spruce_button, birch_button,
                jungle_button, acacia_button, dark_oak_button

        };
        event.registerAll(blocks);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(

                white_button.createItemBlock(),
                orange_button.createItemBlock(),
                magenta_button.createItemBlock(),
                light_blue_button.createItemBlock(),
                yellow_button.createItemBlock(),
                lime_button.createItemBlock(),
                pink_button.createItemBlock(),
                gray_button.createItemBlock(),
                silver_button.createItemBlock(),
                cyan_button.createItemBlock(),
                purple_button.createItemBlock(),
                blue_button.createItemBlock(),
                brown_button.createItemBlock(),
                green_button.createItemBlock(),
                red_button.createItemBlock(),
                black_button.createItemBlock(),
                spruce_button.createItemBlock(),
                birch_button.createItemBlock(),
                jungle_button.createItemBlock(),
                acacia_button.createItemBlock(),
                dark_oak_button.createItemBlock()
        );
    }

    public static void registerModels() {

        registerBlockRender(white_button);
        registerBlockRender(orange_button);
        registerBlockRender(magenta_button);
        registerBlockRender(light_blue_button);
        registerBlockRender(yellow_button);
        registerBlockRender(lime_button);
        registerBlockRender(pink_button);
        registerBlockRender(gray_button);
        registerBlockRender(silver_button);
        registerBlockRender(cyan_button);
        registerBlockRender(purple_button);
        registerBlockRender(blue_button);
        registerBlockRender(brown_button);
        registerBlockRender(green_button);
        registerBlockRender(red_button);
        registerBlockRender(black_button);
        registerBlockRender(spruce_button);
        registerBlockRender(birch_button);
        registerBlockRender(jungle_button);
        registerBlockRender(acacia_button);
        registerBlockRender(dark_oak_button);
    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }
}
