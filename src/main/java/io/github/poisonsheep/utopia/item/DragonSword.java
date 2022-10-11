package io.github.poisonsheep.utopia.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;



public class DragonSword extends SwordItem {
    private static Tier tier = new Tier(){
        @Override
        public int getUses() {
            return 2000;
        }

        @Override
        public float getSpeed() {
            return 1;
        }

        @Override
        public float getAttackDamageBonus() {
            return 1;
        }

        @Override
        public int getLevel() {
            return 3;
        }

        @Override
        public int getEnchantmentValue() {
            return 30;
        }

        @Override
        public Ingredient getRepairIngredient() {
            ItemStack itemStack = new ItemStack(AllItemRegistries.DRAGON_FOOD.get());
            return  Ingredient.of(itemStack);
        }
    };

    public DragonSword() {
        super(tier,3,-2.4F,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
