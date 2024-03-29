package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.interfaces.Nourishment;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static net.linkle.wilder_horizons.init.init_exterior.WHGroups.WH_FOOD;
import static net.minecraft.util.Rarity.EPIC;

public enum WHFoods implements ItemEnum {

    /**recipes done**/
    MEAT_JERKY(new FoodItem(settings(), 4, Nourishment.GOOD, true)),
    CURED_FISH(new FoodItem(settings(), 3, Nourishment.NORMAL, true)),

    BAKED_APPLE(new FoodItem(settings(), 6, Nourishment.NORMAL)),
    BAKED_BEETROOT(new FoodItem(settings(), 2, Nourishment.NORMAL)),
    BAKED_CARROT(new FoodItem(settings(), 5, Nourishment.NORMAL)),
    BAKED_FIRE_PEPPER(new FoodItem(settings(), 5, Nourishment.NORMAL)),
    BAKED_PUMPKIN_SLICE(new FoodItem(settings(), 4, Nourishment.NORMAL)),
    BAKED_MELON_SLICE(new FoodItem(settings(), 3, Nourishment.NORMAL)),
    BAKED_ONION(new FoodItem(settings(), 4, Nourishment.NORMAL)),
    BAKED_SWEET_BERRIES(new FoodItem(settings(), 4, Nourishment.NORMAL)),
    BAKED_GLOW_BERRIES(new FoodItem(settings(), 4, Nourishment.NORMAL)),
    BAKED_SEEDS(new FoodItem(settings(), 2, Nourishment.NORMAL)),
    BAKED_BAMBOO(new FoodItem(settings(), 2, Nourishment.NORMAL)),
    COOKED_RICE(new FoodItem(settings(), 4, Nourishment.NORMAL)),
    COOKED_CAVE_ROOT(new FoodItem(settings(), 5, Nourishment.NORMAL)),
    DRIED_ORANGE_KELP(new FoodItem(settings(), 1, Nourishment.NORMAL)),
    DRIED_GLOW_KELP(new FoodItem(settings(), 1, Nourishment.NORMAL)),
    COOKED_TROPICAL_FISH(new FoodItem(settings(), 4, Nourishment.GOOD)),
    COOKED_ABYSSWATCHER(new FoodItem(settings(), 6, Nourishment.GOOD)),
    COOKED_STONEROLLER_MINNOW(new FoodItem(settings(), 3, Nourishment.GOOD)),
    COOKED_SARDINE(new FoodItem(settings(), 3, Nourishment.GOOD)),
    COOKED_RED_PORGY(new FoodItem(settings(), 4, Nourishment.GOOD)),
    COOKED_PERCH(new FoodItem(settings(), 4, Nourishment.GOOD)),
    COOKED_GOLDFIN(new FoodItem(settings(), 2, Nourishment.POOR)),
    COOKED_TRANSLUCENT_LIONFISH(new FoodItem(settings(), 4, Nourishment.EXCELLENT)),

    COOKED_CLAM(new FoodItem(settings(), 4, Nourishment.NORMAL)),
    COOKED_SEA_URCHIN(new FoodItem(settings(), 6, Nourishment.GOOD)),
    COOKED_SQUID(new FastFoodItem(settings(), 4, Nourishment.NORMAL)),
    COOKED_FROG_LEGS(new FastFoodItem(settings(), 3, Nourishment.NORMAL)),

    //COOKED_WORM(new FoodItem(settings(), 2, Nourishment.LOW)),
    COOKED_SILVERFISH(new FoodItem(settings(), 3, Nourishment.NORMAL, true)),
    //COOKED_CAVE_MAGGOT(new FoodItem(settings(), 4, Nourishment.NORMAL, true)),
    COOKED_PHANTOM(new FoodItem(settings(), 6, Nourishment.NORMAL)),
    COOKED_BIRD(new FastFoodItem(settings(), 3, Nourishment.NORMAL, true)),
    COOKED_BACON(new FastFoodItem(settings(), 3, Nourishment.NORMAL, true)),
    COOKED_BAT(new FastFoodItem(settings(), 3, Nourishment.NORMAL, true)),
    FRIED_EGG(new FoodItem(settings(), 4, Nourishment.NORMAL, true)),
    HARD_BOILED_EGG(new FoodItem(settings(), 6, Nourishment.NORMAL, true)),
    COOKED_BEAST_LIVER(new FoodItem(settings(), 8, Nourishment.GOOD, true)),
    COOKED_BEAST_HEART(new FoodItem(settings(), 10, Nourishment.GOOD, true)),
    COOKED_CANID(new FoodItem(settings(), 6, Nourishment.GOOD, true)),
    //COOKED_TENDERLOIN(new FoodItem(settings(), 8, Nourishment.GOOD, true)),
    COOKED_TRIPE(new FoodItem(settings(), 8, Nourishment.GOOD, true)),
    DOG_BISCUIT(new FoodItem(settings().group(WH_FOOD), 2, Nourishment.NORMAL, true)),
    HARDTACK(new FastFoodItem(settings(), 3, Nourishment.POOR)),
    CORN_BREAD(new FoodItem(settings(), 3, Nourishment.NORMAL)),
    CHOCOLATE(new FastFoodItem(settings(), 2, Nourishment.LOW)),
    CRYSTALLIZED_HONEYDROP(new FastFoodItem(settings(), 2, Nourishment.POOR)),
    MINERS_DELIGHT(new NegativeFoodItem_1_Effect(settings(), 2, Nourishment.POOR, StatusEffects.HASTE)),
    CAKE_SLICE(new FastFoodItem(settings(), 2, Nourishment.POOR)),
    CHOCOLATE_CAKE_SLICE(new FastFoodItem(settings(), 2, Nourishment.POOR)),
    SUGAR_COOKIE(new FastFoodItem(settings().maxCount(16), 1, Nourishment.POOR)),
    CHOCOLATE_CHUNK_COOKIE(new FastFoodItem(settings().maxCount(16), 1, Nourishment.POOR)),
    PUMPKIN_SPICE_COOKIE(new FastFoodItem(settings().maxCount(16), 1, Nourishment.POOR)),
    VANILLA_PUMPKIN_SPICE_COOKIE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.POOR)),
    CHOCOLATE_PUMPKIN_SPICE_COOKIE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.POOR)),
    SALMON_PIE(new FoodItem(settings(), 10, Nourishment.NORMAL)),
    CHICKEN_POT_PIE(new FoodItem(settings(), 10, Nourishment.NORMAL)),
    PUMPKIN_PIE_SLICE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.LOW)),
    APPLE_PIE(new FoodItem(settings(), 8, Nourishment.LOW)),
    APPLE_PIE_SLICE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.LOW)),
    SWEET_BERRY_PIE(new FoodItem(settings(), 8, Nourishment.LOW)),
    SWEET_BERRY_PIE_SLICE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.LOW)),
    GLOW_BERRY_PIE(new FoodItem(settings(), 8, Nourishment.LOW)),
    GLOW_BERRY_PIE_SLICE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.LOW)),
    CHOCOLATE_PIE(new FoodItem(settings(), 8, Nourishment.LOW)),
    CHOCOLATE_PIE_SLICE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.LOW)),
    CHORUS_FRUIT_PIE(new FoodItem(settings(), 9, Nourishment.LOW)),
    CHORUS_FRUIT_PIE_SLICE(new FastFoodItem(settings().maxCount(16), 2, Nourishment.LOW)),
    CHOCOLATE_MILK(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 4, Nourishment.LOW).setMilk()),
    ATOLE_MILK(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 4, Nourishment.LOW).setMilk()),
    EGGNOG(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 6, Nourishment.LOW).setMilk()),
    APPLE_JUICE(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 8, Nourishment.LOW)),
    CARROT_JUICE(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 8, Nourishment.LOW)),
    SWEET_BERRY_JUICE(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 8, Nourishment.LOW)),
    CHORUS_FRUIT_JUICE(new BottleItem(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 8, Nourishment.LOW)),
    ALOE_VERA_JUICE(new Tier0Bottle(settings().recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE).maxCount(16), 6, Nourishment.LOW, StatusEffects.REGENERATION)),
    CAVE_ROOT_STIR_FRY(new BowlItem(settings().maxCount(1), 9, Nourishment.NORMAL)),
    NETHER_WART_STIR_FRY(new BowlItem(settings().maxCount(1), 9, Nourishment.NORMAL)),
    COD_GEFILTE(new BowlItem(settings(), 10, Nourishment.NORMAL)),
    SPICY_POTATOES_AND_BAT(new BowlItem(settings(), 9, Nourishment.NORMAL)),
    SPICY_POTATOES_AND_CARROTS(new BowlItem(settings(), 8, Nourishment.NORMAL)),
    BROTH(new BowlItem(settings().maxCount(1), 6, Nourishment.LOW)),
    BROTH_VEGETABLE(new BowlItem(settings().maxCount(1), 4, Nourishment.LOW)),
    STIR_FRIED_MONSTER_GUTS(new BowlItem(settings().maxCount(1), 8, Nourishment.NORMAL)),
    SAUTEED_EYES_AND_MUSHROOMS(new BowlItem(settings(), 8, Nourishment.NORMAL)),
    MONSTER_STEW(new BowlItem(settings().maxCount(1), 7, Nourishment.NORMAL)),
    CREEPER_SOUP(new BowlItem(settings().maxCount(1).rarity(Rarity.UNCOMMON), 5, Nourishment.NORMAL)),
    SLIME_SOUP(new BowlItem(settings().maxCount(1), 5, Nourishment.NORMAL)),
    BEEF_STEW(new BowlItem(settings().maxCount(1), 9, Nourishment.NORMAL)),
    KELP_SALAD(new BowlItem(settings().maxCount(1), 4, Nourishment.POOR)),
    //BEETROOT_REDUCTION(new FoodItem(settings(), 5, Nourishment.NORMAL)),
    CHEESE_SLICE(new FoodItem(settings(), 2, Nourishment.POOR)),
    //BROWN_MUSHROOM_SALAD(new BowlItem(settings().maxCount(1), 4, Nourishment.NORMAL)),
    //ORANGE_MUSHROOM_SALAD(new BowlItem(settings().maxCount(1), 4, Nourishment.NORMAL)),
    //RED_MUSHROOM_SALAD(new BowlItem(settings().maxCount(1), 4, Nourishment.NORMAL)),
    //BROWN_MUSHROOM_SKEWER(new FastFoodItem(settings().maxCount(16), 8, Nourishment.NORMAL)),
    //ORANGE_MUSHROOM_SKEWER(new FastFoodItem(settings().maxCount(16), 8, Nourishment.NORMAL)),
    //RED_MUSHROOM_SKEWER(new FastFoodItem(settings().maxCount(16), 8, Nourishment.NORMAL)),
    FRUIT_MIX(new BowlItem(settings().maxCount(1), 7, Nourishment.NORMAL)),
    VEGETABLE_MIX(new BowlItem(settings().maxCount(1), 7, Nourishment.NORMAL)),
    SAVORY_BREAKFAST(new BowlItem(settings().maxCount(1), 7, Nourishment.NORMAL)),
    HEARTY_BREAKFAST(new BowlItem(settings().maxCount(1), 7, Nourishment.NORMAL)),
    FRIED_RICE_AND_EGGS(new BowlItem(settings().maxCount(1), 6, Nourishment.EXCELLENT)),
    PUMPKIN_SOUP(new BowlItem(settings().maxCount(1), 8, Nourishment.EXCELLENT)),
    //FUNGUS_STEW(new BowlItem(settings().maxCount(1), 8, Nourishment.NORMAL)),
    CHICKEN_SOUP(new BowlItem(settings().maxCount(1), 9, Nourishment.NORMAL)),
    SQUID_SOUP(new BowlItem(settings().maxCount(1), 6, Nourishment.NORMAL)),
    SEA_URCHIN_CHOWDER(new FoodItem(settings().maxCount(1), 6, Nourishment.EXCELLENT)),
    CLAM_CHOWDER(new BowlItem(settings().maxCount(1), 6, Nourishment.NORMAL)),
    FISH_PLATTER(new BowlItem(settings().maxCount(1), 6, Nourishment.NORMAL)),
    TOAST(new FastFoodItem(settings(), 1, Nourishment.NORMAL)),
    EGGS_ON_TOAST(new FoodItem(settings(), 5, Nourishment.EXCELLENT)),
    GRILLED_CHEESE(new FoodItem(settings(), 9, Nourishment.LOW)),
    SANDWICH_FISH(new FoodItem(settings(), 9, Nourishment.EXCELLENT)),
    SANDWICH_CHICKEN(new FoodItem(settings(), 9, Nourishment.EXCELLENT)),
    SANDWICH_MUTTON(new FoodItem(settings(), 9, Nourishment.EXCELLENT)),
    SANDWICH_RABBIT(new FoodItem(settings(), 9, Nourishment.EXCELLENT)),
    SANDWICH_BEEF(new FoodItem(settings(), 9, Nourishment.EXCELLENT)),
    SANDWICH_PORK(new FoodItem(settings(), 9, Nourishment.EXCELLENT)),
    GOLDEN_WATERMELON_JUICE(new BottleItem(settings().rarity(Rarity.UNCOMMON).recipeRemainder(net.minecraft.item.Items.GLASS_BOTTLE), 6, Nourishment.EXCELLENT)),
    GOLDEN_POTATO(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_ALOE_VERA(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_CAVE_ROOT(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_CHORUS_FRUIT(new FoodItem(settings().rarity(Rarity.RARE), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_BEETROOT(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_FIRE_PEPPER(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_SWEET_BERRIES(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_GLOW_BERRIES(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_ANCIENT_MAIZE(new FoodItem(settings().rarity(Rarity.RARE), 4, Nourishment.SUPERNATURAL)),
    GOLDEN_ONION(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    GOLDEN_PUMPKIN_SLICE(new FoodItem(settings(), 6, Nourishment.SUPERNATURAL)),
    ENCHANTED_CHORUS_FRUIT(new EnchantedFoodItem(settings().rarity(EPIC), 6, Nourishment.SUPERNATURAL, StatusEffects.SLOW_FALLING).hideTooltip()),
    ENCHANTED_APPLE_PIE(new EnchantedFoodItem(settings().rarity(EPIC), 9, Nourishment.SUPERNATURAL, StatusEffects.FIRE_RESISTANCE).hideTooltip()),
    ENCHANTED_APPLE_PIE_SLICE(new EnchantedFastFoodItem(settings().maxCount(16).rarity(EPIC), 3, Nourishment.SUPERNATURAL, StatusEffects.FIRE_RESISTANCE).hideTooltip());

    /**list new items below here, move above after adding a recipe for them**/

    public static void initialize() {
        
    }

    private static Item.Settings settings() {
        return new Item.Settings().group(WH_FOOD);
    }
    
    
    // ### Enum Codes ###
    
    public final Item item;
    public final Identifier id;
    
    WHFoods(Item item) {
        this.id = Main.makeId(name().toLowerCase(Locale.ROOT));
        this.item = Registry.register(Registry.ITEM, id, item);
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
