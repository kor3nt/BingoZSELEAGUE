package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

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
    File LiveTime = new File("LiveTime.yml");
    FileConfiguration LiveTimeC = YamlConfiguration.loadConfiguration(LiveTime);
    public void addPlayer(Player player){
            bar.addPlayer(player);
    }
    public BossBar getBar(){
        return bar;
    }
    public void createBar(){
        bar = Bukkit.createBossBar("Pozostały czas: "+timer, BarColor.GREEN, BarStyle.SOLID);
        bar.setVisible(true);
    }
    double time;

    public void cast(){
            timer = config.getInt("time-of-game");

            time = progress/timer;
            countID=plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                public void run(){
                    if (progress > 0) {
                        bar.setProgress(progress);
                        bar.setTitle("Pozostały czas: "+timer/60+ ":"+ timer%60);
                        progress=progress-time;
                        timer--;
                        LiveTimeC.set("time",timer);
                        LiveTimeC.set("progress",progress);
                        try {
                            LiveTimeC.save(LiveTime);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
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
                            if(timer<=3&timer>0){
                                player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                                player.playEffect(player.getLocation(), Effect.CLICK1,null);
                            }
                            else if(timer<=6&timer>0){
                                player.sendTitle(ChatColor.YELLOW+"Zostało "+timer+ " sekund"," ",5,30,5 );
                                player.playEffect(player.getLocation(), Effect.CLICK1,null);
                            }
                            else if(timer<=10&timer>0){
                                player.sendTitle(ChatColor.GREEN+"Zostało "+timer+ " sekund"," ",5,30,5 );
                                player.playEffect(player.getLocation(), Effect.CLICK1,null);
                            }
                        }
                        for(String nick : Main.TeamB){
                            Player player = Bukkit.getPlayer(nick);
                            assert player != null;
                            if(timer<=3&&timer>0){
                                player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                                player.playEffect(player.getLocation(), Effect.CLICK1,null);
                            }
                            else if(timer<=6&&timer>0){
                                player.sendTitle(ChatColor.YELLOW+"Zostało "+timer+ " sekund"," ",5,30,5 );
                                player.playEffect(player.getLocation(), Effect.CLICK1,null);
                            }
                            else if(timer<=10&&timer>0){
                                player.sendTitle(ChatColor.GREEN+"Zostało "+timer+ " sekund"," ",5,30,5 );
                                player.playEffect(player.getLocation(), Effect.CLICK1,null);
                            }
                        }
                    }
                    EndGame end = new EndGame(plugin);
                    if (timer==1){
                        if(TasksChecking.ScoreTeamA==TasksChecking.ScoreTeamB){
                            timer=config.getInt("overtime");
                            progress=1.0;
                            time = progress/timer;

                            for(Player player : Bukkit.getOnlinePlayers()){
                                player.sendTitle(ChatColor.RED+"Dogrywka!",ChatColor.RED+"Doliczono " + config.getInt("overtime")/60 + " minut",20,40,20);
                                player.playEffect(player.getLocation(), Effect.ENDERDRAGON_GROWL,null);
                            }
                        }else end.End();
                    }
                    if (TasksChecking.ScoreTeamA==25 || TasksChecking.ScoreTeamB==25){
                        Bukkit.getScheduler().cancelTask(countID);
                        bar.setVisible(false);
                        end.End();
                    }
                }
            }, 0L, 20L);
    }
    public void ReJoinCast(){
        timer = LiveTimeC.getInt("time");
        progress = LiveTimeC.getDouble("progress");
        time = progress/timer;
        countID=plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run(){
                if (progress > 0) {
                    bar.setProgress(progress);
                    bar.setTitle("Pozostały czas: "+timer/60+ ":"+ timer%60);
                    progress=progress-time;
                    timer--;
                } else {
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
                        if(timer<=3&timer>0){
                            player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            player.playEffect(player.getLocation(), Effect.CLICK1,null);
                        }
                        else if(timer<=6&timer>0){
                            player.sendTitle(ChatColor.YELLOW+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            player.playEffect(player.getLocation(), Effect.CLICK1,null);
                        }
                        else if(timer<=10&timer>0){
                            player.sendTitle(ChatColor.GREEN+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            player.playEffect(player.getLocation(), Effect.CLICK1,null);
                        }
                    }
                    for(String nick : Main.TeamB){
                        Player player = Bukkit.getPlayer(nick);
                        assert player != null;
                        if(timer<=3&&timer>0){
                            player.sendTitle(ChatColor.RED+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            player.playEffect(player.getLocation(), Effect.CLICK1,null);
                        }
                        else if(timer<=6&&timer>0){
                            player.sendTitle(ChatColor.YELLOW+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            player.playEffect(player.getLocation(), Effect.CLICK1,null);
                        }
                        else if(timer<=10&&timer>0){
                            player.sendTitle(ChatColor.GREEN+"Zostało "+timer+ " sekund"," ",5,30,5 );
                            player.playEffect(player.getLocation(), Effect.CLICK1,null);
                        }
                    }
                }
                EndGame end = new EndGame(plugin);
                if (timer==1){
                    if(TasksChecking.ScoreTeamA==TasksChecking.ScoreTeamB){
                        timer=config.getInt("overtime");
                        progress=1.0;
                        time = progress/timer;

                        for(Player player : Bukkit.getOnlinePlayers()){
                            player.sendTitle(ChatColor.RED+"Dogrywka!",ChatColor.RED+"Doliczono " + config.getInt("overtime")/60 + " minut",20,40,20);
                            player.playEffect(player.getLocation(), Effect.ENDERDRAGON_GROWL,null);
                        }
                    }else end.End();
                }
                if (TasksChecking.ScoreTeamA==25 || TasksChecking.ScoreTeamB==25){
                    Bukkit.getScheduler().cancelTask(countID);
                    bar.setVisible(false);
                    end.End();
                }
            }
        }, 0L, 20L);
    }
}
