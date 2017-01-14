package com.stc.pattysmorestuff.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 04/01/2017.
 */
public class ModBiomes {


    public static Biome Desert_Plains;


    public static void init() {

        Desert_Plains = new BiomeDesert(new Biome.BiomeProperties("Desert Plains"));
    }

    public static void registerBiomes() {

    }

}
