package net.linkle.wilder_horizons.item.gear.armor;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class WarmBoots extends ArmorItem {

    public WarmBoots(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (slot == EquipmentSlot.FEET.getEntitySlotId() && entity instanceof LivingEntity living) {
            living.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3 * 20, 1, true, false, true));
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( Text.translatable("item.valley.warm.tooltip").formatted(Formatting.GRAY));
        tooltip.add( Text.translatable("item.valley.warm.tooltip_2").formatted(Formatting.GRAY));
    }
}
