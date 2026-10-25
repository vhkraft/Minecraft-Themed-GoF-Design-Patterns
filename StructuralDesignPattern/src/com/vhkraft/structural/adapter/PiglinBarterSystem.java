package com.vhkraft.structural.adapter;

/**
 * Adaptee class representing the incompatible Nether Piglin bartering system.
 * Piglins do not recognize emeralds and only accept gold ingots.
 */
public class PiglinBarterSystem {
    
    /**
     * Throws gold ingots to a Piglin to trigger random bartering drops.
     * 
     * @param goldCount number of gold ingots offered
     */
    public void throwGoldIngotForBarter(int goldCount) {
        System.out.println("[Nether Barter] Piglin inspects " + goldCount + " Gold Ingot(s) excitedly and tosses a random item!");
    }
}