package me.duoly.bingo;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Rejoin implements CommandExecutor {
    private Main plugin;
    private FileConfiguration config;
    public Rejoin(Main plugin, FileConfiguration config) {
        this.plugin = plugin;
        this.config = config;
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ){
        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("rejoin")){
            if(Main.gameStart){
                if(Main.TeamA.contains(player.getName()) || Main.TeamA.contains(player.getName())){
                    CreateScoreboard scb = new CreateScoreboard(plugin);
                    Timer timer = new Timer(plugin, config);
                    if(Main.TeamA.contains(player.getName())){
                        Location loc = new Location(CreateWorld.RedWorld,CreateWorld.RedWorld.getSpawnLocation().getX(),CreateWorld.RedWorld.getSpawnLocation().getY(),CreateWorld.RedWorld.getSpawnLocation().getZ());
                        player.teleport(loc);
                        scb.createScorebord(player);
                        scb.bar.setVisible(false);
                        player.sendTitle(ChatColor.GREEN + "Dołączasz do gry!","",10,20,10);
                        timer.createBar();
                        timer.cast();
                        timer.addPlayer();
                    }else{
                        Location loc = new Location(CreateWorld.BlueWorld,CreateWorld.BlueWorld.getSpawnLocation().getX(),CreateWorld.BlueWorld.getSpawnLocation().getY(),CreateWorld.BlueWorld.getSpawnLocation().getZ());
                        player.teleport(loc);
                        scb.createScorebord(player);
                        scb.bar.setVisible(false);
                        player.sendTitle(ChatColor.GREEN + "Dołączasz do gry!","",10,20,10);
                        timer.createBar();
                        timer.cast();
                        timer.addPlayer();
                    }

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
