package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.blocks.BlockDiamondFurnace;
import com.stc.pattysmorestuff.blocks.BlockEmeraldFurnace;
import com.stc.pattysmorestuff.blocks.BlockGoldFurnace;
import com.stc.pattysmorestuff.blocks.BlockIronFurnace;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModFurnaces {

    public static BlockIronFurnace iron_furnace = new BlockIronFurnace("iron_furnace", false);
    public static BlockIronFurnace iron_furnace_active = new BlockIronFurnace("iron_furnace_active", true);

    public static BlockGoldFurnace gold_furnace = new BlockGoldFurnace("gold_furnace", false);
    public static BlockGoldFurnace gold_furnace_active = new BlockGoldFurnace("gold_furnace_active", true);

    public static BlockDiamondFurnace diamond_furnace = new BlockDiamondFurnace("diamond_furnace", false);
    public static BlockDiamondFurnace diamond_furnace_active = new BlockDiamondFurnace("diamond_furnace_active", true);

    public static BlockEmeraldFurnace emerald_furnace = new BlockEmeraldFurnace("emerald_furnace", false);
    public static BlockEmeraldFurnace emerald_furnace_active = new BlockEmeraldFurnace("emerald_furnace_active", true);

    public static void registerBlocks(final IForgeRegistry<Block> event) {
        final Block[] blocks = {
                iron_furnace,
                iron_furnace_active,
                gold_furnace,
                gold_furnace_active,
                diamond_furnace,
                diamond_furnace_active,
                emerald_furnace,
                emerald_furnace_active
        };

        event.registerAll(blocks);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                iron_furnace.createItemBlock(),
                iron_furnace_active.createItemBlock(),
                gold_furnace.createItemBlock(),
                gold_furnace_active.createItemBlock(),
                diamond_furnace.createItemBlock(),
                diamond_furnace_active.createItemBlock(),
                emerald_furnace.createItemBlock(),
                emerald_furnace_active.createItemBlock()
        );
    }

    public static void registerModels() {

        registerBlockRender(iron_furnace);
        registerBlockRender(iron_furnace_active);
        registerBlockRender(gold_furnace);
        registerBlockRender(gold_furnace_active);
        registerBlockRender(diamond_furnace);
        registerBlockRender(diamond_furnace_active);
        registerBlockRender(emerald_furnace);
        registerBlockRender(emerald_furnace_active);
    }

    public static void registerBlockRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Strings.MODID, fileName), "inventory"));
    }
}
