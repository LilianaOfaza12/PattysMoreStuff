package com.stc.pattysmorestuff.gui.pages;

import com.stc.pattysmorestuff.gui.GuiInfoBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.util.List;

/**
 * Created by StuffTheChicken on 13/01/2017.
 */
public class PageContentOne extends BookPage
{

    private GuiInfoBook book;


    public PageContentOne(GuiInfoBook book)
    {
        super("contents");
        this.book = book;
    }

    @Override
    public void init(List<GuiButton> buttonList)
    {

    }

    @Override
    public void draw(GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks)
    {
        int leftPageCenter = (book.width) / 2 - (book.bookWidth / 2);
        FontRenderer fontRendererObj = Minecraft.getMinecraft().fontRendererObj;
        fontRendererObj.drawString("Tool Types: ", leftPageCenter - 55, 45, 0x667F33);
        fontRendererObj.drawString("NetherStar, Emerald,", leftPageCenter - 55, 45 + (1 * 10), 0x000000);
        fontRendererObj.drawString("Obsidian, Quartz,", leftPageCenter - 55, 45 + (2 * 10), 0x000000);
        fontRendererObj.drawString("Glowstone, Redstone,", leftPageCenter - 55, 45 + (3 * 10), 0x000000);
        fontRendererObj.drawString("Slime, Ender, Flint,", leftPageCenter - 55, 45 + (4 * 10), 0x000000);
        fontRendererObj.drawString("NetherBrick, Brick,", leftPageCenter - 55, 45 + (5 * 10), 0x000000);
        fontRendererObj.drawString("SoulSand, Clay,", leftPageCenter - 55, 45 + (6 * 10), 0x000000);
        fontRendererObj.drawString("RedNetherBrick, Snow,", leftPageCenter - 55, 45 + (7 * 10), 0x000000);
        fontRendererObj.drawString("Redstone, Leather,", leftPageCenter - 55, 45 + (8 * 10), 0x000000);
        fontRendererObj.drawString("Sandstone, Dye,", leftPageCenter - 55, 45 + (9 * 10), 0x000000);
        fontRendererObj.drawString("MagmaCream, Gunpowder.", leftPageCenter - 55, 45 + (10 * 10), 0x000000);

        int rightPageCenter = (book.width) / 2 + (book.bookWidth / 2);
        fontRendererObj.drawString("Items:", rightPageCenter - 55, 45, 0x667F33);
        fontRendererObj.drawString("Infinite Water Bucket", rightPageCenter - 55, 45 + (1 * 10), 0x000000);
        fontRendererObj.drawString("Obsidian Ingot", rightPageCenter - 55, 45 + (2 * 10), 0x000000);
        fontRendererObj.drawString("Time Wand", rightPageCenter - 55, 45 + (3 * 10), 0x000000);
        fontRendererObj.drawString("Information Book", rightPageCenter - 55, 45 + (4 * 10), 0x000000);
        fontRendererObj.drawString("Furnaces:,", rightPageCenter - 55, 45 + (5 * 10), 0x667F33);
        fontRendererObj.drawString("Iron,", rightPageCenter - 55, 45 + (6 * 10), 0x000000);
        fontRendererObj.drawString("Gold,", rightPageCenter - 55, 45 + (7 * 10), 0x000000);
        fontRendererObj.drawString("Diamond.", rightPageCenter - 55, 45 + (8 * 10), 0x000000);
        fontRendererObj.drawString("Emerald", rightPageCenter - 55, 45 + (9 * 10), 0x000000);
        fontRendererObj.drawString("", rightPageCenter - 55, 45 + (10 * 10), 0x000000);


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
