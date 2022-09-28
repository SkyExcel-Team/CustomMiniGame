package me.skyexcel.minigame.api.cooltime;

import org.bukkit.scheduler.BukkitRunnable;
import skyexcel.data.Time;

public class CoolTime extends BukkitRunnable {

    private Time time;

    public CoolTime(Time time) {
        this.time = time;
    }

    @Override
    public void run() {
        time.minSecond(1);
    }
}
