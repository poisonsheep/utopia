package io.github.poisonsheep.utopia.item;


import io.github.poisonsheep.utopia.ModTab;
import io.github.poisonsheep.utopia.UtopiaTab;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class DragonFood extends Item {
    private static MobEffectInstance mobEffectInstance = new MobEffectInstance(MobEffects.POISON,600,0);
    private static FoodProperties foodProperties = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.8F).effect(mobEffectInstance,0.6F).build();

    public DragonFood() {
        super(new Properties().food(foodProperties).tab(ModTab.TAB_UTOPIA));
    }
}
