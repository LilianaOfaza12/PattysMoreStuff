package com.stc.pattysmorestuff.handlers;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.init.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

/**
 * Created by patrick on 20/07/2017.
 */
@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //Misc Items
            ModItems.register(event.getRegistry());
        //Armor
            ModArmor.register(event.getRegistry());
            ModColoredArmor.register(event.getRegistry());
        //Tools
            ModTools.register(event.getRegistry());
            ModColoredTools.register(event.getRegistry());
            ModColoredPaxels.register(event.getRegistry());
            ModColoredBattleaxe.register(event.getRegistry());
        //Food
            ModFood.register(event.getRegistry());
        //Blocks
            ModBlocks.registerItemBlocks(event.getRegistry());
            ModFurnaces.registerItemBlocks(event.getRegistry());
            ModColoredBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Blocks
            ModBlocks.registerBlocks(event.getRegistry());
            ModFurnaces.registerBlocks(event.getRegistry());
            ModColoredBlocks.registerBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        ResourceLocation bread = new ResourceLocation("minecraft:bread");
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
        modRegistry.remove(bread);

    }
}
