package com.stc.pattysmorestuff.blocks.blender;

import com.stc.pattysmorestuff.init.ModFood;
import com.stc.pattysmorestuff.init.ModItems;
import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by patrick on 30/07/2017.
 */
public class BlockBlender extends Block {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BlockBlender(String name) {
        super(Material.GLASS);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.tabPattysDecoration);
    }

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(worldIn, pos, state);
    }

    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            IBlockState iblockstate = worldIn.getBlockState(pos.north());
            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }

            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
    }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumfacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     */
    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     */
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
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
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote){


        if (playerIn.getHeldItem(hand).getItem() == Items.CARROT) { //Change this to the item you want to change

            ItemStack CARROT_JUICE = new ItemStack(ModFood.carrot_juice);

            playerIn.getHeldItem(hand).splitStack(1);
            playerIn.addItemStackToInventory(CARROT_JUICE);
            return true;
        }

        if (playerIn.getHeldItem(hand).getItem() == Items.MELON) { //Change this to the item you want to change

            ItemStack MELON_JUICE = new ItemStack(ModFood.melon_juice);

            playerIn.getHeldItem(hand).splitStack(1);
            playerIn.addItemStackToInventory(MELON_JUICE);
            return true;
        }

        if (playerIn.getHeldItem(hand).getItem() == Items.BEETROOT) { //Change this to the item you want to change

            ItemStack BEETROOT_JUICE = new ItemStack(ModFood.beetroot_juice);

            playerIn.getHeldItem(hand).splitStack(1);
            playerIn.addItemStackToInventory(BEETROOT_JUICE);
            return true;
        }

            if (playerIn.getHeldItem(hand).getItem() == Items.APPLE) { //Change this to the item you want to change

                ItemStack APPLE_JUICE = new ItemStack(ModFood.apple_juice);

                playerIn.getHeldItem(hand).splitStack(1);
                playerIn.addItemStackToInventory(APPLE_JUICE);
                return true;
            }

            if (playerIn.getHeldItem(hand).getItem() == Item.getItemFromBlock(Blocks.PUMPKIN)) { //Change this to the item you want to change

                ItemStack PUMPKIN_JUICE = new ItemStack(ModFood.pumpkin_juice);

                playerIn.getHeldItem(hand).splitStack(1);
                playerIn.addItemStackToInventory(PUMPKIN_JUICE);
                return true;
            }

            /*if (playerIn.getHeldItem(hand).getItem() == Items.MELON && playerIn.getHeldItemOffhand().getItem() == Items.SUGAR) { //Change this to the item you want to change

                ItemStack COOKIE = new ItemStack(Items.COOKIE);

                playerIn.getHeldItem(hand).splitStack(1);
                playerIn.getHeldItemOffhand().shrink(1);
                playerIn.addItemStackToInventory(COOKIE);

                return true;
            }
            */
    }
        return false;
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

}
