package com.vhkraft.behavioral.iterator;

/**
 * Aggregate interface defining factory method for creating a TradeIterator.
 */
public interface TradeCollection {
    
    /**
     * Factory method creating an iterator for traversing trades.
     * 
     * @return a new TradeIterator instance
     */
    TradeIterator createIterator();
}