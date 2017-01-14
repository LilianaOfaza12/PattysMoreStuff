package com.stc.pattysmorestuff.gui.pages;

import com.stc.pattysmorestuff.gui.GuiInfoBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.TextFormatting;

/**
 * Created by patrick on 13/01/2017.
 */
public class PageTitle extends BookPage
{
    private GuiInfoBook book;

    public PageTitle(GuiInfoBook book)
    {
        super("title");
        this.book = book;
    }

    @Override
    public void draw(GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks)
    {
        int center = (book.width) / 2;
        FontRenderer fontRendererObj = Minecraft.getMinecraft().fontRendererObj;
        fontRendererObj.drawString("by StuffTheChicken", center - 112, 105, 228619);
        fontRendererObj.drawString(TextFormatting.UNDERLINE + "About", center + 55, 25, 228619);
        fontRendererObj.drawString("This book contains all", center + 18, 40, 0x667F33);
        fontRendererObj.drawString("the information about", center + 18, 50, 0x667F33);
        fontRendererObj.drawString("PattysMoreStuff. ", center + 18, 60, 0x667F33);
        fontRendererObj.drawString("It will help you", center + 18, 70, 0x667F33);
        fontRendererObj.drawString("discover all about,", center + 18, 80, 0x667F33);
        fontRendererObj.drawString("the mod.", center + 18, 90, 0x667F33);
    }

    @Override
    public void drawOverlay(Minecraft mc, GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks)
    {

    }

    @Override
    public String getTitle()
    {
        return "Information Book";
    }

    @Override
    public boolean shouldDrawTitle()
    {
        return false;
    }
}
