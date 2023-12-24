package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.item.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHMedicines implements ItemEnum {

    // bolus base - beetroot
    BOLUS_POISON(new BolusItem(settings().maxCount(16), 0,0, true, StatusEffects.NAUSEA)),

    // salve base - dried kelp
    SALVE_HEALING(new SalveItem(settings().maxCount(16), 0, 0, true, StatusEffects.REGENERATION)),

    // tea base - glow berries
    //TEA_MUG(new AlphaModItem(settings().group(WHGroups.WH_MISCELLANEOUS))),

    //STRENGTH_TEA(new TeaItem(settings().maxCount(1).group(WHGroups.WH_FOOD), 2, 0.8f, false, StatusEffects.STRENGTH)),

    //HEALING_TEA(new TeaItem(settings().maxCount(1).group(WHGroups.WH_FOOD), 2, 0.8f, false, WHEffects.RADIANT_HEALING.effect)),

    //NIGHT_VISION_TEA(new TeaItem(settings().maxCount(1).group(WHGroups.WH_FOOD), 2, 0.8f, false, StatusEffects.NIGHT_VISION)),

    // ointment base - slime
    EXTINGUISHING_OINTMENT(new SalveItem(settings().maxCount(16), 0, 0, true, StatusEffects.FIRE_RESISTANCE)),

    PROTECTING_OINTMENT(new OintmentItem(settings().maxCount(16), 0, 0, true, StatusEffects.RESISTANCE));

    //CONCEALING_OINTMENT(new OintmentItem(settings().maxCount(16), 0, 0, true, StatusEffects.INVISIBILITY)),

    // soap base - clay
    //SOAP(new SoapItem(settings(), 0, 0, true, WHEffects.CLEANSED.effect));
    /**save for different mod**/

    private static FabricItemSettings settings() {
        return new FabricItemSettings().group(WHGroups.WH_FOOD_SPECIAL);
    }
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }
    public static void registerItems() {
    }

    // ### Enum Codes ###

    public final Item item;
    public final Identifier id;

    WHMedicines(Item item) {
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
