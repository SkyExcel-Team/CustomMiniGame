package me.skyexcel.minigame.game.module;

import me.skyexcel.minigame.MiniGame;
import me.skyexcel.minigame.game.Game;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import skyexcel.data.file.Config;
import java.util.ArrayList;
import java.util.List;

public class BedWar extends Game {
    private String name;
    private String worldname;

    private String path;

    private Config config;

    private static List<Material> materials = new ArrayList<>();

    static {
        materials.add(Material.WHITE_BED);
        materials.add(Material.RED_BED);
        materials.add(Material.BLUE_BED);
        materials.add(Material.ORANGE_BED);
        materials.add(Material.CYAN_BED);
        materials.add(Material.BLACK_BED);
        materials.add(Material.PINK_BED);
        materials.add(Material.LIME_BED);
        materials.add(Material.GREEN_BED);
        materials.add(Material.WHITE_BED);
        materials.add(Material.LIGHT_BLUE_BED);
        materials.add(Material.LIGHT_GRAY_BED);
    }

    public BedWar(String name, String path) {
        super();
        this.name = name;
        this.path = path;
        config = new Config(path + name);
        config.setPlugin(MiniGame.plugin);
    }

    public void setWorldname(String worldname) {
        if (Bukkit.getWorld(worldname) == null) {
            System.out.println(worldname);
        }
        this.worldname = worldname;
    }

    public String getWorldname() {
        return worldname;
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
        Block block = event.getBlock();
        if(materials.contains(block.getType())){

        }
    }

    @Override
    public void BlockPlaceEvent(BlockPlaceEvent event) {
        event.getPlayer().sendMessage("PLACE : " + event.getBlock().getType().name());
    }
}
