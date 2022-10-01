package me.skyexcel.minigame.game.module.fish;

import me.skyexcel.minigame.game.Game;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerFishEvent;

public class FishingEvent extends Game {

    @Override
    public void PlayerFishEvent(PlayerFishEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getCaught();
        if (entity instanceof Player) {
            player.sendMessage("test");
        }
    }
}
