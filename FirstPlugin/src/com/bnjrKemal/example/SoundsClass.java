package com.bnjrKemal.example;

import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import net.md_5.bungee.api.ChatColor;

public class SoundsClass implements Listener {
	
	@EventHandler
	public void onSneak(PlayerToggleSneakEvent e) {
		
		if(e.isSneaking()) {
			float arg1 = (float) (Math.random() * 1.1);
			float arg2 = (float) (Math.random() * 2.1);
			Random random = new Random();
			int pick = random.nextInt(Sound.values().length);
			Sound sound = Sound.values()[pick];
			e.getPlayer().getWorld().playSound(e.getPlayer().getLocation(), sound, arg1, arg2);
			e.getPlayer().sendMessage(ChatColor.RED + "getLocation(): " + e.getPlayer().getLocale());
			e.getPlayer().sendMessage(ChatColor.GREEN + "Sound: " + sound);
			e.getPlayer().sendMessage(ChatColor.RED + "Volume: " + arg1);
			e.getPlayer().sendMessage(ChatColor.RED + "Pitch: " + arg2);
		}
		
	}
	
}
