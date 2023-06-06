package net.linkle.wilder_horizons.item.tools.knife.special;

import net.linkle.wilder_horizons.init.WHGroups;
import net.linkle.wilder_horizons.item.tools.knife.KnifeBase;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class CoralDaggerItem
extends KnifeBase {
    public CoralDaggerItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(WHGroups.WH_TOOLS).rarity(Rarity.RARE));
    }

    //Make the coral dagger accept Impaling
    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.IMPALING);
    }
}
