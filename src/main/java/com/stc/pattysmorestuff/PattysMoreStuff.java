package com.stc.pattysmorestuff;

import com.stc.pattysmorestuff.configuration.ConfigurationPMS;
import com.stc.pattysmorestuff.entitys.EntityRedBullSlurpie;
import com.stc.pattysmorestuff.entitys.EntityStuffTheChicken;
import com.stc.pattysmorestuff.entitys.model.EntityRedBullSlurpieModel;
import com.stc.pattysmorestuff.entitys.model.EntityStuffTheChickenModel;
import com.stc.pattysmorestuff.entitys.render.EntityRedBullSlurpieRender;
import com.stc.pattysmorestuff.entitys.render.EntityStuffTheChickenRender;
import com.stc.pattysmorestuff.gui.GuiHandler;
import com.stc.pattysmorestuff.init.ModCrafting;
import com.stc.pattysmorestuff.init.ModEntitys;
import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.proxy.CommonProxy;
import com.stc.pattysmorestuff.tileentity.crates.*;
import com.stc.pattysmorestuff.tileentity.furnaces.*;
import com.stc.pattysmorestuff.tileentity.jar.TileEntityJar;
import com.stc.pattysmorestuff.world.gen.WorldGenColored;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;


@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION, acceptedMinecraftVersions = Strings.MC_VERSION)
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
        ConfigurationPMS.syncConfig();

        ModTabs.registerTabs();
        ModCrafting.furnaceRecipes();
        ModEntitys.registerEntities();


    }
   
    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.registerRenders();
        MinecraftForge.EVENT_BUS.register(instance);
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        GameRegistry.registerTileEntity(TileEntityIronFurnace.class, Strings.MODID + "TileEntityIronFurnace");
        GameRegistry.registerTileEntity(TileEntityGoldFurnace.class, Strings.MODID + "TileEntityGoldFurnace");
        GameRegistry.registerTileEntity(TileEntityDiamondFurnace.class, Strings.MODID + "TileEntityDiamondFurnace");
        GameRegistry.registerTileEntity(TileEntityEmeraldFurnace.class, Strings.MODID + "TileEntityEmeraldFurnace");
        GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, Strings.MODID + "TileEntityObsidianFurnace");
        GameRegistry.registerTileEntity(TileEntityUltimateFurnace.class, Strings.MODID + "TileEntityUltimateFurnace");
        GameRegistry.registerTileEntity(TileEntityJar.class, Strings.MODID + "TileEntityJar");
        GameRegistry.registerTileEntity(TileEntityOakCrate.class, Strings.MODID + "TileEntityOakCrate");
        GameRegistry.registerTileEntity(TileEntitySpruceCrate.class, Strings.MODID + "TileEntitySpruceCrate");
        GameRegistry.registerTileEntity(TileEntityBirchCrate.class, Strings.MODID + "TileEntityBirchCrate");
        GameRegistry.registerTileEntity(TileEntityJungleCrate.class, Strings.MODID + "TileEntityJungleCrate");
        GameRegistry.registerTileEntity(TileEntityBigOakCrate.class, Strings.MODID + "TileEntityBigOakCrate");
        GameRegistry.registerTileEntity(TileEntityAcaciaCrate.class, Strings.MODID + "TileEntityAcaciaCrate");

        GameRegistry.registerWorldGenerator(new WorldGenColored(), 0);

        RenderingRegistry.registerEntityRenderingHandler(EntityStuffTheChicken.class, new EntityStuffTheChickenRender(new EntityStuffTheChickenModel(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRedBullSlurpie.class, new EntityRedBullSlurpieRender(new EntityRedBullSlurpieModel(), 0.5F));

        EntityRegistry.addSpawn(EntityStuffTheChicken.class, 5, 1, 3, EnumCreatureType.CREATURE, Biomes.PLAINS);
        EntityRegistry.addSpawn(EntityRedBullSlurpie.class, 5, 1, 3, EnumCreatureType.CREATURE, Biomes.PLAINS);
    }


    @SubscribeEvent
    public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Strings.MODID)) {
            ConfigurationPMS.syncConfig();
        }
    }


}
