package net.linkle.wilder_horizons.init.init_core;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static net.linkle.wilder_horizons.init.init_exterior.WHGroups.WH_MISCELLANEOUS;

public enum WHFishItems implements ItemEnum {
    STONEROLLER_MINNOW_BUCKET(new EntityBucketItem(WHEntities.STONEROLLER_MINNOW.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1))),
    ABYSSWATCHER_BUCKET(new EntityBucketItem(WHEntities.ABYSSWATCHER.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1))),
    RED_PORGY_BUCKET(new EntityBucketItem(WHEntities.RED_PORGY.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1))),
    SARDINE_BUCKET(new EntityBucketItem(WHEntities.SARDINE.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1))),
    PERCH_BUCKET(new EntityBucketItem(WHEntities.PERCH.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1))),
    BONEFIN_BUCKET(new EntityBucketItem(WHEntities.BONEFIN.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1))),
    GOLDFISH_BUCKET(new EntityBucketItem(WHEntities.GOLDFISH.type(), Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(WH_MISCELLANEOUS).maxCount(1)));

    public static void initialize() {
        //raw items are registered in IngredientFoodItems
        //cooked items are fully registered in RegularFoodItems or TieredFoodItems
    }
    
    // ### Enum Codes ###
    public final Item item;
    public final Identifier id;
    
    // @param register the item
    WHFishItems(Item item) {
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
