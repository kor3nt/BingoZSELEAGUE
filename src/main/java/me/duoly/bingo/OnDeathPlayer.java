package me.duoly.bingo;


import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class OnDeathPlayer implements Listener {
    public static void registerListener(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(new OnDeathPlayer(plugin), plugin);
    }
    private Main plugin;
    public OnDeathPlayer(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event){
        Player player = event.getPlayer();
        Location Redloc = new Location(CreateWorld.RedWorld,CreateWorld.RedWorld.getSpawnLocation().getX(),CreateWorld.RedWorld.getSpawnLocation().getY(),CreateWorld.RedWorld.getSpawnLocation().getZ());
        Location Blueloc = new Location(CreateWorld.BlueWorld,CreateWorld.BlueWorld.getSpawnLocation().getX(),CreateWorld.BlueWorld.getSpawnLocation().getY(),CreateWorld.BlueWorld.getSpawnLocation().getZ());
        Location Spawn = new Location(Main.SpawnWorld,Main.SpawnWorld.getSpawnLocation().getX(),Main.SpawnWorld.getSpawnLocation().getY(),Main.SpawnWorld.getSpawnLocation().getZ());
        if(Main.gameStart){
            World world = player.getWorld();
            if(world==CreateWorld.RedWorld) event.setRespawnLocation(Redloc);
            else if (world==CreateWorld.BlueWorld)event.setRespawnLocation(Blueloc);
        }else event.setRespawnLocation(Spawn);
    }
}
