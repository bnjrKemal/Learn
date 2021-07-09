package com.bnjrKemal.example;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ArgsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
		for(String str : args) {
			sender.sendMessage(str);
		}
		return false;
	}

}
