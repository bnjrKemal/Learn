package com.bnjrKemal.First3;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class Cuboid {

	private Vector minV, maxV;
	
	public Cuboid(Location min, Location max) {

		double xPos1 = Math.min(min.getBlockX(), max.getBlockX());
		double yPos1 = Math.min(min.getBlockY(), max.getBlockY());
		double zPos1 = Math.min(min.getBlockZ(), max.getBlockZ());
		
		double xPos2 = Math.max(min.getBlockX(), max.getBlockX());
		double yPos2 = Math.max(min.getBlockY(), max.getBlockY());
		double zPos2 = Math.max(min.getBlockZ(), max.getBlockZ());
		
		minV = new Vector(xPos1, yPos1, zPos1);
		maxV = new Vector(xPos2, yPos2, zPos2);		
	}

	public boolean containsLocation(Location location) {
		return location.toVector().isInAABB(minV, maxV);
	}
	
}
