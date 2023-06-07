package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.widener.BrewingRecipeRegistryWidener;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
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

    public static void initialize() {
        registerRecipe(net.minecraft.potion.Potions.WATER, WHFoodIngredients.MONSTER_HEART.item, WHPotions.ROT_BLIGHT_POTION);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SCUTE, net.minecraft.potion.Potions.TURTLE_MASTER);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_BAT_WING.item, WHPotions.LEVITATION_POTION);
        registerRecipe(WHPotions.LEVITATION_POTION, Items.GLOWSTONE_DUST, WHPotions.LEVITATION_POTION_LONG);
        registerRecipe(WHPotions.LEVITATION_POTION, Items.REDSTONE, WHPotions.LEVITATION_POTION_FAST);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.CLAM_BLOCK.item, WHPotions.ABSORPTION_POTION);
        registerRecipe(WHPotions.ABSORPTION_POTION, Items.GLOWSTONE_DUST, WHPotions.ABSORPTION_POTION_LONG);
        registerRecipe(WHPotions.ABSORPTION_POTION, Items.REDSTONE, WHPotions.ABSORPTION_POTION_FAST);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.NAUTILUS_SHELL, net.minecraft.potion.Potions.LUCK);
        registerRecipe(net.minecraft.potion.Potions.LUCK, Items.GLOWSTONE_DUST, WHPotions.LUCK_LONG);
        registerRecipe(net.minecraft.potion.Potions.LUCK, Items.REDSTONE, WHPotions.LUCK_FAST);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.AMETHYST_SHARD, WHPotions.HASTE_POTION);
        registerRecipe(WHPotions.HASTE_POTION, Items.GLOWSTONE_DUST, WHPotions.HASTE_POTION_LONG);
        registerRecipe(WHPotions.HASTE_POTION, Items.REDSTONE, WHPotions.HASTE_POTION_FAST);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GOAT_HORN, net.minecraft.potion.Potions.STRENGTH);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.BEAST_CLAW, WHPotions.FERAL_STRENGTH);
        registerRecipe(WHPotions.FERAL_STRENGTH, Items.GLOWSTONE_DUST, WHPotions.FERAL_STRENGTH_LONG);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.JELLY_BLOB, net.minecraft.potion.Potions.LEAPING);
        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.CRYSTALLIZED_HONEYDROP.item, net.minecraft.potion.Potions.REGENERATION);

        registerRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.DRAGON_TOOTH, WHPotions.DRAGONHEARTED);
    }
    
    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registry.POTION, Main.makeId(name), potion);
    }
    
    private static void registerRecipe(Potion input, Item item, Potion output) {
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.MONSTER_HEART.item, WHPotions.ROT_BLIGHT_POTION);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.SCUTE, net.minecraft.potion.Potions.TURTLE_MASTER);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoodIngredients.RAW_BAT_WING.item, LEVITATION_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.LEVITATION_POTION, Items.GLOWSTONE_DUST, WHPotions.LEVITATION_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.LEVITATION_POTION, Items.REDSTONE, WHPotions.LEVITATION_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHNature.CLAM_BLOCK.item, ABSORPTION_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.ABSORPTION_POTION, Items.GLOWSTONE_DUST, WHPotions.ABSORPTION_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.ABSORPTION_POTION, Items.REDSTONE, WHPotions.ABSORPTION_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.NAUTILUS_SHELL, net.minecraft.potion.Potions.LUCK);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.LUCK, Items.GLOWSTONE_DUST, WHPotions.LUCK_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.LUCK, Items.REDSTONE, WHPotions.LUCK_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.AMETHYST_SHARD, WHPotions.HASTE_POTION);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.HASTE_POTION, Items.GLOWSTONE_DUST, WHPotions.HASTE_POTION_LONG);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.HASTE_POTION, Items.REDSTONE, WHPotions.HASTE_POTION_FAST);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, Items.GOAT_HORN, net.minecraft.potion.Potions.STRENGTH);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.BEAST_CLAW, WHPotions.FERAL_STRENGTH);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(WHPotions.FERAL_STRENGTH, Items.GLOWSTONE_DUST, WHPotions.FERAL_STRENGTH_LONG);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.JELLY_BLOB, net.minecraft.potion.Potions.LEAPING);
        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHFoods.CRYSTALLIZED_HONEYDROP.item, net.minecraft.potion.Potions.REGENERATION);

        BrewingRecipeRegistryWidener.invokeRegisterPotionRecipe(net.minecraft.potion.Potions.AWKWARD, WHMiscItems.DRAGON_TOOTH, WHPotions.DRAGONHEARTED);
    }
}
