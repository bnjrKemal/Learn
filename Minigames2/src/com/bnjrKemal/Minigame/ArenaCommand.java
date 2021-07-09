package com.bnjrKemal.Minigame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.bnjrKemal.Minigame.kits.KitsGUI;
import com.bnjrKemal.Minigame.team.TeamsGUI;

import net.md_5.bungee.api.ChatColor;

public class ArenaCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			System.out.println("You can't use this from the console!");
			return true;
		}
		
		Player player = (Player) sender;
		
		if(args.length == 1 && args[0].equalsIgnoreCase("team")) {
			if(!Manager.isPlaying(player)) {
				player.sendMessage("You aren't in an arena!");
				return true;
			}
			if(!(Manager.getArena(player).getState().equals(GameState.RECRUTING) ||
					Manager.getArena(player).getState().equals(GameState.COUNTDOWN))) {
				player.sendMessage(ChatColor.RED + "You can't use this right now!");
				return true;
			}
			new TeamsGUI(player);
		} else if(args.length == 1 && args[0].equalsIgnoreCase("kit")) {
			if(!Manager.isPlaying(player)) {
				player.sendMessage("You aren't in an arena!");
				return true;
			}
			if(!(Manager.getArena(player).getState().equals(GameState.RECRUTING) ||
					Manager.getArena(player).getState().equals(GameState.COUNTDOWN))) {
				player.sendMessage(ChatColor.RED + "You can't use this right now!");
				return true;
			}
			new KitsGUI(player);
		} else if(args.length == 1 && args[0].equalsIgnoreCase("list")) {
			player.sendMessage(ChatColor.GREEN + "These are the available arenas: ");
			for(Arena arena : Manager.getArenas()) {
				player.sendMessage(ChatColor.DARK_GREEN + "- " + arena.getID());
			}
		} else if(args.length == 1 && args[0].equalsIgnoreCase("join")) {
			if(!Config.getArenaList().contains(args[1])) {
				player.sendMessage(ChatColor.RED + "Invalid arena! See /arena list for avaliable arenas.");
				return true;
			}
			if(!Manager.isRecruiting(args[1])){
				player.sendMessage(ChatColor.RED + "You can't join this game right now!");
				return true;
			}
			if(Manager.getArena(args[1]) == null) {
				player.sendMessage(ChatColor.RED + "You can't join this game right now!");
				return true;
			}
			Manager.getArena(args[1]).addPlayer(player);
			player.sendMessage(ChatColor.GREEN + "You are now playing in Arena " + args[1].toUpperCase() + "!");
		} else if(args.length == 1 && args[0].equalsIgnoreCase("leave")) {
			if (!Manager.isPlaying(player)){
				player.sendMessage(ChatColor.RED + "You can't join this game right now and wait please. Then try again after!");
				return true;
			}
			Manager.getArena(player).removePlayer(player);
			player.sendMessage(ChatColor.GREEN + "You left the arena!");
		} else {
			player.sendMessage(ChatColor.RED + "Invalid usage - these are the options:");
			player.sendMessage(ChatColor.RED + "- /arena list");
			player.sendMessage(ChatColor.RED + "- /arena join [id]");
			player.sendMessage(ChatColor.RED + "- /arena leave");
		}
		return true;
	}

	
	
}
