package net.linkle.wilder_horizons.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.wilder_horizons.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class WHGroups {
    public static final ItemGroup WH_NATURE = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_nature"), () -> new ItemStack(WHNature.));
    public static final ItemGroup WH_FOOD = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_food"), () -> new ItemStack(WHFoods.COD_CHOWDER));
    public static final ItemGroup WH_FOOD_SPECIAL = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_food_special"), () -> new ItemStack(WHFoodsSpecial.));
    public static final ItemGroup WH_MEDICINAL = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_medicinal"), () -> new ItemStack(WHMedicines.SOAP));
    public static final ItemGroup WH_MISCELLANEOUS = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_miscellaneous"), () -> new ItemStack(WHMiscItems.JELLY_BLOB));
    public static final ItemGroup WH_ARMORS = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_armors"), () -> new ItemStack(WHArmors.STRAW_HAT));
    public static final ItemGroup WH_TOOLS = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_tools"), () -> new ItemStack(WHTools.));
    public static final ItemGroup WH_BLOCKS = FabricItemGroupBuilder.build
            (new Identifier(Main.ID,"wh_blocks"), () -> new ItemStack(WHBlocks.));
}
