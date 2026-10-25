package com.vhkraft.behavioral.memento;

/**
 * Originator class representing the Minecraft player character 
 * whose state can be saved to a memento and restored upon death.
 */
public class PlayerCharacter {
    private String location;
    private int health;
    private String inventory;

    /**
     * Constructs a player character with initial status.
     * 
     * @param location starting location
     * @param health starting health
     * @param inventory starting inventory items
     */
    public PlayerCharacter(String location, int health, String inventory) {
        this.location = location;
        this.health = health;
        this.inventory = inventory;
    }

    /**
     * Creates a memento containing the current player state snapshot.
     * 
     * @return a new PlayerStateMemento instance
     */
    public PlayerStateMemento saveStateToCheckpoint() {
        System.out.println("[Player] Sleeping in bed... Saving checkpoint snapshot.");
        return new PlayerStateMemento(location, health, inventory);
    }

    /**
     * Restores the player state from a given memento.
     * 
     * @param memento the saved checkpoint memento
     */
    public void restoreStateFromCheckpoint(PlayerStateMemento memento) {
        this.location = memento.getLocation();
        this.health = memento.getHealth();
        this.inventory = memento.getInventorySnapshot();
        System.out.println("[Respawn] Waking up at bed checkpoint! State successfully restored.");
    }

    /**
     * Simulates player status changes during gameplay.
     * 
     * @param newLocation updated location
     * @param newHealth updated health
     * @param newInventory updated inventory items
     */
    public void updateState(String newLocation, int newHealth, String newInventory) {
        this.location = newLocation;
        this.health = newHealth;
        this.inventory = newInventory;
        System.out.println("[Player Status] Moved to " + location + " | Health: " + health + " | Inventory: " + inventory);
    }

    public void displayStatus() {
        System.out.println("-> Current Status [Location: " + location + " | Health: " + health + " | Inventory: " + inventory + "]");
    }
}