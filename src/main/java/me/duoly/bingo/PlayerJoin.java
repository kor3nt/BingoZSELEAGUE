package me.duoly.bingo;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {
    public static void registerListener(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(new PlayerJoin(plugin), plugin);
    }

    private Main plugin;

    public PlayerJoin(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        CreateScoreboard scb = new CreateScoreboard(plugin);
        Location loc = new Location(Main.SpawnWorld, Main.SpawnWorld.getSpawnLocation().getX(), Main.SpawnWorld.getSpawnLocation().getY(), Main.SpawnWorld.getSpawnLocation().getZ());
        Player player = (Player) event.getPlayer();

        scb.createBar();
        scb.addPlayer(player);
        scb.cast();
        player.teleport(loc);
        if (Main.gameStart) {
            player.sendTitle(ChatColor.GREEN + "Jeśli chcesz dołączyć ponownie", ChatColor.GREEN + "do rozgrywki wpisz /rejoin", 30, 50, 30);
        }
        if(player.isOp()){
            player.setDisplayName(ChatColor.BOLD+""+ChatColor.RED+player.getName());
            player.setPlayerListName(ChatColor.BOLD+""+ChatColor.RED+player.getName());
        }
    }


    @EventHandler
    public void onTalk(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        e.setFormat(player.getDisplayName() + ChatColor.GRAY+": "+ChatColor.WHITE + e.getMessage());
    }
}
