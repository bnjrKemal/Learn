package com.bnjrKemal.example;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class HoloListener implements CommandExecutor {
		
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			System.out.println("Oyun içi geçerli deðildir.");
			return true;
		}
		Player player = (Player) sender;
		
		String arg = String.join(" ", args);
		
		String[] holotexts = arg.split(";");
	
		for(int i = 0; i < holotexts.length; i++) {
		
			ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, i*-0.25, 0), EntityType.ARMOR_STAND);
			stand.setVisible(false); //gözle görülür
			stand.setGravity(false);
			stand.setInvulnerable(false); //zarar görmeme
			stand.setCustomNameVisible(true);
			
			stand.setCustomName(ChatColor.translateAlternateColorCodes('&', holotexts[i]));
		}
		return true;
	}
}
