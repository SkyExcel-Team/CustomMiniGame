package me.skyexcel.minigame.game.module.bedwars;

import me.skyexcel.minigame.MiniGame;
import me.skyexcel.minigame.api.cooltime.CoolTime;
import me.skyexcel.minigame.game.Game;
import me.skyexcel.minigame.game.module.bedwars.event.BedWarEvent;
import me.skyexcel.minigame.game.module.bedwars.team.TeamType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import skyexcel.data.Time;
import skyexcel.scoreboard.ScoreBoardAPI;

public class BedWars extends Game {
    private String name;

    private CoolTime coolTime;


    private Time time;

    private GameStatus gameStatus;


    public BedWars(String name) {
        super();
        this.name = name;
        new BedWarEvent();
        setMax(1);
        System.out.println(getNow());
        time = new Time(0, 0, 6, 0);
    }


    /**
     * This method will set the time by the gameStatus
     *
     * @param gameStatus Game status
     */
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
        time = new Time(0, 0, gameStatus.getMin(), 0);
        coolTime = new CoolTime(time);
        coolTime.runTaskTimer(MiniGame.plugin, 0, 20);
    }


    public void ScoreBoard(Player player) {

        ScoreBoardAPI api = new ScoreBoardAPI(ChatColor.YELLOW + "" + ChatColor.BOLD + "BED WARS", "dummy");

        api.newScoreBoard(DisplaySlot.SIDEBAR);

        int i = 3;

        api.newLine(ChatColor.GRAY + "04/02/02              ", 14);

        api.newLine("  ", 13);
        api.newLine("DIAMOND II in " + ChatColor.GREEN + getTime().MINUTE() + ":" + getTime().SECOND(), 12);
        api.newLine(" ", 11);

        for (TeamType type : TeamType.values()) {
            api.newLine(type.getPrefix() + " " + type.getName() + ":" + ChatColor.GREEN + " " + ChatColor.BOLD + "✓", i++);
        }

        api.newLine("", 2);

        api.newLine(ChatColor.YELLOW + "www.skyexcel.net", 1);

        player.setScoreboard(api.getBoard());
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
