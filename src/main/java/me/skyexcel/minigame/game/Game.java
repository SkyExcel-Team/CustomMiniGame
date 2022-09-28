package me.skyexcel.minigame.game;

import me.skyexcel.minigame.game.status.GameStatus;
import me.skyexcel.minigame.game.team.TeamType;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;

public abstract class Game extends PlayerEvents {
    private World world;

    private GameStatus status;

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
    public void setTeam(TeamType team){

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
        this.status = status;
    }

    public GameStatus getStatus() {
        return status;
    }
}
