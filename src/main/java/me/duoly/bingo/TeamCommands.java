package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        //admin - ustawianie kapitanow i wyswietlanie ich
        if (command.getName().equalsIgnoreCase("druzyna")) {
            Player admin = (Player) sender;
            if (args.length == 0) {
                admin.sendMessage(ChatColor.YELLOW + "/druzyna add <teamA/teamB> <nick>" + ChatColor.WHITE + " - dodaje gracza na kapitana");
                admin.sendMessage(ChatColor.YELLOW + "/druzyna show" + ChatColor.WHITE + " - pokazuje kapitanów");
                return true;
            }

            if (args[0].equalsIgnoreCase("add")) {
                if (args.length == 1) {
                    admin.sendMessage(ChatColor.RED + "Poprawne użycie: /druzyna add <teamA/teamB> <nick>");
                    return true;
                }

                if (args[1].equalsIgnoreCase("teamA")) {
                    Player player = Bukkit.getPlayer(args[2]);
                    if (player != null && player.isOnline()) {
                        Main.CapitanA = args[2];
                        Main.TeamA.add(Main.CapitanA);
                        Main.scoreTeamA.addEntry(Main.CapitanA);
                        admin.sendMessage(ChatColor.GREEN + "Pomyślnie dodałes kapitana teamu A");
                        return true;
                    }

                    admin.sendMessage(ChatColor.RED + "Poprawne użycie: /druzyna add <teamA/teamB> <nick>");
                    return true;
                }
                else if (args[1].equalsIgnoreCase("teamB")) {
                    Player player = Bukkit.getPlayer(args[2]);
                    if (player != null && player.isOnline()) {
                        Main.CapitanB = args[2];
                        Main.TeamB.add(Main.CapitanB);
                        Main.scoreTeamB.addEntry(Main.CapitanB);
                        admin.sendMessage(ChatColor.GREEN + "Pomyślnie dodałes kapitana teamu B");
                        return true;
                    }

                    admin.sendMessage(ChatColor.RED + "Poprawne użycie: /druzyna add <teamA/teamB> <nick>");
                    return true;
                }
            }
            else if (args[0].equalsIgnoreCase("show")) {
                admin.sendMessage(ChatColor.AQUA + "TEAM A: " + ChatColor.WHITE + Main.CapitanA);
                admin.sendMessage(ChatColor.AQUA + "TEAM B: " + ChatColor.WHITE + Main.CapitanB);
                return true;
            }
            else {
                admin.sendMessage(ChatColor.YELLOW + "/druzyna add <teamA/teamB> <nick>" + ChatColor.WHITE + " - dodaje gracza na kapitana");
                admin.sendMessage(ChatColor.YELLOW + "/druzyna show" + ChatColor.WHITE + " - pokazuje kapitanów");
                return true;
            }
        }
        return  true;
    }
}
