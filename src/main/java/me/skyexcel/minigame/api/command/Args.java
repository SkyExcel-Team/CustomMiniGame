package me.skyexcel.minigame.api.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Args  {
    private List<String> arg = new ArrayList<>();

    private boolean is;

    public Args(String... arg) {
        Arrays.stream(arg).forEach(args ->{
            this.arg.add(args);
            System.out.println(args);
        });
    }


    public void setIs(boolean is) {
        this.is = is;
    }

    public List<String> getArg() {
        return arg;
    }

    public boolean getIs() {
        return is;
    }
}
