package com.bnjrKemal.First3;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.md_5.bungee.api.ChatColor;

public class PushCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) return true;
		
		Player player = (Player) sender;
		
		if(!(args.length == 3)) {
			player.sendMessage(ChatColor.RED + "/pushla <x> <y> <z>");
			return true;
		}
		int x,y,z;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			z = Integer.parseInt(args[2]);
		}catch(NumberFormatException e) {
			player.sendMessage(ChatColor.RED + "Geçerli sayý giriniz.");
			return true;
		}
		
		Vector vector = new Vector(x, y, z);
		player.setVelocity(vector);
		player.sendMessage(ChatColor.ALL_CODES + "Pushlandýn!");
		
		return true;
	}

}
