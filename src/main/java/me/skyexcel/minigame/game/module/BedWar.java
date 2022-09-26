package me.skyexcel.minigame.game.module;

import me.skyexcel.minigame.game.Game;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class BedWar extends Game {
    private String name;

    public BedWar(String name) {
        super();
        this.name = name;
    }

    @Override
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        super.PlayerJoinEvent(event);
        event.getPlayer().sendMessage("test");

    }

    @Override
    public void PlayerQuitEvent(PlayerQuitEvent event) {
        super.PlayerQuitEvent(event);
    }

    @Override
    public void PlayerBedEnterEvent(PlayerBedEnterEvent event) {
        super.PlayerBedEnterEvent(event);
        event.getPlayer().sendMessage("test");
    }

}
