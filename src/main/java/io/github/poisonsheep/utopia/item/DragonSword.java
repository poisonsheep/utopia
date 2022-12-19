package io.github.poisonsheep.utopia.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;



public class DragonSword extends SwordItem {
    private static final Tier tier = new Tier(){
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
            return 10;
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
        //前面那个参数是攻击伤害，后面是攻击速度
        super(tier,10,-2.4F,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
