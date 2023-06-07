package net.linkle.wilder_horizons.item.gear.tools.environmental;

import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RockToolItem extends PickaxeItem {
    public RockToolItem(ToolMaterial RockToolMaterial) {
        super(RockToolMaterial, 1, -2.0f, new Settings().group(WHGroups.WH_TOOLS));
    }
}


