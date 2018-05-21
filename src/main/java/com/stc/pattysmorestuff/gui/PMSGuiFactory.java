package com.stc.pattysmorestuff.gui;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;
import java.util.Set;

public class PMSGuiFactory implements IModGuiFactory {

    public static class PMSGuiConfig extends GuiConfig {

        public PMSGuiConfig(GuiScreen parent) {
            super(
                    parent,
                    new ConfigElement(PattysMoreStuff.Config.getCategory("pattysmorestuff")).getChildElements(),
                    Strings.MODID, false, true, GuiConfig.getAbridgedConfigPath(PattysMoreStuff.Config.toString())
            );
        }
    }

    @Override
    public void initialize(Minecraft minecraftInstance) {
    }


    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    // TODO clean these 2 methods up when we switch to 1.12 MDK
    public boolean hasConfigGui() {
        return true;
    }

    public GuiScreen createConfigGui(GuiScreen parentScreen) {
        return new PMSGuiConfig(parentScreen);
    }
}
