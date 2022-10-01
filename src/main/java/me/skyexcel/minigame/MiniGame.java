package me.skyexcel.minigame;

import me.skyexcel.minigame.game.module.bedwars.BedWars;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


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
