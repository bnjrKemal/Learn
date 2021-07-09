package com.bnjrKemal.example;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

@SuppressWarnings("deprecation")
public class SkullCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			System.out.println("Bu komut sadece oyun içinde geçerlidir.");
			return true;
		}
		
		if(args.length != 1) {
			sender.sendMessage(ChatColor.RED + "Usage: /skull <player>");
			return true;
		}
		Player player = (Player) sender;
		Player owner = (Player) Bukkit.getPlayerExact(args[0]);
		ItemStack skull = new ItemStack(Material.LEGACY_SKULL_ITEM, 1, (byte) SkullType.PLAYER.ordinal());
		SkullMeta meta = (SkullMeta) skull.getItemMeta();
		meta.setOwner(owner.getName());
		skull.setItemMeta(meta);
		
		player.getInventory().addItem(skull);
		player.sendMessage(ChatColor.YELLOW + owner.getName() + ChatColor.GREEN + "'nin kafasý verildi.");
		
		return false;
	}

}
