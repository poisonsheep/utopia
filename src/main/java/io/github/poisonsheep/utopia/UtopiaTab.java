package io.github.poisonsheep.utopia;

import io.github.poisonsheep.utopia.item.AllItemRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class UtopiaTab extends CreativeModeTab {
    public UtopiaTab(){
        super("utopia_tab");
    }
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(AllItemRegistries.DRAGON_SWORD.get());
    }
}
