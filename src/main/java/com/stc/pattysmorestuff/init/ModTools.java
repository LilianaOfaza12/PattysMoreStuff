package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.*;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModTools  {

    public static Item nstar_pickaxe = new ItemStarPick("nstar_pickaxe", ConfigPreInit.NETHERSTAR_TOOL);
    public static Item nstar_axe = new ItemStarAxe("nstar_axe", ConfigPreInit.NETHERSTAR_TOOL);
    public static Item nstar_shovel = new ItemStarShovel("nstar_shovel", ConfigPreInit.NETHERSTAR_TOOL);
    public static Item nstar_hoe = new ItemStarHoe("nstar_hoe", ConfigPreInit.NETHERSTAR_TOOL);
    public static Item nstar_sword = new ItemStarSword("nstar_sword", ConfigPreInit.NETHERSTAR_TOOL);
    public static Item nstar_paxel = new ItemStarPaxel("nstar_paxel", ConfigPreInit.NETHERSTAR_PAXEL);
    public static Item netherstar_battle_axe = new ItemStarBattleaxe("netherstar_battle_axe", ConfigPreInit.NETHERSTAR_BATTLEAXE);

    public static Item emerald_pickaxe = new ItemPick("emerald_pickaxe", ConfigPreInit.EMERALD_TOOL);
    public static Item emerald_axe = new ItemAx("emerald_axe", ConfigPreInit.EMERALD_TOOL);
    public static Item emerald_shovel = new ItemShovel("emerald_shovel", ConfigPreInit.EMERALD_TOOL);
    public static Item emerald_sword = new ItemCustomSword("emerald_sword", ConfigPreInit.EMERALD_TOOL);
    public static Item emerald_hoe = new ItemCustomHoe("emerald_hoe", ConfigPreInit.EMERALD_TOOL);
    public static Item emerald_paxel = new ItemPaxel("emerald_paxel", ConfigPreInit.EMERALD_PAXEL);
    public static Item emerald_battle_axe = new ItemBattleaxe("emerald_battle_axe", ConfigPreInit.EMERALD_BATTLEAXE);

    public static Item obsidian_pickaxe = new ItemPick("obsidian_pickaxe", ConfigPreInit.OBSIDIAN_TOOL);
    public static Item obsidian_axe = new ItemAx("obsidian_axe", ConfigPreInit.OBSIDIAN_TOOL);
    public static Item obsidian_shovel = new ItemShovel("obsidian_shovel", ConfigPreInit.OBSIDIAN_TOOL);
    public static Item obsidian_sword = new ItemCustomSword("obsidian_sword", ConfigPreInit.OBSIDIAN_TOOL);
    public static Item obsidian_hoe = new ItemCustomHoe("obsidian_hoe", ConfigPreInit.OBSIDIAN_TOOL);
    public static Item obsidian_paxel = new ItemPaxel("obsidian_paxel", ConfigPreInit.OBSIDIAN_PAXEL);
    public static Item obsidian_battle_axe = new ItemBattleaxe("obsidian_battle_axe", ConfigPreInit.OBSIDIAN_BATTLEAXE);

    public static Item ender_pickaxe = new ItemPick("ender_pickaxe", ConfigPreInit.ENDER_TOOL);
    public static Item ender_axe = new ItemAx("ender_axe", ConfigPreInit.ENDER_TOOL);
    public static Item ender_shovel = new ItemShovel("ender_shovel", ConfigPreInit.ENDER_TOOL);
    public static Item ender_hoe = new ItemCustomHoe("ender_hoe", ConfigPreInit.ENDER_TOOL);
    public static Item ender_sword = new ItemCustomSword("ender_sword", ConfigPreInit.ENDER_TOOL);
    public static Item ender_paxel = new ItemPaxel("ender_paxel", ConfigPreInit.ENDER_PAXEL);
    public static Item ender_battle_axe = new ItemBattleaxe("ender_battle_axe", ConfigPreInit.ENDER_BATTLEAXE);

    public static Item slime_pickaxe = new ItemPick("slime_pickaxe", ConfigPreInit.SLIME_TOOL);
    public static Item slime_axe = new ItemAx("slime_axe", ConfigPreInit.SLIME_TOOL);
    public static Item slime_shovel = new ItemShovel("slime_shovel", ConfigPreInit.SLIME_TOOL);
    public static Item slime_hoe = new ItemCustomHoe("slime_hoe", ConfigPreInit.SLIME_TOOL);
    public static Item slime_sword = new ItemCustomSword("slime_sword", ConfigPreInit.SLIME_TOOL);
    public static Item slime_paxel = new ItemPaxel("slime_paxel", ConfigPreInit.SLIME_PAXEL);
    public static Item slime_battle_axe = new ItemBattleaxe("slime_battle_axe", ConfigPreInit.SLIME_BATTLEAXE);

    public static Item coal_pickaxe = new ItemPick("coal_pickaxe", ConfigPreInit.COAL_TOOL);
    public static Item coal_axe = new ItemAx("coal_axe", ConfigPreInit.COAL_TOOL);
    public static Item coal_shovel = new ItemShovel("coal_shovel", ConfigPreInit.COAL_TOOL);
    public static Item coal_hoe = new ItemCustomHoe("coal_hoe", ConfigPreInit.COAL_TOOL);
    public static Item coal_sword = new ItemCustomSword("coal_sword", ConfigPreInit.COAL_TOOL);
    public static Item coal_paxel = new ItemPaxel("coal_paxel", ConfigPreInit.COAL_PAXEL);
    public static Item coal_battle_axe = new ItemBattleaxe("coal_battle_axe", ConfigPreInit.COAL_BATTLEAXE);

    public static Item quartz_pickaxe = new ItemPick("quartz_pickaxe", ConfigPreInit.QUARTZ_TOOL);
    public static Item quartz_axe = new ItemAx("quartz_axe", ConfigPreInit.QUARTZ_TOOL);
    public static Item quartz_shovel = new ItemShovel("quartz_shovel", ConfigPreInit.QUARTZ_TOOL);
    public static Item quartz_sword = new ItemCustomSword("quartz_sword", ConfigPreInit.QUARTZ_TOOL);
    public static Item quartz_hoe = new ItemCustomHoe("quartz_hoe", ConfigPreInit.QUARTZ_TOOL);
    public static Item quartz_paxel = new ItemPaxel("quartz_paxel", ConfigPreInit.QUARTZ_PAXEL);
    public static Item quartz_battle_axe = new ItemBattleaxe("quartz_battle_axe", ConfigPreInit.QUARTZ_BATTLEAXE);

    public static Item flint_pickaxe = new ItemPick("flint_pickaxe", ConfigPreInit.FLINT_TOOL);
    public static Item flint_axe = new ItemAx("flint_axe", ConfigPreInit.FLINT_TOOL);
    public static Item flint_shovel = new ItemShovel("flint_shovel", ConfigPreInit.FLINT_TOOL);
    public static Item flint_hoe = new ItemCustomHoe("flint_hoe", ConfigPreInit.FLINT_TOOL);
    public static Item flint_sword = new ItemCustomSword("flint_sword", ConfigPreInit.FLINT_TOOL);
    public static Item flint_paxel = new ItemPaxel("flint_paxel", ConfigPreInit.FLINT_PAXEL);
    public static Item flint_battle_axe = new ItemBattleaxe("flint_battle_axe", ConfigPreInit.FLINT_BATTLEAXE);

    public static Item gunpowder_pickaxe = new ItemPick("gunpowder_pickaxe", ConfigPreInit.GUNPOWDER_TOOL);
    public static Item gunpowder_axe = new ItemAx("gunpowder_axe", ConfigPreInit.GUNPOWDER_TOOL);
    public static Item gunpowder_shovel = new ItemShovel("gunpowder_shovel", ConfigPreInit.GUNPOWDER_TOOL);
    public static Item gunpowder_hoe = new ItemCustomHoe("gunpowder_hoe", ConfigPreInit.GUNPOWDER_TOOL);
    public static Item gunpowder_sword = new ItemCustomSword("gunpowder_sword", ConfigPreInit.GUNPOWDER_TOOL);
    public static Item gunpowder_paxel = new ItemPaxel("gunpowder_paxel", ConfigPreInit.GUNPOWDER_PAXEL);
    public static Item gunpowder_battle_axe = new ItemBattleaxe("gunpowder_battle_axe", ConfigPreInit.GUNPOWDER_BATTLEAXE);

    public static Item glowstone_pickaxe = new ItemPick("glowstone_pickaxe", ConfigPreInit.GLOWSTONE_TOOL);
    public static Item glowstone_axe = new ItemAx("glowstone_axe", ConfigPreInit.GLOWSTONE_TOOL);
    public static Item glowstone_shovel = new ItemShovel("glowstone_shovel", ConfigPreInit.GLOWSTONE_TOOL);
    public static Item glowstone_sword = new ItemCustomSword("glowstone_sword", ConfigPreInit.GLOWSTONE_TOOL);
    public static Item glowstone_hoe = new ItemCustomHoe("glowstone_hoe", ConfigPreInit.GLOWSTONE_TOOL);
    public static Item glowstone_paxel = new ItemPaxel("glowstone_paxel", ConfigPreInit.GLOWSTONE_PAXEL);
    public static Item glowstone_battle_axe = new ItemBattleaxe("glowstone_battle_axe", ConfigPreInit.GLOWSTONE_BATTLEAXE);

    public static Item brick_pickaxe = new ItemPick("brick_pickaxe", ConfigPreInit.BRICK_TOOL);
    public static Item brick_axe = new ItemAx("brick_axe", ConfigPreInit.BRICK_TOOL);
    public static Item brick_shovel = new ItemShovel("brick_shovel", ConfigPreInit.BRICK_TOOL);
    public static Item brick_hoe = new ItemCustomHoe("brick_hoe", ConfigPreInit.BRICK_TOOL);
    public static Item brick_sword = new ItemCustomSword("brick_sword", ConfigPreInit.BRICK_TOOL);
    public static Item brick_paxel = new ItemPaxel("brick_paxel", ConfigPreInit.BRICK_PAXEL);
    public static Item brick_battle_axe = new ItemBattleaxe("brick_battle_axe", ConfigPreInit.BRICK_BATTLEAXE);

    public static Item nbrick_pickaxe = new ItemPick("nbrick_pickaxe", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item nbrick_axe = new ItemAx("nbrick_axe", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item nbrick_shovel = new ItemShovel("nbrick_shovel", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item nbrick_hoe = new ItemCustomHoe("nbrick_hoe", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item nbrick_sword = new ItemCustomSword("nbrick_sword", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item nbrick_paxel = new ItemPaxel("nbrick_paxel", ConfigPreInit.NBRICK_PAXEL);
    public static Item netherbrick_battle_axe = new ItemBattleaxe("netherbrick_battle_axe", ConfigPreInit.NBRICK_BATTLEAXE);

    public static Item leather_pickaxe = new ItemPick("leather_pickaxe", ConfigPreInit.LEATHER_TOOL);
    public static Item leather_axe = new ItemAx("leather_axe", ConfigPreInit.LEATHER_TOOL);
    public static Item leather_shovel = new ItemShovel("leather_shovel", ConfigPreInit.LEATHER_TOOL);
    public static Item leather_hoe = new ItemCustomHoe("leather_hoe", ConfigPreInit.LEATHER_TOOL);
    public static Item leather_sword = new ItemCustomSword("leather_sword", ConfigPreInit.LEATHER_TOOL);
    public static Item leather_paxel = new ItemPaxel("leather_paxel", ConfigPreInit.LEATHER_PAXEL);
    public static Item leather_battle_axe = new ItemBattleaxe("leather_battle_axe", ConfigPreInit.LEATHER_BATTLEAXE);

    public static Item redstone_pickaxe = new ItemPick("redstone_pickaxe", ConfigPreInit.REDSTONE_TOOL);
    public static Item redstone_axe = new ItemAx("redstone_axe", ConfigPreInit.REDSTONE_TOOL);
    public static Item redstone_shovel = new ItemShovel("redstone_shovel", ConfigPreInit.REDSTONE_TOOL);
    public static Item redstone_hoe = new ItemCustomHoe("redstone_hoe", ConfigPreInit.REDSTONE_TOOL);
    public static Item redstone_sword = new ItemCustomSword("redstone_sword", ConfigPreInit.REDSTONE_TOOL);
    public static Item redstone_paxel = new ItemPaxel("redstone_paxel", ConfigPreInit.REDSTONE_PAXEL);
    public static Item redstone_battle_axe = new ItemBattleaxe("redstone_battle_axe", ConfigPreInit.REDSTONE_BATTLEAXE);

    public static Item blaze_pickaxe = new ItemPick("blaze_pickaxe", ConfigPreInit.BLAZE_TOOL);
    public static Item blaze_axe = new ItemAx("blaze_axe", ConfigPreInit.BLAZE_TOOL);
    public static Item blaze_shovel = new ItemShovel("blaze_shovel", ConfigPreInit.BLAZE_TOOL);
    public static Item blaze_hoe = new ItemCustomHoe("blaze_hoe", ConfigPreInit.BLAZE_TOOL);
    public static Item blaze_sword = new ItemCustomSword("blaze_sword", ConfigPreInit.BLAZE_TOOL);
    public static Item blaze_paxel = new ItemPaxel("blaze_paxel", ConfigPreInit.BLAZE_PAXEL);
    public static Item blaze_battle_axe = new ItemBattleaxe("blaze_battle_axe", ConfigPreInit.BLAZE_BATTLEAXE);

    public static Item snow_pickaxe = new ItemPick("snow_pickaxe", ConfigPreInit.SNOW_TOOL);
    public static Item snow_axe = new ItemAx("snow_axe", ConfigPreInit.SNOW_TOOL);
    public static Item snow_shovel = new ItemShovel("snow_shovel", ConfigPreInit.SNOW_TOOL);
    public static Item snow_hoe = new ItemCustomHoe("snow_hoe", ConfigPreInit.SNOW_TOOL);
    public static Item snow_sword = new ItemCustomSword("snow_sword", ConfigPreInit.SNOW_TOOL);
    public static Item snow_paxel = new ItemPaxel("snow_paxel", ConfigPreInit.SNOW_PAXEL);
    public static Item snow_battle_axe = new ItemBattleaxe("snow_battle_axe", ConfigPreInit.SNOW_BATTLEAXE);

    public static Item magma_cream_pickaxe = new ItemPick("magma_cream_pickaxe", ConfigPreInit.MAGMACREAM_TOOL);
    public static Item magma_cream_axe = new ItemAx("magma_cream_axe", ConfigPreInit.MAGMACREAM_TOOL);
    public static Item magma_cream_shovel = new ItemShovel("magma_cream_shovel", ConfigPreInit.MAGMACREAM_TOOL);
    public static Item magma_cream_hoe = new ItemCustomHoe("magma_cream_hoe", ConfigPreInit.MAGMACREAM_TOOL);
    public static Item magma_cream_sword = new ItemCustomSword("magma_cream_sword", ConfigPreInit.MAGMACREAM_TOOL);
    public static Item magma_cream_paxel = new ItemPaxel("magma_cream_paxel", ConfigPreInit.MAGMA_CREAM_PAXEL);
    public static Item magmacream_battle_axe = new ItemBattleaxe("magmacream_battle_axe", ConfigPreInit.MAGMA_CREAM_BATTLEAXE);

    public static Item sandstone_pickaxe = new ItemPick("sandstone_pickaxe", ConfigPreInit.SANDSTONE_TOOL);
    public static Item sandstone_axe = new ItemAx("sandstone_axe", ConfigPreInit.SANDSTONE_TOOL);
    public static Item sandstone_shovel = new ItemShovel("sandstone_shovel", ConfigPreInit.SANDSTONE_TOOL);
    public static Item sandstone_hoe = new ItemCustomHoe("sandstone_hoe", ConfigPreInit.SANDSTONE_TOOL);
    public static Item sandstone_sword = new ItemCustomSword("sandstone_sword", ConfigPreInit.SANDSTONE_TOOL);
    public static Item sandstone_paxel = new ItemPaxel("sandstone_paxel", ConfigPreInit.SANDSTONE_PAXEL);
    public static Item sandstone_battle_axe = new ItemBattleaxe("sandstone_battle_axe", ConfigPreInit.SANDSTONE_BATTLEAXE);

    public static Item soul_sand_pickaxe = new ItemPick("soul_sand_pickaxe", ConfigPreInit.SOULSAND_TOOL);
    public static Item soul_sand_axe = new ItemAx("soul_sand_axe", ConfigPreInit.SOULSAND_TOOL);
    public static Item soul_sand_shovel = new ItemShovel("soul_sand_shovel", ConfigPreInit.SOULSAND_TOOL);
    public static Item soul_sand_hoe = new ItemCustomHoe("soul_sand_hoe", ConfigPreInit.SOULSAND_TOOL);
    public static Item soul_sand_sword = new ItemCustomSword("soul_sand_sword", ConfigPreInit.SOULSAND_TOOL);
    public static Item soul_sand_paxel = new ItemPaxel("soul_sand_paxel", ConfigPreInit.SOUL_SAND_PAXEL);
    public static Item soulsand_battle_axe = new ItemBattleaxe("soulsand_battle_axe", ConfigPreInit.SOUL_SAND_BATTLEAXE);

    public static Item clay_pickaxe = new ItemPick("clay_pickaxe", ConfigPreInit.CLAY_TOOL);
    public static Item clay_axe = new ItemAx("clay_axe", ConfigPreInit.CLAY_TOOL);
    public static Item clay_shovel = new ItemShovel("clay_shovel", ConfigPreInit.CLAY_TOOL);
    public static Item clay_hoe = new ItemCustomHoe("clay_hoe", ConfigPreInit.CLAY_TOOL);
    public static Item clay_sword = new ItemCustomSword("clay_sword", ConfigPreInit.CLAY_TOOL);
    public static Item clay_paxel = new ItemPaxel("clay_paxel", ConfigPreInit.CLAY_PAXEL);
    public static Item clay_battle_axe = new ItemBattleaxe("clay_battle_axe", ConfigPreInit.CLAY_BATTLEAXE);

    public static Item netherbrickred_sword = new ItemCustomSword("netherbrickred_sword", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item netherbrickred_pickaxe = new ItemPick("netherbrickred_pickaxe", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item netherbrickred_axe = new ItemAx("netherbrickred_axe", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item netherbrickred_shovel = new ItemShovel("netherbrickred_shovel", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item netherbrickred_hoe = new ItemCustomHoe("netherbrickred_hoe", ConfigPreInit.NETHERBRICK_TOOL);
    public static Item netherbrickred_paxel = new ItemPaxel("netherbrickred_paxel", ConfigPreInit.NBRICK_PAXEL);
    public static Item netherbrickred_battle_axe = new ItemBattleaxe("netherbrickred_battle_axe", ConfigPreInit.RED_NBRICK_BATTLEAXE);

    public static Item wooden_paxel = new ItemPaxel("wooden_paxel", ConfigPreInit.WOOD_PAXEL);
    public static Item wooden_battle_axe = new ItemBattleaxe("wooden_battle_axe", ConfigPreInit.WOOD_BATTLEAXE);
    public static Item stone_paxel = new ItemPaxel("stone_paxel", ConfigPreInit.STONE_PAXEL);
    public static Item stone_battle_axe = new ItemBattleaxe("stone_battle_axe", ConfigPreInit.STONE_BATTLEAXE);
    public static Item iron_paxel = new ItemPaxel("iron_paxel", ConfigPreInit.IRON_PAXEL);
    public static Item iron_battle_axe = new ItemBattleaxe("iron_battle_axe", ConfigPreInit.IRON_BATTLEAXE);
    public static Item gold_paxel = new ItemPaxel("gold_paxel", ConfigPreInit.GOLD_PAXEL);
    public static Item gold_battle_axe = new ItemBattleaxe("gold_battle_axe", ConfigPreInit.GOLD_BATTLEAXE);
    public static Item diamond_paxel = new ItemPaxel("diamond_paxel", ConfigPreInit.DIAMOND_PAXEL);
    public static Item diamond_battle_axe = new ItemBattleaxe("diamond_battle_axe", ConfigPreInit.DIAMOND_BATTLEAXE);


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                nstar_pickaxe, nstar_axe, nstar_shovel, nstar_sword, nstar_hoe, nstar_paxel, netherstar_battle_axe,
                obsidian_pickaxe, obsidian_axe, obsidian_shovel, obsidian_sword, obsidian_hoe, obsidian_paxel, obsidian_battle_axe,
                emerald_pickaxe, emerald_axe, emerald_shovel, emerald_sword, emerald_hoe, emerald_paxel, emerald_battle_axe,
                ender_pickaxe, ender_axe, ender_shovel, ender_sword, ender_hoe, ender_paxel, ender_battle_axe,
                slime_pickaxe, slime_axe, slime_shovel, slime_sword, slime_hoe, slime_paxel, slime_battle_axe,
                coal_pickaxe, coal_axe, coal_shovel, coal_sword, coal_hoe, coal_paxel, coal_battle_axe,
                quartz_pickaxe, quartz_axe, quartz_shovel, quartz_sword, quartz_hoe, quartz_paxel, quartz_battle_axe,
                flint_pickaxe, flint_axe, flint_shovel, flint_sword, flint_hoe, flint_paxel, flint_battle_axe,
                gunpowder_pickaxe, gunpowder_axe, gunpowder_shovel, gunpowder_sword, gunpowder_hoe, gunpowder_paxel, gunpowder_battle_axe,
                glowstone_pickaxe, glowstone_axe, glowstone_shovel, glowstone_sword, glowstone_hoe, glowstone_paxel, glowstone_battle_axe,
                nbrick_pickaxe, nbrick_axe, nbrick_shovel, nbrick_sword, nbrick_hoe, nbrick_paxel, netherbrick_battle_axe,
                brick_pickaxe, brick_axe, brick_shovel, brick_sword, brick_hoe, brick_paxel, brick_battle_axe,
                leather_pickaxe, leather_axe, leather_shovel, leather_sword, leather_hoe, leather_paxel, leather_battle_axe,
                redstone_pickaxe, redstone_axe, redstone_shovel, redstone_sword, redstone_hoe, redstone_paxel, redstone_battle_axe,
                blaze_pickaxe, blaze_axe, blaze_shovel, blaze_sword, blaze_hoe, blaze_paxel, blaze_battle_axe,
                snow_pickaxe, snow_axe, snow_shovel, snow_sword, snow_hoe, snow_paxel, snow_battle_axe,
                magma_cream_pickaxe, magma_cream_axe, magma_cream_shovel, magma_cream_sword, magma_cream_hoe, magma_cream_paxel, magmacream_battle_axe,
                sandstone_pickaxe, sandstone_axe, sandstone_shovel, sandstone_sword, sandstone_hoe, sandstone_paxel, sandstone_battle_axe,
                soul_sand_pickaxe, soul_sand_axe, soul_sand_shovel, soul_sand_sword, soul_sand_hoe, soul_sand_paxel, soulsand_battle_axe,
                clay_pickaxe, clay_axe, clay_shovel, clay_sword, clay_hoe, clay_paxel, clay_battle_axe,
                netherbrickred_pickaxe, netherbrickred_axe, netherbrickred_shovel, netherbrickred_sword, netherbrickred_hoe, netherbrickred_paxel, netherbrickred_battle_axe,
                wooden_paxel, wooden_battle_axe, stone_paxel, stone_battle_axe, iron_paxel, iron_battle_axe, gold_paxel,
                gold_battle_axe, diamond_paxel, diamond_battle_axe



        );
    }

    public static void registerModels() {

        registerItemRender(nstar_pickaxe);
        registerItemRender(nstar_axe);
        registerItemRender(nstar_shovel);
        registerItemRender(nstar_sword);
        registerItemRender(nstar_hoe);
        registerItemRender(nstar_paxel);
        registerItemRender(netherstar_battle_axe);

        registerItemRender(obsidian_pickaxe);
        registerItemRender(obsidian_axe);
        registerItemRender(obsidian_shovel);
        registerItemRender(obsidian_sword);
        registerItemRender(obsidian_hoe);
        registerItemRender(obsidian_paxel);
        registerItemRender(obsidian_battle_axe);

        registerItemRender(emerald_pickaxe);
        registerItemRender(emerald_axe);
        registerItemRender(emerald_shovel);
        registerItemRender(emerald_sword);
        registerItemRender(emerald_hoe);
        registerItemRender(emerald_paxel);
        registerItemRender(emerald_battle_axe);

        registerItemRender(ender_pickaxe);
        registerItemRender(ender_axe);
        registerItemRender(ender_shovel);
        registerItemRender(ender_sword);
        registerItemRender(ender_hoe);
        registerItemRender(ender_paxel);
        registerItemRender(ender_battle_axe);

        registerItemRender(slime_pickaxe);
        registerItemRender(slime_axe);
        registerItemRender(slime_shovel);
        registerItemRender(slime_sword);
        registerItemRender(slime_hoe);
        registerItemRender(slime_paxel);
        registerItemRender(slime_battle_axe);

        registerItemRender(coal_pickaxe);
        registerItemRender(coal_axe);
        registerItemRender(coal_shovel);
        registerItemRender(coal_sword);
        registerItemRender(coal_hoe);
        registerItemRender(coal_paxel);
        registerItemRender(coal_battle_axe);

        registerItemRender(quartz_pickaxe);
        registerItemRender(quartz_axe);
        registerItemRender(quartz_shovel);
        registerItemRender(quartz_sword);
        registerItemRender(quartz_hoe);
        registerItemRender(quartz_paxel);
        registerItemRender(quartz_battle_axe);

        registerItemRender(flint_pickaxe);
        registerItemRender(flint_axe);
        registerItemRender(flint_shovel);
        registerItemRender(flint_sword);
        registerItemRender(flint_hoe);
        registerItemRender(flint_paxel);
        registerItemRender(flint_battle_axe);

        registerItemRender(gunpowder_pickaxe);
        registerItemRender(gunpowder_axe);
        registerItemRender(gunpowder_shovel);
        registerItemRender(gunpowder_sword);
        registerItemRender(gunpowder_hoe);
        
        registerItemRender(glowstone_pickaxe);
        registerItemRender(glowstone_axe);
        registerItemRender(glowstone_shovel);
        registerItemRender(glowstone_sword);
        registerItemRender(glowstone_hoe);
        
        registerItemRender(brick_pickaxe);
        registerItemRender(brick_axe);
        registerItemRender(brick_shovel);
        registerItemRender(brick_sword);
        registerItemRender(brick_hoe);
        
        registerItemRender(nbrick_pickaxe);
        registerItemRender(nbrick_axe);
        registerItemRender(nbrick_shovel);
        registerItemRender(nbrick_sword);
        registerItemRender(nbrick_hoe);
        
        registerItemRender(leather_pickaxe);
        registerItemRender(leather_axe);
        registerItemRender(leather_shovel);
        registerItemRender(leather_hoe);
        registerItemRender(leather_sword);
        
        registerItemRender(redstone_pickaxe);
        registerItemRender(redstone_axe);
        registerItemRender(redstone_shovel);
        registerItemRender(redstone_hoe);
        registerItemRender(redstone_sword);
        
        registerItemRender(blaze_pickaxe);
        registerItemRender(blaze_axe);
        registerItemRender(blaze_shovel);
        registerItemRender(blaze_hoe);
        registerItemRender(blaze_sword);
        registerItemRender(blaze_battle_axe);

        registerItemRender(snow_pickaxe);
        registerItemRender(snow_axe);
        registerItemRender(snow_shovel);
        registerItemRender(snow_hoe);
        registerItemRender(snow_sword);
        
        registerItemRender(magma_cream_pickaxe);
        registerItemRender(magma_cream_axe);
        registerItemRender(magma_cream_shovel);
        registerItemRender(magma_cream_hoe);
        registerItemRender(magma_cream_sword);
        
        registerItemRender(sandstone_pickaxe);
        registerItemRender(sandstone_axe);
        registerItemRender(sandstone_shovel);
        registerItemRender(sandstone_hoe);
        registerItemRender(sandstone_sword);
        
        registerItemRender(soul_sand_pickaxe);
        registerItemRender(soul_sand_axe);
        registerItemRender(soul_sand_shovel);
        registerItemRender(soul_sand_hoe);
        registerItemRender(soul_sand_sword);
        
        registerItemRender(clay_pickaxe);
        registerItemRender(clay_axe);
        registerItemRender(clay_shovel);
        registerItemRender(clay_hoe);
        registerItemRender(clay_sword);
        
        registerItemRender(netherbrickred_pickaxe);
        registerItemRender(netherbrickred_axe);
        registerItemRender(netherbrickred_shovel);
        registerItemRender(netherbrickred_hoe);
        registerItemRender(netherbrickred_sword);

        registerItemRender(gunpowder_paxel);
        registerItemRender(glowstone_paxel);
        registerItemRender(brick_paxel);
        registerItemRender(nbrick_paxel);
        registerItemRender(leather_paxel);
        registerItemRender(redstone_paxel);
        registerItemRender(blaze_paxel);
        registerItemRender(ender_paxel);
        registerItemRender(slime_paxel);
        registerItemRender(nstar_paxel);
        registerItemRender(snow_paxel);
        registerItemRender(magma_cream_paxel);
        registerItemRender(sandstone_paxel);
        registerItemRender(soul_sand_paxel);
        registerItemRender(clay_paxel);
        registerItemRender(netherbrickred_paxel);

        registerItemRender(gunpowder_battle_axe);
        registerItemRender(glowstone_battle_axe);
        registerItemRender(redstone_battle_axe);
        registerItemRender(snow_battle_axe);
        registerItemRender(brick_battle_axe);
        registerItemRender(netherbrick_battle_axe);
        registerItemRender(leather_battle_axe);
        registerItemRender(clay_battle_axe);
        registerItemRender(sandstone_battle_axe);
        registerItemRender(soulsand_battle_axe);
        registerItemRender(magmacream_battle_axe);
        registerItemRender(netherbrickred_battle_axe);

        registerItemRender(wooden_paxel);
        registerItemRender(stone_paxel);
        registerItemRender(iron_paxel);
        registerItemRender(gold_paxel);
        registerItemRender(diamond_paxel);
        registerItemRender(wooden_battle_axe);
        registerItemRender(stone_battle_axe);
        registerItemRender(iron_battle_axe);
        registerItemRender(gold_battle_axe);
        registerItemRender(diamond_battle_axe);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
