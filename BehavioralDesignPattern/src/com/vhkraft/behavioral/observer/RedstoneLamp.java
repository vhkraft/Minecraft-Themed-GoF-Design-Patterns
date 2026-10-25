package com.vhkraft.behavioral.observer;

/**
 * Concrete observer representing a Redstone Lamp that lights up 
 * when receiving a redstone signal from the observer block.
 */
public class RedstoneLamp implements RedstoneObserver {
    
    @Override
    public void update(String stateMessage) {
        System.out.println("[Redstone Lamp] Signal received! Lamp lights up brilliantly. Status: " + stateMessage);
    }
}