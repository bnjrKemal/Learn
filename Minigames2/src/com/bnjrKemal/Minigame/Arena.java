package com.bnjrKemal.Minigame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;

import com.bnjrKemal.Minigame.kits.Kit;
import com.bnjrKemal.Minigame.kits.KitType;
import com.bnjrKemal.Minigame.kits.type.Fighter;
import com.bnjrKemal.Minigame.kits.type.Miner;
import com.bnjrKemal.Minigame.team.Team;
import com.google.common.collect.TreeMultimap;

import net.md_5.bungee.api.ChatColor;

public class Arena {

	private String id;
	private ArrayList<UUID> players;
	private HashMap<UUID, Kit> kits;
	private HashMap<UUID, Team> teams;
	private Location sign;
	private Location spawn;
	private GameState state;
	private Countdown countdown;
	private Game game;
	private Villager npc;
	
	private boolean canJoin;
	
	public Arena(String id) {
		this.id = id;
		players = new ArrayList<>();
		kits = new HashMap<>();
		teams = new HashMap<>();
		sign = Config.getArenaSign(id);
		spawn = Config.getArenaSpawn(id);
		state = GameState.RECRUTING;
		countdown = new Countdown(this);
		game = new Game(this);
		updateSign(ChatColor.WHITE + "Arena " + id, ChatColor.GOLD + "RECRUITING", " ", ChatColor.GRAY + "Click to join!");
		npc = (Villager) Config.getNPCSpawn(id).getWorld().spawnEntity(Config.getNPCSpawn(id), EntityType.VILLAGER);
		npc.setAI(true);
		npc.setCustomName(ChatColor.GREEN + "Arena " + id + ChatColor.GRAY + "Click to join!");
		npc.setCustomNameVisible(true);
		npc.setCollidable(false);
		npc.setInvulnerable(true);
		npc.setProfession(Profession.FARMER);
	}

	public void start() {
		game.start();
	}
	
	public void reset() {
		for(UUID uuid : players) {
			removeKit(uuid);
			Bukkit.getPlayer(uuid).teleport(Config.getLobbySpawn());
			Bukkit.getPlayer(uuid).getInventory().clear();
		}
		
		state = GameState.RECRUTING;
		players.clear();
		teams.clear();
		countdown = new Countdown(this);
		game = new Game(this);
		
		Bukkit.unloadWorld(spawn.getWorld().getName(), false);
		canJoin = false;
		spawn = Config.getArenaSpawn(id);
		updateSign(ChatColor.WHITE + "Arena " + id, ChatColor.GOLD + "RECRUITING", " ", ChatColor.GRAY + "Click to join!");
	}
	
	public void sendMessage(String message) {
		for(UUID uuid : players) {
			Bukkit.getPlayer(uuid).sendMessage(message);
		}
	}
	
	public void addPlayer(Player player) {
		players.add(player.getUniqueId());
		player.teleport(spawn);
		
		TreeMultimap<Integer, Team> count = TreeMultimap.create();
		for(Team team : Team.values()) {
			count.put(getTeamCount(team), team);
		}
		
		Team selected = (Team) count.values().toArray()[0];
		setTeam(player, selected);
		
		player.sendMessage(ChatColor.GRAY + "You were placed on " + selected.getDisplay() + ChatColor.GRAY + "team!");
		
		if(players.size() <= Config.getRequiredPlayers()) {
			countdown.begin();
		}
		
	}
	
	public void removePlayer(Player player) {
		players.remove(player.getUniqueId());
		player.teleport(Config.getLobbySpawn());
		removeKit(player.getUniqueId());
		player.getInventory().clear();
		removeTeam(player);
		if(players.size() <= Config.getRequiredPlayers()) {
			reset();
		}
		if(players.size() == 0 && state.equals(GameState.LIVE)) {
			reset();
		}
		if(state.equals(GameState.LIVE)) {
			updateSign(ChatColor.WHITE + "Arena " + id, ChatColor.GOLD + "LIVE", " ", ChatColor.GRAY + "Players: " + ChatColor.GOLD + players.size());
		}
		
		
	}
	
	public void updateSign(String line1, String line2, String line3, String line4) {
		Sign wallSign = (Sign) sign.getBlock().getState();
		wallSign.setLine(0, line1);
		wallSign.setLine(1, line2);
		wallSign.setLine(2, line3);
		wallSign.setLine(3, line4);
		wallSign.update();
	}
	
	public String getID() { return id; }

	public List<UUID> getPlayers() { return players; }
	
	public HashMap<UUID, Kit> getKits() { return kits; }
	
	public GameState getState() { return state; }
	
	public Game getGame() { return game; }
	
	public GameState setState(GameState state) { return this.state = state; }
	
	public void removeKit(UUID uuid) {
		if(kits.containsKey(uuid)) {
			kits.get(uuid).remove();
			kits.remove(uuid);
		}
	}
	
	public void setKit(UUID uuid, KitType type) {
		removeKit(uuid);
		if(type.equals(KitType.FIGHTER)) kits.put(uuid, new Fighter(uuid));
		if(type.equals(KitType.MINER)) kits.put(uuid, new Miner(uuid));
	}

	public void setTeam(Player player, Team team) {
		removeTeam(player);
		teams.put(player.getUniqueId(), team);
	}
	
	public Team getTeam(Player player) { return teams.get(player.getUniqueId()); }
	
	public void removeTeam(Player player) {
		if(teams.containsKey(player.getUniqueId())) {
			teams.remove(player.getUniqueId());
		}
	}
		
	public int getTeamCount(Team team) {
		int amount  = 0;
		for(Team t : teams.values()) {
			if(t.equals(team)) amount++;
		}
		return amount;
	}
	
	public boolean canJoin() { return canJoin;}
	
	public void setJoinState(boolean state) { this.canJoin = state; }
	
	public Location getSpawn() { return spawn; }
	
	public Villager getNPC() { return npc; }
			
}