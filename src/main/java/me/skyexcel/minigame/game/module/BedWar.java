package me.skyexcel.minigame.game.module;

import me.skyexcel.minigame.game.Game;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
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
    public void AsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        super.AsyncPlayerChatEvent(event);

        event.setCancelled(true);
        event.getPlayer().sendMessage(event.getMessage());
    }

    @Override
    public void PlayerBedEnterEvent(PlayerBedEnterEvent event) {
        super.PlayerBedEnterEvent(event);
        event.getPlayer().sendMessage("Test");
    }

    @Override
    public void BlockBreakEvent(BlockBreakEvent event) {
        super.BlockBreakEvent(event);
        event.getPlayer().sendMessage("BREAK : " + event.getBlock().getType().name());
    }

    @Override
    public void BlockPlaceEvent(BlockPlaceEvent event) {
        event.getPlayer().sendMessage("PLACE : " + event.getBlock().getType().name());
    }
}
