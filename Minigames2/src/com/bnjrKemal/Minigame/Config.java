package com.bnjrKemal.Minigame;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;

public class Config {

	private static Main main;
	
	public Config(Main main) {
		Config.main = main;
		main.getConfig().options().copyDefaults();
		main.saveDefaultConfig();
	}
	
	public static int getRequiredPlayers() { return main.getConfig().getInt("required-players"); }

	public static int getCountdownSeconds() { return main.getConfig().getInt("countdown-seconds"); }
	
	public static Location getLobbySpawn() {
		return new Location(
				Bukkit.getWorld(main.getConfig().getString("lobby-spawn.world")),
				main.getConfig().getDouble("lobby-spawn.x"),
				main.getConfig().getDouble("lobby-spawn.y"),
				main.getConfig().getDouble("lobby-spawn.z"),
				main.getConfig().getInt("lobby-spawn.pitch"),
				main.getConfig().getInt("lobby-spawn.yaw"));
	}
	
	public static Location getArenaSpawn(String id) {
		World world = Bukkit.createWorld(new WorldCreator(main.getConfig().getString("arenas." + id + ".spawn.world")));
		world.setAutoSave(false);
		
		return new Location(
				world,
				main.getConfig().getDouble("arenas." + id + ".spawn.x"),
				main.getConfig().getDouble("arenas." + id + ".spawn.y"),
				main.getConfig().getDouble("arenas." + id + ".spawn.z"),
				main.getConfig().getInt("arenas." + id + ".spawn.yaw"),
				main.getConfig().getInt("arenas." + id + ".spawn.pitch"));
	}
	
	public static Set<String> getArenaList() {
		return main.getConfig().getConfigurationSection("arenas.").getKeys(false);
	}
	
	public static Location getArenaSign(String id) {
		return new Location(
				Bukkit.getWorld(main.getConfig().getString("arenas." + id + ".sign.world")),
				main.getConfig().getDouble("arenas." + id + ".sign.x"),
				main.getConfig().getDouble("arenas." + id + ".sign.y"),
				main.getConfig().getDouble("arenas." + id + ".sign.z"));
	}
	
	public static String isSign(Location location) {
		for(String arena : getArenaList()) {
			if(getArenaSign(arena).equals(location)) {
				return arena;
			}
		}
		return null;
	}
	
	public static Location getNPCSpawn(String id) {
		return new Location(
				Bukkit.getWorld(main.getConfig().getString("arenas." + id + ".npc.world")),
				main.getConfig().getDouble("arenas." + id + ".npc.x"),
				main.getConfig().getDouble("arenas." + id + ".npc.y"),
				main.getConfig().getDouble("arenas." + id + ".npc.z"),
				main.getConfig().getInt("arenas." + id + ".npc.yaw"),
				main.getConfig().getInt("arenas." + id + ".npc.pitch"));
	}
	
}
