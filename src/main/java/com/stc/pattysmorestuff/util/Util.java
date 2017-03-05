package com.stc.pattysmorestuff.util;

import com.stc.pattysmorestuff.lib.Strings;
import org.apache.commons.codec.language.bm.Lang;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

/**
 * Created by StuffTheChicken on 14/01/2017.
 */
public class Util {


    public static final String MODID = "pattysmorestuff";
    public static final String RESOURCE = MODID.toLowerCase(Locale.US);

    private static Logger logger;

    /**
     * Returns the logger. This makes System.our.println look shabby
     * @return The {@link Logger}
     */
    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(Strings.MODID);
        }
        return logger;
    }


    public static String prefix(String name) {
        return String.format("%s.%s", RESOURCE, name.toLowerCase(Locale.US));
    }
}
