package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;


public class AdminStart implements CommandExecutor {

    public static Scoreboard board;
    public static Team scoreTeamA;
    public static Team scoreTeamB;

    FileConfiguration config;
    public AdminStart(FileConfiguration config) {
        this.config = config;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        if(command.getName().equalsIgnoreCase("admin")){
            Player admin = (Player) sender;
            if(args.length == 0){
                admin.sendMessage(ChatColor.BLUE + "Aby zacząć mecz wpisz komendę: /admin start");
                return true;
            }

            if(args[0].equalsIgnoreCase("start")){
                if(Main.TeamA.size() == config.getInt("number-of-players") ||
                        Main.TeamB.size() == config.getInt("number-of-players")) {

                            board = Bukkit.getScoreboardManager().getNewScoreboard();
                            scoreTeamA = board.registerNewTeam("teamA");
                            scoreTeamB = board.registerNewTeam("teamB");



                            admin.sendMessage(ChatColor.GREEN + "Mecz sie zaczyna!");
                    return true;
                }
                else{
                    admin.sendMessage(ChatColor.RED + "Druzyny nie są gotowe!");
                    return true;
                }
            }

            return true;
        }
        return true;
    }



}
