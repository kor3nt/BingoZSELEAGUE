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
        Score s1 = obj.getScore(ChatColor.RED + "Team: " + Main.tagNameA+ "   " + TasksChecking.ScoreTeamA);
        s1.setScore(4);
        Score s2 = obj.getScore(" ");
        s2.setScore(3);
        Score s3 = obj.getScore(ChatColor.BLUE + "Team: " + Main.tagNameB + "   " + TasksChecking.ScoreTeamB);
        s3.setScore(2);
        Score s4 = obj.getScore(" ");
        s4.setScore(1);
        Score s5 = obj.getScore(ChatColor.YELLOW + "esportwzse.pl/zseleague");
        s5.setScore(0);
        player.setScoreboard(board);
    }

}
