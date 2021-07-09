package com.bnjrKemal.example;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class RunnableServer implements Listener {
	
	static int integer = 0;
	
	private Main main;
	
	public RunnableServer(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onClickwithDiamonds(PlayerInteractEvent e) {
		
		if(e.getHand().equals(EquipmentSlot.OFF_HAND)) return;
		
		if(!e.getPlayer().getInventory().getItemInMainHand().equals(new ItemStack(Material.DIAMOND))) return;
		
		integer += 1;
		
		Bukkit.getScheduler().runTaskTimer(main, new Runnable() {

			@Override
			public void run() {
				System.out.println(e.getPlayer().getName() + " elindeki elmasýyla bir yere týkladý. Tekrarlýyorum.");
			}
			
		}, 100L, 100L);
		
		if(Math.floorMod(integer, 2) == 0) {
			Bukkit.getScheduler().cancelTasks(main);
			System.out.println("Donduruldu.");
		}
		
	}
	
	
}
