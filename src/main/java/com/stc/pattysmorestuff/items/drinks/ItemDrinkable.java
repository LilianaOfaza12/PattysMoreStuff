package com.stc.pattysmorestuff.items.drinks;

import com.stc.pattysmorestuff.init.ModFood;
import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by patrick on 02/08/2017.
 */
public class ItemDrinkable extends ItemFood {

    public final float saturation;

    public ItemDrinkable(String name, int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        setMaxStackSize(16);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        setCreativeTab(ModTabs.tabPattysFood);

        this.saturation = saturation;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {

        if(stack.getItem() == ModFood.carrot_juice) {
            tooltip.add("\u00A7cRight click a carrot on the blender to obtain this juice");
        }
        if(stack.getItem() == ModFood.melon_juice) {
            tooltip.add("\u00A7cRight click a melon on the blender to obtain this juice");
        }
        if(stack.getItem() == ModFood.beetroot_juice) {
            tooltip.add("\u00A7cRight click a beetroot on the blender to obtain this juice");
        }
        if(stack.getItem() == ModFood.pumpkin_juice) {
            tooltip.add("\u00A7cRight click a pumpkin on the blender to obtain this juice");
        }
        if(stack.getItem() == ModFood.apple_juice) {
            tooltip.add("\u00A7cRight click a apple on the blender to obtain this juice");
        }

    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    public ItemDrinkable addDefaultSpeedPotionEffect() {
        setAlwaysEdible();

        final Potion potion = Potion.getPotionFromResourceLocation("speed");
        if (potion == null) {
            FMLLog.bigWarning("Could not set potion effect.");
            return this;
        }
        setPotionEffect(new PotionEffect(potion, 60, 0), 0.8F);

        return this;
    }

}
