package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.blocks.init.ModExtraBlocks;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by patrick on 01/03/2017.
 */
public class BlockCellingLight extends Block {

    public BlockCellingLight(String name) {
        super(Material.ROCK);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        //this.setLightLevel(1.0f);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {

    }
}
