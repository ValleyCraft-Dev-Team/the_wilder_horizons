package net.linkle.wilder_horizons.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.item.armor.WHArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHArmors {
    /**plant clothing**/
    public static final Item VINE_CROWN = registerItem("vine_crown",
            new ArmorItem(WHArmorMaterials.VINE_CROWN, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item LILY_PAD_HAT = registerItem("lily_pad_hat",
            new ArmorItem(WHArmorMaterials.LILY_PAD_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item DRIPLEAF_HAT = registerItem("dripleaf_hat",
            new ArmorItem(WHArmorMaterials.DRIPLEAF_HAT, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

    public static final Item AZAELEA_CROWN = registerItem("azalea_crown",
            new ArmorItem(WHArmorMaterials.AZALEA_CROWN, EquipmentSlot.HEAD, new FabricItemSettings().maxCount(1).group(WHGroups.WH_ARMORS)));

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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
