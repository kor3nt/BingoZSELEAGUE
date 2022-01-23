package me.duoly.bingo;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class Main extends JavaPlugin implements Listener {
    FileConfiguration config = getConfig();

    public static Boolean gameStart = false;

    //Druzyna 1
    public static String CapitanA;
    public static List<String> TeamA = new ArrayList<String>();
    public static String tagNameA;

    //Druzyna 2
    public static String CapitanB;
    public static List<String> TeamB = new ArrayList<String>();
    public static String tagNameB;

    //Worlds
    File RW = new File("RedWorld");
    File BW = new File("BlueWorld");

    boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }

    @Override
    public void onEnable() {
        config.options().copyDefaults(true);
        saveConfig();

        getCommand("druzyna").setExecutor(new TeamCommands());
        getCommand("party").setExecutor(new PartyCommands());
        getCommand("admin").setExecutor(new AdminStart(config));
        getCommand("rejoin").setExecutor(new Rejoin());

        getServer().getPluginManager().registerEvents(this, this);
        getCommand("generate").setExecutor(new TaskGui(this));
        getCommand("zadania").setExecutor(new TasksOpen());
        getCommand("world").setExecutor(new CreateWorld());
        TasksChecking.registerListener(this);
    }

    @Override
    public void onDisable() {
        if(RW.exists()){
            deleteDirectory(RW);
        }
        if(BW.exists()){
            deleteDirectory(BW);
        }

    }
}
