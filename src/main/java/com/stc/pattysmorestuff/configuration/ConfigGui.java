package com.stc.pattysmorestuff.configuration;

import com.stc.pattysmorestuff.PattysMoreStuff;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * Created by StuffTheChicken on 20/07/2017.
 */
public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen screen) {
        super(screen, (new ConfigElement(PattysMoreStuff.Config.getCategory("general"))).getChildElements(), Strings.MODID, false, false, GuiConfig.getAbridgedConfigPath(PattysMoreStuff.Config.toString()));
    }
}
