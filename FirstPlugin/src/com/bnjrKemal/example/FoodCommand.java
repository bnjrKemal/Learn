package com.bnjrKemal.example;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FoodCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			System.out.println("Bu komut oyuncular i�in ge�erlidir.");
			return true;		
		}
		Player player = (Player) sender;
		player.setFoodLevel(20);
		player.sendMessage("A�l�k giderildi.");
		return true;
	}

}
