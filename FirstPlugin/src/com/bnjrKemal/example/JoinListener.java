package com.bnjrKemal.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinListener implements Listener {

	private Main main;
	
	public JoinListener(Main main) {
		this.main = main;	
	}
	

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		main.bossBar.addPlayer(e.getPlayer());
		main.bossBar.setProgress(Math.random() * 1.1);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		main.bossBar.removePlayer(e.getPlayer());
	}
	
	
}
