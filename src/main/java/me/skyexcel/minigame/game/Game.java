package me.skyexcel.minigame.game;

import me.skyexcel.minigame.MiniGame;
import me.skyexcel.minigame.api.cooltime.CoolTime;
import me.skyexcel.minigame.game.module.bedwars.GameStatus;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import skyexcel.data.Time;

public abstract class Game extends PlayerEvents {
    private World world;

    private GameStatus gameStatus;


    private CoolTime coolTime;

    private Time time;

    private int Max;


    public Game() {
        super();
    }

    /**
     * This method create the world when the world is null
     * @param world checking the world by whom joined
     */
    public void setWorld(String world) {
        if(world != null){
            this.world = Bukkit.getWorld(world);
        } else{
            this.world = Bukkit.createWorld(new WorldCreator(world));
        }
    }

    public World getWorld() {
        return world;
    }


    /**
     * Getting world player size
     * @return if the world is null it might return less than zero
     */
    public int getNow() {
       return (getWorld() != null ? getWorld().getPlayers().size() : -1);
    }

    public void setMax(int max) {
        Max = max;
    }

    public int getMax() {
        return Max;
    }

    public void setStatus(GameStatus status) {
        this.gameStatus = status;
        time = new Time(0,0,gameStatus.getMin(),0);
        coolTime = new CoolTime(time);
        coolTime.runTaskTimer(MiniGame.plugin,0,20);
    }


}
