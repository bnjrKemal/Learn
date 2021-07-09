package com.bnjrKemal.example;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

import net.md_5.bungee.api.ChatColor;

public class Toggling implements Listener {

	ArrayList<Player> enabled = new ArrayList<>();
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		
		Player player = e.getPlayer();
		
		if(e.getHand().equals(EquipmentSlot.OFF_HAND)) return;
		
		if(player.getInventory().getItemInMainHand().getType().equals(Material.NETHER_STAR)) {
			if(enabled.contains(player)) { //IS ENABLED
				player.sendMessage(ChatColor.GREEN + "Chat enabled!");
				enabled.remove(player);
			} else { //NOT ENABLED
				player.sendMessage(ChatColor.RED + "Chat disabled!");
				enabled.add(player);
			}
		}
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if(enabled.contains(e.getPlayer())) {
			e.getPlayer().sendMessage(ChatColor.RED + "You cannot chatting now!");
			e.setCancelled(true);
		}
	}
	
}
