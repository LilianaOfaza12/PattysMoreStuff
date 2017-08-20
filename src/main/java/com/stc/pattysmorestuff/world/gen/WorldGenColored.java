package com.stc.pattysmorestuff.world.gen;

import com.stc.pattysmorestuff.init.ModBlocks;
import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by patrick on 21/07/2017.
 */
public class WorldGenColored implements IWorldGenerator {

    private WorldGenerator dye_ore;
    private WorldGenerator ender_pearl_ore;


    public WorldGenColored() {
        dye_ore = new WorldGenMinable(ModBlocks.dye_ore.getDefaultState(), ConfigPreInit.oreBlockCount);
        ender_pearl_ore = new WorldGenMinable(ModBlocks.ender_pearl_ore.getDefaultState(), ConfigPreInit.oreEnderBlockCount);

    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimension()) {
            case 0: // Overworld
                this.runGenerator(dye_ore, world, random, chunkX, chunkZ, ConfigPreInit.oreChanceToSpawn, ConfigPreInit.oreMinY, ConfigPreInit.oreMaxY);
                this.runGenerator(ender_pearl_ore, world, random, chunkX, chunkZ, ConfigPreInit.oreEnderChanceToSpawn, ConfigPreInit.oreEnderMinY, ConfigPreInit.oreEnderMaxY);
                break;
            case 1: // End
                break;
            case -1: // Nether
                break;
        }
    }
}
