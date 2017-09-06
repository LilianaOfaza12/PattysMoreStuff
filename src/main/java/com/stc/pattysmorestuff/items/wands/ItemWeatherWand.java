package com.stc.pattysmorestuff.items.wands;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.gui.GuiHandler;
import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by patrick on 02/08/2017.
 */
public class ItemWeatherWand extends Item {


    public ItemWeatherWand(String name) {

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModTabs.tabPattysMisc);

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("\u00A7cThis item is not repairable");

    }

    @Override
    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(worldIn.isRemote) {

            playerIn.openGui(PattysMoreStuff.instance, GuiHandler.WEATHER_WAND, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
