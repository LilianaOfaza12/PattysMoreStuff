package com.stc.pattysmorestuff.items;

import com.stc.pattysmorestuff.PattysMoreStuff;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by StuffTheChicken on 13/01/2017.
 */
public class ItemInfoBook extends Item {

    public ItemInfoBook(String name)
    {
        this.setMaxStackSize(1);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        if (worldIn.isRemote)
        {
            playerIn.openGui(PattysMoreStuff.instance, 1, worldIn, 0, 0, 0);
        }

        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }

    /**
     * this method returns true if the book's NBT Tag List "pages" is valid
     */
    public static boolean isNBTValid(NBTTagCompound nbt)
    {
        if (nbt == null)
        {
            return false;
        }
        else if (!nbt.hasKey("pages", 9))
        {
            return false;
        }
        else
        {
            NBTTagList nbttaglist = nbt.getTagList("pages", 8);

            for (int i = 0; i < nbttaglist.tagCount(); ++i)
            {
                String s = nbttaglist.getStringTagAt(i);

                if (s.length() > 32767)
                {
                    return false;
                }
            }

            return true;
        }
    }
}
