package me.skyexcel.minigame.api.command;

import me.skyexcel.minigame.MiniGame;
import org.bukkit.command.CommandSender;
import skyexcel.data.file.Config;

import java.util.List;

public class Command {
    private String label = "games";

    public Command(String cmd) {
        this.label = cmd;

        Config config = new Config("test/");
        config.setPlugin(MiniGame.plugin);

        Commands commands = new Commands(label) {
            @Override
            public void run(CommandSender sender, String[] args) {
                sender.sendMessage("asfd");
            }
        };

        Tab tab = new Tab(commands,
                List.of(new Args("asdf"),
                        new Args("test","asdf") )) {
        };

        tab.select(1).of(0).is(tab.select(0).getArgs().equalsIgnoreCase("asdf"));
    }
}
