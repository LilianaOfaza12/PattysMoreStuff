package com.stc.pattysmorestuff.proxy;

import com.stc.pattysmorestuff.world.gen.WorldGenDye;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by peeweebirch70 on 10/11/2016.
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
