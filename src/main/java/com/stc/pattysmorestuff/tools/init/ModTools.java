package com.stc.pattysmorestuff.tools.init;

import com.stc.pattysmorestuff.ConfigPreInit;
import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.random.items.ItemInfWaterBucket;
import com.stc.pattysmorestuff.tools.items.ItemObsidianIngot;
import com.stc.pattysmorestuff.tools.items.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by peeweebirch70 on 14/11/2016.
 */
public class ModTools {

    public static Item emerald_pickaxe;
    public static Item emerald_axe;
    public static Item emerald_shovel;
    public static Item emerald_sword;
    public static Item emerald_hoe;
    public static Item emerald_paxel;
    public static Item emerald_battle_axe;

    public static Item obsidian_pickaxe;
    public static Item obsidian_axe;
    public static Item obsidian_shovel;
    public static Item obsidian_sword;
    public static Item obsidian_hoe;
    public static Item obsidian_paxel;
    public static Item obsidian_battle_axe;

    public static Item ender_pickaxe;
    public static Item ender_axe;
    public static Item ender_shovel;
    public static Item ender_hoe;
    public static Item ender_sword;
    public static Item ender_paxel;
    public static Item ender_battle_axe;

    public static Item slime_pickaxe;
    public static Item slime_axe;
    public static Item slime_shovel;
    public static Item slime_hoe;
    public static Item slime_sword;
    public static Item slime_paxel;
    public static Item slime_battle_axe;

    public static Item coal_pickaxe;
    public static Item coal_axe;
    public static Item coal_shovel;
    public static Item coal_hoe;
    public static Item coal_sword;
    public static Item coal_paxel;
    public static Item coal_battle_axe;

    public static Item quartz_pickaxe;
    public static Item quartz_axe;
    public static Item quartz_shovel;
    public static Item quartz_sword;
    public static Item quartz_hoe;
    public static Item quartz_paxel;
    public static Item quartz_battle_axe;

    public static Item flint_pickaxe;
    public static Item flint_axe;
    public static Item flint_shovel;
    public static Item flint_hoe;
    public static Item flint_sword;
    public static Item flint_paxel;
    public static Item flint_battle_axe;

    public static Item gunpowder_pickaxe;
    public static Item gunpowder_axe;
    public static Item gunpowder_shovel;
    public static Item gunpowder_hoe;
    public static Item gunpowder_sword;
    public static Item gunpowder_paxel;
    public static Item gunpowder_battle_axe;

    public static Item glowstone_pickaxe;
    public static Item glowstone_axe;
    public static Item glowstone_shovel;
    public static Item glowstone_sword;
    public static Item glowstone_hoe;
    public static Item glowstone_paxel;
    public static Item glowstone_battle_axe;

    public static Item brick_pickaxe;
    public static Item brick_axe;
    public static Item brick_shovel;
    public static Item brick_hoe;
    public static Item brick_sword;
    public static Item brick_paxel;
    public static Item brick_battle_axe;

    public static Item nbrick_pickaxe;
    public static Item nbrick_axe;
    public static Item nbrick_shovel;
    public static Item nbrick_hoe;
    public static Item nbrick_sword;
    public static Item nbrick_paxel;
    public static Item netherbrick_battle_axe;

    public static Item leather_pickaxe;
    public static Item leather_axe;
    public static Item leather_shovel;
    public static Item leather_hoe;
    public static Item leather_sword;
    public static Item leather_paxel;
    public static Item leather_battle_axe;

    public static Item redstone_pickaxe;
    public static Item redstone_axe;
    public static Item redstone_shovel;
    public static Item redstone_hoe;
    public static Item redstone_sword;
    public static Item redstone_paxel;
    public static Item redstone_battle_axe;

    public static Item blaze_pickaxe;
    public static Item blaze_axe;
    public static Item blaze_shovel;
    public static Item blaze_hoe;
    public static Item blaze_sword;
    public static Item blaze_paxel;
    public static Item blaze_battle_axe;

    public static Item nstar_pickaxe;
    public static Item nstar_axe;
    public static Item nstar_shovel;
    public static Item nstar_hoe;
    public static Item nstar_sword;
    public static Item nstar_paxel;
    public static Item netherstar_battle_axe;

    public static Item snow_pickaxe;
    public static Item snow_axe;
    public static Item snow_shovel;
    public static Item snow_hoe;
    public static Item snow_sword;
    public static Item snow_paxel;
    public static Item snow_battle_axe;

    public static Item sandstone_pickaxe;
    public static Item sandstone_axe;
    public static Item sandstone_shovel;
    public static Item sandstone_hoe;
    public static Item sandstone_sword;
    public static Item sandstone_paxel;
    public static Item sandstone_battle_axe;

    public static Item soul_sand_pickaxe;
    public static Item soul_sand_axe;
    public static Item soul_sand_shovel;
    public static Item soul_sand_hoe;
    public static Item soul_sand_sword;
    public static Item soul_sand_paxel;
    public static Item soulsand_battle_axe;

    public static Item clay_pickaxe;
    public static Item clay_axe;
    public static Item clay_shovel;
    public static Item clay_hoe;
    public static Item clay_sword;
    public static Item clay_paxel;
    public static Item clay_battle_axe;

    public static Item magma_cream_sword;
    public static Item magma_cream_pickaxe;
    public static Item magma_cream_axe;
    public static Item magma_cream_shovel;
    public static Item magma_cream_hoe;
    public static Item magma_cream_paxel;
    public static Item magmacream_battle_axe;

    public static Item netherbrickred_sword;
    public static Item netherbrickred_pickaxe;
    public static Item netherbrickred_axe;
    public static Item netherbrickred_shovel;
    public static Item netherbrickred_hoe;
    public static Item netherbrickred_paxel;
    public static Item netherbrickred_battle_axe;

    public static Item wooden_paxel;
    public static Item wooden_battle_axe;
    public static Item stone_paxel;
    public static Item stone_battle_axe;
    public static Item iron_paxel;
    public static Item iron_battle_axe;
    public static Item gold_paxel;
    public static Item gold_battle_axe;
    public static Item diamond_paxel;
    public static Item diamond_battle_axe;

    public static void init() {

        emerald_pickaxe = new ItemPick("emerald_pickaxe", ConfigPreInit.EMERALD_TOOL);
        emerald_axe = new ItemAx("emerald_axe", ConfigPreInit.EMERALD_TOOL);
        emerald_shovel = new ItemShovel("emerald_shovel", ConfigPreInit.EMERALD_TOOL);
        emerald_sword = new ItemCustomSword("emerald_sword", ConfigPreInit.EMERALD_TOOL);
        emerald_hoe = new ItemCustomHoe("emerald_hoe", ConfigPreInit.EMERALD_TOOL);
        emerald_paxel = new ItemPaxel("emerald_paxel", ConfigPreInit.EMERALD_PAXEL);
        emerald_battle_axe = new ItemBattleaxe("emerald_battle_axe", ConfigPreInit.EMERALD_BATTLEAXE);

        obsidian_pickaxe = new ItemPick("obsidian_pickaxe", ConfigPreInit.OBSIDIAN_TOOL);
        obsidian_axe = new ItemAx("obsidian_axe", ConfigPreInit.OBSIDIAN_TOOL);
        obsidian_shovel = new ItemShovel("obsidian_shovel", ConfigPreInit.OBSIDIAN_TOOL);
        obsidian_sword = new ItemCustomSword("obsidian_sword", ConfigPreInit.OBSIDIAN_TOOL);
        obsidian_hoe = new ItemCustomHoe("obsidian_hoe", ConfigPreInit.OBSIDIAN_TOOL);
        obsidian_paxel = new ItemPaxel("obsidian_paxel", ConfigPreInit.OBSIDIAN_PAXEL);
        obsidian_battle_axe = new ItemBattleaxe("obsidian_battle_axe", ConfigPreInit.OBSIDIAN_BATTLEAXE);

        ender_pickaxe = new ItemPick("ender_pickaxe", ConfigPreInit.ENDER_TOOL);
        ender_axe = new ItemAx("ender_axe", ConfigPreInit.ENDER_TOOL);
        ender_shovel = new ItemShovel("ender_shovel", ConfigPreInit.ENDER_TOOL);
        ender_hoe = new ItemCustomHoe("ender_hoe", ConfigPreInit.ENDER_TOOL);
        ender_sword = new ItemCustomSword("ender_sword", ConfigPreInit.ENDER_TOOL);
        ender_paxel = new ItemPaxel("ender_paxel", ConfigPreInit.ENDER_PAXEL);
        ender_battle_axe = new ItemBattleaxe("ender_battle_axe", ConfigPreInit.ENDER_BATTLEAXE);

        slime_pickaxe = new ItemPick("slime_pickaxe", ConfigPreInit.SLIME_TOOL);
        slime_axe = new ItemAx("slime_axe", ConfigPreInit.SLIME_TOOL);
        slime_shovel = new ItemShovel("slime_shovel", ConfigPreInit.SLIME_TOOL);
        slime_hoe = new ItemCustomHoe("slime_hoe", ConfigPreInit.SLIME_TOOL);
        slime_sword = new ItemCustomSword("slime_sword", ConfigPreInit.SLIME_TOOL);
        slime_paxel = new ItemPaxel("slime_paxel", ConfigPreInit.SLIME_PAXEL);
        slime_battle_axe = new ItemBattleaxe("slime_battle_axe", ConfigPreInit.SLIME_BATTLEAXE);

        coal_pickaxe = new ItemPick("coal_pickaxe", ConfigPreInit.COAL_TOOL);
        coal_axe = new ItemAx("coal_axe", ConfigPreInit.COAL_TOOL);
        coal_shovel = new ItemShovel("coal_shovel", ConfigPreInit.COAL_TOOL);
        coal_hoe = new ItemCustomHoe("coal_hoe", ConfigPreInit.COAL_TOOL);
        coal_sword = new ItemCustomSword("coal_sword", ConfigPreInit.COAL_TOOL);
        coal_paxel = new ItemPaxel("coal_paxel", ConfigPreInit.COAL_PAXEL);
        coal_battle_axe = new ItemBattleaxe("coal_battle_axe", ConfigPreInit.COAL_BATTLEAXE);

        quartz_pickaxe = new ItemPick("quartz_pickaxe", ConfigPreInit.QUARTZ_TOOL);
        quartz_axe = new ItemAx("quartz_axe", ConfigPreInit.QUARTZ_TOOL);
        quartz_shovel = new ItemShovel("quartz_shovel", ConfigPreInit.QUARTZ_TOOL);
        quartz_sword = new ItemCustomSword("quartz_sword", ConfigPreInit.QUARTZ_TOOL);
        quartz_hoe = new ItemCustomHoe("quartz_hoe", ConfigPreInit.QUARTZ_TOOL);
        quartz_paxel = new ItemPaxel("quartz_paxel", ConfigPreInit.QUARTZ_PAXEL);
        quartz_battle_axe = new ItemBattleaxe("quartz_battle_axe", ConfigPreInit.QUARTZ_BATTLEAXE);

        flint_pickaxe = new ItemPick("flint_pickaxe", ConfigPreInit.FLINT_TOOL);
        flint_axe = new ItemAx("flint_axe", ConfigPreInit.FLINT_TOOL);
        flint_shovel = new ItemShovel("flint_shovel", ConfigPreInit.FLINT_TOOL);
        flint_hoe = new ItemCustomHoe("flint_hoe", ConfigPreInit.FLINT_TOOL);
        flint_sword = new ItemCustomSword("flint_sword", ConfigPreInit.FLINT_TOOL);
        flint_paxel = new ItemPaxel("flint_paxel", ConfigPreInit.FLINT_PAXEL);
        flint_battle_axe = new ItemBattleaxe("flint_battle_axe", ConfigPreInit.FLINT_BATTLEAXE);

        gunpowder_pickaxe = new ItemPick("gunpowder_pickaxe", ConfigPreInit.GUNPOWDER_TOOL);
        gunpowder_axe = new ItemAx("gunpowder_axe", ConfigPreInit.GUNPOWDER_TOOL);
        gunpowder_shovel = new ItemShovel("gunpowder_shovel", ConfigPreInit.GUNPOWDER_TOOL);
        gunpowder_hoe = new ItemCustomHoe("gunpowder_hoe", ConfigPreInit.GUNPOWDER_TOOL);
        gunpowder_sword = new ItemCustomSword("gunpowder_sword", ConfigPreInit.GUNPOWDER_TOOL);
        gunpowder_paxel = new ItemPaxel("gunpowder_paxel", ConfigPreInit.GUNPOWDER_PAXEL);
        gunpowder_battle_axe = new ItemBattleaxe("gunpowder_battle_axe", ConfigPreInit.GUNPOWDER_BATTLEAXE);

        glowstone_pickaxe = new ItemPick("glowstone_pickaxe", ConfigPreInit.GLOWSTONE_TOOL);
        glowstone_axe = new ItemAx("glowstone_axe", ConfigPreInit.GLOWSTONE_TOOL);
        glowstone_shovel = new ItemShovel("glowstone_shovel", ConfigPreInit.GLOWSTONE_TOOL);
        glowstone_sword = new ItemCustomSword("glowstone_sword", ConfigPreInit.GLOWSTONE_TOOL);
        glowstone_hoe = new ItemCustomHoe("glowstone_hoe", ConfigPreInit.GLOWSTONE_TOOL);
        glowstone_paxel = new ItemPaxel("glowstone_paxel", ConfigPreInit.GLOWSTONE_PAXEL);
        glowstone_battle_axe = new ItemBattleaxe("glowstone_battle_axe", ConfigPreInit.GLOWSTONE_BATTLEAXE);

        brick_pickaxe = new ItemPick("brick_pickaxe", ConfigPreInit.BRICK_TOOL);
        brick_axe = new ItemAx("brick_axe", ConfigPreInit.BRICK_TOOL);
        brick_shovel = new ItemShovel("brick_shovel", ConfigPreInit.BRICK_TOOL);
        brick_hoe = new ItemCustomHoe("brick_hoe", ConfigPreInit.BRICK_TOOL);
        brick_sword = new ItemCustomSword("brick_sword", ConfigPreInit.BRICK_TOOL);
        brick_paxel = new ItemPaxel("brick_paxel", ConfigPreInit.BRICK_PAXEL);
        brick_battle_axe = new ItemBattleaxe("brick_battle_axe", ConfigPreInit.BRICK_BATTLEAXE);

        nbrick_pickaxe = new ItemPick("nbrick_pickaxe", ConfigPreInit.NETHERBRICK_TOOL);
        nbrick_axe = new ItemAx("nbrick_axe", ConfigPreInit.NETHERBRICK_TOOL);
        nbrick_shovel = new ItemShovel("nbrick_shovel", ConfigPreInit.NETHERBRICK_TOOL);
        nbrick_hoe = new ItemCustomHoe("nbrick_hoe", ConfigPreInit.NETHERBRICK_TOOL);
        nbrick_sword = new ItemCustomSword("nbrick_sword", ConfigPreInit.NETHERBRICK_TOOL);
        nbrick_paxel = new ItemPaxel("nbrick_paxel", ConfigPreInit.NBRICK_PAXEL);
        netherbrick_battle_axe = new ItemBattleaxe("netherbrick_battle_axe", ConfigPreInit.NBRICK_BATTLEAXE);

        leather_pickaxe = new ItemPick("leather_pickaxe", ConfigPreInit.LEATHER_TOOL);
        leather_axe = new ItemAx("leather_axe", ConfigPreInit.LEATHER_TOOL);
        leather_shovel = new ItemShovel("leather_shovel", ConfigPreInit.LEATHER_TOOL);
        leather_hoe = new ItemCustomHoe("leather_hoe", ConfigPreInit.LEATHER_TOOL);
        leather_sword = new ItemCustomSword("leather_sword", ConfigPreInit.LEATHER_TOOL);
        leather_paxel = new ItemPaxel("leather_paxel", ConfigPreInit.LEATHER_PAXEL);
        leather_battle_axe = new ItemBattleaxe("leather_battle_axe", ConfigPreInit.LEATHER_BATTLEAXE);

        redstone_pickaxe = new ItemPick("redstone_pickaxe", ConfigPreInit.REDSTONE_TOOL);
        redstone_axe = new ItemAx("redstone_axe", ConfigPreInit.REDSTONE_TOOL);
        redstone_shovel = new ItemShovel("redstone_shovel", ConfigPreInit.REDSTONE_TOOL);
        redstone_hoe = new ItemCustomHoe("redstone_hoe", ConfigPreInit.REDSTONE_TOOL);
        redstone_sword = new ItemCustomSword("redstone_sword", ConfigPreInit.REDSTONE_TOOL);
        redstone_paxel = new ItemPaxel("redstone_paxel", ConfigPreInit.REDSTONE_PAXEL);
        redstone_battle_axe = new ItemBattleaxe("redstone_battle_axe", ConfigPreInit.REDSTONE_BATTLEAXE);

        blaze_pickaxe = new ItemPick("blaze_pickaxe", ConfigPreInit.BLAZE_TOOL);
        blaze_axe = new ItemAx("blaze_axe", ConfigPreInit.BLAZE_TOOL);
        blaze_shovel = new ItemShovel("blaze_shovel", ConfigPreInit.BLAZE_TOOL);
        blaze_hoe = new ItemCustomHoe("blaze_hoe", ConfigPreInit.BLAZE_TOOL);
        blaze_sword = new ItemCustomSword("blaze_sword", ConfigPreInit.BLAZE_TOOL);
        blaze_paxel = new ItemPaxel("blaze_paxel", ConfigPreInit.BLAZE_PAXEL);
        blaze_battle_axe = new ItemBattleaxe("blaze_battle_axe", ConfigPreInit.BLAZE_BATTLEAXE);

        nstar_pickaxe = new ItemStarPick("nstar_pickaxe", ConfigPreInit.NETHERSTAR_TOOL);
        nstar_axe = new ItemStarAxe("nstar_axe", ConfigPreInit.NETHERSTAR_TOOL);
        nstar_shovel = new ItemStarShovel("nstar_shovel", ConfigPreInit.NETHERSTAR_TOOL);
        nstar_hoe = new ItemStarHoe("nstar_hoe", ConfigPreInit.NETHERSTAR_TOOL);
        nstar_sword = new ItemStarSword("nstar_sword", ConfigPreInit.NETHERSTAR_TOOL);
        nstar_paxel = new ItemStarPaxel("nstar_paxel", ConfigPreInit.NETHERSTAR_PAXEL);
        netherstar_battle_axe = new ItemStarBattleaxe("netherstar_battle_axe", ConfigPreInit.NETHERSTAR_BATTLEAXE);

        snow_pickaxe = new ItemPick("snow_pickaxe", ConfigPreInit.SNOW_TOOL);
        snow_axe = new ItemAx("snow_axe", ConfigPreInit.SNOW_TOOL);
        snow_shovel = new ItemShovel("snow_shovel", ConfigPreInit.SNOW_TOOL);
        snow_hoe = new ItemCustomHoe("snow_hoe", ConfigPreInit.SNOW_TOOL);
        snow_sword = new ItemCustomSword("snow_sword", ConfigPreInit.SNOW_TOOL);
        snow_paxel = new ItemPaxel("snow_paxel", ConfigPreInit.SNOW_PAXEL);
        snow_battle_axe = new ItemBattleaxe("snow_battle_axe", ConfigPreInit.SNOW_BATTLEAXE);

        magma_cream_pickaxe = new ItemPick("magma_cream_pickaxe", ConfigPreInit.MAGMACREAM_TOOL);
        magma_cream_axe = new ItemAx("magma_cream_axe", ConfigPreInit.MAGMACREAM_TOOL);
        magma_cream_shovel = new ItemShovel("magma_cream_shovel", ConfigPreInit.MAGMACREAM_TOOL);
        magma_cream_hoe = new ItemCustomHoe("magma_cream_hoe", ConfigPreInit.MAGMACREAM_TOOL);
        magma_cream_sword = new ItemCustomSword("magma_cream_sword", ConfigPreInit.MAGMACREAM_TOOL);
        magma_cream_paxel = new ItemPaxel("magma_cream_paxel", ConfigPreInit.MAGMA_CREAM_PAXEL);
        magmacream_battle_axe = new ItemBattleaxe("magmacream_battle_axe", ConfigPreInit.MAGMA_CREAM_BATTLEAXE);

        sandstone_pickaxe = new ItemPick("sandstone_pickaxe", ConfigPreInit.SANDSTONE_TOOL);
        sandstone_axe = new ItemAx("sandstone_axe", ConfigPreInit.SANDSTONE_TOOL);
        sandstone_shovel = new ItemShovel("sandstone_shovel", ConfigPreInit.SANDSTONE_TOOL);
        sandstone_hoe = new ItemCustomHoe("sandstone_hoe", ConfigPreInit.SANDSTONE_TOOL);
        sandstone_sword = new ItemCustomSword("sandstone_sword", ConfigPreInit.SANDSTONE_TOOL);
        sandstone_paxel = new ItemPaxel("sandstone_paxel", ConfigPreInit.SANDSTONE_PAXEL);
        sandstone_battle_axe = new ItemBattleaxe("sandstone_battle_axe", ConfigPreInit.SANDSTONE_BATTLEAXE);

        soul_sand_pickaxe = new ItemPick("soul_sand_pickaxe", ConfigPreInit.SOULSAND_TOOL);
        soul_sand_axe = new ItemAx("soul_sand_axe", ConfigPreInit.SOULSAND_TOOL);
        soul_sand_shovel = new ItemShovel("soul_sand_shovel", ConfigPreInit.SOULSAND_TOOL);
        soul_sand_hoe = new ItemCustomHoe("soul_sand_hoe", ConfigPreInit.SOULSAND_TOOL);
        soul_sand_sword = new ItemCustomSword("soul_sand_sword", ConfigPreInit.SOULSAND_TOOL);
        soul_sand_paxel = new ItemPaxel("soul_sand_paxel", ConfigPreInit.SOUL_SAND_PAXEL);
        soulsand_battle_axe = new ItemBattleaxe("soulsand_battle_axe", ConfigPreInit.SOUL_SAND_BATTLEAXE);

        clay_pickaxe = new ItemPick("clay_pickaxe", ConfigPreInit.CLAY_TOOL);
        clay_axe = new ItemAx("clay_axe", ConfigPreInit.CLAY_TOOL);
        clay_shovel = new ItemShovel("clay_shovel", ConfigPreInit.CLAY_TOOL);
        clay_hoe = new ItemCustomHoe("clay_hoe", ConfigPreInit.CLAY_TOOL);
        clay_sword = new ItemCustomSword("clay_sword", ConfigPreInit.CLAY_TOOL);
        clay_paxel = new ItemPaxel("clay_paxel", ConfigPreInit.CLAY_PAXEL);
        clay_battle_axe = new ItemBattleaxe("clay_battle_axe", ConfigPreInit.CLAY_BATTLEAXE);

        netherbrickred_sword = new ItemCustomSword("netherbrickred_sword", ConfigPreInit.NETHERBRICK_TOOL);
        netherbrickred_pickaxe = new ItemPick("netherbrickred_pickaxe", ConfigPreInit.NETHERBRICK_TOOL);
        netherbrickred_axe = new ItemAx("netherbrickred_axe", ConfigPreInit.NETHERBRICK_TOOL);
        netherbrickred_shovel = new ItemShovel("netherbrickred_shovel", ConfigPreInit.NETHERBRICK_TOOL);
        netherbrickred_hoe = new ItemCustomHoe("netherbrickred_hoe", ConfigPreInit.NETHERBRICK_TOOL);
        netherbrickred_paxel = new ItemPaxel("netherbrickred_paxel", ConfigPreInit.NBRICK_PAXEL);
        netherbrickred_battle_axe = new ItemBattleaxe("netherbrickred_battle_axe", ConfigPreInit.RED_NBRICK_BATTLEAXE);

        wooden_paxel = new ItemPaxel("wooden_paxel", ConfigPreInit.WOOD_PAXEL);
        wooden_battle_axe = new ItemBattleaxe("wooden_battle_axe", ConfigPreInit.WOOD_BATTLEAXE);
        stone_paxel = new ItemPaxel("stone_paxel", ConfigPreInit.STONE_PAXEL);
        stone_battle_axe = new ItemBattleaxe("stone_battle_axe", ConfigPreInit.STONE_BATTLEAXE);
        iron_paxel = new ItemPaxel("iron_paxel", ConfigPreInit.IRON_PAXEL);
        iron_battle_axe = new ItemBattleaxe("iron_battle_axe", ConfigPreInit.IRON_BATTLEAXE);
        gold_paxel = new ItemPaxel("gold_paxel", ConfigPreInit.GOLD_PAXEL);
        gold_battle_axe = new ItemBattleaxe("gold_battle_axe", ConfigPreInit.GOLD_BATTLEAXE);
        diamond_paxel = new ItemPaxel("diamond_paxel", ConfigPreInit.DIAMOND_PAXEL);
        diamond_battle_axe = new ItemBattleaxe("diamond_battle_axe", ConfigPreInit.DIAMOND_BATTLEAXE);

        register(emerald_sword);
        register(emerald_pickaxe);
        register(emerald_axe);
        register(emerald_shovel);
        register(emerald_hoe);
        register(emerald_paxel);
        register(emerald_battle_axe);

        register(obsidian_sword);
        register(obsidian_pickaxe);
        register(obsidian_axe);
        register(obsidian_shovel);
        register(obsidian_hoe);
        register(obsidian_paxel);
        register(obsidian_battle_axe);

        register(ender_sword);
        register(ender_pickaxe);
        register(ender_axe);
        register(ender_shovel);
        register(ender_hoe);
        register(ender_paxel);
        register(ender_battle_axe);

        register(slime_sword);
        register(slime_pickaxe);
        register(slime_axe);
        register(slime_shovel);
        register(slime_hoe);
        register(slime_paxel);
        register(slime_battle_axe);

        register(coal_sword);
        register(coal_pickaxe);
        register(coal_axe);
        register(coal_shovel);
        register(coal_hoe);
        register(coal_paxel);
        register(coal_battle_axe);

        register(quartz_sword);
        register(quartz_pickaxe);
        register(quartz_axe);
        register(quartz_shovel);
        register(quartz_hoe);
        register(quartz_paxel);
        register(quartz_battle_axe);

        register(flint_sword);
        register(flint_pickaxe);
        register(flint_axe);
        register(flint_shovel);
        register(flint_hoe);
        register(flint_paxel);
        register(flint_battle_axe);

        register(gunpowder_sword);
        register(gunpowder_pickaxe);
        register(gunpowder_axe);
        register(gunpowder_shovel);
        register(gunpowder_hoe);
        register(gunpowder_paxel);
        register(gunpowder_battle_axe);

        register(glowstone_sword);
        register(glowstone_pickaxe);
        register(glowstone_axe);
        register(glowstone_shovel);
        register(glowstone_hoe);
        register(glowstone_paxel);
        register(glowstone_battle_axe);

        register(brick_sword);
        register(brick_pickaxe);
        register(brick_axe);
        register(brick_shovel);
        register(brick_hoe);
        register(brick_paxel);
        register(brick_battle_axe);

        register(nbrick_sword);
        register(nbrick_pickaxe);
        register(nbrick_axe);
        register(nbrick_shovel);
        register(nbrick_hoe);
        register(nbrick_paxel);
        register(netherbrick_battle_axe);

        register(leather_sword);
        register(leather_pickaxe);
        register(leather_axe);
        register(leather_shovel);
        register(leather_hoe);
        register(leather_paxel);
        register(leather_battle_axe);

        register(redstone_sword);
        register(redstone_pickaxe);
        register(redstone_axe);
        register(redstone_shovel);
        register(redstone_hoe);
        register(redstone_paxel);
        register(redstone_battle_axe);

        register(blaze_sword);
        register(blaze_pickaxe);
        register(blaze_axe);
        register(blaze_shovel);
        register(blaze_hoe);
        register(blaze_paxel);
        register(blaze_battle_axe);

        register(nstar_sword);
        register(nstar_pickaxe);
        register(nstar_axe);
        register(nstar_shovel);
        register(nstar_hoe);
        register(nstar_paxel);
        register(netherstar_battle_axe);

        register(snow_sword);
        register(snow_pickaxe);
        register(snow_axe);
        register(snow_shovel);
        register(snow_hoe);
        register(snow_paxel);
        register(snow_battle_axe);

        register(magma_cream_sword);
        register(magma_cream_pickaxe);
        register(magma_cream_axe);
        register(magma_cream_shovel);
        register(magma_cream_hoe);
        register(magma_cream_paxel);
        register(magmacream_battle_axe);

        register(sandstone_sword);
        register(sandstone_pickaxe);
        register(sandstone_axe);
        register(sandstone_shovel);
        register(sandstone_hoe);
        register(sandstone_paxel);
        register(sandstone_battle_axe);

        register(soul_sand_sword);
        register(soul_sand_pickaxe);
        register(soul_sand_axe);
        register(soul_sand_shovel);
        register(soul_sand_hoe);
        register(soul_sand_paxel);
        register(soulsand_battle_axe);

        register(clay_sword);
        register(clay_pickaxe);
        register(clay_axe);
        register(clay_shovel);
        register(clay_hoe);
        register(clay_paxel);
        register(clay_battle_axe);

        register(netherbrickred_sword);
        register(netherbrickred_pickaxe);
        register(netherbrickred_axe);
        register(netherbrickred_shovel);
        register(netherbrickred_hoe);
        register(netherbrickred_paxel);
        register(netherbrickred_battle_axe);

        register(wooden_paxel);
        register(wooden_battle_axe);
        register(stone_paxel);
        register(stone_battle_axe);
        register(iron_paxel);
        register(iron_battle_axe);
        register(gold_paxel);
        register(gold_battle_axe);
        register(diamond_paxel);
        register(diamond_battle_axe);

    }

    public static void register(Item item) {
        GameRegistry.register(item);
    }

    public static void registerRenders() {
        if(ConfigPreInit.disableTools) {

            registerRender(emerald_pickaxe);
            registerRender(emerald_axe);
            registerRender(emerald_shovel);
            registerRender(emerald_sword);
            registerRender(emerald_hoe);
            registerRender(obsidian_pickaxe);
            registerRender(obsidian_axe);
            registerRender(obsidian_shovel);
            registerRender(obsidian_sword);
            registerRender(obsidian_hoe);
            registerRender(ender_pickaxe);
            registerRender(ender_axe);
            registerRender(ender_shovel);
            registerRender(ender_sword);
            registerRender(ender_hoe);
            registerRender(slime_pickaxe);
            registerRender(slime_axe);
            registerRender(slime_shovel);
            registerRender(slime_sword);
            registerRender(slime_hoe);
            registerRender(coal_pickaxe);
            registerRender(coal_axe);
            registerRender(coal_shovel);
            registerRender(coal_sword);
            registerRender(coal_hoe);
            registerRender(quartz_pickaxe);
            registerRender(quartz_axe);
            registerRender(quartz_shovel);
            registerRender(quartz_sword);
            registerRender(quartz_hoe);
            registerRender(flint_pickaxe);
            registerRender(flint_axe);
            registerRender(flint_shovel);
            registerRender(flint_sword);
            registerRender(flint_hoe);
            registerRender(gunpowder_pickaxe);
            registerRender(gunpowder_axe);
            registerRender(gunpowder_shovel);
            registerRender(gunpowder_sword);
            registerRender(gunpowder_hoe);
            registerRender(glowstone_pickaxe);
            registerRender(glowstone_axe);
            registerRender(glowstone_shovel);
            registerRender(glowstone_sword);
            registerRender(glowstone_hoe);
            registerRender(brick_pickaxe);
            registerRender(brick_axe);
            registerRender(brick_shovel);
            registerRender(brick_sword);
            registerRender(brick_hoe);
            registerRender(nbrick_pickaxe);
            registerRender(nbrick_axe);
            registerRender(nbrick_shovel);
            registerRender(nbrick_sword);
            registerRender(nbrick_hoe);
            registerRender(leather_pickaxe);
            registerRender(leather_axe);
            registerRender(leather_shovel);
            registerRender(leather_hoe);
            registerRender(leather_sword);
            registerRender(redstone_pickaxe);
            registerRender(redstone_axe);
            registerRender(redstone_shovel);
            registerRender(redstone_hoe);
            registerRender(redstone_sword);
            registerRender(blaze_pickaxe);
            registerRender(blaze_axe);
            registerRender(blaze_shovel);
            registerRender(blaze_hoe);
            registerRender(blaze_sword);
            registerRender(nstar_pickaxe);
            registerRender(nstar_axe);
            registerRender(nstar_shovel);
            registerRender(nstar_hoe);
            registerRender(nstar_sword);
            registerRender(snow_pickaxe);
            registerRender(snow_axe);
            registerRender(snow_shovel);
            registerRender(snow_hoe);
            registerRender(snow_sword);
            registerRender(magma_cream_pickaxe);
            registerRender(magma_cream_axe);
            registerRender(magma_cream_shovel);
            registerRender(magma_cream_hoe);
            registerRender(magma_cream_sword);
            registerRender(sandstone_pickaxe);
            registerRender(sandstone_axe);
            registerRender(sandstone_shovel);
            registerRender(sandstone_hoe);
            registerRender(sandstone_sword);
            registerRender(soul_sand_pickaxe);
            registerRender(soul_sand_axe);
            registerRender(soul_sand_shovel);
            registerRender(soul_sand_hoe);
            registerRender(soul_sand_sword);
            registerRender(clay_pickaxe);
            registerRender(clay_axe);
            registerRender(clay_shovel);
            registerRender(clay_hoe);
            registerRender(clay_sword);
            registerRender(netherbrickred_pickaxe);
            registerRender(netherbrickred_axe);
            registerRender(netherbrickred_shovel);
            registerRender(netherbrickred_hoe);
            registerRender(netherbrickred_sword);

            registerRender(obsidian_paxel);
            registerRender(emerald_paxel);
            registerRender(quartz_paxel);
            registerRender(coal_paxel);
            registerRender(flint_paxel);
            registerRender(gunpowder_paxel);
            registerRender(glowstone_paxel);
            registerRender(brick_paxel);
            registerRender(nbrick_paxel);
            registerRender(leather_paxel);
            registerRender(redstone_paxel);
            registerRender(blaze_paxel);
            registerRender(ender_paxel);
            registerRender(slime_paxel);
            registerRender(nstar_paxel);
            registerRender(snow_paxel);
            registerRender(magma_cream_paxel);
            registerRender(sandstone_paxel);
            registerRender(soul_sand_paxel);
            registerRender(clay_paxel);
            registerRender(netherbrickred_paxel);

            registerRender(netherstar_battle_axe);
            registerRender(obsidian_battle_axe);
            registerRender(emerald_battle_axe);
            registerRender(ender_battle_axe);
            registerRender(quartz_battle_axe);
            registerRender(blaze_battle_axe);
            registerRender(flint_battle_axe);
            registerRender(gunpowder_battle_axe);
            registerRender(coal_battle_axe);
            registerRender(glowstone_battle_axe);
            registerRender(redstone_battle_axe);
            registerRender(snow_battle_axe);
            registerRender(brick_battle_axe);
            registerRender(netherbrick_battle_axe);
            registerRender(leather_battle_axe);
            registerRender(slime_battle_axe);
            registerRender(clay_battle_axe);
            registerRender(sandstone_battle_axe);
            registerRender(soulsand_battle_axe);
            registerRender(magmacream_battle_axe);
            registerRender(netherbrickred_battle_axe);

            registerRender(wooden_paxel);
            registerRender(stone_paxel);
            registerRender(iron_paxel);
            registerRender(gold_paxel);
            registerRender(diamond_paxel);
            registerRender(wooden_battle_axe);
            registerRender(stone_battle_axe);
            registerRender(iron_battle_axe);
            registerRender(gold_battle_axe);
            registerRender(diamond_battle_axe);


        }
    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }

}
