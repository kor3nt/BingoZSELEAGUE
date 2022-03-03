package me.duoly.bingo;


import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class TeamNether implements Listener {

    public static void registerListener(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(new TeamNether(plugin), plugin);
    }
    private Main plugin;
    public TeamNether(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void poral(PlayerPortalEvent e) {
        if(e.getCause().toString() == "NETHER_PORTAL") {
            Player p = e.getPlayer();
            Location from = e.getFrom();
            Location destination = e.getTo();
            if(from.getWorld()==CreateWorld.RedWorld){
                destination.setWorld(CreateWorld.RedWorldNether);
                e.setTo(destination);
            }else if(from.getWorld()==CreateWorld.BlueWorld){
                destination.setWorld(CreateWorld.BlueWorldNether);
                e.setTo(destination);
            }else if(from.getWorld()==CreateWorld.RedWorldNether){
                destination.setWorld(CreateWorld.RedWorld);
                e.setTo(destination);
            }else if(from.getWorld()==CreateWorld.BlueWorldNether){
                destination.setWorld(CreateWorld.BlueWorld);
                e.setTo(destination);
            }
        }
    }
}
