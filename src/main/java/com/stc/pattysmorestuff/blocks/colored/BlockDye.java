package com.stc.pattysmorestuff.blocks.colored;

import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.items.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyDirection;

/**
 * Created by patrick on 02/08/2017.
 */
public class BlockDye extends Block {

    public BlockDye(String unlocalizedName) {
        super(Material.IRON);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        setCreativeTab(ModTabs.tabPattysBlocks);
    }


    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }


    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

}
