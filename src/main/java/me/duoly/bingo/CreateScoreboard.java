package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class CreateScoreboard {

    public void createScorebord(Player player){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("Game", "dummy", ChatColor.GOLD + "ZSE League");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score s = obj.getScore(ChatColor.DARK_BLUE + "________________");
        s.setScore(5);
        Score s1 = obj.getScore(ChatColor.RED + "Team: " + Main.tagNameA);
        s1.setScore(4);
        Score s2 = obj.getScore(ChatColor.YELLOW + "Punkty: " + TasksChecking.ScoreTeamA);
        s2.setScore(3);
        Score s3 = obj.getScore(ChatColor.DARK_BLUE  + "________________");
        s3.setScore(2);
        Score s4 = obj.getScore(ChatColor.BLUE + "Team: " + Main.tagNameB);
        s4.setScore(1);
        Score s5 = obj.getScore(ChatColor.YELLOW + "Punkty: " + TasksChecking.ScoreTeamB);
        s5.setScore(0);
        player.setScoreboard(board);
    }

}