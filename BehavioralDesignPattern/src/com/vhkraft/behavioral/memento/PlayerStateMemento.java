package com.vhkraft.behavioral.memento;

/**
 * Memento class holding an immutable snapshot of the player's state 
 * (location, health, and inventory) at the time of sleeping in a bed.
 */
public class PlayerStateMemento {
    private final String location;
    private final int health;
    private final String inventorySnapshot;

    /**
     * Constructs a player state memento with immutable checkpoint data.
     * 
     * @param location world coordinates/dimension
     * @param health player health points
     * @param inventorySnapshot items carried at checkpoint
     */
    public PlayerStateMemento(String location, int health, String inventorySnapshot) {
        this.location = location;
        this.health = health;
        this.inventorySnapshot = inventorySnapshot;
    }

    public String getLocation() {
        return location;
    }

    public int getHealth() {
        return health;
    }

    public String getInventorySnapshot() {
        return inventorySnapshot;
    }
}