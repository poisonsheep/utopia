package io.github.poisonsheep.utopia.client.render;

import io.github.poisonsheep.utopia.client.model.ModelDominator;
import io.github.poisonsheep.utopia.item.Dominator;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class RenderDominator extends GeoItemRenderer<Dominator> {


    public RenderDominator() {
        super(new ModelDominator());
    }
}
