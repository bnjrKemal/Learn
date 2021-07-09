package com.bnjrKemal.FirstPlugin2;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIManager {
	
	final String guiname = ChatColor.DARK_GRAY + "Example GUI";
	
	@SuppressWarnings("unlikely-arg-type")
	public Inventory openGUI(Player player){
		
		//Beginning
		Inventory gui = Bukkit.createInventory(null, 54, guiname);
		
		//Lore
		
		List<String> enableLore = new ArrayList<>();
		enableLore.add(ChatColor.GRAY + "Click me for the best");
		enableLore.add(ChatColor.GRAY + "time of your life!");
		
		List<String> disableLore = new ArrayList<>();
		disableLore.add(ChatColor.GRAY + "Click me for the worst");
		disableLore.add(ChatColor.GRAY + "time of your life!");
		
		List<String> launchLore = new ArrayList<>();
		launchLore.add(ChatColor.GRAY + "Click to be launched");
		launchLore.add(ChatColor.GRAY + "up by 200 blocks!");
		
		//ItemStack
		ItemStack toggle;
		ItemMeta toggleMeta;
		
		if(player.getInventory().getChestplate() !=null
			&& player.getInventory().getChestplate().equals(Material.ELYTRA)){
				
			toggle = new ItemStack(Material.REDSTONE);
			toggleMeta = toggle.getItemMeta();
			toggleMeta.setDisplayName(ChatColor.RED + "Disable Elytra");
			toggleMeta.setLore(enableLore);
		
		}else {
			
			toggle = new ItemStack(Material.EMERALD);
			toggleMeta = toggle.getItemMeta();
			toggleMeta.setDisplayName(ChatColor.GREEN + "Enable Elytra");
			toggleMeta.setLore(disableLore);
			
		}
		
		toggle.setItemMeta(toggleMeta);
		
		ItemStack launch = new ItemStack(Material.COBWEB);
		ItemMeta launchMeta = launch.getItemMeta();
		launchMeta.setDisplayName(ChatColor.DARK_PURPLE + "Launch into to air!");
		launchMeta.setLore(launchLore);
		launch.setItemMeta(launchMeta);
		
		//Item settings
		
		gui.setItem(13, toggle);
		gui.setItem(31, launch);

		//Final
		
		player.openInventory(gui);
		return gui;
	}

}
