package net.linkle.wilder_horizons.item.gear.tools.knife.special;

import net.linkle.wilder_horizons.item.gear.tools.travelers_sword.TravelerBase;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class Scalpel extends TravelerBase {

    public Scalpel(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( Text.translatable("item.valley.scalpel.tooltip").formatted(Formatting.GRAY));
    }
}
