package com.bnjrKemal.CustomYML;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;

public class TestCommand implements CommandExecutor {

	private CustomYMLMain main;
	
	public TestCommand(CustomYMLMain main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
		if(args.length != 1) {
			sender.sendMessage("/test reload\n" + "/test reset");
			return true;
		}
		
		if((!args[0].equals("reload")
				&& !args[0].equals("reset"))) {
			sender.sendMessage("/test reload\n" + "/test reset");
			return true;
		}
		
		switch(args[0]) {
		
		case "reset":
			main.getYML().createSection("Test");
			main.getYML().createSection("Test2");
			main.getYML().set("string", "String");
			main.getYML().set("int", 5);
			main.getYML().set("double", 0.6);
			main.getYML().set("long", 1000E10);	
			try {main.getYML().save(main.getFile());} catch (IOException e) {e.printStackTrace();}
			sender.sendMessage("Resetlendi.");
			break;
			
		case "reload":
			YamlConfiguration yaml = YamlConfiguration.loadConfiguration(main.getFile());
			try {yaml.save(main.getFile());} catch (IOException e) {e.printStackTrace();}
			String str = (String) yaml.get("string");
			sender.sendMessage(str);
			break;
			
		default:
			return true;
		
		}
		return true;
	}
}
