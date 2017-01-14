package com.stc.pattysmorestuff.gui;

import com.stc.pattysmorestuff.gui.pages.PageContentOne;
import com.stc.pattysmorestuff.gui.pages.PageContentTwo;
import com.stc.pattysmorestuff.gui.pages.PageTitle;
import com.stc.pattysmorestuff.gui.pages.BookPage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.List;

/**
 * Created by patrick on 13/01/2017.
 */
public class GuiInfoBook extends GuiScreen {

    private static final ResourceLocation page_1 = new ResourceLocation("pattysmorestuff:textures/gui/recipebook_1.png");
    private static final ResourceLocation page_2 = new ResourceLocation("pattysmorestuff:textures/gui/recipebook_2.png");

    public int bookWidth = 146;
    public int bookHeight = 180;

    private int xSize = bookWidth * 2;

    private NextPageButton buttonNextPage;
    private NextPageButton buttonPreviousPage;
    private GuiButton buttonContents;

    private HashMap<Integer, BookPage> pages = new HashMap<Integer, BookPage>();
    private int pageCount = 0;
    private int pageNum = 0;
    private int progress = 0;

    public GuiInfoBook()
    {
        compilePages();
    }

    public void compilePages()
    {
        PageTitle titlePage = new PageTitle(this);
        pages.put(pageCount++, titlePage);

        PageContentOne contentsPageOne = new PageContentOne(this);
        pages.put(pageCount++, contentsPageOne);

        PageContentTwo contentsPageTwo = new PageContentTwo(this);
        pages.put(pageCount, contentsPageTwo);

    }

    public void initGui()
    {
        Keyboard.enableRepeatEvents(true);

        int i = (this.width - 18) / 2;
        this.buttonNextPage = new NextPageButton(1, i + 110, 160, true);
        this.buttonPreviousPage = new NextPageButton(2, i - 110, 160, false);
        this.buttonContents = new GuiButton(14, i - 60, 152, 50, 20, "Contents");

        this.buttonList.add(buttonNextPage);
        this.buttonList.add(buttonPreviousPage);
        this.buttonList.add(buttonContents);

        for(BookPage page : pages.values())
        {
            page.init(buttonList);
        }

        updateButtons();
    }

    public void updateButtons()
    {
        if (pageNum == 0)
        {
            this.buttonPreviousPage.visible = false;
            this.buttonContents.visible = false;
        }
        else
        {
            this.buttonPreviousPage.visible = true;
            if (pageNum == pages.size() - 1)
            {
                this.buttonNextPage.visible = false;
            }
            else
            {
                this.buttonNextPage.visible = true;
            }
            if(pageNum >= 3)
            {
                this.buttonContents.visible = true;
            }
            else
            {
                this.buttonContents.visible = false;
            }
        }
    }

    protected void actionPerformed(GuiButton button)
    {
        pages.get(pageNum).onClose();

        if(button == buttonNextPage)
        {
            pageNum++;
            if (pageNum > pages.size() - 1)
            {
                pageNum = pages.size() - 1;
            }
        }
        else if(button == buttonPreviousPage)
        {
            pageNum--;
            if (pageNum < 0)
            {
                pageNum = 0;
            }
        }
        else if(button == buttonContents)
        {
            gotoPage("contents");
        }
        else
        {
            for(BookPage page : pages.values())
            {
                page.handleButtonClick(button);
            }
        }
        pages.get(pageNum).onShown();
        this.updateButtons();
    }

    @Override
    public void onGuiClosed()
    {
        Keyboard.enableRepeatEvents(false);
        this.pages = null;
    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();
        progress++;
        if (progress >= 160)
        {
            progress = 0;
        }
    }

    @Override
    public void drawScreen(int par1, int par2, float par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int k = (this.width - this.bookWidth) / 2;

        this.mc.getTextureManager().bindTexture(page_1);
        this.drawTexturedModalRect(k - bookWidth / 2, 5, 0, 0, bookWidth, bookHeight);

        this.mc.getTextureManager().bindTexture(page_2);
        this.drawTexturedModalRect(k + bookWidth / 2, 5, 0, 0, bookWidth, bookHeight);

        if (pageNum == 0)
        {
            this.mc.getTextureManager().bindTexture(page_1);
            this.drawTexturedModalRect((this.width / 2) - (this.bookWidth / 2) - (93 / 2), 50, 146, 0, 93, 25);
            this.drawTexturedModalRect((this.width / 2) - (this.bookWidth / 2) - (66 / 2), 75, 146, 25, 66, 22);
        }

        super.drawScreen(par1, par2, par3);

        this.updatePage(par1, par2, par3);
    }

    public void updatePage(int mouseX, int mouseY, float partialTicks)
    {
        int k = this.width / 2;
        BookPage page = pages.get(pageNum);
        GL11.glPushMatrix();
        RenderHelper.enableGUIStandardItemLighting();
        if(page.shouldDrawTitle())
        {
            fontRendererObj.drawString(TextFormatting.BOLD + page.getTitle(), k - bookWidth + 20, 26, 228619, false);
            fontRendererObj.drawString(TextFormatting.BOLD + page.getTitle(), k + 20, 26, 228619, false);
        }
        page.draw(this, k - 130, 40, mouseX, mouseY, partialTicks);
        page.drawOverlay(mc, this, k - 130, 40, mouseX, mouseY, partialTicks);
        GL11.glPopMatrix();
    }

    public void gotoPage(String type)
    {
        for (int i = 0; i < pages.size(); i++)
        {
            if (pages.get(i) != null)
            {
                if (pages.get(i).type.equalsIgnoreCase(type))
                {
                    this.pageNum = i;
                    break;
                }
            }
        }
    }

    public void drawPlainArrow(int x, int y)
    {
        GL11.glPushMatrix();
        this.mc.getTextureManager().bindTexture(page_1);
        this.drawTexturedModalRect(x, y, 36, 180, 22, 15);
        GL11.glPopMatrix();
    }

    public void drawProgressArrow(int x, int y, float partialTicks)
    {
        GL11.glPushMatrix();
        this.mc.getTextureManager().bindTexture(page_1);
        this.drawTexturedModalRect(x, y, 36, 180, 22, 15);
        int percent = (int) (progress + partialTicks) * 22 / 160;
        this.drawTexturedModalRect(x, y, 58, 180, percent + 1, 16);
        GL11.glPopMatrix();
    }

    public void drawTag(int x, int y)
    {
        GL11.glPushMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(page_1);
        this.drawTexturedModalRect(x, y, 0, 200, 45, 18);
        GL11.glPopMatrix();
    }


    public RenderItem getItemRenderer()
    {
        return itemRender;
    }

    public FontRenderer getFontRenderer()
    {
        return fontRendererObj;
    }

    public boolean isMouseWithin(int posX, int posY, int width, int height, int mouseX, int mouseY)
    {
        return mouseX >= posX - 1 && mouseX < posX + width + 1 && mouseY >= posY - 1 && mouseY < posY + height + 1;
    }

    public void renderToolTip(ItemStack itemStack, int mouseX, int mouseY)
    {
        List list = itemStack.getTooltip(this.mc.player, this.mc.gameSettings.advancedItemTooltips);

        for (int k = 0; k < list.size(); ++k)
        {
            if (k == 0)
            {
                list.set(k, itemStack.getRarity().rarityColor + (String) list.get(k));
            }
            else
            {
                list.set(k, TextFormatting.GRAY + (String) list.get(k));
            }
        }

        FontRenderer font = itemStack.getItem().getFontRenderer(itemStack);
        drawHoveringText(list, mouseX, mouseY, (font == null ? fontRendererObj : font));
    }

    @SideOnly(Side.CLIENT)
    static class NextPageButton extends GuiButton
    {
        private final boolean rightButton;
        private static final String __OBFID = "CL_00000745";

        public NextPageButton(int id, int posX, int posY, boolean rightButton)
        {
            super(id, posX, posY, 18, 10, "");
            this.rightButton = rightButton;
        }

        /**
         * Draws this button to the screen.
         */
        public void drawButton(Minecraft mc, int mouseX, int mouseY)
        {
            if (this.visible)
            {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(GuiInfoBook.page_1);

                int u = 0;
                int v = 180;
                boolean flag = mouseX >= xPosition && mouseY >= yPosition && mouseX < xPosition + width && mouseY < yPosition + height;

                if (flag)
                {
                    u += width;
                }

                if (!this.rightButton)
                {
                    v += height;
                }

                this.drawTexturedModalRect(xPosition, yPosition, u, v, width, height);
            }
        }
    }
}
