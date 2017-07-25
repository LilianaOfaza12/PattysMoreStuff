package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.gui.GuiTimeWand;
import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by patrick on 21/07/2017.
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
