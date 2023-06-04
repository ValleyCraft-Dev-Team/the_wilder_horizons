package net.linkle.wilder_horizons.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SmokerBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class StoveBlockEntity extends SmokerBlockEntity {
    public StoveBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.wilder_horizons.stove");
    }

    @Override
    public BlockEntityType<?> getType() {
        return net.linkle.wilder_horizons.init.WHBlockEntities.STOVE.type();
    }
}
