package com.bnjrKemal.First3;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ServerBroadcastEvent extends Event implements Cancellable {

	private static final HandlerList HANDLERS = new HandlerList();
	
	private final CommandSender player;
	private final String message;
	
	private boolean cancelled;
	
	public ServerBroadcastEvent(CommandSender sender, String message) {
		this.player = sender;
		this.message = message;
	}
	
	public CommandSender getPlayer() {
		return player;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}
	
	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean result) {
		this.cancelled = result;
	}
}
