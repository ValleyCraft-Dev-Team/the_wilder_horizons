package net.linkle.wilder_horizons.client.entity.renderer;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.entity.CrowEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class CrowRenderer extends ParrotRenderer<CrowEntity> {
    public CrowRenderer(EntityRendererFactory.Context context) {
        super(context, Main.makeId("textures/entity/birds/crow.png"));
    }
}
