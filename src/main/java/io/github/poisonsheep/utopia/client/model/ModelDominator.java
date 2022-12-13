package io.github.poisonsheep.utopia.client.model;

import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.item.Dominator;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelDominator extends AnimatedGeoModel<Dominator> {
    @Override
    public ResourceLocation getModelLocation(Dominator object) {
        return new ResourceLocation(Utopia.MODID,"geo/dominator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Dominator object) {
        return new ResourceLocation(Utopia.MODID,"textures/item/dominator.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Dominator animatable) {
        return new ResourceLocation(Utopia.MODID,"animations/dominator.animation.json");
    }
}
