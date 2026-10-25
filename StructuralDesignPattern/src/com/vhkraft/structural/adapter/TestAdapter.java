package com.vhkraft.structural.adapter;

/**
 * Client test class demonstrating how the Adapter pattern allows the base system 
 * to interact with incompatible Piglin bartering using standard villager interfaces.
 */
public class TestAdapter {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Piglin Bartering Adapter Test ===");

        // 1. Initialize the incompatible Piglin bartering system (Adaptee)
        PiglinBarterSystem netherPiglin = new PiglinBarterSystem();

        // 2. Wrap it inside the Adapter to match the VillagerTrader target interface
        VillagerTrader piglinTrader = new PiglinAdapter(netherPiglin);

        // 3. Client system interacts via the standard Villager interface without knowing it's a Piglin
        System.out.println("[System] Sending trade request through automated trading station...");
        piglinTrader.tradeEmerald(4);

        System.out.println("[System] === Adapter Test Completed Successfully ===");
    }
}