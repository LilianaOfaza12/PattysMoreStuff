package com.stc.pattysmorestuff.tabs;

import com.stc.pattysmorestuff.armor.init.ModArmor;
import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import com.stc.pattysmorestuff.food.init.ModFood;
import com.stc.pattysmorestuff.items.init.ModPMS;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.random.init.ModRandomItems;
import com.stc.pattysmorestuff.tools.init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

/**
 * Created by StuffTheChicken on 11/11/2016.
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
    public static CreativeTabs tabPattysBaubles;



    public static void registerTabs () {

        if(ConfigPreInit.disableBlocks) {

            tabPattysBlocks = new CreativeTabs(CreativeTabs.getNextID(), "Blocks") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(Item.getItemFromBlock(ModBlocks.stonebrick), 1, 5);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Blocks";
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
        if (ConfigPreInit.disableTools) {
            tabPattysTools = new CreativeTabs(CreativeTabs.getNextID(), "Tools") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModTools.nstar_pickaxe);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Tools";
                }
            };

            tabPattysPaxels = new CreativeTabs(CreativeTabs.getNextID(), "Paxels") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModTools.blaze_paxel);
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

        }
        if (ConfigPreInit.disableFood) {

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

        if (ConfigPreInit.disableMiscItems) {

            tabPattysMisc = new CreativeTabs(CreativeTabs.getNextID(), "Misc") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModRandomItems.inf_water_bucket);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Misc";
                }
            };
        }

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

        if(Loader.isModLoaded("baubles")) {

            tabPattysBaubles = new CreativeTabs(CreativeTabs.getNextID(), "Baubles") {
                @Override
                public ItemStack getTabIconItem() {
                    return new ItemStack(ModPMS.ring_of_flight);
                }

                @Override
                public String getTranslatedTabLabel() {
                    return "Pattys Baubles";
                }
            };
        }
    }
}
