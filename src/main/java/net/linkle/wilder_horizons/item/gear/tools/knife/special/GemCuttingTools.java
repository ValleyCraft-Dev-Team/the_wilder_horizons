package net.linkle.wilder_horizons.item.gear.tools.knife.special;

import net.linkle.wilder_horizons.api.EnchantmentHandler;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class GemCuttingTools extends PickaxeItem
        implements EnchantmentHandler {
    public GemCuttingTools(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(WHGroups.WH_TOOLS));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( Text.translatable("item.valley.gem_cutting_tools.tooltip").formatted(Formatting.GRAY));
    }
}
