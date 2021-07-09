package com.bnjrKemal.PrivateMessage;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MessageCommand implements CommandExecutor {

	/*
	 * /message <player> <message>
	 */
	
	private PrivateMessageMain main;
	
	public MessageCommand(PrivateMessageMain main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(args.length < 2) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString(main.language + ".short-arguments.message")));
			return true;
		}
		
		if(Bukkit.getPlayerExact(args[0]) == null) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString(main.language + ".player-not-found")));
			return true;
		}
		
		CommandSender target = (CommandSender) Bukkit.getPlayerExact(args[0]);
					
        String[] deletedfirstelementofargs = args;
        deletedfirstelementofargs = Arrays.copyOfRange(args, 1, args.length);
		
		main.messageManager.getMessage(sender, target, deletedfirstelementofargs);
		
		return true;
	}
}
