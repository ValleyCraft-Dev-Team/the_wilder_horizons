package net.linkle.wilder_horizons.item.tools.rusty;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.WHGroups;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class RustyAxeItem
extends AxeItem
implements EnchantmentHandler {
    public RustyAxeItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }
}
