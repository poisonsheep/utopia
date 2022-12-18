package io.github.poisonsheep.utopia.item;

import io.github.poisonsheep.utopia.ModTab;
import io.github.poisonsheep.utopia.client.render.RenderDominator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.network.PacketDistributor;
import software.bernie.example.registry.SoundRegistry;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.network.GeckoLibNetwork;
import software.bernie.geckolib3.network.ISyncable;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.function.Consumer;


public class Dominator extends Item implements IAnimatable, ISyncable {

    private static final String CONTROLLER_NAME = "controller";
    private static final int ANIM_OPEN = 0;

    public AnimationFactory factory = GeckoLibUtil.createFactory(this);
    public Dominator() {

        super(new Properties().tab(ModTab.TAB_UTOPIA));
        GeckoLibNetwork.registerSyncable(this);
    }

    //下面这一坨我还不知道是干嘛的
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


    private <E extends Item & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        //这里不加动画
        return PlayState.CONTINUE;

    }

    @Override
    public void registerControllers(AnimationData data) {

        AnimationController controller = new AnimationController(this,CONTROLLER_NAME, 20, this::predicate);
        controller.registerSoundListener(this::soundListener);
        data.addAnimationController(controller);

    }
    private <ENTITY extends Item & IAnimatable> void soundListener(SoundKeyframeEvent<ENTITY> event) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) {
            player.playSound(SoundRegistry.JACK_MUSIC.get(), 1, 1);
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {

            final ItemStack stack = player.getItemInHand(hand);
            final int id = GeckoLibUtil.guaranteeIDForStack(stack, (ServerLevel) world);
            final PacketDistributor.PacketTarget target = PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() ->player);
            GeckoLibNetwork.syncAnimation(target, this, id, ANIM_OPEN);
        }
        return super.use(world, player, hand);
    }
    @Override
    public  void onAnimationSync(int id,int state){
        if(state == ANIM_OPEN){
            final AnimationController controller = GeckoLibUtil.getControllerForID(this.factory, id, CONTROLLER_NAME);

            if (controller.getAnimationState() == AnimationState.Stopped) {
                controller.markNeedsReload();
                controller.setAnimation(new AnimationBuilder().addAnimation("TRIGGER3", ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
            }
        }
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
