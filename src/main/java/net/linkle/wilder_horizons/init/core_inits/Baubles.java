package net.linkle.wilder_horizons.init.core_inits;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.WHGroups;
import net.linkle.wilder_horizons.interfaces.TrinketEffectItem;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.Rarity.*;

public enum Baubles implements ItemEnum {
    //Use Bauble item if it has no functionality set,
    //otherwise create an item class that extends BaubleItem
    //and use that for the individual bauble.

    //talismans are necklaces made with special items
    //amulets are necklaces made with minerals
    //keepsakes are boss specific items
    //base material necklaces are just called necklaces
    //ignore some of the coded names are wrong, theyre fixed in the lang file

    //LEATHER_BRACELET(new Item(itemSettings().group(WHGroups.WH_ARMORS))),
    //TOTEM_OF_UNDYING_BRACELET(new Item(itemSettings().group(WHGroups.WH_ARMORS).rarity(RARE))),
    //TOTEM_OF_FRIENDSHIP_BRACELET(new Item(itemSettings().group(WHGroups.WH_ARMORS).rarity(EPIC))),

    //necklaces
    //prismarine/iron base
    IRON_NECKLACE(new Item(itemSettings().group(WHGroups.WH_ARMORS).maxCount(1))),
    AMETHYST_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    BRIMSTONE_NECKLACE(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    DIAMOND_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    ECHO_SHARD_TALISMAN(new Item(itemSettings().rarity(RARE).group(WHGroups.WH_ARMORS).maxCount(1))),
    EMERALD_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    ENDER_PEARL_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    LAPIS_LAZULI_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    NETHER_QUARTZ_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    PRISMARINE_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),

    //leather base
    LEATHER_NECKLACE(new TrinketEffectItem(itemSettings().group(WHGroups.WH_ARMORS).maxCount(1))),
    CRYSTALLIZED_HONEY_NECKLACE(new TrinketEffectItem(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1)).addEffect(StatusEffects.HEALTH_BOOST, 0)),
    SCUTE_NECKLACE(new TrinketEffectItem(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1)).addEffect(StatusEffects.RESISTANCE, 0)),
    UNDYING_NECKLACE(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    GUARDIAN_SPIKE_TALISMAN(new Item(itemSettings().rarity(UNCOMMON).group(WHGroups.WH_ARMORS).maxCount(1))),
    DRAGON_TOOTH_KEEPSAKE(new TrinketEffectItem(itemSettings().rarity(RARE).group(WHGroups.WH_ARMORS).maxCount(1)).addEffect(StatusEffects.STRENGTH, 0)),

    //miniboss keepsakes
    ELDER_GUARDIAN_SPIKE_KEEPSAKE(new Item(itemSettings().rarity(EPIC).group(WHGroups.WH_ARMORS).maxCount(1))),
    //WARDEN_HEART_KEEPSAKE(new TrinketEffectItem(itemSettings().rarity(EPIC).group(WHGroups.WH_ARMORS).maxCount(1)).addEffect(StatusEffects.BLINDNESS, 1).addEffect(StatusEffects.STRENGTH, 1)),
    //LICHES_LUCKY_BONE_KEEPSAKE(new TrinketEffectItem(itemSettings().rarity(EPIC).group(WHGroups.WH_ARMORS).maxCount(1)).addEffect(StatusEffects.HUNGER, 1).addEffect(StatusEffects.REGENERATION, 0)),

    //boss keepsakes
    NETHER_STAR_KEEPSAKE(new TrinketEffectItem(itemSettings().rarity(EPIC).group(WHGroups.WH_ARMORS).maxCount(1)).addEffect(StatusEffects.SLOW_FALLING, 0)),
    ENDER_DRAGON_TALISMAN(new Item(itemSettings().rarity(EPIC).group(WHGroups.WH_ARMORS).maxCount(1)));


    public static void initialize() {
    }

    private static Item.Settings itemSettings() {
        return new Item.Settings().maxCount(1).group(WHGroups.WH_ARMORS);
    }

    public final Item item;
    public final Identifier id;

    Baubles(Item item) {
        this.item = Registry.register(Registry.ITEM, id = Main.makeId(name().toLowerCase()), item);
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
