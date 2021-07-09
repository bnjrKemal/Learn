package com.bnjrKemal.First3;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Regions implements Listener {

	Cuboid cuboid = new Cuboid(
			new Location(Bukkit.getWorld("world"), 30, 4, 18),
			new Location(Bukkit.getWorld("world"), 19, 11, 7));
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		
		Player player = (Player) e.getPlayer();
		if(!player.isGlowing() && cuboid.containsLocation(e.getTo())) {
			player.setGlowing(true);
		} else if(player.isGlowing() && !cuboid.containsLocation(e.getTo())) {
			player.setGlowing(false);
		}
		
	}
	
	
}
