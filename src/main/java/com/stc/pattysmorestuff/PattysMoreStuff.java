package com.stc.pattysmorestuff;

import com.stc.pattysmorestuff.configuration.ConfigurationPMS;
import com.stc.pattysmorestuff.gui.GuiHandler;
import com.stc.pattysmorestuff.init.ModCrafting;
import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.init.ModTileEntitys;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.proxy.CommonProxy;
import com.stc.pattysmorestuff.world.gen.WorldGen;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION, acceptedMinecraftVersions = Strings.MC_VERSION, guiFactory = "com.stc.pattysmorestuff.gui.PMSGuiFactory")
public class PattysMoreStuff
{

    public static Configuration Config;

    @SidedProxy(clientSide = "com.stc.pattysmorestuff.proxy.ClientProxy", serverSide = "com.stc.pattysmorestuff.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("pattysmorestuff")
    public static PattysMoreStuff instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Config = new Configuration(new File("config/PattysMoreStuff/PattysMoreStuff.cfg"));
        ConfigurationPMS.syncConfig();

        ModTabs.registerTabs();
        ModCrafting.furnaceRecipes();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {


        NetworkRegistry.INSTANCE.registerGuiHandler(PattysMoreStuff.instance, new GuiHandler());
        proxy.registerRenders();

        ModTileEntitys.registerTileEntitys();
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    @SubscribeEvent
    public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Strings.MODID)) {
            ConfigurationPMS.syncConfig();
        }
    }


}
