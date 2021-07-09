package com.bnjrKemal.GUIPage;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GUIPageMain extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new GUIListener(), this);
	}
	
	@Override
	public void onDisable(){}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//komut
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("gui")) {
				new GUI((Player) sender, 1);
			}
		}
		
		return false;
	}
	
}
