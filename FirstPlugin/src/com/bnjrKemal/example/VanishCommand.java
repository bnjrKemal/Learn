package com.bnjrKemal.example;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public class VanishCommand implements CommandExecutor {

	List<Player> vanish = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
				
		if(!(sender instanceof Player)) { System.out.println("This command working only in the game."); return false; }

		Player player = (Player) sender;
		
		if(vanish.contains(player)) {
			vanish.remove(player);
			player.sendMessage(ChatColor.RED + "You aren't vanishing.");
		}else {
			vanish.add(player);
			player.sendMessage(ChatColor.RED + "You are vanishing.");
		}
		return false;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		for(Player loopplayer : Bukkit.getOnlinePlayers()) {
			if(vanish.contains(loopplayer)) {
				for(Player vanishing : Bukkit.getOnlinePlayers()) {
					vanishing.hidePlayer(loopplayer);
			}
		}
	}
	}
}