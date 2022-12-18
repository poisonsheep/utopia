package io.github.poisonsheep.utopia.client.init;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.settings.KeyConflictContext;

public class InitKeyBindings {

    public static final String KEY_CATEGORIES_UTOPIA = "key.categories.utopia";
    public static final String KEY_TRANSFORMATION = "key.transformation";
    public static KeyMapping transformation;

    public static void init() {
        transformation = new KeyMapping(KEY_TRANSFORMATION, KeyConflictContext.IN_GAME, InputConstants.getKey("key.keyboard.period"), KEY_CATEGORIES_UTOPIA);

        ClientRegistry.registerKeyBinding(transformation);
    }

}
