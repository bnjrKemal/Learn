package com.bnjrKemal.ScoreBoard;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ScoreBoardMain extends JavaPlugin {

	ScoreBoardListener scoreboardlistener = new ScoreBoardListener(this);
	HashMap<Player, Integer> blocksBroken;
	
	
	@Override
	public void onEnable() {
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
		
		blocksBroken = new HashMap<>();
		
		Bukkit.getPluginManager().registerEvents(new ScoreBoardListener(this), this);
		
		for(Player loopplayer : Bukkit.getOnlinePlayers()) {
			loopplayer.setScoreboard(scoreboardlistener.ScoreBoard(loopplayer));
		}
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
