package me.duoly.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PartyCommands implements CommandExecutor {
    Stream stream = new Stream();
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args ){
        //user - komendy party
        if(command.getName().equalsIgnoreCase("party")){
            Player player = (Player) sender;
            if(args.length == 0){
                player.sendMessage(ChatColor.BLUE + "Party:");
                player.sendMessage(ChatColor.BLUE + "/party zapros <nick>");
                player.sendMessage(ChatColor.BLUE + "/party usun <nick>");
                player.sendMessage(ChatColor.BLUE + "/party list");
                return true;
            }

            if(args[0].equalsIgnoreCase("zapros")){
                if(args.length == 1){
                    player.sendMessage(ChatColor.RED + "Poprawne użycie: /party zapros <nick>");
                    return true;
                }

                if(player.getName().equalsIgnoreCase(Main.CapitanA)){
                    if(Main.TeamA.contains(args[1])){
                        player.sendMessage(ChatColor.RED + "Gracz już jest w party!");
                        return true;
                    }
                    Player invitedPlayer = Bukkit.getPlayer(args[1]);
                    if(invitedPlayer != null && invitedPlayer.isOnline()){
                        Main.TeamA.add(invitedPlayer.getName());
                        player.sendMessage(ChatColor.GREEN + "Dodałeś gracza " + invitedPlayer.getName() + "do party");
                        stream.Players();
                        return true;
                    }
                    player.sendMessage(ChatColor.RED + "Takiego gracza nie ma!");
                    return true;
                }
                else if(player.getName().equalsIgnoreCase(Main.CapitanB)){
                    if(Main.TeamB.contains(args[1])){
                        player.sendMessage(ChatColor.RED + "Gracz już jest w party!");
                        return true;
                    }
                    Player invitedPlayer = Bukkit.getPlayer(args[1]);
                    if(invitedPlayer != null && invitedPlayer.isOnline()){
                        Main.TeamB.add(invitedPlayer.getName());
                        player.sendMessage(ChatColor.GREEN + "Dodałeś gracza " + invitedPlayer.getName() + "do party");
                        stream.Players();
                        return true;
                    }
                    player.sendMessage(ChatColor.RED + "Takiego gracza nie ma!");
                    return true;
                }
                else{
                    player.sendMessage(ChatColor.RED + "Nie jesteś kapitanem!");
                    return true;
                }
            }

            else if(args[0].equalsIgnoreCase("usun")){
                if(args.length == 1){
                    player.sendMessage(ChatColor.RED + "Poprawne użycie: /party usun <nick>");
                    return true;
                }

                if(player.getName().equalsIgnoreCase(Main.CapitanA)){
                    if(Main.TeamA.contains(args[1])){
                        if(args[1].equalsIgnoreCase(Main.CapitanA)){
                            player.sendMessage(ChatColor.RED + "Nie możesz usunąć samego siebie!");
                            return true;
                        }
                        Main.TeamA.remove(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Usunąłeś gracza z party!");
                        return true;
                    }
                    else{
                        player.sendMessage(ChatColor.RED + "Dany gracz nie znajduje się w party!");
                        return true;
                    }
                }
                else if(player.getName().equalsIgnoreCase(Main.CapitanB)){
                    if(Main.TeamB.contains(args[1])){
                        if(args[1].equalsIgnoreCase(Main.CapitanB)){
                            player.sendMessage(ChatColor.RED + "Nie możesz usunąć samego siebie!");
                            return true;
                        }
                        Main.TeamB.remove(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Usunąłeś gracza z party!");
                        return true;
                    }
                    else{
                        player.sendMessage(ChatColor.RED + "Dany gracz nie znajduje się w party!");
                        return true;
                    }
                }
                else{
                    player.sendMessage(ChatColor.RED + "Nie jesteś kapitanem!");
                    return true;
                }
            }

            else if(args[0].equalsIgnoreCase("list")){
                if(Main.TeamA.contains(player.getName())){
                    for(String nicks : Main.TeamA){
                        player.sendMessage(ChatColor.GOLD + nicks);
                    }
                    return true;
                }
                else if(Main.TeamB.contains(player.getName())){
                    for(String nicks : Main.TeamB){
                        player.sendMessage(ChatColor.GOLD + nicks);
                    }
                    return true;
                }
                else{
                    player.sendMessage(ChatColor.RED + "Nie znajdujesz się w żadnym party!");
                    return true;
                }
            }
            return true;
        }
        return true;
    }

}
