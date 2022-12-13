package io.github.poisonsheep.utopia.tileentity;

import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.block.AllBlockRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllTileEntityRegistries {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Utopia.MODID);

    //of的报错写完构造方法自己就没了
    public static RegistryObject<BlockEntityType<DragonChestBlockEntity>> DRAGON_CHEST_BLOCK = BLOCK_ENTITY.register("dragon_chest_block_entity",()->BlockEntityType.Builder.of(DragonChestBlockEntity::new, AllBlockRegistries.DRAGON_CHEST_BLOCK.get()).build(null));

    public static RegistryObject<BlockEntityType<DragonSoundEntity>> DRAGON_SOUND_ENTITY = BLOCK_ENTITY.register("dragon_sound_entity",()->BlockEntityType.Builder.of(DragonSoundEntity::new,AllBlockRegistries.DRAGON_SOUND_BLOCK.get()).build(null));


}
