package me.skyexcel.minigame.game.module.BedWar;

import me.skyexcel.minigame.game.Game;
import me.skyexcel.minigame.game.module.BedWar.event.BedWarEvent;

public class BedWar extends Game {
    private String name;

    public BedWar(String name) {
        super();
        this.name = name;
        new BedWarEvent();
    }

    public String getName() {
        return name;
    }
}
