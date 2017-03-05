package com.stc.pattysmorestuff.blocks;

import com.stc.pattysmorestuff.blocks.item.IMetaBlockName;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import java.util.List;

/**
 * Created by StuffTheChicken on 14/11/2016.
 */
public class BlockDye extends Block implements IMetaBlockName {

    /**
     * The type property
     */
    public static final PropertyEnum TYPE = PropertyEnum.create("type", EnumHandler.BlockType.class);


    public BlockDye(String unlocalizedName) {
        super(Material.IRON);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumHandler.BlockType.WHITE)); //Default state
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("When mined the block will drop random amounts of dye and most likely different each time!");
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        for(int i = 0; i < EnumHandler.BlockType.values().length; i++) {
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

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumHandler.BlockType type = (EnumHandler.BlockType) state.getValue(TYPE);
        return type.getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, EnumHandler.BlockType.values()[meta]);
    }

    public String getSpecialName(ItemStack stack) {
        return EnumHandler.BlockType.values()[stack.getItemDamage()].getName();
    }


}
