package io.github.poisonsheep.utopia;

import io.github.poisonsheep.utopia.block.AllBlockRegistries;

import io.github.poisonsheep.utopia.client.init.InitKeyBindings;
import io.github.poisonsheep.utopia.entity.AllEntityRegistries;
import io.github.poisonsheep.utopia.item.AllItemRegistries;
import io.github.poisonsheep.utopia.tileentity.AllTileEntityRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod(Utopia.MODID)
public class Utopia {
    public static final IEventBus modBusEvent = FMLJavaModLoadingContext.get().getModEventBus();
    public final static String MODID = "utopia";
    public Utopia(){

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
        GeckoLib.initialize();

        AllBlockRegistries.BLOCKS.register(modBusEvent);

        AllItemRegistries.ITEMS.register(modBusEvent);

        AllTileEntityRegistries.BLOCK_ENTITY.register(modBusEvent);

        AllEntityRegistries.ENTITIES.register(modBusEvent);


     }
    public void setupClient(FMLClientSetupEvent event) {
        InitKeyBindings.init();
    }
}
