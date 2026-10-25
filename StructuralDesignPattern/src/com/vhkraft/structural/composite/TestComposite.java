package com.vhkraft.structural.composite;

/**
 * Client class simulating a Minecraft player inspecting nested Shulker Boxes
 * using the Composite pattern.
 */
public class TestComposite {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Shulker Box Composite Test ===");

        // 1. Create individual leaf items
        ItemComponent diamonds = new SingleItem("Diamond", 32);
        ItemComponent netherite = new SingleItem("Netherite Ingot", 4);
        ItemComponent goldenApples = new SingleItem("Enchanted Golden Apple", 10);

        // 2. Create a nested inner Shulker Box and pack items into it
        ShulkerBox innerBox = new ShulkerBox("Red Shulker Box");
        innerBox.add(diamonds);
        innerBox.add(netherite);

        // 3. Create an outer Shulker Box containing a single item and the inner box
        ShulkerBox outerBox = new ShulkerBox("Purple Shulker Box");
        outerBox.add(goldenApples);
        outerBox.add(innerBox); // Nesting composite inside composite

        // 4. Display the entire recursive inventory structure uniformly
        System.out.println("\n[System] Inspecting outer Shulker Box contents:");
        outerBox.display("");

        System.out.println("\n[System] === Test Completed Successfully ===");
    }
}
