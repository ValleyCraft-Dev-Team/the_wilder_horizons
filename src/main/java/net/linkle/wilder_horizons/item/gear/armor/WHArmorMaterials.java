package net.linkle.wilder_horizons.item.gear.armor;

import net.linkle.wilder_horizons.init.init_core.WHMiscItems;
import net.linkle.wilder_horizons.init.init_core.WHNature;
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
    RED_WARPAINT("red_war_paint", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SWEET_BERRIES});
    }),
    BLUE_WARPAINT("blue_war_paint", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LAPIS_LAZULI});
    }),
    GREEN_WARPAINT("green_war_paint", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.FERN});
    }),
    YELLOW_WARPAINT("yellow_war_paint", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SUNFLOWER});
    }),
    WHITE_WARPAINT("white_war_paint", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.BONE_MEAL});
    }),
    BLACK_WARPAINT("black_war_paint", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.CHARCOAL});
    }),
    SHROOMLEATHER_CLOAK("plain_cloak", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_TUNIC("shroomleather_tunic", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    REINFORCED_SHROOMLEATHER_TUNIC("reinforced_shroomleather_tunic", 15, new int[]{2, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_DRESS("shroomleather_dress", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    REINFORCED_SHROOMLEATHER_DRESS("reinforced_shroomleather_dress", 15, new int[]{2, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_WORKWEAR("shroomleather_workwear", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    REINFORCED_SHROOMLEATHER_WORKWEAR("reinforced_shroomleather_workwear", 15, new int[]{2, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    PIGLIN_TUNIC("piglin_tunic", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    ALLAGER_UNDER_TUNIC("allager_garments", 10, new int[]{1, 2, 3, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    HEADSCARF("headscarf", 10, new int[]{1, 2, 3, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ILLAGER_TUNIC("pillager_tunic", 10, new int[]{1, 2, 3, 1}, 17, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER_STRAP});
    }),
    BELT("belt", 14, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER_STRAP});
    }),
    WRAITH_CLOAK("wraith_cloak", 15, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.PHANTOM_MEMBRANE});
    }),
    LICH_CLOAK("lich_cloak", 15, new int[]{2, 3, 4, 2}, 33, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHNature.SOUL_ROSE});
    }),
    HEALER_CLOAK("healer_cloak", 15, new int[]{2, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ALLAGER_DESERT("villager_desert", 10, new int[]{2, 2, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ALLAGER_PLAINS("villager_plains", 10, new int[]{2, 2, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ALLAGER_SAVANNA("villager_savanna", 10, new int[]{2, 2, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ALLAGER_SNOW("villager_snow", 10, new int[]{2, 2, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ALLAGER_TAIGA("villager_taiga", 10, new int[]{2, 2, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    MINING_HELMET("mining_helmet", 10, new int[]{3, 3, 3, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.DRIED_SHROOMLEATHER});
    }),
    SHROOMLEATHER_GARMENTS_NEUTRAL("neutral", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_GARMENTS_FEMME("femme", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    SHROOMLEATHER_GARMENTS_MASC("masc", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SHROOMLEATHER});
    }),
    PIGLIN_GARMENTS("piglin_small_garments", 10, new int[]{1, 1, 1, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    HUNTERS_CAP("hunters_cap", 10, new int[]{2, 2, 3, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    ALLAGER_GARMENTS("allager_garments", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    ILLAGER_GARMENTS("vindicator_garments", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    DAERDRIN_COVERINGS("daerdrin_coverings", 10, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.AZALEA_LEAVES});
    }),
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SCUTE});
    }),
    UNDYING_TALISMAN("undying_talisman", 25, new int[]{2, 5, 6, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.TOTEM_OF_UNDYING});
    }),
    LUCKY_FISHING_HOOK_TALISMAN("lucky_fishing_hook_talisman", 25, new int[]{2, 5, 6, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.LUCKY_HOOK});
    }),
    FROSTED_IRON_TALISMAN("frost_talisman", 25, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    BLUE_CLAM_SHELL_BREASTPLATE("blue_breastplate", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
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
    FRIENDLY_MASK("tree_god_mask", 15, new int[]{1, 2, 3, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Blocks.OAK_LOG});
    }),
    NIGHT_VISION_GOGGLES("night_vision_goggles", 25, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.ECHO_SHARD});
    }),
    STRAW_HAT("straw_hat", 10, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.PLANT_FIBER_CANVAS});
    }),
    COWPOKE_HAT("cowpoke_hat", 15, new int[]{2, 2, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    CHEF_UNIFORM("chef", 15, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.CLOTH});
    }),
    FORGING_UNIFORM("golemage_apron", 15, new int[]{3, 3, 3, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    //ROSEGOLD("rosegold", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ROSEGOLD_ALLOY});
    //}),
    BRASIUM("brasium", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_INGOT});
    }),
    BRASIUM_PAULDRONS("brasium_pauldrons", 25, new int[]{2, 3, 3, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_INGOT});
    }),
    //TREATED_LEATHER_NO_OVERLAY("treated_leather_no_overlay", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    //TREATED_LEATHER_MODIFIED("treated_leather", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    CANVAS("canvas", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.PLANT_FIBER_CANVAS});
    }),
    PLANK("plank", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.BLOCK_WOOD_BREAK, 0.0F, 0.5F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.PLANK_ITEM});
    }),
    RIBCAGE("ribcage", 5, new int[]{2, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.3F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SMALL_BONE});
    }),
    WITHER_RIBCAGE("wither_ribcage", 5, new int[]{2, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.3F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.SMALL_WITHER_BONE});
    }),
    ECHOCHALCUM("sculkerite", 37, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM_INGOT});
    }),
    WARM_BOOTS("warm_boots", 15, new int[]{2, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.RABBIT_HIDE});
    }),
    FUR("fur", 15, new int[]{2, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.RABBIT_HIDE});
    }),
    //TREATED_LEATHER_REINFORCED("reinforced_treated_leather", 25, new int[]{2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.TREATED_LEATHER});
    //}),
    COPPER("copper_glasses", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    COPPER_MONOCLE("copper_monocle", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    ANCIENT_BOOTS("ancient_boots", 15, new int[]{2, 2, 2, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    IRON_REINFORCED("reinforced_iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    GOLD_REINFORCED("reinforced_gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    GOLDEN_CROWN("golden_crown", 7, new int[]{3, 3, 3, 3}, 33, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.3F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    DIAMOND_REINFORCED("reinforced_diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.2F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    EMERALD_REINFORCED("reinforced_emerald", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    BRASIUM_REINFORCED("reinforced_brasium", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.3F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_INGOT});
    }),
    //ROSEGOLD_REINFORCED("reinforced_rosegold", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ROSEGOLD_ALLOY});
    //}),
    ECHOCHALCUM_REINFORCED("reinforced_sculkerite", 37, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM_INGOT});
    }),
    NETHERITE_REINFORCED("reinforced_netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.3F, 0.1F, () -> {
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
    DIAMOND_HAUBERK("diamond_hauberk", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.2F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    EMERALD_HAUBERK("emerald_hauberk", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    EMERALD("emerald", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    BRASIUM_HAUBERK("brasium_hauberk", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.3F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.BRASIUM_INGOT});
    }),
    //ROSEGOLD_HAUBERK("rosegold_hauberk", 25, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.75F, 0.0F, () -> {
    //    return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ROSEGOLD_ALLOY});
    //}),
    ECHOCHALCUM_HAUBERK("sculkerite_hauberk", 37, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM_INGOT});
    }),
    NETHERITE_HAUBERK("netherite_hauberk", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.3F, 0.1F, () -> {
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
