package net.linkle.wilder_horizons.item.tools.environmental;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.WHGroups;
import net.minecraft.enchantment.*;
import net.minecraft.item.*;

public class BranchWeaponItem
extends SwordItem
implements EnchantmentHandler {
    public BranchWeaponItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }

    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.SWEEPING);
    }
}
