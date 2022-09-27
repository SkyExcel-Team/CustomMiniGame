package me.skyexcel.minigame;

import me.skyexcel.minigame.game.module.BedWar;
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

        BedWar bedWar = new BedWar("BedWar", "game/");
        bedWar.setWorldname("BedWar");


        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
