package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.widener.BrewingRecipeRegistryWidener;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.registry.Registry;

public class WHPotions {
    
    public static Potion ROT_BLIGHT_POTION = registerPotion("rot_blight_potion", new Potion(new StatusEffectInstance(WHEffects.ROT_BLIGHT, 45 * 20)));

    public static Potion LEVITATION_POTION = registerPotion("levitation_potion", new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 45 * 20)));
    public static Potion LEVITATION_POTION_LONG = registerPotion("levitation_potion_long", new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 90 * 20)));
    public static Potion LEVITATION_POTION_FAST = registerPotion("levitation_potion_fast", new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 21 * 20, 1)));

    public static Potion ABSORPTION_POTION = registerPotion("absorption_potion", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 60 * 20)));
    public static Potion ABSORPTION_POTION_LONG = registerPotion("absorption_potion_long", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 120 * 20)));
    public static Potion ABSORPTION_POTION_FAST = registerPotion("absorption_potion_fast", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 30 * 20, 1)));

    public static Potion LUCK_LONG = registerPotion("luck_potion_long", new Potion(new StatusEffectInstance(StatusEffects.LUCK, 480 * 20)));
    public static Potion LUCK_FAST = registerPotion("luck_potion_fast", new Potion(new StatusEffectInstance(StatusEffects.LUCK, 150 * 20, 1)));

    public static Potion HASTE_POTION = registerPotion("haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 180 * 20)));
    public static Potion HASTE_POTION_LONG = registerPotion("haste_potion_long", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 480 * 20)));
    public static Potion HASTE_POTION_FAST = registerPotion("haste_potion_fast", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 90 * 20, 1)));

    public static Potion FERAL_STRENGTH = registerPotion("feral_strength_potion", new Potion(new StatusEffectInstance(StatusEffects.STRENGTH, 45 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 45 *20, 2)));
    public static Potion FERAL_STRENGTH_LONG = registerPotion("feral_strength_potion_long", new Potion(new StatusEffectInstance(StatusEffects.STRENGTH, 90 * 20, 2), new StatusEffectInstance(StatusEffects.NAUSEA, 90 *20, 2)));

    public static Potion DRAGONHEARTED = registerPotion("dragonhearted_potion", new Potion(new StatusEffectInstance(StatusEffects.STRENGTH, 45 * 20, 3), new StatusEffectInstance(StatusEffects.POISON, 21 *20, 1)));

    public static Potion GLOWING = registerPotion("glowing_potion", new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 30 * 20)));
    public static Potion SOUL_FADING = registerPotion("soul_fading_potion", new Potion(new StatusEffectInstance(WHEffects.SOUL_FADING, 10 * 20)));

    public static Potion HASTE_WEAK = registerPotion("weak_haste_potion", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 45 * 20)));
    public static Potion WITHER_WEAK = registerPotion("weak_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 5 * 20)));
    public static Potion WITHER_STRONG = registerPotion("strong_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 15 * 20)));
    public static Potion WITHER_VERY_STRONG = registerPotion("very_strong_wither_potion", new Potion(new StatusEffectInstance(StatusEffects.WITHER, 30 * 20)));
    public static Potion BLINDNESS_WEAK = registerPotion("weak_blindness_potion", new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 5 * 20)));
    public static Potion BLINDNESS = registerPotion("blindness_potion", new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 15 * 20)));
    public static Potion SLOW_FALLING_WEAK = registerPotion("weak_slow_falling_potion", new Potion(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 30 * 20)));
    public static Potion NAUSEA_WEAK = registerPotion("weak_nausea_potion", new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 15 * 20)));
    public static Potion WATER_BREATHING_WEAK = registerPotion("weak_water_breathing_potion", new Potion(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 30 * 20)));

    public static void initialize() {
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, WHPotions.ROT_BLIGHT_POTION);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SCUTE, net.minecraft.potion.Potions.TURTLE_MASTER);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHArmors.TURTLE_CHESTPLATE, net.minecraft.potion.Potions.TURTLE_MASTER);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_BAT_WING.item, LEVITATION_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.LEVITATION_POTION, Items.GLOWSTONE_DUST, WHPotions.LEVITATION_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.LEVITATION_POTION, Items.REDSTONE, WHPotions.LEVITATION_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.CLAM_BLOCK.item, ABSORPTION_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.ABSORPTION_POTION, Items.REDSTONE, WHPotions.ABSORPTION_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.ABSORPTION_POTION, Items.GLOWSTONE_DUST, WHPotions.ABSORPTION_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.NAUTILUS_SHELL, Potions.STRENGTH);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.AMETHYST_SHARD, WHPotions.HASTE_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.HASTE_POTION, Items.REDSTONE, WHPotions.HASTE_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.HASTE_POTION, Items.GLOWSTONE_DUST, WHPotions.HASTE_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GOAT_HORN, net.minecraft.potion.Potions.STRENGTH);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.BEAST_CLAW.item, WHPotions.FERAL_STRENGTH);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.FERAL_STRENGTH, Items.REDSTONE, WHPotions.FERAL_STRENGTH_LONG);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.JELLY_BLOB.item, net.minecraft.potion.Potions.LEAPING);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.CRYSTALLIZED_HONEYDROP.item, net.minecraft.potion.Potions.REGENERATION);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.DRAGON_TOOTH.item, WHPotions.DRAGONHEARTED);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.PHANTOM_MEMBRANE, Potions.SLOW_FALLING);
        registerRecipe(net.minecraft.potion.Potions.LUCK, Items.GLOWSTONE_DUST, Potions.LONG_SLOW_FALLING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.FEATHER, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.CROW_FEATHER.item, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.DUCK_FEATHER.item, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SEAGULL_FEATHER.item, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.IRON_FEATHER.item, Potions.INVISIBILITY);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SLIME_BALL, Potions.LEAPING);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.HEART_OF_THE_SEA, Potions.LONG_WATER_BREATHING);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.LIFE_GEM.item, WHPotions.ABSORPTION_POTION_FAST);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, WHPotions.ROT_BLIGHT_POTION);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GLOW_BERRIES, WHPotions.GLOWING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GLOW_INK_SAC, WHPotions.GLOWING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GLOW_LICHEN, WHPotions.GLOWING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_GLOWSQUID_TENTACLE.item, WHPotions.GLOWING);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.INK_SAC, WHPotions.BLINDNESS_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_SQUID_TENTACLE.item, WHPotions.BLINDNESS);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.FLINT, WHPotions.BLINDNESS_WEAK);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.AMETHYST_SHARD, WHPotions.HASTE_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.LAPIS_LAZULI, WHPotions.SOUL_FADING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.QUARTZ, WHPotions.ABSORPTION_POTION);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.PRISMARINE_CRYSTALS, Potions.SWIFTNESS);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.PRISMARINE_SHARD, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SALTPETER.item, WHPotions.NAUSEA_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SALT.item, WHPotions.NAUSEA_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.ENDER_EYE, Potions.NIGHT_VISION);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.ENDER_PEARL, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.KELP, WHPotions.WATER_BREATHING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.GLOW_KELP.asItem(), WHPotions.WATER_BREATHING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.ORANGE_KELP.asItem(), WHPotions.WATER_BREATHING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.DRIED_GLOW_KELP.item, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.DRIED_ORANGE_KELP.item, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.DRIED_KELP, Potions.MUNDANE);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.BONE, Potions.HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.BONE_MEAL, Potions.HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SMALL_BONE.item, Potions.HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.BONEFIN_SKELETON.item, Potions.STRONG_HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SKULL_SHARD.item, Potions.STRONG_HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.WITHER_BONE.item, WHPotions.WITHER_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SMALL_WITHER_BONE.item, WHPotions.WITHER_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.WITHER_SKULL_SHARD.item, WHPotions.WITHER_STRONG);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SKELETON_SKULL, Potions.STRONG_HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, WHPotions.WITHER_VERY_STRONG);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.GOLDEN_PUMPKIN_SLICE.item, Potions.STRENGTH);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SWEET_BERRIES, Potions.MUNDANE);
    }
    
    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registry.POTION, Main.makeId(name), potion);
    }
    
    private static void registerRecipe(Potion input, Item item, Potion output) {
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, WHPotions.ROT_BLIGHT_POTION);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SCUTE, net.minecraft.potion.Potions.TURTLE_MASTER);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHArmors.TURTLE_CHESTPLATE, net.minecraft.potion.Potions.TURTLE_MASTER);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_BAT_WING.item, LEVITATION_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.LEVITATION_POTION, Items.GLOWSTONE_DUST, WHPotions.LEVITATION_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.LEVITATION_POTION, Items.REDSTONE, WHPotions.LEVITATION_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.CLAM_BLOCK.item, ABSORPTION_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.ABSORPTION_POTION, Items.REDSTONE, WHPotions.ABSORPTION_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.ABSORPTION_POTION, Items.GLOWSTONE_DUST, WHPotions.ABSORPTION_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.NAUTILUS_SHELL, Potions.STRENGTH);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.AMETHYST_SHARD, WHPotions.HASTE_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.HASTE_POTION, Items.REDSTONE, WHPotions.HASTE_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.HASTE_POTION, Items.GLOWSTONE_DUST, WHPotions.HASTE_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GOAT_HORN, net.minecraft.potion.Potions.STRENGTH);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.BEAST_CLAW.item, WHPotions.FERAL_STRENGTH);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.FERAL_STRENGTH, Items.REDSTONE, WHPotions.FERAL_STRENGTH_LONG);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.JELLY_BLOB.item, net.minecraft.potion.Potions.LEAPING);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.CRYSTALLIZED_HONEYDROP.item, net.minecraft.potion.Potions.REGENERATION);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.DRAGON_TOOTH.item, WHPotions.DRAGONHEARTED);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.PHANTOM_MEMBRANE, Potions.SLOW_FALLING);
        registerRecipe(net.minecraft.potion.Potions.LUCK, Items.GLOWSTONE_DUST, Potions.LONG_SLOW_FALLING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.FEATHER, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.CROW_FEATHER.item, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.DUCK_FEATHER.item, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SEAGULL_FEATHER.item, WHPotions.SLOW_FALLING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.IRON_FEATHER.item, Potions.INVISIBILITY);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SLIME_BALL, Potions.LEAPING);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.HEART_OF_THE_SEA, Potions.LONG_WATER_BREATHING);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.LIFE_GEM.item, WHPotions.ABSORPTION_POTION_FAST);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, WHPotions.ROT_BLIGHT_POTION);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GLOW_BERRIES, WHPotions.GLOWING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GLOW_INK_SAC, WHPotions.GLOWING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GLOW_LICHEN, WHPotions.GLOWING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_GLOWSQUID_TENTACLE.item, WHPotions.GLOWING);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.INK_SAC, WHPotions.BLINDNESS_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_SQUID_TENTACLE.item, WHPotions.BLINDNESS);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.FLINT, WHPotions.BLINDNESS_WEAK);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.AMETHYST_SHARD, WHPotions.HASTE_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.LAPIS_LAZULI, WHPotions.SOUL_FADING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.QUARTZ, WHPotions.ABSORPTION_POTION);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.PRISMARINE_CRYSTALS, Potions.SWIFTNESS);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.PRISMARINE_SHARD, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SALTPETER.item, WHPotions.NAUSEA_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SALT.item, WHPotions.NAUSEA_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.ENDER_EYE, Potions.NIGHT_VISION);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.ENDER_PEARL, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.KELP, WHPotions.WATER_BREATHING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.GLOW_KELP.asItem(), WHPotions.WATER_BREATHING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.ORANGE_KELP.asItem(), WHPotions.WATER_BREATHING_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.DRIED_GLOW_KELP.item, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.DRIED_ORANGE_KELP.item, Potions.MUNDANE);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.DRIED_KELP, Potions.MUNDANE);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.BONE, Potions.HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.BONE_MEAL, Potions.HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SMALL_BONE.item, Potions.HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.BONEFIN_SKELETON.item, Potions.STRONG_HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SKULL_SHARD.item, Potions.STRONG_HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.WITHER_BONE.item, WHPotions.WITHER_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.SMALL_WITHER_BONE.item, WHPotions.WITHER_WEAK);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.WITHER_SKULL_SHARD.item, WHPotions.WITHER_STRONG);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SKELETON_SKULL, Potions.STRONG_HARMING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, WHPotions.WITHER_VERY_STRONG);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.GOLDEN_PUMPKIN_SLICE.item, Potions.STRENGTH);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SWEET_BERRIES, Potions.MUNDANE);


    }
}
