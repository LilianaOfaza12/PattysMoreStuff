package com.stc.pattysmorestuff.entitys;

import com.stc.pattysmorestuff.init.ModFood;
import com.stc.pattysmorestuff.init.ModTools;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by patrick on 24/07/2017.
 */
public class EntityStuffTheChicken extends EntityCreature {

    boolean alwaysRenderNameTag = true;
    private String name = "StuffTheChicken";

    private float TGWidth = -1.0F;

    private float TGHeight;

    public EntityStuffTheChicken(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 1.95F);
        this.setAlwaysRenderNameTag(alwaysRenderNameTag);
        this.setCustomNameTag(name + " (Creator)");

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


    public static void registerFixesTwiistsGaming(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityStuffTheChicken.class);
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
        return ModFood.raw_chicken_wing;
    }


    @Override
    public ItemStack getHeldItemMainhand() {
        return heldItem;

    }

    private ItemStack heldItem = new ItemStack(ModTools.emerald_sword);



}
