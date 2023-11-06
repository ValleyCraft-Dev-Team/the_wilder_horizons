package net.linkle.wilder_horizons.interfaces;

import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public interface ToolConstants {
    //The base attack damage of each tool type.
    //These values are added to the attack stats of their materials when they're registered.
    //The attack stats are listed in RoseGoldToolMaterial.class.
    Integer KNIFE_BASE_DAMAGE = 2;
    Integer DAGGER_BASE_DAMAGE = 3;
    Integer WOODCUTTER_BASE_DAMAGE = 8;
    Integer SCYTHE_BASE_DAMAGE = 4;
    Integer HATCHET_BASE_DAMAGE = 5;
    Integer SPEAR_BASE_DAMAGE = 3;
    Integer TRAVELER_BASE_DAMAGE = 3;
    Integer MACE_BASE_DAMAGE = 3;
    Integer STAFF_BASE_DAMAGE = 3;
    Integer GREATSWORD_BASE_DAMAGE = 8;

    Integer MAKESHIFT_BASED_DAMAGE = 1;

    //The base attack speed of each tool type.
    //These numbers are subtracted from four, so 4.0 will make the tool never charge, and higher will likely cause issues.
    //Larger number = slower, smaller number = faster.
    Float KNIFE_BASE_SPEED = -2.2f;
    Float WOODCUTTER_BASE_SPEED = -3.3f;
    Float SCYTHE_BASE_SPEED = -3.0f;
    Float DAGGER_BASE_SPEED = -2.4f;
    Float HATCHET_BASE_SPEED = -2.4f;
    Float SPEAR_BASE_SPEED = -2.6f;
    Float TRAVELER_BASE_SPEED = -2.2f;
    Float MACE_BASE_SPEED = -2.2f;
    Float STAFF_BASE_SPEED = -2.2f;
    Float GREATSWORD_BASE_SPEED = -3.2f;

    //these are all vanilla, dont alter them Linkle! signed, Linkle
    Integer AXE_BASE_DAMAGE = 6;
    Float AXE_BASE_SPEED = -3.2f;
    Integer PICKAXE_BASE_DAMAGE = 1;
    Float PICKAXE_BASE_SPEED = -2.8f;
    Integer SWORD_BASE_DAMAGE = 3;
    Float SWORD_BASE_SPEED = -2.4f;
    Float SHOVEL_BASE_DAMAGE = 1.5f;
    Float SHOVEL_BASE_SPEED = -3.0f;
    Integer HOE_BASE_DAMAGE = 0;
    Float HOE_BASE_SPEED = -3.0f;
    //The item settings for knives made of 'basic' materials- wood, gold, stone, iron, rose gold, diamond, netherite
    Item.Settings BASIC_SETTINGS = new Item.Settings().group(WHGroups.WH_TOOLS);
    Item.Settings BASIC_SETTINGS_RELIC = new Item.Settings().group(WHGroups.WH_RELICS);

    Item.Settings BASIC_SETTINGS_RARE = new Item.Settings().group(WHGroups.WH_TOOLS).rarity(Rarity.RARE);
    Item.Settings BASIC_SETTINGS_RARE_RELIC = new Item.Settings().group(WHGroups.WH_RELICS).rarity(Rarity.RARE);

    Item.Settings BASIC_SETTINGS_EPIC = new Item.Settings().group(WHGroups.WH_TOOLS).rarity(Rarity.EPIC);
    Item.Settings BASIC_SETTINGS_EPIC_RELIC = new Item.Settings().group(WHGroups.WH_RELICS).rarity(Rarity.EPIC);

    Item.Settings BASIC_SETTINGS_UNCOMMON = new Item.Settings().group(WHGroups.WH_TOOLS).rarity(Rarity.UNCOMMON);
    Item.Settings BASIC_SETTINGS_UNCOMMON_RELIC = new Item.Settings().group(WHGroups.WH_RELICS).rarity(Rarity.UNCOMMON);
    //Item.Settings BASIC_ARTIFACT_SETTINGS_RARE = new Item.Settings().group(BOOKS).rarity(Rarity.RARE);
    //Item.Settings BASIC_ARTIFACT_SETTINGS_EPIC = new Item.Settings().group(BOOKS).rarity(Rarity.EPIC);
    //Item.Settings BASIC_ARTIFACT_SETTINGS_UNCOMMON = new Item.Settings().group(BOOKS).rarity(Rarity.UNCOMMON);
    //Item.Settings UNBREAKABLE_ARTIFACT_SETTINGS_EPIC_1561 = new Item.Settings().maxDamage(1561).fireproof().group(BOOKS).rarity(Rarity.EPIC);
    //Item.Settings UNBREAKABLE_ARTIFACT_SETTINGS_EPIC_780 = new Item.Settings().maxDamage(780).fireproof().group(BOOKS).rarity(Rarity.EPIC);
}
