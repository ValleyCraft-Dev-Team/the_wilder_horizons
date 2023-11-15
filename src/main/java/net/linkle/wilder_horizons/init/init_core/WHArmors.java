package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.item.gear.armor.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHArmors implements ItemEnum {
    // warpaint
    //RED_WARPAINT(new ArmorItem(WHArmorMaterials.RED_WARPAINT, EquipmentSlot.HEAD, settings())),
    //BLUE_WARPAINT(new ArmorItem(WHArmorMaterials.BLUE_WARPAINT, EquipmentSlot.HEAD, settings())),
    //GREEN_WARPAINT(new ArmorItem(WHArmorMaterials.GREEN_WARPAINT, EquipmentSlot.HEAD, settings())),
    //YELLOW_WARPAINT(new ArmorItem(WHArmorMaterials.YELLOW_WARPAINT, EquipmentSlot.HEAD, settings())),
    //BLACK_WARPAINT(new ArmorItem(WHArmorMaterials.BLACK_WARPAINT, EquipmentSlot.HEAD, settings())),
    //WHITE_WARPAINT(new ArmorItem(WHArmorMaterials.WHITE_WARPAINT, EquipmentSlot.HEAD, settings())),

    // starter armor
    BELT(new ArmorItem(WHArmorMaterials.BELT, EquipmentSlot.LEGS, settings())),

    // plant clothing
    VINE_CROWN(new ArmorItem(WHArmorMaterials.VINE_CROWN, EquipmentSlot.HEAD, settings())),
    DRIPLEAF_HAT(new ArmorItem(WHArmorMaterials.DRIPLEAF_HAT, EquipmentSlot.HEAD, settings())),
    AZALEA_CROWN(new ArmorItem(WHArmorMaterials.AZALEA_CROWN, EquipmentSlot.HEAD, settings())),
    LILY_PAD_HAT(new ArmorItem(WHArmorMaterials.LILY_PAD_HAT, EquipmentSlot.HEAD, settings())),

    BLUE_CLAM_SHELL_BREASTPLATE(new ArmorItem(WHArmorMaterials.BLUE_CLAM_SHELL_BREASTPLATE, EquipmentSlot.CHEST, settings())),
    TURTLE_CHESTPLATE(new TurtleChestplate(WHArmorMaterials.TURTLE, EquipmentSlot.CHEST, settings())),

    STRAW_HAT(new ArmorItem(WHArmorMaterials.STRAW_HAT, EquipmentSlot.HEAD, settings())),
    CHEF_HAT(new ArmorItem(WHArmorMaterials.CHEF_UNIFORM, EquipmentSlot.HEAD, settings())),
    CHEF_APRON(new ArmorItem(WHArmorMaterials.CHEF_UNIFORM, EquipmentSlot.LEGS, settings())),
    //FORGING_APRON(new ArmorItem(WHArmorMaterials.FORGING_UNIFORM, EquipmentSlot.LEGS, settings())),
    COWPOKE_HAT(new ArmorItem(WHArmorMaterials.COWPOKE_HAT, EquipmentSlot.HEAD, settings())),
    HUNTERS_CAP(new ArmorItem(WHArmorMaterials.HUNTERS_CAP, EquipmentSlot.HEAD, settings())),
    //HEALERS_HOOD(new ArmorItem(WHArmorMaterials.HEALER_CLOAK, EquipmentSlot.HEAD, settings().rarity(Rarity.RARE))),
    //HEALERS_CLOAK(new ArmorItem(WHArmorMaterials.HEALER_CLOAK, EquipmentSlot.CHEST, settings().rarity(Rarity.RARE))),

    RIBCAGE(new ArmorItem(WHArmorMaterials.RIBCAGE, EquipmentSlot.CHEST, relicSettings())),
    WITHER_RIBCAGE(new ArmorItem(WHArmorMaterials.WITHER_RIBCAGE, EquipmentSlot.CHEST, relicSettings())),
    //WRAITH_HOOD(new ArmorItem(WHArmorMaterials.WRAITH_CLOAK, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.RARE))),
    //WRAITH_CLOAK(new ArmorItem(WHArmorMaterials.WRAITH_CLOAK, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.RARE))),
    LICH_HOOD(new ArmorItem(WHArmorMaterials.LICH_CLOAK, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.RARE))),
    LICH_CLOAK(new ArmorItem(WHArmorMaterials.LICH_CLOAK, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.RARE))),
    ANCIENT_BOOTS(new AncientBoots(WHArmorMaterials.ANCIENT_BOOTS, EquipmentSlot.FEET, relicSettings().rarity(Rarity.COMMON))),

    // shroomleather items
    HOOD(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.HEAD, settings())),
    CLOAK(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.CHEST, settings())),
    SANDALS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.FEET, settings())),
    WORKWEAR(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_WORKWEAR, EquipmentSlot.LEGS, settings())),
    REINFORCED_WORKWEAR(new ArmorItem(WHArmorMaterials.REINFORCED_SHROOMLEATHER_WORKWEAR, EquipmentSlot.LEGS, settings())),
    DRESS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_DRESS, EquipmentSlot.LEGS, settings())),
    REINFORCED_DRESS(new ArmorItem(WHArmorMaterials.REINFORCED_SHROOMLEATHER_DRESS, EquipmentSlot.LEGS, settings())),
    TUNIC(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_TUNIC, EquipmentSlot.LEGS, settings())),
    REINFORCED_TUNIC(new ArmorItem(WHArmorMaterials.REINFORCED_SHROOMLEATHER_TUNIC, EquipmentSlot.LEGS, settings())),

    //tunics
    PIGLIN_TUNIC(new ArmorItem(WHArmorMaterials.PIGLIN_TUNIC, EquipmentSlot.LEGS, relicSettings())),
    ILLAGER_TUNIC(new ArmorItem(WHArmorMaterials.ILLAGER_TUNIC, EquipmentSlot.LEGS, relicSettings())),
    DAERDRIN_COVERINGS(new ArmorItem(WHArmorMaterials.DAERDRIN_COVERINGS, EquipmentSlot.LEGS, relicSettings().rarity(Rarity.RARE))),

    FRIENDLY_MASK(new ArmorItem(WHArmorMaterials.FRIENDLY_MASK, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.RARE))),
    GOLDEN_CROWN(new ArmorItem(WHArmorMaterials.GOLDEN_CROWN, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.EPIC))),
    //BRASIUM_PAULDRONS(new ArmorItem(WHArmorMaterials.BRASIUM_PAULDRONS, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.UNCOMMON))),
    MINING_HELMET(new ArmorItem(WHArmorMaterials.MINING_HELMET, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.UNCOMMON))),
    HEADSCARF(new ArmorItem(WHArmorMaterials.HEADSCARF, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.UNCOMMON))),

    //garments
    NEUTRAL_GARMENTS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_NEUTRAL, EquipmentSlot.LEGS, settings())),
    FEMME_GARMENTS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_FEMME, EquipmentSlot.LEGS, settings())),
    MASC_GARMENTS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_MASC, EquipmentSlot.LEGS, settings())),
    PIGLIN_GARMENTS(new ArmorItem(WHArmorMaterials.PIGLIN_GARMENTS, EquipmentSlot.LEGS, relicSettings())),

    DESERT_HAT(new ArmorItem(WHArmorMaterials.ALLAGER_DESERT, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.UNCOMMON))),
    PLAINS_SHOES(new ArmorItem(WHArmorMaterials.ALLAGER_PLAINS, EquipmentSlot.FEET, relicSettings().rarity(Rarity.UNCOMMON))),
    SAVANNA_LAUREL(new ArmorItem(WHArmorMaterials.ALLAGER_SAVANNA, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.UNCOMMON))),
    SNOWY_CAP(new ArmorItem(WHArmorMaterials.ALLAGER_SNOW, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.UNCOMMON))),
    TAIGA_BOOTS(new ArmorItem(WHArmorMaterials.ALLAGER_TAIGA, EquipmentSlot.FEET, relicSettings().rarity(Rarity.UNCOMMON))),
    ALLAGER_GARMENTS(new ArmorItem(WHArmorMaterials.ALLAGER_GARMENTS, EquipmentSlot.LEGS, relicSettings())),
    ILLAGER_GARMENTS(new ArmorItem(WHArmorMaterials.ILLAGER_GARMENTS, EquipmentSlot.LEGS, relicSettings())),
    ILLAGER_BOOTS(new ArmorItem(WHArmorMaterials.ILLAGER_TUNIC, EquipmentSlot.FEET, relicSettings())),

    // talismans
    UNDYING_TALISMAN(new ArmorItem(WHArmorMaterials.UNDYING_TALISMAN, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.RARE))),
    LUCKY_FISHING_HOOK_TALISMAN(new FishingHookNecklace(WHArmorMaterials.LUCKY_FISHING_HOOK_TALISMAN, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.RARE))),
    FROSTED_IRON_TALISMAN(new FrostedIronTalisman(WHArmorMaterials.FROSTED_IRON_TALISMAN, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.RARE))),

    // fur
    FUR_HOOD(new ArmorItem(WHArmorMaterials.FUR, EquipmentSlot.HEAD, relicSettings().rarity(Rarity.UNCOMMON))),
    FUR_CLOAK(new ArmorItem(WHArmorMaterials.FUR, EquipmentSlot.CHEST, relicSettings().rarity(Rarity.UNCOMMON))),
    FUR_KILT(new ArmorItem(WHArmorMaterials.FUR, EquipmentSlot.LEGS, relicSettings().rarity(Rarity.UNCOMMON))),

    WARM_BOOTS(new WarmBoots(WHArmorMaterials.WARM_BOOTS, EquipmentSlot.FEET, settings())),

    // glasses
    COPPER_GLASSES(new ArmorItem(WHArmorMaterials.COPPER, EquipmentSlot.HEAD, settings())),
    COPPER_MONOCLE(new ArmorItem(WHArmorMaterials.COPPER_MONOCLE, EquipmentSlot.HEAD, settings())),
    NIGHT_VISION_GOGGLES(new NightVisionGoggles(WHArmorMaterials.NIGHT_VISION_GOGGLES, EquipmentSlot.HEAD, settings().rarity(Rarity.RARE))),

    // plank
    PLANK_HELMET(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.HEAD, settings())),
    PLANK_CHESTPLATE(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.CHEST, settings())),
    PLANK_LEGGINGS(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.LEGS, settings())),
    PLANK_BOOTS(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.FEET, settings())),

    // canvas
    CANVAS_HELMET(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.HEAD, settings())),
    CANVAS_CHESTPLATE(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.CHEST, settings())),
    CANVAS_LEGGINGS(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.LEGS, settings())),
    CANVAS_BOOTS(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.FEET, settings())),

    // gold
    GOLD_MASKED_HELMET(new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.HEAD, settings())),
    GOLD_BREASTPLATE(new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.CHEST, settings())),
    GOLD_HAUBERK(new ArmorItem(WHArmorMaterials.GOLD_HAUBERK, EquipmentSlot.LEGS, settings())),
    GOLD_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.LEGS, settings())),
    GOLD_SANDALS(new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.FEET, settings())),

    // iron
    IRON_MASKED_HELMET(new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.HEAD, settings())),
    IRON_BREASTPLATE(new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.CHEST, settings())),
    IRON_HAUBERK(new ArmorItem(WHArmorMaterials.IRON_HAUBERK, EquipmentSlot.LEGS, settings())),
    IRON_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.LEGS, settings())),
    IRON_SANDALS(new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.FEET, settings())),

    // brasium
    BRASIUM_HELMET(new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.HEAD, settings())),
    BRASIUM_MASKED_HELMET(new ArmorItem(WHArmorMaterials.BRASIUM_REINFORCED, EquipmentSlot.HEAD, settings())),
    BRASIUM_CHESTPLATE(new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.CHEST, settings())),
    BRASIUM_BREASTPLATE(new ArmorItem(WHArmorMaterials.BRASIUM_REINFORCED, EquipmentSlot.CHEST, settings())),
    BRASIUM_LEGGINGS(new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.LEGS, settings())),
    BRASIUM_HAUBERK(new ArmorItem(WHArmorMaterials.BRASIUM_HAUBERK, EquipmentSlot.LEGS, settings())),
    BRASIUM_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.BRASIUM_REINFORCED, EquipmentSlot.LEGS, settings())),
    BRASIUM_BOOTS(new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.FEET, settings())),
    BRASIUM_SANDALS(new ArmorItem(WHArmorMaterials.BRASIUM_REINFORCED, EquipmentSlot.FEET, settings())),

    // diamond
    DIAMOND_MASKED_HELMET(new ArmorItem(WHArmorMaterials.DIAMOND_REINFORCED, EquipmentSlot.HEAD, settings())),
    DIAMOND_BREASTPLATE(new ArmorItem(WHArmorMaterials.DIAMOND_REINFORCED, EquipmentSlot.CHEST, settings())),
    DIAMOND_HAUBERK(new ArmorItem(WHArmorMaterials.DIAMOND_HAUBERK, EquipmentSlot.LEGS, settings())),
    DIAMOND_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.DIAMOND_REINFORCED, EquipmentSlot.LEGS, settings())),
    DIAMOND_SANDALS(new ArmorItem(WHArmorMaterials.DIAMOND_REINFORCED, EquipmentSlot.FEET, settings())),

    // emerald
    //EMERALD_HELMET(new ArmorItem(WHArmorMaterials.EMERALD, EquipmentSlot.HEAD, settings())),
    //EMERALD_MASKED_HELMET(new ArmorItem(WHArmorMaterials.EMERALD_REINFORCED, EquipmentSlot.HEAD, settings())),
    //EMERALD_CHESTPLATE(new ArmorItem(WHArmorMaterials.EMERALD, EquipmentSlot.CHEST, settings())),
    //EMERALD_BREASTPLATE(new ArmorItem(WHArmorMaterials.EMERALD_REINFORCED, EquipmentSlot.CHEST, settings())),
    //EMERALD_LEGGINGS(new ArmorItem(WHArmorMaterials.EMERALD, EquipmentSlot.LEGS, settings())),
    //EMERALD_HAUBERK(new ArmorItem(WHArmorMaterials.EMERALD_HAUBERK, EquipmentSlot.LEGS, settings())),
    //EMERALD_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.EMERALD_REINFORCED, EquipmentSlot.LEGS, settings())),
    //EMERALD_BOOTS(new ArmorItem(WHArmorMaterials.EMERALD, EquipmentSlot.FEET, settings())),
    //EMERALD_SANDALS(new ArmorItem(WHArmorMaterials.EMERALD_REINFORCED, EquipmentSlot.FEET, settings())),

    // echochalcum
    ECHOCHALCUM_HELMET(new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.HEAD, settings())),
    ECHOCHALCUM_MASKED_HELMET(new ArmorItem(WHArmorMaterials.ECHOCHALCUM_REINFORCED, EquipmentSlot.HEAD, settings())),
    ECHOCHALCUM_CHESTPLATE(new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.CHEST, settings())),
    ECHOCHALCUM_BREASTPLATE(new ArmorItem(WHArmorMaterials.ECHOCHALCUM_REINFORCED, EquipmentSlot.CHEST, settings())),
    ECHOCHALCUM_LEGGINGS(new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.LEGS, settings())),
    ECHOCHALCUM_HAUBERK(new ArmorItem(WHArmorMaterials.ECHOCHALCUM_HAUBERK, EquipmentSlot.LEGS, settings())),
    ECHOCHALCUM_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.ECHOCHALCUM_REINFORCED, EquipmentSlot.LEGS, settings())),
    ECHOCHALCUM_BOOTS(new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.FEET, settings())),
    ECHOCHALCUM_SANDALS(new ArmorItem(WHArmorMaterials.ECHOCHALCUM_REINFORCED, EquipmentSlot.FEET, settings())),

    // netherite
    NETHERITE_MASKED_HELMET(new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.HEAD, settings())),
    NETHERITE_BREASTPLATE(new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.CHEST, settings())),
    NETHERITE_HAUBERK(new ArmorItem(WHArmorMaterials.NETHERITE_HAUBERK, EquipmentSlot.LEGS, settings())),
    NETHERITE_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.FEET, settings())),
    NETHERITE_SANDALS(new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.FEET, settings()));

    public static FabricItemSettings settings() {
        return new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS);
    }

    public static FabricItemSettings relicSettings() {
        return new FabricItemSettings().maxCount(1).group(WHGroups.WH_RELICS);
    }
    public static void initialize() {
        
    }

    // ### Enum Codes ###
    
    public final Item item;
    public final Identifier id;
    
    WHArmors(Item item) {
        this.id = Main.makeId(name().toLowerCase(Locale.ROOT));
        this.item = Registry.register(Registry.ITEM, id, item);
    }
    
    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public Item asItem() {
        return item;
    }
}
