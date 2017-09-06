package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.entitys.EntityRedBullSlurpie;
import com.stc.pattysmorestuff.entitys.EntityStuffTheChicken;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by patrick on 24/07/2017.
 */
public class ModEntitys {

    private static int modEntitys = 0;


    public static void registerEntities() {

        registerModEntityWithEgg(EntityStuffTheChicken.class, "stuffthechicken", 0x66ffff, 0xffffff);
        registerModEntityWithEgg(EntityRedBullSlurpie.class, "redbullslurpie", 0xffcc00, 0xff9933);


    }

    public static void registerModEntityWithEgg(Class parEntityClass, String parEntityName, int parEggColor, int parEggSpotsColor) {
        EntityRegistry.registerModEntity(new ResourceLocation(Strings.MODID, parEntityName), parEntityClass, parEntityName, ++modEntitys, PattysMoreStuff.instance, 80, 3, false);
        registerSpawnEgg(parEntityName, parEntityClass, parEggColor, parEggSpotsColor);

    }

    private static void registerSpawnEgg(String parEntityName, Class parEntityClass, int parEggColor, int parEggSpotsColor) {

        EntityRegistry.registerEgg(new ResourceLocation(Strings.MODID, parEntityName), parEggColor, parEggSpotsColor);

    }



    }
