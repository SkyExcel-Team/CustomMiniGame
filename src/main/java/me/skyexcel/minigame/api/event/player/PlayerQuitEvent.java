package me.skyexcel.minigame.api.event.player;

public interface PlayerQuitEvent {
    public default void PlayerQuitEvent(org.bukkit.event.player.PlayerQuitEvent event){}
}
