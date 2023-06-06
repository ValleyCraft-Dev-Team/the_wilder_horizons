package net.linkle.wilder_horizons.tool.anthro;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.wilder_horizons.init.Groups.VC_TOOLS;

public class AnthroPickaxeItem extends PickaxeItem {
    public AnthroPickaxeItem(ToolMaterial AnthroPickaxeMaterial) {
        super(AnthroPickaxeMaterial, 5, -2.5f, new Settings().group(VC_TOOLS));
    }
}


