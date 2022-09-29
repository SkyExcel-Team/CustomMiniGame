package me.skyexcel.minigame.game.module.bedwars;

public enum GameStatus {
    DIAMOND(6), EMERALD(6), SUDDEN_DEATH(10);

    private int min;


    GameStatus(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }
}
