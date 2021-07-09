package com.bnjrKemal.minigames;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	/*
	 * 
	 * 7 Temmuz Mechanics#1-#4 & Kits#1-#2 & Teams & Reseting Maps
	 * 8 Temmuz Arena Signs & NPC Join & Bungee Compatibility & BungeeCord & Database
	 * 9 Temmuz Packets
	 * 10 Temmmuz Ending & Github & Çalýþma alaný oluþturma
	 * 11 Temmuz MOLA!
	 * 12 Temmmuz Ýngilizce öðrenime geçiþ (çýkýþ ->)
	 * 
	 */

	private static Main instance;
	
	@Override
	public void onEnable() {
		Main.instance = this;
		
		new Config(this);
		new Manager();
		
	}
	
	public static Main getInstance() { return instance; }
	
}
