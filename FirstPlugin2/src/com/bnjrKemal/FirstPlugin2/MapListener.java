package com.bnjrKemal.FirstPlugin2;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.map.MapView;

public class MapListener implements Listener {

	@EventHandler
	public void onMapInitialize(MapInitializeEvent e) {
		MapView view = e.getMap();
		view.getRenderers().clear();
		view.addRenderer(new Renderer());
	}
	
}
