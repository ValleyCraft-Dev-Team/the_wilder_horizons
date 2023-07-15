package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.block.AncientFlowerAliasedBlock;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.interfaces.Nourishment;
import net.linkle.wilder_horizons.item.*;
import net.linkle.wilder_horizons.util.*;
import net.minecraft.entity.effect.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.*;
import net.minecraft.util.registry.Registry;

import net.linkle.wilder_horizons.Main;

import java.util.Locale;

import static net.linkle.wilder_horizons.init.init_exterior.WHGroups.WH_FOOD;

public enum WHFoodIngredients implements ItemEnum {

    /**recipes done**/
    PURIFIED_WATER(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 2, Nourishment.NORMAL).hideTooltip()),
    BRINE(new Tier1Bottle(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 1, Nourishment.POOR, StatusEffects.NAUSEA).hideTooltip()),
    MILK(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 1, Nourishment.EXCELLENT).setMilk()),
    BUCKET_OF_EGG(new AlphaModItem(settings().recipeRemainder(Items.BUCKET).maxCount(1))),
    PURPLE_MUSHROOM_OIL(new Tier1Bottle(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 2, Nourishment.POOR, StatusEffects.SLOWNESS).hideTooltip()),
    BUTTER(new FoodItem(settings(), 0, Nourishment.POOR)),

    GLOW_BERRY_JUICE(new GlintBottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 4, Nourishment.LOW, new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5 * 20)))
    .addText("item.wilder_horizons.dishes.tooltip", Formatting.GRAY).addText("item.wilder_horizons.dishes.tooltip_8", Formatting.GRAY)),

    ALOE_VERA(new AliasedBlockItem(WHNature.ALOE_VERAS.block, settings().food(Foods.create(3, Nourishment.LOW)))),
    
    AMETHYSTLE(new FoodItem(settings(), 2, Nourishment.LOW, new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5 * 20)))
            .addText("item.wilder_horizons.dishes.tooltip").addText("item.wilder_horizons.dishes.tooltip_10")),

    //ENDURA_CARROT(new FoodItem(settings(), 5, Nourishment.NORMAL,  new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5 * 20)))
    //        .addText("item.wilder_horizons.dishes.tooltip").addText("item.wilder_horizons.dishes.tooltip_9")),
    //HEARTY_BEETROOT(new FoodItem(settings(), 4, Nourishment.NORMAL,  new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5 * 20)))
    //        .addText("item.wilder_horizons.dishes.tooltip").addText("item.wilder_horizons.dishes.tooltip_6")),
    ONION(new FoodItem(settings(), 3, Nourishment.LOW)),

    //dropped by husk
    FIRE_PEPPER(new FoodItem(settings(), 3, Nourishment.LOW)),

    //desert temple
    MAIZE(new AliasedBlockItem(WHNature.MAIZE.block, settings().rarity(Rarity.RARE).food(Foods.create(3, Nourishment.LOW)))),
    ANCIENT_FLOWER(new AncientFlowerAliasedBlock(WHNature.ANCIENT_FLOWER_BLOCK.block, settings().rarity(Rarity.RARE).food(Foods.create(4, Nourishment.GOOD)))),
    //ANCIENT_FLOWER(new FoodItem(settings(), 6, 0.7f, new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5 * 20)))
    //        .addText("item.wilder_horizons.dishes.tooltip").addText("item.wilder_horizons.dishes.tooltip_7")),

    //dropped by miner zombie
    CAVE_ROOT(new FoodItem(settings(), 4, Nourishment.LOW)),
    MINERS_LETTUCE(new AliasedBlockItem(WHNature.MINERS_LETTUCES.block, settings().food(Foods.create(3, Nourishment.LOW)))),

    //jungle temple
    RAW_RICE(new FoodItem(settings(), 2, Nourishment.POOR)),
    
    //SYRUPY_HONEYCOMB(new FoodItem(settings(), 3, Nourishment.LOW, new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 20)))
    //.addText("item.wilder_horizons.dishes.tooltip").addText("item.wilder_horizons.dishes.tooltip_5")),
    
    PUMPKIN_SLICE(new FoodItem(settings(), 2, Nourishment.LOW)),
    //SUNFLOWER_SEEDS(new FoodItem(settings(), 1, Nourishment.NORMAL)),

    RAW_ABYSSWATCHER(new FoodItem(settings(), 3, Nourishment.POOR)),
    RAW_STONEROLLER_MINNOW(new FoodItem(settings(), 1, Nourishment.POOR)),
    RAW_SARDINE(new FoodItem(settings(), 1, Nourishment.POOR)),
    RAW_RED_PORGY(new FoodItem(settings(), 2, Nourishment.POOR)),
    RAW_PERCH(new FoodItem(settings(), 2, Nourishment.POOR)),
    RAW_GOLDFIN(new FoodItem(settings(), 1, Nourishment.POOR)),
    RAW_TRANSLUCENT_LIONFISH(new FoodItem(settings(), 3, Nourishment.POOR)),

    RAW_SQUID_TENTACLE(new FoodItem(settings(), 2, Nourishment.POOR)),
    RAW_GLOWSQUID_TENTACLE(new FoodItem(settings(), 2, Nourishment.POOR, new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 5 * 20)))
            .addText("item.wilder_horizons.dishes.tooltip").addText("item.wilder_horizons.dishes.tooltip_4")),
    RAW_FROG_LEGS(new FoodItem(settings(), 2, Nourishment.POOR)),

    //RAW_LOBSTER(new NegativeFoodItem_3_Effects(settings(), 3, Nourishment.POOR, StatusEffects.HUNGER, StatusEffects.POISON, StatusEffects.NAUSEA).hideTooltip()),
    //RAW_MOSSY_CRAB(new NegativeFoodItem_3_Effects(settings(), 3, Nourishment.POOR, StatusEffects.HUNGER, StatusEffects.POISON, StatusEffects.NAUSEA).hideTooltip()),
    RAW_WORM(new FoodItem(settings(), 1, Nourishment.POOR)),

    RAW_BACON(new FoodItem(settings(), 2, Nourishment.POOR, true)),
    
    RAW_BIRD_THIGH(new FoodItem(settings(), 2, Nourishment.POOR, true)),
    RAW_BEAST_LIVER(new FoodItem(settings(), 4, Nourishment.LOW, true)),
    RAW_BEAST_HEART(new FoodItem(settings(), 4, Nourishment.LOW, true)),
    RAW_CANID(new FoodItem(settings(), 3, Nourishment.LOW, true)),
    RAW_TENDERLOIN(new FoodItem(settings(), 4, Nourishment.LOW, true)),
    RAW_BAT_WING(new FoodItem(settings(), 2, Nourishment.POOR, true)),
    RAW_CAVE_MAGGOT(new FoodItem(settings(), 1, Nourishment.POOR, true)),
    RAW_SILVERFISH(new FoodItem(settings(), 1, Nourishment.POOR, true)),
    RAW_PHANTOM_EYE(new NegativeFoodItem_2_Effects(settings(), 3, Nourishment.POOR, StatusEffects.NAUSEA, StatusEffects.NIGHT_VISION).hideTooltip()),
    RAW_TRIPE(new NegativeFoodItem_2_Effects(settings(), 6, Nourishment.LOW, StatusEffects.HUNGER, StatusEffects.NAUSEA).hideTooltip()),
    MONSTER_HEART(new NegativeFoodItem_2_Effects(settings(), 8, Nourishment.LOW, StatusEffects.MINING_FATIGUE, StatusEffects.HUNGER).hideTooltip()),
    //INFECTED_MONSTER_HEART(new NegativeFoodItem_3_Effects(settings(), 6, Nourishment.LOW, StatusEffects.MINING_FATIGUE, StatusEffects.HUNGER, ModEffects.ROT_BLIGHT).hideTooltip()),
    MONSTER_GUTS(new NegativeFoodItem_2_Effects(settings(), 6, Nourishment.LOW, StatusEffects.BLINDNESS, StatusEffects.HUNGER).hideTooltip()),
    //INFECTED_MONSTER_GUTS(new NegativeFoodItem_3_Effects(settings(), 6, Nourishment.LOW, StatusEffects.BLINDNESS, StatusEffects.HUNGER, ModEffects.ROT_BLIGHT).hideTooltip()),
    MONSTER_LIVER(new NegativeFoodItem_2_Effects(settings(), 3, Nourishment.LOW, StatusEffects.NAUSEA, StatusEffects.HUNGER).hideTooltip()),
    //INFECTED_MONSTER_LIVER(new NegativeFoodItem_3_Effects(settings(), 3, Nourishment.LOW, StatusEffects.NAUSEA, StatusEffects.HUNGER, ModEffects.ROT_BLIGHT).hideTooltip()),
    //ZOD(new NegativeFoodItem_3_Effects(settings().group(Groups.INGREDIENTS), 5, Nourishment.POOR, StatusEffects.HUNGER, ModEffects.ROT_BLIGHT, StatusEffects.NAUSEA).hideTooltip()),
    RAW_ENDERMAN_EYE(new Tier1NormalNoText(settings(), 3, Nourishment.LOW, StatusEffects.WEAKNESS).hideTooltip()),
    //ENDER_DRAGON_EYE(new EnderDragonEyeFoodItem(settings().rarity(Rarity.EPIC).fireproof(), 3, Nourishment.LOW, StatusEffects.POISON, StatusEffects.BLINDNESS, WHEffects.ROT_BLIGHT.effect).hideTooltip()),
    //ENDER_DRAGON_GLAND(new NegativeFoodItem_3_Effects(settings().rarity(Rarity.EPIC).fireproof(), 6, Nourishment.LOW, StatusEffects.BLINDNESS, StatusEffects.HUNGER, StatusEffects.NAUSEA).hideTooltip()),
    RAW_ENDERMITE(new EndermiteFoodItem(settings(), 3, Nourishment.POOR, StatusEffects.POISON, StatusEffects.BLINDNESS, StatusEffects.NAUSEA).hideTooltip()),

    HARDTACK_DOUGH(new FoodItem(settings(), 1, Nourishment.POOR)),
    BREAD_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    CORN_BREAD_DOUGH(new FoodItem(settings(), 2, Nourishment.POOR)),
    COOKIE_DOUGH(new FoodItem(settings(), 1, Nourishment.POOR)),
    SUGAR_COOKIE_DOUGH(new FoodItem(settings(), 1, Nourishment.POOR)),
    CHOCOLATE_CHUNK_COOKIE_DOUGH(new FoodItem(settings(), 1, Nourishment.POOR)),
    PUMPKIN_SPICE_COOKIE_DOUGH(new FoodItem(settings(), 1, Nourishment.POOR)),
    SALMON_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    PUMPKIN_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    CHOCOLATE_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    APPLE_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    SWEET_BERRY_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    GLOW_BERRY_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    CHORUS_FRUIT_PIE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    ENCHANTED_APPLE_PIE_DOUGH(new EnchantedFoodItemNoEffect(settings(), 3, Nourishment.POOR)),
    VANILLA_FROSTING(new BowlItem(settings().maxCount(1).recipeRemainder(Items.BOWL), 4, Nourishment.POOR)),
    CAKE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR)),
    CHOCOLATE_CAKE_DOUGH(new FoodItem(settings(), 3, Nourishment.POOR));

    /**list new items below here, move above after adding a recipe for them**/

    /** Called from {@link WHMiscItems} */

    public static void initialize() {
        
    }

    private static Item.Settings settings() {
        return new Item.Settings().group(WH_FOOD);
    }

    // ### Enum Codes ###
    
    public final Item item;
    public final Identifier id;
    
    private WHFoodIngredients(Item item) {
        this.item = Registry.register(Registry.ITEM, id = Main.makeId(name().toLowerCase(Locale.ROOT)), item);
    }
    
    @Override
    public Item asItem() {
        return item;
    }

    @Override
    public Identifier getId() {
        return id;
    }
}
