package com.bnjrKemal.Minigame.kits.type;

import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.bnjrKemal.Minigame.kits.Kit;
import com.bnjrKemal.Minigame.kits.KitType;

public class Fighter extends Kit {

	public Fighter(UUID uuid) {
		super(uuid, KitType.FIGHTER);
	}

	@Override
	public void onStart(Player player) {
		player.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE));
		player.getInventory().addItem(new ItemStack(Material.TORCH, 64));
	}

}
