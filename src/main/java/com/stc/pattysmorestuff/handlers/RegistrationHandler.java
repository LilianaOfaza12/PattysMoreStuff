package com.stc.pattysmorestuff.handlers;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.init.*;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
@Mod.EventBusSubscriber
public class RegistrationHandler {


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //Misc Items
        ModMiscItem.register(event.getRegistry());
        if(ConfigPreInit.disableOther) {

            ModItems.register(event.getRegistry());
        }
        //Armor
        if(ConfigPreInit.disableArmor) {

            ModArmor.register(event.getRegistry());
        }
        //Tools
        if(ConfigPreInit.disableTools) {

            ModTools.register(event.getRegistry());
        }
        //Food
        if(ConfigPreInit.disableFood) {

            ModFood.register(event.getRegistry());
        }
        //Blocks
        if(ConfigPreInit.disableBlocks) {

            ModBlocks.registerItemBlocks(event.getRegistry());
            ModFurnaces.registerItemBlocks(event.getRegistry());
            ModColoredBlocks.registerItemBlocks(event.getRegistry());
            ModButtons.registerItemBlocks(event.getRegistry());
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //Blocks
        if(ConfigPreInit.disableBlocks) {

            ModBlocks.registerBlocks(event.getRegistry());
            ModFurnaces.registerBlocks(event.getRegistry());
            ModColoredBlocks.registerBlocks(event.getRegistry());
            ModButtons.registerBlocks(event.getRegistry());
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();

        ResourceLocation bread = new ResourceLocation("minecraft:bread");
        ResourceLocation wooden_button = new ResourceLocation("minecraft:wooden_button");
        ResourceLocation sandstone_stairs = new ResourceLocation("minecraft:sandstone_stairs");
        ResourceLocation red_sandstone_stairs = new ResourceLocation("minecraft:red_sandstone_stairs");
        ResourceLocation quartz_stairs = new ResourceLocation("minecraft:quartz_stairs");

        if(ConfigPreInit.LavaBucketRecipe == false) {
            ResourceLocation infinite_lava = new ResourceLocation("pattysmorestuff:inf_lava_bucket");
            modRegistry.remove(infinite_lava);
        }
        modRegistry.remove(bread);
        modRegistry.remove(wooden_button);
        modRegistry.remove(sandstone_stairs);
        modRegistry.remove(red_sandstone_stairs);
        modRegistry.remove(quartz_stairs);


    }

}
