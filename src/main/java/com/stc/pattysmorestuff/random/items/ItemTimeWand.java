package com.stc.pattysmorestuff.random.items;

import com.stc.pattysmorestuff.gui.GuiTimeWand;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.tabs.ModTabs;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by StuffTheChicken on 07/01/2017.
 */
public class ItemTimeWand extends Item {

    Minecraft mc;


    public ItemTimeWand(String name) {

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModTabs.tabPattysMisc);

    }

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if (worldIn.isDaytime()) {
            worldIn.setWorldTime(13000);
            if(!playerIn.capabilities.isCreativeMode) {
                playerIn.getHeldItem(handIn).damageItem(1, playerIn);
            }
        } else if (!worldIn.isDaytime()) {
            worldIn.setWorldTime(1000);
            if(!playerIn.capabilities.isCreativeMode) {
                playerIn.getHeldItem(handIn).damageItem(1, playerIn);
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }*/

    @Override
    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(!worldIn.isRemote) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiTimeWand());
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
