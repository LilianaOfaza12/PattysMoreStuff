package com.stc.pattysmorestuff.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;

import java.io.IOException;

/**
 * Created by StuffTheChicken on 02/08/2017.
 */
public class GuiWeatherWand extends GuiScreen {

    protected String title = "Weather Wand Options";

    GuiButton weather;
    GuiButton exit;

    @Override
    public void initGui() {
        this.title = I18n.format("Weather Wand Options", new Object[0]);
        buttonList.clear();
        buttonList.add(exit = new GuiButton(0, this.width / 2 - 100, this.height / 6 + 18, I18n.format("menu.returnToGame", new Object[0])));
        buttonList.add(weather = new GuiButton(1, this.width / 2 - 100, this.height / 6 + 48 - 6, 95, 20, I18n.format("Weather", new Object[0])));
        super.initGui();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.enabled) {
            if (button.id == 0) {
                this.mc.displayGuiScreen((GuiScreen) null);
                this.mc.setIngameFocus();
            }
            if (button.id == 1) {
                this.mc.displayGuiScreen(new GuiWeather());
            }
        }
    }

    @Override
    public void drawScreen(int x, int y, float partialTicks) {
        //Mouse.setGrabbed(false);
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, this.title, this.width / 2, 15, 16777215);
        super.drawScreen(x, y, partialTicks);
    }
}
