package com.vhkraft.behavioral.iterator;

import java.util.List;

/**
 * Concrete iterator traversing a list of villager trades sequentially.
 */
public class VillagerTradeIterator implements TradeIterator {
    private final List<Trade> trades;
    private int position = 0;

    /**
     * Constructs a trade iterator over a list of trades.
     * 
     * @param trades target trade list
     */
    public VillagerTradeIterator(List<Trade> trades) {
        this.trades = trades;
    }

    @Override
    public boolean hasNext() {
        return position < trades.size();
    }

    @Override
    public Trade next() {
        if (!hasNext()) {
            return null;
        }
        Trade trade = trades.get(position);
        position++;
        return trade;
    }
}