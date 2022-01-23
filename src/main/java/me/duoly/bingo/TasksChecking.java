package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class TasksChecking implements Listener {

    public static Integer ScoreTeamA = 0;
    public static Integer ScoreTeamB = 0;

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if(event.getInventory().equals(TaskGui.TaskRed)){
            Player player = (Player) event.getWhoClicked();
            switch (event.getCurrentItem().getType()){
                case STICK:
                    Integer x = 0;
                    while(player.getInventory().getItem(x).getType() == Material.STICK){
                        x++;
                    }
                    if(player.getInventory().getItem(x).getAmount() == event.getCurrentItem().getAmount()){
                        TaskGui.TaskRed.setItem(event.getSlot(), null);
                        ScoreTeamA++;
                        player.getInventory().setItem(x,null);
                        CreateScoreboard scb = new CreateScoreboard();
                        for (Player p : Bukkit.getOnlinePlayers()) {
                            scb.createScorebord(p);
                        }
                    }
                    break;
            }
        }else if(event.getInventory().equals(TaskGui.TaskBlue)){

        }else return;
    }

}
