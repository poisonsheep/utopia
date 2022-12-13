package io.github.poisonsheep.utopia.client.render;

import io.github.poisonsheep.utopia.client.model.ModelLzayoiSakuya;
import io.github.poisonsheep.utopia.entity.LzayoiSakuyaEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderLzayoiSakuya extends MobRenderer<LzayoiSakuyaEntity, ModelLzayoiSakuya<LzayoiSakuyaEntity>> {
    public RenderLzayoiSakuya(EntityRendererProvider.Context p_174304_, ModelLzayoiSakuya<LzayoiSakuyaEntity> p_174305_, float p_174306_) {
        super(p_174304_, p_174305_, p_174306_);
    }

    @Override
    public ResourceLocation getTextureLocation(LzayoiSakuyaEntity p_114482_) {
        return null;
    }
}
