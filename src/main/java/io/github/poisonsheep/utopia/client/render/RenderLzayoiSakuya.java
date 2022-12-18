package io.github.poisonsheep.utopia.client.render;

import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.client.model.ModelLzayoiSakuya;
import io.github.poisonsheep.utopia.entity.LzayoiSakuyaEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderLzayoiSakuya extends MobRenderer<LzayoiSakuyaEntity, ModelLzayoiSakuya<LzayoiSakuyaEntity>> {

    public static ResourceLocation TEXTURE = new ResourceLocation(Utopia.MODID,"textures/entity/lzayoisakuya.png");

    public RenderLzayoiSakuya(EntityRendererProvider.Context context) {
        super(context, new ModelLzayoiSakuya(context.bakeLayer(ModelLzayoiSakuya.LZAYOISAKUYA_LAYER)),1F);
    }

    @Override
    public ResourceLocation getTextureLocation(LzayoiSakuyaEntity entity) {
        return TEXTURE;
    }
}
