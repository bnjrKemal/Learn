package com.bnjrKemal.Minigame.kits.type;

import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.bnjrKemal.Minigame.kits.Kit;
import com.bnjrKemal.Minigame.kits.KitType;

public class Miner extends Kit {

	public Miner(UUID uuid) {
		super(uuid, KitType.MINER);
	}

	@Override
	public void onStart(Player player) {
		player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
		player.getInventory().addItem(new ItemStack(Material.APPLE, 64));
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		System.out.println(e.getPlayer().getName() + " just broke a block!");
	}
	
}
