package io.github.poisonsheep.utopia.item;

import io.github.poisonsheep.utopia.ModTab;
import io.github.poisonsheep.utopia.Utopia;
import io.github.poisonsheep.utopia.block.AllBlockRegistries;
import io.github.poisonsheep.utopia.entity.AllEntityRegistries;
import io.github.poisonsheep.utopia.entity.LzayoiSakuyaEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class AllItemRegistries {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utopia.MODID);
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",()->new Coffee());
    public static final RegistryObject<Item> DRAGON_FOOD = ITEMS.register("dragon_food",()->new DragonFood());
    public static final RegistryObject<Item> DRAGON_SWORD = ITEMS.register("dragon_sword",()->new DragonSword());

    public static final RegistryObject<Item> DRAGON_BLOCK = ITEMS.register("dragon_block",()-> new BlockItem(AllBlockRegistries.DRAGON_BLOCK.get(),new Item.Properties().tab(ModTab.TAB_UTOPIA)));

    public static final RegistryObject<Item> DOMINATOR_BLOCK = ITEMS.register("dominator_block",()-> new BlockItem(AllBlockRegistries.DOMINATOR_BLOCK.get(),new Item.Properties().tab(ModTab.TAB_UTOPIA)));

    public static final RegistryObject<Item> DRAGON_CHEST_BLOCK = ITEMS.register("dragon_chest_block",()->new BlockItem(AllBlockRegistries.DRAGON_CHEST_BLOCK.get(),new Item.Properties().tab(ModTab.TAB_UTOPIA)));

    public static final RegistryObject<Item> DOMINATOR = ITEMS.register("dominator",()->new Dominator());

    public static final RegistryObject<Item> LZAYOI_SAKUYA_EGG = ITEMS.register("lzayoi_sakuya_egg",()->new ForgeSpawnEggItem(AllEntityRegistries.LZAYOI_SAKUYA_ENTITY,9093009, 4390912, new Item.Properties().tab(ModTab.TAB_UTOPIA)));

    public static final RegistryObject<Item> ARBITER_SWORD = ITEMS.register("arbiter_sword",()->new ArbiterSword());
}
