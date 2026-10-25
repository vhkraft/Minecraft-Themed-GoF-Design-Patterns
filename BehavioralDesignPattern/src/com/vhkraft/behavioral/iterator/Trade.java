package com.vhkraft.behavioral.iterator;

/**
 * Model class representing an individual Minecraft villager trade offer.
 */
public class Trade {
    private final String inputItem;
    private final String outputItem;
    private final int emeraldCost;

    /**
     * Constructs a villager trade offer.
     * 
     * @param inputItem the item offered by player
     * @param emeraldCost cost in emeralds
     * @param outputItem item given by villager
     */
    public Trade(String inputItem, int emeraldCost, String outputItem) {
        this.inputItem = inputItem;
        this.emeraldCost = emeraldCost;
        this.outputItem = outputItem;
    }

    @Override
    public String toString() {
        return inputItem + " (" + emeraldCost + " Emeralds) -> " + outputItem;
    }
}