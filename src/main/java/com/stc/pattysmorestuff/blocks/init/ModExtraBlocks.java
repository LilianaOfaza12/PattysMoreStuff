package com.stc.pattysmorestuff.blocks.init;

import com.stc.pattysmorestuff.blocks.BlockCellingLight;
import com.stc.pattysmorestuff.blocks.BlockReinforcedGlass;
import com.stc.pattysmorestuff.blocks.BlockReinforcedObsidian;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by StuffTheChicken on 30/01/2017.
 */
public class ModExtraBlocks {

    public static Block reinforced_obsidian;
    public static Block reinforced_glass;

    public static void init() {

        registerBlock(reinforced_obsidian = new BlockReinforcedObsidian("reinforced_obsidian"));
        registerBlock(reinforced_glass = new BlockReinforcedGlass("reinforced_glass", false));

    }

    public static void registerRenders() {

        registerRender(reinforced_obsidian);
        registerRender(reinforced_glass);

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


}
