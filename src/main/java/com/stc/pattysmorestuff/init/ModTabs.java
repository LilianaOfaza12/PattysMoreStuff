package com.stc.pattysmorestuff.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by patrick on 20/07/2017.
 */
public class ModTabs {

    public static CreativeTabs tabPattysBlocks;
    public static CreativeTabs tabPattysTools;
    public static CreativeTabs tabPattysPaxels;
    public static CreativeTabs tabPattysBattleaxe;
    public static CreativeTabs tabPattysArmor;
    public static CreativeTabs tabPattysFood;
    public static CreativeTabs tabPattysMisc;
    public static CreativeTabs tabPattysDecoration;

    public static void registerTabs () {


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

        tabPattysMisc = new CreativeTabs(CreativeTabs.getNextID(), "Misc") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ModItems.obsidian_ingot);
            }

            @Override
            public String getTranslatedTabLabel() {
                return "Pattys Misc";
            }
        };

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
}
