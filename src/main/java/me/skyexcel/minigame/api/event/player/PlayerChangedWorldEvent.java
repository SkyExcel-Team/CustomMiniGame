package me.skyexcel.minigame.api.event.player;

public interface PlayerChangedWorldEvent {
    public default void PlayerChangedWorldEvent(org.bukkit.event.player.PlayerChangedWorldEvent event){}
}
