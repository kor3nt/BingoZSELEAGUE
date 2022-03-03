package me.duoly.bingo;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class CreateWorld implements CommandExecutor {

    public static World RedWorld;
    public static World BlueWorld;
    public static World RedWorldNether;
    public static World BlueWorldNether;


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {


        if(command.getName().equalsIgnoreCase("world")){
            if(!Main.gameStart){
                Random r = new Random();
                Long seed = r.nextLong(999999999 - 100000000) + 100000000;

                RedWorld = new WorldCreator("RedWorld").seed(seed).environment(World.Environment.NORMAL).type(WorldType.NORMAL).createWorld();
                BlueWorld = new WorldCreator("BlueWorld").seed(seed).environment(World.Environment.NORMAL).type(WorldType.NORMAL).createWorld();
                RedWorldNether = new WorldCreator("RedWorldNether").seed(seed).environment(World.Environment.NETHER).type(WorldType.NORMAL).createWorld();
                BlueWorldNether = new WorldCreator("BlueWorldNether").seed(seed).environment(World.Environment.NETHER).type(WorldType.NORMAL).createWorld();
                commandSender.sendMessage(ChatColor.RED + "Utworzyłeś światy!");
            }else commandSender.sendMessage(ChatColor.RED + "Nie możesz storzyć światu podczas gry!");
        }

        return false;
    }
}
