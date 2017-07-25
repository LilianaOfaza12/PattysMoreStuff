package com.stc.pattysmorestuff.configuration;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by patrick on 20/07/2017.
 */
public class ConfigurationPMS {

    public static void syncConfig() {

        /*ConfigPreInit.disableTools = PattysMoreStuff.Config.get("PattysMoreStuff.Other.tools", "enableTools", true).getBoolean(true);
        ConfigPreInit.disableArmor = PattysMoreStuff.Config.get("PattysMoreStuff.Other.armor", "enableArmor", true).getBoolean(true);
        ConfigPreInit.disableBlocks = PattysMoreStuff.Config.get("PattysMoreStuff.Other.blocks", "enableBlocks", true).getBoolean(true);
        ConfigPreInit.disableFurnaces = PattysMoreStuff.Config.get("PattysMoreStuff.Other.furnaces", "enableFurnaces", true).getBoolean(true);
        ConfigPreInit.disableFood = PattysMoreStuff.Config.get("PattysMoreStuff.Other.food", "enableFood", true).getBoolean(true);
        ConfigPreInit.disableMiscItems = PattysMoreStuff.Config.get("PattysMoreStuff.Other.miscItems", "enableMiscItems", true).getBoolean(true);
        */

        ConfigPreInit.oreBlockCount = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "How many ore blocks spawn together", ConfigPreInit.oreBlockCount).getInt();
        ConfigPreInit.oreChanceToSpawn = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "The chance the ore can spawn", ConfigPreInit.oreChanceToSpawn).getInt();
        ConfigPreInit.oreMinY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "The minimum height the ore will spawn at", ConfigPreInit.oreMinY).getInt();
        ConfigPreInit.oreMaxY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "The maximum height the ore will spawn at", ConfigPreInit.oreMaxY).getInt();

        ConfigPreInit.oreEnderBlockCount = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "How many ore blocks spawn together", ConfigPreInit.oreEnderBlockCount).getInt();
        ConfigPreInit.oreEnderChanceToSpawn = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "The chance the ore can spawn", ConfigPreInit.oreEnderChanceToSpawn).getInt();
        ConfigPreInit.oreEnderMinY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "The minimum height the ore will spawn at", ConfigPreInit.oreEnderMinY).getInt();
        ConfigPreInit.oreEnderMaxY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "The maximum height the ore will spawn at", ConfigPreInit.oreEnderMaxY).getInt();

        ConfigPreInit.ironFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden slab burns for in the iron furnace", 150).getInt();
        ConfigPreInit.ironFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long wood material burns for in the iron furnace", 300).getInt();
        ConfigPreInit.ironFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the coal block burns for in the iron furnace", 16000).getInt();
        ConfigPreInit.ironFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden tool burns for in the iron furnace", 200).getInt();
        ConfigPreInit.ironFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden sword burns for in the iron furnace", 200).getInt();
        ConfigPreInit.ironFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden hoe burns for in the iron furnace", 200).getInt();
        ConfigPreInit.ironFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the stick burns for in the iron furnace", 100).getInt();
        ConfigPreInit.ironFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the coal burns for in the iron furnace", 1600).getInt();
        ConfigPreInit.ironFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the lave bucket burns for in the iron furnace", 20000).getInt();
        ConfigPreInit.ironFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the sapling burns for in the iron furnace", 100).getInt();
        ConfigPreInit.ironFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the blaze rod burns for in the iron furnace", 2400).getInt();

        ConfigPreInit.goldFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden slab burns for in the gold furnace", 150).getInt();
        ConfigPreInit.goldFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden slab burns for in the gold furnace", 150).getInt();
        ConfigPreInit.goldFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long wood material burns for in the gold furnace", 300).getInt();
        ConfigPreInit.goldFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the coal block burns for in the gold furnace", 16000).getInt();
        ConfigPreInit.goldFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden tool burns for in the gold furnace", 200).getInt();
        ConfigPreInit.goldFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden sword burns for in the gold furnace", 200).getInt();
        ConfigPreInit.goldFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden hoe burns for in the gold furnace", 200).getInt();
        ConfigPreInit.goldFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the stick burns for in the gold furnace", 100).getInt();
        ConfigPreInit.goldFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the coal burns for in the gold furnace", 1600).getInt();
        ConfigPreInit.goldFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the lave bucket burns for in the gold furnace", 20000).getInt();
        ConfigPreInit.goldFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the sapling burns for in the gold furnace", 100).getInt();
        ConfigPreInit.goldFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the blaze rod burns for in the gold furnace", 2400).getInt();

        ConfigPreInit.diamondFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden slab burns for in the diamond furnace", 150).getInt();
        ConfigPreInit.diamondFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden slab burns for in the diamond furnace", 150).getInt();
        ConfigPreInit.diamondFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long wood material burns for in the diamond furnace", 300).getInt();
        ConfigPreInit.diamondFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the coal block burns for in the diamond furnace", 16000).getInt();
        ConfigPreInit.diamondFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden tool burns for in the diamond furnace", 200).getInt();
        ConfigPreInit.diamondFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden sword burns for in the diamond furnace", 200).getInt();
        ConfigPreInit.diamondFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden hoe burns for in the diamond furnace", 200).getInt();
        ConfigPreInit.diamondFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the stick burns for in the diamond furnace", 100).getInt();
        ConfigPreInit.diamondFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the coal burns for in the diamond furnace", 1600).getInt();
        ConfigPreInit.diamondFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the lave bucket burns for in the diamond furnace", 20000).getInt();
        ConfigPreInit.diamondFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the sapling burns for in the diamond furnace", 100).getInt();
        ConfigPreInit.diamondFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the blaze rod burns for in the diamond furnace", 2400).getInt();

        ConfigPreInit.emeraldFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden slab burns for in the emerald furnace", 150).getInt();
        ConfigPreInit.emeraldFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden slab burns for in the emerald furnace", 150).getInt();
        ConfigPreInit.emeraldFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long wood material burns for in the emerald furnace", 300).getInt();
        ConfigPreInit.emeraldFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the coal block burns for in the emerald furnace", 16000).getInt();
        ConfigPreInit.emeraldFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden tool burns for in the emerald furnace", 200).getInt();
        ConfigPreInit.emeraldFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden sword burns for in the emerald furnace", 200).getInt();
        ConfigPreInit.emeraldFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden hoe burns for in the emerald furnace", 200).getInt();
        ConfigPreInit.emeraldFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the stick burns for in the emerald furnace", 100).getInt();
        ConfigPreInit.emeraldFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the coal burns for in the emerald furnace", 1600).getInt();
        ConfigPreInit.emeraldFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the lave bucket burns for in the emerald furnace", 20000).getInt();
        ConfigPreInit.emeraldFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the sapling burns for in the emerald furnace", 100).getInt();
        ConfigPreInit.emeraldFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the blaze rod burns for in the emerald furnace", 2400).getInt();

        ConfigPreInit.ironFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "Lower the number to speed up the furnace cook time or higher the number to slow down cook time", 150).getInt();
        ConfigPreInit.goldFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "Lower the number to speed up the furnace cook time or higher the number to slow down cook time", 100).getInt();
        ConfigPreInit.diamondFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "Lower the number to speed up furnace cook time or higher the number to slow down cook time", 75).getInt();
        ConfigPreInit.emeraldFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "Lower the number to speed up furnace cook time or higher the number to slow down cook time", 50).getInt();

        if (PattysMoreStuff.Config.hasChanged()) {
            PattysMoreStuff.Config.save();
        }
        if(ConfigPreInit.disableTools) {

            ConfigPreInit.NETHERSTAR_TOOL = EnumHelper.addToolMaterial("NETHERSTAR_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "Max Uses", 7500).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "EfficiencyOnProperty", 25.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "DamageVsEntity", 18).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "Enchantability", 50).getInt());

            ConfigPreInit.OBSIDIAN_TOOL = EnumHelper.addToolMaterial("OBSIDIAN_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "Max Uses", 872).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "EfficiencyOnProperty", 6.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "DamageVsEntity", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "Enchantability", 10).getInt());

            ConfigPreInit.ENDER_TOOL = EnumHelper.addToolMaterial("ENDER_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "Max Uses", 1250).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "EfficiencyOnProperty", 7.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "DamageVsEntity", 4).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "Enchantability", 14).getInt());

            ConfigPreInit.EMERALD_TOOL = EnumHelper.addToolMaterial("EMERALD_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "Max Uses", 2256).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "EfficiencyOnProperty", 18.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "DamageVsEntity", 9).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "Enchantability", 25).getInt());

            ConfigPreInit.QUARTZ_TOOL = EnumHelper.addToolMaterial("QUARTZ_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "Harvest Level", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "Max Uses", 317).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "EfficiencyOnProperty", 5.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "Enchantability", 10).getInt());

            ConfigPreInit.BLAZE_TOOL = EnumHelper.addToolMaterial("BLAZE_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "Harvest Level", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "Max Uses", 972).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "EfficiencyOnProperty", 9.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "DamageVsEntity", 4).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "Enchantability", 12).getInt());

            ConfigPreInit.GLOWSTONE_TOOL = EnumHelper.addToolMaterial("GLOWSTONE_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "Harvest Level", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "Max Uses", 317).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "EfficiencyOnProperty", 5.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "Enchantability", 10).getInt());

            ConfigPreInit.REDSTONE_TOOL = EnumHelper.addToolMaterial("REDSTONE_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "Max Uses", 652).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "EfficiencyOnProperty", 6.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "DamageVsEntity", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "Enchantability", 14).getInt());

            ConfigPreInit.SLIME_TOOL = EnumHelper.addToolMaterial("SLIME_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.slime.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.slime.regular", "Max Uses", 1250).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.regular", "EfficiencyOnProperty", 7.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.regular", "DamageVsEntity", 4).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.slime.regular", "Enchantability", 14).getInt());

            ConfigPreInit.SNOW_TOOL = EnumHelper.addToolMaterial("SNOW_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.snow.regular", "Harvest Level", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.snow.regular", "Max Uses", 1250).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.regular", "EfficiencyOnProperty", 7.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.regular", "DamageVsEntity", 4).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.snow.regular", "Enchantability", 14).getInt());

            ConfigPreInit.GUNPOWDER_TOOL = EnumHelper.addToolMaterial("GUNPOWDER_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.regular", "Harvest Level", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.regular", "Max Uses", 700).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.regular", "EfficiencyOnProperty", 5.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.regular", "DamageVsEntity", 4).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.regular", "Enchantability", 8).getInt());

            ConfigPreInit.COAL_TOOL = EnumHelper.addToolMaterial("COAL_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "Max Uses", 192).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "Enchantability", 6).getInt());

            ConfigPreInit.FLINT_TOOL = EnumHelper.addToolMaterial("FLINT_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.flint.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.flint.regular", "Max Uses", 176).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.flint.regular", "Enchantability", 6).getInt());

            ConfigPreInit.LEATHER_TOOL = EnumHelper.addToolMaterial("LEATHER_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.leather.regular", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.leather.regular", "Max Uses", 96).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.leather.regular", "EfficiencyOnProperty", 2.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.leather.regular", "DamageVsEntity", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.leather.regular", "Enchantability", 15).getInt());

            ConfigPreInit.BRICK_TOOL = EnumHelper.addToolMaterial("BRICK_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.regular", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.regular", "Enchantability", 5).getInt());

            ConfigPreInit.NETHERBRICK_TOOL = EnumHelper.addToolMaterial("NETHERBRICK_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.regular", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.regular", "Enchantability", 5).getInt());

            ConfigPreInit.RED_NETHERBRICK_TOOL = EnumHelper.addToolMaterial("RED_NETHERBRICK_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.regular", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.regular", "Enchantability", 5).getInt());

            ConfigPreInit.DYE_TOOL = EnumHelper.addToolMaterial("DYE_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye.regular", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye.regular", "Max Uses", 72).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.dye.regular", "EfficiencyOnProperty", 2.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.dye.regular", "DamageVsEntity", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye.regular", "Enchantability", 15).getInt());

            ConfigPreInit.CLAY_TOOL = EnumHelper.addToolMaterial("CLAY_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.clay.regular", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.clay.regular", "Max Uses", 59).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.regular", "EfficiencyOnProperty", 2.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.regular", "DamageVsEntity", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.clay.regular", "Enchantability", 15).getInt());

            ConfigPreInit.SANDSTONE_TOOL = EnumHelper.addToolMaterial("SANDSTONE_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "Enchantability", 5).getInt());

            ConfigPreInit.SOULSAND_TOOL = EnumHelper.addToolMaterial("SOULSAND_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "Harvest Level", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "Enchantability", 5).getInt());


            ConfigPreInit.MAGMACREAM_TOOL = EnumHelper.addToolMaterial("MAGMACREAM_TOOL",
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "Harvest Level", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "Max Uses", 250).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "EfficiencyOnProperty", 6.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "Enchantability", 14).getInt());

            ConfigPreInit.NETHERSTAR_PAXEL = EnumHelper.addToolMaterial("NETHERSTAR_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "Max Uses", 19500).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "EfficiencyOnProperty", 30.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "DamageVsEntity", 17).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "Enchantability", 60).getInt());
            ConfigPreInit.OBSIDIAN_PAXEL = EnumHelper.addToolMaterial("OBSIDIAN_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "Max Uses", 2100).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "Enchantability", 14).getInt());
            ConfigPreInit.ENDER_PAXEL = EnumHelper.addToolMaterial("ENDER_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "Max Uses", 3450).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "Enchantability", 16).getInt());
            ConfigPreInit.EMERALD_PAXEL = EnumHelper.addToolMaterial("EMERALD_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "Max Uses", 6861).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "EfficiencyOnProperty", 22.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "DamageVsEntity", 12).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "Enchantability", 40).getInt());
            ConfigPreInit.QUARTZ_PAXEL = EnumHelper.addToolMaterial("QUARTZ_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "Max Uses", 972).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "Enchantability", 12).getInt());
            ConfigPreInit.BLAZE_PAXEL = EnumHelper.addToolMaterial("BLAZE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "Max Uses", 2156).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "Enchantability", 15).getInt());
            ConfigPreInit.GLOWSTONE_PAXEL = EnumHelper.addToolMaterial("GLOWSTONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "Max Uses", 972).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "Enchantability", 12).getInt());
            ConfigPreInit.REDSTONE_PAXEL = EnumHelper.addToolMaterial("REDSTONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "Max Uses", 1456).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "EfficiencyOnProperty", 7.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "Enchantability", 16).getInt());
            ConfigPreInit.SLIME_PAXEL = EnumHelper.addToolMaterial("SLIME_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.slime.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.slime.paxel", "Max Uses", 3450).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.paxel", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.slime.paxel", "Enchantability", 16).getInt());
            ConfigPreInit.SNOW_PAXEL = EnumHelper.addToolMaterial("SNOW_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.snow.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.snow.paxel", "Max Uses", 3450).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.paxel", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.paxel", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.snow.paxel", "Enchantability", 16).getInt());
            ConfigPreInit.GUNPOWDER_PAXEL = EnumHelper.addToolMaterial("GUNPOWDER_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.paxel", "Max Uses", 1648).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.paxel", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.paxel", "DamageVsEntity", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.paxel", "Enchantability", 10).getInt());
            ConfigPreInit.COAL_PAXEL = EnumHelper.addToolMaterial("COAL_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "Max Uses", 696).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "EfficiencyOnProperty", 5.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "Enchantability", 7).getInt());
            ConfigPreInit.FLINT_PAXEL = EnumHelper.addToolMaterial("FLINT_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.flint.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.flint.paxel", "Max Uses", 672).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.paxel", "EfficiencyOnProperty", 5.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.paxel", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.flint.paxel", "Enchantability", 7).getInt());
            ConfigPreInit.LEATHER_PAXEL = EnumHelper.addToolMaterial("LEATHER_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.leather.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.leather.paxel", "Max Uses", 262).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.leather.paxel", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.leather.paxel", "DamageVsEntity", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.leather.paxel", "Enchantability", 15).getInt());
            ConfigPreInit.BRICK_PAXEL = EnumHelper.addToolMaterial("BRICK_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "Max Uses", 382).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "Enchantability", 5).getInt());
            ConfigPreInit.NBRICK_PAXEL = EnumHelper.addToolMaterial("NBRICK_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "Max Uses", 382).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "Enchantability", 5).getInt());
            ConfigPreInit.RED_NBRICK_PAXEL = EnumHelper.addToolMaterial("RED_NBRICK_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "Max Uses", 382).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "Enchantability", 5).getInt());
            ConfigPreInit.DYE_PAXEL = EnumHelper.addToolMaterial("DYE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.dye.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.dye.paxel", "Max Uses", 249).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.dye.paxel", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.dye.paxel", "DamageVsEntity", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.dye.paxel", "Enchantability", 15).getInt());
            ConfigPreInit.SANDSTONE_PAXEL = EnumHelper.addToolMaterial("SANDSTONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "Max Uses", 392).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "Enchantability", 5).getInt());
            ConfigPreInit.SOUL_SAND_PAXEL = EnumHelper.addToolMaterial("SOUL_SAND_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "Max Uses", 392).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "Enchantability", 5).getInt());
            ConfigPreInit.CLAY_PAXEL = EnumHelper.addToolMaterial("CLAY_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.clay.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.clay.paxel", "Max Uses", 172).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.paxel", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.paxel", "DamageVsEntity", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.clay.paxel", "Enchantability", 15).getInt());
            ConfigPreInit.MAGMA_CREAM_PAXEL = EnumHelper.addToolMaterial("MAGMA_CREAM_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "Max Uses", 863).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "Enchantability", 14).getInt());
            ConfigPreInit.WOOD_PAXEL = EnumHelper.addToolMaterial("WOOD_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "Max Uses", 172).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "Enchantability", 15).getInt());
            ConfigPreInit.STONE_PAXEL = EnumHelper.addToolMaterial("STONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "Max Uses", 392).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "Enchantability", 5).getInt());
            ConfigPreInit.IRON_PAXEL = EnumHelper.addToolMaterial("IRON_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "Max Uses", 863).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "Enchantability", 14).getInt());
            ConfigPreInit.GOLD_PAXEL = EnumHelper.addToolMaterial("GOLD_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "Max Uses", 128).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "Enchantability", 22).getInt());
            ConfigPreInit.DIAMOND_PAXEL = EnumHelper.addToolMaterial("DIAMOND_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "Max Uses", 4596).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "DamageVsEntity", 8).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "Enchantability", 10).getInt());

            ConfigPreInit.NETHERSTAR_BATTLEAXE = EnumHelper.addToolMaterial("NETHERSTAR_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "Max Uses", 19500).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "EfficiencyOnProperty", 30.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "DamageVsEntity", 17).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "Enchantability", 60).getInt());
            ConfigPreInit.OBSIDIAN_BATTLEAXE = EnumHelper.addToolMaterial("OBSIDIAN_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "Max Uses", 2100).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "Enchantability", 14).getInt());
            ConfigPreInit.ENDER_BATTLEAXE = EnumHelper.addToolMaterial("ENDER_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "Max Uses", 3450).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "Enchantability", 16).getInt());
            ConfigPreInit.EMERALD_BATTLEAXE = EnumHelper.addToolMaterial("EMERALD_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "Max Uses", 6861).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "EfficiencyOnProperty", 22.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "DamageVsEntity", 12).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "Enchantability", 40).getInt());
            ConfigPreInit.QUARTZ_BATTLEAXE = EnumHelper.addToolMaterial("QUARTZ_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "Max Uses", 972).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "Enchantability", 12).getInt());
            ConfigPreInit.BLAZE_BATTLEAXE = EnumHelper.addToolMaterial("BLAZE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "Max Uses", 2156).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "Enchantability", 15).getInt());
            ConfigPreInit.GLOWSTONE_BATTLEAXE = EnumHelper.addToolMaterial("GLOWSTONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "Max Uses", 972).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "Enchantability", 12).getInt());
            ConfigPreInit.REDSTONE_BATTLEAXE = EnumHelper.addToolMaterial("REDSTONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "Max Uses", 1456).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "EfficiencyOnProperty", 7.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "Enchantability", 16).getInt());
            ConfigPreInit.SLIME_BATTLEAXE = EnumHelper.addToolMaterial("SLIME_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.slime.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.slime.battleaxe", "Max Uses", 3450).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.battleaxe", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.slime.battleaxe", "Enchantability", 16).getInt());
            ConfigPreInit.SNOW_BATTLEAXE = EnumHelper.addToolMaterial("SNOW_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.snow.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.snow.battleaxe", "Max Uses", 3450).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.battleaxe", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.battleaxe", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.snow.battleaxe", "Enchantability", 16).getInt());
            ConfigPreInit.GUNPOWDER_BATTLEAXE = EnumHelper.addToolMaterial("GUNPOWDER_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.battleaxe", "Max Uses", 1648).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.battleaxe", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.battleaxe", "DamageVsEntity", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.battleaxe", "Enchantability", 10).getInt());
            ConfigPreInit.COAL_BATTLEAXE = EnumHelper.addToolMaterial("COAL_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "Max Uses", 696).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "EfficiencyOnProperty", 5.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "Enchantability", 7).getInt());
            ConfigPreInit.FLINT_BATTLEAXE = EnumHelper.addToolMaterial("FLINT_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.flint.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.flint.battleaxe", "Max Uses", 672).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.battleaxe", "EfficiencyOnProperty", 5.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.battleaxe", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.flint.battleaxe", "Enchantability", 7).getInt());
            ConfigPreInit.LEATHER_BATTLEAXE = EnumHelper.addToolMaterial("LEATHER_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.leather.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.leather.battleaxe", "Max Uses", 262).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.leather.battleaxe", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.leather.battleaxe", "DamageVsEntity", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.leather.battleaxe", "Enchantability", 15).getInt());
            ConfigPreInit.BRICK_BATTLEAXE = EnumHelper.addToolMaterial("BRICK_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "Max Uses", 382).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "Enchantability", 5).getInt());
            ConfigPreInit.NBRICK_BATTLEAXE = EnumHelper.addToolMaterial("NBRICK_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "Max Uses", 382).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "Enchantability", 5).getInt());
            ConfigPreInit.RED_NBRICK_BATTLEAXE = EnumHelper.addToolMaterial("RED_NBRICK_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "Max Uses", 382).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "Enchantability", 5).getInt());
            ConfigPreInit.DYE_BATTLEAXE = EnumHelper.addToolMaterial("DYE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.dye.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.dye.battleaxe", "Max Uses", 249).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.dye.battleaxe", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.dye.battleaxe", "DamageVsEntity", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.dye.battleaxe", "Enchantability", 15).getInt());
            ConfigPreInit.SANDSTONE_BATTLEAXE = EnumHelper.addToolMaterial("SANDSTONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "Max Uses", 392).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "Enchantability", 5).getInt());
            ConfigPreInit.SOUL_SAND_BATTLEAXE = EnumHelper.addToolMaterial("SOUL_SAND_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "Max Uses", 392).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "DamageVsEntity", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "Enchantability", 5).getInt());
            ConfigPreInit.CLAY_BATTLEAXE = EnumHelper.addToolMaterial("CLAY_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.clay.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.clay.battleaxe", "Max Uses", 172).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.battleaxe", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.battleaxe", "DamageVsEntity", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.clay.battleaxe", "Enchantability", 15).getInt());
            ConfigPreInit.MAGMA_CREAM_BATTLEAXE = EnumHelper.addToolMaterial("MAGMA_CREAM_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "Max Uses", 863).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "Enchantability", 14).getInt());
            ConfigPreInit.WOOD_BATTLEAXE = EnumHelper.addToolMaterial("WOOD_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "Max Uses", 172).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "Enchantability", 15).getInt());
            ConfigPreInit.STONE_BATTLEAXE = EnumHelper.addToolMaterial("STONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "Max Uses", 392).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "Enchantability", 5).getInt());
            ConfigPreInit.IRON_BATTLEAXE = EnumHelper.addToolMaterial("IRON_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "Max Uses", 863).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "Enchantability", 14).getInt());
            ConfigPreInit.GOLD_BATTLEAXE = EnumHelper.addToolMaterial("GOLD_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "Max Uses", 128).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "Enchantability", 22).getInt());
            ConfigPreInit.DIAMOND_BATTLEAXE = EnumHelper.addToolMaterial("DIAMOND_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "Max Uses", 4596).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "DamageVsEntity", 8).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "Enchantability", 10).getInt());

            if (PattysMoreStuff.Config.hasChanged()) {
                PattysMoreStuff.Config.save();
            }
        }

        if(ConfigPreInit.disableArmor) {

            ConfigPreInit.DYE_ARMOR_BLACK = EnumHelper.addArmorMaterial("DYE_ARMOR_BLACK", "pattysmorestuff:black",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.black", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.black", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.black", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.black", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.black", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.black", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.black", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_RED = EnumHelper.addArmorMaterial("DYE_ARMOR_RED", "pattysmorestuff:red",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.red", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.red", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.red", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.red", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.red", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.red", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye.red", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_GREEN = EnumHelper.addArmorMaterial("DYE_ARMOR_GREEN", "pattysmorestuff:green",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.green", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.green", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.green", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.green", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.green", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.green", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.green", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_BROWN = EnumHelper.addArmorMaterial("DYE_ARMOR_BROWN", "pattysmorestuff:brown",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.brown", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.brown", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.brown", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.brown", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.brown", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.brown", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.brown", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_BLUE = EnumHelper.addArmorMaterial("DYE_ARMOR_BLUE", "pattysmorestuff:lapis",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lapis", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lapis", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lapis", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lapis", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lapis", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.lapis", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.lapis", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_PURPLE = EnumHelper.addArmorMaterial("DYE_ARMOR_PURPLE", "pattysmorestuff:purple",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.purple", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.purple", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.purple", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.purple", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.purple", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.purple", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.purple", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_CYAN = EnumHelper.addArmorMaterial("DYE_ARMOR_CYAN", "pattysmorestuff:cyan",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.cyan", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.cyan", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.cyan", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.cyan", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.cyan", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.cyan", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.cyan", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_SILVER = EnumHelper.addArmorMaterial("DYE_ARMOR_SILVER", "pattysmorestuff:light_gray",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_gray", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_gray", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_gray", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_gray", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_gray", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.light_gray", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.light_gray", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_GRAY = EnumHelper.addArmorMaterial("DYE_ARMOR_GRAY", "pattysmorestuff:gray",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.gray", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.gray", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.gray", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.gray", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.gray", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.gray", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.gray", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_PINK = EnumHelper.addArmorMaterial("DYE_ARMOR_PINK", "pattysmorestuff:pink",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.pink", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.pink", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.pink", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.pink", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.pink", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.pink", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.pink", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_LIME = EnumHelper.addArmorMaterial("DYE_ARMOR_LIME", "pattysmorestuff:lime",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lime", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lime", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lime", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lime", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.lime", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.lime", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.lime", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_YELLOW = EnumHelper.addArmorMaterial("DYE_ARMOR_YELLOW", "pattysmorestuff:yellow",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.yellow", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.yellow", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.yellow", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.yellow", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.yellow", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.yellow", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.yellow", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_LIGHT_BLUE = EnumHelper.addArmorMaterial("DYE_ARMOR_LIGHT_BLUE", "pattysmorestuff:light_blue",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_blue", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_blue", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_blue", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_blue", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.light_blue", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.light_blue", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.light_blue", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_MAGENTA = EnumHelper.addArmorMaterial("DYE_ARMOR_MAGENTA", "pattysmorestuff:magenta",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.magenta", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.magenta", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.magenta", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.magenta", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.magenta", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.magenta", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.magenta", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_ORANGE = EnumHelper.addArmorMaterial("DYE_ARMOR_ORANGE", "pattysmorestuff:orange",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.orange", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.orange", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.orange", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.orange", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.orange", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.orange", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.orange", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.DYE_ARMOR_WHITE = EnumHelper.addArmorMaterial("DYE_ARMOR_WHITE", "pattysmorestuff:white",
                    PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.white", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.white", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.white", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.white", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.dye_armor.white", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.white", "Enchantability", 15).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("pattysmorestuff.dye_armor.white", "Toughness", 0.0D).getDouble(0.0D));


            ConfigPreInit.NETHER_STAR_ARMOR = EnumHelper.addArmorMaterial("NETHER_STAR_ARMOR", "PattysMoreStuff:nether_star",
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Durability", 60).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Head", 8).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Chest", 11).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Legs", 13).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Feet", 5).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Enchantability", 10).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Toughness", 4.5D).getDouble(0.0D));

            ConfigPreInit.EMERALD_ARMOR = EnumHelper.addArmorMaterial("EMERALD_ARMOR", "PattysMoreStuff:emerald",
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Durability", 55).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Head", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Chest", 8).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Legs", 10).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Feet", 5).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Enchantability", 10).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Toughness", 3.5D).getDouble(0.0D));


            ConfigPreInit.OBSIDIAN_ARMOR = EnumHelper.addArmorMaterial("OBSIDIAN_ARMOR", "PattysMoreStuff:obsidian",
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Durability", 50).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Head", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Chest", 6).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Legs", 8).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Feet",3).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Enchantability", 10).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Toughness", 4.0D).getDouble(0.0D));

            ConfigPreInit.ENDER_ARMOR = EnumHelper.addArmorMaterial("ENDER_ARMOR", "PattysMoreStuff:ender",
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Durability", 45).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Head", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Chest", 7).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Legs", 9).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Feet", 4).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.SLIME_ARMOR = EnumHelper.addArmorMaterial("SLIME_ARMOR", "PattysMoreStuff:slime",
                    PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Durability", 45).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Head", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Chest", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Legs", 6).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Feet", 3).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.slime.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.MAGMA_CREAM_ARMOR = EnumHelper.addArmorMaterial("MAGMA_CREAM_ARMOR", "PattysMoreStuff:magma_cream",
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Durability", 40).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Head", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Legs", 6).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.BLAZE_ARMOR = EnumHelper.addArmorMaterial("BLAZE_ARMOR", "PattysMoreStuff:blaze",
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Durability", 40).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Head", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.QUARTZ_ARMOR = EnumHelper.addArmorMaterial("QUARTZ_ARMOR", "PattysMoreStuff:quartz",
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Durability", 20).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Head", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Chest", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Legs", 6).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.GLOWSTONE_ARMOR = EnumHelper.addArmorMaterial("GLOWSTONE_ARMOR", "PattysMoreStuff:glowstone",
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Durability", 20).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Head", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Chest", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Legs", 6).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.REDSTONE_ARMOR = EnumHelper.addArmorMaterial("REDSTONE_ARMOR", "PattysMoreStuff:redstone",
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Durability", 20).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Head", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Chest", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Legs", 6).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Enchantability", 9).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.GUNPOWDER_ARMOR = EnumHelper.addArmorMaterial("GUNPOWDER_ARMOR", "PattysMoreStuff:gunpowder",
                    PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.gunpowder.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.COAL_ARMOR = EnumHelper.addArmorMaterial("COAL_ARMOR", "PattysMoreStuff:coal",
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.FLINT_ARMOR = EnumHelper.addArmorMaterial("FLINT_ARMOR", "PattysMoreStuff:flint",
                    PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.flint.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.BRICK_ARMOR = EnumHelper.addArmorMaterial("BRICK_ARMOR", "PattysMoreStuff:brick",
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.NETHER_BRICK_ARMOR = EnumHelper.addArmorMaterial("NETHER_BRICK_ARMOR", "PattysMoreStuff:nether_brick",
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.RED_NETHER_BRICK_ARMOR = EnumHelper.addArmorMaterial("RED_NETHER_BRICK_ARMOR", "PattysMoreStuff:red_nether_brick",
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.SANDSTONE_ARMOR = EnumHelper.addArmorMaterial("SANDSTONE_ARMOR", "PattysMoreStuff:sandstone",
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Durability", 15).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Chest", 4).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Legs", 5).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Feet", 2).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.SOUL_SAND_ARMOR = EnumHelper.addArmorMaterial("SOUL_SAND_ARMOR", "PattysMoreStuff:soul_sand",
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.CLAY_ARMOR = EnumHelper.addArmorMaterial("CLAY_ARMOR", "PattysMoreStuff:clay",
                    PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.clay.armor", "Toughness", 0.0D).getDouble(0.0D));

            ConfigPreInit.SNOW_ARMOR = EnumHelper.addArmorMaterial("SNOW_ARMOR", "PattysMoreStuff:snow",
                    PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Durability", 5).getInt(),
                    new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Head", 1).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Chest", 2).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Legs", 3).getInt(),
                            PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Feet", 1).getInt()},
                    PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Enchantability", 12).getInt(),
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.snow.armor", "Toughness", 0.0D).getDouble(0.0D));

            if (PattysMoreStuff.Config.hasChanged()) {
                PattysMoreStuff.Config.save();
            }
        }
    }
}
