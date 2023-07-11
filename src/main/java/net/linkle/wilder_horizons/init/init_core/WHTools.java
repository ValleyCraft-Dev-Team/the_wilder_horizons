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
import net.linkle.wilder_horizons.item.gear.tools.bows.LongBowItem;
import net.linkle.wilder_horizons.item.gear.tools.environmental.*;
import net.linkle.wilder_horizons.item.gear.tools.hatchet.HatchetAxeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.KnifeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.GemCuttingTools;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.GemCuttingToolsMaterial;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.Scalpel;
import net.linkle.wilder_horizons.item.gear.tools.rusty.*;
import net.linkle.wilder_horizons.item.gear.tools.scythe.ScytheBase;
import net.linkle.wilder_horizons.item.gear.tools.staff.StaffBase;
import net.linkle.wilder_horizons.item.gear.tools.throwing.RockItem;
import net.linkle.wilder_horizons.item.gear.tools.travelers_sword.TravelerBase;
import net.linkle.wilder_horizons.item.gear.tools.woodcutter_axe.WoodcutterAxeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.UnbreakableScalpelBase;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public enum WHTools implements ItemEnum, ToolConstants {

    // Environmental Tools
    BRANCH(new BranchWeaponItem(new BranchToolMaterial(), 3, -2.0f)),
    //DRIFTWOOD_BRANCH(new BranchWeaponItem(new BranchToolMaterial(), 3, -2.0f)),

    THROWING_ROCK(new RockItem(new Item.Settings().maxCount(64).group(WHGroups.WH_TOOLS))),

    // Makeshift Bone
    MAKESHIFT_KNIFE(new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    MAKESHIFT_PICKAXE(new BranchPickaxeItem(WHToolMaterials.MAKESHIFT_FLINT, 3, -3.0f)),
    MAKESHIFT_AXE(new BranchAxeItem(WHToolMaterials.MAKESHIFT_STONE, 3, -3.0f)),
    MAKESHIFT_SHOVEL(new BranchShovelItem(WHToolMaterials.MAKESHIFT_WOOD, 1, -3.0f)),
    MAKESHIFT_HOE(new BranchHoeItem(WHToolMaterials.MAKESHIFT_WOOD, 0, -3.0f)),
    MAKESHIFT_CLUB(new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    FIRE_PLOUGH(new FlintAndSteelItem(new Item.Settings().maxCount(1).group(WHGroups.WH_TOOLS).maxDamage(1))),

    // Staffs
    WOODEN_STAFF(new StaffBase(WHToolMaterials.PLANK, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS)),
    //AMETHYST_SPEAR(new StaffBase(WHToolMaterials.AMETHYST, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS)),
    BAMBOO_STAFF(new StaffBase(WHToolMaterials.BAMBOO, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS)),

    //ANTHROPOLOGISTS_ROCK_PICK(new AnthroPickaxeItem(new AnthroPickaxeMaterial())),

    //ANCIENT_CLIMBING_AXE(new ClimbingAxeItem(WHToolMaterials.STRONG_IRON, new Item.Settings().group(BOOKS).rarity(Rarity.EPIC))),
    //CORAL_KNIFE(new CoralDaggerItem(new CoralDaggerToolMaterial(), 3, -1.4f)),
    //CAVE_FISHERS_RAPIER(new CaveFisherSwordItem(new CaveFisherToolMaterial(), 4, -2.4f)),

    //Specialty Tools
    WOODEN_OAR(new StaffBase(WHToolMaterials.PLANK, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS)),
    CLIMBING_AXE(new ClimbingAxeItem(WHToolMaterials.BRASIUM, new Item.Settings().group(WHGroups.WH_TOOLS))),
    ICE_TONGS(new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS)),
    //BRASIUM_HAMMER(new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS)),

    //CORAL_KNIFE(new Scalpel(WHToolMaterials.GUARDIAN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS_UNCOMMON)),
    CORAL_KNIFE_GUARDIAN(new UnbreakableScalpelBase(WHToolMaterials.ELDER_GUARDIAN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS_RARE)),
    GEM_CUTTING_TOOLS(new GemCuttingTools(new GemCuttingToolsMaterial(),0, 0.0f)),
    MISERICORDE_DRAGON_TOOTH(new KnifeBase(WHToolMaterials.DRAGON_TOOTH, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS_RARE)),
    BLAZE_SWORD(new SwordItem(WHToolMaterials.BLAZE, SWORD_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS_UNCOMMON)),

    // Bows
    LONGBOW(new LongBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(385))),
    CHAMPIONS_BOW(new ChampionsBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(578))),
    AMETHYST_LEVELED_BOW(new AmethystLeveledBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(578))),
    BRASIUM_COMPOUND_BOW(new BrasiumBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(770))),
    BRASIUM_CROSSBOW(new BrasiumBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(770))),

    // Knives
    KNIFE_WOODEN(new KnifeBase(ToolMaterials.WOOD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_STONE(new KnifeBase(ToolMaterials.STONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_GOLDEN(new KnifeBase(ToolMaterials.GOLD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_IRON(new KnifeBase(ToolMaterials.IRON, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_BRASIUM(new KnifeBase(WHToolMaterials.BRASIUM, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_DIAMOND(new KnifeBase(ToolMaterials.DIAMOND, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_ECHOCHALCUM(new KnifeBase(WHToolMaterials.ECHOCHALCUM, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),
    KNIFE_NETHERITE(new KnifeBase(ToolMaterials.NETHERITE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS)),

    // Hatches
    HATCHET_STONE(new HatchetAxeBase(ToolMaterials.STONE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_WOODEN(new HatchetAxeBase(ToolMaterials.WOOD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_GOLDEN(new HatchetAxeBase(ToolMaterials.GOLD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_IRON(new HatchetAxeBase(ToolMaterials.IRON, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_brasium(new HatchetAxeBase(WHToolMaterials.BRASIUM, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_DIAMOND(new HatchetAxeBase(ToolMaterials.DIAMOND, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_ECHOCHALCUM(new HatchetAxeBase(WHToolMaterials.ECHOCHALCUM, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),
    HATCHET_NETHERITE(new HatchetAxeBase(ToolMaterials.NETHERITE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS)),

    // Woodcutter's Axes (upgrade from axe)
    WOODCUTTER_AXE_WOODEN(new WoodcutterAxeBase(WHToolMaterials.WOOD_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_STONE(new WoodcutterAxeBase(WHToolMaterials.STONE_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_GOLDEN(new WoodcutterAxeBase(WHToolMaterials.GOLD_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_IRON(new WoodcutterAxeBase(WHToolMaterials.IRON_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_BRASIUM(new WoodcutterAxeBase(WHToolMaterials.BRASIUM_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_DIAMOND(new WoodcutterAxeBase(WHToolMaterials.DIAMOND_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_ECHOCHALCUM(new WoodcutterAxeBase(WHToolMaterials.ECHOCHALCUM_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),
    WOODCUTTER_AXE_NETHERITE(new WoodcutterAxeBase(WHToolMaterials.NETHERITE_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS)),

    // Scythes (upgrade from hoe)
    SCYTHE_WOODEN(new ScytheBase(ToolMaterials.WOOD, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_STONE(new ScytheBase(ToolMaterials.STONE, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_GOLDEN(new ScytheBase(ToolMaterials.GOLD, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_IRON(new ScytheBase(ToolMaterials.IRON, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_BRASIUM(new ScytheBase(WHToolMaterials.BRASIUM, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_DIAMOND(new ScytheBase(ToolMaterials.DIAMOND, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_ECHOCHALCUM(new ScytheBase(WHToolMaterials.ECHOCHALCUM, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),
    SCYTHE_NETHERITE(new ScytheBase(ToolMaterials.NETHERITE, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS)),

    // Traveler (upgrade from knife)
    TRAVELER_WOODEN(new TravelerBase(ToolMaterials.WOOD, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_STONE(new TravelerBase(ToolMaterials.STONE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_GOLDEN(new TravelerBase(ToolMaterials.GOLD, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_IRON(new TravelerBase(ToolMaterials.IRON, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_BRASIUM(new TravelerBase(WHToolMaterials.BRASIUM, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_DIAMOND(new TravelerBase(ToolMaterials.DIAMOND, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_ECHOCHALCUM(new TravelerBase(WHToolMaterials.ECHOCHALCUM, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),
    TRAVELER_NETHERITE(new TravelerBase(ToolMaterials.NETHERITE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS)),

    // Brasium
    BRASIUM_SWORD(new SwordItem(WHToolMaterials.BRASIUM, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, BASIC_SETTINGS)),
    BRASIUM_SHOVEL(new ShovelItem(WHToolMaterials.BRASIUM, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, BASIC_SETTINGS)),
    BRASIUM_PICKAXE(new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS)),
    BRASIUM_AXE(new AxeItem(WHToolMaterials.BRASIUM, AXE_BASE_DAMAGE, AXE_BASE_SPEED, BASIC_SETTINGS)),
    BRASIUM_HOE(new ModHoeItem(WHToolMaterials.BRASIUM, HOE_BASE_DAMAGE, HOE_BASE_SPEED, BASIC_SETTINGS)),

    // Echochalcum
    ECHOCHALCUM_SWORD(new SwordItem(WHToolMaterials.ECHOCHALCUM, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, BASIC_SETTINGS)),
    ECHOCHALCUM_SHOVEL(new ShovelItem(WHToolMaterials.ECHOCHALCUM, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, BASIC_SETTINGS)),
    ECHOCHALCUM_PICKAXE(new PickaxeItem(WHToolMaterials.ECHOCHALCUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS)),
    ECHOCHALCUM_AXE(new AxeItem(WHToolMaterials.ECHOCHALCUM, AXE_BASE_DAMAGE, AXE_BASE_SPEED, BASIC_SETTINGS)),
    ECHOCHALCUM_HOE(new ModHoeItem(WHToolMaterials.ECHOCHALCUM, HOE_BASE_DAMAGE, HOE_BASE_SPEED, BASIC_SETTINGS)),

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
