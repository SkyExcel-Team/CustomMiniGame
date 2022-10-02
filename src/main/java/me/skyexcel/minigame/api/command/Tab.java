package me.skyexcel.minigame.api.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tab implements TabCompleter {

    private List<List<String>> args;

    private List<List<Boolean>> is = new ArrayList<List<Boolean>>();

    private int select;


    /**
     * You can select to visibility of the string
     * * <pre>{@code
     *
            Tab tab = new Tab(commands, List.of(
            List.of("test"),
            List.of("test2", "asdf2"),
            List.of("test3", "asdf3", "1234"))) {
            };
     *  } </pre>
     *
     * @param command
     * @param args
     */
    protected Tab(Commands command, List<List<String>> args) {
        Objects.requireNonNull(Bukkit.getPluginCommand(command.getLabel())).setTabCompleter(this);
        this.args = args;

    }

    public Tab select(int select) {
        this.select = select;
        return this;
    }


    /**
     * @param args Select the index of the args array
     * @return Returning tab class to use is method
     */
    public Tab of(int args) {
        try {
            List<String> test = this.args.get(select);

            test.get(args);

        } catch (ArrayIndexOutOfBoundsException e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "SELECT 값은 Array 값 안에 포함 되어야 합니다!");
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Array 값 :{" + this.args.size() + "} SELECT 값 : {" + select + "}");
        }

        return this;
    }

    public void is(boolean a) {

        this.is.add(List.of(a));

    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        List<String> result = new ArrayList<>();
        try {
            int index = args.length - 1;

            List<String> newLine = this.args.get(index);

            List<Boolean> newis = this.is.get(index);
            sender.sendMessage(newis + "");

            newLine.stream().forEach(line -> {

                result.add(line);
            });
            return result;
        } catch (Exception e) {
            return result;
        }
    }
}
