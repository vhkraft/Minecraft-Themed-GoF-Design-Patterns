package com.vhkraft.behavioral.observer;

/**
 * Concrete observer representing an automatic Piston Harvester 
 * that extends and breaks the crop when receiving a redstone signal.
 */
public class PistonHarvester implements RedstoneObserver {
    
    @Override
    public void update(String stateMessage) {
        System.out.println("[Piston Harvester] Signal received! Piston extends, harvesting wheat automatically. Status: " + stateMessage);
    }
}