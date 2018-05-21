package com.stc.pattysmorestuff.configuration;

import com.stc.pattysmorestuff.PattysMoreStuff;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ConfigurationPMS {

    public static void syncConfig() {

        ConfigPreInit.disableArmor = PattysMoreStuff.Config.getBoolean("Armor", "PattysMoreStuff.Other.miscItems", true, "Armor 'Set This To False To Disable");
        ConfigPreInit.disableBlocks = PattysMoreStuff.Config.getBoolean("Blocks", "PattysMoreStuff.Other.miscItems", true, "Blocks 'Set This To False To Disable");
        ConfigPreInit.disableFood = PattysMoreStuff.Config.getBoolean("Food", "PattysMoreStuff.Other.miscItems",true, "Food 'Set This To False To Disable");
        ConfigPreInit.disableTools = PattysMoreStuff.Config.getBoolean("Tools", "PattysMoreStuff.Other.miscItems", true, "Tools 'Set This To False To Disable");
        ConfigPreInit.disableOther = PattysMoreStuff.Config.getBoolean("Other", "PattysMoreStuff.Other.miscItems", true, "Other 'Set This To False To Disable");
        ConfigPreInit.LavaBucketRecipe = PattysMoreStuff.Config.getBoolean("Infinite Lava Recipe", "PattysMoreStuff.Other.miscItems", ConfigPreInit.LavaBucketRecipe, "Infinite Lava Recipe 'Set This To True To Enable");


        if(ConfigPreInit.disableBlocks) {
            ConfigPreInit.enableCreativeAir = PattysMoreStuff.Config.getBoolean("Glowing Air In Creative Tab", "PattysMoreStuff.Other.miscItems", false, "Glowing Air In Creative Tab 'Set This To True To Enable");

            ConfigPreInit.lightlevel = PattysMoreStuff.Config.getInt("Light Level for Glowing Air", "PattysMoreStuff.Other.IlluminationWand", ConfigPreInit.lightlevel, 1, 10, "Light Level for Glowing Air");

        }

        if(ConfigPreInit.disableOther) {
            ConfigPreInit.lightWandMaxDamage = PattysMoreStuff.Config.getInt("Illumination Wand Max Uses", "PattysMoreStuff.Other.IlluminationWand", ConfigPreInit.lightWandMaxDamage, 1, 999999999, "Illumination Wand Max Uses");
            ConfigPreInit.milkBottleStackSize = PattysMoreStuff.Config.getInt("Milk Bottle Stack Size", "PattysMoreStuff.Other.Milk", ConfigPreInit.milkBottleStackSize, 1, 64, "Milk Bottle Stack Size");
            ConfigPreInit.chocolateMilkBottleStackSize = PattysMoreStuff.Config.getInt("Chocolate Milk Bottle Stack Size", "PattysMoreStuff.Other.Milk", ConfigPreInit.chocolateMilkBottleStackSize, 1, 64, "Chocolate Milk Bottle Stack Size");
        }

        if(ConfigPreInit.disableBlocks) {
            ConfigPreInit.oreBlockCount = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "How many ore blocks spawn together", ConfigPreInit.oreBlockCount).getInt();
            ConfigPreInit.oreChanceToSpawn = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "The chance the ore can spawn", ConfigPreInit.oreChanceToSpawn).getInt();
            ConfigPreInit.oreMinY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "The minimum height the ore will spawn at", ConfigPreInit.oreMinY).getInt();
            ConfigPreInit.oreMaxY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.dye", "The maximum height the ore will spawn at", ConfigPreInit.oreMaxY).getInt();

            ConfigPreInit.oreEnderBlockCount = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "How many ore blocks spawn together", ConfigPreInit.oreEnderBlockCount).getInt();
            ConfigPreInit.oreEnderChanceToSpawn = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "The chance the ore can spawn", ConfigPreInit.oreEnderChanceToSpawn).getInt();
            ConfigPreInit.oreEnderMinY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "The minimum height the ore will spawn at", ConfigPreInit.oreEnderMinY).getInt();
            ConfigPreInit.oreEnderMaxY = PattysMoreStuff.Config.get("PattysMoreStuff.Ore.ender_pearl", "The maximum height the ore will spawn at", ConfigPreInit.oreEnderMaxY).getInt();

            ConfigPreInit.bushBlackberryBlockCount = PattysMoreStuff.Config.get("PattysMoreStuff.bush.blackberry", "How many bushes spawn together", ConfigPreInit.bushBlackberryBlockCount).getInt();
            ConfigPreInit.bushBlackberryChanceToSpawn = PattysMoreStuff.Config.get("PattysMoreStuff.bush.blackberry", "The chance the bush can spawn", ConfigPreInit.bushBlackberryChanceToSpawn).getInt();
            ConfigPreInit.bushBlackberryMinY = PattysMoreStuff.Config.get("PattysMoreStuff.bush.blackberry", "The minimum height the bush will spawn at", ConfigPreInit.bushBlackberryMinY).getInt();
            ConfigPreInit.bushBlackberryMaxY = PattysMoreStuff.Config.get("PattysMoreStuff.bush.blackberry", "The maximum height the bush will spawn at", ConfigPreInit.bushBlackberryMaxY).getInt();

        }
        if(ConfigPreInit.disableBlocks) {
            ConfigPreInit.ironFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden slab burns for in the iron furnace", ConfigPreInit.ironFWoodenSlabBurnTime).getInt();
            ConfigPreInit.ironFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long wood material burns for in the iron furnace", ConfigPreInit.ironFWoodMaterialBurnTime).getInt();
            ConfigPreInit.ironFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the coal block burns for in the iron furnace", ConfigPreInit.ironFCoalBlockBurnTime).getInt();
            ConfigPreInit.ironFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden tool burns for in the iron furnace", ConfigPreInit.ironFToolWoodBurnTime).getInt();
            ConfigPreInit.ironFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden sword burns for in the iron furnace", ConfigPreInit.ironFSwordWoodBurnTime).getInt();
            ConfigPreInit.ironFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the wooden hoe burns for in the iron furnace", ConfigPreInit.ironFHoeWoodBurnTime).getInt();
            ConfigPreInit.ironFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the stick burns for in the iron furnace", ConfigPreInit.ironFStickBurnTime).getInt();
            ConfigPreInit.ironFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the coal burns for in the iron furnace", ConfigPreInit.ironFCoalBurnTime).getInt();
            ConfigPreInit.ironFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the lave bucket burns for in the iron furnace", ConfigPreInit.ironFLavaBucketBurnTime).getInt();
            ConfigPreInit.ironFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the sapling burns for in the iron furnace", ConfigPreInit.ironFSaplingBurnTime).getInt();
            ConfigPreInit.ironFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "How long the blaze rod burns for in the iron furnace", ConfigPreInit.ironFBlazeRodBurnTime).getInt();

            ConfigPreInit.goldFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden slab burns for in the gold furnace", ConfigPreInit.goldFWoodenSlabBurnTime).getInt();
            ConfigPreInit.goldFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long wood material burns for in the gold furnace", ConfigPreInit.goldFWoodMaterialBurnTime).getInt();
            ConfigPreInit.goldFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the coal block burns for in the gold furnace", ConfigPreInit.goldFCoalBlockBurnTime).getInt();
            ConfigPreInit.goldFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden tool burns for in the gold furnace", ConfigPreInit.goldFToolWoodBurnTime).getInt();
            ConfigPreInit.goldFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden sword burns for in the gold furnace", ConfigPreInit.goldFSwordWoodBurnTime).getInt();
            ConfigPreInit.goldFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the wooden hoe burns for in the gold furnace", ConfigPreInit.goldFHoeWoodBurnTime).getInt();
            ConfigPreInit.goldFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the stick burns for in the gold furnace", ConfigPreInit.goldFStickBurnTime).getInt();
            ConfigPreInit.goldFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the coal burns for in the gold furnace", ConfigPreInit.goldFCoalBurnTime).getInt();
            ConfigPreInit.goldFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the lave bucket burns for in the gold furnace", ConfigPreInit.goldFLavaBucketBurnTime).getInt();
            ConfigPreInit.goldFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the sapling burns for in the gold furnace", ConfigPreInit.goldFSaplingBurnTime).getInt();
            ConfigPreInit.goldFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "How long the blaze rod burns for in the gold furnace", ConfigPreInit.goldFBlazeRodBurnTime).getInt();

            ConfigPreInit.diamondFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden slab burns for in the diamond furnace", ConfigPreInit.diamondFWoodenSlabBurnTime).getInt();
            ConfigPreInit.diamondFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long wood material burns for in the diamond furnace", ConfigPreInit.diamondFWoodMaterialBurnTime).getInt();
            ConfigPreInit.diamondFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the coal block burns for in the diamond furnace", ConfigPreInit.diamondFCoalBlockBurnTime).getInt();
            ConfigPreInit.diamondFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden tool burns for in the diamond furnace", ConfigPreInit.diamondFToolWoodBurnTime).getInt();
            ConfigPreInit.diamondFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden sword burns for in the diamond furnace", ConfigPreInit.diamondFSwordWoodBurnTime).getInt();
            ConfigPreInit.diamondFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the wooden hoe burns for in the diamond furnace", ConfigPreInit.diamondFHoeWoodBurnTime).getInt();
            ConfigPreInit.diamondFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the stick burns for in the diamond furnace", ConfigPreInit.diamondFStickBurnTime).getInt();
            ConfigPreInit.diamondFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the coal burns for in the diamond furnace", ConfigPreInit.diamondFCoalBurnTime).getInt();
            ConfigPreInit.diamondFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the lave bucket burns for in the diamond furnace", ConfigPreInit.diamondFLavaBucketBurnTime).getInt();
            ConfigPreInit.diamondFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the sapling burns for in the diamond furnace", ConfigPreInit.diamondFSaplingBurnTime).getInt();
            ConfigPreInit.diamondFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "How long the blaze rod burns for in the diamond furnace", ConfigPreInit.diamondFBlazeRodBurnTime).getInt();

            ConfigPreInit.emeraldFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden slab burns for in the emerald furnace", ConfigPreInit.obsidianFWoodenSlabBurnTime).getInt();
            ConfigPreInit.emeraldFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long wood material burns for in the emerald furnace", ConfigPreInit.emeraldFWoodMaterialBurnTime).getInt();
            ConfigPreInit.emeraldFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the coal block burns for in the emerald furnace", ConfigPreInit.emeraldFCoalBlockBurnTime).getInt();
            ConfigPreInit.emeraldFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden tool burns for in the emerald furnace", ConfigPreInit.emeraldFToolWoodBurnTime).getInt();
            ConfigPreInit.emeraldFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden sword burns for in the emerald furnace", ConfigPreInit.emeraldFSwordWoodBurnTime).getInt();
            ConfigPreInit.emeraldFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the wooden hoe burns for in the emerald furnace", ConfigPreInit.emeraldFHoeWoodBurnTime).getInt();
            ConfigPreInit.emeraldFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the stick burns for in the emerald furnace", ConfigPreInit.emeraldFStickBurnTime).getInt();
            ConfigPreInit.emeraldFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the coal burns for in the emerald furnace", ConfigPreInit.emeraldFCoalBurnTime).getInt();
            ConfigPreInit.emeraldFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the lave bucket burns for in the emerald furnace", ConfigPreInit.emeraldFLavaBucketBurnTime).getInt();
            ConfigPreInit.emeraldFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the sapling burns for in the emerald furnace", ConfigPreInit.emeraldFSaplingBurnTime).getInt();
            ConfigPreInit.emeraldFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "How long the blaze rod burns for in the emerald furnace", ConfigPreInit.emeraldFBlazeRodBurnTime).getInt();

            ConfigPreInit.obsidianFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the wooden slab burns for in the obsidian furnace", ConfigPreInit.obsidianFWoodenSlabBurnTime).getInt();
            ConfigPreInit.obsidianFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long wood material burns for in the obsidian furnace", ConfigPreInit.obsidianFWoodMaterialBurnTime).getInt();
            ConfigPreInit.obsidianFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the coal block burns for in the obsidian furnace", ConfigPreInit.obsidianFCoalBlockBurnTime).getInt();
            ConfigPreInit.obsidianFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the wooden tool burns for in the obsidian furnace", ConfigPreInit.obsidianFToolWoodBurnTime).getInt();
            ConfigPreInit.obsidianFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the wooden sword burns for in the obsidian furnace", ConfigPreInit.obsidianFSwordWoodBurnTime).getInt();
            ConfigPreInit.obsidianFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the wooden hoe burns for in the obsidian furnace", ConfigPreInit.obsidianFHoeWoodBurnTime).getInt();
            ConfigPreInit.obsidianFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the stick burns for in the obsidian furnace", ConfigPreInit.obsidianFStickBurnTime).getInt();
            ConfigPreInit.obsidianFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the coal burns for in the obsidian furnace", ConfigPreInit.obsidianFCoalBurnTime).getInt();
            ConfigPreInit.obsidianFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the lave bucket burns for in the obsidian furnace", ConfigPreInit.obsidianFLavaBucketBurnTime).getInt();
            ConfigPreInit.obsidianFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the sapling burns for in the obsidian furnace", ConfigPreInit.obsidianFSaplingBurnTime).getInt();
            ConfigPreInit.obsidianFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "How long the blaze rod burns for in the obsidian furnace", ConfigPreInit.obsidianFBlazeRodBurnTime).getInt();

            ConfigPreInit.ultimateFWoodenSlabBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the wooden slab burns for in the ultimate furnace", ConfigPreInit.ultimateFWoodenSlabBurnTime).getInt();
            ConfigPreInit.ultimateFWoodMaterialBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long wood material burns for in the ultimate furnace", ConfigPreInit.ultimateFWoodMaterialBurnTime).getInt();
            ConfigPreInit.ultimateFCoalBlockBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the coal block burns for in the ultimate furnace", ConfigPreInit.ultimateFCoalBlockBurnTime).getInt();
            ConfigPreInit.ultimateFToolWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the wooden tool burns for in the ultimate furnace", ConfigPreInit.ultimateFToolWoodBurnTime).getInt();
            ConfigPreInit.ultimateFSwordWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the wooden sword burns for in the ultimate furnace", ConfigPreInit.ultimateFSwordWoodBurnTime).getInt();
            ConfigPreInit.ultimateFHoeWoodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the wooden hoe burns for in the ultimate furnace", ConfigPreInit.ultimateFHoeWoodBurnTime).getInt();
            ConfigPreInit.ultimateFStickBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the stick burns for in the ultimate furnace", ConfigPreInit.ultimateFStickBurnTime).getInt();
            ConfigPreInit.ultimateFCoalBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the coal burns for in the ultimate furnace", ConfigPreInit.ultimateFCoalBurnTime).getInt();
            ConfigPreInit.ultimateFLavaBucketBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the lave bucket burns for in the ultimate furnace", ConfigPreInit.ultimateFLavaBucketBurnTime).getInt();
            ConfigPreInit.ultimateFSaplingBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the sapling burns for in the ultimate furnace", ConfigPreInit.ultimateFSaplingBurnTime).getInt();
            ConfigPreInit.ultimateFBlazeRodBurnTime = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "How long the blaze rod burns for in the ultimate furnace", ConfigPreInit.ultimateFBlazeRodBurnTime).getInt();


            ConfigPreInit.ironFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.iron", "Lower the number to speed up the furnace cook time or higher the number to slow down cook time", ConfigPreInit.ironFurnaceCookSpeed).getInt();
            ConfigPreInit.goldFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.gold", "Lower the number to speed up the furnace cook time or higher the number to slow down cook time", ConfigPreInit.goldFurnaceCookSpeed).getInt();
            ConfigPreInit.diamondFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.diamond", "Lower the number to speed up furnace cook time or higher the number to slow down cook time", ConfigPreInit.diamondFurnaceCookSpeed).getInt();
            ConfigPreInit.emeraldFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.emerald", "Lower the number to speed up furnace cook time or higher the number to slow down cook time", ConfigPreInit.emeraldFurnaceCookSpeed).getInt();
            ConfigPreInit.obsidianFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.obsidian", "Lower the number to speed up the furnace cook time or higher the number to slow down cook time", ConfigPreInit.obsidianFurnaceCookSpeed).getInt();
            ConfigPreInit.ultimateFurnaceCookSpeed = PattysMoreStuff.Config.get("PattysMoreStuff.Furnaces.ultimate", "Lower the number to speed up the furnace cook time or higher the number to slow down cook time", ConfigPreInit.ultimateFurnaceCookSpeed).getInt();
        }

        if (PattysMoreStuff.Config.hasChanged()) {
            PattysMoreStuff.Config.save();
        }
        if(ConfigPreInit.disableTools) {
        ConfigPreInit.NETHERSTAR_TOOL = EnumHelper.addToolMaterial("NETHERSTAR_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "Harvest Level", 3).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "Max Uses", -0).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "EfficiencyOnProperty", 15.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.regular", "Enchantability", 50).getInt());

        ConfigPreInit.OBSIDIAN_TOOL = EnumHelper.addToolMaterial("OBSIDIAN_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "Harvest Level", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "Max Uses", 872).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "EfficiencyOnProperty", 6.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.regular", "Enchantability", 10).getInt());

        ConfigPreInit.ENDER_TOOL = EnumHelper.addToolMaterial("ENDER_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "Harvest Level", 3).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "Max Uses", 1250).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "EfficiencyOnProperty", 7.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.ender.regular", "Enchantability", 14).getInt());

        ConfigPreInit.EMERALD_TOOL = EnumHelper.addToolMaterial("EMERALD_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "Harvest Level", 3).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "Max Uses", 2256).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "EfficiencyOnProperty", 10.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.emerald.regular", "Enchantability", 25).getInt());

        ConfigPreInit.QUARTZ_TOOL = EnumHelper.addToolMaterial("QUARTZ_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "Harvest Level", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "Max Uses", 317).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "EfficiencyOnProperty", 5.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.quartz.regular", "Enchantability", 10).getInt());

        ConfigPreInit.BLAZE_TOOL = EnumHelper.addToolMaterial("BLAZE_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "Harvest Level", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "Max Uses", 972).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "EfficiencyOnProperty", 6.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.blaze.regular", "Enchantability", 12).getInt());

        ConfigPreInit.GLOWSTONE_TOOL = EnumHelper.addToolMaterial("GLOWSTONE_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "Harvest Level", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "Max Uses", 361).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "EfficiencyOnProperty", 5.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.regular", "Enchantability", 10).getInt());

        ConfigPreInit.REDSTONE_TOOL = EnumHelper.addToolMaterial("REDSTONE_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "Harvest Level", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "Max Uses", 472).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "EfficiencyOnProperty", 5.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.redstone.regular", "Enchantability", 14).getInt());

        ConfigPreInit.COAL_TOOL = EnumHelper.addToolMaterial("COAL_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "Harvest Level", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "Max Uses", 192).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.coal.regular", "Enchantability", 6).getInt());

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

        ConfigPreInit.SANDSTONE_TOOL = EnumHelper.addToolMaterial("SANDSTONE_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "Harvest Level", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "Max Uses", 131).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "DamageVsEntity", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.regular", "Enchantability", 5).getInt());

        ConfigPreInit.SOULSAND_TOOL = EnumHelper.addToolMaterial("SOULSAND_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "Harvest Level", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "Max Uses", 131).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "EfficiencyOnProperty", 4.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.regular", "Enchantability", 5).getInt());


        ConfigPreInit.MAGMACREAM_TOOL = EnumHelper.addToolMaterial("MAGMACREAM_TOOL",
                PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "Harvest Level", 2).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "Max Uses", 536).getInt(),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "EfficiencyOnProperty", 7.0D).getDouble(0.0D),
                (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "DamageVsEntity", 1).getInt(),
                PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.regular", "Enchantability", 14).getInt());

        ConfigPreInit.NETHERSTAR_PAXEL = EnumHelper.addToolMaterial("NETHERSTAR_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "Max Uses", -0).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "EfficiencyOnProperty", 30.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "DamageVsEntity", 11).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.paxel", "Enchantability", 60).getInt());
        ConfigPreInit.OBSIDIAN_PAXEL = EnumHelper.addToolMaterial("OBSIDIAN_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "Max Uses", 2616).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.paxel", "Enchantability", 14).getInt());
        ConfigPreInit.ENDER_PAXEL = EnumHelper.addToolMaterial("ENDER_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "Max Uses", 3750).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.paxel", "Enchantability", 16).getInt());
        ConfigPreInit.EMERALD_PAXEL = EnumHelper.addToolMaterial("EMERALD_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "Max Uses", 6768).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "EfficiencyOnProperty", 22.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "DamageVsEntity", 8).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.paxel", "Enchantability", 40).getInt());
        ConfigPreInit.QUARTZ_PAXEL = EnumHelper.addToolMaterial("QUARTZ_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "Max Uses", 951).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.paxel", "Enchantability", 12).getInt());
        ConfigPreInit.BLAZE_PAXEL = EnumHelper.addToolMaterial("BLAZE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "Max Uses", 2916).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.paxel", "Enchantability", 15).getInt());
        ConfigPreInit.GLOWSTONE_PAXEL = EnumHelper.addToolMaterial("GLOWSTONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "Max Uses", 1083).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.paxel", "Enchantability", 12).getInt());
        ConfigPreInit.REDSTONE_PAXEL = EnumHelper.addToolMaterial("REDSTONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "Max Uses", 1416).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "EfficiencyOnProperty", 7.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.paxel", "Enchantability", 16).getInt());
        ConfigPreInit.COAL_PAXEL = EnumHelper.addToolMaterial("COAL_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "Max Uses", 576).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "EfficiencyOnProperty", 5.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.paxel", "Enchantability", 7).getInt());
        ConfigPreInit.BRICK_PAXEL = EnumHelper.addToolMaterial("BRICK_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "Max Uses", 393).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.paxel", "Enchantability", 5).getInt());
        ConfigPreInit.NBRICK_PAXEL = EnumHelper.addToolMaterial("NBRICK_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "Max Uses", 393).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.paxel", "Enchantability", 5).getInt());
        ConfigPreInit.RED_NBRICK_PAXEL = EnumHelper.addToolMaterial("RED_NBRICK_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "Max Uses", 393).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.paxel", "Enchantability", 5).getInt());
        ConfigPreInit.SANDSTONE_PAXEL = EnumHelper.addToolMaterial("SANDSTONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "Max Uses", 393).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.paxel", "Enchantability", 5).getInt());
        ConfigPreInit.SOUL_SAND_PAXEL = EnumHelper.addToolMaterial("SOUL_SAND_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "Max Uses", 393).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.paxel", "Enchantability", 5).getInt());
        ConfigPreInit.MAGMA_CREAM_PAXEL = EnumHelper.addToolMaterial("MAGMA_CREAM_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "Max Uses", 1608).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.paxel", "Enchantability", 14).getInt());
        ConfigPreInit.WOOD_PAXEL = EnumHelper.addToolMaterial("WOOD_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "Max Uses", 177).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.paxel", "Enchantability", 15).getInt());
        ConfigPreInit.STONE_PAXEL = EnumHelper.addToolMaterial("STONE_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "Max Uses", 393).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.paxel", "Enchantability", 5).getInt());
        ConfigPreInit.IRON_PAXEL = EnumHelper.addToolMaterial("IRON_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "Max Uses", 750).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.paxel", "Enchantability", 14).getInt());
        ConfigPreInit.GOLD_PAXEL = EnumHelper.addToolMaterial("GOLD_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "Max Uses", 96).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "DamageVsEntity", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.paxel", "Enchantability", 22).getInt());
        ConfigPreInit.DIAMOND_PAXEL = EnumHelper.addToolMaterial("DIAMOND_PAXEL", PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "Max Uses", 4683).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "DamageVsEntity", 6).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.paxel", "Enchantability", 10).getInt());

        ConfigPreInit.NETHERSTAR_BATTLEAXE = EnumHelper.addToolMaterial("NETHERSTAR_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "Max Uses", -0).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "EfficiencyOnProperty", 30.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "DamageVsEntity", 10).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.battleaxe", "Enchantability", 60).getInt());
        ConfigPreInit.OBSIDIAN_BATTLEAXE = EnumHelper.addToolMaterial("OBSIDIAN_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "Max Uses", 872).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.battleaxe", "Enchantability", 14).getInt());
        ConfigPreInit.ENDER_BATTLEAXE = EnumHelper.addToolMaterial("ENDER_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "Max Uses", 1250).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "EfficiencyOnProperty", 10.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.ender.battleaxe", "Enchantability", 16).getInt());
        ConfigPreInit.EMERALD_BATTLEAXE = EnumHelper.addToolMaterial("EMERALD_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "Max Uses", 2256).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "EfficiencyOnProperty", 22.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "DamageVsEntity", 7).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.emerald.battleaxe", "Enchantability", 40).getInt());
        ConfigPreInit.QUARTZ_BATTLEAXE = EnumHelper.addToolMaterial("QUARTZ_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "Max Uses", 317).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "DamageVsEntity", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.quartz.battleaxe", "Enchantability", 12).getInt());
        ConfigPreInit.BLAZE_BATTLEAXE = EnumHelper.addToolMaterial("BLAZE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "Max Uses", 972).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.blaze.battleaxe", "Enchantability", 15).getInt());
        ConfigPreInit.GLOWSTONE_BATTLEAXE = EnumHelper.addToolMaterial("GLOWSTONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "Max Uses", 361).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.battleaxe", "Enchantability", 12).getInt());
        ConfigPreInit.REDSTONE_BATTLEAXE = EnumHelper.addToolMaterial("REDSTONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "Max Uses", 472).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "EfficiencyOnProperty", 7.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.redstone.battleaxe", "Enchantability", 16).getInt());
        ConfigPreInit.COAL_BATTLEAXE = EnumHelper.addToolMaterial("COAL_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "Max Uses", 192).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "EfficiencyOnProperty", 5.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "DamageVsEntity", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.coal.battleaxe", "Enchantability", 7).getInt());
        ConfigPreInit.BRICK_BATTLEAXE = EnumHelper.addToolMaterial("BRICK_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "Max Uses", 131).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.brick.battleaxe", "Enchantability", 5).getInt());
        ConfigPreInit.NBRICK_BATTLEAXE = EnumHelper.addToolMaterial("NBRICK_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "Max Uses", 131).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.battleaxe", "Enchantability", 5).getInt());
        ConfigPreInit.RED_NBRICK_BATTLEAXE = EnumHelper.addToolMaterial("RED_NBRICK_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "Max Uses", 131).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.battleaxe", "Enchantability", 5).getInt());
        ConfigPreInit.SANDSTONE_BATTLEAXE = EnumHelper.addToolMaterial("SANDSTONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "Max Uses", 131).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.battleaxe", "Enchantability", 5).getInt());
        ConfigPreInit.SOUL_SAND_BATTLEAXE = EnumHelper.addToolMaterial("SOUL_SAND_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "Max Uses", 131).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.battleaxe", "Enchantability", 5).getInt());
        ConfigPreInit.MAGMA_CREAM_BATTLEAXE = EnumHelper.addToolMaterial("MAGMA_CREAM_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "Max Uses", 536).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.battleaxe", "Enchantability", 14).getInt());
        ConfigPreInit.WOOD_BATTLEAXE = EnumHelper.addToolMaterial("WOOD_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "Max Uses", 59).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "EfficiencyOnProperty", 2.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "DamageVsEntity", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.wood.battleaxe", "Enchantability", 15).getInt());
        ConfigPreInit.STONE_BATTLEAXE = EnumHelper.addToolMaterial("STONE_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "Harvest Level", 1).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "Max Uses", 131).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "EfficiencyOnProperty", 4.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "DamageVsEntity", 4).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.stone.battleaxe", "Enchantability", 5).getInt());
        ConfigPreInit.IRON_BATTLEAXE = EnumHelper.addToolMaterial("IRON_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "Harvest Level", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "Max Uses", 250).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "EfficiencyOnProperty", 6.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.iron.battleaxe", "Enchantability", 14).getInt());
        ConfigPreInit.GOLD_BATTLEAXE = EnumHelper.addToolMaterial("GOLD_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "Harvest Level", 0).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "Max Uses", 32).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "EfficiencyOnProperty", 12.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "DamageVsEntity", 2).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.gold.battleaxe", "Enchantability", 22).getInt());
        ConfigPreInit.DIAMOND_BATTLEAXE = EnumHelper.addToolMaterial("DIAMOND_BATTLEAXE", PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "Harvest Level", 3).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "Max Uses", 1561).getInt(), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "EfficiencyOnProperty", 8.0D).getDouble(0.0D), (float) PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "DamageVsEntity", 5).getInt(), PattysMoreStuff.Config.get("PattysMoreStuff.diamond.battleaxe", "Enchantability", 10).getInt());

            ConfigPreInit.NETHERSTAR_SWORD = EnumHelper.addToolMaterial("NETHERSTAR_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.sword", "Max Uses", -0).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.sword", "DamageVsEntity", 8).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.sword", "Enchantability", 50).getInt());

            ConfigPreInit.OBSIDIAN_SWORD = EnumHelper.addToolMaterial("OBSIDIAN_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.sword", "Max Uses", 872).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.sword", "Enchantability", 10).getInt());

            ConfigPreInit.ENDER_SWORD = EnumHelper.addToolMaterial("ENDER_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.sword", "Max Uses", 1250).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.sword", "DamageVsEntity", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.ender.sword", "Enchantability", 14).getInt());

            ConfigPreInit.EMERALD_SWORD = EnumHelper.addToolMaterial("EMERALD_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.sword", "Max Uses", 2256).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.sword", "DamageVsEntity", 5).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.emerald.sword", "Enchantability", 25).getInt());

            ConfigPreInit.QUARTZ_SWORD = EnumHelper.addToolMaterial("QUARTZ_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.sword", "Max Uses", 317).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.sword", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.quartz.sword", "Enchantability", 10).getInt());

            ConfigPreInit.BLAZE_SWORD = EnumHelper.addToolMaterial("BLAZE_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.sword", "Max Uses", 972).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.sword", "DamageVsEntity", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.blaze.sword", "Enchantability", 12).getInt());

            ConfigPreInit.GLOWSTONE_SWORD = EnumHelper.addToolMaterial("GLOWSTONE_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.sword", "Max Uses", 361).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.sword", "Enchantability", 10).getInt());

            ConfigPreInit.REDSTONE_SWORD = EnumHelper.addToolMaterial("REDSTONE_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.sword", "Max Uses", 472).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.sword", "DamageVsEntity", 3).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.redstone.sword", "Enchantability", 14).getInt());

            ConfigPreInit.COAL_SWORD = EnumHelper.addToolMaterial("COAL_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.sword", "Max Uses", 192).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.sword", "DamageVsEntity", 1).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.coal.sword", "Enchantability", 6).getInt());

            ConfigPreInit.BRICK_SWORD = EnumHelper.addToolMaterial("BRICK_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.sword", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.brick.sword", "Enchantability", 5).getInt());

            ConfigPreInit.NETHERBRICK_SWORD = EnumHelper.addToolMaterial("NETHERBRICK_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.sword", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.sword", "Enchantability", 5).getInt());

            ConfigPreInit.RED_NETHERBRICK_SWORD = EnumHelper.addToolMaterial("RED_NETHERBRICK_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.sword", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.sword", "Enchantability", 5).getInt());

            ConfigPreInit.SANDSTONE_SWORD = EnumHelper.addToolMaterial("SANDSTONE_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.sword", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.sword", "Enchantability", 5).getInt());

            ConfigPreInit.SOULSAND_SWORD = EnumHelper.addToolMaterial("SOULSAND_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.sword", "Max Uses", 131).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.sword", "Enchantability", 5).getInt());

            ConfigPreInit.MAGMACREAM_SWORD = EnumHelper.addToolMaterial("MAGMACREAM_SWORD",
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.sword", "Harvest Level", 0).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.sword", "Max Uses", 536).getInt(),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.sword", "EfficiencyOnProperty", 0.0D).getDouble(0.0D),
                    (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.sword", "DamageVsEntity", 2).getInt(),
                    PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.sword", "Enchantability", 14).getInt());


            ConfigPreInit.NETHERSTAR_BOW = PattysMoreStuff.Config.getInt("Nether Star Bow Max Uses", "PattysMoreStuff.nether_star.bow", ConfigPreInit.NETHERSTAR_BOW, -0, 999999999, "Nether Star Bow Max Uses");
        ConfigPreInit.OBSIDIAN_BOW = PattysMoreStuff.Config.getInt("Obsidian Bow Max Uses", "PattysMoreStuff.obsidian.bow", ConfigPreInit.OBSIDIAN_BOW, 1, 999999999, "Obsidian Bow Max Uses");
        ConfigPreInit.EMERALD_BOW = PattysMoreStuff.Config.getInt("Emerald Bow Max Uses", "PattysMoreStuff.emerald.bow", ConfigPreInit.EMERALD_BOW, 1, 999999999, "Emerald Bow Max Uses");
        ConfigPreInit.ENDER_BOW = PattysMoreStuff.Config.getInt("Ender Bow Max Uses", "PattysMoreStuff.ender.bow", ConfigPreInit.ENDER_BOW, 1, 999999999, "Ender Bow Max Uses");
        ConfigPreInit.QUARTZ_BOW = PattysMoreStuff.Config.getInt("Quartz Bow Max Uses", "PattysMoreStuff.quartz.bow", ConfigPreInit.QUARTZ_BOW, 1, 999999999, "Quartz Bow Max Uses");
        ConfigPreInit.BLAZE_BOW = PattysMoreStuff.Config.getInt("Blaze Bow Max Uses", "PattysMoreStuff.blaze.bow", ConfigPreInit.BLAZE_BOW, 1, 999999999, "Blaze Bow Max Uses");
        ConfigPreInit.COAL_BOW = PattysMoreStuff.Config.getInt("Coal Bow Max Uses", "PattysMoreStuff.coal.bow", ConfigPreInit.COAL_BOW, 1, 999999999, "Coal Bow Max Uses");
        ConfigPreInit.GLOWSTONE_BOW = PattysMoreStuff.Config.getInt("Glowstone Bow Max Uses", "PattysMoreStuff.glowstone.bow", ConfigPreInit.GLOWSTONE_BOW, 1, 999999999, "Glowstone Bow Max Uses");
        ConfigPreInit.REDSTONE_BOW = PattysMoreStuff.Config.getInt("Redstone Bow Max Uses", "PattysMoreStuff.redstone.bow", ConfigPreInit.REDSTONE_BOW, 1, 999999999, "Redstone Bow Max Uses");
        ConfigPreInit.BRICK_BOW = PattysMoreStuff.Config.getInt("Brick Bow Max Uses", "PattysMoreStuff.brick.bow", ConfigPreInit.BRICK_BOW, 1, 999999999, "Brick Bow Max Uses");
        ConfigPreInit.NETHERBRICK_BOW = PattysMoreStuff.Config.getInt("Nether Brick Bow Max Uses", "PattysMoreStuff.nether_brick.bow", ConfigPreInit.NETHERBRICK_BOW, 1, 999999999, "Nether Brick Bow Max Uses");
        ConfigPreInit.RED_NETHERBRICK_BOW = PattysMoreStuff.Config.getInt("Red Nether Brick Bow Max Uses", "PattysMoreStuff.red_nether_brick.bow", ConfigPreInit.RED_NETHERBRICK_BOW, 1, 999999999, "Red Nether Brick Bow Max Uses");
        ConfigPreInit.MAGMACREAM_BOW = PattysMoreStuff.Config.getInt("Magma Cream Bow Max Uses", "PattysMoreStuff.magma_cream.bow", ConfigPreInit.MAGMACREAM_BOW, 1, 999999999, "Magma Cream Bow Max Uses");
        ConfigPreInit.SANDSTONE_BOW = PattysMoreStuff.Config.getInt("Sandstone Bow Max Uses", "PattysMoreStuff.sandstone.bow", ConfigPreInit.SANDSTONE_BOW, 1, 999999999, "Sandstone Bow Max Uses");
        ConfigPreInit.SOULSAND_BOW = PattysMoreStuff.Config.getInt("Soul Sand Bow Max Uses", "PattysMoreStuff.soul_sand.bow", ConfigPreInit.SOULSAND_BOW, 1, 999999999, "Soul Sand Bow Max Uses");

            ConfigPreInit.STONE_BOW = PattysMoreStuff.Config.getInt("Stone Bow Max Uses", "PattysMoreStuff.stone.bow", ConfigPreInit.STONE_BOW, 1, 999999999, "Stone Bow Max Uses");
            ConfigPreInit.IRON_BOW = PattysMoreStuff.Config.getInt("Iron Bow Max Uses", "PattysMoreStuff.iron.bow", ConfigPreInit.IRON_BOW, 1, 999999999, "Iron Bow Max Uses");
            ConfigPreInit.GOLD_BOW = PattysMoreStuff.Config.getInt("Gold Bow Max Uses", "PattysMoreStuff.gold.bow", ConfigPreInit.GOLD_BOW, 1, 999999999, "Gold Bow Max Uses");
            ConfigPreInit.DIAMOND_BOW = PattysMoreStuff.Config.getInt("Diamond Bow Max Uses", "PattysMoreStuff.diamond.bow", ConfigPreInit.DIAMOND_BOW, 1, 999999999, "Diamond Bow Max Uses");
        }
            if (PattysMoreStuff.Config.hasChanged()) {
                PattysMoreStuff.Config.save();
        }
            if(ConfigPreInit.disableArmor) {

                ConfigPreInit.DIVING_ARMOR = EnumHelper.addArmorMaterial("DIVING_ARMOR", "PattysMoreStuff:diving_goggles",
                        PattysMoreStuff.Config.get("PattysMoreStuff.diving_goggles.armor", "Durability", -60).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.diving_goggles.armor", "Head", 0).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.diving_goggles.armor", "Chest", 0).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.diving_goggles.armor", "Legs", 0).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.diving_goggles.armor", "Feet", 0).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.diving_goggles.armor", "Enchantability", 0).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.air_tank.armor", "Toughness", 0D).getDouble(0.0D));

                ConfigPreInit.NETHER_STAR_ARMOR = EnumHelper.addArmorMaterial("NETHER_STAR_ARMOR", "PattysMoreStuff:nether_star",
                        PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Durability", -60).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Head", 6).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Chest", 9).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Legs", 11).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Feet", 7).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Enchantability", 10).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_star.armor", "Toughness", 6.5D).getDouble(0.0D));

                ConfigPreInit.EMERALD_ARMOR = EnumHelper.addArmorMaterial("EMERALD_ARMOR", "PattysMoreStuff:emerald",
                        PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Durability", 38).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Head", 4).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Chest", 7).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Legs", 9).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Feet", 4).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Enchantability", 10).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.emerald.armor", "Toughness", 4.0D).getDouble(0.0D));

                ConfigPreInit.OBSIDIAN_ARMOR = EnumHelper.addArmorMaterial("OBSIDIAN_ARMOR", "PattysMoreStuff:obsidian",
                        PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Durability", 11).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Head", 2).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Legs", 2).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Enchantability", 10).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.obsidian.armor", "Toughness", 1.0D).getDouble(0.0D));

                ConfigPreInit.ENDER_ARMOR = EnumHelper.addArmorMaterial("ENDER_ARMOR", "PattysMoreStuff:ender",
                        PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Durability", 12).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Chest", 5).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Legs", 6).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Enchantability", 9).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.ender.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.MAGMA_CREAM_ARMOR = EnumHelper.addArmorMaterial("MAGMA_CREAM_ARMOR", "PattysMoreStuff:magma_cream",
                        PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Durability", 12).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Chest", 5).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Legs", 6).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Enchantability", 9).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.magma_cream.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.BLAZE_ARMOR = EnumHelper.addArmorMaterial("BLAZE_ARMOR", "PattysMoreStuff:blaze",
                        PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Durability", 11).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Chest", 4).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Legs", 5).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Enchantability", 9).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.blaze.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.QUARTZ_ARMOR = EnumHelper.addArmorMaterial("QUARTZ_ARMOR", "PattysMoreStuff:quartz",
                        PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Durability", 11).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Chest", 4).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Legs", 5).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Enchantability", 9).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.quartz.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.GLOWSTONE_ARMOR = EnumHelper.addArmorMaterial("GLOWSTONE_ARMOR", "PattysMoreStuff:glowstone",
                        PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Durability", 11).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Chest", 4).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Legs", 5).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Enchantability", 9).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.glowstone.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.REDSTONE_ARMOR = EnumHelper.addArmorMaterial("REDSTONE_ARMOR", "PattysMoreStuff:redstone",
                        PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Durability", 11).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Chest", 4).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Legs", 5).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Enchantability", 9).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.redstone.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.COAL_ARMOR = EnumHelper.addArmorMaterial("COAL_ARMOR", "PattysMoreStuff:coal",
                        PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Durability", 10).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Legs", 4).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Feet", 2).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Enchantability", 12).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.coal.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.BRICK_ARMOR = EnumHelper.addArmorMaterial("BRICK_ARMOR", "PattysMoreStuff:brick",
                        PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Durability", 8).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Legs", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Feet", 1).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Enchantability", 12).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.brick.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.NETHER_BRICK_ARMOR = EnumHelper.addArmorMaterial("NETHER_BRICK_ARMOR", "PattysMoreStuff:nether_brick",
                        PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Durability", 8).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Legs", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Feet", 1).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Enchantability", 12).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.nether_brick.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.RED_NETHER_BRICK_ARMOR = EnumHelper.addArmorMaterial("RED_NETHER_BRICK_ARMOR", "PattysMoreStuff:red_nether_brick",
                        PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Durability", 8).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Legs", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Feet", 1).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Enchantability", 12).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.red_nether_brick.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.SANDSTONE_ARMOR = EnumHelper.addArmorMaterial("SANDSTONE_ARMOR", "PattysMoreStuff:sandstone",
                        PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Durability", 8).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Legs", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Feet", 1).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Enchantability", 12).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.sandstone.armor", "Toughness", 0.0D).getDouble(0.0D));

                ConfigPreInit.SOUL_SAND_ARMOR = EnumHelper.addArmorMaterial("SOUL_SAND_ARMOR", "PattysMoreStuff:soul_sand",
                        PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Durability", 8).getInt(),
                        new int[]{PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Head", 1).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Chest", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Legs", 3).getInt(),
                                PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Feet", 1).getInt()},
                        PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Enchantability", 12).getInt(),
                        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                        (float) PattysMoreStuff.Config.get("PattysMoreStuff.soul_sand.armor", "Toughness", 0.0D).getDouble(0.0D));

            }
            if (PattysMoreStuff.Config.hasChanged()) {
                PattysMoreStuff.Config.save();
        }
    }
}
