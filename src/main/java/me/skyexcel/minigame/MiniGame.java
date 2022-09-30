package me.skyexcel.minigame;

import me.skyexcel.minigame.game.module.bedwars.BedWars;
import me.skyexcel.minigame.game.module.bedwars.team.TeamType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import skyexcel.scoreboard.ScoreBoardAPI;

public class MiniGame extends JavaPlugin implements Listener {

    public static MiniGame plugin;
    public static BedWars bedWar;

    @Override
    public void onEnable() {
        plugin = this;

        bedWar = new BedWars("BedWar");

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
