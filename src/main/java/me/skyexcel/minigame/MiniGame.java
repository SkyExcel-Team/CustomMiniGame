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

        Bukkit.getOnlinePlayers().stream().forEach(player -> {

            ScoreBoardAPI api = new ScoreBoardAPI(ChatColor.YELLOW + "" + ChatColor.BOLD + "BED WARS", "dummy");

            api.newScoreBoard(DisplaySlot.SIDEBAR);

            int i = 3;

            api.newLine(ChatColor.GRAY + "04/02/02              ", 14);

            api.newLine("  ", 13);
            api.newLine("DIAMOND II in " + ChatColor.GREEN + "3:41", 12);
            api.newLine(" ", 11);

            for (TeamType type : TeamType.values()) {
                api.newLine(type.getPrefix() + " " + type.getName() + ":" + ChatColor.GREEN + " " + ChatColor.BOLD + "✓", i++);
            }


            api.newLine("", 2);

            api.newLine(ChatColor.YELLOW + "www.skyexcel.net", 1);

            player.setScoreboard(api.getBoard());
        });
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
