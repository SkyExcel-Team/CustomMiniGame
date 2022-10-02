package me.skyexcel.minigame.api.command;

public abstract class Args  {
    private String arg;

    public Args(String arg) {
        this.arg = arg;
    }

    public String getArg() {
        return arg;
    }
}
