package com.stc.pattysmorestuff.items.drinks;

import com.stc.pattysmorestuff.configuration.ConfigPreInit;
import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;

/**
 * Created by StuffTheChicken on 02/08/2017.
 */
public class ItemMilkBottle extends ItemFood {

    public final float saturation;


    public ItemMilkBottle(String name, int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        this.setMaxStackSize(ConfigPreInit.milkBottleStackSize);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        setCreativeTab(ModTabs.tabPattysFood);

        this.saturation = saturation;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {

        entityLiving.clearActivePotions();

        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    public ItemMilkBottle addDefaultSpeedPotionEffect() {
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
