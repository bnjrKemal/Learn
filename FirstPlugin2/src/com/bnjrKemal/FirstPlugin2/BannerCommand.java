package com.bnjrKemal.FirstPlugin2;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;

public class BannerCommand implements CommandExecutor {

	public static void main(String[] args) {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(!(sender instanceof Player)) {
			System.out.println("Bu komut sadece oyun içinde geçerlidir.");
			return true;
		}
		
		Player player = (Player) sender;
		
		/*
		 * /banner <color> <pattern>
		 */
		
		if(args.length != 2) {
			player.sendMessage(ChatColor.RED + "Kullaným: /banner <color> <pattern>");
			return true;
		}
				
		if(hasColor(args[0]) == null) {
			player.sendMessage(ChatColor.RED + "Böyle bir renk yok. Liste: " + listDyeColor());
			return true;
		}
		
		if(hasPattern(args[1]) == null) {
			player.sendMessage(ChatColor.RED + "Böyle bir pattern yok. Liste: " + listPatternType());
			return true;
		}
		
		if(!player.getInventory().getItemInMainHand().getType().toString().contains("BANNER")){
			player.sendMessage(ChatColor.RED + "Eline banner almalýsýn.");
			return true;
		}
		
		ItemStack item = player.getInventory().getItemInMainHand();
		BannerMeta meta = (BannerMeta) item.getItemMeta();
		
		DyeColor color = (DyeColor) hasColor(args[0]);
		PatternType pattern = (PatternType) hasPattern(args[1]);
		
		((BannerMeta) meta).addPattern(new Pattern(color, pattern));
		
		item.setItemMeta(((BannerMeta) meta));
		player.sendMessage(ChatColor.GREEN + "Banner baþarýyla deðiþtirildi.");
		
		return true;
	}
	
	private String listPatternType() {
		StringBuilder result = new StringBuilder();
		
		for(PatternType str : PatternType.values()) {
			result.append(str).append(" ");
		}
		return result.toString();
	}

	private String listDyeColor() {
		StringBuilder result = new StringBuilder();
		
		for(DyeColor str : DyeColor.values()) {
			result.append(str).append(" ");
		}
		return result.toString();
	}

	public DyeColor hasColor(String str) {
		for(DyeColor color : DyeColor.values()) {
			if (str.equalsIgnoreCase(color.toString())) {
				return color;
			}
		}
		return null;
	}
	
	public PatternType hasPattern(String str) {
		for(PatternType pattern : PatternType.values()) {
			if(str.equalsIgnoreCase(pattern.toString())){
				return pattern;
			}
		}
		return null;
	}

}
