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
        plugin.getServer().getPluginManager().registerEvents(new TasksChecking(plugin), plugin);
    }
    private Main plugin;
    public TasksChecking(Main plugin) {
        this.plugin = plugin;
    }
    CreateScoreboard scb = new CreateScoreboard(plugin);
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
                        case RABBIT_STEW:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RABBIT_STEW)) {
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
                        case SLIME_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SLIME_BLOCK)) {
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
                        case GHAST_TEAR:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GHAST_TEAR)) {
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
                        case TNT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.TNT)) {
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
                        case BREAD:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BREAD)) {
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
                        case IRON_INGOT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.IRON_INGOT)) {
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
                        case GUNPOWDER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GUNPOWDER)) {
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
                        case MAGMA_CREAM:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.MAGMA_CREAM)) {
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
                        case WHITE_WOOL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.WHITE_WOOL)) {
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
                        case HONEYCOMB:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.HONEYCOMB)) {
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
                        case BLAZE_ROD:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BLAZE_ROD)) {
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
                        case EGG:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.EGG)) {
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
                        case NETHERRACK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NETHERRACK)) {
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
                        case OAK_SLAB:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.OAK_SLAB)) {
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
                        case BOOKSHELF:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BOOKSHELF)) {
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
                        case BOOK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BOOK)) {
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
                        case CARROT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.CARROT)) {
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
                        case WHEAT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.WHEAT)) {
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
                        case DIAMOND_PICKAXE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.DIAMOND_PICKAXE)) {
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
                        case NETHER_WART:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NETHER_WART)) {
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
                        case COCOA_BEANS:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.COCOA_BEANS)) {
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
                        case VINE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.VINE)) {
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
                        case GOLDEN_APPLE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLDEN_APPLE)) {
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
                        case GLASS_BOTTLE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GLASS_BOTTLE)) {
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
                        case SALMON:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SALMON)) {
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
                        case RAIL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RAIL)) {
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
                        case STICKY_PISTON:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STICKY_PISTON)) {
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
                        case LIME_STAINED_GLASS_PANE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LIME_STAINED_GLASS_PANE)) {
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
                        case NOTE_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NOTE_BLOCK)) {
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
                        case WHITE_CARPET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.WHITE_CARPET)) {
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
                        case SUNFLOWER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SUNFLOWER)) {
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
                        case MILK_BUCKET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.MILK_BUCKET)) {
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
                        case SLIME_BALL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SLIME_BALL)) {
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
                        case ARROW:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ARROW)) {
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
                        case STONE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STONE)) {
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
                        case FERN:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FERN)) {
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
                        case CACTUS:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.CACTUS)) {
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
                        case BIRCH_SIGN:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BIRCH_SIGN)) {
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
                        case ORANGE_BED:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ORANGE_BED)) {
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
                        case ARMOR_STAND:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ARMOR_STAND)) {
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
                        case LIME_BANNER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LIME_BANNER)) {
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
                        case RED_MUSHROOM:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RED_MUSHROOM)) {
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
                        case BLAZE_POWDER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BLAZE_POWDER)) {
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
                        case RABBIT_FOOT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RABBIT_FOOT)) {
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
                        case SADDLE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SADDLE)) {
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
                        case DIAMOND_AXE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.DIAMOND_AXE)) {
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
                        case LEAD:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LEAD)) {
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
                        case CLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.CLOCK)) {
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
                        case NAME_TAG:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NAME_TAG)) {
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
                        case GOLDEN_HOE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLDEN_HOE)) {
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
                        case FLINT_AND_STEEL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FLINT_AND_STEEL)) {
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
                        case FEATHER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FEATHER)) {
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
                        case GLOWSTONE_DUST:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GLOWSTONE_DUST)) {
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
                        case SNOWBALL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SNOWBALL)) {
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
                        case PURPLE_DYE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.PURPLE_DYE)) {
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
                        case GOLD_INGOT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLD_INGOT)) {
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
                        case STRING:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STRING)) {
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
                        case BOWL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BOWL)) {
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
                        case ENDER_PEARL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ENDER_PEARL)) {
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
                        case LAVA_BUCKET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LAVA_BUCKET)) {
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
                        case BONE_MEAL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BONE_MEAL)) {
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
                        case BRICK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BRICK)) {
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
                        case BRICKS:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BRICKS)) {
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
                        case END_STONE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.END_STONE)) {
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
                        case STONE_PRESSURE_PLATE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STONE_PRESSURE_PLATE)) {
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
                        case STONE_BUTTON:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STONE_BUTTON)) {
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
                        case LADDER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LADDER)) {
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
                        case ANVIL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ANVIL)) {
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
                        case LAPIS_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LAPIS_BLOCK)) {
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
                        case IRON_HORSE_ARMOR:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.IRON_HORSE_ARMOR)) {
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
                        case DIAMOND_CHESTPLATE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.DIAMOND_CHESTPLATE)) {
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
                        case GOLD_NUGGET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLD_NUGGET)) {
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
                        case LEATHER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LEATHER)) {
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
                        case INK_SAC:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.INK_SAC)) {
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
                        case SUGAR:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SUGAR)) {
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
                        case PUFFERFISH:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.PUFFERFISH)) {
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
                        case QUARTZ_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.QUARTZ_BLOCK)) {
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
                        case ENDER_EYE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ENDER_EYE)) {
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
                        case FLOWER_POT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FLOWER_POT)) {
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
                        case SPRUCE_SAPLING:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SPRUCE_SAPLING)) {
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
                        case COOKED_PORKCHOP:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.COOKED_PORKCHOP)) {
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
            } else if (Main.TeamB.contains(event.getWhoClicked().getName())) {
                if(event.getCurrentItem()!=null) {
                    switch (event.getCurrentItem().getType()) {
                        case STICK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STICK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case RABBIT_STEW:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RABBIT_STEW)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SLIME_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SLIME_BLOCK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GHAST_TEAR:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GHAST_TEAR)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case TNT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.TNT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BREAD:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BREAD)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case IRON_INGOT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.IRON_INGOT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GUNPOWDER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GUNPOWDER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case MAGMA_CREAM:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.MAGMA_CREAM)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case WHITE_WOOL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.WHITE_WOOL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case HONEYCOMB:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.HONEYCOMB)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BLAZE_ROD:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BLAZE_ROD)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case EGG:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.EGG)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case NETHERRACK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NETHERRACK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case OAK_SLAB:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.OAK_SLAB)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BOOKSHELF:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BOOKSHELF)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BOOK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BOOK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case CARROT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.CARROT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case WHEAT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.WHEAT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case DIAMOND_PICKAXE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.DIAMOND_PICKAXE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case NETHER_WART:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NETHER_WART)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case COCOA_BEANS:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.COCOA_BEANS)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case VINE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.VINE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GOLDEN_APPLE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLDEN_APPLE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GLASS_BOTTLE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GLASS_BOTTLE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SALMON:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SALMON)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case RAIL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RAIL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case STICKY_PISTON:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STICKY_PISTON)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LIME_STAINED_GLASS_PANE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LIME_STAINED_GLASS_PANE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case NOTE_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NOTE_BLOCK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case WHITE_CARPET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.WHITE_CARPET)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SUNFLOWER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SUNFLOWER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case MILK_BUCKET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.MILK_BUCKET)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SLIME_BALL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SLIME_BALL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ARROW:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ARROW)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case STONE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STONE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case FERN:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FERN)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case CACTUS:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.CACTUS)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BIRCH_SIGN:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BIRCH_SIGN)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ORANGE_BED:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ORANGE_BED)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ARMOR_STAND:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ARMOR_STAND)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LIME_BANNER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LIME_BANNER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case RED_MUSHROOM:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RED_MUSHROOM)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BLAZE_POWDER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BLAZE_POWDER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case RABBIT_FOOT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.RABBIT_FOOT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SADDLE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SADDLE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case DIAMOND_AXE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.DIAMOND_AXE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LEAD:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LEAD)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case CLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.CLOCK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case NAME_TAG:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.NAME_TAG)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GOLDEN_HOE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLDEN_HOE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case FLINT_AND_STEEL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FLINT_AND_STEEL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case FEATHER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FEATHER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GLOWSTONE_DUST:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GLOWSTONE_DUST)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SNOWBALL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SNOWBALL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case PURPLE_DYE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.PURPLE_DYE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GOLD_INGOT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLD_INGOT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case STRING:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STRING)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BOWL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BOWL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ENDER_PEARL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ENDER_PEARL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LAVA_BUCKET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LAVA_BUCKET)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BONE_MEAL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BONE_MEAL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BRICK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BRICK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case BRICKS:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.BRICKS)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case END_STONE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.END_STONE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case STONE_PRESSURE_PLATE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STONE_PRESSURE_PLATE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case STONE_BUTTON:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.STONE_BUTTON)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LADDER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LADDER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ANVIL:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ANVIL)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LAPIS_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LAPIS_BLOCK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case IRON_HORSE_ARMOR:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.IRON_HORSE_ARMOR)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case DIAMOND_CHESTPLATE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.DIAMOND_CHESTPLATE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case GOLD_NUGGET:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.GOLD_NUGGET)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case LEATHER:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.LEATHER)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case INK_SAC:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.INK_SAC)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SUGAR:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SUGAR)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case PUFFERFISH:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.PUFFERFISH)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case QUARTZ_BLOCK:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.QUARTZ_BLOCK)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case ENDER_EYE:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.ENDER_EYE)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case FLOWER_POT:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.FLOWER_POT)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case SPRUCE_SAPLING:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.SPRUCE_SAPLING)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
                                            player.getInventory().setItem(i, null);

                                            for (Player p : Bukkit.getOnlinePlayers()) {
                                                scb.createScorebord(p);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case COOKED_PORKCHOP:
                            for (Integer i = 0; i <= player.getInventory().getContents().length; i++) {
                                if (player.getInventory().getItem(i) != null) {
                                    if (player.getInventory().getItem(i).getType().equals(Material.COOKED_PORKCHOP)) {
                                        if (player.getInventory().getItem(i).getAmount() == event.getCurrentItem().getAmount()) {
                                            TaskGui.TaskBlue.setItem(event.getSlot(), null);
                                            ScoreTeamB++;
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
            } else return;
        }else return;

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
            player.sendMessage(" ");
            player.spigot().sendMessage(accept);
            player.sendMessage(" ");
            player.sendMessage(" ");
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
                    if(p.isOp()) {
                        for(int i=0;i<=200;i++)p.sendMessage(" ");
                    }
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
                    if(p.isOp()) {
                        for(int i=0;i<=200;i++)p.sendMessage(" ");
                    }
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
                for (Player p : Bukkit.getOnlinePlayers()) {
                    if(p.isOp()) {
                        for(int i=0;i<=200;i++)p.sendMessage(" ");
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
                for (Player p : Bukkit.getOnlinePlayers()) {
                    if(p.isOp()) {
                        for(int i=0;i<=200;i++)p.sendMessage(" ");
                    }
                }
            }
        }
        return true;
    }
}