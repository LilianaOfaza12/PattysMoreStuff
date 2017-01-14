package com.stc.pattysmorestuff;

import java.util.Locale;

/**
 * Created by patrick on 14/01/2017.
 */
public class Util {


    public static final String MODID = "pattysmorestuff";
    public static final String RESOURCE = MODID.toLowerCase(Locale.US);

    public static String prefix(String name) {
        return String.format("%s.%s", RESOURCE, name.toLowerCase(Locale.US));
    }
}
