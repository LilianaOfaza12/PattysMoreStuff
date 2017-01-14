package com.stc.pattysmorestuff.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

/**
 * Created by patrick on 13/01/2017.
 */
public class GuiHandler implements IGuiHandler {

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        ItemStack mail = null;
        if (player.inventory.getCurrentItem() != null)
        {
            mail = player.inventory.getCurrentItem();
        }
        if (ID == 1)
        {
            return new GuiInfoBook();
        }
        return null;
    }
}
