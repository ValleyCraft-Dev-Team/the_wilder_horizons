package net.linkle.wilder_horizons.item.gear.tools;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ToolMaterial;

import java.util.List;

public class HerosBladeBase
        extends WeaponItem
        implements EnchantmentHandler {

    public HerosBladeBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    //@Override
    //public ActionResult useOnBlock(ItemUsageContext context) {
    //    var result = BONE_MEAL.useOnBlock(new WHItemUsageContext(context, new ItemStack(this)));
    //    if (result.isAccepted()) {
    //        context.getStack().damage(1, context.getPlayer(), entity -> entity.sendToolBreakStatus(context.getHand()));
    //    }
    //    return result;
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