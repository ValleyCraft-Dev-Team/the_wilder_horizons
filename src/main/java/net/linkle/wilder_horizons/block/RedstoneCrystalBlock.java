package net.linkle.wilder_horizons.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class RedstoneCrystalBlock extends BlockWithWater {
    protected static final VoxelShape SHAPE = createCuboidShape(1, 0, 1, 15, 15, 15);

    private final UniformIntProvider experienceDropped;

    public RedstoneCrystalBlock() {
        super(Settings.of(Material.DECORATION, MapColor.RED)
                .requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER).ticksRandomly()
                .strength(1.5f,2.0f).luminance(s->7));
        setDefaultState();
        experienceDropped = UniformIntProvider.create(3, 5);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience) {
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, stack, this.experienceDropped);
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        pos = pos.down();
        state = world.getBlockState(pos);
        return state.isSideSolidFullSquare(world, pos, Direction.UP) && !state.isIn(BlockTags.ICE);
    }
}
