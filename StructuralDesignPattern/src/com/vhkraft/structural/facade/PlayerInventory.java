package com.vhkraft.structural.facade;

/**
 * Represents the player inventory subsystem component. Manages checking for
 * required materials and consuming them upon crafting.
 */
public class PlayerInventory {

	/**
	 * Checks if the player has enough of the specified item.
	 * 
	 * @param itemName the item to check
	 * @param count    the required amount
	 * @return true if sufficient items exist
	 */
	public boolean hasResources(String itemName, int count) {
		System.out.println("[System] Checking inventory for " + count + "x " + itemName + "...");
		return true; // Simplified for demonstration
	}

	/**
	 * Consumes items from the player's inventory after crafting.
	 * 
	 * @param itemName the item to consume
	 * @param count    the amount to consume
	 */
	public void consumeItems(String itemName, int count) {
		System.out.println("[System] Consumed " + count + "x " + itemName + " from inventory slots.");
	}
}