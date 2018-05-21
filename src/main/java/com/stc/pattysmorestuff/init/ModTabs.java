package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ModTabs {

    public static CreativeTabs tabPattysBlocks;
    public static CreativeTabs tabPattysStairs;
    public static CreativeTabs tabPattysTools;
    public static CreativeTabs tabPattysPaxels;
    public static CreativeTabs tabPattysBattleaxe;
    public static CreativeTabs tabPattysBows;
    public static CreativeTabs tabPattysArmor;
    public static CreativeTabs tabPattysFood;
    public static CreativeTabs tabPattysMisc;
    public static CreativeTabs tabPattysDecoration;
    public static CreativeTabs tabPattysButtons;


    public static void registerTabs () {

        if(ConfigPreInit.disableBlocks) {

            tabPattysBlocks = new CreativeTabs(CreativeTabs.getNextID(), "Blocks") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(Item.getItemFromBlock(ModBlocks.reinforced_obsidian));
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Blocks";
                }
            };

            tabPattysStairs = new CreativeTabs(CreativeTabs.getNextID(), "Pattys Stairs") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(Item.getItemFromBlock(ModColoredBlocks.stonebrick_black_stairs));
                }

                @Override
                public String getTranslatedTabLabel() {

                    return "Pattys Stairs";
                }
            };
        }
        if(ConfigPreInit.disableArmor) {

            tabPattysArmor = new CreativeTabs(CreativeTabs.getNextID(), "Armor") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModArmor.emerald_helmet);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Armor";
                }
            };
        }
        if(ConfigPreInit.disableTools) {

            tabPattysTools = new CreativeTabs(CreativeTabs.getNextID(), "Tools") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModTools.nstar_axe);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Tools";
                }
            };
        }
        if(ConfigPreInit.disableTools) {

            tabPattysPaxels = new CreativeTabs(CreativeTabs.getNextID(), "Paxels") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModTools.obsidian_paxel);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Paxels";
                }
            };
        }
        if(ConfigPreInit.disableTools) {

            tabPattysBattleaxe = new CreativeTabs(CreativeTabs.getNextID(), "Battleaxe") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModTools.ender_battle_axe);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Battleaxes";
                }
            };
        }

        if(ConfigPreInit.disableTools) {

            tabPattysBows = new CreativeTabs(CreativeTabs.getNextID(), "Bows") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModTools.coal_bow);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Bows";
                }
            };
        }

        if(ConfigPreInit.disableFood) {

            tabPattysFood = new CreativeTabs(CreativeTabs.getNextID(), "Food") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModFood.fried_egg);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Food";
                }
            };
        }


            tabPattysMisc = new CreativeTabs(CreativeTabs.getNextID(), "Misc") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModMiscItem.obsidian_ingot);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Misc";
                }
            };

        if(ConfigPreInit.disableBlocks) {

            tabPattysDecoration = new CreativeTabs(CreativeTabs.getNextID(), "Decoration") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(Item.getItemFromBlock(ModBlocks.cookie_jar_white));
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Decoration";
                }
            };
        }
        if(ConfigPreInit.disableBlocks) {

            tabPattysButtons = new CreativeTabs(CreativeTabs.getNextID(), "Buttons") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(Item.getItemFromBlock(ModButtons.white_button));
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Buttons";
                }
            };
        }
    }
}
