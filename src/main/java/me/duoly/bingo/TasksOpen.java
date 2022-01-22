package me.duoly.bingo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TasksOpen implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("zadania")){
            for(int i = 0; i< Main.TeamA.size() ; i++){
                if(player.getName().equals(Main.TeamA.get(i))){
                    player.openInventory(TaskGui.TaskRed);
                }else if(player.getName().equals(Main.TeamB.get(i))){
                    player.openInventory(TaskGui.TaskBlue);
                }
            }
        }
        return false;
    }

}
