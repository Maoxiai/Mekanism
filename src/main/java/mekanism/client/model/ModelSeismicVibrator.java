package mekanism.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class ModelSeismicVibrator extends Model {

    private static final ResourceLocation VIBRATOR_TEXTURE = MekanismUtils.getResource(ResourceType.RENDER, "seismic_vibrator.png");
    private final RenderType RENDER_TYPE = func_228282_a_(VIBRATOR_TEXTURE);

    private final ModelRenderer plate3;
    private final ModelRenderer baseBack;
    private final ModelRenderer motor;
    private final ModelRenderer port;
    private final ModelRenderer pole4;
    private final ModelRenderer shaft2;
    private final ModelRenderer shaft1;
    private final ModelRenderer arm3;
    private final ModelRenderer plate2;
    private final ModelRenderer arm2;
    private final ModelRenderer arm1;
    private final ModelRenderer top;
    private final ModelRenderer frameBack5;
    private final ModelRenderer pole3;
    private final ModelRenderer frameRight5;
    private final ModelRenderer baseRight;
    private final ModelRenderer baseFront;
    private final ModelRenderer baseLeft;
    private final ModelRenderer frameRight3;
    private final ModelRenderer pole1;
    private final ModelRenderer frameRight4;
    private final ModelRenderer frameRight1;
    private final ModelRenderer frameRight2;
    private final ModelRenderer frameLeft5;
    private final ModelRenderer frameLeft4;
    private final ModelRenderer frameBack3;
    private final ModelRenderer frameLeft2;
    private final ModelRenderer frameLeft1;
    private final ModelRenderer pole2;
    private final ModelRenderer frameBack1;
    private final ModelRenderer frameBack2;
    private final ModelRenderer frameBack4;
    private final ModelRenderer frameLeft3;
    private final ModelRenderer conduit;
    private final ModelRenderer plate1;
    private final ModelRenderer rivet10;
    private final ModelRenderer rivet5;
    private final ModelRenderer rivet1;
    private final ModelRenderer rivet6;
    private final ModelRenderer rivet2;
    private final ModelRenderer rivet7;
    private final ModelRenderer rivet3;
    private final ModelRenderer rivet8;
    private final ModelRenderer rivet4;
    private final ModelRenderer rivet9;

    public ModelSeismicVibrator() {
        super(RenderType::func_228634_a_);
        textureWidth = 128;
        textureHeight = 64;

        plate3 = new ModelRenderer(this, 36, 42);
        plate3.func_228304_a_(0F, 0F, 0F, 8, 2, 8, false);
        plate3.setRotationPoint(-4F, 22F, -4F);
        plate3.setTextureSize(128, 64);
        plate3.mirror = true;
        setRotation(plate3, 0F, 0F, 0F);
        baseBack = new ModelRenderer(this, 0, 26);
        baseBack.func_228304_a_(0F, 0F, 0F, 16, 5, 3, false);
        baseBack.setRotationPoint(-8F, 19F, 5F);
        baseBack.setTextureSize(128, 64);
        baseBack.mirror = true;
        setRotation(baseBack, 0F, 0F, 0F);
        motor = new ModelRenderer(this, 76, 13);
        motor.func_228304_a_(0F, 0F, 0F, 6, 4, 10, false);
        motor.setRotationPoint(-3F, -5F, -3F);
        motor.setTextureSize(128, 64);
        motor.mirror = true;
        setRotation(motor, 0F, 0F, 0F);
        port = new ModelRenderer(this, 38, 33);
        port.func_228304_a_(0F, 0F, 0F, 8, 8, 1, false);
        port.setRotationPoint(-4F, 12F, 7.01F);
        port.setTextureSize(128, 64);
        port.mirror = true;
        setRotation(port, 0F, 0F, 0F);
        pole4 = new ModelRenderer(this, 0, 34);
        pole4.func_228304_a_(0F, 0F, 0F, 1, 25, 1, false);
        pole4.setRotationPoint(6.5F, -6F, 6.5F);
        pole4.setTextureSize(128, 64);
        pole4.mirror = true;
        setRotation(pole4, 0F, 0F, 0F);
        shaft2 = new ModelRenderer(this, 16, 34);
        shaft2.func_228304_a_(0F, 0F, 0F, 3, 11, 3, false);
        shaft2.setRotationPoint(-1.5F, -5F, -1.5F);
        shaft2.setTextureSize(128, 64);
        shaft2.mirror = true;
        setRotation(shaft2, 0F, 0F, 0F);
        shaft1 = new ModelRenderer(this, 8, 34);
        shaft1.func_228304_a_(0F, 0F, 0F, 2, 15, 2, false);
        shaft1.setRotationPoint(-1F, 6F, -1F);
        shaft1.setTextureSize(128, 64);
        shaft1.mirror = true;
        setRotation(shaft1, 0F, 0F, 0F);
        arm3 = new ModelRenderer(this, 0, 6);
        arm3.func_228304_a_(0F, 0F, 0F, 2, 2, 4, false);
        arm3.setRotationPoint(-1F, 7F, 3F);
        arm3.setTextureSize(128, 64);
        arm3.mirror = true;
        setRotation(arm3, -0.3665191F, 0F, 0F);
        plate2 = new ModelRenderer(this, 48, 0);
        plate2.func_228304_a_(0F, 0F, 0F, 4, 2, 4, false);
        plate2.setRotationPoint(-2F, 21F, -2F);
        plate2.setTextureSize(128, 64);
        plate2.mirror = true;
        setRotation(plate2, 0F, 0F, 0F);
        arm2 = new ModelRenderer(this, 48, 6);
        arm2.func_228304_a_(0F, 0F, 0F, 4, 2, 4, false);
        arm2.setRotationPoint(-2F, 7F, -2F);
        arm2.setTextureSize(128, 64);
        arm2.mirror = true;
        setRotation(arm2, 0F, 0F, 0F);
        arm1 = new ModelRenderer(this, 56, 33);
        arm1.func_228304_a_(0F, 0F, 0F, 3, 2, 4, false);
        arm1.setRotationPoint(-1.5F, 7F, 2F);
        arm1.setTextureSize(128, 64);
        arm1.mirror = true;
        setRotation(arm1, 0F, 0F, 0F);
        top = new ModelRenderer(this, 0, 0);
        top.func_228304_a_(0F, 0F, 0F, 16, 2, 16, false);
        top.setRotationPoint(-8F, -8F, -8F);
        top.setTextureSize(128, 64);
        top.mirror = true;
        setRotation(top, 0F, 0F, 0F);
        frameBack5 = new ModelRenderer(this, 4, 34);
        frameBack5.func_228304_a_(-1F, 0F, 0F, 1, 19, 1, false);
        frameBack5.setRotationPoint(7.5F, 7F, 6.49F);
        frameBack5.setTextureSize(128, 64);
        frameBack5.mirror = true;
        setRotation(frameBack5, 0F, 0F, 0.837758F);
        pole3 = new ModelRenderer(this, 0, 34);
        pole3.func_228304_a_(0F, 0F, 0F, 1, 25, 1, false);
        pole3.setRotationPoint(6.5F, -6F, -7.5F);
        pole3.setTextureSize(128, 64);
        pole3.mirror = true;
        setRotation(pole3, 0F, 0F, 0F);
        frameRight5 = new ModelRenderer(this, 4, 34);
        frameRight5.func_228304_a_(0F, 0F, 0F, 1, 19, 1, false);
        frameRight5.setRotationPoint(6.485F, 7F, -7.5F);
        frameRight5.setTextureSize(128, 64);
        frameRight5.mirror = true;
        setRotation(frameRight5, 0.837758F, 0F, 0F);
        baseRight = new ModelRenderer(this, 38, 18);
        baseRight.mirror = true;
        baseRight.func_228304_a_(0F, 0F, 0F, 3, 5, 10, false);
        baseRight.setRotationPoint(5F, 19F, -5F);
        baseRight.setTextureSize(128, 64);
        setRotation(baseRight, 0F, 0F, 0F);
        baseFront = new ModelRenderer(this, 0, 18);
        baseFront.func_228304_a_(0F, 0F, 0F, 16, 5, 3, false);
        baseFront.setRotationPoint(-8F, 19F, -8F);
        baseFront.setTextureSize(128, 64);
        baseFront.mirror = true;
        setRotation(baseFront, 0F, 0F, 0F);
        baseLeft = new ModelRenderer(this, 38, 18);
        baseLeft.func_228304_a_(0F, 0F, 0F, 3, 5, 10, false);
        baseLeft.setRotationPoint(-8F, 19F, -5F);
        baseLeft.setTextureSize(128, 64);
        baseLeft.mirror = true;
        setRotation(baseLeft, 0F, 0F, 0F);
        frameRight3 = new ModelRenderer(this, 64, 27);
        frameRight3.func_228304_a_(0F, 0F, 0F, 1, 1, 13, false);
        frameRight3.setRotationPoint(6.5F, 6F, -6.5F);
        frameRight3.setTextureSize(128, 64);
        frameRight3.mirror = true;
        setRotation(frameRight3, 0F, 0F, 0F);
        pole1 = new ModelRenderer(this, 0, 34);
        pole1.func_228304_a_(0F, 0F, 0F, 1, 25, 1, false);
        pole1.setRotationPoint(-7.5F, -6F, -7.5F);
        pole1.setTextureSize(128, 64);
        pole1.mirror = true;
        setRotation(pole1, 0F, 0F, 0F);
        frameRight4 = new ModelRenderer(this, 4, 34);
        frameRight4.func_228304_a_(0F, 0F, -1F, 1, 19, 1, false);
        frameRight4.setRotationPoint(6.49F, 7F, 7.5F);
        frameRight4.setTextureSize(128, 64);
        frameRight4.mirror = true;
        setRotation(frameRight4, -0.837758F, 0F, 0F);
        frameRight1 = new ModelRenderer(this, 4, 34);
        frameRight1.func_228304_a_(0F, 0F, 0F, 1, 19, 1, false);
        frameRight1.setRotationPoint(6.485F, -6F, -7.5F);
        frameRight1.setTextureSize(128, 64);
        frameRight1.mirror = true;
        setRotation(frameRight1, 0.837758F, 0F, 0F);
        frameRight2 = new ModelRenderer(this, 4, 34);
        frameRight2.func_228304_a_(0F, 0F, -1F, 1, 19, 1, false);
        frameRight2.setRotationPoint(6.49F, -6F, 7.5F);
        frameRight2.setTextureSize(128, 64);
        frameRight2.mirror = true;
        setRotation(frameRight2, -0.837758F, 0F, 0F);
        frameLeft5 = new ModelRenderer(this, 4, 34);
        frameLeft5.func_228304_a_(0F, 0F, 0F, 1, 19, 1, false);
        frameLeft5.setRotationPoint(-7.485F, 7F, -7.5F);
        frameLeft5.setTextureSize(128, 64);
        frameLeft5.mirror = true;
        setRotation(frameLeft5, 0.837758F, 0F, 0F);
        frameLeft4 = new ModelRenderer(this, 4, 34);
        frameLeft4.func_228304_a_(0F, 0F, -1F, 1, 19, 1, false);
        frameLeft4.setRotationPoint(-7.49F, 7F, 7.5F);
        frameLeft4.setTextureSize(128, 64);
        frameLeft4.mirror = true;
        setRotation(frameLeft4, -0.837758F, 0F, 0F);
        frameBack3 = new ModelRenderer(this, 36, 52);
        frameBack3.func_228304_a_(0F, 0F, 0F, 13, 1, 1, false);
        frameBack3.setRotationPoint(-6.5F, 6F, 6.5F);
        frameBack3.setTextureSize(128, 64);
        frameBack3.mirror = true;
        setRotation(frameBack3, 0F, 0F, 0F);
        frameLeft2 = new ModelRenderer(this, 4, 34);
        frameLeft2.func_228304_a_(0F, 0F, 0F, 1, 19, 1, false);
        frameLeft2.setRotationPoint(-7.485F, -6F, -7.5F);
        frameLeft2.setTextureSize(128, 64);
        frameLeft2.mirror = true;
        setRotation(frameLeft2, 0.837758F, 0F, 0F);
        frameLeft1 = new ModelRenderer(this, 4, 34);
        frameLeft1.func_228304_a_(0F, 0F, -1F, 1, 19, 1, false);
        frameLeft1.setRotationPoint(-7.49F, -6F, 7.5F);
        frameLeft1.setTextureSize(128, 64);
        frameLeft1.mirror = true;
        setRotation(frameLeft1, -0.837758F, 0F, 0F);
        pole2 = new ModelRenderer(this, 0, 34);
        pole2.func_228304_a_(0F, 0F, 0F, 1, 25, 1, false);
        pole2.setRotationPoint(-7.5F, -6F, 6.5F);
        pole2.setTextureSize(128, 64);
        pole2.mirror = true;
        setRotation(pole2, 0F, 0F, 0F);
        frameBack1 = new ModelRenderer(this, 4, 34);
        frameBack1.func_228304_a_(-1F, 0F, 0F, 1, 19, 1, false);
        frameBack1.setRotationPoint(7.5F, -6F, 6.49F);
        frameBack1.setTextureSize(128, 64);
        frameBack1.mirror = true;
        setRotation(frameBack1, 0F, 0F, 0.837758F);
        frameBack2 = new ModelRenderer(this, 4, 34);
        frameBack2.func_228304_a_(0F, 0F, 0F, 1, 19, 1, false);
        frameBack2.setRotationPoint(-7.5F, -6F, 6.49F);
        frameBack2.setTextureSize(128, 64);
        frameBack2.mirror = true;
        setRotation(frameBack2, 0F, 0F, -0.837758F);
        frameBack4 = new ModelRenderer(this, 4, 34);
        frameBack4.func_228304_a_(0F, 0F, 0F, 1, 19, 1, false);
        frameBack4.setRotationPoint(-7.5F, 7F, 6.49F);
        frameBack4.setTextureSize(128, 64);
        frameBack4.mirror = true;
        setRotation(frameBack4, 0F, 0F, -0.837758F);
        frameLeft3 = new ModelRenderer(this, 64, 27);
        frameLeft3.func_228304_a_(0F, 0F, 0F, 1, 1, 13, false);
        frameLeft3.setRotationPoint(-7.5F, 6F, -6.5F);
        frameLeft3.setTextureSize(128, 64);
        frameLeft3.mirror = true;
        setRotation(frameLeft3, 0F, 0F, 0F);
        conduit = new ModelRenderer(this, 64, 0);
        conduit.func_228304_a_(0F, 0F, 0F, 4, 25, 2, false);
        conduit.setRotationPoint(-2F, -6F, 6F);
        conduit.setTextureSize(128, 64);
        conduit.mirror = true;
        setRotation(conduit, 0F, 0F, 0F);
        plate1 = new ModelRenderer(this, 76, 0);
        plate1.func_228304_a_(0F, 0F, 0F, 10, 1, 12, false);
        plate1.setRotationPoint(-5F, -6F, -5F);
        plate1.setTextureSize(128, 64);
        plate1.mirror = true;
        setRotation(plate1, 0F, 0F, 0F);
        rivet10 = new ModelRenderer(this, 0, 0);
        rivet10.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet10.setRotationPoint(3.5F, -5.5F, 3.5F);
        rivet10.setTextureSize(128, 64);
        rivet10.mirror = true;
        setRotation(rivet10, 0F, 0F, 0F);
        rivet5 = new ModelRenderer(this, 0, 0);
        rivet5.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet5.setRotationPoint(-4.5F, -5.5F, 3.5F);
        rivet5.setTextureSize(128, 64);
        rivet5.mirror = true;
        setRotation(rivet5, 0F, 0F, 0F);
        rivet1 = new ModelRenderer(this, 0, 0);
        rivet1.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet1.setRotationPoint(-4.5F, -5.5F, -4.5F);
        rivet1.setTextureSize(128, 64);
        rivet1.mirror = true;
        setRotation(rivet1, 0F, 0F, 0F);
        rivet6 = new ModelRenderer(this, 0, 0);
        rivet6.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet6.setRotationPoint(3.5F, -5.5F, -4.5F);
        rivet6.setTextureSize(128, 64);
        rivet6.mirror = true;
        setRotation(rivet6, 0F, 0F, 0F);
        rivet2 = new ModelRenderer(this, 0, 0);
        rivet2.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet2.setRotationPoint(-4.5F, -5.5F, -2.5F);
        rivet2.setTextureSize(128, 64);
        rivet2.mirror = true;
        setRotation(rivet2, 0F, 0F, 0F);
        rivet7 = new ModelRenderer(this, 0, 0);
        rivet7.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet7.setRotationPoint(3.5F, -5.5F, -2.5F);
        rivet7.setTextureSize(128, 64);
        rivet7.mirror = true;
        setRotation(rivet7, 0F, 0F, 0F);
        rivet3 = new ModelRenderer(this, 0, 0);
        rivet3.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet3.setRotationPoint(-4.5F, -5.5F, -0.5F);
        rivet3.setTextureSize(128, 64);
        rivet3.mirror = true;
        setRotation(rivet3, 0F, 0F, 0F);
        rivet8 = new ModelRenderer(this, 0, 0);
        rivet8.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet8.setRotationPoint(3.5F, -5.5F, -0.5F);
        rivet8.setTextureSize(128, 64);
        rivet8.mirror = true;
        setRotation(rivet8, 0F, 0F, 0F);
        rivet4 = new ModelRenderer(this, 0, 0);
        rivet4.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet4.setRotationPoint(-4.5F, -5.5F, 1.5F);
        rivet4.setTextureSize(128, 64);
        rivet4.mirror = true;
        setRotation(rivet4, 0F, 0F, 0F);
        rivet9 = new ModelRenderer(this, 0, 0);
        rivet9.func_228304_a_(0F, 0F, 0F, 1, 1, 1, false);
        rivet9.setRotationPoint(3.5F, -5.5F, 1.5F);
        rivet9.setTextureSize(128, 64);
        rivet9.mirror = true;
        setRotation(rivet9, 0F, 0F, 0F);
    }

    public void render(@Nonnull MatrixStack matrix, @Nonnull IRenderTypeBuffer renderer, int light, int overlayLight, float piston) {
        shaft1.rotationPointY = 6 - (piston * 12);
        plate2.rotationPointY = 21 - (piston * 12);
        plate3.rotationPointY = 22 - (piston * 12);
        func_225598_a_(matrix, renderer.getBuffer(RENDER_TYPE), light, overlayLight, 1, 1, 1, 1);
    }

    @Override
    public void func_225598_a_(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue, float alpha) {
        plate3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        baseBack.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        motor.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        port.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pole4.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        shaft2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        shaft1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        arm3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        plate2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        arm2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        arm1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        top.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameBack5.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pole3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameRight5.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        baseRight.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        baseFront.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        baseLeft.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameRight3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pole1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameRight4.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameRight1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameRight2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameLeft5.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameLeft4.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameBack3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameLeft2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameLeft1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        pole2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameBack1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameBack2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameBack4.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frameLeft3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        conduit.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        plate1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet10.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet5.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet1.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet6.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet2.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet7.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet3.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet8.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet4.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        rivet9.func_228309_a_(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}