package me.skyexcel.minigame.game;

import me.skyexcel.minigame.MiniGame;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public abstract class PlayerEvents implements RegisterEvent, me.skyexcel.minigame.event.PlayerJoinEvent, Listener {
    public PlayerEvents() {
        Bukkit.getPluginManager().registerEvents(this, MiniGame.plugin);
    }

    @EventHandler
    public void onJointest(org.bukkit.event.player.PlayerJoinEvent event) {
        PlayerJoinEvent(event);
    }
}