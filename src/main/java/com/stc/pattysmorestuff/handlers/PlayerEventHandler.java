package com.stc.pattysmorestuff.handlers;

import com.stc.pattysmorestuff.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;

import java.util.Set;

import static java.lang.Thread.dumpStack;
import static sun.audio.AudioPlayer.player;

/**
 * Created by patrick on 13/01/2017.
 */
public class PlayerEventHandler {

    public static final String TAG_PLAYER_HAS_BOOK = Util.prefix("spawned_book");

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
        if(PattysMoreStuff.spawnWithBook) {
            NBTTagCompound playerData = e.player.getEntityData();
            NBTTagCompound data = TagUtil.getTagSafe(playerData, EntityPlayer.PERSISTED_NBT_TAG);

            if(!data.getBoolean(TAG_PLAYER_HAS_BOOK)) {
                ItemHandlerHelper.giveItemToPlayer(e.player, new ItemStack(ModPMS.info_book));
                data.setBoolean(TAG_PLAYER_HAS_BOOK, true);
                playerData.setTag(EntityPlayer.PERSISTED_NBT_TAG, data);
            }
        }
    }
}