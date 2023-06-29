package net.linkle.wilder_horizons.client.entity.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.client.entity.model.ParrotModel;
import net.linkle.wilder_horizons.entity.Bird;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class ParrotRenderer<T extends MobEntity> extends MobEntityRenderer<T, ParrotModel<T>> {

    private final Identifier texture;

    public ParrotRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context, new ParrotModel<T>(context.getPart(EntityModelLayers.PARROT)), 0.3f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(T entity) {
        return texture;
    }

    @Override
    public float getAnimationProgress(T entity, float f) {
        var bird = (Bird)entity;
        float g = MathHelper.lerp(f, bird.prevFlapProgress(), bird.flapProgress());
        float h = MathHelper.lerp(f, bird.prevMaxWingDeviation(), bird.maxWingDeviation());
        return (MathHelper.sin(g) + 1.0f) * h;
    }

    /** @param texture file path of the entity texture. */
    public static EntityRendererFactory<MobEntity> create(String texture) {
        var id = Main.makeId("textures/entity/" + texture + ".png");
        return context -> new ParrotRenderer<MobEntity>(context, id);
    }
}
