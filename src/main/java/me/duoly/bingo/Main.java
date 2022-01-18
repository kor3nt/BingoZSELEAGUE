package me.duoly.bingo;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Main extends JavaPlugin implements Listener {
    FileConfiguration config = getConfig();


    //Druzyna 1
    public static String CapitanA;
    public static List<String> TeamA = new ArrayList<String>();
    public static String tagNameA;

    //Druzyna 2
    public static String CapitanB;
    public static List<String> TeamB = new ArrayList<String>();
    public static String tagNameB;


    @Override
    public void onEnable() {
        config.options().copyDefaults(true);
        saveConfig();

        getCommand("druzyna").setExecutor(new TeamCommands());
        getCommand("party").setExecutor(new PartyCommands());
        getCommand("admin").setExecutor(new AdminStart(config));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
