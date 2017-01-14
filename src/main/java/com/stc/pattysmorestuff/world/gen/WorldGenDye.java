package com.stc.pattysmorestuff.world.gen;

import com.stc.pattysmorestuff.blocks.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by patrick on 21/12/2016.
 */
public class WorldGenDye implements IWorldGenerator{

    private WorldGenerator dye_ore;
    private WorldGenerator ender_pearl_ore;

    public WorldGenDye() {

        dye_ore = new WorldGenMinable(ModBlocks.dye_ore.getDefaultState(), 6);
        ender_pearl_ore = new WorldGenMinable(ModBlocks.ender_pearl_ore.getDefaultState(), 3);
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimension()) {

            case 0:
                this.runGenerator(dye_ore, world, random, chunkX, chunkZ, 3, 0, 70);
                this.runGenerator(ender_pearl_ore, world, random, chunkX, chunkZ, 3, 5, 32);
                break;
        }
    }
}
