package com.stc.pattysmorestuff.tileentity.render;

import com.stc.pattysmorestuff.tileentity.TileEntityJar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by StuffTheChicken on 12/01/2017.
 */
public class RendererJar extends TileEntitySpecialRenderer<TileEntityJar> {

    private static final EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().world, 0,0,0, new ItemStack(Items.COOKIE));

    @Override
    public void renderTileEntityAt(TileEntityJar te, double x, double y, double z, float partialTicks, int destroyStage) {
        super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);

        ITEM.hoverStart = 0F;

        GlStateManager.pushMatrix();
        {
            GlStateManager.translate(x, y, z);
            GlStateManager.rotate(90F, 1,0,0);
            GlStateManager.translate(0.5, 0.02, -0.1);
            for(int i = 0; i < te.cookieCount; i++){
                Minecraft.getMinecraft().getRenderManager().doRenderEntity(ITEM, 0, 0, 0, 0 ,0, false);
                GlStateManager.translate(0,0, -0.0625);
            }
        }
        GlStateManager.popMatrix();
    }
}
