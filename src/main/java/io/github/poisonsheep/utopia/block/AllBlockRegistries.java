package io.github.poisonsheep.utopia.block;


import io.github.poisonsheep.utopia.Utopia;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllBlockRegistries {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utopia.MODID);
        public static final RegistryObject<Block> DRAGON_BLOCK = BLOCKS.register("dragon_block", () -> new DragonBlock());

        public static final RegistryObject<Block> DOMINATOR_BLOCK = BLOCKS.register("dominator_block",()->new DominatorBlock());
        public static final RegistryObject<Block> DRAGON_CHEST_BLOCK = BLOCKS.register("dragon_chest_block",()->new DragonChestBlock());

        public static final RegistryObject<Block> DRAGON_SOUND_BLOCK = BLOCKS.register("dragon_sound_block",()->new DragonSoundBlock());



}
