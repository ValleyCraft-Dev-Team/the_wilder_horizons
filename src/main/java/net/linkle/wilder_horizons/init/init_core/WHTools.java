package net.linkle.wilder_horizons.init.init_core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.linkle.wilder_horizons.interfaces.PreventDestroy;
import net.linkle.wilder_horizons.item.ClimbingAxeItem;
import net.linkle.wilder_horizons.item.ModHoeItem;
import net.linkle.wilder_horizons.item.gear.tools.WHToolMaterials;
import net.linkle.wilder_horizons.item.gear.tools.environmental.*;
import net.linkle.wilder_horizons.item.gear.tools.hatchet.HatchetAxeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.KnifeBase;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.Scalpel;
import net.linkle.wilder_horizons.item.gear.tools.rusty.*;
import net.linkle.wilder_horizons.item.gear.tools.scythe.ScytheBase;
import net.linkle.wilder_horizons.item.gear.tools.staff.StaffBase;
import net.linkle.wilder_horizons.item.gear.tools.throwing.RockItem;
import net.linkle.wilder_horizons.item.gear.tools.travelers_sword.TravelerBase;
import net.linkle.wilder_horizons.item.gear.tools.woodcutter_axe.WoodcutterAxeBase;
import net.linkle.wilder_horizons.item.tools.bows.ModBowItem;
import net.linkle.wilder_horizons.item.gear.tools.knife.special.UnbreakableScalpelBase;
import net.linkle.wilder_horizons.util.Reg;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class WHTools {
    //When we need to access a tool or weapon elsewhere in the codebase, such as to inject them into loot tables, we need them stored in variables.

    //environmental tools
    public static final Item BRANCH = new BranchWeaponItem(new BranchToolMaterial(), 3, -2.0f);
    public static final Item DRIFTWOOD_BRANCH = new BranchWeaponItem(new BranchToolMaterial(), 3, -2.0f);

    public static final Item THROWING_ROCK = new RockItem(new Item.Settings().maxCount(64).group(WHGroups.WH_TOOLS));

    public static final Item MAKESHIFT_PICKAXE = new BranchPickaxeItem(WHToolMaterials.MAKESHIFT_FLINT, 3, -3.0f);
    public static final Item MAKESHIFT_AXE = new BranchAxeItem(WHToolMaterials.MAKESHIFT_STONE, 3, -3.0f);
    public static final Item MAKESHIFT_SHOVEL = new BranchShovelItem(WHToolMaterials.MAKESHIFT_WOOD, 1, -3.0f);
    public static final Item MAKESHIFT_HOE = new BranchHoeItem(WHToolMaterials.MAKESHIFT_WOOD, 0, -3.0f);

    public static final Item RUSTY_SWORD = new RustySwordItem(new RustyMaterial(),4, -2.4f);
    public static final Item RUSTY_PICKAXE = new RustyPickaxeItem(new RustyMaterial(),2, -2.8f);
    public static final Item RUSTY_AXE = new RustyAxeItem(new RustyMaterial(),7, -3.0f);
    public static final Item RUSTY_HOE = new RustyHoeItem(new RustyMaterial(),0, -1.0f);
    public static final Item RUSTY_SHOVEL = new RustyShovelItem(new RustyMaterial(),2, -3.0f);

    //public static final Item ANTHROPOLOGISTS_ROCK_PICK = new AnthroPickaxeItem(new AnthroPickaxeMaterial());

    //public static final Item ANCIENT_CLIMBING_AXE = new ClimbingAxeItem(WHToolMaterials.STRONG_IRON, new Item.Settings().group(BOOKS).rarity(Rarity.EPIC));
    //public static final Item CORAL_KNIFE = new CoralDaggerItem(new CoralDaggerToolMaterial(), 3, -1.4f);
    //public static final Item CAVE_FISHERS_RAPIER = new CaveFisherSwordItem(new CaveFisherToolMaterial(), 4, -2.4f);
    public static final Item CLIMBING_AXE = new ClimbingAxeItem(WHToolMaterials.BRASIUM, new Item.Settings().group(WHGroups.WH_TOOLS));

    //The base attack damage of each tool type.
    //These values are added to the attack stats of their materials when they're registered.
    //The attack stats are listed in RoseGoldToolMaterial.class.
    public static final Integer KNIFE_BASE_DAMAGE = 2;
    public static final Integer DAGGER_BASE_DAMAGE = 3;
    public static final Integer WOODCUTTER_BASE_DAMAGE = 8;
    public static final Integer SCYTHE_BASE_DAMAGE = 4;
    public static final Integer HATCHET_BASE_DAMAGE = 5;
    public static final Integer SPEAR_BASE_DAMAGE = 3;
    public static final Integer TRAVELER_BASE_DAMAGE = 3;
    public static final Integer MACE_BASE_DAMAGE = 3;
    public static final Integer STAFF_BASE_DAMAGE = 3;
    public static final Integer GREATSWORD_BASE_DAMAGE = 8;

    public static final Integer MAKESHIFT_BASED_DAMAGE = 1;

    //The base attack speed of each tool type.
    //These numbers are subtracted from four, so 4.0 will make the tool never charge, and higher will likely cause issues.
    //Larger number = slower, smaller number = faster.
    public static final Float KNIFE_BASE_SPEED = -2.2f;
    public static final Float WOODCUTTER_BASE_SPEED = -3.3f;
    public static final Float SCYTHE_BASE_SPEED = -3.0f;
    public static final Float DAGGER_BASE_SPEED = -2.4f;
    public static final Float HATCHET_BASE_SPEED = -2.4f;
    public static final Float SPEAR_BASE_SPEED = -2.6f;
    public static final Float TRAVELER_BASE_SPEED = -2.2f;
    public static final Float MACE_BASE_SPEED = -2.2f;
    public static final Float STAFF_BASE_SPEED = -2.2f;
    public static final Float GREATSWORD_BASE_SPEED = -3.2f;

    //these are all vanilla, dont alter them Linkle! signed, Linkle
    public static final Integer AXE_BASE_DAMAGE = 6;
    public static final Float AXE_BASE_SPEED = -3.2f;
    public static final Integer PICKAXE_BASE_DAMAGE = 1;
    public static final Float PICKAXE_BASE_SPEED = -2.8f;
    public static final Integer SWORD_BASE_DAMAGE = 3;
    public static final Float SWORD_BASE_SPEED = -2.4f;
    public static final Float SHOVEL_BASE_DAMAGE = 1.5f;
    public static final Float SHOVEL_BASE_SPEED = -3.0f;
    public static final Integer HOE_BASE_DAMAGE = 0;
    public static final Float HOE_BASE_SPEED = -3.0f;
    //The item settings for knives made of 'basic' materials- wood, gold, stone, iron, rose gold, diamond, netherite
    public static final Item.Settings BASIC_SETTINGS = new Item.Settings().group(WHGroups.WH_TOOLS);
    public static final Item.Settings BASIC_SETTINGS_RARE = new Item.Settings().group(WHGroups.WH_TOOLS).rarity(Rarity.RARE);
    public static final Item.Settings BASIC_SETTINGS_UNCOMMON = new Item.Settings().group(WHGroups.WH_TOOLS).rarity(Rarity.UNCOMMON);
    //public static final Item.Settings BASIC_ARTIFACT_SETTINGS_RARE = new Item.Settings().group(BOOKS).rarity(Rarity.RARE);
    //public static final Item.Settings BASIC_ARTIFACT_SETTINGS_EPIC = new Item.Settings().group(BOOKS).rarity(Rarity.EPIC);
    //public static final Item.Settings BASIC_ARTIFACT_SETTINGS_UNCOMMON = new Item.Settings().group(BOOKS).rarity(Rarity.UNCOMMON);
    //public static final Item.Settings UNBREAKABLE_ARTIFACT_SETTINGS_EPIC_1561 = new Item.Settings().maxDamage(1561).fireproof().group(BOOKS).rarity(Rarity.EPIC);
    //public static final Item.Settings UNBREAKABLE_ARTIFACT_SETTINGS_EPIC_780 = new Item.Settings().maxDamage(780).fireproof().group(BOOKS).rarity(Rarity.EPIC);

    //bow reg
    public static final Item BRASIUM_COMPOUND = new ModBowItem(new FabricItemSettings().group(WHGroups.WH_TOOLS).maxDamage(770));

    //wooden tools
    public static final Item KNIFE_WOODEN = new KnifeBase(ToolMaterials.WOOD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS);
    public static final Item HATCHET_WOODEN = new HatchetAxeBase(ToolMaterials.WOOD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS);
    public static final Item WOODCUTTER_AXE_WOODEN = new WoodcutterAxeBase(WHToolMaterials.WOOD_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS);
    public static final Item SCYTHE_WOODEN = new ScytheBase(ToolMaterials.WOOD, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS);
    public static final Item TRAVELER_WOODEN = new TravelerBase(ToolMaterials.WOOD, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS);
    public static final Item WOODEN_OAR = new StaffBase(WHToolMaterials.PLANK, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS);
    public static final Item WOODEN_STAFF = new StaffBase(WHToolMaterials.PLANK, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS);
    public static final Item BAMBOO_STAFF = new StaffBase(WHToolMaterials.BAMBOO, STAFF_BASE_DAMAGE, STAFF_BASE_SPEED, BASIC_SETTINGS);

    public static final Item SCYTHE_IRON = new ScytheBase(ToolMaterials.IRON, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS);
    public static final Item ICE_TONGS = new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS);

    public static void initialize() {
        //Environmental
        Reg.register("branch", BRANCH);
        Reg.register("driftwood_branch", DRIFTWOOD_BRANCH);

        Reg.register("throwing_rock", THROWING_ROCK);

        Reg.register("makeshift_knife", new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("makeshift_shovel", MAKESHIFT_SHOVEL);
        Reg.register("makeshift_pickaxe", MAKESHIFT_PICKAXE);
        Reg.register("makeshift_axe", MAKESHIFT_AXE);
        Reg.register("makeshift_hoe", MAKESHIFT_HOE);
        Reg.register("makeshift_club", new KnifeBase(WHToolMaterials.MAKESHIFT_WOOD, MAKESHIFT_BASED_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));

        //makeshift bone
        Reg.register("knife_bone", new KnifeBase(WHToolMaterials.BONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("bone_shovel", new ShovelItem(WHToolMaterials.BONE, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("bone_pickaxe", new PickaxeItem(WHToolMaterials.BONE, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("bone_axe", new AxeItem(WHToolMaterials.BONE, AXE_BASE_DAMAGE, AXE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("bone_hoe", new ModHoeItem(WHToolMaterials.BONE, HOE_BASE_DAMAGE, HOE_BASE_SPEED, BASIC_SETTINGS));

        //Staffs
        Reg.register("wooden_staff", WOODEN_STAFF);
        Reg.register("bamboo_staff", BAMBOO_STAFF);

        //Specialty Tools
        Reg.register("wooden_oar", WOODEN_OAR);
        Reg.register("climbing_axe", CLIMBING_AXE);
        Reg.register("ice_tongs", ICE_TONGS);
        Reg.register("brasium_compound_bow", BRASIUM_COMPOUND);
        Reg.register("coral_knife", new Scalpel(WHToolMaterials.GUARDIAN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS_UNCOMMON));
        Item knifeElder = Reg.register("coral_knife_guardian", new UnbreakableScalpelBase(WHToolMaterials.ELDER_GUARDIAN, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS_RARE));
        ModelPredicateProviderRegistry.register(knifeElder, new Identifier("broken"), (stack, world, entity, seed) -> PreventDestroy.isUsable(stack) ? 0.0f : 1.0f);

        //Knives
        Reg.register("knife_wooden", KNIFE_WOODEN);
        Reg.register("knife_stone", new KnifeBase(ToolMaterials.STONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("knife_golden", new KnifeBase(ToolMaterials.GOLD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("knife_iron", new KnifeBase(ToolMaterials.IRON, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("knife_brasium", new KnifeBase(WHToolMaterials.BRASIUM, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("knife_diamond", new KnifeBase(ToolMaterials.DIAMOND, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("knife_echochalcum", new KnifeBase(WHToolMaterials.ECHOCHALCUM, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("knife_netherite", new KnifeBase(ToolMaterials.NETHERITE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_SETTINGS));

        //Hatchets
        Reg.register("hatchet_wooden", HATCHET_WOODEN);
        Reg.register("hatchet_stone", new HatchetAxeBase(ToolMaterials.STONE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("hatchet_golden", new HatchetAxeBase(ToolMaterials.GOLD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("hatchet_iron", new HatchetAxeBase(ToolMaterials.IRON, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("hatchet_brasium", new HatchetAxeBase(WHToolMaterials.BRASIUM, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("hatchet_diamond", new HatchetAxeBase(ToolMaterials.DIAMOND, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("hatchet_echochalcum", new HatchetAxeBase(WHToolMaterials.ECHOCHALCUM, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("hatchet_netherite", new HatchetAxeBase(ToolMaterials.NETHERITE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED, BASIC_SETTINGS));

        //Woodcutter's Axes (upgrade from axe)
        Reg.register("woodcutter_axe_wooden", WOODCUTTER_AXE_WOODEN);
        Reg.register("woodcutter_axe_stone", new WoodcutterAxeBase(WHToolMaterials.STONE_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("woodcutter_axe_golden", new WoodcutterAxeBase(WHToolMaterials.GOLD_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("woodcutter_axe_iron", new WoodcutterAxeBase(WHToolMaterials.IRON_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("woodcutter_axe_brasium", new WoodcutterAxeBase(WHToolMaterials.BRASIUM_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("woodcutter_axe_diamond", new WoodcutterAxeBase(WHToolMaterials.DIAMOND_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("woodcutter_axe_echochalcum", new WoodcutterAxeBase(WHToolMaterials.ECHOCHALCUM_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("woodcutter_axe_netherite", new WoodcutterAxeBase(WHToolMaterials.NETHERITE_EXTENDED, WOODCUTTER_BASE_DAMAGE, WOODCUTTER_BASE_SPEED, BASIC_SETTINGS));

        //Scythes (upgrade from hoe)
        Reg.register("scythe_wooden", SCYTHE_WOODEN);
        Reg.register("scythe_stone", new ScytheBase(ToolMaterials.STONE, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("scythe_golden", new ScytheBase(ToolMaterials.GOLD, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("scythe_iron", SCYTHE_IRON);
        Reg.register("scythe_brasium", new ScytheBase(WHToolMaterials.BRASIUM, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("scythe_diamond", new ScytheBase(ToolMaterials.DIAMOND, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("scythe_echochalcum", new ScytheBase(WHToolMaterials.ECHOCHALCUM, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("scythe_netherite", new ScytheBase(ToolMaterials.NETHERITE, SCYTHE_BASE_DAMAGE, SCYTHE_BASE_SPEED, BASIC_SETTINGS));

        //Traveler (upgrade from knife)
        Reg.register("traveler_wooden", TRAVELER_WOODEN);
        Reg.register("traveler_stone", new TravelerBase(ToolMaterials.STONE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("traveler_golden", new TravelerBase(ToolMaterials.GOLD, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("traveler_iron", new TravelerBase(ToolMaterials.IRON, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("traveler_brasium", new TravelerBase(WHToolMaterials.BRASIUM, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("traveler_diamond", new TravelerBase(ToolMaterials.DIAMOND, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("traveler_echochalcum", new TravelerBase(WHToolMaterials.ECHOCHALCUM, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("traveler_netherite", new TravelerBase(ToolMaterials.NETHERITE, TRAVELER_BASE_DAMAGE, TRAVELER_BASE_SPEED, BASIC_SETTINGS));

        //Brasium
        Reg.register("brasium_sword", new SwordItem(WHToolMaterials.BRASIUM, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("brasium_shovel", new ShovelItem(WHToolMaterials.BRASIUM, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("brasium_pickaxe", new PickaxeItem(WHToolMaterials.BRASIUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("brasium_axe", new AxeItem(WHToolMaterials.BRASIUM, AXE_BASE_DAMAGE, AXE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("brasium_hoe", new ModHoeItem(WHToolMaterials.BRASIUM, HOE_BASE_DAMAGE, HOE_BASE_SPEED, BASIC_SETTINGS));

        //Echochalcum
        Reg.register("echochalcum_sword", new SwordItem(WHToolMaterials.ECHOCHALCUM, SWORD_BASE_DAMAGE, SWORD_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("echochalcum_shovel", new ShovelItem(WHToolMaterials.ECHOCHALCUM, SHOVEL_BASE_DAMAGE, SHOVEL_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("echochalcum_pickaxe", new PickaxeItem(WHToolMaterials.ECHOCHALCUM, PICKAXE_BASE_DAMAGE, PICKAXE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("echochalcum_axe", new AxeItem(WHToolMaterials.ECHOCHALCUM, AXE_BASE_DAMAGE, AXE_BASE_SPEED, BASIC_SETTINGS));
        Reg.register("echochalcum_hoe", new ModHoeItem(WHToolMaterials.ECHOCHALCUM, HOE_BASE_DAMAGE, HOE_BASE_SPEED, BASIC_SETTINGS));

        //rusty
        Reg.register("rusted_sword", RUSTY_SWORD);
        Reg.register("rusted_shovel", RUSTY_SHOVEL);
        Reg.register("rusted_pickaxe", RUSTY_PICKAXE);
        Reg.register("rusted_axe", RUSTY_AXE);
        Reg.register("rusted_hoe", RUSTY_HOE);
    }
}
