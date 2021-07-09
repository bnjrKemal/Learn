package com.bnjrKemal.example;

import java.util.Calendar;
import java.util.Date;

import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ModerationTools implements CommandExecutor {
	
	Player player = null;
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if(args.length == 1) {
			int action;
			try {
				action = Integer.parseInt(args[0]);
			}catch(NumberFormatException e) {
				sender.sendMessage("Invalid number!");
				return true;
			}
			
			switch(action) {
			case 1:
				player.kickPlayer(ChatColor.RED + "You have been kicked!");
				break;
			case 2:
				Bukkit.getServer().getBanList(Type.NAME).addBan(player.getName(), ChatColor.DARK_RED + "You have been banned!", null, null);
				break;
			case 3:
				Calendar cal = Calendar.getInstance();
				cal.set(2022, 1, 1);
				Date date = cal.getTime();
				Bukkit.getServer().getBanList(Type.NAME).addBan(player.getName(), ChatColor.RED + "You have been banned temporantly!", date, null);
				break;
			default:
				return false;	
			}
			
		}
		return true;
	}
}
