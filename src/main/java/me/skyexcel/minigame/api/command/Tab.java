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



    private List<List<Boolean>> is = new ArrayList<List<Boolean>>();
    private List<Args> args;

    private int select;


    /**
     * You can select to visibility of the string
     * @param command
     * @param args
     */
    protected Tab(Commands command, List<Args> args) {
        Objects.requireNonNull(Bukkit.getPluginCommand(command.getLabel())).setTabCompleter(this);

        this.is = new ArrayList<>();
        this.args = args;
    }


    public String getArgs(){
        return this.args.get(select).getArg().get(0);
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



        } catch (ArrayIndexOutOfBoundsException e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "SELECT 값은 Array 값 안에 포함 되어야 합니다!");
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Array 값 :{" + this.args.size() + "} SELECT 값 : {" + select + "}");
        }

        return this;
    }

    public void is(boolean a) {
        try{

        } catch (ArrayIndexOutOfBoundsException e){

        }
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        List<String> result = new ArrayList<>();
        try {
            int index = args.length - 1;

            Args newLine = this.args.get(index);

            List<Boolean> newis = this.is.get(index);

            sender.sendMessage(newis + "");


            return result;
        } catch (Exception e) {
            return result;
        }
    }
}
