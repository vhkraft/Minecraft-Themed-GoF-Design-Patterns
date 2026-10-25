package com.vhkraft.behavioral.chainofresponsibility;

/**
 * Client test class demonstrating the Chain of Responsibility pattern 
 * by passing items through a chain of Minecraft Hoppers.
 */
public class TestChainOfResponsibility {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Hopper Transfer Pipeline Test ===");

        // 1. Build the chain of hoppers: OreHopper -> FoodHopper -> JunkHopper
        HopperHandler oreHopper = new OreHopper();
        HopperHandler foodHopper = new FoodHopper();
        HopperHandler junkHopper = new JunkHopper();

        oreHopper.setNext(foodHopper).setNext(junkHopper);

        System.out.println("[System] Hopper pipeline configured: OreHopper -> FoodHopper -> JunkHopper\n");

        // 2. Test Item 1: Diamond Ore
        Item item1 = new Item("Raw Diamond Ore", "ORE");
        System.out.println("--- Inserting: " + item1.getName() + " ---");
        oreHopper.processItem(item1);

        System.out.println();

        // 3. Test Item 2: Cooked Porkchop
        Item item2 = new Item("Cooked Porkchop", "FOOD");
        System.out.println("--- Inserting: " + item2.getName() + " ---");
        oreHopper.processItem(item2);

        System.out.println();

        // 4. Test Item 3: Cobblestone
        Item item3 = new Item("Cobblestone Block", "MISC");
        System.out.println("--- Inserting: " + item3.getName() + " ---");
        oreHopper.processItem(item3);

        System.out.println("\n[System] === Chain of Responsibility Test Completed Successfully ===");
    }
}