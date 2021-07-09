package com.bnjrKemal.PrivateMessage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import net.md_5.bungee.api.ChatColor;

public class ReplyCommand implements CommandExecutor {

	/*
	 * /reply <message>
	 */
	
	private PrivateMessageMain main;
	
	public ReplyCommand(PrivateMessageMain main) {
		this.main = main;
	}
		
	@Override
	public boolean onCommand(CommandSender target, Command cmd, String label, String[] args) {
		
		if(args.length < 1) {
			target.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString(main.language + ".short-arguments.reply")));
			return true;
		}
		
//		if(main.messageManager.getSender(target) == null) {
//			target.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString(main.language + ".you-havent-messaged-anyone-recently")));
//			return true;
//		}
		
		if(!(target instanceof ConsoleCommandSender)) {
			if(main.messageManager.recentlyMessaged.get(target) == null) {
				target.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString(main.language + ".that-player-has-logged-out")));
				return true;
			}
			
			if(!main.messageManager.recentlyMessaged.containsValue(target)) {
				target.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString(main.language + ".you-havent-messaged-anyone-recently")));
				return true;
			}
		}else if(target instanceof ConsoleCommandSender){
			target = (ConsoleCommandSender) target;
		}
		
		CommandSender sender = main.messageManager.getSender(target);
		main.messageManager.getMessage(target, sender, args);
		
		return true;
	}

}
