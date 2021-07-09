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
		
		//GUI oluþturur.
		Inventory inv = Bukkit.createInventory(null, 54, "GUI Page - " + page);
		
		//GUI'de itemleri göstermek için listeye itemler kaydedilir.
		List<ItemStack> items = new ArrayList<>();
		for(int i = 0; i < 223; i++) { //223 adet ender gözü ekle.
			items.add(new ItemStack(Material.ENDER_EYE));
		}

		//Önceki sayfaya geçiþ için düðme için item oluþturma
		ItemStack left;
		ItemMeta leftMeta;
		//Önceki sayfayý sorgulama
		if(PageUtil.isPageValid(items, page - 1, 52)) {
			left = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
			leftMeta = left.getItemMeta();
			leftMeta.setDisplayName("Önceki sayfaya git");
		}else {
			left = new ItemStack(Material.RED_STAINED_GLASS_PANE);
			leftMeta = left.getItemMeta();
			leftMeta.setDisplayName("Önceki sayfa yok!");
		}
		leftMeta.setLocalizedName(page + ""); /*GUIListener.java 27.satýr için*/
		left.setItemMeta(leftMeta);
		inv.setItem(0, left); //ekle guiye

		//Sonraki sayfaya geçiþ için düðme için item oluþturma
		//copy paste ve left yerine right deðiþtirdim
		ItemStack right;
		ItemMeta rightMeta;
		//Sonraki sayfayý sorgulama
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
		
		//Ýstenen sayfanýn itemlerini guiye dökme
		for(ItemStack item : PageUtil.getPageItems(items, page, 52)) {
			inv.setItem(inv.firstEmpty(), item);
		}
		
		//Envanter açýlýr
		player.openInventory(inv);
	}
	
}
