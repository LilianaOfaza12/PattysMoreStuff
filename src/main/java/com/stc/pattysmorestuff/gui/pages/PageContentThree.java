package com.stc.pattysmorestuff.gui.pages;

import com.stc.pattysmorestuff.gui.GuiInfoBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.util.List;

/**
 * Created by StuffTheChicken on 15/01/2017.
 */
public class PageContentThree extends BookPage
{

    private GuiInfoBook book;

    public PageContentThree(GuiInfoBook book)
    {
        super("contents");
        this.book = book;
    }

    @Override
    public void init(List<GuiButton> buttonList)
    {
        int leftPageCenter = (book.width) / 2 - (book.bookWidth / 2);

    }

    @Override
    public void draw(GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks)
    {
        int leftPageCenter = (book.width) / 2 - (book.bookWidth / 2);
        FontRenderer fontRendererObj = Minecraft.getMinecraft().fontRendererObj;


        int rightPageCenter = (book.width) / 2 + (book.bookWidth / 2);

    }

    @Override
    public void handleButtonClick(GuiButton button)
    {
    }

    @Override
    public void drawOverlay(Minecraft mc, GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks)
    {

    }

    @Override
    public void onShown()
    {

    }

    @Override
    public void onClose()
    {
    }

    @Override
    public String getTitle()
    {
        return "Contents";
    }
}
