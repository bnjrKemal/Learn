package com.bnjrKemal.RankSystem;

import org.bukkit.ChatColor;

public enum Rank {

	OWNER("Owner", ChatColor.DARK_RED),
	ADMIN("Admin", ChatColor.RED),
	MEMBER("Member", ChatColor.YELLOW),
	GUEST("Guest", ChatColor.GRAY);
	
	private String name;
	private ChatColor color;
	
	private Rank(String name, ChatColor color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() { return name; }
	public ChatColor getColor() { return color; }
	
}
