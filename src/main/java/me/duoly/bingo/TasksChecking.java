package me.duoly.bingo;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.jetbrains.annotations.NotNull;

public class TasksChecking implements Listener, CommandExecutor {
    public static Location l;
    public static void registerListener(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(new TasksChecking(), plugin);
    }
    CreateScoreboard scb = new CreateScoreboard();
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

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case MAP:

                            TextComponent msg = new TextComponent("Kliknij tu aby się tam przenieść!");
                            msg.setBold(true);
                            msg.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/check " + event.getWhoClicked().getLocation().getX()+" "+event.getWhoClicked().getLocation().getY()+" "+event.getWhoClicked().getLocation().getZ()+" "+event.getWhoClicked().getLocation().getWorld().getName()+" "+event.getSlot()));
                            for(Player p : Bukkit.getOnlinePlayers()){
                                if(p.isOp()){
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

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("check")){
            double x = Double.parseDouble(strings[0]);
            double y = Double.parseDouble(strings[1]);
            double z = Double.parseDouble(strings[2]);
            Location loc = null;
            if(strings[3].equalsIgnoreCase("redworld")) loc = new Location(CreateWorld.RedWorld,x,y,z);
            else if(strings[3].equalsIgnoreCase("blueworld")) loc = new Location(CreateWorld.BlueWorld,x,y,z);
            player.teleport(loc);
            TextComponent accept = new TextComponent("Zaakceptuj zadanie!");
            accept.setBold(true);
            if(strings[3].equalsIgnoreCase("redworld")) accept.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/accept "+strings[4]+" RedTeam"));
            else accept.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/accept "+strings[4]+" BlueTeam"));
            player.spigot().sendMessage(accept);
            TextComponent deny = new TextComponent("Odrzuć zadanie!");
            deny.setBold(true);
            if(strings[3].equalsIgnoreCase("redworld")) deny.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/deny RedTeam"));
            else deny.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/deny BlueTeam"));
            player.spigot().sendMessage(deny);

        }else if(command.getName().equalsIgnoreCase("accept")){
            if(strings[1].equalsIgnoreCase("redteam")) {
                 Integer slot = Integer.parseInt(strings[0]);
                 ScoreTeamA++;
                 TaskGui.TaskRed.setItem(slot, null);
                    for (String nick : Main.TeamA) {
                        Player p = Bukkit.getPlayer(nick);
                        if (p.isOnline()) {
                            p.sendMessage(ChatColor.GREEN + "Brawo!");
                            p.sendMessage(ChatColor.GREEN + "Twoja drużyna ukończyła zadanie");
                        }
                    }
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        scb.createScorebord(p);
                    }
            }else if(strings[1].equalsIgnoreCase("blueteam")) {
                Integer slot = Integer.parseInt(strings[0]);
                ScoreTeamB++;
                TaskGui.TaskBlue.setItem(slot, null);
                for (String nick : Main.TeamB) {
                    Player p = Bukkit.getPlayer(nick);
                    if (p.isOnline()) {
                        p.sendMessage(ChatColor.GREEN + "Brawo!");
                        p.sendMessage(ChatColor.GREEN + "Twoja drużyna ukończyła zadanie");
                    }
                }
                for (Player p : Bukkit.getOnlinePlayers()) {
                    scb.createScorebord(p);
                }
            }
        }else if(command.getName().equalsIgnoreCase("deny")){
            if(strings[0].equalsIgnoreCase("redteam")) {
                for (String nick : Main.TeamA) {
                    Player p = Bukkit.getPlayer(nick);
                    if (p.isOnline()) {
                        p.sendMessage(ChatColor.DARK_RED + "Admin odrzucił twoje zadanie!");
                        p.sendMessage(ChatColor.DARK_RED + "Musisz je poprwaić!");
                    }
                }
            }else if(strings[0].equalsIgnoreCase("blueteam")) {
                for (String nick : Main.TeamB) {
                    Player p = Bukkit.getPlayer(nick);
                    if (p.isOnline()) {
                        p.sendMessage(ChatColor.DARK_RED + "Admin odrzucił twoje zadanie!");
                        p.sendMessage(ChatColor.DARK_RED + "Musisz je poprwaić!");
                    }
                }
            }
        }
        return true;
    }
}
