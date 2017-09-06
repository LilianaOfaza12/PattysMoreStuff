package com.stc.pattysmorestuff.blocks.reinforced;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.init.ModBlocks;
import com.stc.pattysmorestuff.init.ModItems;
import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.init.ModTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

/**
 * Created by patrick on 20/07/2017.
 */
public class BlockReinforcedObsidian extends Block {

    protected String name;

    public BlockReinforcedObsidian(String name) {
        super(Material.ROCK);
        this.name = name;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Wither proof!");
        tooltip.add("Can be broken by players!");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(ModBlocks.reinforced_obsidian);
    }

    @Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
        if (entity instanceof EntityPlayer) {
            return true;
        } else

            return false;
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {

        if (world.getBlockState(pos).getBlock() == ModBlocks.reinforced_obsidian) {
            explosion.clearAffectedBlockPositions();
        }
    }

    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.BLACK;
    }

    @Override
    public boolean canDropFromExplosion(Explosion p_149659_1_) {
        return false;
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

}

