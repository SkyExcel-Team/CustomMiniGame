package me.skyexcel.minigame.api.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GUI {
    private String name;

    private int slot;

    public GUI(String name) {
        this.name = name;
    }


    public void openGUI(Player player) {

        Inventory inv = Bukkit.createInventory(null, slot, name);

        player.openInventory(inv);
    }


}
