package net.linkle.wilder_horizons.item.gear.tools;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import net.linkle.wilder_horizons.init.init_core.WHMiscItems;
import net.linkle.wilder_horizons.init.init_core.WHNature;
import net.linkle.wilder_horizons.tags.ModItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

public enum WHToolMaterials implements ToolMaterial {

    MAKESHIFT_WOOD(0, 32, 1.0F, 0F, 15, () -> {
        return Ingredient.ofItems(WHMiscItems.PLANK_ITEM);
    }),
    MAKESHIFT_CACTUS(0, 32, 1.0F, 0F, 15, () -> {
        return Ingredient.ofItems(Blocks.CACTUS);
    }),
    MAKESHIFT_STONE(1, 32, 1.0F, 0F, 5, () -> {
        return Ingredient.ofItems(WHNature.ROCKS);
    }),
    MAKESHIFT_FLINT(1, 32, 1.0F, 0F, 5, () -> {
        return Ingredient.ofItems(Items.FLINT);
    }),
    //PRIMSTEEL(2, 190, 5.0F, 1.5F, 18, () -> {
    //    return Ingredient.ofItems(ItemsModded.PRIMSTEEL_INGOT);
    //}),
    //ROSEGOLD(1, 440, 7.0F, 2.0F, 15, () -> {
    //    return Ingredient.ofItems(ItemsModded.ROSEGOLD_INGOT);
    //}),
    BRASIUM(2, 440, 7.0F, 2.0F, 15, () -> {
        return Ingredient.ofItems(WHMiscItems.BRASIUM_INGOT);
    }),
    COPPER(1, 250, 6.0F, 2.0F, 15, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    BONE(1, 131, 4.0F, 1.0F, 5, () -> {
        return Ingredient.ofItems(Items.BONE);
    }),
    PRISMARINE(2, 190, 5.0F, 2.0F, 14, () -> {
        return Ingredient.ofItems(Items.PRISMARINE_SHARD);
    }),
    BROKEN(2, 195, 5.0F, 02.0F, 10, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    GEM_CUTTING_TOOLS(0, 16, 0.0F, 0.0F, 0, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    //BRASIUM(2, 770, 6.0F, 2.0F, 14, () -> {
    //    return Ingredient.ofItems(ItemsModded.BRASIUM_INGOT);
    //}),
    //GUARDIAN(2, 780, 6.0F, 2.0F, 14, () -> {
    //    return Ingredient.ofItems(WHMiscItems.GUARDIAN_SPIKE);
    //}),
    ELDER_GUARDIAN(2, 1561, 6.0F, 4.0F, 14, () -> {
        return Ingredient.ofItems(WHMiscItems.ELDER_GUARDIAN_SPIKE);
    }),
    BAMBOO(2, 220, 7.0F, 1.0F, 15, () -> {
        return Ingredient.ofItems(Items.BAMBOO);
    }),
    DRIPSTONE(2, 220, 7.0F, 1.0F, 15, () -> {
        return Ingredient.ofItems(Items.POINTED_DRIPSTONE);
    }),
    FLINT(2, 220, 7.0F, 1.0F, 15, () -> {
        return Ingredient.ofItems(Items.FLINT);
    }),
    STRONG_IRON(2, 1561, 6.0F, 5.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    PLANK(2, 220, 7.0F, 1.0F, 15, () -> {
        return Ingredient.ofItems(WHMiscItems.PLANK_ITEM);
    }),
    OBSIDIAN(2, 440, 7.0F, 2.0F, 18, () -> {
        return Ingredient.ofItems(Blocks.OBSIDIAN);
    }),
    DRAGON_TOOTH(3, 2342, 8.0F, 3.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.DRAGON_TOOTH});
    }),
    WEAK_IRON(1, 131, 4.0F, 1.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    ECHOCHALCUM(4, 2031, 9.0F, 4.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM_INGOT});
    }),
    AMETHYST(2, 190, 5.0F, 2.0F, 22, () -> {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }),
    WOOD_EXTENDED(0, 89, 2.0F, 0.0F, 15, () -> {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }),
    STONE_EXTENDED(1, 197, 4.0F, 1.0F, 5, () -> {
        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
    }),
    BLAZE(1, 197, 4.0F, 2.5F, 5, () -> {
        return Ingredient.ofItems(Items.BLAZE_ROD);
    }),
    IRON_EXTENDED(2, 375, 6.0F, 2.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    DIAMOND_EXTENDED(3, 2342, 8.0F, 3.0F, 10, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    GOLD_EXTENDED(0, 48, 12.0F, 0.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    NETHERITE_EXTENDED(4, 3047, 9.0F, 4.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    }),
    ECHOCHALCUM_EXTENDED(4, 3047, 9.0F, 4.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{WHMiscItems.ECHOCHALCUM_INGOT});
    }),
    GODDESS_BLADE_BROKEN(4, 3047, 9.0F, 2.0F, 0, () -> {
        return Ingredient.fromTag(ModItemTags.LARGE_SOULS);
    }),
    GODDESS_BLADE(4, 3047, 9.0F, 4.0F, 30, () -> {
        return Ingredient.fromTag(ModItemTags.LARGE_SOULS);
    }),
    BRASIUM_EXTENDED(1, 660, 7.0F, 2.0F, 15, () -> {
        return Ingredient.ofItems(WHMiscItems.BRASIUM_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private WHToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
