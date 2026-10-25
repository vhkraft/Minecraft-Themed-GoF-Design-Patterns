package com.vhkraft.behavioral.chainofresponsibility;

/**
 * Abstract class defining the successor linking and handling contract 
 * for hopper pipeline filters.
 */
public abstract class HopperHandler {
    protected HopperHandler nextHopper;

    /**
     * Sets the next hopper in the processing chain.
     * 
     * @param nextHopper successor handler
     * @return the successor handler for fluent chaining
     */
    public HopperHandler setNext(HopperHandler nextHopper) {
        this.nextHopper = nextHopper;
        return nextHopper;
    }

    /**
     * Handles the item or passes it to the next handler down the chain.
     * 
     * @param item target item to process
     */
    public abstract void processItem(Item item);

    /**
     * Helper method to forward an item to the successor if one exists.
     * 
     * @param item target item
     */
    protected void forwardToNext(Item item) {
        if (nextHopper != null) {
            nextHopper.processItem(item);
        } else {
            System.out.println("[Hopper Chain] End of pipeline reached. Item lost: " + item.getName());
        }
    }
}