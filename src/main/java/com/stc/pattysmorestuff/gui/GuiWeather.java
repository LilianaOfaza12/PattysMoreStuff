package com.stc.pattysmorestuff.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;

import java.io.IOException;

/**
 * Created by StuffTheChicken on 02/08/2017.
 */
public class GuiWeather extends GuiScreen {

    GuiButton rain;
    GuiButton thunder;
    GuiButton sun;


    GuiButton exit;


    @Override
    public void initGui() {

        buttonList.clear();


        buttonList.add(rain = new GuiButton(0, this.width / 2 - 100, this.height / 6 + 24 - 6, 95, 20, I18n.format("Rain", new Object[0])));
        buttonList.add(thunder = new GuiButton(1, this.width / 2 + 6, this.height / 6 + 24 - 6, 95, 20, I18n.format("Thunder", new Object[0])));
        buttonList.add(sun = new GuiButton(2, this.width / 2 - 100, this.height / 6 + 48 - 6, 95, 20, I18n.format("Clear", new Object[0])));

        buttonList.add(exit = new GuiButton(3, this.width / 2 - 100, this.height / 6 + 168, I18n.format("Return to Wand Options", new Object[0])));

        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        switch (button.id) {
            case 0:
                mc.player.sendChatMessage("/weather rain");
                break;
            case 1:
                mc.player.sendChatMessage("/weather thunder");
                break;
            case 2:
                mc.player.sendChatMessage("/weather clear");
                break;
            case 3:
                this.mc.displayGuiScreen(new GuiWeatherWand());
                break;
        }

        super.actionPerformed(button);
    }

    @Override
    public void drawScreen(int x, int y, float partialTicks) {

        this.drawDefaultBackground();
        super.drawScreen(x, y, partialTicks);
    }
}
