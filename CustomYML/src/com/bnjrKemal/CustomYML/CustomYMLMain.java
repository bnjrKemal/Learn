package com.bnjrKemal.CustomYML;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomYMLMain extends JavaPlugin {

	private File file;
	private YamlConfiguration yaml;
	
	@Override
	public void onEnable() {
		
		getCommand("test").setExecutor(new TestCommand(this));
		
		try {
			initiateFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File getFile() { return file; }
	public YamlConfiguration getYML() { return yaml; }
	
	public void initiateFiles() throws IOException {
		file = new File(Bukkit.getServer().getPluginManager().getPlugin("CustomYML").getDataFolder(), "test.yml");
		
		if(!file.exists()) {
			Bukkit.getServer().getPluginManager().getPlugin("CustomYML").getDataFolder().mkdirs();
			file.createNewFile();
		}
		yaml = YamlConfiguration.loadConfiguration(file);
	}
	
	@Override
	public void onDisable() {
		
		YamlConfiguration yaml = getYML();
		yaml = YamlConfiguration.loadConfiguration(getFile());
		try {
			yaml.save(getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
