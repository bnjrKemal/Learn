package com.bnjrKemal.FirstPlugin2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GUICommand implements CommandExecutor {
	
	private FirstPlugin2Main main;
	public GUICommand(FirstPlugin2Main main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) return true;
		
		long mil = System.currentTimeMillis();
		
		main.gui.openGUI((Player) sender);

		long now = System.currentTimeMillis() - mil;
		
		sender.sendMessage(now + "ms");
		
		return false;
	}

}
