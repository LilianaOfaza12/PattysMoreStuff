package com.stc.pattysmorestuff.handlers;

import java.util.Random;

import com.stc.pattysmorestuff.items.init.ModPMS;
import net.minecraft.block.BlockEventData;
import net.minecraft.client.renderer.ChestRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by StuffTheChicken on 13/01/2017.
 */
public class PlayerEventHandler {

    /*public static final String TAG_PLAYER_HAS_BOOK = Util.prefix("spawned_book");

    @SubscribeEvent
    public void onPlayerLogin(PlayerLoggedInEvent e) {
        if (ConfigPreInit.canDisplay) {
            if (!e.player.world.isRemote) {
                if (!ConfigPreInit.hasDisplayedOnce) {
                    TextComponentString prefix = new TextComponentString(TextFormatting.GOLD + "Thank you for downloading \u00A72PattysMoreStuff");
                    prefix.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString("\u00A7cYou can disable this login message in the config")));
                    e.player.sendMessage(prefix);
                }
            }
        }
        if (PattysMoreStuff.spawnWithBook) {
            NBTTagCompound playerData = e.player.getEntityData();
            NBTTagCompound data = TagUtil.getTagSafe(playerData, EntityPlayer.PERSISTED_NBT_TAG);

            if (!data.getBoolean(TAG_PLAYER_HAS_BOOK)) {
                ItemHandlerHelper.giveItemToPlayer(e.player, new ItemStack(ModPMS.info_book));
                data.setBoolean(TAG_PLAYER_HAS_BOOK, true);
                playerData.setTag(EntityPlayer.PERSISTED_NBT_TAG, data);
            }
        }
    }*/
    public static double rand;
    public Random r = new Random();

    @SubscribeEvent
    public void onDrop(LivingDropsEvent event) {
        if(event.getEntity() instanceof EntityBat) {
            event.getDrops().clear();

            ItemStack stack = new ItemStack(ModPMS.bat_wings);
            EntityItem drop = new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

            event.getDrops().add(drop);
        }
    }
}