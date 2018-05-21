package com.stc.pattysmorestuff.init;

import com.stc.pattysmorestuff.lib.Strings;
import com.stc.pattysmorestuff.tileentity.crates.*;
import com.stc.pattysmorestuff.tileentity.furnaces.*;
import com.stc.pattysmorestuff.tileentity.jar.TileEntityJar;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntitys {


    public static void registerTileEntitys() {

        GameRegistry.registerTileEntity(TileEntityIronFurnace.class, Strings.MODID + "TileEntityIronFurnace");
        GameRegistry.registerTileEntity(TileEntityGoldFurnace.class, Strings.MODID + "TileEntityGoldFurnace");
        GameRegistry.registerTileEntity(TileEntityDiamondFurnace.class, Strings.MODID + "TileEntityDiamondFurnace");
        GameRegistry.registerTileEntity(TileEntityEmeraldFurnace.class, Strings.MODID + "TileEntityEmeraldFurnace");
        GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, Strings.MODID + "TileEntityObsidianFurnace");
        GameRegistry.registerTileEntity(TileEntityUltimateFurnace.class, Strings.MODID + "TileEntityUltimateFurnace");
        GameRegistry.registerTileEntity(TileEntityJar.class, Strings.MODID + "TileEntityJar");
        GameRegistry.registerTileEntity(TileEntityOakCrate.class, Strings.MODID + "TileEntityOakCrate");
        GameRegistry.registerTileEntity(TileEntitySpruceCrate.class, Strings.MODID + "TileEntitySpruceCrate");
        GameRegistry.registerTileEntity(TileEntityBirchCrate.class, Strings.MODID + "TileEntityBirchCrate");
        GameRegistry.registerTileEntity(TileEntityJungleCrate.class, Strings.MODID + "TileEntityJungleCrate");
        GameRegistry.registerTileEntity(TileEntityBigOakCrate.class, Strings.MODID + "TileEntityBigOakCrate");
        GameRegistry.registerTileEntity(TileEntityAcaciaCrate.class, Strings.MODID + "TileEntityAcaciaCrate");
    }
}
