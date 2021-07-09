package com.bnjrKemal.GUIPage;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class PageUtil {

	//Ýtemlerini sayfaya bölme
	public static List<ItemStack> getPageItems(List<ItemStack> items, int page, int spaces){
		int upperBound =  page * spaces; //Sonuncu item'in list'in sýra sayýsý
		int lowerBound = upperBound - spaces; //Birinci item'in list'in sýra sayýsý
		
		//Bölünen itemlerini listeye alma
		List<ItemStack> newItems = new ArrayList<>();
		for(int i = lowerBound; i < upperBound; i++) {
			try { newItems.add(items.get(i)); }catch(IndexOutOfBoundsException e) { continue; }
		}
		//döndür
		return newItems;		
	}
	
	//Çevrilen sayfa sorgulama
	public static boolean isPageValid(List<ItemStack> items, int page, int spaces) {
		if(page <= 0) {
			return false; //dur
		}
		int upperBound =  page * spaces; //Sonuncu item'in list'in sýra sayýsý
		int lowerBound = upperBound - spaces; //Birinci item'in list'in sýra sayýsý
		
		return items.size() > lowerBound; //Birinci item'in list'in sýra sayýsý, total listenin sýra sayýsýný geçmiyorsa true döndür
	}
}
