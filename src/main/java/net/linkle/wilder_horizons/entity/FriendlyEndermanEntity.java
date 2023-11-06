package net.linkle.wilder_horizons.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class FriendlyEndermanEntity extends PathAwareEntity {

    public static final Vec3i SIZE = new Vec3i(27, 24, 24);

    public static final BlockPos MIN_FROM = new BlockPos(-230, 71, -427);
    public static final BlockPos MAX_FROM = new BlockPos(-204, 94, -404);

    public static final BlockPos MIN_TO = new BlockPos(-222, 68, -354 );
    public static final BlockPos MAX_TO = new BlockPos(-196, 91, -331);

    private boolean isBuilding = false;
    private int timer = 0;
    private final ArrayList<BlockPos> blockPlaced = new ArrayList<>();
    private final ArrayList<EndermanObject> endermen = new ArrayList<>();

    public FriendlyEndermanEntity(EntityType<? extends FriendlyEndermanEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new BuildingGoal());
        goalSelector.add(1, new SwimGoal(this));
        //goalSelector.add(1, new WanderAroundFarGoal(this, 1.0, 0.0F));
        goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        goalSelector.add(2, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createFriendlyEndermanAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 40.0).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.30000001192092896).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 64.0);
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        var stack = player.getStackInHand(hand);
        if (stack.isEmpty()) {
            timer = 70;
        }
        return super.interactMob(player, hand);
    }

    @Override
    public void tick() {
        if (timer == 60) {
            playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 1.5f, 1);
            setInvisible(true);
        }
        if (timer == 20) {
            playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 1.5f, 1);
            setInvisible(false);
        }
        if (timer == 1) {
            isBuilding = true;
        }
        if (timer > 0) {
            timer--;
        }
        super.tick();
    }

    @Nullable
    public BlockState getCarriedBlock() {
        return Blocks.DIAMOND_BLOCK.getDefaultState();
    }

    private class BuildingGoal extends Goal {
        private final ArrayList<BlockPos> blockToPlaceAttached = new ArrayList<>();
        private final ArrayList<BlockPos> blockToPlaceUnattached = new ArrayList<>();
        private final ArrayList<BlockPos> spawnPositions = new ArrayList<>();

        @Override
        public boolean canStart() {
            return isBuilding;
        }

        @Override
        public boolean shouldContinue() {
            return !(blockPlaced.isEmpty() && endermen.isEmpty());
        }

        @Override
        public void start() {
            blockToPlaceUnattached.clear();
            for (var pos : BlockPos.iterate(MIN_TO.getX(), MIN_TO.getY()+1, MIN_TO.getZ(), MAX_TO.getX(), MIN_TO.getY()+1, MAX_TO.getZ())) {
                var fromPos = pos.subtract(MIN_TO).add(MIN_FROM);
                var fromBlock = world.getBlockState(fromPos);

                if (fromBlock.isAir()) {
                    continue;
                }

                var toBlock = world.getBlockState(pos);
                if (!toBlock.isAir() || toBlock.isOf(fromBlock.getBlock())) {
                    continue;
                }

                if (!toBlock.canPlaceAt(world, pos)) {
                    continue;
                }

                blockToPlaceUnattached.add(pos.toImmutable());
            }

            for (int i = 0; i < 4; i++) {
                if (blockToPlaceUnattached.isEmpty()) break;
                int index = random.nextInt(blockToPlaceUnattached.size());
                var pos = blockToPlaceUnattached.get(index);
                blockToPlaceUnattached.remove(index);

                var enderman = EntityType.ENDERMAN.create(world);
                if (enderman == null) continue;
                enderman.setAiDisabled(true);
                for (var offset : BlockPos.iterate(pos.add(-4, -6, -4), pos.add(4, 4, 4))) {
                    var down = offset.down();
                    if (!world.getBlockState(down).getCollisionShape(world, down).isEmpty() && world.isSpaceEmpty(enderman.getDimensions(EntityPose.STANDING).getBoxAt(offset.getX() + 0.5, offset.getY() + 0.01, offset.getZ() + 0.5))) {
                        spawnPositions.add(offset.toImmutable());
                    }
                }
                if (spawnPositions.isEmpty()) continue;
                var spawnPos = Util.getRandom(spawnPositions, random);
                enderman.refreshPositionAndAngles(spawnPos, 0, 0);
                enderman.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, Vec3d.ofCenter(pos));
                world.spawnEntity(enderman);
                endermen.add(new EndermanObject(enderman, pos, world.getBlockState(pos.subtract(MIN_TO).add(MIN_FROM))));
            }
            blockToPlaceUnattached.clear();
            isBuilding = false;
        }

        @Override
        public void tick() {
            final var world = getWorld();
            final var random = getRandom();
            for (var toPos : blockPlaced) {
                for (var newToPos : BlockPos.iterate(toPos.add(-4, -4, -4), toPos.add(4, 5, 4))) {
                    var fromPos = newToPos.subtract(MIN_TO).add(MIN_FROM);
                    var fromBlock = world.getBlockState(fromPos);

                    if (fromBlock.isAir()) {
                        continue;
                    }

                    var toBlock = world.getBlockState(newToPos);
                    if (!toBlock.isAir() || toBlock.isOf(fromBlock.getBlock())) {
                        continue;
                    }

                    if (!toBlock.canPlaceAt(world, newToPos)) {
                        continue;
                    }

                    blockToPlaceUnattached.add(newToPos.toImmutable());

                    for (var offset : BlockPos.iterate(newToPos.add(-1, -1, -1), newToPos.add(1, 1, 1))) {
                        if (offset.equals(newToPos)) {
                            continue;
                        }
                        if (!world.getBlockState(offset).isAir()) {
                            blockToPlaceAttached.add(newToPos.toImmutable());
                            break;
                        }
                    }
                }

                final ArrayList<BlockPos> toPlaceBlockList;
                if (!blockToPlaceAttached.isEmpty()) {
                    toPlaceBlockList = blockToPlaceAttached;
                } else if (!blockToPlaceUnattached.isEmpty()) {
                    toPlaceBlockList = blockToPlaceUnattached;
                } else {
                    toPlaceBlockList = null;
                }

                if (toPlaceBlockList != null) {
                    int size = endermen.size() > 55 ? 0 : 2;
                    for (int i = 0; i < 1 + size; i++) {
                        if (toPlaceBlockList.isEmpty()) break;
                        int index = random.nextInt(toPlaceBlockList.size());
                        var pos = toPlaceBlockList.get(index);
                        toPlaceBlockList.remove(index);

                        var enderman = EntityType.ENDERMAN.create(world);
                        if (enderman == null) continue;
                        enderman.setAiDisabled(true);
                        for (var offset : BlockPos.iterate(pos.add(-5, -7, -5), pos.add(5, 5, 5))) {
                            var down = offset.down();
                            if (!world.getBlockState(down).getCollisionShape(world, down).isEmpty() && world.isSpaceEmpty(enderman.getDimensions(EntityPose.STANDING).getBoxAt(offset.getX() + 0.5, offset.getY() + 0.01, offset.getZ() + 0.5))) {
                                spawnPositions.add(offset.toImmutable());
                            }
                        }
                        if (spawnPositions.isEmpty()) continue;
                        var spawnPos = Util.getRandom(spawnPositions, random);
                        enderman.refreshPositionAndAngles(spawnPos, 0, 0);
                        enderman.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, Vec3d.ofCenter(pos));
                        world.spawnEntity(enderman);
                        endermen.add(new EndermanObject(enderman, pos, world.getBlockState(pos.subtract(MIN_TO).add(MIN_FROM))));
                    }
                }
            }
            blockPlaced.clear();
            blockToPlaceUnattached.clear();
            blockToPlaceAttached.clear();
            spawnPositions.clear();

            for (int i = 0; i < endermen.size(); i++) {
                var obj = endermen.get(i);
                obj.tick();
                if (obj.isStop()) {
                    obj.remove();
                    endermen.remove(i--);
                }
            }
        }

        @Override
        public void stop() {
            isBuilding = false;
        }
    }

    private class EndermanObject {
        int tick;
        final EndermanEntity entity;
        final BlockPos blockToPlacePos;
        final BlockState state;

        public EndermanObject(EndermanEntity entity, BlockPos blockToPlacePos, BlockState state) {
            this.entity = entity;
            this.blockToPlacePos = blockToPlacePos.toImmutable();
            this.state = state;
            tick = 6 + entity.getRandom().nextInt(9);
            entity.setCarriedBlock(state);
        }

        private void tick() {
            if (tick == 4) {
                entity.setCarriedBlock(null);
                world.setBlockState(blockToPlacePos, state, Block.NOTIFY_LISTENERS);
            }
            if (tick == 0) {
                if (getRandom().nextFloat() < 0.7f) {
                    entity.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 2f, 1);
                }
                entity.remove(RemovalReason.DISCARDED);
            }
            tick--;
        }

        public boolean isStop() {
            return tick < -3;
        }

        public void remove() {
            blockPlaced.add(blockToPlacePos);
        }
    }
}
