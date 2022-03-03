package me.duoly.bingo;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

public class Help implements CommandExecutor {
    private Main plugin;
    FileConfiguration config;
    public Help(Main plugin, FileConfiguration config) {
        this.config = config;
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(command.getName().equalsIgnoreCase("pomoc")){
            commandSender.sendMessage(ChatColor.GRAY+"--------------------< "+ChatColor.BOLD +ChatColor.GREEN+"POMOC"+ChatColor.RESET+ChatColor.GRAY+ " >-------------------");
            commandSender.sendMessage(ChatColor.DARK_GREEN+">> "+ChatColor.BOLD +ChatColor.GREEN+"/party zapros/usun/list" + ChatColor.RESET+ChatColor.GRAY + " - pozwala zaprosić lub usunąć gracza z drużyny lub wyświetlić skład drużyny.");
            commandSender.sendMessage(ChatColor.DARK_GREEN +">> "+ChatColor.BOLD +ChatColor.GREEN+"/rejoin" + ChatColor.RESET+ChatColor.GRAY + " - pozwala dołączyć do rozgrywki po wyjściu z serwera.");
            commandSender.sendMessage(ChatColor.DARK_GREEN +">> "+ChatColor.BOLD +ChatColor.GREEN+"/zadania" + ChatColor.RESET+ChatColor.GRAY + " - wyświetla plansze z zadaniami podczas gry, gdy chcesz wykonać zadanie wystarczy w nie kliknąć.");
            commandSender.sendMessage(ChatColor.GRAY+"--------------------< "+ChatColor.BOLD +ChatColor.GREEN+"POMOC"+ChatColor.RESET+ChatColor.GRAY+ " >--------------------");
        }

        return false;
    }
}
