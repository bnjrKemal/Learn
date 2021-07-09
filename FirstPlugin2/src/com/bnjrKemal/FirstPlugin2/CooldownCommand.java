package com.bnjrKemal.FirstPlugin2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CooldownCommand implements CommandExecutor {

	private FirstPlugin2Main main;
	
	public CooldownCommand(FirstPlugin2Main main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
				
		if(main.cooldown.containsKey(player) && main.cooldown.get(player) > System.currentTimeMillis()) {
			long longRemaining = main.cooldown.get(player) - System.currentTimeMillis();
			int intRemaining = (int) longRemaining / 1000;
			player.sendMessage(ChatColor.RED + (intRemaining + " saniye bekle"));
			return true;
		} 
		main.cooldown.put(player, System.currentTimeMillis() + (10 * 1000));
		
		return false;
	}

}
