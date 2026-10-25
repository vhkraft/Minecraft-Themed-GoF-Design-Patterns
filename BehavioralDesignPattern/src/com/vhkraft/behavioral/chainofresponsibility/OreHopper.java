package com.vhkraft.behavioral.chainofresponsibility;

/**
 * Concrete handler responsible for filtering and sorting mineral ores.
 */
public class OreHopper extends HopperHandler {

    @Override
    public void processItem(Item item) {
        if ("ORE".equalsIgnoreCase(item.getCategory())) {
            System.out.println("[Ore Hopper] Match found! Pulled " + item.getName() + " into Ore Smelting Chest.");
        } else {
            System.out.println("[Ore Hopper] Not an ore (" + item.getName() + "). Passing downstream...");
            forwardToNext(item);
        }
    }
}