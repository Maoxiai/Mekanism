package mekanism.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import mekanism.client.model.ModelArmoredJetpack;
import mekanism.client.model.ModelFreeRunners;
import mekanism.client.model.ModelGasMask;
import mekanism.client.model.ModelJetpack;
import mekanism.client.model.ModelScubaTank;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;

public class ModelCustomArmor extends BipedModel<LivingEntity> {

    public static ModelCustomArmor INSTANCE = new ModelCustomArmor();

    public static GlowArmor GLOW_BIG = new GlowArmor(1.0F);
    public static GlowArmor GLOW_SMALL = new GlowArmor(0.5F);

    public ArmorModel modelType;

    public ModelCustomArmor() {
        //TODO: 1.15 check if this is the correct size
        super(0.5F);
        //TODO: 1.15
        /*resetPart(bipedHead, 0, 0, 0);
        resetPart(bipedBody, 0, 0, 0);
        resetPart(bipedRightArm, 5, 2, 0);
        resetPart(bipedLeftArm, -5, 2, 0);
        resetPart(bipedRightLeg, 0, 0, 0);
        resetPart(bipedLeftLeg, 0, 0, 0);

        bipedHeadwear.cubeList.clear();*/
    }

    public static boolean useModel(ArmorModel type, ModelRenderer partRender, ModelCustomArmor biped) {
        if (type.armorSlot == 0) {
            return partRender == biped.bipedHead;
        } else if (type.armorSlot == 1) {
            return partRender == biped.bipedBody;
        } else if (type.armorSlot == 3) {
            return partRender == biped.bipedLeftLeg || partRender == biped.bipedRightLeg;
        }
        return false;
    }

    public static BipedModel<LivingEntity> getGlow(EquipmentSlotType index) {
        BipedModel<LivingEntity> biped = index != EquipmentSlotType.LEGS ? GLOW_BIG : GLOW_SMALL;
        biped.bipedHead.showModel = index == EquipmentSlotType.HEAD;
        biped.bipedHeadwear.showModel = index == EquipmentSlotType.HEAD;
        biped.bipedBody.showModel = index == EquipmentSlotType.CHEST || index == EquipmentSlotType.LEGS;
        biped.bipedRightArm.showModel = index == EquipmentSlotType.CHEST;
        biped.bipedLeftArm.showModel = index == EquipmentSlotType.CHEST;
        biped.bipedRightLeg.showModel = index == EquipmentSlotType.LEGS || index == EquipmentSlotType.FEET;
        biped.bipedLeftLeg.showModel = index == EquipmentSlotType.LEGS || index == EquipmentSlotType.FEET;
        return biped;
    }

    public void init(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float size) {
        reset();

        //TODO: 1.15
        //isSneak = entity.func_225608_bj_();
        isSitting = entity.isPassenger();
        isChild = entity.isChild();

        if (modelType.armorSlot == 0) {
            bipedHead.showModel = true;
        } else if (modelType.armorSlot == 1) {
            bipedBody.showModel = true;
        } else if (modelType.armorSlot == 3) {
            bipedLeftLeg.showModel = true;
            bipedRightLeg.showModel = true;
        }

        func_225597_a_(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    public void reset() {
        bipedHead.showModel = false;
        bipedBody.showModel = false;
        bipedRightArm.showModel = false;
        bipedLeftArm.showModel = false;
        bipedRightLeg.showModel = false;
        bipedLeftLeg.showModel = false;
    }

    //TODO: 1.15
    /*public void resetPart(ModelRenderer renderer, float x, float y, float z) {
        renderer.cubeList.clear();
        ModelCustom model = new ModelCustom(this, renderer);
        renderer.addChild(model);
        setOffset(renderer, x, y, z);
    }

    public void setOffset(ModelRenderer renderer, float x, float y, float z) {
        renderer.offsetX = x;
        renderer.offsetY = y;
        renderer.offsetZ = z;
    }

    @Override
    public void render(@Nonnull LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        init(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    }*/

    public enum ArmorModel {
        JETPACK(1, MekanismUtils.getResource(ResourceType.RENDER, "jetpack.png")),
        ARMOREDJETPACK(1, MekanismUtils.getResource(ResourceType.RENDER, "jetpack.png")),
        SCUBATANK(1, MekanismUtils.getResource(ResourceType.RENDER, "scuba_set.png")),
        GASMASK(0, MekanismUtils.getResource(ResourceType.RENDER, "scuba_set.png")),
        FREERUNNERS(3, MekanismUtils.getResource(ResourceType.RENDER, "free_runners.png"));

        public static ModelJetpack jetpackModel = new ModelJetpack();
        public static ModelArmoredJetpack armoredJetpackModel = new ModelArmoredJetpack();
        public static ModelGasMask gasMaskModel = new ModelGasMask();
        public static ModelScubaTank scubaTankModel = new ModelScubaTank();
        public static ModelFreeRunners freeRunnersModel = new ModelFreeRunners();
        public int armorSlot;
        public ResourceLocation resource;

        ArmorModel(int i, ResourceLocation r) {
            armorSlot = i;
            resource = r;
        }
    }

    public static class GlowArmor extends BipedModel<LivingEntity> {

        public GlowArmor(float size) {
            super(size);
        }

        //TODO: 1.15
        /*@Override
        public void render(@Nonnull LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
            //TODO: 1.15
            //isSneak = entity.func_225608_bj_();
            isSitting = entity.isPassenger();
            isChild = entity.isChild();

            func_225597_a_(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            GlowInfo glowInfo = MekanismRenderer.enableGlow();
            super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            MekanismRenderer.disableGlow(glowInfo);
        }*/
    }

    public class ModelCustom extends ModelRenderer {

        public ModelCustomArmor biped;
        public ModelRenderer partRender;

        public ModelCustom(ModelCustomArmor base, ModelRenderer renderer) {
            super(base);
            biped = base;
            partRender = renderer;
        }

        @Override
        public void func_228309_a_(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue,
              float alpha) {
            if (ModelCustomArmor.this.modelType != null) {
                matrix.func_227860_a_();
                matrix.func_227861_a_(0, 0, 0.06);
                Minecraft.getInstance().textureManager.bindTexture(modelType.resource);
                if (useModel(biped.modelType, partRender, biped)) {
                    if (biped.modelType == ArmorModel.JETPACK) {
                        //TODO: 1.15
                        //ArmorModel.jetpackModel.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
                    } else if (biped.modelType == ArmorModel.ARMOREDJETPACK) {
                        //TODO: 1.15
                        //ArmorModel.armoredJetpackModel.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
                    } else if (biped.modelType == ArmorModel.SCUBATANK) {
                        //TODO: 1.15
                        //ArmorModel.scubaTankModel.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
                    } else if (biped.modelType == ArmorModel.GASMASK) {
                        matrix.func_227861_a_(0, 0, -0.05);
                        //TODO: 1.15
                        //ArmorModel.gasMaskModel.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
                    } else if (biped.modelType == ArmorModel.FREERUNNERS) {
                        matrix.func_227862_a_(1.02F, 1.02F, 1.02F);
                        if (partRender == biped.bipedLeftLeg) {
                            matrix.func_227861_a_(-0.1375, -0.75, -0.0625);
                            ArmorModel.freeRunnersModel.renderLeft(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
                        } else if (partRender == biped.bipedRightLeg) {
                            matrix.func_227861_a_(0.1375, -0.75, -0.0625);
                            ArmorModel.freeRunnersModel.renderRight(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
                        }
                    }
                }
                matrix.func_227865_b_();
            }
        }
    }
}