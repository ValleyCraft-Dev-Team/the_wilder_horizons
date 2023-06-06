package net.linkle.wilder_horizons.item.tools.rusty;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.WHGroups;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class RustyShovelItem
extends ShovelItem
implements EnchantmentHandler {
    public RustyShovelItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }
}
