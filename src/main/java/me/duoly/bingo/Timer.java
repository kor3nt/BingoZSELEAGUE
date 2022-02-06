package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Timer{
    private Main plugin;
    FileConfiguration config;
    public Timer(Main plugin, FileConfiguration config) {
        this.config = config;
        this.plugin = plugin;
    }
    int timer;
    int countID;
    BossBar bar;
    double progress = 1.0;


    public void addPlayer(){
        for(Player player : Bukkit.getOnlinePlayers()){
            bar.addPlayer(player);
        }
    }
    public BossBar getBar(){
        return bar;
    }
    public void createBar(){
        bar = Bukkit.createBossBar("Pozostały czas: "+timer, BarColor.GREEN, BarStyle.SOLID);
        bar.setVisible(true);
    }
    public void cast(){
            timer = config.getInt("time-of-game");
            double time = progress/timer;
            countID=plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                public void run(){
                    if (progress > 0) {
                        bar.setProgress(progress);
                        bar.setTitle("Pozostały czas: "+timer/60+ ":"+ timer%60);
                        progress=progress-time;
                        timer--;
                    } else {
                        Bukkit.broadcastMessage(ChatColor.RED + "Czas się skończył!");
                        Bukkit.getScheduler().cancelTask(countID);
                        bar.setVisible(false);
                    }
                    if (timer == config.getInt("time-of-game")/2) {
                        bar.setColor(BarColor.YELLOW);
                        for(String nick : Main.TeamA){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            player.sendTitle(ChatColor.YELLOW+"Upłyneło połowe",ChatColor.YELLOW+"czasu",10,50,10 );
                        }
                        for(String nick : Main.TeamB){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            player.sendTitle(ChatColor.YELLOW+"Upłyneło połowe",ChatColor.YELLOW+"czasu",10,50,10 );
                        }
                    }
                    if (timer == config.getInt("time-of-game")/10) {
                        bar.setColor(BarColor.RED);
                        for(String nick : Main.TeamA){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            player.sendTitle(ChatColor.RED+"Zostało "+timer/60+ ":"+ timer%60+ " sekund"," ",5,30,5 );
                        }
                        for(String nick : Main.TeamB){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                        }
                    }
                    if (timer<=10){
                        for(String nick : Main.TeamA){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            if(timer<=3)player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            else if(timer<=6)player.sendTitle(ChatColor.YELLOW+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            else if(timer<=10)player.sendTitle(ChatColor.GREEN+"Zostało "+timer+ " sekund"," ",5,30,5 );
                        }
                        for(String nick : Main.TeamB){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            if(timer<=3)player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            else if(timer<=6)player.sendTitle(ChatColor.YELLOW+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            else if(timer<=10)player.sendTitle(ChatColor.GREEN+"Zostało "+timer+ " sekund"," ",5,30,5 );
                        }
                    }

                }
            }, 0L, 20L);
    }
}
