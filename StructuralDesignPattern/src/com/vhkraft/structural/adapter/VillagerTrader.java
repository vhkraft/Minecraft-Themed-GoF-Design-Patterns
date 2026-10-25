package com.vhkraft.structural.adapter;

/**
 * Target interface representing standard Villager trading mechanics in the overworld.
 * Expected by the client's automated trading system.
 */
public interface VillagerTrader {
    
    /**
     * Executes a trade using standard emerald currency.
     * 
     * @param emeraldCount number of emeralds provided for the trade
     */
    void tradeEmerald(int emeraldCount);
}