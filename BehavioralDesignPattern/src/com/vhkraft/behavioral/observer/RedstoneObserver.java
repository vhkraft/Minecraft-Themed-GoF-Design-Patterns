package com.vhkraft.behavioral.observer;

/**
 * Observer interface defining the contract for redstone components 
 * that listen to block state changes.
 */
public interface RedstoneObserver {
    
    /**
     * Triggered when the observed block updates its state.
     * 
     * @param stateMessage description of the state change or redstone signal
     */
    void update(String stateMessage);
}