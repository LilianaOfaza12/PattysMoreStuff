package com.stc.pattysmorestuff.handlers;

import com.stc.pattysmorestuff.ConfigPreInit;
import com.stc.pattysmorestuff.ModPMS;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static sun.audio.AudioPlayer.player;

/**
 * Created by patrick on 13/01/2017.
 */
public class PlayerEvent {

    private final String PREFIX = "-> ";

    @SubscribeEvent
    public void onPlayerLogin(PlayerLoggedInEvent e) {
        EntityPlayer player = (EntityPlayer) e.player;
        if (ConfigPreInit.canDisplay) {
            if (!player.world.isRemote) {
                if (!ConfigPreInit.hasDisplayedOnce) {
                    TextComponentString prefix = new TextComponentString(TextFormatting.GOLD   + "Thank you for downloading \u00A72PattysMoreStuff");
                    prefix.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TextComponentString("\u00A7cYou can disable this login message in the config")));
                    player.sendMessage(prefix);
                }
            }
        }
    }
}