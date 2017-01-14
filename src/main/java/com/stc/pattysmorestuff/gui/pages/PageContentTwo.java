package com.stc.pattysmorestuff.gui.pages;

import com.stc.pattysmorestuff.gui.GuiInfoBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.util.List;

/**
 * Created by patrick on 13/01/2017.
 */
public class PageContentTwo extends BookPage
{

    private GuiInfoBook book;

    public PageContentTwo(GuiInfoBook book)
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
        fontRendererObj.drawString("Blocks: ", leftPageCenter - 55, 45, 0x667F33);
        fontRendererObj.drawString("Dye Blocks,", leftPageCenter - 55, 45 + (1 * 10), 0x000000);
        fontRendererObj.drawString("Dye stairs,", leftPageCenter - 55, 45 + (2 * 10), 0x000000);
        fontRendererObj.drawString("Dye stonebricks,", leftPageCenter - 55, 45 + (3 * 10), 0x000000);
        fontRendererObj.drawString("Dye stonebrick stairs,", leftPageCenter - 55, 45 + (4 * 10), 0x000000);
        fontRendererObj.drawString("Wood Plank Bricks", leftPageCenter - 55, 45 + (5 * 10), 0x000000);
        fontRendererObj.drawString("Colored Cookie Jars", leftPageCenter - 55, 45 + (6 * 10), 0x000000);
        fontRendererObj.drawString("Oak, Spruce Crate", leftPageCenter - 55, 45 + (7 * 10), 0x000000);
        fontRendererObj.drawString("Birch, Jungle Crate", leftPageCenter - 55, 45 + (8 * 10), 0x000000);
        fontRendererObj.drawString("Acacia, Dark Oak Crate", leftPageCenter - 55, 45 + (9 * 10), 0x000000);
        fontRendererObj.drawString("", leftPageCenter - 55, 45 + (10 * 10), 0x000000);

        int rightPageCenter = (book.width) / 2 + (book.bookWidth / 2);
        fontRendererObj.drawString("Food:", rightPageCenter - 55, 45, 0x667F33);
        fontRendererObj.drawString("Fried Egg", rightPageCenter - 55, 45 + (1 * 10), 0x000000);
        fontRendererObj.drawString("Raw Bacon", rightPageCenter - 55, 45 + (2 * 10), 0x000000);
        fontRendererObj.drawString("Cooked Bacon", rightPageCenter - 55, 45 + (3 * 10), 0x000000);
        fontRendererObj.drawString("Baguette", rightPageCenter - 55, 45 + (4 * 10), 0x000000);
        fontRendererObj.drawString("Egg Baguette", rightPageCenter - 55, 45 + (5 * 10), 0x000000);
        fontRendererObj.drawString("Bacon Baguette", rightPageCenter - 55, 45 + (6 * 10), 0x000000);
        fontRendererObj.drawString("Egg & Bacon Baguette", rightPageCenter - 55, 45 + (7 * 10), 0x000000);
        fontRendererObj.drawString("Iron Apple", rightPageCenter - 55, 45 + (8 * 10), 0x000000);
        fontRendererObj.drawString("Diamond Apple", rightPageCenter - 55, 45 + (9 * 10), 0x000000);
        fontRendererObj.drawString("Emerald Apple", rightPageCenter - 55, 45 + (10 * 10), 0x000000);    }

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
