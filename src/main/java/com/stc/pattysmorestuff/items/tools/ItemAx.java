package com.stc.pattysmorestuff.items.tools;

import com.google.common.collect.Sets;
import com.stc.pattysmorestuff.init.ModTabs;
import com.stc.pattysmorestuff.init.ModTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import java.util.Set;

/**
 * Created by StuffTheChicken on 21/07/2017.
 */
public class ItemAx extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

    public ItemAx(String name, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabPattysTools);
    }

    public ItemAx(Item.ToolMaterial material, float damage, float speed)
    {
        super(material, EFFECTIVE_ON);
        this.attackDamage = damage;
        this.attackSpeed = speed;
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        if (stack.getItem() == ModTools.magma_cream_axe) {
            stack.addEnchantment(Enchantment.getEnchantmentByID(20), 3);
        }
        super.onCreated(stack, worldIn, playerIn);
    }
}
