package com.stc.pattysmorestuff.proxy;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.init.*;
import com.stc.pattysmorestuff.tileentity.jar.TileEntityJar;
import com.stc.pattysmorestuff.tileentity.render.RenderJar;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.registry.ClientRegistry;

/**
 * Created by StuffTheChicken on 10/11/2016.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenders() {

        //Blocks
        if(ConfigPreInit.disableBlocks) {

            ModBlocks.registerModels();
            ModFurnaces.registerModels();
            ModColoredBlocks.registerModels();
            ModButtons.registerModels();
        }
        //Items
        ModMiscItem.registerModels();
        if(ConfigPreInit.disableOther) {

            ModItems.registerModels();
        }
        //Armor
        if(ConfigPreInit.disableArmor) {

            ModArmor.registerModels();
        }

        //Tools
        if(ConfigPreInit.disableTools) {

            ModTools.registerModels();
        }
        //Food
        if(ConfigPreInit.disableFood) {

            ModFood.registerModels();
        }
        //Jar
        if(ConfigPreInit.disableBlocks) {

            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RenderJar());
        }
    }

    @Override
    public EntityPlayer getClientPlayer() {
        return Minecraft.getMinecraft().player;
    }

    @Override
    public boolean isSinglePlayer() {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }

}
