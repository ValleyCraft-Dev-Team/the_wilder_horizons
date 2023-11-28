
package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.util.IdProvider;
import net.linkle.wilder_horizons.widener.BrewingRecipeRegistryWidener;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHPotions implements IdProvider {

    ROT_BLIGHT_POTION(new StatusEffectInstance(WHEffects.ROT_BLIGHT.effect, 45 * 20)),

    LEVITATION_POTION(new StatusEffectInstance(StatusEffects.LEVITATION, 45 * 20)),
    LEVITATION_POTION_LONG(new StatusEffectInstance(StatusEffects.LEVITATION, 90 * 20)),
    LEVITATION_POTION_FAST(new StatusEffectInstance(StatusEffects.LEVITATION, 21 * 20, 1)),

    ABSORPTION_POTION(new StatusEffectInstance(StatusEffects.ABSORPTION, 60 * 20)),
    ABSORPTION_POTION_LONG(new StatusEffectInstance(StatusEffects.ABSORPTION, 120 * 20)),
    ABSORPTION_POTION_FAST(new StatusEffectInstance(StatusEffects.ABSORPTION, 30 * 20, 1)),
    ABSORPTION_POTION_II(new StatusEffectInstance(StatusEffects.ABSORPTION, 60 * 20, 1)),

    LUCK_LONG(new StatusEffectInstance(StatusEffects.LUCK, 480 * 20)),
    LUCK_FAST(new StatusEffectInstance(StatusEffects.LUCK, 150 * 20, 1)),
    LUCK_WEAK(new StatusEffectInstance(StatusEffects.LUCK, 75 * 20, 0)),

    HASTE_POTION(new StatusEffectInstance(StatusEffects.HASTE, 180 * 20)),
    HASTE_POTION_LONG(new StatusEffectInstance(StatusEffects.HASTE, 480 * 20)),
    HASTE_POTION_FAST(new StatusEffectInstance(StatusEffects.HASTE, 90 * 20, 1)),

    FERAL_STRENGTH(new StatusEffectInstance(StatusEffects.STRENGTH, 45 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 45 *20, 2)),
    FERAL_STRENGTH_LONG(new StatusEffectInstance(StatusEffects.STRENGTH, 90 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 90 *20, 2)),
    FERAL_STRENGTH_WEAK(new StatusEffectInstance(StatusEffects.STRENGTH, 12 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 45 *20, 2)),

    ABYSSAL_FORTITUDE(new StatusEffectInstance(StatusEffects.STRENGTH, 120 * 20, 0), new StatusEffectInstance(StatusEffects.SPEED, 120 * 20, 0)),

    INVISIBILITY_WEAK(new StatusEffectInstance(StatusEffects.INVISIBILITY, 12 * 20)),
    DRAGONHEARTED(new StatusEffectInstance(StatusEffects.STRENGTH, 45 * 20, 3), new StatusEffectInstance(StatusEffects.POISON, 21 *20, 1)),
    GLOWING_LONG(new StatusEffectInstance(StatusEffects.GLOWING, 45 * 20)),
    GLOWING(new StatusEffectInstance(StatusEffects.GLOWING, 23 * 20)),
    SOUL_FADING(new StatusEffectInstance(WHEffects.SOUL_FADING.effect, 10 * 20)),
    RADIANT_HEALING(new StatusEffectInstance(WHEffects.RADIANT_HEALING.effect, 32 * 20)),
    SLOWNESS_WEAK(new StatusEffectInstance(StatusEffects.SLOWNESS, 24 * 20)),
    HUNGER(new StatusEffectInstance(StatusEffects.HUNGER, 60 * 20)),
    HASTE_WEAK(new StatusEffectInstance(StatusEffects.HASTE, 45 * 20)),
    WITHER_WEAK(new StatusEffectInstance(StatusEffects.WITHER, 16 * 20)),
    WITHER_STRONG(new StatusEffectInstance(StatusEffects.WITHER, 24 * 20)),
    WITHER_VERY_STRONG(new StatusEffectInstance(StatusEffects.WITHER, 48 * 20)),
    BLINDNESS_WEAK(new StatusEffectInstance(StatusEffects.BLINDNESS, 16 * 20)),
    BLINDNESS(new StatusEffectInstance(StatusEffects.BLINDNESS, 24 * 20)),
    SPEED_WEAK(new StatusEffectInstance(StatusEffects.SPEED, 24 * 20)),
    SPEED(new StatusEffectInstance(StatusEffects.SPEED, 48 * 20)),
    SLOW_FALLING_WEAK(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 18 * 20)),
    NAUSEA_WEAK(new StatusEffectInstance(StatusEffects.NAUSEA, 12 * 20)),
    RESISTANCE(new StatusEffectInstance(StatusEffects.RESISTANCE, 48 * 20)),
    RESISTANCE_WEAK(new StatusEffectInstance(StatusEffects.RESISTANCE, 12 * 20)),
    FIRE_RESISTANCE_WEAK(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12 * 20)),
    REGENERATION_WEAK(new StatusEffectInstance(StatusEffects.REGENERATION, 12 * 20)),
    JUMP_BOOST_WEAK(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 32 * 20, 1)),
    POISON_WEAK(new StatusEffectInstance(StatusEffects.POISON, 20 * 20)),
    NIGHT_VISION_WEAK(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 24 * 20)),
    STRENGTH_WEAK(new StatusEffectInstance(StatusEffects.STRENGTH, 18 * 20)),
    WEAKNESS_WEAK(new StatusEffectInstance(StatusEffects.WEAKNESS, 18 * 20)),
    ABSORPTION_WEAK(new StatusEffectInstance(StatusEffects.ABSORPTION, 18 * 20)),
    WATER_BREATHING_WEAK(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 18 * 20));

    public static void initialize() {
        registerRecipe(Potions.WATER, WHMiscItems.BEAST_CLAW.item, Potions.AWKWARD);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, ROT_BLIGHT_POTION.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.CAVE_SNAIL_SHELL.item, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.OVER_SNAIL_SHELL.item, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.SCUTE, Potions.TURTLE_MASTER);
        registerRecipe(Potions.AWKWARD, WHArmors.TURTLE_CHESTPLATE.item, Potions.TURTLE_MASTER);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_BAT_WING.item, LEVITATION_POTION.potion);
        registerRecipe(LEVITATION_POTION.potion, Items.GLOWSTONE_DUST, LEVITATION_POTION_LONG.potion);
        registerRecipe(LEVITATION_POTION.potion, Items.REDSTONE, LEVITATION_POTION_FAST.potion);
        registerRecipe(Potions.AWKWARD, WHNature.CLAM_BLOCK.item, ABSORPTION_POTION.potion);
        registerRecipe(Potions.AWKWARD, WHNature.STARFISH_BLOCK.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(ABSORPTION_POTION.potion, Items.REDSTONE, ABSORPTION_POTION_LONG.potion);
        registerRecipe(ABSORPTION_POTION.potion, Items.GLOWSTONE_DUST, ABSORPTION_POTION_FAST.potion);
        registerRecipe(Potions.AWKWARD, Items.NAUTILUS_SHELL, ABYSSAL_FORTITUDE.potion);
        registerRecipe(Potions.AWKWARD, Items.AMETHYST_SHARD, HASTE_POTION.potion);
        registerRecipe(HASTE_POTION.potion, Items.REDSTONE, HASTE_POTION_LONG.potion);
        registerRecipe(HASTE_POTION.potion, Items.GLOWSTONE_DUST, HASTE_POTION_FAST.potion);
        registerRecipe(Potions.AWKWARD, Items.GOAT_HORN, Potions.STRENGTH);
        registerRecipe(Potions.AWKWARD, WHMiscItems.BEAST_CLAW.item, FERAL_STRENGTH.potion);
        registerRecipe(FERAL_STRENGTH.potion, Items.REDSTONE, FERAL_STRENGTH_LONG.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.JELLY_BLOB.item, Potions.LEAPING);
        registerRecipe(Potions.AWKWARD, WHFoods.CRYSTALLIZED_HONEYDROP.item, Potions.STRONG_REGENERATION);
        registerRecipe(Potions.AWKWARD, Items.HONEYCOMB, Potions.REGENERATION);
        registerRecipe(Potions.AWKWARD, Items.HONEY_BOTTLE, Potions.REGENERATION);
        registerRecipe(Potions.AWKWARD, WHMiscItems.DRAGON_TOOTH.item, RADIANT_HEALING.potion);
        registerRecipe(Potions.AWKWARD, Items.PHANTOM_MEMBRANE, INVISIBILITY_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_TRANSLUCENT_LIONFISH.item, Potions.INVISIBILITY);
        registerRecipe(Potions.LUCK, Items.GLOWSTONE_DUST, LUCK_LONG.potion);
        registerRecipe(Potions.LUCK, Items.REDSTONE, LUCK_FAST.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.WISH_BONE.item, Potions.LUCK);
        registerRecipe(Potions.AWKWARD, Items.FEATHER, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.CROW_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.DUCK_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SEAGULL_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.IRON_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.SLIME_BALL, Potions.LEAPING);
        registerRecipe(Potions.AWKWARD, Items.HEART_OF_THE_SEA, Potions.LONG_WATER_BREATHING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SOUL_GEM.item, RADIANT_HEALING.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MONSTER_GUTS.item, HUNGER.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MONSTER_LIVER.item, BLINDNESS.potion);
        registerRecipe(Potions.AWKWARD, Items.GLOW_BERRIES, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, Items.GLOW_INK_SAC, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, Items.GLOW_LICHEN, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_GLOWSQUID_TENTACLE.item, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, Items.INK_SAC, BLINDNESS_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_SQUID_TENTACLE.item, BLINDNESS.potion);
        registerRecipe(Potions.AWKWARD, Items.FLINT, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.AMETHYST_CLUSTER, HASTE_POTION.potion);
        registerRecipe(Potions.AWKWARD, Items.ECHO_SHARD, Potions.NIGHT_VISION);
        registerRecipe(Potions.AWKWARD, Items.QUARTZ, ABSORPTION_POTION.potion);
        registerRecipe(Potions.AWKWARD, Items.PRISMARINE_CRYSTALS, Potions.SWIFTNESS);
        registerRecipe(Potions.AWKWARD, Items.PRISMARINE_SHARD, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SALTPETER.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SALT.item, NAUSEA_WEAK.potion);
        //registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_WORM.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_BEAST_HEART.item, FERAL_STRENGTH.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_BEAST_LIVER.item, Potions.STRENGTH);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_PHANTOM_EYE.item, Potions.INVISIBILITY);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_TRIPE.item, Potions.POISON);
        //registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_CAVE_MAGGOT.item, WEAKNESS_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_ENDERMITE.item, ROT_BLIGHT_POTION.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_ENDERMAN_EYE.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_SILVERFISH.item, HASTE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.SEA_PICKLE, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.CRIMSON_FUNGUS, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.WARPED_FUNGUS, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_CANID.item, FERAL_STRENGTH_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_BIRD_THIGH.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_BACON.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_STONEROLLER_MINNOW.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_RED_PORGY.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_ABYSSWATCHER.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_SARDINE.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_PERCH.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.SALMON, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.COD, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.TROPICAL_FISH, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.WHEAT, REGENERATION_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.PORKCHOP, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.BEEF, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.CHICKEN, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.RABBIT, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.MUTTON, NAUSEA_WEAK.potion);
        //registerRecipe(Potions.AWKWARD, WHFoodIngredients.ENDER_DRAGON_GLAND.item, DRAGONHEARTED.potion);
        //registerRecipe(Potions.AWKWARD, WHFoodIngredients.ENDER_DRAGON_EYE.item, DRAGONHEARTED.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.PURPLE_MUSHROOM_OIL.item, SLOWNESS_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.PUMPKIN_SLICE.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.APPLE_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.BREAD_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CAKE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CHOCOLATE_CAKE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CHOCOLATE_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CHORUS_FRUIT_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.COOKIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CORN_BREAD_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.ENCHANTED_APPLE_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.HARDTACK_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.SUGAR_COOKIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CHOCOLATE_CHUNK_COOKIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.PUMPKIN_SPICE_COOKIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.SALMON_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.PUMPKIN_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.SWEET_BERRY_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.GLOW_BERRY_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.VANILLA_FROSTING.item, SPEED_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.ENCHANTED_APPLE_PIE_DOUGH.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MILK.item, Potions.THICK);
        registerRecipe(Potions.WATER, WHFoodIngredients.MILK.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.PURIFIED_WATER.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.GLOW_BERRY_JUICE.item, GLOWING_LONG.potion);
        registerRecipe(Potions.THICK, Items.RAW_GOLD, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.RAW_COPPER, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.THICK, Items.RAW_IRON, STRENGTH_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.COBWEB, SLOWNESS_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.RED_MUSHROOM, POISON_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_GOLDFIN.item, Potions.HEALING);
        registerRecipe(Potions.AWKWARD, WHFoods.GOLDEN_WATERMELON_JUICE.item, Potions.STRONG_HEALING);

        //registerRecipe(Potions.AWKWARD, WHNature.GLOW_MUSHROOM.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.SPORE_SPREADER.item, POISON_WEAK.potion);
        //registerRecipe(Potions.AWKWARD, WHNature.FAN_MOLD.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.BROWN_MUSHROOM, REGENERATION_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHNature.PURPLE_MUSHROOM.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, Items.SUGAR_CANE, SPEED_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.APPLE, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.EMERALD, LUCK_WEAK.potion);
        registerRecipe(Potions.WATER, Items.CHARCOAL, Potions.MUNDANE);
        registerRecipe(Potions.WATER, Items.COAL, Potions.MUNDANE);
        registerRecipe(Potions.WATER, WHMiscItems.ANTHRACITE.item, Potions.MUNDANE);
        registerRecipe(Potions.WATER, WHMiscItems.ANTHRACITE_NUGGET.item, Potions.MUNDANE);
        registerRecipe(Potions.WATER, WHMiscItems.COAL_NUGGET.item, Potions.MUNDANE);
        registerRecipe(Potions.WATER, WHMiscItems.CHARCOAL_NUGGET.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, Items.COAL, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.ANTHRACITE.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.ANTHRACITE_NUGGET.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.COAL_NUGGET.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.CHARCOAL_NUGGET.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, Items.CHARCOAL, Potions.THICK);
        registerRecipe(Potions.MUNDANE, Items.CHARCOAL, Potions.THICK);
        registerRecipe(Potions.MUNDANE, WHMiscItems.CHARCOAL_NUGGET.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, Items.STRING, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.CLAY_BALL, SLOWNESS_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.LEATHER, RESISTANCE.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SHROOMLEATHER.item, RESISTANCE.potion);
        registerRecipe(Potions.AWKWARD, Items.RABBIT_HIDE, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.PIG_HIDE.item, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.HIDE.item, RESISTANCE.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.TREATED_LEATHER_STRAP.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.CARROT, NIGHT_VISION_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.POTATO, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.BEETROOT, REGENERATION_WEAK.potion);
        registerRecipe(Potions.WATER, Items.STICK, Potions.MUNDANE);
        registerRecipe(Potions.WATER, WHMiscItems.PLANK_ITEM.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.WOODEN_DOWEL.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.ENDER_EYE, Potions.NIGHT_VISION);
        registerRecipe(Potions.AWKWARD, Items.ENDER_PEARL, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.KELP, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHNature.GLOW_KELP.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHNature.ORANGE_KELP.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoods.DRIED_GLOW_KELP.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, WHFoods.DRIED_ORANGE_KELP.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, Items.DRIED_KELP, Potions.THICK);
        registerRecipe(Potions.AWKWARD, Items.BONE, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, Items.BONE_MEAL, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SMALL_BONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.BONEFIN_SKELETON.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SKULL_SHARD.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.WITHER_BONE.item, WITHER_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SMALL_WITHER_BONE.item, WITHER_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.WITHER_SKULL_SHARD.item, WITHER_STRONG.potion);
        registerRecipe(Potions.AWKWARD, Items.SKELETON_SKULL, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.DAERDRI_SKULL.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.ENDERMAN_SKULL.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.PIGLIN_SKULL.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.VILLAGER_SKULL.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, WITHER_VERY_STRONG.potion);
        registerRecipe(Potions.AWKWARD, WHFoods.GOLDEN_PUMPKIN_SLICE.item, Potions.STRENGTH);
        registerRecipe(Potions.THICK, Items.SWEET_BERRIES, SPEED_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.ALLIUM.asItem(), FIRE_RESISTANCE_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.TALL_ALLIUM.item, FIRE_RESISTANCE_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.TALL_AZURE_BLUET.item, BLINDNESS_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.AZURE_BLUET.asItem(), BLINDNESS_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.BLUE_ORCHID.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.DANDELION.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.SUNFLOWER.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.CORNFLOWER.asItem(), JUMP_BOOST_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.TALL_CORNFLOWER.item, JUMP_BOOST_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.SNOWFLOWER.item, FIRE_RESISTANCE_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.SPROUT.item, Potions.MUNDANE);
        registerRecipe(Potions.THICK, WHNature.FLUFFY_DANDELION.item, Potions.MUNDANE);
        registerRecipe(Potions.THICK, WHNature.WEEPING_GHOST_WILLOW.item, INVISIBILITY_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.MEADOW_FLOWERS.item, Potions.MUNDANE);
        registerRecipe(Potions.THICK, WHNature.MIMIC_FLOWER.item, Potions.MUNDANE);
        registerRecipe(Potions.THICK, WHNature.CATTAILS.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.ALGAE.item, POISON_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHNature.JELLYCAP.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.BLUE_ANEMONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.GREEN_ANEMONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.PINK_ANEMONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.PURPLE_ANEMONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.RED_ANEMONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHNature.YELLOW_ANEMONE.item, Potions.HARMING);
        registerRecipe(Potions.THICK, WHNature.OAK_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.BIRCH_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.SPRUCE_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.ACACIA_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.DARK_OAK_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.JUNGLE_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.APPLE_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.GOLD_LEAF_MAPLE_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.WARM_BIRCH_SEED.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.OAK_SAPLING.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.BIRCH_SAPLING.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.SPRUCE_SAPLING.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.ACACIA_SAPLING.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.DARK_OAK_SAPLING.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Items.JUNGLE_SAPLING.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.APPLE_SAPLING.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.GOLD_LEAF_MAPLE_SAPLING.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.WARM_BIRCH_SAPLING.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.FLOWERING_CACTUS.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.CACTUS.asItem(), Potions.MUNDANE);
        registerRecipe(Potions.THICK, WHNature.THORNY_BUSH.item, Potions.HARMING);
        registerRecipe(Potions.THICK, WHNature.FLUFFY_DANDELION.item, Potions.MUNDANE);
        registerRecipe(Potions.THICK, WHNature.FOXTAIL_FERN.item, STRENGTH_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.FERN.asItem(), STRENGTH_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.LARGE_FERN.asItem(), STRENGTH_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.JUNGLE_BUSH.item, SPEED_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.HONEYCLUSTER.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.LAVENDER.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.TALL_LAVENDER.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.MOSS_SPROUTLET.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.ORANGE_BEAUTY.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.BIG_FERN.item, STRENGTH_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.LEATHERLEAF_FERN.item, STRENGTH_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.FIREFERN.item, FIRE_RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.FIRE_PEPPER.item, FIRE_RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.ALOE_VERA.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.AMETHYSTLE.item, HASTE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.ANCIENT_FLOWER.item, RADIANT_HEALING.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.CAVE_ROOT.item, NIGHT_VISION_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.BRINE.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.BUTTER.item, Potions.THICK);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MAIZE.item, RESISTANCE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MINERS_LETTUCE.item, SPEED_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.ONION.item, STRENGTH_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_RICE.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.LILY_OF_THE_VALLEY.asItem(), POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.LILY_OF_THE_OCEANS.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.LILY_OF_THE_MOUNTAINS.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.KNAPWEED.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.OXEYE_DAISY.asItem(), REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.TALL_OXEYE_DAISY.item, REGENERATION_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.POPPY.asItem(), POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.ORANGE_POPPY.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.WHITE_POPPY.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.YELLOW_POPPY.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.ORANGE_TULIP.asItem(), POISON_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.PINK_TULIP.asItem(), POISON_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.RED_TULIP.asItem(), POISON_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.WHITE_TULIP.asItem(), POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.BLACK_TULIP.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.LIGHT_BLUE_TULIP.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.PURPLE_TULIP.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, WHNature.YELLOW_TULIP.item, POISON_WEAK.potion);
        registerRecipe(Potions.THICK, Blocks.WITHER_ROSE.asItem(), WITHER_STRONG.potion);
        registerRecipe(Potions.AWKWARD, WHNature.SOUL_ROSE.item, ABSORPTION_POTION.potion);
        registerRecipe(Potions.AWKWARD, WHNature.BLUE_SOUL_ROSE.item, RADIANT_HEALING.potion);
        registerRecipe(Potions.THICK, WHNature.FADED_SOUL_ROSE.item, SOUL_FADING.potion);
        registerRecipe(Potions.THICK, Items.ROTTEN_FLESH, HUNGER.potion);
        registerRecipe(Potions.THICK, Items.ZOMBIE_HEAD, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_ZOMBIE_ALEX.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_ZOMBIE_EFE.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_DROWNED_ALEX.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_DROWNED_EFE.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_DROWNED_STEVE.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_ROTTEN_ALEX.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_ROTTEN_EFE.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_ROTTEN_STEVE.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_HUSK_ALEX.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_HUSK_EFE.item, HUNGER.potion);
        registerRecipe(Potions.THICK, WHNature.HEAD_HUSK_STEVE.item, HUNGER.potion);
    }

    private static void registerRecipe(Potion input, Item item, Potion output) {
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(input, item, output);
    }

    // ### Enum Codes ##

    public final Potion potion;
    public final Identifier id;

    WHPotions(StatusEffectInstance... instances) {
        this.id = Main.makeId(name().toLowerCase(Locale.ROOT));
        this.potion = Registry.register(Registry.POTION, id, new Potion(instances));
    }
    
    @Override
    public Identifier getId() {
        return id;
    }
}
