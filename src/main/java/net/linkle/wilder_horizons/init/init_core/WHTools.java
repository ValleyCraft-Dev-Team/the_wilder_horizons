package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.enums.ItemEnum;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.interfaces.PreventDestroy;
import net.linkle.wilder_horizons.interfaces.ToolConstants;
import net.linkle.wilder_horizons.item.ClimbingAxeItem;
import net.linkle.wilder_horizons.item.ModHoeItem;
import net.linkle.wilder_horizons.item.gear.tools.WHToolMaterials;
import net.linkle.wilder_horizons.item.gear.tools.bows.AmethystLeveledBowItem;
import net.linkle.wilder_horizons.item.gear.tools.bows.BrasiumBowItem;
import net.linkle.wilder_horizons.item.gear.tools.bows.ChampionsBowItem;
import net.linkle.wilder_horizons.item.gear.tools.environmental.*;
import net.linkle.wilder_horizons.item.gear.tools.hatchet.HatchetAxeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.KnifeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.UnbreakableScalpelBase;
import net.linkle.wilder_horizons.item.gear.tools.rusty.*;
import net.linkle.wilder_horizons.item.gear.tools.scythe.ScytheBase;
import net.linkle.wilder_horizons.item.gear.tools.staff.StaffBase;
import net.linkle.wilder_horizons.item.gear.tools.throwing.RockItem;
import net.linkle.wilder_horizons.item.gear.tools.travelers_sword.TravelerBase;
import net.linkle.wilder_horizons.item.gear.tools.woodcutter_axe.WoodcutterAxeBase;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static net.linkle.wilder_horizons.interfaces.ToolConstants.basicSettings;
import static net.linkle.wilder_horizons.interfaces.ToolConstants.settingsRelic;

public enum WHTools implements ItemEnum, ToolConstants {

    //BROKEN_HEROES_BLADE(new UnbreakableScalpelBase(WHToolMaterials.GODDESS_BLADE_BROKEN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings()_EPIC_RELIC)),
    //HEROES_BLADE(new UnbreakableScalpelBase(WHToolMaterials.GODDESS_BLADE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings()_EPIC_RELIC)),
    // Environmental Tools
    BRANCH(new BranchWeaponItem(new BranchToolMaterial(), 3, -2.0f)),
    //DRIFTWOOD_BRANCH(new BranchWeaponItem(new BranchToolMaterial(), 3, -2.0f)),

    THROWING_ROCK(new RockItem(new Item.Settings().maxCount(64).group(WHGroups.WH_TOOLS))),

    // Makeshift Bone
    MAKESHIFT_KNIFE(new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    MAKESHIFT_PICKAXE(new BranchPickaxeItem(WHToolMaterials.MAKESHIFT_FLINT, 3, -3.0f)),
    MAKESHIFT_AXE(new BranchAxeItem(WHToolMaterials.MAKESHIFT_STONE, 3, -3.0f)),
    MAKESHIFT_SHOVEL(new BranchShovelItem(WHToolMaterials.MAKESHIFT_WOOD, 1, -3.0f)),
    MAKESHIFT_HOE(new BranchHoeItem(WHToolMaterials.MAKESHIFT_WOOD, 0, -3.0f)),
    MAKESHIFT_CLUB(new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    MAKESHIFT_CACTUS_CLUB(new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    FIRE_PLOUGH(new FlintAndSteelItem(new Item.Settings().maxCount(1).group(WHGroups.WH_TOOLS).maxDamage(1))),

    // Staffs
    WOODEN_STAFF(new StaffBase(WHToolMaterials.PLANK, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, basicSettings())),
    BAMBOO_STAFF(new StaffBase(WHToolMaterials.BAMBOO, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, basicSettings())),
    BLAZE_STAFF(new StaffBase(WHToolMaterials.BLAZE, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, basicSettings())),
    DRIPSTONE_SPEAR(new StaffBase(WHToolMaterials.DRIPSTONE, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, basicSettings())),
    FLINT_SPEAR(new StaffBase(WHToolMaterials.FLINT, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, basicSettings())),

    //ANTHROPOLOGISTS_ROCK_PICK(new AnthroPickaxeItem(new AnthroPickaxeMaterial())),

    //ANCIENT_CLIMBING_AXE(new ClimbingAxeItem(WHToolMaterials.STRONG_IRON, new Item.Settings().group(BOOKS).rarity(Rarity.EPIC))),
    //CORAL_KNIFE(new CoralDaggerItem(new CoralDaggerToolMaterial(), 3, -1.4f)),
    //CAVE_FISHERS_RAPIER(new CaveFisherSwordItem(new CaveFisherToolMaterial(), 4, -2.4f)),

    //Specialty Tools
    WOODEN_OAR(new StaffBase(WHToolMaterials.PLANK, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, basicSettings())),
    CLIMBING_AXE(new ClimbingAxeItem(WHToolMaterials.BRASIUM, new Item.Settings().group(WHGroups.WH_TOOLS))),
    ICE_TONGS(new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, basicSettings())),
    //BRASIUM_HAMMER(new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, basicSettings())),

    //CORAL_KNIFE(new Scalpel(WHToolMaterials.GUARDIAN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings()_UNCOMMON)),
    CORAL_KNIFE_GUARDIAN(new UnbreakableScalpelBase(WHToolMaterials.ELDER_GUARDIAN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings().rarity(Rarity.RARE))),
    BONE_MISERICORDE(new KnifeBase(WHToolMaterials.BONE, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    //DRAGON_SPEAR(new KnifeBase(WHToolMaterials.DRAGON_TOOTH, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings()_RARE_RELIC)),
    ILLAGER_AXE(new KnifeBase(WHToolMaterials.IRON_EXTENDED, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, settingsRelic().rarity(Rarity.UNCOMMON))),
    AMETHYST_SWORD(new KnifeBase(WHToolMaterials.AMETHYST, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, settingsRelic().rarity(Rarity.RARE))),
    IRON_CUTLASS(new KnifeBase(WHToolMaterials.IRON_EXTENDED, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, settingsRelic().rarity(Rarity.UNCOMMON))),
    DRUID_SICKLE(new KnifeBase(WHToolMaterials.WOOD_EXTENDED, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, settingsRelic().rarity(Rarity.EPIC))),
    SCIMITAR(new KnifeBase(WHToolMaterials.GOLD_EXTENDED, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, settingsRelic().rarity(Rarity.UNCOMMON))),
    OBSIDIAN_MACUAHUITL(new SwordItem(WHToolMaterials.OBSIDIAN, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, settingsRelic().rarity(Rarity.RARE))),
    LUMBER_AXE(new WoodcutterAxeBase(WHToolMaterials.DIAMOND_EXTENDED, AXE_BASE_DAMAGE, AXE_BASE_SPEED, settingsRelic().rarity(Rarity.UNCOMMON))),

    // Bows
    //LONGBOW(new LongBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(385))),
    CHAMPIONS_BOW(new ChampionsBowItem(new FabricItemSettings().group(WHGroups.WH_RELICS).maxDamage(578))),
    AMETHYST_LEVELED_BOW(new AmethystLeveledBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(578))),
    BRASIUM_COMPOUND_BOW(new BrasiumBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(770))),
    MINING_DRILL(new PickaxeItem(WHToolMaterials.BRASIUM, SWORD_BASE_DAMAGE, PICKAXE_BASE_SPEED, ToolConstants.basicSettings())),
    //BRASIUM_CROSSBOW(new BrasiumBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(770))),

    //wardens roar
    //WARDENS_ROAR(new BrasiumBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(770))),

    // Knives
    KNIFE_WOODEN(new KnifeBase(ToolMaterials.WOOD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_STONE(new KnifeBase(ToolMaterials.STONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_GOLDEN(new KnifeBase(ToolMaterials.GOLD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_IRON(new KnifeBase(ToolMaterials.IRON, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_BRASIUM(new KnifeBase(WHToolMaterials.BRASIUM, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_DIAMOND(new KnifeBase(ToolMaterials.DIAMOND, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_ECHOCHALCUM(new KnifeBase(WHToolMaterials.ECHOCHALCUM, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),
    KNIFE_NETHERITE(new KnifeBase(ToolMaterials.NETHERITE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, basicSettings())),

    // Hatches
    HATCHET_STONE(new HatchetAxeBase(ToolMaterials.STONE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_WOODEN(new HatchetAxeBase(ToolMaterials.WOOD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_GOLDEN(new HatchetAxeBase(ToolMaterials.GOLD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_IRON(new HatchetAxeBase(ToolMaterials.IRON, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_brasium(new HatchetAxeBase(WHToolMaterials.BRASIUM, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_DIAMOND(new HatchetAxeBase(ToolMaterials.DIAMOND, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_ECHOCHALCUM(new HatchetAxeBase(WHToolMaterials.ECHOCHALCUM, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),
    HATCHET_NETHERITE(new HatchetAxeBase(ToolMaterials.NETHERITE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, basicSettings())),

    // Woodcutter's Axes (upgrade from axe)
    WOODCUTTER_AXE_WOODEN(new WoodcutterAxeBase(WHToolMaterials.WOOD_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_STONE(new WoodcutterAxeBase(WHToolMaterials.STONE_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_GOLDEN(new WoodcutterAxeBase(WHToolMaterials.GOLD_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_IRON(new WoodcutterAxeBase(WHToolMaterials.IRON_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_BRASIUM(new WoodcutterAxeBase(WHToolMaterials.BRASIUM_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_DIAMOND(new WoodcutterAxeBase(WHToolMaterials.DIAMOND_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_ECHOCHALCUM(new WoodcutterAxeBase(WHToolMaterials.ECHOCHALCUM_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),
    WOODCUTTER_AXE_NETHERITE(new WoodcutterAxeBase(WHToolMaterials.NETHERITE_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, basicSettings())),

    // Scythes (upgrade from hoe)
    SCYTHE_WOODEN(new ScytheBase(ToolMaterials.WOOD, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_STONE(new ScytheBase(ToolMaterials.STONE, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_GOLDEN(new ScytheBase(ToolMaterials.GOLD, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_IRON(new ScytheBase(ToolMaterials.IRON, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_BRASIUM(new ScytheBase(WHToolMaterials.BRASIUM, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_DIAMOND(new ScytheBase(ToolMaterials.DIAMOND, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_ECHOCHALCUM(new ScytheBase(WHToolMaterials.ECHOCHALCUM, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),
    SCYTHE_NETHERITE(new ScytheBase(ToolMaterials.NETHERITE, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, basicSettings())),

    // Traveler (upgrade from knife)
    TRAVELER_WOODEN(new TravelerBase(ToolMaterials.WOOD, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_STONE(new TravelerBase(ToolMaterials.STONE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_GOLDEN(new TravelerBase(ToolMaterials.GOLD, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_IRON(new TravelerBase(ToolMaterials.IRON, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_BRASIUM(new TravelerBase(WHToolMaterials.BRASIUM, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_DIAMOND(new TravelerBase(ToolMaterials.DIAMOND, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_ECHOCHALCUM(new TravelerBase(WHToolMaterials.ECHOCHALCUM, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),
    TRAVELER_NETHERITE(new TravelerBase(ToolMaterials.NETHERITE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, basicSettings())),

    // Brasium
    BRASIUM_SWORD(new SwordItem(WHToolMaterials.BRASIUM, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, basicSettings())),
    BRASIUM_SHOVEL(new ShovelItem(WHToolMaterials.BRASIUM, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, basicSettings())),
    BRASIUM_PICKAXE(new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, basicSettings())),
    BRASIUM_AXE(new AxeItem(WHToolMaterials.BRASIUM, AXE_BASE_DAMAGE, AXE_BASE_SPEED, basicSettings())),
    BRASIUM_HOE(new ModHoeItem(WHToolMaterials.BRASIUM, HOE_BASE_DAMAGE, HOE_BASE_SPEED, basicSettings())),

    // Echochalcum
    ECHOCHALCUM_SWORD(new SwordItem(WHToolMaterials.ECHOCHALCUM, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, basicSettings())),
    ECHOCHALCUM_SHOVEL(new ShovelItem(WHToolMaterials.ECHOCHALCUM, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, basicSettings())),
    ECHOCHALCUM_PICKAXE(new PickaxeItem(WHToolMaterials.ECHOCHALCUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, basicSettings())),
    ECHOCHALCUM_AXE(new AxeItem(WHToolMaterials.ECHOCHALCUM, AXE_BASE_DAMAGE, AXE_BASE_SPEED, basicSettings())),
    ECHOCHALCUM_HOE(new ModHoeItem(WHToolMaterials.ECHOCHALCUM, HOE_BASE_DAMAGE, HOE_BASE_SPEED, basicSettings())),

    // Rusty
    RUSTED_SWORD(new RustySwordItem(new RustyMaterial(),4, -2.4f)),
    RUSTED_PICKAXE(new RustyPickaxeItem(new RustyMaterial(),2, -2.8f)),
    RUSTED_AXE(new RustyAxeItem(new RustyMaterial(),7, -3.0f)),
    RUSTED_HOE(new RustyHoeItem(new RustyMaterial(),0, -1.0f)),
    RUSTED_SHOVEL(new RustyShovelItem(new RustyMaterial(),2, -3.0f));

    public static void initialize() {
        ModelPredicateProviderRegistry.register(CORAL_KNIFE_GUARDIAN.item, new Identifier("broken"), (stack, world, entity, seed) -> PreventDestroy.isUsable(stack) ? 0.0f : 1.0f);
    }

    // ### Enum Codes ###

    public final Item item;
    public final Identifier id;

    WHTools(Item item) {
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
