package me.duoly.bingo;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class TasksChecking implements Listener {
    public static void registerListener(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(new TasksChecking(), plugin);
    }
    public static Integer ScoreTeamA = 0;
    public static Integer ScoreTeamB = 0;

    @EventHandler
    public void CheckTask(InventoryClickEvent event) {
        if(event.getClickedInventory().equals(TaskGui.TaskRed)||event.getClickedInventory().equals(TaskGui.TaskBlue)) {
            Player player = (Player) event.getWhoClicked();
            if (Main.TeamA.contains(event.getWhoClicked().getName())) {
                if(event.getCurrentItem()!=null) {
                    switch (event.getCurrentItem().getType()) {
                        case STICK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STICK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskRed.setItem(event.getSlot(), null);
                                            ScoreTeamA++;
                                            player.getInventory().setItem(i, null);
                                            CreateScoreboard scb = new CreateScoreboard();
                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case MAP:
                            for(Player p : Bukkit.getOnlinePlayers()){
                                double x = event.getWhoClicked().getLocation().getX();
                                double y = event.getWhoClicked().getLocation().getY();
                                double z = event.getWhoClicked().getLocation().getZ();
                                if(p.isOp()){
                                    TextComponent msg = new TextComponent("Kliknij tu aby się tam przenieść!");
                                    msg.setBold(true);
                                    msg.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/check " + x + " " + y + " " + z + " " + player.getWorld().getName() + " " + player.getName() + " " + event.getCurrentItem().getItemMeta().getDisplayName()));
                                    p.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "Gracz " + player.getName() + " z drużyny " + Main.tagNameA + " wykonał zadanie " + ChatColor.RED +  event.getCurrentItem().getItemMeta().getDisplayName());
                                    p.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "Opis:" + ChatColor.RED + event.getCurrentItem().getItemMeta().getLore());
                                    p.spigot().sendMessage(msg);
                                }
                            }
                            break;
                    }
                }
            } else if (event.getInventory().equals(TaskGui.TaskBlue)) {

            } else return;
        }
    }

}
