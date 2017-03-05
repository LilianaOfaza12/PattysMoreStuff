package com.stc.pattysmorestuff.proxy;

import com.stc.pattysmorestuff.blocks.init.ModExtraBlocks;
import com.stc.pattysmorestuff.handlers.EnumHandler;
import com.stc.pattysmorestuff.lib.ConfigPreInit;
import com.stc.pattysmorestuff.items.init.ModPMS;
import com.stc.pattysmorestuff.armor.init.ModArmor;
import com.stc.pattysmorestuff.armor.init.ModDyeArmor;
import com.stc.pattysmorestuff.blocks.init.ModBlocks;
import com.stc.pattysmorestuff.food.init.ModFood;
import com.stc.pattysmorestuff.furnaces.init.ModFurnaces;
import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.random.init.ModRandomItems;
import com.stc.pattysmorestuff.tileentity.TileEntityJar;
import com.stc.pattysmorestuff.tileentity.render.RendererJar;
import com.stc.pattysmorestuff.tools.init.ModDyeToolBattleaxe;
import com.stc.pattysmorestuff.tools.init.ModDyeTools;
import com.stc.pattysmorestuff.tools.init.ModToolDyePaxels;
import com.stc.pattysmorestuff.tools.init.ModTools;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;

/**
 * Created by StuffTheChicken on 10/11/2016.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenders() {

        //Blocks
        if(ConfigPreInit.disableBlocks) {
            ModBlocks.registerRenders();
        }
        ModExtraBlocks.registerRenders();
        ModFurnaces.registerRenders();
        ModPMS.registerRenders();

        //Tools
        if(ConfigPreInit.disableTools) {
            ModTools.registerRenders();
            ModDyeTools.registerRenders();
            ModToolDyePaxels.registerRenders();
            ModDyeToolBattleaxe.registerRenders();
        }
        //Armor
        if(ConfigPreInit.disableArmor) {

            ModArmor.registerRender();
            ModDyeArmor.registerRender();
        }
        if(ConfigPreInit.disableFood) {
            ModFood.registerRenders();
        }
        if(ConfigPreInit.disableMiscItems) {

            ModRandomItems.registerRenders();
        }

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJar.class, new RendererJar());
    }

    @Override
    public boolean isSinglePlayer()
    {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer()
    {
        return false;
    }

    @Override
    public void registerModelBakeryStuff() {
        ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.dye_ore), new ResourceLocation(Strings.MODID, "dye_ore"), new ResourceLocation(Strings.MODID, "dye_ore_nether"), new ResourceLocation(Strings.MODID, "dye_ore_end"));
        for (int i = 0; i < EnumHandler.BlockType.values().length; i++) {

            ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.dye_block), new ResourceLocation(Strings.MODID, "dye_block_" +  EnumHandler.BlockType.values()[i].getName()));

        }

        for (int i = 0; i < EnumHandler.BrickType.values().length; i++) {

            ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.stonebrick), new ResourceLocation(Strings.MODID, "stonebrick_" +  EnumHandler.BrickType.values()[i].getName()));

        }
    }
}
