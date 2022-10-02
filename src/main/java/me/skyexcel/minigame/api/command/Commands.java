package me.skyexcel.minigame.api.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Commands implements CommandExecutor, functions {

    private String label;

    public Commands(String label) {
        this.label = label;
        Objects.requireNonNull(Bukkit.getPluginCommand(label)).setExecutor(this);

    }

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        run(sender, args);
        return false;
    }

    public String getLabel() {
        return label;
    }
}
