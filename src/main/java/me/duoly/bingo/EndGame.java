package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.io.File;

public class EndGame{
    File RW = new File("RedWorld");
    File BW = new File("BlueWorld");
    File RWN = new File("RedWorldNether");
    File BWN = new File("BlueWorldNether");
    private Main plugin;
    public static String winner;
    public EndGame(Main plugin) {
        this.plugin = plugin;
    }
    void End(){

        if(TasksChecking.ScoreTeamA>TasksChecking.ScoreTeamB)winner = Main.tagNameA;
        else if(TasksChecking.ScoreTeamA<TasksChecking.ScoreTeamB) winner = Main.tagNameB;
        else winner = null;

        CreateScoreboard scb = new CreateScoreboard(plugin);
        Location loc = new Location(Main.SpawnWorld,Main.SpawnWorld.getSpawnLocation().getX(),Main.SpawnWorld.getSpawnLocation().getY(),Main.SpawnWorld.getSpawnLocation().getZ());
        for(Player player : Bukkit.getOnlinePlayers()){
            scb.createBar();
            scb.addPlayer(player);
            scb.cast();
            player.teleport(loc);
            player.sendTitle(ChatColor.DARK_RED+"Koniec!", "",30,50,30);
            if(winner!=null) player.sendTitle(ChatColor.GREEN + "Zwyciężyła drużyna", ChatColor.GREEN+winner, 30, 70, 30);
            else player.sendTitle(ChatColor.YELLOW + "REMIS", " ", 30, 70, 30);
            player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
            player.playEffect(player.getLocation(), Effect.ANVIL_BREAK,null);
            Main.gameStart=false;
            TasksChecking.ScoreTeamA=0;
            TasksChecking.ScoreTeamB=0;
            TaskGui.TaskRed=null;
            TaskGui.TaskBlue=null;
            player.getInventory().clear();
        }
        if(RW.exists()){
            Bukkit.unloadWorld("RedWorld",false);
            deleteDirectory(RW);

        }
        if(BW.exists()){
            Bukkit.unloadWorld("BlueWorld",false);
            deleteDirectory(BW);
        }
        if(RWN.exists()){
            Bukkit.unloadWorld("RedWorldNether",false);
            deleteDirectory(RWN);

        }
        if(BWN.exists()){
            Bukkit.unloadWorld("BlueWorldNether",false);
            deleteDirectory(BWN);
        }
    }
    boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }
}
