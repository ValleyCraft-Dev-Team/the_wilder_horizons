package net.linkle.wilder_horizons.item.tools.environmental;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.WHGroups;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class BranchHoeItem
extends HoeItem
implements EnchantmentHandler {
    public BranchHoeItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(WHGroups.WH_TOOLS));
    }
}