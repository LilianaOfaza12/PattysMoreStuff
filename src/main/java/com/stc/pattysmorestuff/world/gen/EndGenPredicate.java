package com.stc.pattysmorestuff.world.gen;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

import javax.annotation.Nullable;

/**
 * Created by patrick on 09/02/2017.
 */
public class EndGenPredicate implements Predicate<IBlockState> {

    @Override
    public boolean apply(@Nullable IBlockState input) {
        return input != null && input.getBlock() == Blocks.END_STONE;
    }
}
