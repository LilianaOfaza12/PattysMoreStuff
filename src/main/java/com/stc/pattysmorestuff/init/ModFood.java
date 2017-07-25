package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.items.ItemAppleIron;
import com.stc.pattysmorestuff.items.ItemCustomFood;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by patrick on 21/07/2017.
 */
public class ModFood {


    public static Item fried_egg = new ItemCustomFood("fried_egg", 4, 0.4F,false);
    public static Item bacon_raw = new ItemCustomFood("bacon_raw", 3, 0.3F,true);
    public static Item bacon_cooked = new ItemCustomFood("bacon_cooked", 7, 0.7F,true);
    public static Item sausage_raw = new ItemCustomFood("sausage_raw", 3, 0.3F,true);
    public static Item sausage_cooked = new ItemCustomFood("sausage_cooked", 7, 0.7F,true);
    public static Item baguette_roll = new ItemCustomFood("baguette_roll", 5, 0.7F, false);
    public static Item baguette_bacon = new ItemCustomFood("baguette_bacon", 8, 0.8F, false);
    public static Item baguette_egg = new ItemCustomFood("baguette_egg", 6, 0.7F, false);
    public static Item baguette_eggbacon = new ItemCustomFood("baguette_eggbacon", 9, 1.0F, false);
    public static Item baguette_sausage = new ItemCustomFood("baguette_sausage", 8, 0.8F, false);
    public static Item baguette_baconsausage = new ItemCustomFood("baguette_baconsausage", 8, 0.8F, false);
    public static Item baguette_eggsausage = new ItemCustomFood("baguette_eggsausage", 6, 0.7F, false);
    public static Item baguette_eggbaconsausage = new ItemCustomFood("baguette_eggbaconsausage", 9, 1.0F, false);
    public static Item apple_pie = new ItemCustomFood("apple_pie", 8, 0.3F, false);


    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
            fried_egg, bacon_raw, bacon_cooked, sausage_raw, sausage_cooked, baguette_roll, baguette_bacon,
            baguette_egg, baguette_eggbacon, baguette_sausage, baguette_baconsausage, baguette_eggsausage,
                baguette_eggbaconsausage, apple_pie
        );
    }

    public static void registerModels() {


            registerItemRender(fried_egg);
            registerItemRender(bacon_raw);
            registerItemRender(bacon_cooked);
            registerItemRender(sausage_raw);
            registerItemRender(sausage_cooked);
            registerItemRender(baguette_roll);
            registerItemRender(baguette_bacon);
            registerItemRender(baguette_egg);
            registerItemRender(baguette_eggbacon);
            registerItemRender(baguette_sausage);
            registerItemRender(baguette_baconsausage);
            registerItemRender(baguette_eggsausage);
            registerItemRender(baguette_eggbaconsausage);
            registerItemRender(apple_pie);


    }

    public static void registerItemRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerItemRender(Item item, int meta) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
