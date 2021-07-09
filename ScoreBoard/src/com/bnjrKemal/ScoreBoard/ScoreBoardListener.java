package com.bnjrKemal.ScoreBoard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScoreBoardListener implements Listener {

	private ScoreBoardMain main;
	
	public ScoreBoardListener(ScoreBoardMain main) {
		this.main = main;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		player.setScoreboard(ScoreBoard(player));
		
		main.blocksBroken.put(player, 0);
		
		for(Player loopplayer : Bukkit.getOnlinePlayers()) {
			loopplayer.setScoreboard(ScoreBoard(loopplayer));
		}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Player player = e.getPlayer();
		int amount = main.blocksBroken.get(player);
		main.blocksBroken.put(player, amount + 1);
		player.getScoreboard().getTeam("blocksBroken").setSuffix(main.blocksBroken.get(player) + "");;
	}
	
	public Scoreboard ScoreBoard(Player player) {
		
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
		
		@SuppressWarnings("deprecation")
		Objective obj = board.registerNewObjective("test", "dummy");
		obj.setDisplayName(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("scoreboard.displayname")));
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);

		int x = -10;
		for(String list : main.getConfig().getStringList("scoreboard.list")) {
			list = list.replaceAll("@player", player.getName())
				.replaceAll("@online", main.getServer().getOnlinePlayers().size() + "");
			obj.getScore(ChatColor.translateAlternateColorCodes('&', list)).setScore(x);
			x--;
		}
		
		
		Team blocksBroken = board.registerNewTeam("blocksBroken");
		blocksBroken.addEntry(ChatColor.AQUA.toString());
		blocksBroken.setPrefix(ChatColor.YELLOW + "Kýrýlan Blok: ");
		blocksBroken.setSuffix(main.blocksBroken.get(player) + "");
		obj.getScore(ChatColor.AQUA.toString()).setScore(x--);
		
		
		return board;
	}
	
}
