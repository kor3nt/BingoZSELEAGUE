package com.Duoly.ZseBingo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("komenda")) {
			if(sender instanceof Player) {
				return true;
			}
			else {
				sender.sendMessage("Powodzenia Klaudiusz :* ");
				return true;
			}
			
		}
		return false;
	}

}
