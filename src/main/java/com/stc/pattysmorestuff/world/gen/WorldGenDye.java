package com.stc.pattysmorestuff.world.gen;

import com.stc.pattysmorestuff.blocks.BlockDye;
import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import com.stc.pattysmorestuff.blocks.ores.BlockDyeOre;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.sun.javafx.event.EventHandlerManager;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by StuffTheChicken on 21/12/2016.
 */
public class WorldGenDye implements IWorldGenerator{

    private WorldGenerator dye_ore;
    private WorldGenerator nether_dye_ore;
    private WorldGenerator end_dye_ore;

    public WorldGenDye() {
        dye_ore = new WorldGenMinable(ModBlocks.dye_ore.getDefaultState().withProperty(BlockDyeOre.TYPE, EnumHandler.OreType.OVERWORLD), 6);
        nether_dye_ore = new WorldGenMinable(ModBlocks.dye_ore.getDefaultState().withProperty(BlockDyeOre.TYPE,EnumHandler.OreType.NETHER), 6, new NetherGenPredicate());
        end_dye_ore = new WorldGenMinable(ModBlocks.dye_ore.getDefaultState().withProperty(BlockDyeOre.TYPE, EnumHandler.OreType.END), 6, new EndGenPredicate());
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
                this.runGenerator(dye_ore, world, random, chunkX, chunkZ, 15, 14, 33);
                break;
            case 1: // End
                this.runGenerator(end_dye_ore, world, random, chunkX, chunkZ, 15, 14, 33);
                break;
            case -1: // Nether
                this.runGenerator(nether_dye_ore, world, random, chunkX, chunkZ, 15, 14, 33);
                break;
        }
    }
}
