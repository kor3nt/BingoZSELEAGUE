package me.duoly.bingo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ScoreAdd implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(command.getName().equalsIgnoreCase("add")){
            if(strings[0].equalsIgnoreCase("teamA")) TasksChecking.ScoreTeamA++;
            else if(strings[0].equalsIgnoreCase("teamB")) TasksChecking.ScoreTeamB++;
            else commandSender.sendMessage("/add (teamA/teamB)");
        }else commandSender.sendMessage("/add (teamA/teamB)");
        return false;
    }
}
