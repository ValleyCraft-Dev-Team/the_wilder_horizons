package net.linkle.wilder_horizons.item;

import net.linkle.wilder_horizons.init.init_core.WHMedicines;
import net.linkle.wilder_horizons.util.FoodStatusEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class BrothExtendedItem extends FoodItem {
    public BrothExtendedItem(Settings settings, int hunger, float satMod, boolean isMeat, StatusEffect effect) {
        super(settings, hunger, satMod, isMeat, new FoodStatusEffect(new StatusEffectInstance(effect, 78 * 20, 0,
                true, false))); // 30 seconds
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    //public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
    //    ItemStack itemStack = super.finishUsing(stack, world, user);
    //    return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(WHMedicines.TEA_MUG);
    //}
}
