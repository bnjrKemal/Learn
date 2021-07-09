package com.bnjrKemal.Minigame;

import org.bukkit.scheduler.BukkitRunnable;

import net.md_5.bungee.api.ChatColor;

public class Countdown extends BukkitRunnable{

	private Arena arena;
	private int seconds;
	
	public Countdown(Arena arena) {
		this.arena = arena;
		this.seconds = Config.getCountdownSeconds();
	}

	public void begin() {
		arena.setState(GameState.COUNTDOWN);
		this.runTaskTimer(Main.getInstance(), 0, 20);
		
		arena.updateSign(ChatColor.WHITE + "ARENA " + arena.getID(), ChatColor.BLUE + "COUNTDOWN", " ", ChatColor.GRAY + "Click to join!");
	}
	
	@Override
	public void run() {
		if(seconds == 0) {
			cancel();
			arena.start();
		}
		
		if(seconds % 30 == 0 && seconds <= 10) {
			arena.sendMessage(ChatColor.AQUA + "Game will start in " + seconds + " seconds.");
		}
		
		if(arena.getPlayers().size() < Config.getRequiredPlayers()) {
			cancel();
			arena.setState(GameState.RECRUTING);
			arena.sendMessage(ChatColor.RED + "There are too few players. Countdown stopped.");
			arena.updateSign(ChatColor.WHITE + "Arena " + arena.getID(), ChatColor.GOLD + "RECRUITING", " ", ChatColor.GRAY + "Click to join!");
			return;
		}
		
		seconds--;
	}
	
}
