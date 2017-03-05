package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import com.stc.pattysmorestuff.blocks.init.ModExtraBlocks;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

/**
 * Created by StuffTheChicken on 29/01/2017.
 */
public class BlockReinforcedObsidian extends Block {

    public BlockReinforcedObsidian(String name) {
        super(Material.ROCK);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(ModTabs.tabPattysMisc);
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("Wither proof!");
        tooltip.add("Can be broken by players!");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(ModExtraBlocks.reinforced_obsidian);
    }
    
    @Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
        if(entity instanceof EntityPlayer){
        	return true;
        }else
    	
    	return false;
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {

    	if(world.getBlockState(pos).getBlock() == ModExtraBlocks.reinforced_obsidian) {
    		explosion.clearAffectedBlockPositions();
    	}
    }


    @Override
    public MapColor getMapColor(IBlockState state) {
        return MapColor.BLACK;
    }

    @Override
    public boolean canDropFromExplosion(Explosion p_149659_1_) {
        return false;
    }
    
}
