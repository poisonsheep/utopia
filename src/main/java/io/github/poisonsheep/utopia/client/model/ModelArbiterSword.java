package io.github.poisonsheep.utopia.client.model;

import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.item.ArbiterSword;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelArbiterSword extends AnimatedGeoModel<ArbiterSword> {
    @Override
    public ResourceLocation getModelLocation(ArbiterSword object) {
        return new ResourceLocation(Utopia.MODID,"geo/arbiter_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ArbiterSword object) {
        return new ResourceLocation(Utopia.MODID,"textures/item/arbiter_sword.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ArbiterSword animatable) {
        return null;
    }
}
