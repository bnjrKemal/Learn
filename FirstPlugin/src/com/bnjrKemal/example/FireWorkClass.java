package com.bnjrKemal.example;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireWorkClass implements Listener {

	@EventHandler
	public void onSneak(PlayerToggleSneakEvent e) {
	
		Firework firework = e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Firework.class);
		FireworkMeta meta = firework.getFireworkMeta();
		meta.addEffects(FireworkEffect.builder()
				.withColor(Color.BLACK)
				.withColor(Color.GREEN)
				.withColor(Color.LIME)
				.with(Type.STAR)
				.withFlicker().build());
		meta.setPower(1);
		firework.setFireworkMeta(meta);
	
	}
}
