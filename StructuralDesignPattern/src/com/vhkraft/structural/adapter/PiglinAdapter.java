package com.vhkraft.structural.adapter;

/**
 * Adapter class that implements the VillagerTrader target interface 
 * and wraps the incompatible PiglinBarterSystem adaptee.
 */
public class PiglinAdapter implements VillagerTrader {
    private final PiglinBarterSystem piglinBarterSystem;

    /**
     * Constructs the adapter with a reference to the Piglin bartering system.
     * 
     * @param piglinBarterSystem the adaptee instance to wrap
     */
    public PiglinAdapter(PiglinBarterSystem piglinBarterSystem) {
        this.piglinBarterSystem = piglinBarterSystem;
    }

    /**
     * Translates emerald-based trade requests into gold ingot bartering calls.
     * 
     * @param emeraldCount number of emeralds passed by the client system
     */
    @Override
    public void tradeEmerald(int emeraldCount) {
        System.out.println("[Adapter] Converting " + emeraldCount + " Emerald(s) into Gold Ingot equivalent for Piglin...");
        // Translation rule: 1 emerald translates to 1 gold ingot for Nether bartering
        int goldEquivalent = emeraldCount;
        piglinBarterSystem.throwGoldIngotForBarter(goldEquivalent);
    }
}