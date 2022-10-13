package io.github.poisonsheep.utopia.item;

import io.github.poisonsheep.utopia.ModTab;
import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.block.AllBlockRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllItemRegistries {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utopia.MODID);
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",()->new Coffee());
    public static final RegistryObject<Item> DRAGON_FOOD = ITEMS.register("dragon_food",()->new DragonFood());
    public static final RegistryObject<Item> DRAGON_SWORD = ITEMS.register("dragon_sword",()->new DragonSword());

    public static final RegistryObject<Item> DRAGON_BLOCK = ITEMS.register("dragon_block",()-> new BlockItem(AllBlockRegistries.DRAGON_BLOCK.get(),new Item.Properties().tab(ModTab.TAB_UTOPIA)));

    public static final RegistryObject<Item> DOMINATOR_BLOCK = ITEMS.register("dominator_block",()-> new BlockItem(AllBlockRegistries.DOMINATOR_BLOCK.get(),new Item.Properties().tab(ModTab.TAB_UTOPIA)));

}
