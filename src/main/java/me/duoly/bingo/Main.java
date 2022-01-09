package me.duoly.bingo;

import org.bukkit.Bukkit;
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

        getCommand("druzyna").setExecutor(new TeamCommands());
        getCommand("party").setExecutor(new PartyCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
