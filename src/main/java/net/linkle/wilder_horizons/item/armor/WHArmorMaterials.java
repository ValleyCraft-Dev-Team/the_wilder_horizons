package net.linkle.wilder_horizons.item.armor;

import net.linkle.wilder_horizons.init.core_inits.WHMiscItems;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum WHArmorMaterials implements ArmorMaterial {
    SHROOMLEATHER_CLOAK("plain_cloak", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    //WRAITH_CLOAK("wraith_cloak", 10, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    //}),
    SHROOMLEATHER_GARMENTS_NEUTRAL("neutral", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_GARMENTS_FEMME("femme", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_GARMENTS_MASC("masc", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SCUTE});
    }),
    BLUE_CLAM_SHELL_BREASTPLATE("blue_breastplate", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SCUTE});
    }),
    //GRASS_DRESS("grass_dress", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{Blocks.GRASS});
    //}),
    DRIPLEAF_HAT("dripleaf", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{});
    }),
    LILY_PAD_HAT("lily_pad", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{});
    }),
    AZALEA_CROWN("azalea", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.FLOWERING_AZALEA_LEAVES});
    }),
    VINE_CROWN("vine", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.VINE});
    }),
    FRIENDLY_MASK("tree_god_mask", 15, new int[]{1, 2, 3, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5F, 0.5F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.OAK_LOG});
    }),
    NIGHT_VISION_GOGGLES("night_vision_goggles", 25, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ECHO_SHARD});
    }),
    STRAW_HAT("straw_hat", 10, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.WHEAT});
    }),
    COWPOKE_HAT("cowpoke_hat", 15, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    CHEF_UNIFORM("chef", 15, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    //ROSEGOLD("rosegold", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ROSEGOLD_ALLOY});
    //}),
    BRASIUM("brasium", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_ALLOY});
    }),
    //TREATED_LEATHER_NO_OVERLAY("treated_leather_no_overlay", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    //TREATED_LEATHER_MODIFIED("treated_leather", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    CANVAS("canvas", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.PLANT_FIBER_CANVAS});
    }),
    PLANK("plank", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.5F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.PLANK_ITEM});
    }),
    ECHOCHALCUM("sculkerite", 37, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 3.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM});
    }),
    WARM_BOOTS("warm_boots", 15, new int[]{2, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 3.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.RABBIT_HIDE});
    }),
    //TREATED_LEATHER_REINFORCED("reinforced_treated_leather", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    IRON_REINFORCED("reinforced_iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    GOLD_REINFORCED("reinforced_gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    DIAMOND_REINFORCED("reinforced_diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
   BRASIUM_REINFORCED("reinforced_rosegold", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_ALLOY});
    }),
    //ROSEGOLD_REINFORCED("reinforced_rosegold", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ROSEGOLD_ALLOY});
    //}),
    ECHOCHALCUM_REINFORCED("reinforced_sculkerite", 37, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 3.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM});
    }),
    NETHERITE_REINFORCED("reinforced_netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    }),
    //TREATED_LEATHER_HAUBERK("treated_leather_hauberk", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    IRON_HAUBERK("iron_hauberk", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    GOLD_HAUBERK("gold_hauberk", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    DIAMOND_HAUBERK("diamond_hauberk", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    BRASIUM_HAUBERK("brasium_hauberk", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_ALLOY});
    }),
    //ROSEGOLD_HAUBERK("rosegold_hauberk", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ROSEGOLD_ALLOY});
    //}),
    ECHOCHALCUM_HAUBERK("sculkerite_hauberk", 37, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 3.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM});
    }),
    NETHERITE_HAUBERK("netherite_hauberk", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int    durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private WHArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
