package com.vhkraft.behavioral.chainofresponsibility;

/**
 * Concrete handler responsible for filtering and sorting food items.
 */
public class FoodHopper extends HopperHandler {

    @Override
    public void processItem(Item item) {
        if ("FOOD".equalsIgnoreCase(item.getCategory())) {
            System.out.println("[Food Hopper] Match found! Pulled " + item.getName() + " into Food Storage Chest.");
        } else {
            System.out.println("[Food Hopper] Not food (" + item.getName() + "). Passing downstream...");
            forwardToNext(item);
        }
    }
}