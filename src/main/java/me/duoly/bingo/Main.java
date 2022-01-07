package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;
import java.util.List;

public final class Main extends JavaPlugin implements Listener {
    public static Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

    public static Team scoreTeamA = board.registerNewTeam("teamA");
    public static Team scoreTeamB = board.registerNewTeam("teamB");

    //Druzyna 1
    public static String CapitanA;
    public static List<String> TeamA = new ArrayList<String>();

    //Druzyna 2
    public static String CapitanB;
    public static List<String> TeamB = new ArrayList<String>();

    @Override
    public void onEnable() {
        Party party = new Party();
        getCommand("druzyna").setExecutor(party);
        getCommand("party").setExecutor(party);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
