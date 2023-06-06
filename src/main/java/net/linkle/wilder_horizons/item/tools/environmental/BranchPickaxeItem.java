package net.linkle.wilder_horizons.tool.environmental;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.wilder_horizons.init.Groups.VC_TOOLS;

public class BranchPickaxeItem
extends PickaxeItem
implements EnchantmentHandler {
    public BranchPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(VC_TOOLS));
    }
}
