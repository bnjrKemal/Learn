package com.bnjrKemal.example;

import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ProjectileEvent implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onHit(PlayerInteractEvent e) {
		
		if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if(e.getPlayer().getInventory().getItemInHand().equals(new ItemStack(Material.NETHERITE_SWORD))){
				e.getPlayer().launchProjectile(Egg.class, e.getPlayer().getLocation().getDirection());
			}	
		}
	}
}
