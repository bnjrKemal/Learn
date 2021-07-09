package com.bnjrKemal.RankSystem;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class RankListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if(!e.getPlayer().hasPlayedBefore()) {
			RankSystemMain.getFileManager().setRank(e.getPlayer(), Rank.GUEST);
		}
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player player = e.getPlayer();
		Rank rank = RankSystemMain.getFileManager().getRank(player);
		e.setCancelled(true);
		
		for(Player onlinePlayers : e.getRecipients()) {
			onlinePlayers.sendMessage(rank.getColor() + rank.getName() + " " + player.getName() + ": " + e.getMessage());
		}
	}
}
