package me.skyexcel.minigame.api.event.player;

public interface PlayerCommandSendEvent {
    public default void PlayerCommandSendEvent(org.bukkit.event.player.PlayerCommandSendEvent event){}
}
