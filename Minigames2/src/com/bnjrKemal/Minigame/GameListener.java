package com.bnjrKemal.Minigame;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.inventory.EquipmentSlot;

import com.bnjrKemal.Minigame.kits.KitType;
import com.bnjrKemal.Minigame.team.Team;

import net.md_5.bungee.api.ChatColor;

public class GameListener implements Listener {

	@EventHandler
	public void onEntityInteract(PlayerInteractAtEntityEvent e) {
		Player player = e.getPlayer();
		if(e.getHand().equals(EquipmentSlot.HAND) && Manager.isNPC((Villager) e.getRightClicked())) {
			Arena arena = Manager.getArena(e.getRightClicked());
			if(!(arena.getState().equals(GameState.RECRUTING) ||
					arena.getState().equals(GameState.COUNTDOWN))) {
				player.sendMessage(ChatColor.RED + "This game is currently live!");
				return;
			}
			if(arena.getPlayers().contains(player.getUniqueId())) {
				player.sendMessage(ChatColor.RED + "You are already in this game!");
				return;
			}
			arena.addPlayer(player);				
		}
			
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@EventHandler
	public void onSignClick(PlayerInteractEvent e) {
		if(e.hasBlock() && e.getClickedBlock().getType().equals(Material.OAK_WALL_SIGN)) {
			String id = Config.isSign(e.getClickedBlock().getLocation());
			if(id != null) {
				if(Manager.getArena(id).equals(GameState.COUNTDOWN)
						|| Manager.getArena(id).equals(GameState.RECRUTING)) {
					if(Manager.getArena(id).getPlayers().contains(e.getPlayer().getUniqueId())) {
						e.getPlayer().sendMessage(ChatColor.RED + "You are already in this game!");
						return;
					}
					Manager.getArena(id).addPlayer(e.getPlayer());
				}
				e.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void onWorldLoad(WorldLoadEvent e) {
		
		if(Manager.isArenaWorld(e.getWorld())) {
			Manager.getArena(e.getWorld()).setJoinState(true);
		}
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		
		if(e.getCurrentItem() != null && e.getView().getTitle().contains("Team Selection") && e.getRawSlot() < 54) {
			Team team = Team.valueOf(e.getCurrentItem().getItemMeta().getLocalizedName());
			
			if(Manager.getArena(player).getTeam(player).equals(team)) {
				player.sendMessage(ChatColor.GRAY + "You are already on " + team.getDisplay() + ChatColor.GRAY + " team!");
			}
			
			player.sendMessage(ChatColor.GRAY + "You arenow on " + team.getDisplay() + ChatColor.GRAY + " team!");
			Manager.getArena(player).setTeam(player, team);

		}
		
		e.setCancelled(true);
		player.closeInventory();
		
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		if(e.getView().getTitle().contains("Kit Selection") && e.getRawSlot() <= 54 && e.getCurrentItem() != null) {
			KitType type = KitType.valueOf(e.getCurrentItem().getItemMeta().getLocalizedName());
			if(Manager.hasKit(player) && Manager.getKit(player).equals(type)) {
				player.sendMessage(ChatColor.RED + "You have already equippes this kit!");
			}else {
				player.sendMessage(ChatColor.GREEN + "You have equipped the" + type.getDisplay() + ChatColor.GREEN + "kit!");
				Manager.getArena(player).setKit(player.getUniqueId(), type);
			}
			e.setCancelled(true);
			player.closeInventory();
		}
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		Player player = (Player) e.getPlayer();
		if(Manager.isPlaying(player) && Manager.getArena(player).getState().equals(GameState.LIVE)) {
			Manager.getArena(player).getGame().addPoints(player);
			player.sendMessage(ChatColor.GOLD + "+1 Point!");
		}
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player player = (Player) e.getPlayer();
		if(Manager.isPlaying(player)) {
			Manager.getArena(player).removePlayer(player);
		}
	}
	
}
