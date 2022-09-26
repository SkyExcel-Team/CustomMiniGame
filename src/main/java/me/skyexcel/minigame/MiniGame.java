package me.skyexcel.minigame;

import me.skyexcel.minigame.game.module.BedWar;
import me.skyexcel.minigame.game.module.SkyWar;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import skyexcel.data.file.Config;

public class MiniGame extends JavaPlugin implements Listener {

    public static MiniGame plugin;

    public static Config config;

    @Override
    public void onEnable() {

        plugin = this;

        new BedWar("BedWar");



        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
