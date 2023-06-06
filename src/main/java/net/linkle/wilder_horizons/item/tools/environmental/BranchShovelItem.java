package net.linkle.wilder_horizons.tool.environmental;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.wilder_horizons.init.Groups.VC_TOOLS;

public class BranchShovelItem
extends ShovelItem
implements EnchantmentHandler {
    public BranchShovelItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(VC_TOOLS));
    }
}
