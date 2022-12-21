package io.github.poisonsheep.utopia.item;

import java.util.function.Consumer;

import io.github.poisonsheep.utopia.ModTab;
import io.github.poisonsheep.utopia.client.render.RenderDominator;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.network.PacketDistributor;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType.EDefaultLoopTypes;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.network.GeckoLibNetwork;
import software.bernie.geckolib3.network.ISyncable;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class Dominator extends Item implements IAnimatable, ISyncable {

    public AnimationFactory factory = GeckoLibUtil.createFactory(this);
    public String ULOCKED_CONTROLLER = "ulocked";
    public String LOCKED_CONTROLLER = "locked";
    public static final int LOCKED = 0;
    public static final int ULOCKED = 1;

    public Dominator() {
        super(new Item.Properties().tab(ModTab.TAB_UTOPIA).stacksTo(1).durability(201));
        GeckoLibNetwork.registerSyncable(this);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {
            private final BlockEntityWithoutLevelRenderer renderer = new RenderDominator();

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                return renderer;
            }
        });
    }



    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }


    public <P extends Item & IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, ULOCKED_CONTROLLER, 1, this::predicate));
        data.addAnimationController(new AnimationController(this, LOCKED_CONTROLLER, 1, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void onAnimationSync(int id, int state) {
        final AnimationController<?> controller1 = GeckoLibUtil.getControllerForID(this.factory, id, ULOCKED_CONTROLLER);
        final AnimationController<?> controller2 = GeckoLibUtil.getControllerForID(this.factory, id, LOCKED_CONTROLLER);
        if (state == ULOCKED){
            controller1.markNeedsReload();
            controller1.setAnimation(new AnimationBuilder().addAnimation("TRIGGER1", EDefaultLoopTypes.PLAY_ONCE));
        }

        if(state == LOCKED){
            controller2.markNeedsReload();
            controller2.setAnimation(new AnimationBuilder().addAnimation("TRIGGER3", EDefaultLoopTypes.PLAY_ONCE));
        }
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        final ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            final int id = GeckoLibUtil.guaranteeIDForStack(stack, (ServerLevel) world);
            final PacketDistributor.PacketTarget target = PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> player);
            GeckoLibNetwork.syncAnimation(target, this, id, ULOCKED);
        }

        return InteractionResultHolder.consume(itemstack);
    }

    @Override
    public void releaseUsing(ItemStack stack, Level world, LivingEntity entity, int timeleft) {
        Player player = (Player) entity;
        if (!world.isClientSide) {
            final int id = GeckoLibUtil.guaranteeIDForStack(stack, (ServerLevel) world);
            final PacketDistributor.PacketTarget target = PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> player);
            GeckoLibNetwork.syncAnimation(target, this, id, LOCKED);
        }
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return false;
    }

    //alex生物给的办法，还没弄懂，
    @Override
    public int getUseDuration(ItemStack stack) {
        return Integer.MAX_VALUE;
    }


}
