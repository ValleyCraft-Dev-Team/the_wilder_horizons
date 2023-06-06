package net.linkle.wilder_horizons.tool.knife;

import java.util.List;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.tool.WeaponItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ToolMaterial;

public class KnifeBase
        extends WeaponItem
        implements EnchantmentHandler {

    public KnifeBase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public List<EnchantmentTarget> getEnchantmentTypes() {
        return List.of(EnchantmentTarget.WEAPON);
    }

    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.SWEEPING);
    }
}