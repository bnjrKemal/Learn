package com.bnjrKemal.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class InteractEvent implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEntityEvent e) {
			
		e.getRightClicked().addPassenger(e.getPlayer());
	}
}
