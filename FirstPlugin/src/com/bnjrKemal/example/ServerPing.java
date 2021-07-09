package com.bnjrKemal.example;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerPing implements Listener {

	@EventHandler
	public void onPing(ServerListPingEvent e) throws IllegalArgumentException, UnsupportedOperationException, Exception {
//		File fileObject = new File("icon.png");
		e.setMaxPlayers(1999);
		e.setMotd(ChatColor.RED + "This is special server!" + "\n" + ChatColor.YELLOW + "Join us now!" );
//		e.setServerIcon(Bukkit.loadServerIcon(fileObject));
	}
}
