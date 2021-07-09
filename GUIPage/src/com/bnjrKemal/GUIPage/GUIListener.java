package com.bnjrKemal.GUIPage;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUIListener implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player player = (Player) e.getWhoClicked();
		ItemStack item = e.getCurrentItem();
		Inventory inv = e.getInventory();
		String title = e.getView().getTitle();
		
		//Sayfa de�i�tirmek i�in
		if(item != null && item.getType() != null && title.contains("GUI Page - ")) {
			/*
			 * GUI.java'da saklanan veriyi �ekme.
			 * Bu envanterin ka��nc� sayfan�n oldu�unu ��renmek i�in.
			 */
			int page = Integer.parseInt(inv.getItem(0).getItemMeta().getLocalizedName());
			
			//Geri sayfaya �eviren d��me
			if(e.getRawSlot() == 0 /*T�klanan slot*/ && item.getType().equals(Material.GREEN_STAINED_GLASS_PANE)) {
				new GUI(player, page - 1);
			}
			//�leri sayfaya �eviren d��me
			else if(e.getRawSlot() == 8 & item.getType().equals(Material.GREEN_STAINED_GLASS_PANE)) {
				new GUI(player, page + 1);
			}
			
			e.setCancelled(true); //Envanterden item almay� engelleme
			
		}
		
	}
	
}
