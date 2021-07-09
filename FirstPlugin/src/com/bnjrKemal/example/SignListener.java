package com.bnjrKemal.example;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;


public class SignListener implements Listener {

	@EventHandler
	public void onSignChange(SignChangeEvent e) {
		
		for(int i = 0; i < 4; i++) {
			String line = e.getLine(i);
			if(line != null && !line.equals("")) {
				e.setLine(i, ChatColor.translateAlternateColorCodes('&', line));
			}
		}
	}
}

