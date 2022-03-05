package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ScoreAdd implements CommandExecutor {
    private Main plugin;
    public ScoreAdd(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(command.getName().equalsIgnoreCase("add")) {
            if (commandSender.isOp()) {
                CreateScoreboard scb = new CreateScoreboard(plugin);
                if (strings[0].equalsIgnoreCase("teamA")) {
                    TasksChecking.ScoreTeamA++;
                    for (Player player : Bukkit.getOnlinePlayers()){
                        scb.createScorebord(player);
                    }
                } else if (strings[0].equalsIgnoreCase("teamB")) {
                    TasksChecking.ScoreTeamB++;
                    for (Player player : Bukkit.getOnlinePlayers()){
                        scb.createScorebord(player);
                    }
                } else commandSender.sendMessage("/add (teamA/teamB)");
            }else commandSender.sendMessage(ChatColor.RED+ "Nie masz persmiji");
        }
        return false;
    }
}
