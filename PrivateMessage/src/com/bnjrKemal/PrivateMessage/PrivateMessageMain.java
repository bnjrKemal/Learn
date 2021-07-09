package com.bnjrKemal.PrivateMessage;

import org.bukkit.plugin.java.JavaPlugin;

public class PrivateMessageMain extends JavaPlugin {

	public String language = this.getConfig().getString("language");

	MessageManager messageManager = new MessageManager(this);
	
	@Override
	public void onEnable() {

		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
				
		getCommand("message").setExecutor(new MessageCommand(this));
		getCommand("reply").setExecutor(new ReplyCommand(this));
	}
	
	@Override
	public void onDisable() {}
	
}
