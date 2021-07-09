package com.bnjrKemal.minigames;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {

	private static Main main;
	
	public Config(Main main) {
		Config.main = main;
		
		main.getConfig().options().copyDefaults();
		main.saveDefaultConfig();
		
	}
	
	public static FileConfiguration getConfig() {
		return main.getConfig();
	}

	public static int getReqiredPlayers() {
		return getConfig().getInt("required-players");
	}
	
	public static int getCountdownSeconds() {
		return getConfig().getInt("countdown-seconds");
	}
	
	public static Location getLobbySpawn() {
		return new Location(Bukkit.getWorld(getConfig().getString("lobby.world")),
				getConfig().getInt("lobby.x"),
				getConfig().getInt("lobby.y"),
				getConfig().getInt("lobby.z"),
				getConfig().getInt("lobby.pitch"),
				getConfig().getInt("lobby.yaw"));
	}
	
	public static Location getArenaSpawn(int id) {
		return new Location(Bukkit.getWorld(getConfig().getString("arenas. " + id + ".world")),
				getConfig().getInt("arenas. " + id + ".x"),
				getConfig().getInt("arenas. " + id + ".y"),
				getConfig().getInt("arenas. " + id + ".z"),
				getConfig().getInt("arenas. " + id + ".pitch"),
				getConfig().getInt("arenas. " + id + ".yaw"));
	}
	
	public static int getArenaAmount() {
		return main.getConfig().getConfigurationSection("arenas.").getKeys(false).size();
	}
	
}
