package io.github.poisonsheep.utopia.client.init;


import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.client.model.ModelLzayoiSakuya;
import io.github.poisonsheep.utopia.client.render.RenderLzayoiSakuya;
import io.github.poisonsheep.utopia.entity.AllEntityRegistries;
import io.github.poisonsheep.utopia.entity.LzayoiSakuyaEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = Utopia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitEntityRender {

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event){
        event.put(AllEntityRegistries.LZAYOI_SAKUYA_ENTITY.get(), LzayoiSakuyaEntity.prepareAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLzayoiSakuya.LZAYOISAKUYA_LAYER, ModelLzayoiSakuya::createBodyLayer);
    }

    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(AllEntityRegistries.LZAYOI_SAKUYA_ENTITY.get(), RenderLzayoiSakuya::new);
    }
}
