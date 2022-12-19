package io.github.poisonsheep.utopia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Coffee extends Item {
    public Coffee() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD));
        //1.18特制
    }
}
