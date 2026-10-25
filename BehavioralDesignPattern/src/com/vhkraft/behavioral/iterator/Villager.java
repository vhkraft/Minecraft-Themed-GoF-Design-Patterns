package com.vhkraft.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete aggregate representing a Minecraft Fletcher Villager 
 * holding trade offers in internal storage.
 */
public class Villager implements TradeCollection {
    private final String profession;
    private final List<Trade> tradeOffers = new ArrayList<>();

    /**
     * Constructs a villager with a given profession.
     * 
     * @param profession villager job title
     */
    public Villager(String profession) {
        this.profession = profession;
    }

    /**
     * Adds a trade offer to the villager's internal list.
     * 
     * @param trade trade to add
     */
    public void addTrade(Trade trade) {
        tradeOffers.add(trade);
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public TradeIterator createIterator() {
        return new VillagerTradeIterator(tradeOffers);
    }
}