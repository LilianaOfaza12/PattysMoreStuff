package com.stc.pattysmorestuff.handlers;

import net.minecraft.util.IStringSerializable;

/**
 * Created by patrick on 02/08/2017.
 */
public class EnumHandler {

    public static enum BlockType implements IStringSerializable {
        WHITE("white", 0),
        ORANGE("orange", 1),
        MAGENTA("magenta", 2),
        LIGHT_BLUE("light_blue", 3),
        YELLOW("yellow", 4),
        LIME("lime", 5),
        PINK("pink", 6),
        GRAY("gray", 7),
        LIGHT_GRAY("light_gray", 8),
        CYAN("cyan", 9),
        PURPLE("purple", 10),
        BROWN("brown", 11),
        GREEN("green", 12),
        RED("red", 13),
        BLACK("black", 14);

        private int ID;
        private String name;

        private BlockType(String name, int ID) {
            this.ID = ID;
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getID() {
            return ID;
        }

        @Override
        public String toString() {
            return getName();
        }
    }

}
