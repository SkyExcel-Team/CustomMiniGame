package me.skyexcel.minigame.game.module.bedwars.team;

import org.bukkit.ChatColor;

public enum TeamType {
    RED(ChatColor.RED + "R" + ChatColor.RESET, "Red"),
    BLUE(ChatColor.BLUE + "B" + ChatColor.RESET, "Blue"),
    YELLOW(ChatColor.YELLOW + "Y" + ChatColor.RESET, "Yellow"),
    GREEN(ChatColor.GREEN + "G" + ChatColor.RESET, "Green"),
    AQUA(ChatColor.AQUA + "A" + ChatColor.RESET, "Aqua"),
    PINK(ChatColor.LIGHT_PURPLE + "P" + ChatColor.RESET, "Pink"),
    GRAY(ChatColor.GRAY + "S" + ChatColor.RESET, "Gray"),
    WHITE(ChatColor.WHITE + "W" + ChatColor.RESET, "White");
    private String prefix;

    private String name;

    TeamType(String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getName() {
        return name;
    }
}
