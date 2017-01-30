package com.stc.pattysmorestuff.util;

import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by StuffTheChicken on 14/01/2017.
 */
public class TagUtil {


    public static NBTTagCompound getTagSafe(NBTTagCompound tag, String key) {
        if(tag == null || !tag.hasKey(key)) {
            return new NBTTagCompound();
        }

        return tag.getCompoundTag(key);
    }
}
