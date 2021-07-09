package com.bnjrKemal.Minigame.kits;

import org.bukkit.Material;
import org.bukkit.ChatColor;

public enum KitType {

	MINER(ChatColor.GOLD + "Miner", Material.DIAMOND_PICKAXE, new String[] {"The best Miner kits!"}),
	FIGHTER(ChatColor.GOLD + "Fighter", Material.DIAMOND_SWORD, new String[] {"The best Fighter kits!"});
	
	private String display;
	private Material material;
	private String[] description;
	
	private KitType(String display, Material material, String[] description) {
		this.display = display;
		this.material = material;
		this.description = description;
	}
	
	public String getDisplay() { return display; }
	public Material getMaterial() { return material; }
	public String[] getDescription() { return description; }
	
}
