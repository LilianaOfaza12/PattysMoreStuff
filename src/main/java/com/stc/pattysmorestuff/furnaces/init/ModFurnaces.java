package com.stc.pattysmorestuff.furnaces.init;

import com.stc.pattysmorestuff.tabs.ModTabs;
import com.stc.pattysmorestuff.furnaces.blocks.BlockDiamondFurnace;
import com.stc.pattysmorestuff.furnaces.blocks.BlockEmeraldFurnace;
import com.stc.pattysmorestuff.furnaces.blocks.BlockGoldFurnace;
import com.stc.pattysmorestuff.furnaces.blocks.BlockIronFurnace;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by StuffTheChicken on 08/01/2017.
 */
public class ModFurnaces {

    public static Block iron_furnace;
    public static Block iron_furnace_active;

    public static Block gold_furnace;
    public static Block gold_furnace_active;

    public static Block diamond_furnace;
    public static Block diamond_furnace_active;

    public static Block emerald_furnace;
    public static Block emerald_furnace_active;


    public static void init() {

        registerBlock(iron_furnace = new BlockIronFurnace("iron_furnace", false).setCreativeTab(ModTabs.tabPattysDecoration));
        registerBlock(iron_furnace_active = new BlockIronFurnace("iron_furnace_active", true));

        registerBlock(gold_furnace = new BlockGoldFurnace("gold_furnace", false).setCreativeTab(ModTabs.tabPattysDecoration));
        registerBlock(gold_furnace_active = new BlockGoldFurnace("gold_furnace_active", true));

        registerBlock(diamond_furnace = new BlockDiamondFurnace("diamond_furnace", false).setCreativeTab(ModTabs.tabPattysDecoration));
        registerBlock(diamond_furnace_active = new BlockDiamondFurnace("diamond_furnace_active", true));

        registerBlock(emerald_furnace = new BlockEmeraldFurnace("emerald_furnace", false).setCreativeTab(ModTabs.tabPattysDecoration));
        registerBlock(emerald_furnace_active = new BlockEmeraldFurnace("emerald_furnace_active", true));
    }

    public static void registerRenders() {

        registerRender(iron_furnace);
        registerRender(iron_furnace_active);

        registerRender(gold_furnace);
        registerRender(gold_furnace_active);

        registerRender(diamond_furnace);
        registerRender(diamond_furnace_active);

        registerRender(emerald_furnace);
        registerRender(emerald_furnace_active);

    }

    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    private static void registerRender(Block item) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(item), 0, new ModelResourceLocation(new ResourceLocation(Strings.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}
