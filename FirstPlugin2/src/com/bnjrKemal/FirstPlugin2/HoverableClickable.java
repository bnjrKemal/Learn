package com.bnjrKemal.FirstPlugin2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class HoverableClickable implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		TextComponent message = new TextComponent("Hover or click for ");
		message.setColor(ChatColor.AQUA);
		
		ComponentBuilder cb = new ComponentBuilder(
				"Twitter link: ").bold(true).color(ChatColor.RED)
				.append("twitter.com/test").color(ChatColor.GREEN);
		
		TextComponent twitter = new TextComponent("Twitter");
		twitter.setColor(ChatColor.AQUA);
		twitter.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, cb.create()));
		twitter.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.twitter.com/test"));
		
		message.addExtra(twitter);
		player.spigot().sendMessage(twitter);
		
		return false;
	}

}
