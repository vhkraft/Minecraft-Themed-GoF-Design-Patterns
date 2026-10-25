package com.vhkraft.structural.composite;

/**
 * Represents a single leaf item in Minecraft (e.g., Diamond, Gold Ingot).
 * Cannot contain child components.
 */
public class SingleItem implements ItemComponent {
    private String name;
    private int count;

    /**
     * Constructs a single item with a name and quantity.
     * 
     * @param name the item name
     * @param count the quantity
     */
    public SingleItem(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- [Item] " + count + "x " + name);
    }

    @Override
    public int getItemCount() {
        return count;
    }
}