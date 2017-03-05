package com.stc.pattysmorestuff.armor.items;

import com.stc.pattysmorestuff.tabs.ModTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by StuffTheChicken on 13/11/2016.
 */
public class ItemStarArmor extends ItemArmor {

    public ItemStarArmor(String unlocalizedName, ArmorMaterial material, String armorType, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(ModTabs.tabPattysArmor);
    }
    @SideOnly(Side.CLIENT)
    public boolean func_77636_d(ItemStack stack) {
        return true;
    }

    /*@Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (Keyboard.isKeyDown(Keyboard.KEY_R) && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen() && Minecraft.getMinecraft().currentScreen == null) {
            List<Entity> list = player.world.getEntitiesWithinAABBExcludingEntity(player, new AxisAlignedBB(player.posX - 5, player.posY - 5, player.posZ - 5, player.posX + 5, player.posY + 5, player.posZ + 5));
            for (int i = 0; i < list.size(); ++i)
            {
                Entity entity = (Entity)list.get(i);
                entity.motionX = 0.0D;
                entity.motionY = 0.0D;
                entity.motionZ = 0.0D;
            }

        }
    }*/
}
