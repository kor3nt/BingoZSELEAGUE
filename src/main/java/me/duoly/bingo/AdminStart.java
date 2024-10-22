package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;


public class AdminStart implements CommandExecutor {

    FileConfiguration config;
    private Main plugin;
    public AdminStart(FileConfiguration config,Main plugin) {
        this.config = config;
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ) {
        if(Main.gameStart) {
            sender.sendMessage(ChatColor.RED+"Nie możesz konfigurować drużyn podczas gry!");
            return true;
        }
        if (command.getName().equalsIgnoreCase("admin")) {
            Player admin = (Player) sender;
            if (args.length == 0) {
                admin.sendMessage(ChatColor.BLUE + "Aby zacząć mecz wpisz komendę: /admin start");
                admin.sendMessage(ChatColor.BLUE + "Aby ustawic nazwy wpisz: /admin ustaw <TeamA/TeamB> <tagTeamu>");
                return true;
            }

            if (args[0].equalsIgnoreCase("start")) {
                    if(TaskGui.TaskRed==null){ admin.sendMessage(ChatColor.DARK_RED+"Utwórz plansze!");return false;}
                    if(CreateWorld.RedWorld==null){ admin.sendMessage(ChatColor.DARK_RED+"Utwórz światy!");return false;}
                    if (!Main.gameStart) {
                        if ((Main.TeamA.size() == config.getInt("number-of-players")) && (Main.TeamB.size() == config.getInt("number-of-players"))) {
                            for (String nick : Main.TeamA) {
                                Player player = Bukkit.getPlayer(nick);
                                player.setDisplayName(ChatColor.RED + Main.tagNameA + " " + ChatColor.RESET + player.getName());
                                player.setPlayerListName(ChatColor.RED + Main.tagNameA + " " + ChatColor.RESET + player.getName());
                            }
                            for (String nick : Main.TeamB) {
                                Player player = Bukkit.getPlayer(nick);
                                player.setDisplayName(ChatColor.BLUE + Main.tagNameB + " " + ChatColor.RESET + player.getName());
                                player.setPlayerListName(ChatColor.BLUE + Main.tagNameB + " " + ChatColor.RESET + player.getName());
                            }
                            Main.gameStart = true;

                            CreateScoreboard scb = new CreateScoreboard(plugin);
                            Timer timer = new Timer(plugin, config);
                            for (Player player : Bukkit.getOnlinePlayers()) {
                                scb.createScorebord(player);
                                player.sendTitle(ChatColor.GREEN + "Mecz sie zaczyna!","Powodzenia!",10,20,10);
                            }
                            Location Redloc = new Location(CreateWorld.RedWorld,CreateWorld.RedWorld.getSpawnLocation().getX(),CreateWorld.RedWorld.getSpawnLocation().getY(),CreateWorld.RedWorld.getSpawnLocation().getZ());
                            Location Blueloc = new Location(CreateWorld.BlueWorld,CreateWorld.BlueWorld.getSpawnLocation().getX(),CreateWorld.BlueWorld.getSpawnLocation().getY(),CreateWorld.BlueWorld.getSpawnLocation().getZ());

                            for (String nick : Main.TeamA){
                                Player player = Bukkit.getPlayer(nick);
                                player.teleport(Redloc);
                            }
                            for (String nick : Main.TeamB){
                                Player player = Bukkit.getPlayer(nick);
                                player.teleport(Blueloc);
                            }
                            timer.createBar();
                            for(Player p : Bukkit.getOnlinePlayers())timer.addPlayer(p);
                            timer.cast();
                        } else {
                            admin.sendMessage(ChatColor.RED + "Druzyny nie są gotowe!");
                        }

                    } else {
                        admin.sendMessage(ChatColor.RED + "Mecz już się zaczął!");
                    }
                return true;

            } else if (args[0].equalsIgnoreCase("ustaw")) {
                    if (args.length == 1) {
                        admin.sendMessage(ChatColor.RED + "Poprawne użycie: /admin ustaw <teamA/teamB> <tagTeamu");
                        return true;
                    }

                    if (args[1].equalsIgnoreCase("teamA")) {
                        if (args.length == 2) {
                            admin.sendMessage(ChatColor.RED + "Poprawne użycie: /admin ustaw <teamA/teamB> <tagTeamu");
                            return true;
                        }

                        if (args.length == 3) {
                            Stream stream = new Stream(plugin);
                            Main.tagNameA = args[2];
                            admin.sendMessage(ChatColor.GREEN + "Ustawiłes nazwe: " + Main.tagNameA);
                            stream.TeamTag();
                        } else {
                            admin.sendMessage(ChatColor.RED + "Poprawne użycie: /admin ustaw <teamA/teamB> <tagTeamu");
                        }
                        return true;
                    } else if (args[1].equalsIgnoreCase("teamB")) {
                        if (args.length == 2) {
                            admin.sendMessage(ChatColor.RED + "Poprawne użycie: /admin ustaw <teamA/teamB> <tagTeamu");
                            return true;
                        }

                        if (args.length == 3) {
                            Stream stream = new Stream(plugin);
                            Main.tagNameB = args[2];
                            admin.sendMessage(ChatColor.GREEN + "Ustawiłes nazwe: " + Main.tagNameB);
                            stream.TeamTag();
                        } else {
                            admin.sendMessage(ChatColor.RED + "Poprawne użycie: /admin ustaw <teamA/teamB> <tagTeamu");
                        }
                        return true;
                    } else {
                        admin.sendMessage(ChatColor.RED + "Poprawne użycie: /admin ustaw <teamA/teamB> <tagTeamu");
                        return true;
                    }
                } else {
                    admin.sendMessage(ChatColor.BLUE + "Aby zacząć mecz wpisz komendę: /admin start");
                    admin.sendMessage(ChatColor.BLUE + "Aby ustawic nazwy wpisz: /admin ustaw <TeamA/TeamB> <tagTeamu>");
                    return true;
                }
            }
            return false;
        }
}