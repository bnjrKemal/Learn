package com.bnjrKemal.Minigame;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	private static Main instance;
	
	@Override
	public void onEnable() {
		Main.instance = this;
		
		new Config(this);
		
		new Manager();
		
		getCommand("arena").setExecutor(new ArenaCommand());
		
		Bukkit.getPluginManager().registerEvents(new GameListener(), this);
	}
	
	@Override
	public void onDisable() {
		for(Arena arena : Manager.getArenas()) {
			arena.getNPC().remove();
		}
	}
	
	public static Main getInstance() { return instance; }
	
}
