package me.skyexcel.minigame.api.event.player;

public interface PlayerCommandPreprocessEvent {
    public default void PlayerCommandPreprocessEvent(org.bukkit.event.player.PlayerCommandPreprocessEvent event){}
}
