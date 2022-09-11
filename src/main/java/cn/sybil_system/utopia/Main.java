package cn.sybil_system.utopia;

import net.minecraft.Util;
import net.minecraft.client.gui.screens.social.PlayerEntry;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("utopia")
@Mod.EventBusSubscriber
public class Main {
    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        Level level = player.level;
        player.sendMessage(new TextComponent("helloWorld"), Util.NIL_UUID);
    }
}
