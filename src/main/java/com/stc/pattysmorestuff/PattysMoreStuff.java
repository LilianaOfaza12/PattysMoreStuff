package com.stc.pattysmorestuff;

import java.io.File;

import com.stc.pattysmorestuff.armor.init.ModArmor;
import com.stc.pattysmorestuff.armor.init.ModDyeArmor;
import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import com.stc.pattysmorestuff.blocks.init.ModExtraBlocks;
import com.stc.pattysmorestuff.configuration.ConfigurationTools;
import com.stc.pattysmorestuff.crafting.ModCrafting;
import com.stc.pattysmorestuff.food.init.ModFood;
import com.stc.pattysmorestuff.furnaces.init.ModFurnaces;
import com.stc.pattysmorestuff.handlers.PlayerEventHandler;
import com.stc.pattysmorestuff.items.init.ModPMS;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.lib.Loot;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.proxy.CommonProxy;
import com.stc.pattysmorestuff.random.init.ModRandomItems;
import com.stc.pattysmorestuff.tabs.ModTabs;
import com.stc.pattysmorestuff.tileentity.TileEntityAcaciaCrate;
import com.stc.pattysmorestuff.tileentity.TileEntityBigOakCrate;
import com.stc.pattysmorestuff.tileentity.TileEntityBirchCrate;
import com.stc.pattysmorestuff.tileentity.TileEntityDiamondFurnace;
import com.stc.pattysmorestuff.tileentity.TileEntityEmeraldFurnace;
import com.stc.pattysmorestuff.tileentity.TileEntityGoldFurnace;
import com.stc.pattysmorestuff.tileentity.TileEntityIronFurnace;
import com.stc.pattysmorestuff.tileentity.TileEntityJar;
import com.stc.pattysmorestuff.tileentity.TileEntityJungleCrate;
import com.stc.pattysmorestuff.tileentity.TileEntityOakCrate;
import com.stc.pattysmorestuff.tileentity.TileEntitySpruceCrate;
import com.stc.pattysmorestuff.tools.init.ModDyeToolBattleaxe;
import com.stc.pattysmorestuff.tools.init.ModDyeTools;
import com.stc.pattysmorestuff.tools.init.ModToolDyePaxels;
import com.stc.pattysmorestuff.tools.init.ModTools;
import com.stc.pattysmorestuff.world.gen.WorldGenDye;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class PattysMoreStuff
{

    @Mod.Instance("pattysmorestuff")
    public static PattysMoreStuff instance;

    @SidedProxy(
            clientSide = "com.stc.pattysmorestuff.proxy.ClientProxy",
            serverSide = "com.stc.pattysmorestuff.proxy.CommonProxy"
    )
    public static CommonProxy proxy;
    public static Configuration Config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Config = new Configuration(new File("config/PattysMoreStuff/PattysMoreStuff.cfg"));

        ConfigurationTools.syncConfig();

        ModTabs.registerTabs();
        if(ConfigPreInit.disableBlocks) {
            ModBlocks.init();
        }
        ModExtraBlocks.init();
        ModFurnaces.init();

        if(ConfigPreInit.disableTools) {
            ModTools.init();
            ModDyeTools.init();
            ModToolDyePaxels.init();
            ModDyeToolBattleaxe.init();
        }
        if(ConfigPreInit.disableArmor) {
            ModArmor.init();
            ModDyeArmor.init();
        }

        if(ConfigPreInit.disableFood) {
            ModFood.init();
        }

        if(ConfigPreInit.disableMiscItems) {
            ModRandomItems.init();
        }

        ModPMS.init();
        ModCrafting.recipes();
        GameRegistry.registerWorldGenerator(new WorldGenDye(), 0);
        MinecraftForge.EVENT_BUS.register(new PlayerEventHandler());

        if(Loader.isModLoaded("baubles")) {
            MinecraftForge.EVENT_BUS.register(new Loot());
        }
        proxy.registerRenders();

    }
   
    @EventHandler
    public void init(FMLInitializationEvent event) {

        FMLCommonHandler.instance().bus().register(instance);
        GameRegistry.registerTileEntity(TileEntityIronFurnace.class, Strings.MODID + "TileEntityIronFurnace");
        GameRegistry.registerTileEntity(TileEntityGoldFurnace.class, Strings.MODID +"TileEntityGoldFurnace");
        GameRegistry.registerTileEntity(TileEntityDiamondFurnace.class, Strings.MODID +"TileEntityDiamondFurnace");
        GameRegistry.registerTileEntity(TileEntityEmeraldFurnace.class, Strings.MODID +"TileEntityEmeraldFurnace");
        GameRegistry.registerTileEntity(TileEntityJar.class, Strings.MODID + "TileEntityJar");
        GameRegistry.registerTileEntity(TileEntityOakCrate.class, Strings.MODID + "TileEntityOakCrate");
        GameRegistry.registerTileEntity(TileEntitySpruceCrate.class, Strings.MODID + "TileEntitySpruceCrate");
        GameRegistry.registerTileEntity(TileEntityBirchCrate.class, Strings.MODID + "TileEntityBirchCrate");
        GameRegistry.registerTileEntity(TileEntityJungleCrate.class, Strings.MODID + "TileEntityJungleCrate");
        GameRegistry.registerTileEntity(TileEntityBigOakCrate.class, Strings.MODID + "TileEntityBigOakCrate");
        GameRegistry.registerTileEntity(TileEntityAcaciaCrate.class, Strings.MODID + "TileEntityAcaciaCrate");


    }

    @SubscribeEvent
    public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Strings.MODID)) {
            ConfigurationTools.syncConfig();
        }
    }
}
