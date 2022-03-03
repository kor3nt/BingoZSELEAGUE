package me.duoly.bingo;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TasksOpen implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player player = (Player) sender;
        if(!Main.gameStart) {
            player.sendMessage(ChatColor.RED+"Gra się jeszcze nie zaczeła!");
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("zadania")){
                if(Main.TeamA.contains(player.getName())) player.openInventory(TaskGui.TaskRed);
                else if(Main.TeamB.contains(player.getName())) player.openInventory(TaskGui.TaskBlue);
                else if(player.isOp()){
                    if(args[0].equalsIgnoreCase("teamA"))player.openInventory(TaskGui.TaskRed);
                    else if(args[0].equalsIgnoreCase("teamB")) player.openInventory(TaskGui.TaskBlue);
                }
        }
        return false;
    }

}
