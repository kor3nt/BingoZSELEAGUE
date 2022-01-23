package me.duoly.bingo;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AdminChecking implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("check")){
            TextComponent acceptmsg = new TextComponent("Zaakceptuj");
            TextComponent denymsg = new TextComponent("Odrzuć");

            acceptmsg.setColor(ChatColor.GREEN);
            denymsg.setColor(ChatColor.DARK_RED);

            acceptmsg.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/accept"));
            denymsg.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/deny"));

            commandSender.spigot().sendMessage(acceptmsg);
            commandSender.spigot().sendMessage(denymsg);
            Location location = null;
            if(strings[3].equalsIgnoreCase("RedWorld")) location = new Location(CreateWorld.RedWorld,Double.parseDouble(strings[0]),Double.parseDouble(strings[1]),Double.parseDouble(strings[2]));
            else if(strings[3].equalsIgnoreCase("BlueWorld")) location = new Location(CreateWorld.BlueWorld,Double.parseDouble(strings[0]),Double.parseDouble(strings[1]),Double.parseDouble(strings[2]));
            if(location != null) player.teleport(location);
        }
        if(command.getName().equalsIgnoreCase("accept")){
            CreateScoreboard scb = new CreateScoreboard();

            if(strings[3]=="RedWorld") {
                TasksChecking.ScoreTeamA++;
                for (Player p : Bukkit.getOnlinePlayers()) {
                    scb.createScorebord(p);
                    if(p.getName() == strings[4]){
                        p.sendMessage(ChatColor.RED + "Admin sprawdził zadanie " + strings[5] + " ,brawo wykonałeś je poprawnie!");
                    }
                }

            } else if(strings[3]=="BlueWorld") {
                TasksChecking.ScoreTeamB++;
                for (Player p : Bukkit.getOnlinePlayers()) {
                    scb.createScorebord(p);
                    if (p.getName() == strings[4]) {
                        p.sendMessage(ChatColor.RED + "Admin sprawdził zadanie " + strings[5] + " ,brawo wykonałeś je poprawnie!");
                    }

                }
            }
        }else if(command.getName().equalsIgnoreCase("deny")){
            for(Player p : Bukkit.getOnlinePlayers()){
                if(p.getName() == strings[4]){
                    p.sendMessage(ChatColor.RED + "Admin sprawdził zadanie " + strings[5] + " ,musisz je poprawić!");
                }
            }
        }
        return false;
    }
}
