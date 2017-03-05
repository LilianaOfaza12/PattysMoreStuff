package com.stc.pattysmorestuff.lib;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.conditions.LootConditionManager;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.LootFunctionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.URL;

/**
 * Created by patrick on 05/03/2017.
 */
public class LootTableLoader {

    private static final Gson GSON_INSTANCE = (new GsonBuilder()).registerTypeAdapter(RandomValueRange.class, new RandomValueRange.Serializer()).registerTypeAdapter(LootPool.class, new LootPool.Serializer()).registerTypeAdapter(LootTable.class, new LootTable.Serializer()).registerTypeHierarchyAdapter(LootEntry.class, new LootEntry.Serializer()).registerTypeHierarchyAdapter(LootFunction.class, new LootFunctionManager.Serializer()).registerTypeHierarchyAdapter(LootCondition.class, new LootConditionManager.Serializer()).registerTypeHierarchyAdapter(LootContext.EntityTarget.class, new LootContext.EntityTarget.Serializer()).create();
    private static final Logger LOGGER = LogManager.getLogger();

    @Nullable
    public static LootTable loadBuiltinLootTable(ResourceLocation resource) {
        URL url = LootTableManager.class.getResource("/assets/" + resource.getResourceDomain() + "/loot_tables/" + resource.getResourcePath() + ".json");

        if (url != null) {
            String s;

            try {
                s = Resources.toString(url, Charsets.UTF_8);
            } catch (IOException ioexception) {
                LootTableLoader.LOGGER.warn("Couldn\'t load loot table {} from {}", resource, url, ioexception);
                return LootTable.EMPTY_LOOT_TABLE;
            }

            try {
                return net.minecraftforge.common.ForgeHooks.loadLootTable(LootTableLoader.GSON_INSTANCE, resource, s, false);
            } catch (JsonParseException jsonparseexception) {
                LootTableLoader.LOGGER.error("Couldn\'t load loot table {} from {}", resource, url, jsonparseexception);
                return LootTable.EMPTY_LOOT_TABLE;
            }
        } else {
            return null;
        }
    }
}
