package com.stc.pattysmorestuff.proxy;


import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by StuffTheChicken on 10/11/2016.
 */
public class CommonProxy {

    public void registerRenders() {
    }

    public boolean isSinglePlayer()
    {
        return false;
    }

    public boolean isDedicatedServer()
    {
        return true;
    }
}
