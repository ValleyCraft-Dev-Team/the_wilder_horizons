package net.linkle.wilder_horizons.item.gear.tools.staff;

import java.util.List;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.item.gear.tools.WeaponItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ToolMaterial;

public class StaffBase
        extends WeaponItem
        implements EnchantmentHandler {

    public StaffBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    //Add the explanatory tooltip
    //@Override
    //public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    //    tooltip.add( new TranslatableText("item.valley.knife.tooltip").formatted(Formatting.YELLOW) );
    //}
    
    @Override
    public List<EnchantmentTarget> getEnchantmentTypes() {
        return List.of(EnchantmentTarget.WEAPON);
    }
    
    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.IMPALING);
    }
}