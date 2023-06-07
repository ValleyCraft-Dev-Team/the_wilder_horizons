package net.linkle.wilder_horizons.item.gear.tools.shovel.special;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
public class OarItem
extends ShovelItem
implements EnchantmentHandler {
    public OarItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }

    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.IMPALING);
    }
}
