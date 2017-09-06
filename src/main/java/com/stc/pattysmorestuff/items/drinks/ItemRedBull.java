package com.stc.pattysmorestuff.items.drinks;

import com.stc.pattysmorestuff.init.ModTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;

public class ItemRedBull extends ItemFood {

    public final float saturation;


    public ItemRedBull(String name, int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        this.setMaxStackSize(1);
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


    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {

        this.setAlwaysEdible();
        if (!worldIn.isRemote) {
            if (stack.getMetadata() > 0) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 0));
            } else {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 0));

            }

        }
    }

    /*public ItemRedBull addDefaultSpeedPotionEffect() {
        setAlwaysEdible();

        final Potion potion = Potion.getPotionFromResourceLocation("speed");
        if (potion == null) {
            FMLLog.bigWarning("Could not set potion effect.");
            return this;
        }
        setPotionEffect(new PotionEffect(potion, 60, 0), 0.8F);

        return this;
    }*/
}
