package me.duoly.bingo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class TasksChecking implements CommandExecutor, Listener {


    public static Integer ScoreTeamA = 0;
    public static Integer ScoreTeamB = 0;

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        return false;
    }
}
