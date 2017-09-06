package com.stc.pattysmorestuff.items.wands;

import com.stc.pattysmorestuff.init.ModBlocks;
import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by patrick on 02/08/2017.
 */
public class ItemLightWand extends Item {

    public ItemLightWand(String name) {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.setMaxDamage(ConfigPreInit.lightWandMaxDamage);
        this.setCreativeTab(ModTabs.tabPattysMisc);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("\u00A7cThis item is not repairable");

    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            Block block = worldIn.getBlockState(pos).getBlock();
            if (block == ModBlocks.glowair) {
                worldIn.setBlockToAir(pos);
                return EnumActionResult.SUCCESS;
            }

            worldIn.setBlockState(pos.offset(facing), ModBlocks.glowair.getDefaultState(), 3);

        }
        return EnumActionResult.SUCCESS;
    }

    /*public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            Block block = world.getBlockState(pos).getBlock();
            if (block == ModBlocks.glowair) {
                world.setBlockToAir(pos);
                return true;
            }

            world.setBlockState(pos.offset(side), ModBlocks.glowair.getDefaultState(), 3);

        }
        return true;
    }*/
}
