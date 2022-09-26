package me.skyexcel.minigame.game.module;

import me.skyexcel.minigame.game.Game;
import org.bukkit.event.player.PlayerJoinEvent;
public class BedWar extends Game {
    private String name;

    public BedWar(String name) {
        super();
        this.name = name;
    }
    @Override
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(name);
    }
}
