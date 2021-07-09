package com.bnjrKemal.example;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class MapModification implements Listener {

	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		if(e.getBlockPlaced().getType().equals(Material.BLACK_WOOL)) {
			e.getBlockPlaced().setType(Material.LAVA);
		}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		if(e.getBlock().getType().equals(Material.OBSIDIAN)) {
			e.getPlayer().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.APPLE));
		}
	}
	
}
