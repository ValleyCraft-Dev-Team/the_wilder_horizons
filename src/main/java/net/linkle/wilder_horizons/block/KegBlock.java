package net.linkle.wilder_horizons.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;
import java.util.Locale;

public class KegBlock extends BlockWithWater {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final EnumProperty<Attachment> ATTACHMENT = EnumProperty.of("attachment", Attachment.class);

    public static final VoxelShape SHAPE_VERTICAL = Block.createCuboidShape(3, 0, 3, 13, 14, 13);
    public static final VoxelShape SHAPE_FLOOR    = Block.createCuboidShape(1, 0, 1, 15, 13, 15);

    public KegBlock() {
        super(Settings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).strength(1.0f, 2.0f));
    }

    @Override
    protected BlockState newDefaultState() {
        return stateManager.getDefaultState().with(FACING, Direction.NORTH).with(ATTACHMENT, Attachment.FLOOR);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(ATTACHMENT)) {
            case VERTICAL -> SHAPE_VERTICAL;
            default -> SHAPE_FLOOR;
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var state = super.getPlacementState(ctx);
        var player = ctx.getPlayer();
        if (player != null && player.getPitch() > 75f) {
            state = state.with(ATTACHMENT, Attachment.VERTICAL);
        }
        return state.with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        super.appendProperties(builder.add(FACING, ATTACHMENT));
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        var stack = player.getStackInHand(hand);
        if (!world.isClient) {
            boolean hasFill = false;
            if (stack.isOf(net.minecraft.item.Items.BUCKET)) {
                hasFill = true;
                player.setStackInHand(hand, ItemUsage.exchangeStack(stack, player, new ItemStack(net.minecraft.item.Items.WATER_BUCKET)));
            }
            if (stack.isOf(net.minecraft.item.Items.GLASS_BOTTLE)) {
                hasFill = true;
                player.setStackInHand(hand, ItemUsage.exchangeStack(stack, player, PotionUtil.setPotion(new ItemStack(net.minecraft.item.Items.POTION), Potions.WATER)));
            }

            if (hasFill) {
                world.playSound((PlayerEntity)null, pos,
                        stack.isOf(net.minecraft.item.Items.BUCKET) ? SoundEvents.ITEM_BUCKET_FILL : SoundEvents.ITEM_BOTTLE_FILL,
                        SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }

        return stack.isOf(net.minecraft.item.Items.BUCKET) || stack.isOf(net.minecraft.item.Items.GLASS_BOTTLE) ? ActionResult.success(world.isClient) : ActionResult.PASS;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( Text.translatable("block.wilder_horizons.keg.tooltip").formatted(Formatting.AQUA) );
        tooltip.add( Text.translatable("block.wilder_horizons.keg.tooltip_2").formatted(Formatting.AQUA) );
    }

    public static enum Attachment implements StringIdentifiable
    {
        VERTICAL, FLOOR;

        private final String name;

        private Attachment() {
            this.name = name().toLowerCase(Locale.ROOT);
        }

        @Override
        public String asString() {
            return this.name;
        }
    }

}