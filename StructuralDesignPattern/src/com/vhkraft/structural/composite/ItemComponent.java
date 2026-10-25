package com.vhkraft.structural.composite;

/**
 * Represents the common ItemComponent interface in Minecraft.
 * Allows both individual items and container boxes to be treated uniformly.
 */
public interface ItemComponent {
    /**
     * Displays the item or container contents recursively.
     * 
     * @param indent indentation spacing for tree hierarchy display
     */
    void display(String indent);

    /**
     * Retrieves the total count of items within this component.
     * 
     * @return item count
     */
    int getItemCount();
}
