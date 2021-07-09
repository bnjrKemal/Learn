package com.bnjrKemal.Minigame;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

import com.bnjrKemal.Minigame.kits.KitType;

public class Manager {

	private static ArrayList<Arena> arenas;
	
	public Manager() {
		arenas = new ArrayList<>();
		
		for(String arenaId : Config.getArenaList()) {
			arenas.add(new Arena(arenaId.toUpperCase()));
		}
	}
	
	public static List<Arena> getArenas() { return arenas; }

	public static boolean isPlaying(Player player) {
		for(Arena arena : arenas) {
			if(arena.getPlayers().contains(player.getUniqueId())) {
				return true;
			}
		}
		return false;
	}
	
	public static Arena getArena(Player player) {
		for(Arena arena: arenas) {
			if(arena.getPlayers().contains(player.getUniqueId())) {
				return arena;
			}
		}
		return null;
	}
	
	public static Arena getArena(String id) {
		for(Arena arena : arenas) {
			if(arena.getID().equals(id.toUpperCase())) {
				return arena;
			}
		}
		return null;
	}
	
	public static boolean isRecruiting(String id) {
		return getArena(id.toUpperCase()).getState() == GameState.RECRUTING;
	}

	public static KitType getKit(Player player) {
		if(isPlaying(player)) {
			if (getArena(player).getKits().containsKey(player.getUniqueId())) {
				return getArena(player).getKits().get(player.getUniqueId()).getType();
			}
		}
		return null;
	}
	
	public static boolean hasKit(Player player) {
		if(isPlaying(player)) {
			if (getArena(player).getKits().containsKey(player.getUniqueId())) {
				return true;
			}
		}
		return false;
	}

	public static boolean isArenaWorld(World world) {
		for(Arena arena : arenas) {
			if(arena.getSpawn().getWorld().getName().contentEquals(world.getName())) {
				return true;
			}
		}
		return false;
	}
	
	public static Arena getArena(World world) {
		for(Arena arena : arenas) {
			if(arena.getSpawn().getWorld().getName().contentEquals(world.getName())) {
				return arena;
			}
		}
		return null;
	}

	public static boolean isNPC(Entity villager) {
		if(villager.getType().equals(EntityType.VILLAGER)) {
			for(Arena arena : arenas) {
				if(arena.getNPC().equals((Villager) villager)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static Arena getArena(Entity villager) {
		if(villager.getType().equals(EntityType.VILLAGER)) {
			for(Arena arena : arenas) {
				if(arena.getNPC().equals((Villager) villager)) {
					return arena;
				}
			}
		}
		return null;
	}
	
}
