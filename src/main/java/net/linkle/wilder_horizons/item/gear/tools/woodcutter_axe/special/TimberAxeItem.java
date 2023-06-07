package net.linkle.wilder_horizons.item.gear.tools.woodcutter_axe.special;

import net.linkle.wilder_horizons.init.init_exterior.WHGroups;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class TimberAxeItem extends AxeItem {
    public TimberAxeItem(ToolMaterial TimberAxeToolMaterial) {
        super(TimberAxeToolMaterial, 7.5f, -3.2f, new Settings().group(WHGroups.WH_TOOLS));
    }
}


