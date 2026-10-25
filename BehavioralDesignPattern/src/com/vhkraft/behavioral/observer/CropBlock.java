package com.vhkraft.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject class representing a monitored Wheat Crop block in Minecraft.
 * Manages redstone observer subscriptions and broadcasts growth state updates.
 */
public class CropBlock {
    private final List<RedstoneObserver> observers = new ArrayList<>();
    private int growthStage = 0;

    /**
     * Registers a redstone observer to monitor this crop block.
     * 
     * @param observer the observer to add
     */
    public void addObserver(RedstoneObserver observer) {
        observers.add(observer);
        System.out.println("[Redstone] Observer successfully wired to crop block.");
    }

    /**
     * Unregisters an observer from this crop block.
     * 
     * @param observer the observer to remove
     */
    public void removeObserver(RedstoneObserver observer) {
        observers.remove(observer);
        System.out.println("[Redstone] Observer un-wired from crop block.");
    }

    /**
     * Simulates the crop growing to the next stage and notifies observers if mature.
     */
    public void grow() {
        growthStage++;
        System.out.println("[Crop] Wheat crop growth stage advanced to: " + growthStage);
        
        if (growthStage >= 3) {
            System.out.println("[Observer Block] Maturity detected! Emitting strong redstone pulse...");
            notifyObservers("Wheat crop is fully mature (Stage 3)!");
        }
    }

    /**
     * Notifies all registered observers of a state change.
     * 
     * @param message the notification message
     */
    private void notifyObservers(String message) {
        for (RedstoneObserver observer : observers) {
            observer.update(message);
        }
    }
}