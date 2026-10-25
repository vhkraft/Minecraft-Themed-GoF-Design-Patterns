package com.vhkraft.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Shulker Box container in Minecraft.
 * Acts as a composite component holding a collection of ItemComponents.
 */
public class ShulkerBox implements ItemComponent {
    private String boxName;
    private List<ItemComponent> children = new ArrayList<>();

    /**
     * Constructs a Shulker Box with a specific color or name.
     * 
     * @param boxName the name of the shulker box
     */
    public ShulkerBox(String boxName) {
        this.boxName = boxName;
    }

    /**
     * Adds an item component (leaf or composite) into the shulker box.
     * 
     * @param component the item component to add
     */
    public void add(ItemComponent component) {
        children.add(component);
        System.out.println("[Action Bar] *Snap!* Placed item into " + boxName);
    }

    /**
     * Removes an item component from the shulker box.
     * 
     * @param component the item component to remove
     */
    public void remove(ItemComponent component) {
        children.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ [Shulker Box] " + boxName + " (Total Items: " + getItemCount() + ")");
        for (ItemComponent component : children) {
            // Recursively display children with increased indentation
            component.display(indent + "   ");
        }
    }

    @Override
    public int getItemCount() {
        int total = 0;
        for (ItemComponent component : children) {
            total += component.getItemCount();
        }
        return total;
    }
}
