package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.blocks.item.IMetaBlockName;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * Created by patrick on 07/03/2017.
 */
public class BlockDyeFence extends BlockFence {



    public BlockDyeFence(String name) {
        super(Material.CLOTH, MapColor.CLOTH);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3);
        this.setResistance(5);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
        this.useNeighborBrightness = true;

    }
}
