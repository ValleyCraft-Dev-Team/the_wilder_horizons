package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.item.gear.armor.WHArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHArmors implements ItemEnum {
    // plant clothing
    FRIENDLY_MASK(new ArmorItem(WHArmorMaterials.FRIENDLY_MASK, EquipmentSlot.HEAD, settings().rarity(Rarity.RARE))),

    VINE_CROWN(new ArmorItem(WHArmorMaterials.VINE_CROWN, EquipmentSlot.HEAD, settings())),

    DRIPLEAF_HAT(new ArmorItem(WHArmorMaterials.DRIPLEAF_HAT, EquipmentSlot.HEAD, settings())),

    AZALEA_CROWN(new ArmorItem(WHArmorMaterials.AZALEA_CROWN, EquipmentSlot.HEAD, settings())),

    LILY_PAD_HAT(new ArmorItem(WHArmorMaterials.LILY_PAD_HAT, EquipmentSlot.HEAD, settings())),

    BLUE_SHELL_BREASTPLATE(new ArmorItem(WHArmorMaterials.BLUE_CLAM_SHELL_BREASTPLATE, EquipmentSlot.CHEST, settings())),

    TURTLE_CHESTPLATE(new ArmorItem(WHArmorMaterials.TURTLE, EquipmentSlot.CHEST, settings())),

    STRAW_HAT(new ArmorItem(WHArmorMaterials.STRAW_HAT, EquipmentSlot.HEAD, settings())),

    CHEF_HAT(new ArmorItem(WHArmorMaterials.CHEF_UNIFORM, EquipmentSlot.HEAD, settings())),
    CHEF_APRON(new ArmorItem(WHArmorMaterials.CHEF_UNIFORM, EquipmentSlot.LEGS, settings())),

    //wraith
    RIBCAGE(new ArmorItem(WHArmorMaterials.RIBCAGE, EquipmentSlot.CHEST, settings())),
    WITHER_RIBCAGE(new ArmorItem(WHArmorMaterials.WITHER_RIBCAGE, EquipmentSlot.CHEST, settings())),
    WRAITH_HOOD(new ArmorItem(WHArmorMaterials.WRAITH_CLOAK, EquipmentSlot.HEAD, settings().rarity(Rarity.RARE))),
    WRAITH_CLOAK(new ArmorItem(WHArmorMaterials.WRAITH_CLOAK, EquipmentSlot.CHEST, settings().rarity(Rarity.RARE))),

    // shroomleather items
    HOOD(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.HEAD, settings())),
    CLOAK(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.CHEST, settings())),
    TUNIC(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_TUNIC, EquipmentSlot.LEGS, settings())),
    BELT(new ArmorItem(WHArmorMaterials.BELT, EquipmentSlot.CHEST, settings())),

    NEUTRAL_GARMENTS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_NEUTRAL, EquipmentSlot.LEGS, settings())),
    FEMME_GARMENTS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_FEMME, EquipmentSlot.LEGS, settings())),
    MASC_GARMENTS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_MASC, EquipmentSlot.LEGS, settings())),

    SANDALS(new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.FEET, settings())),

    // leather items
    COWPOKE_HAT(new ArmorItem(WHArmorMaterials.COWPOKE_HAT, EquipmentSlot.HEAD, settings())),

    UNDYING_TALISMAN(new ArmorItem(WHArmorMaterials.UNDYING_TALISMAN, EquipmentSlot.CHEST, settings().rarity(Rarity.RARE))),

    LUCKY_FISHING_HOOK_TALISMAN(new ArmorItem(WHArmorMaterials.LUCKY_FISHING_HOOK_TALISMAN, EquipmentSlot.CHEST, settings().rarity(Rarity.RARE))),

    WARM_BOOTS(new ArmorItem(WHArmorMaterials.WARM_BOOTS, EquipmentSlot.FEET, settings())),

    // brasium
    NIGHT_VISION_GOGGLES(new ArmorItem(WHArmorMaterials.NIGHT_VISION_GOGGLES, EquipmentSlot.HEAD, settings().rarity(Rarity.RARE))),

    // canvas
    CANVAS_HELMET(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.HEAD, settings())),
    CANVAS_CHESTPLATE(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.CHEST, settings())),
    CANVAS_LEGGINGS(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.LEGS, settings())),
    CANVAS_BOOTS(new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.FEET, settings())),

    // plank
    PLANK_HELMET(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.HEAD, settings())),
    PLANK_CHESTPLATE(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.CHEST, settings())),
    PLANK_LEGGINGS(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.LEGS, settings())),
    PLANK_BOOTS(new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.FEET, settings())),

    // gold
    GOLD_MASKED_HELMET(new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.HEAD, settings())),
    GOLD_BREASTPLATE(new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.CHEST, settings())),
    GOLD_HAUBERK(new ArmorItem(WHArmorMaterials.GOLD_HAUBERK, EquipmentSlot.FEET, settings())),
    GOLD_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.FEET, settings())),
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
    NETHERITE_HAUBERK(new ArmorItem(WHArmorMaterials.NETHERITE_HAUBERK, EquipmentSlot.FEET, settings())),
    NETHERITE_THIGH_GUARDS(new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.FEET, settings())),
    NETHERITE_SANDALS(new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.FEET, settings()));

    public static FabricItemSettings settings() {
        return new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS);
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
