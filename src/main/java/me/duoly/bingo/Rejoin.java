package me.duoly.bingo;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rejoin implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ){
        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("rejoin")){
            if(Main.gameStart){
                if(Main.TeamA.contains(player.getName()) || Main.TeamA.contains(player.getName())){
                    player.sendMessage(ChatColor.GREEN + "Dołączasz do gry! Przygotuj się!");
                    return true;
                }
                else{
                    player.sendMessage(ChatColor.RED + "Nie znajdujesz się w żadnej drużynie!");
                    return true;
                }
            }
            else{
                player.sendMessage(ChatColor.RED + "Mecz się jeszcze nie zaczął!");
                return true;
            }
        }
        return true;
    }
}
