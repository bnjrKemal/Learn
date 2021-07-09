package com.bnjrKemal;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import com.bnjrKemal.FirstPlugin2.FirstPlugin2Main;

public class AddRecipe implements Listener {

	private FirstPlugin2Main main;
	
	public AddRecipe(FirstPlugin2Main main) {
		this.main = main;
	}
	
	@SuppressWarnings("deprecation")
	public void loadRecipe() {
		
		ItemStack item = new ItemStack(Material.GLASS, 16);
		ShapedRecipe recipe = new ShapedRecipe(item);
		
		recipe.shape("###", "!$!", "###");
		
		recipe.setIngredient('#', Material.SAND);
		recipe.setIngredient('$', Material.BEDROCK);
		recipe.setIngredient('!', Material.DIAMOND);
		
		main.getServer().addRecipe(recipe);
		
	}

}
