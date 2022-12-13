package io.github.poisonsheep.utopia.entity;

import io.github.poisonsheep.utopia.Utopia;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class AllEntityRegistries {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Utopia.MODID);

    public static final RegistryObject<EntityType<LzayoiSakuyaEntity>> LZAYOI_SAKUYA_ENTITY = ENTITIES.register("lzayoi_sakuya_entity",()->EntityType.Builder.of(LzayoiSakuyaEntity::new, MobCategory.CREATURE)
            .sized(0.6f, 1.95f)
            .clientTrackingRange(8)
            .setShouldReceiveVelocityUpdates(false)
            .build("lzayoi_sakuya_entity"));
    ;


}


