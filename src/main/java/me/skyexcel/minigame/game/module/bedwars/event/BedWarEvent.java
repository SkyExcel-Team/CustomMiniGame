package me.skyexcel.minigame.game.module.bedwars.event;

import me.skyexcel.minigame.game.PlayerEvents;
import me.skyexcel.minigame.game.module.bedwars.team.TeamType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;

public class BedWarEvent extends PlayerEvents {
    private static List<Material> materials = new ArrayList<>();

    private String Break = "BED DESTRUCTION";

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

    @Override
    public void InventoryClickEvent(InventoryClickEvent event) {
        super.InventoryClickEvent(event);
    }

    @Override
    public void BlockBreakEvent(BlockBreakEvent event) {
        super.BlockBreakEvent(event);
    }


    private TeamType team;

    @Override
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        team = TeamType.RED;


        Log(Break, player.getDisplayName());

    }

    public void Log(String cause, String message) {
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage(ChatColor.WHITE + "" + ChatColor.BOLD + cause + " > " + ChatColor.RESET + message);
        Bukkit.broadcastMessage("");
    }
}
