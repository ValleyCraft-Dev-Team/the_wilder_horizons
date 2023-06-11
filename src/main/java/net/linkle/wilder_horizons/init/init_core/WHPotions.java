package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.util.IdProvider;
import net.linkle.wilder_horizons.widener.BrewingRecipeRegistryWidener;
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

    LUCK_LONG(new StatusEffectInstance(StatusEffects.LUCK, 480 * 20)),
    LUCK_FAST(new StatusEffectInstance(StatusEffects.LUCK, 150 * 20, 1)),

    HASTE_POTION(new StatusEffectInstance(StatusEffects.HASTE, 180 * 20)),
    HASTE_POTION_LONG(new StatusEffectInstance(StatusEffects.HASTE, 480 * 20)),
    HASTE_POTION_FAST(new StatusEffectInstance(StatusEffects.HASTE, 90 * 20, 1)),

    FERAL_STRENGTH(new StatusEffectInstance(StatusEffects.STRENGTH, 45 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 45 *20, 2)),
    FERAL_STRENGTH_LONG(new StatusEffectInstance(StatusEffects.STRENGTH, 90 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 90 *20, 2)),

    DRAGONHEARTED(new StatusEffectInstance(StatusEffects.STRENGTH, 45 * 20, 3), new StatusEffectInstance(StatusEffects.POISON, 21 *20, 1)),

    GLOWING(new StatusEffectInstance(StatusEffects.GLOWING, 30 * 20)),
    SOUL_FADING(new StatusEffectInstance(WHEffects.SOUL_FADING.effect, 10 * 20)),

    HASTE_WEAK(new StatusEffectInstance(StatusEffects.HASTE, 45 * 20)),
    WITHER_WEAK(new StatusEffectInstance(StatusEffects.WITHER, 5 * 20)),
    WITHER_STRONG(new StatusEffectInstance(StatusEffects.WITHER, 15 * 20)),
    WITHER_VERY_STRONG(new StatusEffectInstance(StatusEffects.WITHER, 30 * 20)),
    BLINDNESS_WEAK(new StatusEffectInstance(StatusEffects.BLINDNESS, 5 * 20)),
    BLINDNESS(new StatusEffectInstance(StatusEffects.BLINDNESS, 15 * 20)),
    SLOW_FALLING_WEAK(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 30 * 20)),
    NAUSEA_WEAK(new StatusEffectInstance(StatusEffects.NAUSEA, 15 * 20)),
    WATER_BREATHING_WEAK(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 30 * 20));

    public static void initialize() {
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, ROT_BLIGHT_POTION.potion);

        registerRecipe(Potions.AWKWARD, Items.SCUTE, Potions.TURTLE_MASTER);
        registerRecipe(Potions.AWKWARD, WHArmors.TURTLE_CHESTPLATE.item, Potions.TURTLE_MASTER);

        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_BAT_WING.item, LEVITATION_POTION.potion);
        registerRecipe(LEVITATION_POTION.potion, Items.GLOWSTONE_DUST, LEVITATION_POTION_LONG.potion);
        registerRecipe(LEVITATION_POTION.potion, Items.REDSTONE, LEVITATION_POTION_FAST.potion);

        registerRecipe(Potions.AWKWARD, WHNature.CLAM_BLOCK.item, ABSORPTION_POTION.potion);
        registerRecipe(ABSORPTION_POTION.potion, Items.REDSTONE, ABSORPTION_POTION_LONG.potion);
        registerRecipe(ABSORPTION_POTION.potion, Items.GLOWSTONE_DUST, ABSORPTION_POTION_FAST.potion);

        registerRecipe(Potions.AWKWARD, Items.NAUTILUS_SHELL, Potions.STRENGTH);

        registerRecipe(Potions.AWKWARD, Items.AMETHYST_SHARD, HASTE_POTION.potion);
        registerRecipe(HASTE_POTION.potion, Items.REDSTONE, HASTE_POTION_LONG.potion);
        registerRecipe(HASTE_POTION.potion, Items.GLOWSTONE_DUST, HASTE_POTION_FAST.potion);

        registerRecipe(Potions.AWKWARD, Items.GOAT_HORN, Potions.STRENGTH);

        registerRecipe(Potions.AWKWARD, WHMiscItems.BEAST_CLAW.item, FERAL_STRENGTH.potion);
        registerRecipe(FERAL_STRENGTH.potion, Items.REDSTONE, FERAL_STRENGTH_LONG.potion);

        registerRecipe(Potions.AWKWARD, WHMiscItems.JELLY_BLOB.item, Potions.LEAPING);
        registerRecipe(Potions.AWKWARD, WHFoods.CRYSTALLIZED_HONEYDROP.item, Potions.REGENERATION);

        registerRecipe(Potions.AWKWARD, WHMiscItems.DRAGON_TOOTH.item, DRAGONHEARTED.potion);

        registerRecipe(Potions.AWKWARD, Items.PHANTOM_MEMBRANE, Potions.SLOW_FALLING);
        registerRecipe(Potions.LUCK, Items.GLOWSTONE_DUST, Potions.LONG_SLOW_FALLING);
        registerRecipe(Potions.AWKWARD, Items.FEATHER, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.CROW_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.DUCK_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SEAGULL_FEATHER.item, SLOW_FALLING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.IRON_FEATHER.item, Potions.INVISIBILITY);

        registerRecipe(Potions.AWKWARD, Items.SLIME_BALL, Potions.LEAPING);

        registerRecipe(Potions.AWKWARD, Items.HEART_OF_THE_SEA, Potions.LONG_WATER_BREATHING);

        registerRecipe(Potions.AWKWARD, WHMiscItems.LIFE_GEM.item, ABSORPTION_POTION_FAST.potion);

        registerRecipe(Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, ROT_BLIGHT_POTION.potion);

        registerRecipe(Potions.AWKWARD, Items.GLOW_BERRIES, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, Items.GLOW_INK_SAC, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, Items.GLOW_LICHEN, GLOWING.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_GLOWSQUID_TENTACLE.item, GLOWING.potion);

        registerRecipe(Potions.AWKWARD, Items.INK_SAC, BLINDNESS_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoodIngredients.RAW_SQUID_TENTACLE.item, BLINDNESS.potion);
        registerRecipe(Potions.AWKWARD, Items.FLINT, BLINDNESS_WEAK.potion);

        registerRecipe(Potions.AWKWARD, Items.AMETHYST_SHARD, HASTE_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.LAPIS_LAZULI, SOUL_FADING.potion);
        registerRecipe(Potions.AWKWARD, Items.QUARTZ, ABSORPTION_POTION.potion);
        registerRecipe(Potions.AWKWARD, Items.PRISMARINE_CRYSTALS, Potions.SWIFTNESS);
        registerRecipe(Potions.AWKWARD, Items.PRISMARINE_SHARD, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SALTPETER.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SALT.item, NAUSEA_WEAK.potion);
        registerRecipe(Potions.AWKWARD, Items.ENDER_EYE, Potions.NIGHT_VISION);
        registerRecipe(Potions.AWKWARD, Items.ENDER_PEARL, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.KELP, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHNature.GLOW_KELP.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHNature.ORANGE_KELP.item, WATER_BREATHING_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHFoods.DRIED_GLOW_KELP.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, WHFoods.DRIED_ORANGE_KELP.item, Potions.MUNDANE);
        registerRecipe(Potions.AWKWARD, Items.DRIED_KELP, Potions.MUNDANE);

        registerRecipe(Potions.AWKWARD, Items.BONE, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, Items.BONE_MEAL, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SMALL_BONE.item, Potions.HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.BONEFIN_SKELETON.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SKULL_SHARD.item, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, WHMiscItems.WITHER_BONE.item, WITHER_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.SMALL_WITHER_BONE.item, WITHER_WEAK.potion);
        registerRecipe(Potions.AWKWARD, WHMiscItems.WITHER_SKULL_SHARD.item, WITHER_STRONG.potion);
        registerRecipe(Potions.AWKWARD, Items.SKELETON_SKULL, Potions.STRONG_HARMING);
        registerRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, WITHER_VERY_STRONG.potion);

        registerRecipe(Potions.AWKWARD, WHFoods.GOLDEN_PUMPKIN_SLICE.item, Potions.STRENGTH);
        registerRecipe(Potions.AWKWARD, Items.SWEET_BERRIES, Potions.MUNDANE);
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
