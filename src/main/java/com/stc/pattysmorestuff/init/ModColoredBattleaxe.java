package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.tools.ItemColoredBattleaxe;
import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModColoredBattleaxe {

    public static Item black_battle_axe = new ItemColoredBattleaxe("black_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item red_battle_axe = new ItemColoredBattleaxe("red_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item green_battle_axe = new ItemColoredBattleaxe("green_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item brown_battle_axe = new ItemColoredBattleaxe("brown_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item blue_battle_axe = new ItemColoredBattleaxe("blue_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item purple_battle_axe = new ItemColoredBattleaxe("purple_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item cyan_battle_axe = new ItemColoredBattleaxe("cyan_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item lightgray_battle_axe = new ItemColoredBattleaxe("lightgray_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item gray_battle_axe = new ItemColoredBattleaxe("gray_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item pink_battle_axe = new ItemColoredBattleaxe("pink_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item lime_battle_axe = new ItemColoredBattleaxe("lime_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item yellow_battle_axe = new ItemColoredBattleaxe("yellow_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item lightblue_battle_axe = new ItemColoredBattleaxe("lightblue_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item magenta_battle_axe = new ItemColoredBattleaxe("magenta_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item orange_battle_axe = new ItemColoredBattleaxe("orange_battle_axe", ConfigPreInit.DYE_BATTLEAXE);
    public static Item white_battle_axe = new ItemColoredBattleaxe("white_battle_axe", ConfigPreInit.DYE_BATTLEAXE);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                black_battle_axe, red_battle_axe, green_battle_axe, brown_battle_axe, blue_battle_axe, purple_battle_axe, cyan_battle_axe, lightgray_battle_axe,
                gray_battle_axe, pink_battle_axe, lime_battle_axe, yellow_battle_axe, lightblue_battle_axe, magenta_battle_axe, orange_battle_axe, white_battle_axe


        );
    }

    public static void registerModels() {

        registerItemRender(black_battle_axe);
        registerItemRender(red_battle_axe);
        registerItemRender(green_battle_axe);
        registerItemRender(brown_battle_axe);
        registerItemRender(blue_battle_axe);
        registerItemRender(purple_battle_axe);
        registerItemRender(cyan_battle_axe);
        registerItemRender(lightgray_battle_axe);
        registerItemRender(gray_battle_axe);
        registerItemRender(pink_battle_axe);
        registerItemRender(lime_battle_axe);
        registerItemRender(yellow_battle_axe);
        registerItemRender(lightblue_battle_axe);
        registerItemRender(magenta_battle_axe);
        registerItemRender(orange_battle_axe);
        registerItemRender(white_battle_axe);
    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
