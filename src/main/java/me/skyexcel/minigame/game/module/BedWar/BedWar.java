package me.skyexcel.minigame.game.module.BedWar;

import me.skyexcel.minigame.api.cooltime.CoolTime;
import me.skyexcel.minigame.game.Game;
import me.skyexcel.minigame.game.module.BedWar.event.BedWarEvent;
import skyexcel.data.Time;

public class BedWar extends Game {
    private String name;

    private CoolTime coolTime;

    private Time time;


    public BedWar(String name) {
        super();
        this.name = name;
        new BedWarEvent();

        coolTime = new CoolTime(time);
    }

    public String getName() {
        return name;
    }
}
