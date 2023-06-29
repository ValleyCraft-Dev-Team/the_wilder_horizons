package net.linkle.wilder_horizons.client.entity.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Flutterer;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class ParrotModel<T extends MobEntity> extends SinglePartEntityModel<T> {

    /** The key of the feather model part, whose value is {@value}. */
    private static final String FEATHER = "feather";
    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart tail;
    private final ModelPart leftWing;
    private final ModelPart rightWing;
    private final ModelPart head;
    private final ModelPart feather;
    private final ModelPart leftLeg;
    private final ModelPart rightLeg;

    public ParrotModel(ModelPart root) {
        this.root = root;
        this.body = root.getChild(EntityModelPartNames.BODY);
        this.tail = root.getChild(EntityModelPartNames.TAIL);
        this.leftWing = root.getChild(EntityModelPartNames.LEFT_WING);
        this.rightWing = root.getChild(EntityModelPartNames.RIGHT_WING);
        this.head = root.getChild(EntityModelPartNames.HEAD);
        this.feather = this.head.getChild(FEATHER);
        this.leftLeg = root.getChild(EntityModelPartNames.LEFT_LEG);
        this.rightLeg = root.getChild(EntityModelPartNames.RIGHT_LEG);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }

    @Override
    public void setAngles(T entity, float f, float g, float h, float i, float j) {
        this.setAngles(getPose(entity), entity.age, f, g, h, i, j);
    }

    @Override
    public void animateModel(T entity, float f, float g, float h) {
        this.animateModel(getPose(entity));
    }

    private void setAngles(Pose pose, int danceAngle, float limbAngle, float limbDistance, float age, float headYaw, float headPitch) {
        this.head.pitch = headPitch * ((float)Math.PI / 180);
        this.head.yaw = headYaw * ((float)Math.PI / 180);
        this.head.roll = 0.0f;
        this.head.pivotX = 0.0f;
        this.body.pivotX = 0.0f;
        this.tail.pivotX = 0.0f;
        this.rightWing.pivotX = -1.5f;
        this.leftWing.pivotX = 1.5f;
        switch (pose) {
            case STANDING: {
                this.leftLeg.pitch += MathHelper.cos(limbAngle * 0.6662f) * 1.4f * limbDistance;
                this.rightLeg.pitch += MathHelper.cos(limbAngle * 0.6662f + (float)Math.PI) * 1.4f * limbDistance;
            }
            default: {
                float h = age * 0.3f;
                this.head.pivotY = 15.69f + h;
                this.tail.pitch = 1.015f + MathHelper.cos(limbAngle * 0.6662f) * 0.3f * limbDistance;
                this.tail.pivotY = 21.07f + h;
                this.body.pivotY = 16.5f + h;
                this.leftWing.roll = -0.0873f - age;
                this.leftWing.pivotY = 16.94f + h;
                this.rightWing.roll = 0.0873f + age;
                this.rightWing.pivotY = 16.94f + h;
                this.leftLeg.pivotY = 22.0f + h;
                this.rightLeg.pivotY = 22.0f + h;
            }
        }
    }

    private void animateModel(Pose pose) {
        this.feather.pitch = -0.2214f;
        this.body.pitch = 0.4937f;
        this.leftWing.pitch = -0.6981f;
        this.leftWing.yaw = (float)(-Math.PI);
        this.rightWing.pitch = -0.6981f;
        this.rightWing.yaw = (float)(-Math.PI);
        this.leftLeg.pitch = -0.0299f;
        this.rightLeg.pitch = -0.0299f;
        this.leftLeg.pivotY = 22.0f;
        this.rightLeg.pivotY = 22.0f;
        this.leftLeg.roll = 0.0f;
        this.rightLeg.roll = 0.0f;
        switch (pose) {
            case FLYING: {
                this.leftLeg.pitch += 0.6981317f;
                this.rightLeg.pitch += 0.6981317f;
                break;
            }
        }
    }

    private static Pose getPose(MobEntity entity) {
        if (entity instanceof Flutterer flutterer && flutterer.isInAir()) {
            return Pose.FLYING;
        }
        return Pose.STANDING;
    }

    @Environment(value=EnvType.CLIENT)
    public static enum Pose {
        FLYING,
        STANDING
    }
}
