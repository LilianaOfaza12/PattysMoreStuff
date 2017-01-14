package com.stc.pattysmorestuff;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;

/**
 * Created by patrick on 14/01/2017.
 */
public class TagUtil {

    public static int TAG_TYPE_STRING = (new NBTTagString()).getId();
    public static int TAG_TYPE_COMPOUND = (new NBTTagCompound()).getId();

    public static NBTTagCompound getTagSafe(NBTTagCompound tag, String key) {
        if(tag == null || !tag.hasKey(key)) {
            return new NBTTagCompound();
        }

        return tag.getCompoundTag(key);
    }
}
