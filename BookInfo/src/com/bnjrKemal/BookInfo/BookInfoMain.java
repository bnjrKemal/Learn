package com.bnjrKemal.BookInfo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class BookInfoMain extends JavaPlugin implements Listener {
	
	private YamlConfiguration yaml;
	private File file;
	
	public File getFile() { return file; }
	public YamlConfiguration getYAML() { return yaml; }
	
	@Override
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(this, this);

		try {
			initiateFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onDisable() {}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		

		if(args.length == 1) {
			if(args[0].equals("reload")) {
				yaml = YamlConfiguration.loadConfiguration(this.getFile()); //Kapanışta dosya kaydediyor.
				try { yaml.save(file); }catch(IOException e) {e.printStackTrace();}
				sender.sendMessage("[BookInfo] Reloadlandı.");
				return true;
			}
		}
		
		
		if(!(sender instanceof Player)) {
			System.out.println("Can be only use in-game!");
			return true;
		}
		
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("book")) {
			if (args.length != 1) {
				String whatargs = whatArgs();
				player.sendMessage(ChatColor.WHITE + "→" + ChatColor.RED + "/book [" + ChatColor.GREEN + whatargs + ChatColor.RED +"]");
				return true;
			}
			if(!this.getYAML().getKeys(false).contains(args[0])) {
				String whatargs = whatArgs();
				player.sendMessage(ChatColor.WHITE + "→" + ChatColor.RED + "/book [" + ChatColor.GREEN + whatargs + ChatColor.RED +"]");
				return true;
			}
			
			ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
			BookMeta bookmeta = (BookMeta) book.getItemMeta();
			bookmeta.setTitle(ChatColor.RED + args[0]);
			bookmeta.setAuthor(ChatColor.YELLOW + "My Server");
			bookmeta.addPage(createPage(args[0]));
			sender.sendMessage(createPage(args[0]));
			book.setItemMeta(bookmeta);
			player.getInventory().addItem(book);
			return true;
		}
		
		return true;
	}
	
	//METHODS
	
	public void initiateFiles() throws IOException {
		file = new File(Bukkit.getServer().getPluginManager().getPlugin("BookInfo").getDataFolder(), "custom.yml");
		if(!file.exists()) {
			Bukkit.getServer().getPluginManager().getPlugin("BookInfo").getDataFolder().mkdirs();
			file.createNewFile();
		}
		yaml = YamlConfiguration.loadConfiguration(file);
		if(yaml.getStringList("help").size() == 0) {
			List<String> list = new ArrayList<>();
			list.add("/plugins/BookInfo/custom.yml");
			list.add("gidip düzenleyebilirsin.");
			list.add(" ");
			list.add("by bnjrKemal");
			yaml.set("help", list);
			yaml.save(file);
		}
	}
	
	public String whatArgs() {
		StringBuilder result = new StringBuilder();
		int x = 0;
		for(String str : getYAML().getKeys(false)) {
			result.append(str);
			if(getYAML().getKeys(false).size() > ++x) result.append(", ");
		}
		return result.toString();
	}
	
	
	public String[] createPage(String str) {

		StringBuilder result = new StringBuilder();
		List<String> pageSave = new ArrayList<>();
		
		List<String> list = getYAML().getStringList(str);
				
		for(int line = 1; line <= list.size(); line++) {
			result.append(list.get(line - 1)).append("\n");
			if(Math.floorMod(line, 11) == 0) {
				pageSave.add(result.toString());
				result.setLength(0);
			}
		}		
		String[] strarray = new String[pageSave.size()];
		return pageSave.toArray(strarray);
	}
}
