package com.stc.pattysmorestuff.entitys.render;

import com.stc.pattysmorestuff.entitys.EntityTwiistsGaming;
import com.stc.pattysmorestuff.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by patrick on 24/07/2017.
 */
public class EntityTwiistsGamingRender extends RenderBiped {

    protected ResourceLocation TwiistsGaming;

    public EntityTwiistsGamingRender(ModelBiped par1ModelBase, float parShadowSize) {

        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, parShadowSize);

        setEntityTexture();
    }

    protected void preRenderCallback(EntityLivingBase entity, float f) {
        preRenderCallbackTG((EntityTwiistsGaming) entity, f);

    }

    protected void preRenderCallbackTG(EntityTwiistsGaming entity, float f)

    {

        // some people do some G11 transformations or blends here, like you can do

        GL11.glScalef(1F, 1F, 1F);

        // which is used for Slime entities.  I suggest having the entity cast to

        // your custom type to make it easier to access fields from your

        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor,

        // entity.scaleFactor);

    }

    protected void setEntityTexture() {
        TwiistsGaming = new ResourceLocation(Strings.MODID + ":textures/entity/twiistsgaming.png");

    }


    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return TwiistsGaming;

    }
}
