package com.stc.pattysmorestuff.entitys.render;

import com.stc.pattysmorestuff.entitys.EntityRedBullSlurpie;
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
public class EntityRedBullSlurpieRender extends RenderBiped {

    protected ResourceLocation RedBullSlurpie;

    public EntityRedBullSlurpieRender(ModelBiped par1ModelBase, float parShadowSize) {

        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, parShadowSize);

        setEntityTexture();
    }

    protected void preRenderCallback(EntityLivingBase entity, float f) {
        preRenderCallbackRBS((EntityRedBullSlurpie) entity, f);

    }

    protected void preRenderCallbackRBS(EntityRedBullSlurpie entity, float f)

    {

        // some people do some G11 transformations or blends here, like you can do

        GL11.glScalef(1F, 1f, 1f);

        // which is used for Slime entities.  I suggest having the entity cast to

        // your custom type to make it easier to access fields from your

        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor,

        // entity.scaleFactor);

    }

    protected void setEntityTexture() {
        RedBullSlurpie = new ResourceLocation(Strings.MODID + ":textures/entity/redbullslurpie.png");

    }


    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return RedBullSlurpie;

    }
}
