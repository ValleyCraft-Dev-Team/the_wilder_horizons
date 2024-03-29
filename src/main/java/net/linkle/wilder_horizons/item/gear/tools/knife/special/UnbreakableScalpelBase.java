package net.linkle.wilder_horizons.item.gear.tools.knife.special;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.interfaces.PreventDestroy;
import net.linkle.wilder_horizons.item.gear.tools.WeaponItem;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class UnbreakableScalpelBase
        extends WeaponItem
        implements EnchantmentHandler, PreventDestroy {

    public UnbreakableScalpelBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return PreventDestroy.isUsable(miner.getMainHandStack());
    }

    //@Override
    //public ActionResult useOnBlock(ItemUsageContext context) {
    //    var result = BONE_MEAL.useOnBlock(new WHItemUsageContext(context, new ItemStack(this)));
    //    if (result.isAccepted()) {
    //        context.getStack().damage(1, context.getPlayer(), entity -> entity.sendToolBreakStatus(context.getHand()));
    //    }
    //    return result;
    //}

    //@Override
    //public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    //    tooltip.add( Text.translatable("item.valley.scalpel.tooltip").formatted(Formatting.GRAY));
    //}

    @Override
    public List<EnchantmentTarget> getEnchantmentTypes() {
        return List.of(EnchantmentTarget.WEAPON);
    }
    
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.SWEEPING);
    }
    
    public boolean isInvalid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.IMPALING);
    }
}