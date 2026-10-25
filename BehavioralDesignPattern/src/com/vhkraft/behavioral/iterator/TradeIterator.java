package com.vhkraft.behavioral.iterator;

/**
 * Custom iterator interface defining traversal contracts for villager trades.
 */
public interface TradeIterator {
    
    /**
     * Checks if there are more trades available in the sequence.
     * 
     * @return true if another trade exists, false otherwise
     */
    boolean hasNext();

    /**
     * Retrieves the next trade in the sequence and advances the cursor.
     * 
     * @return the next Trade object
     */
    Trade next();
}