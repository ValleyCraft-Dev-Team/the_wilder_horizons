package net.linkle.wilder_horizons.item.gear.tools.rusty;

import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RustySwordItem
extends SwordItem
implements EnchantmentHandler {
    public RustySwordItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }
}
