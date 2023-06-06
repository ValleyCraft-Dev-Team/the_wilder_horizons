package net.linkle.wilder_horizons.init.core_inits;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.init.WHGroups;
import net.linkle.wilder_horizons.item.armor.WHArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHArmors {
    /**plant clothing**/
    public static final Item FRIENDLY_MASK = registerItem("friendly_mask",
            new ArmorItem(WHArmorMaterials.FRIENDLY_MASK, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item VINE_CROWN = registerItem("vine_crown",
            new ArmorItem(WHArmorMaterials.VINE_CROWN, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item DRIPLEAF_HAT = registerItem("dripleaf_hat",
            new ArmorItem(WHArmorMaterials.DRIPLEAF_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item AZAELEA_CROWN = registerItem("azalea_crown",
            new ArmorItem(WHArmorMaterials.AZALEA_CROWN, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item LILY_PAD_HAT = registerItem("lily_pad_hat",
            new ArmorItem(WHArmorMaterials.LILY_PAD_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item BLUE_SHELL_BREASTPLATE = registerItem("blue_clam_shell_breastplate",
            new ArmorItem(WHArmorMaterials.BLUE_CLAM_SHELL_BREASTPLATE, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item STRAW_HAT = registerItem("straw_hat",
            new ArmorItem(WHArmorMaterials.STRAW_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item CHEF_HAT = registerItem("chef_hat",
            new ArmorItem(WHArmorMaterials.CHEF_UNIFORM, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item CHEF_APRON = registerItem("chef_apron",
            new ArmorItem(WHArmorMaterials.CHEF_UNIFORM, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**shroomleather items**/
    public static final Item HOOD = registerItem("hood",
            new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item CLOAK = registerItem("cloak",
            new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item NEUTRAL_GARMENTS = registerItem("neutral_garments",
            new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_NEUTRAL, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item FEMME_GARMENTS = registerItem("femme_garments",
            new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_FEMME, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item MASC_GARMENTS = registerItem("masc_garments",
            new ArmorItem(WHArmorMaterials.SHROOMLEATHER_GARMENTS_MASC, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item SANDALS = registerItem("sandals",
            new ArmorItem(WHArmorMaterials.SHROOMLEATHER_CLOAK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**leather items**/
    public static final Item COWPOKE_HAT = registerItem("cowpoke_hat",
            new ArmorItem(WHArmorMaterials.COWPOKE_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item WARM_BOOTS = registerItem("warm_boots",
            new ArmorItem(WHArmorMaterials.WARM_BOOTS, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**brasium**/
    public static final Item NIGHT_VISION_GOGGLES = registerItem("night_vision_goggles",
            new ArmorItem(WHArmorMaterials.NIGHT_VISION_GOGGLES, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**canvas**/
    public static final Item CANVAS_HELMET = registerItem("CANVAS_helmet",
            new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item CANVAS_CHESTPLATE = registerItem("CANVAS_chestplate",
            new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item CANVAS_LEGGINGS = registerItem("CANVAS_leggings",
            new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item CANVAS_BOOTS = registerItem("CANVAS_boots",
            new ArmorItem(WHArmorMaterials.CANVAS, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**plank**/
    public static final Item PLANK_HELMET = registerItem("plank_helmet",
            new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item PLANK_CHESTPLATE = registerItem("plank_chestplate",
            new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item PLANK_LEGGINGS = registerItem("plank_leggings",
            new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item PLANK_BOOTS = registerItem("plank_boots",
            new ArmorItem(WHArmorMaterials.PLANK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**gold**/
    public static final Item GOLD_HAUBERK = registerItem("gold_hauberk",
            new ArmorItem(WHArmorMaterials.GOLD_HAUBERK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item GOLD_THIGH_GUARDS = registerItem("gold_thigh_guards",
            new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item GOLD_SANDALS = registerItem("gold_sandals",
            new ArmorItem(WHArmorMaterials.GOLD_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**iron**/
    public static final Item IRON_HAUBERK = registerItem("iron_hauberk",
            new ArmorItem(WHArmorMaterials.IRON_HAUBERK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item IRON_THIGH_GUARDS = registerItem("iron_thigh_guards",
            new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item IRON_SANDALS = registerItem("iron_sandals",
            new ArmorItem(WHArmorMaterials.IRON_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**brasium**/
    public static final Item BRASIUM_HELMET = registerItem("brasium_helmet",
            new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item BRASIUM_CHESTPLATE = registerItem("brasium_chestplate",
            new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item BRASIUM_LEGGINGS = registerItem("brasium_leggings",
            new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item BRASIUM_HAUBERK = registerItem("brasium_hauberk",
            new ArmorItem(WHArmorMaterials.BRASIUM_HAUBERK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item BRASIUM_THIGH_GUARDS = registerItem("brasium_thigh_guards",
            new ArmorItem(WHArmorMaterials.BRASIUM_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item BRASIUM_BOOTS = registerItem("brasium_boots",
            new ArmorItem(WHArmorMaterials.BRASIUM, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item BRASIUM_SANDALS = registerItem("brasium_sandals",
            new ArmorItem(WHArmorMaterials.BRASIUM_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**diamond**/
    public static final Item DIAMOND_HAUBERK = registerItem("diamond_hauberk",
            new ArmorItem(WHArmorMaterials.DIAMOND_HAUBERK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item DIAMOND_THIGH_GUARDS = registerItem("diamond_thigh_guards",
            new ArmorItem(WHArmorMaterials.DIAMOND_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item DIAMOND_SANDALS = registerItem("diamond_sandals",
            new ArmorItem(WHArmorMaterials.DIAMOND_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**echochalcum**/
    public static final Item ECHOCHALCUM_HELMET = registerItem("echochalcum_helmet",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item ECHOCHALCUM_CHESTPLATE = registerItem("echochalcum_chestplate",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item ECHOCHALCUM_LEGGINGS = registerItem("echochalcum_leggings",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item ECHOCHALCUM_HAUBERK = registerItem("echochalcum_hauberk",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM_HAUBERK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item ECHOCHALCUM_THIGH_GUARDS = registerItem("echochalcum_thigh_guards",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item ECHOCHALCUM_BOOTS = registerItem("echochalcum_boots",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item ECHOCHALCUM_SANDALS = registerItem("echochalcum_sandals",
            new ArmorItem(WHArmorMaterials.ECHOCHALCUM_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    /**netherite**/
    public static final Item NETHERITE_HAUBERK = registerItem("netherite_hauberk",
            new ArmorItem(WHArmorMaterials.NETHERITE_HAUBERK, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item NETHERITE_THIGH_GUARDS = registerItem("netherite_thigh_guards",
            new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));
    public static final Item NETHERITE_SANDALS = registerItem("netherite_sandals",
            new ArmorItem(WHArmorMaterials.NETHERITE_REINFORCED, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
