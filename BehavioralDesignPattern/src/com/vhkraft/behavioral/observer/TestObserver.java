package com.vhkraft.behavioral.observer;

/**
 * Client test class demonstrating the Observer pattern by wiring 
 * redstone lamps and piston harvesters to a monitored crop block.
 */
public class TestObserver {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Redstone Observer Block Test ===");

        // 1. Create the Subject (Crop Block)
        CropBlock wheatCrop = new CropBlock();

        // 2. Create Concrete Observers (Redstone Lamp & Piston Harvester)
        RedstoneObserver ceilingLamp = new RedstoneLamp();
        RedstoneObserver autoPiston = new PistonHarvester();

        // 3. Register observers to the crop block
        wheatCrop.addObserver(ceilingLamp);
        wheatCrop.addObserver(autoPiston);

        System.out.println();

        // 4. Simulate crop growth stages
        System.out.println("[System] Simulation Step 1:");
        wheatCrop.grow(); // Stage 1

        System.out.println("\n[System] Simulation Step 2:");
        wheatCrop.grow(); // Stage 2

        System.out.println("\n[System] Simulation Step 3:");
        wheatCrop.grow(); // Stage 3 (Triggers observers!)

        System.out.println("[System] === Observer Test Completed Successfully ===");
    }
}