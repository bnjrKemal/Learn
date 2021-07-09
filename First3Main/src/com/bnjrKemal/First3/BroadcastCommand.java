package com.bnjrKemal.First3;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < args.length; i ++) {
			builder.append(args[i]).append(" ");
		}
		
		String message = builder.toString();
		
		ServerBroadcastEvent event = new ServerBroadcastEvent(sender, message);
		Bukkit.getPluginManager().callEvent(event);
		
		if(!event.isCancelled()) { 
			Bukkit.broadcastMessage(message);
		}		
		return false;
	}

}
