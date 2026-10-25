package com.vhkraft.structural.facade;

/**
 * Represents the item and recipe registry subsystem component. Validates
 * whether crafting combinations are allowed.
 */
public class ItemRegistry {

	/**
	 * Validates if the requested item has a valid recipe configuration.
	 * 
	 * @param targetItem the item requested for crafting
	 * @return true if the recipe is valid
	 */
	public boolean validateRecipe(String targetItem) {
		System.out.println("[System] Validating recipe configuration for: " + targetItem);
		return true;
	}

	/**
	 * Retrieves the resulting item name from the recipe match.
	 * 
	 * @param targetItem the crafted item name
	 */
	public void spawnCraftedItem(String targetItem) {
		System.out.println("[System] Spawning " + targetItem + " into player's hand.");
	}
}