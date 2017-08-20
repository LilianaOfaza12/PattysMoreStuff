package com.stc.pattysmorestuff.entitys;

import com.stc.pattysmorestuff.init.ModFood;
import com.stc.pattysmorestuff.init.ModTools;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by patrick on 24/07/2017.
 */
public class EntityRedBullSlurpie extends EntityCreature {

    boolean alwaysRenderNameTag = true;
    private String name = "RedBullSlurpie";

    private float TGWidth = -1.0F;

    private float TGHeight;

    public EntityRedBullSlurpie(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 1.95F);
        this.setAlwaysRenderNameTag(alwaysRenderNameTag);
        this.setCustomNameTag(name + " (Helper)");

    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI() {
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));

        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50D);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty,
                                            IEntityLivingData livingdata) {


        return livingdata;
    }


    public static void registerFixesRedBullSlurpie(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityRedBullSlurpie.class);
    }

    @Override
    protected void setSize(float width, float height) {
        boolean flag = this.TGWidth > 0.0F && this.TGHeight > 0.0F;
        this.TGWidth = width;
        this.TGHeight = height;

        if (!flag)
        {
            this.multiplySize(1.0F);
        }
    }

    protected final void multiplySize(float size)
    {
        super.setSize(this.TGWidth * size, this.TGHeight * size);
    }

    @Override
    public boolean getCanSpawnHere() {
        return super.getCanSpawnHere();
    }


    @Override
    public void setAlwaysRenderNameTag(boolean alwaysRenderNameTag) {
        super.setAlwaysRenderNameTag(true);
    }

    @Nullable
    @Override
    protected Item getDropItem() {
        return ModFood.redbull;
    }

    @Override
    public ItemStack getHeldItemMainhand() {
        return heldItem;

    }

    private ItemStack heldItem = new ItemStack(ModTools.glowstone_sword);

}
