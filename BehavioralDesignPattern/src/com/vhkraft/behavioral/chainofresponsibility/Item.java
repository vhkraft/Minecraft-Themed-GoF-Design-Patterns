package com.vhkraft.behavioral.chainofresponsibility;

/**
 * Model class representing an item passing through the hopper sorting pipeline.
 */
public class Item {
    private final String name;
    private final String category;

    /**
     * Constructs an item instance.
     * 
     * @param name item display name
     * @param category item category (e.g., "ORE", "FOOD", "JUNK")
     */
    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}