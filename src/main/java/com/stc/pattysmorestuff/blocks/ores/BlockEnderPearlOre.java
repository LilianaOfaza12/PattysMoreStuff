package com.stc.pattysmorestuff.blocks.ores;

import com.stc.pattysmorestuff.blocks.item.IMetaBlockName;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.stc.pattysmorestuff.tabs.ModTabs;
import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by StuffTheChicken on 09/01/2017.
 */
public class BlockEnderPearlOre extends Block implements IMetaBlockName {

    public static final PropertyEnum TYPE = PropertyEnum.create("type", EnumHandler.OreType.class);


    public BlockEnderPearlOre(String unlocalizedName) {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(ModTabs.tabPattysBlocks);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumHandler.OreType.OVERWORLD)); //Default state

    }


    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        for(int i = 0; i < EnumHandler.OreType.values().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }


    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == ModBlocks.ender_pearl_ore ? Items.ENDER_PEARL : Item.getItemFromBlock(this);
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
    /**
     * Spawns this Block's drops into the World as EntityItems.
     */
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == ModBlocks.ender_pearl_ore)
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            return i;
        }
        return 0;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {TYPE});
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumHandler.OreType type = (EnumHandler.OreType) state.getValue(TYPE);
        return type.getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, EnumHandler.OreType.values()[meta]);
    }

    public String getSpecialName(ItemStack stack) {
        return EnumHandler.OreType.values()[stack.getItemDamage()].getName();
    }
}
