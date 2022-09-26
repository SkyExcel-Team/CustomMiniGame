package me.skyexcel.minigame.game;

import me.skyexcel.minigame.tick.Tick;
import org.bukkit.scheduler.BukkitRunnable;
import skyexcel.data.Time;

public abstract class CoolTime extends BukkitRunnable implements Tick {

    private long cooltime;

    private long maxTime;

    private Time time;

    private Direction direction;

    public CoolTime(long cooltime) {
        this.cooltime = cooltime;
        time = new Time(cooltime);
    }

    @Override
    public void run() {

    }

    public Time getTime() {
        return time;
    }


    public enum Direction {
        Increase, Decrease
    }
}
