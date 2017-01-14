package com.stc.pattysmorestuff.proxy;

import com.stc.pattysmorestuff.ConfigPreInit;
import com.stc.pattysmorestuff.ModPMS;
import com.stc.pattysmorestuff.armor.init.ModArmor;
import com.stc.pattysmorestuff.armor.init.ModDyeArmor;
import com.stc.pattysmorestuff.blocks.ModBlocks;
import com.stc.pattysmorestuff.food.init.ModFood;
import com.stc.pattysmorestuff.furnaces.init.ModFurnaces;
import com.stc.pattysmorestuff.random.init.ModRandomItems;
import com.stc.pattysmorestuff.tileentity.*;
import com.stc.pattysmorestuff.tileentity.render.RendererJar;
import com.stc.pattysmorestuff.tools.init.ModDyeToolBattleaxe;
import com.stc.pattysmorestuff.tools.init.ModDyeTools;
import com.stc.pattysmorestuff.tools.init.ModTools;
import com.stc.pattysmorestuff.tools.init.ModToolDyePaxels;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.ClientRegistry;

/**
 * Created by peeweebirch70 on 10/11/2016.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenders() {

        //Blocks
        if(ConfigPreInit.disableBlocks) {
            ModBlocks.registerRenders();
        }
        ModFurnaces.registerRenders();
        ModPMS.registerRenders();

        //Tools
        if(ConfigPreInit.disableTools) {
            ModTools.registerRenders();
            ModDyeTools.registerRenders();
            ModToolDyePaxels.registerRenders();
            ModDyeToolBattleaxe.registerRenders();
        }
        //Armor
        if(ConfigPreInit.disableArmor) {

            ModArmor.registerRender();
            ModDyeArmor.registerRender();
        }
        if(ConfigPreInit.disableFood) {
            ModFood.registerRenders();
        }
        if(ConfigPreInit.disableMiscItems) {

            ModRandomItems.registerRenders();
        }

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RendererJar());
    }

    @Override
    public boolean isSinglePlayer()
    {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer()
    {
        return false;
    }


}
