package com.bnjrKemal.FirstPlugin2;

import java.util.HashMap;
import com.bnjrKemal.AddRecipe;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;

import world.bentobox.bentobox.BentoBox;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin2Main extends JavaPlugin{

	GUIManager gui = new GUIManager();
	public HashMap<Player, Material> chestSlot = new HashMap<>();
	
	
	@Override
	public void onEnable() {
		getCommand("banner").setExecutor(new BannerCommand());
		Bukkit.getPluginManager().registerEvents(new MapListener(), this);
		getCommand("cooldown").setExecutor(new CooldownCommand(this));
		getCommand("menu").setExecutor(new GUICommand(this));
		Bukkit.getPluginManager().registerEvents(new GUIListener(this), this);
		Bukkit.getPluginManager().registerEvents(new AddRecipe(this), this);
		getCommand("hover").setExecutor(new HoverableClickable());
		
		if(getAPI() == null) {
			System.out.println("WorldEdit was found!");
		}else {
			System.out.println("WorldEdit was not found! Plugin disabled!");
			Bukkit.getPluginManager().disablePlugin(this);
		}
		
	}
	
	public void onTry(Player player) {
		
		getAPI().createEditSession(player);
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public HashMap<Player, Long> cooldown = new HashMap<>();
	
	public WorldEditPlugin getAPI() {
		Plugin worldEditPlugin = Bukkit.getPluginManager().getPlugin("WorldEdit");
		if(worldEditPlugin instanceof WorldEditPlugin) return (WorldEditPlugin) worldEditPlugin;
		return null;
	}
	
	public BentoBox getBentoBoxAPI() {
		Plugin plugin = Bukkit.getPluginManager().getPlugin("BentoBox");
		if(plugin instanceof BentoBox) return (BentoBox) plugin;
		return null;
	}
	
}
