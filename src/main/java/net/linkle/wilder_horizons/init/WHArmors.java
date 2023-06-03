package net.linkle.wilder_horizons.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHArmors {
    /**plant clothing**/
    public static final Item VINE_CROWN = registerItem("vine_crown",
            new ArmorItem(SLArmorMaterials.VINE_CROWN, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    public static final Item LILY_PAD_HAT = registerItem("lily_pad_hat",
            new ArmorItem(SLArmorMaterials.LILY_PAD_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    public static final Item DRIPLEAF_HAT = registerItem("dripleaf_hat",
            new ArmorItem(SLArmorMaterials.DRIPLEAF_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    public static final Item AZAELEA_CROWN = registerItem("azalea_crown",
            new ArmorItem(SLArmorMaterials.AZALEA_CROWN, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    /**shroomleather items**/
    public static final Item HOOD = registerItem("hood",
            new ArmorItem(SLArmorMaterials.LEATHER_TUNIC, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));
    public static final Item CLOAK = registerItem("cloak",
            new ArmorItem(SLArmorMaterials.LEATHER_TUNIC, EquipmentSlot.CHEST, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    public static final Item NEUTRAL_GARMENTS = registerItem("neutral_garments",
            new ArmorItem(SLArmorMaterials.SHROOMLEATHER_GARMENTS_NEUTRAL, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));
    public static final Item FEMME_GARMENTS = registerItem("femme_garments",
            new ArmorItem(SLArmorMaterials.SHROOMLEATHER_GARMENTS_FEMME, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));
    public static final Item MASC_GARMENTS = registerItem("masc_garments",
            new ArmorItem(SLArmorMaterials.SHROOMLEATHER_GARMENTS_MASC, EquipmentSlot.LEGS, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    public static final Item SANDALS = registerItem("sandals",
            new ArmorItem(SLArmorMaterials.LEATHER_TUNIC, EquipmentSlot.FEET, new FabricItemSettings().maxCount(1).group(WHItemGroups.SOULSLIKEGRIT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
