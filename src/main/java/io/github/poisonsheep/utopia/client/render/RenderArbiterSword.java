package io.github.poisonsheep.utopia.client.render;

import io.github.poisonsheep.utopia.client.model.ModelArbiterSword;
import io.github.poisonsheep.utopia.item.ArbiterSword;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class RenderArbiterSword extends GeoItemRenderer<ArbiterSword> {

    public RenderArbiterSword() {
        super(new ModelArbiterSword());
    }
}
