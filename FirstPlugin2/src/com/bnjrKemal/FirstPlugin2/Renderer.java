package com.bnjrKemal.FirstPlugin2;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class Renderer extends MapRenderer {

	@Override
	public void render(MapView view, MapCanvas canvas, Player player) {
		
		try {
			URL url = new URL("https://cravatar.eu/avatar/" + player.getName() + "/128.png");
			BufferedImage image = ImageIO.read(url);
			canvas.drawImage(0, 0, image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
