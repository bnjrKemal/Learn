package com.bnjrKemal.GUIPage;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI {

	public GUI(Player player, int page) {
		
		//GUI olu�turur.
		Inventory inv = Bukkit.createInventory(null, 54, "GUI Page - " + page);
		
		//GUI'de itemleri g�stermek i�in listeye itemler kaydedilir.
		List<ItemStack> items = new ArrayList<>();
		for(int i = 0; i < 223; i++) { //223 adet ender g�z� ekle.
			items.add(new ItemStack(Material.ENDER_EYE));
		}

		//�nceki sayfaya ge�i� i�in d��me i�in item olu�turma
		ItemStack left;
		ItemMeta leftMeta;
		//�nceki sayfay� sorgulama
		if(PageUtil.isPageValid(items, page - 1, 52)) {
			left = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			leftMeta = left.getItemMeta();
			leftMeta.setDisplayName("�nceki sayfaya git");
		}else {
			left = new ItemStack(Material.RED_STAINED_GLASS_PANE);
			leftMeta = left.getItemMeta();
			leftMeta.setDisplayName("�nceki sayfa yok!");
		}
		leftMeta.setLocalizedName(page + ""); /*GUIListener.java 27.sat�r i�in*/
		left.setItemMeta(leftMeta);
		inv.setItem(0, left); //ekle guiye

		//Sonraki sayfaya ge�i� i�in d��me i�in item olu�turma
		//copy paste ve left yerine right de�i�tirdim
		ItemStack right;
		ItemMeta rightMeta;
		//Sonraki sayfay� sorgulama
		if(PageUtil.isPageValid(items, page + 1, 52)) {
			right = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			rightMeta = left.getItemMeta();
			rightMeta.setDisplayName("Sonraki sayfaya git");
		}else {
			right = new ItemStack(Material.RED_STAINED_GLASS_PANE);
			rightMeta = left.getItemMeta();
			rightMeta.setDisplayName("Sonraki sayfa yok!");
		}
		right.setItemMeta(rightMeta);
		inv.setItem(8, right);
		
		//�stenen sayfan�n itemlerini guiye d�kme
		for(ItemStack item : PageUtil.getPageItems(items, page, 52)) {
			inv.setItem(inv.firstEmpty(), item);
		}
		
		//Envanter a��l�r
		player.openInventory(inv);
	}
	
}
