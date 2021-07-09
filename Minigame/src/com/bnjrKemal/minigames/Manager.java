package com.bnjrKemal.minigames;

import java.util.ArrayList;

public class Manager {

	private static ArrayList<Arena> arenas;
	
	public Manager() {
		arenas = new ArrayList<Arena>();
		
		for(int i = 0; i <= Config.getArenaAmount(); i++) {
			arenas.add(new Arena(i));
		}
		
	}
	
}
