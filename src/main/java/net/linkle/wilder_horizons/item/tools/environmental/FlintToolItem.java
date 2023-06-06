package net.linkle.wilder_horizons.item.tools.environmental;

import net.linkle.wilder_horizons.init.WHGroups;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class FlintToolItem extends AxeItem {
    public FlintToolItem(ToolMaterial FlintToolMaterial) {
        super(FlintToolMaterial, 1f, -2.0f, new Settings().group(WHGroups.WH_TOOLS));
    }
}


