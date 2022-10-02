package me.skyexcel.minigame.api.command;

import me.skyexcel.minigame.MiniGame;
import org.bukkit.command.CommandSender;
import skyexcel.data.file.Config;

import java.util.Arrays;
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

        Tab tab = new Tab(commands, List.of(
                List.of(Arrays.toString(config.getFileList())),
                List.of("test2", "asdf2"),
                List.of("test3", "asdf3", "1234"))) {
        };

        tab.select(1).of(0).is(config.getFileList() != null);
    }
}
