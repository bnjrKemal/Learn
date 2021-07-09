package com.bnjrKemal.example;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class TargetBlockChange implements Listener {

	@EventHandler
	public void onSneak(PlayerInteractEvent e) {
		if(e.getPlayer().isSneaking() && e.getPlayer().getTargetBlockExact(5) != null) {
			e.getPlayer().sendBlockChange(e.getPlayer().getTargetBlockExact(5).getLocation(), Material.AIR.createBlockData());
		}
	}
	
}
