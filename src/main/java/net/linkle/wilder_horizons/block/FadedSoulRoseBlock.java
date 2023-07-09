package net.linkle.wilder_horizons.block;

import net.linkle.wilder_horizons.init.init_core.WHEffects;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class FadedSoulRoseBlock extends SoulPlantBlock {
    
    public FadedSoulRoseBlock(Settings settings) {
        super(ParticleTypes.SMOKE, settings, UniformIntProvider.create(2, 6));
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity living) {
                if (!living.isInvulnerableTo(DamageSource.MAGIC)) {
                    living.addStatusEffect(new StatusEffectInstance(WHEffects.SOUL_FADING.effect, 40));
                }
            }
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();
        double d = (double)i + random.nextDouble();
        double e = (double)j + 0.7D;
        double f = (double)k + random.nextDouble();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for(int l = 0; l < 14; ++l) {
            mutable.set(i + MathHelper.nextInt(random, -10, 10), j + random.nextInt(10), k + MathHelper.nextInt(random, -10, 10));
            BlockState blockState = world.getBlockState(mutable);
            if (!blockState.isFullCube(world, mutable)) {
                world.addParticle(ParticleTypes.MYCELIUM, (double)mutable.getX() + random.nextDouble(), (double)mutable.getY() + random.nextDouble(), (double)mutable.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
                world.addParticle(ParticleTypes.MYCELIUM, (double)mutable.getX() + random.nextDouble(), (double)mutable.getY() + random.nextDouble(), (double)mutable.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
                world.addParticle(ParticleTypes.MYCELIUM, (double)mutable.getX() + random.nextDouble(), (double)mutable.getY() + random.nextDouble(), (double)mutable.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
            }
        }
    }
}
