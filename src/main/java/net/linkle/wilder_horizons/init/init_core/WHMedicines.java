package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.init.WHGroups;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WHMedicines {
    /**bolus base - beetroot**/

    public static final Item BOLUS_POISON = registerItem("poison_bolus",
            new BolusItem(new FabricItemSettings().maxCount(16).group(WHGroups.WH_MEDICINAL), 0,0, true, StatusEffects.NAUSEA));

    /**salve base - dried kelp**/

    public static final Item SALVE_HEALING = registerItem("healing_salve",
            new SalveItem(new FabricItemSettings().maxCount(16).group(WHGroups.WH_MEDICINAL), 0, 0,
                    true, StatusEffects.REGENERATION));

    /**tea base - glow berries**/

    public static final Item TEA_MUG = registerItem("tea_mug",
            new AlphaModItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MISCELLANEOUS)));

    public static final Item TEA_HEALING = registerItem("tea_healing",
            new BrothItem(new FabricItemSettings().maxCount(1).group(WHGroups.WH_FOOD), 2, 0.8f,
                    false, StatusEffects.STRENGTH));

    public static final Item TEA_NIGHT_VISION = registerItem("tea_night_vision",
            new BrothItem(new FabricItemSettings().maxCount(1).group(WHGroups.WH_FOOD), 2, 0.8f,
                    false, StatusEffects.NIGHT_VISION));

    public static final Item TEA_HASTE = registerItem("tea_strength",
            new BrothItem(new FabricItemSettings().maxCount(1).group(WHGroups.WH_FOOD), 2, 0.8f,
                    false, StatusEffects.HASTE));

    /**ointment base - slime**/
    public static final Item OINTMENT_EXTINGUISHING = registerItem("extinguishing_ointment",
            new SalveItem(new FabricItemSettings().maxCount(16).group(WHGroups.WH_MEDICINAL), 0, 0,
                    true, StatusEffects.FIRE_RESISTANCE));

    public static final Item OINTMENT_PROTECTING = registerItem("warding_ointment",
            new OintmentItem(new FabricItemSettings().maxCount(16).group(WHGroups.WH_MEDICINAL), 0, 0,
                    true, StatusEffects.RESISTANCE));

    public static final Item OINTMENT_CONCEALING = registerItem("concealing_ointment",
            new OintmentItem(new FabricItemSettings().maxCount(16).group(WHGroups.WH_MEDICINAL), 0, 0,
                    true, StatusEffects.INVISIBILITY));

    /**soap base - clay**/

    public static final Item SOAP = registerItem("soap",
            new SoapItem(new FabricItemSettings().maxCount(64).group(WHGroups.WH_MEDICINAL), 0, 0, true,
                    WHEffects.CLEANSED));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }
}
