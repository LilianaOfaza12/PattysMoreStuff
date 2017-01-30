package com.stc.pattysmorestuff.gui.pages;

import com.stc.pattysmorestuff.gui.GuiInfoBook;
import com.stc.pattysmorestuff.random.init.ModRandomItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by StuffTheChicken on 13/01/2017.
 */
public abstract class BookPage {

    public String type;

    protected int spacing = 30;

    public BookPage(String type)
    {
        this.type = type;
    }

    public void init(List<GuiButton> buttonList) {}

    public abstract void draw(GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks);

    public abstract void drawOverlay(Minecraft mc, GuiInfoBook gui, int x, int y, int mouseX, int mouseY, float partialTicks);

    public void onShown() {}

    public void onClose() {}

    public void handleButtonClick(GuiButton button) {};

    public abstract String getTitle();

    public boolean shouldDrawTitle()
    {
        return true;
    }

    public String fixName(String name)
    {
        if (name.length() > 18)
        {
            name = name.substring(0, 18) + "...";
        }
        return name;
    }

    private ItemStack drink = new ItemStack(ModRandomItems.inf_water_bucket);

    public ItemStack getDrink(String name, int red, int green, int blue)
    {
        drink.setStackDisplayName(name);
        drink.getTagCompound().setIntArray("Colour", new int[] { red, green, blue });
        return drink;
    }

    public void drawToolTip(GuiInfoBook gui, Minecraft mc, int x, int y, int mouseX, int mouseY, ItemStack stack)
    {
        if (gui.isMouseWithin(x, y, 16, 16, mouseX, mouseY))
        {
            gui.renderToolTip(stack, mouseX, mouseY);
        }
    }
}
