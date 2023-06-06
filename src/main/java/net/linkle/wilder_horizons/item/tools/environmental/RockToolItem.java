package net.linkle.wilder_horizons.tool.environmental;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.wilder_horizons.init.Groups.VC_TOOLS;

public class RockToolItem extends PickaxeItem {
    public RockToolItem(ToolMaterial RockToolMaterial) {
        super(RockToolMaterial, 1, -2.0f, new Settings().group(VC_TOOLS));
    }
}


