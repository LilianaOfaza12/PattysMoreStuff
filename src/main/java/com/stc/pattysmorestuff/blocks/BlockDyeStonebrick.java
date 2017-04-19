package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.blocks.item.IMetaBlockName;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import net.minecraft.block.Block;
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
 * Created by StuffTheChicken on 09/02/2017.
 */
public class BlockDyeStonebrick extends Block implements IMetaBlockName {

    /**
     * The type property
     */
    public static final PropertyEnum TYPE = PropertyEnum.create("type", EnumHandler.BrickType.class);


    public BlockDyeStonebrick(String unlocalizedName) {
        super(Material.IRON);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumHandler.BrickType.WHITE)); //Default state
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        for(int i = 0; i < EnumHandler.BrickType.values().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {TYPE});
    }


    public String getSpecialName(ItemStack stack) {
        return EnumHandler.BrickType.values()[stack.getItemDamage()].getName();
    }

    /**
     * Makes sure that when you pick block you get the correct block
     */
    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, (int) (getMetaFromState(world.getBlockState(pos))));
    }

    /**
     * Makes sure the block drops the correct damage. If the block has the {@link PropertyDirection} then this needs to be overridden
     */
    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    /**
     * Returns the meta data from the blockstate. If the block has the {@link PropertyDirection} then this needs to be overridden
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumHandler.BrickType)state.getValue(TYPE)).getID();
    }

    /**
     * Returns the state from the meta data. If the block has the {@link PropertyDirection} then this needs to be overridden
     */
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, EnumHandler.BrickType.values()[meta % EnumHandler.BrickType.values().length]);
    }


}
