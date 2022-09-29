package me.skyexcel.minigame.game.module.bedwars;

import me.skyexcel.minigame.MiniGame;
import me.skyexcel.minigame.api.cooltime.CoolTime;
import me.skyexcel.minigame.game.Game;
import me.skyexcel.minigame.game.module.bedwars.event.BedWarEvent;
import skyexcel.data.Time;

public class BedWars extends Game {
    private String name;

    private CoolTime coolTime;

    private Time time;

    private GameStatus gameStatus;


    public BedWars(String name) {
        super();
        this.name = name;
        new BedWarEvent();

    }


    /**
     * This method will set the time by the gameStatus
     * @param gameStatus Game status
     */
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
        time = new Time(0,0,gameStatus.getMin(),0);
        coolTime = new CoolTime(time);
        coolTime.runTaskTimer(MiniGame.plugin,0,20);
    }

    public String getName() {
        return name;
    }

    public Time getTime() {
        return time;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
