package com.bnjrKemal.FirstPlugin2;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import net.md_5.bungee.api.ChatColor;

public class GUIListener implements Listener {

	int x = 0;
	
	private FirstPlugin2Main main;
	public GUIListener(FirstPlugin2Main main) {
		this.main = main;
	}

	@EventHandler
	public void onClickInTheGUI(final InventoryClickEvent e) {

		x++;
		if(Math.floorMod(x, 2) == 0) return;
		
		Player player = (Player) e.getWhoClicked();

		System.out.println("1");
		
		if(!e.getView().getTitle().equals(main.gui.guiname)) return;

		System.out.println("2");
		
		if(e.getCurrentItem() == null) return;
		
		System.out.println("3");
		
		e.setCancelled(true);
		
		System.out.println("4");
		
		switch(e.getCurrentItem().getType()) {
			case COBWEB:
				player.setVelocity(new Vector(0, 200, 0));
				player.sendMessage("Launched into the air!");
				break;
			case EMERALD: //default
				if(player.getInventory().getChestplate() != null) {
					main.chestSlot.put(player, player.getInventory().getChestplate().getType());
				}
				player.getInventory().setChestplate(new ItemStack(Material.ELYTRA));
				player.sendMessage(ChatColor.GREEN + "Enabled Elytra!");
				break;
			case REDSTONE:
				if(main.chestSlot.containsKey(player)) {
					player.getInventory().setChestplate(new ItemStack(main.chestSlot.get(player)));
				} else {
					player.getInventory().setChestplate(null);
				}
				player.sendMessage(ChatColor.RED + "Disabled Elytra!");
				break;
			default:
				return;
		}
		player.closeInventory();
		
	}
	
}
