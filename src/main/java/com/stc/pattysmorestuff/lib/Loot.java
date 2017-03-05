package com.stc.pattysmorestuff.lib;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Dictionary;

/**
 * Created by patrick on 05/03/2017.
 */
public class Loot {

    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent event)
    {
        if (!event.getName().getResourceDomain().equals("minecraft"))
            return;

        if (event.getName() == LootTableList.CHESTS_VILLAGE_BLACKSMITH)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_village_blacksmith");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_ABANDONED_MINESHAFT)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_abandoned_mineshaft");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_DESERT_PYRAMID)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_desert_pyramid");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_END_CITY_TREASURE)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_end_city_treasure");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_IGLOO_CHEST)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_igloo_chest");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_JUNGLE_TEMPLE)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_jungle_temple");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_JUNGLE_TEMPLE_DISPENSER)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_jungle_temple_dispenser");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_NETHER_BRIDGE)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_nether_bridge");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_SIMPLE_DUNGEON)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_simple_dungeon");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_STRONGHOLD_CORRIDOR)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_stronghold_corridor");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_STRONGHOLD_CROSSING)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_stronghold_crossing");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.CHESTS_STRONGHOLD_LIBRARY)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_stronghold_library");
                event.getTable().addPool(pool);
            }
        }

        if (event.getName() == LootTableList.GAMEPLAY_FISHING_TREASURE)
        {
            ResourceLocation resourceLocation = new ResourceLocation(Strings.MODID, event.getName().getResourcePath());
            LootTable additions = LootTableLoader.loadBuiltinLootTable(resourceLocation);
            if (additions != null)
            {
                LootPool pool = additions.getPool("pattysmorestuff_treasure");
                event.getTable().addPool(pool);
            }
        }
    }
}
