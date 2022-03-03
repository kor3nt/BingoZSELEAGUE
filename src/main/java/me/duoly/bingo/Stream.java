package me.duoly.bingo;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Stream {

    File LiveTime = new File("LiveTime.yml");
    FileConfiguration LiveTimeC = YamlConfiguration.loadConfiguration(LiveTime);
    private Main plugin;
    public Stream(Main plugin) {
        this.plugin = plugin;
    }
    EndGame end = new EndGame(plugin);
    void TeamTag(){
        LiveTimeC.set("redtag",Main.tagNameA);
        LiveTimeC.set("bluetag",Main.tagNameB);
        try {
            LiveTimeC.save(LiveTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void Capitans(){
        LiveTimeC.set("red1",Main.CapitanA);
        LiveTimeC.set("blue1",Main.CapitanB);
        try {
            LiveTimeC.save(LiveTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void Players(){
        LiveTimeC.set("red2",Main.TeamA.get(1));
        LiveTimeC.set("red3",Main.TeamA.get(2));
        LiveTimeC.set("red4",Main.TeamA.get(3));
        LiveTimeC.set("blue2",Main.TeamB.get(1));
        LiveTimeC.set("blue3",Main.TeamB.get(2));
        LiveTimeC.set("blue4",Main.TeamB.get(3));
        try {
            LiveTimeC.save(LiveTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void Scoreboard(){
        LiveTimeC.set("redscore",TasksChecking.ScoreTeamA);
        LiveTimeC.set("bluescore",TasksChecking.ScoreTeamB);
        try {
            LiveTimeC.save(LiveTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void Winner(){
        LiveTimeC.set("winner",EndGame.winner);
        try {
            LiveTimeC.save(LiveTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
