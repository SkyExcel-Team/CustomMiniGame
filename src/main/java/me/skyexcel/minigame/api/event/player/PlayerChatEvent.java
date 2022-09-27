package me.skyexcel.minigame.api.event.player;

public interface PlayerChatEvent {
    public default void PlayerChatEvent(org.bukkit.event.player.PlayerChatEvent event){}
}
