package com.bnjrKemal.First3;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class First3Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		getCommand("pushla").setExecutor(new PushCommand());
		getCommand("broadcastx").setExecutor(new BroadcastCommand());
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getPluginManager().registerEvents(new Regions(), this);		
	}
		
	@Override
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onServerBroadcast(ServerBroadcastEvent e) {
		System.out.println("Event run!");
		e.setCancelled(true);
	}
	
}
