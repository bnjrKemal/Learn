package com.bnjrKemal.RankSystem;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.apache.commons.lang3.EnumUtils;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class RankCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) { return true; }
		
		Player player = (Player) sender;

		if(!player.isOp()) { 
			player.sendMessage("No permission!");
			return true;
		}
		if(args.length != 2) {
			player.sendMessage("Invalid usage: /setrank <player> <rank>");
			return true;
		}
		if(!Bukkit.getPlayerExact(args[0]).hasPlayedBefore()) {
			player.sendMessage("Player has never logged in!");
			return true;
		}
		if(!EnumUtils.isValidEnum(Rank.class, args[1].toUpperCase())) {
			player.sendMessage("Rank dont exists!");
			return true;
		}
		RankSystemMain.getFileManager().setRank(Bukkit.getPlayerExact(args[0]), Rank.valueOf(args[1].toUpperCase()));
		player.sendMessage(ChatColor.GOLD + "You rank has been changed!");
		if(Bukkit.getPlayerExact(args[0]).isOnline()) Bukkit.getPlayerExact(args[0]).sendMessage(
				player.getName() + "Change your rank to " + args[1].toUpperCase());
		return true;
	}

}
