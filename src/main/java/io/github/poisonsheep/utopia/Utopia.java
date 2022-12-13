package io.github.poisonsheep.utopia;

import io.github.poisonsheep.utopia.block.AllBlockRegistries;

import io.github.poisonsheep.utopia.item.AllItemRegistries;
import io.github.poisonsheep.utopia.tileentity.AllTileEntityRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod(Utopia.MODID)
public class Utopia {
    public static final IEventBus modBusEvent = FMLJavaModLoadingContext.get().getModEventBus();
    public final static String MODID = "utopia";
    public Utopia(){
        GeckoLib.initialize();
        AllBlockRegistries.BLOCKS.register(modBusEvent);
        AllItemRegistries.ITEMS.register(modBusEvent);
        AllTileEntityRegistries.BLOCK_ENTITY_TYPE_DEFERRED_REGISTER.register(modBusEvent);


     }
}
