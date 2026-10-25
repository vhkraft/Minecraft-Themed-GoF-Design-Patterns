package com.vhkraft.behavioral.iterator;

/**
 * Client test class demonstrating the Iterator pattern by cycling through 
 * a Fletcher Villager's trades sequentially.
 */
public class TestIterator {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Villager Trade Roll Cycler Test ===");

        // 1. Create a Fletcher Villager and add trade offers
        Villager fletcher = new Villager("Fletcher");
        fletcher.addTrade(new Trade("32 Sticks", 1, "1 Emerald"));
        fletcher.addTrade(new Trade("1 Emerald", 1, "16 Arrows"));
        fletcher.addTrade(new Trade("10 Flint", 1, "1 Bow"));
        fletcher.addTrade(new Trade("24 Feathers", 1, "1 Crossbow"));

        System.out.println("[System] Interacting with " + fletcher.getProfession() + " Villager...");
        System.out.println("[System] Scanning trade roll via Iterator:\n");

        // 2. Obtain Iterator from aggregate
        TradeIterator iterator = fletcher.createIterator();

        // 3. Traverse sequentially using iterator cursor
        int offerNumber = 1;
        while (iterator.hasNext()) {
            Trade trade = iterator.next();
            System.out.println("  Offer #" + offerNumber + ": " + trade);
            offerNumber++;
        }

        System.out.println("\n[System] === Iterator Test Completed Successfully ===");
    }
}