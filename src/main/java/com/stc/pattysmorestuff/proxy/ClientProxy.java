package com.stc.pattysmorestuff.proxy;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.init.*;
import com.stc.pattysmorestuff.tileentity.jar.TileEntityJar;
import com.stc.pattysmorestuff.tileentity.render.RenderJar;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import java.awt.*;


/**
 * Created by StuffTheChicken on 10/11/2016.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenders() {

        //Blocks
        ModBlocks.registerModels();
        ModFurnaces.registerModels();
        ModColoredBlocks.registerModels();

        //Items
        ModItems.registerModels();

        //Armor
        ModArmor.registerModels();
        ModColoredArmor.registerModels();

        //Tools
        ModTools.registerModels();
        ModColoredTools.registerModels();
        ModColoredPaxels.registerModels();
        ModColoredBattleaxe.registerModels();

        //Food
        ModFood.registerModels();

        //Jar
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RenderJar());

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
