package com.stc.pattysmorestuff.tools.init;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.tools.items.ItemColoredBattleaxe;
import com.stc.pattysmorestuff.ConfigPreInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by peeweebirch70 on 13/11/2016.
 */
public class ModDyeToolBattleaxe {

    public static Item black_battle_axe;
    public static Item red_battle_axe;
    public static Item green_battle_axe;
    public static Item brown_battle_axe;
    public static Item blue_battle_axe;

    public static Item purple_battle_axe;
    public static Item cyan_battle_axe;
    public static Item lightgray_battle_axe;
    public static Item gray_battle_axe;
    public static Item pink_battle_axe;

    public static Item lime_battle_axe;
    public static Item yellow_battle_axe;
    public static Item lightblue_battle_axe;
    public static Item magenta_battle_axe;
    public static Item orange_battle_axe;

    public static Item white_battle_axe;

    public static void init() {

        if(ConfigPreInit.disableTools) {
            black_battle_axe = new ItemColoredBattleaxe("black_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            red_battle_axe = new ItemColoredBattleaxe("red_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            green_battle_axe = new ItemColoredBattleaxe("green_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            brown_battle_axe = new ItemColoredBattleaxe("brown_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            blue_battle_axe = new ItemColoredBattleaxe("blue_battle_axe", ConfigPreInit.DYE_BATTLEAXE);

            purple_battle_axe = new ItemColoredBattleaxe("purple_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            cyan_battle_axe = new ItemColoredBattleaxe("cyan_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            lightgray_battle_axe = new ItemColoredBattleaxe("lightgray_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            gray_battle_axe = new ItemColoredBattleaxe("gray_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            pink_battle_axe = new ItemColoredBattleaxe("pink_battle_axe", ConfigPreInit.DYE_BATTLEAXE);

            lime_battle_axe = new ItemColoredBattleaxe("lime_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            yellow_battle_axe = new ItemColoredBattleaxe("yellow_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            lightblue_battle_axe = new ItemColoredBattleaxe("lightblue_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            magenta_battle_axe = new ItemColoredBattleaxe("magenta_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
            orange_battle_axe = new ItemColoredBattleaxe("orange_battle_axe", ConfigPreInit.DYE_BATTLEAXE);

            white_battle_axe = new ItemColoredBattleaxe("white_battle_axe", ConfigPreInit.DYE_BATTLEAXE);

            register(black_battle_axe);
            register(red_battle_axe);
            register(green_battle_axe);
            register(brown_battle_axe);
            register(blue_battle_axe);
            register(purple_battle_axe);
            register(cyan_battle_axe);
            register(lightgray_battle_axe);
            register(gray_battle_axe);
            register(pink_battle_axe);
            register(lime_battle_axe);
            register(yellow_battle_axe);
            register(lightblue_battle_axe);
            register(magenta_battle_axe);
            register(orange_battle_axe);
            register(white_battle_axe);

        }
    }

    public static void register(Item item) {
        GameRegistry.register(item);
    }

    public static void registerRenders() {

        registerRender(black_battle_axe);
        registerRender(red_battle_axe);
        registerRender(green_battle_axe);
        registerRender(brown_battle_axe);
        registerRender(blue_battle_axe);
        registerRender(purple_battle_axe);
        registerRender(cyan_battle_axe);
        registerRender(lightgray_battle_axe);
        registerRender(gray_battle_axe);
        registerRender(pink_battle_axe);
        registerRender(lime_battle_axe);
        registerRender(yellow_battle_axe);
        registerRender(lightblue_battle_axe);
        registerRender(magenta_battle_axe);
        registerRender(orange_battle_axe);
        registerRender(white_battle_axe);

    }

    private static void registerRender(Item item) {
        ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
    }
}
