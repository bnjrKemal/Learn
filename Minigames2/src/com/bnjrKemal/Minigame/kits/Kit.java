package com.bnjrKemal.Minigame.kits;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

import com.bnjrKemal.Minigame.Main;

public abstract class Kit implements Listener {

	protected UUID uuid;
	protected KitType Type;
	
	public Kit(UUID uuid, KitType Type) {
		this.uuid = uuid;
		this.Type = Type;
		
		Bukkit.getPluginManager().registerEvents(this, Main.getInstance());
	}
	
	public UUID getUUID() { return uuid; }
	public KitType getType() { return Type; }
	
	public abstract void onStart(Player player);
	
	public void remove() {
		HandlerList.unregisterAll(this);
	}
	
}
