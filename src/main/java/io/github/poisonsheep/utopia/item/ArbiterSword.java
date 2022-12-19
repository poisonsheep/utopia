package io.github.poisonsheep.utopia.item;

import io.github.poisonsheep.utopia.ModTab;
import io.github.poisonsheep.utopia.client.render.RenderArbiterSword;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemRenderProperties;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.function.Consumer;

public class ArbiterSword extends SwordItem implements IAnimatable {
   private static final Tier tier = new Tier(){

       @Override
       public int getUses() {
           return 2000;
       }

       @Override
       public float getSpeed() {
           return 0;
       }

       @Override
       public float getAttackDamageBonus() {
           return 0;
       }

       @Override
       public int getLevel() {
           return 0;
       }

       @Override
       public int getEnchantmentValue() {
           return 0;
       }

       @Override
       public Ingredient getRepairIngredient() {
           return null;
       }

       @Nullable
       @Override
       public TagKey<Block> getTag() {
           return Tier.super.getTag();
       }
   };

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {
            private final BlockEntityWithoutLevelRenderer renderer = new RenderArbiterSword();

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                return renderer;
            }
        });
    }

    public ArbiterSword() {
        super(tier,14,-2.4F,new Item.Properties().tab(ModTab.TAB_UTOPIA));
    }

    @Override
    public void registerControllers(AnimationData data) {

    }
    public AnimationFactory factory = GeckoLibUtil.createFactory(this);
    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
