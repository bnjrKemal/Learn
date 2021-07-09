package com.bnjrKemal.RankSystem;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class FileManager {
	
	private File file;
	private YamlConfiguration config;
	
	public FileManager(RankSystemMain main) {
		file = new File(Bukkit.getServer().getPluginManager().getPlugin("RankSystem").getDataFolder(), "data.yml");
		try {
			Bukkit.getServer().getPluginManager().getPlugin("RankSystem").getDataFolder().mkdirs();
			file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		config = YamlConfiguration.loadConfiguration(file);
	}
	
	public void setRank(Player player, Rank rank) {
		config.set(player.getUniqueId().toString(), rank.name());
		save();
	}

	public void setRank(UUID uuid, Rank rank) {
		config.set(uuid.toString(), rank.name());
		save();
	}
	
	public Rank getRank(Player player) {
		return Rank.valueOf(config.getString(player.getUniqueId().toString()));
	}
	
	private void save() {
		try { config.save(file); } catch(IOException e) { e.printStackTrace(); }
	}
	
}
