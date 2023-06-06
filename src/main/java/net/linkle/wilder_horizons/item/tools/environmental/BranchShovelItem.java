package net.linkle.wilder_horizons.item.tools.environmental;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.WHGroups;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class BranchShovelItem
extends ShovelItem
implements EnchantmentHandler {
    public BranchShovelItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }
}
