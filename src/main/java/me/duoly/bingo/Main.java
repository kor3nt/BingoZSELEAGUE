package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
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
    public static World SpawnWorld;

    boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }
    public Timer bar;
    @Override
    public void onEnable() {
        config.options().copyDefaults(true);
        saveConfig();

        getCommand("druzyna").setExecutor(new TeamCommands());
        getCommand("party").setExecutor(new PartyCommands());
        getCommand("admin").setExecutor(new AdminStart(config,this));
        getCommand("rejoin").setExecutor(new Rejoin(this,config));

        getServer().getPluginManager().registerEvents(this, this);
        getCommand("generate").setExecutor(new TaskGui(this));
        getCommand("zadania").setExecutor(new TasksOpen());
        getCommand("world").setExecutor(new CreateWorld());
        getCommand("check").setExecutor(new TasksChecking(this));
        getCommand("accept").setExecutor(new TasksChecking(this));
        getCommand("deny").setExecutor(new TasksChecking(this));
        getCommand("pomoc").setExecutor(new Help(this,config));

        TasksChecking.registerListener(this);
        PlayerJoin.registerListener(this);
        OnDeathPlayer.registerListener(this);

        if(config.get("spawn-world")!=null) SpawnWorld = new WorldCreator((String) config.get("spawn-world")).createWorld();
        else SpawnWorld = new WorldCreator("world").createWorld();
    }

    @Override
    public void onDisable() {
        if(RW.exists()){
            Bukkit.unloadWorld("RedWorld",false);
            deleteDirectory(RW);

        }
        if(BW.exists()){
            Bukkit.unloadWorld("BlueWorld",false);
            deleteDirectory(BW);
        }
        for (Player player : Bukkit.getOnlinePlayers()){
            player.kickPlayer(ChatColor.BOLD+ " " +ChatColor.DARK_RED+"Dołącz jeszcze raz! To tylko restart");
        }

    }


}

