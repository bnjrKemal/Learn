package com.bnjrKemal.PrivateMessage;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class MessageManager {

	private PrivateMessageMain main;

	public MessageManager(PrivateMessageMain main) {
		this.main = main;
	}
	
	public HashMap<CommandSender, CommandSender> recentlyMessaged = new HashMap<>();
	
	private StringBuilder messageAppend(String[] args) {
		StringBuilder message = new StringBuilder();
		for(int i = 0; i < args.length; i++) {
			message.append(args[i]).append(" ");
		}
		return message;
	}
	
	private String replaceMessage(String path, CommandSender sender, CommandSender target, StringBuilder message) {
		return path.replace("<sender>", sender.getName())
		.replace("<target>", target.getName())
		.replace("<message>", message.toString());
	}
	
	public CommandSender getSender(CommandSender target) {
		
		if(!recentlyMessaged.containsValue(target)) {
			return null;
		}
		
		for(CommandSender keyList : recentlyMessaged.keySet()) {
			if(recentlyMessaged.get(keyList) == null) {
				recentlyMessaged.remove(keyList);
				continue;
			}
			return recentlyMessaged.get(keyList);
		}
		return null;
	}
	
	public void getMessage(CommandSender sender, CommandSender target, String[] args) {
		String message = ChatColor.translateAlternateColorCodes('&', 
				replaceMessage(main.getConfig().getString(main.language + ".message-format"),
						sender, target, messageAppend(args)
						));
		sender.sendMessage(message);
		target.sendMessage(message);
		
		if(recentlyMessaged.containsKey(sender) && recentlyMessaged.get(sender) != target){
			recentlyMessaged.remove(sender);
		}
		
		if(recentlyMessaged.get(sender) == null) {
			recentlyMessaged.put(sender, target);
		}
	}
	
}
