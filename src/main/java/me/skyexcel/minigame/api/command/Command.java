package me.skyexcel.minigame.api.command;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class Command implements CommandExecutor {

    private Inventory inv;

    public Command(){
        Bukkit.getPluginCommand("games").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull org.bukkit.command.Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player){

        }


        return false;
    }
}
