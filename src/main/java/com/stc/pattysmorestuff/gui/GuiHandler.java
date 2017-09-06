package com.stc.pattysmorestuff.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by patrick on 29/07/2017.
 */
public class GuiHandler implements IGuiHandler {

    public static final int TIME_WAND = 0;
    public static final int WEATHER_WAND = 1;


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        return null;
    }



    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == TIME_WAND){
            return new GuiTimeWand();
        }
        if(ID == WEATHER_WAND) {
            return new GuiWeatherWand();
        }
        return null;
    }
}
