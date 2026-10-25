package com.vhkraft.behavioral.chainofresponsibility;

/**
 * Concrete handler acting as a fallback catch-all filter for unsorted items.
 */
public class JunkHopper extends HopperHandler {

    @Override
    public void processItem(Item item) {
        System.out.println("[Junk Hopper] Catch-all triggered! Dumping " + item.getName() + " into Misc/Trash Chest.");
    }
}