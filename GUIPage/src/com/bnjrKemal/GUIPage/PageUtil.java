package com.bnjrKemal.GUIPage;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class PageUtil {

	//�temlerini sayfaya b�lme
	public static List<ItemStack> getPageItems(List<ItemStack> items, int page, int spaces){
		int upperBound =  page * spaces; //Sonuncu item'in list'in s�ra say�s�
		int lowerBound = upperBound - spaces; //Birinci item'in list'in s�ra say�s�
		
		//B�l�nen itemlerini listeye alma
		List<ItemStack> newItems = new ArrayList<>();
		for(int i = lowerBound; i < upperBound; i++) {
			try { newItems.add(items.get(i)); }catch(IndexOutOfBoundsException e) { continue; }
		}
		//d�nd�r
		return newItems;		
	}
	
	//�evrilen sayfa sorgulama
	public static boolean isPageValid(List<ItemStack> items, int page, int spaces) {
		if(page <= 0) {
			return false; //dur
		}
		int upperBound =  page * spaces; //Sonuncu item'in list'in s�ra say�s�
		int lowerBound = upperBound - spaces; //Birinci item'in list'in s�ra say�s�
		
		return items.size() > lowerBound; //Birinci item'in list'in s�ra say�s�, total listenin s�ra say�s�n� ge�miyorsa true d�nd�r
	}
}
