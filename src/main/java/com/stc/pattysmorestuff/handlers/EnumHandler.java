package com.stc.pattysmorestuff.handlers;

import net.minecraft.util.IStringSerializable;

/**
 * Created by patrick on 09/02/2017.
 */
public class EnumHandler {

    public static enum OreType implements IStringSerializable {
        OVERWORLD("overworld", 0),
        NETHER("nether", 1),
        END("end", 2);

        private int ID;
        private String name;

        private OreType(String name, int ID) {
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

    public static enum BrickType implements IStringSerializable {
        WHITE("white", 0),
        ORANGE("orange", 1),
        MAGENTA("magenta", 2),
        LIGHT_BLUE("light_blue", 3),
        YELLOW("yellow", 4),
        LIME("lime", 5),
        PINK("pink", 6),
        GRAY("gray", 7),
        SILVER("silver", 8),
        CYAN("cyan", 9),
        PURPLE("purple", 10),
        BLUE("blue", 11),
        BROWN("brown", 12),
        GREEN("green", 13),
        RED("red", 14),
        BLACK("black", 15);

        private int ID;
        private String name;

        private BrickType(String name, int ID) {
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

    public static enum FenceType implements IStringSerializable {
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

        private FenceType(String name, int ID) {
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
