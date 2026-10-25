package com.vhkraft.structural.bridge;

/**
 * Client class simulating Minecraft tools utilizing the Bridge pattern
 * to combine tool types and material tiers independently.
 */
public class TestBridge {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Tool Bridge Test ===");

        // 1. Create a Wooden Pickaxe combination (Refined Abstraction + Concrete Implementor)
        Tool woodenPickaxe = new Pickaxe(new WoodenMaterial());
        System.out.println("[System] Equipped initial tool:");
        woodenPickaxe.useTool("Stone Block");

        System.out.println();

        // 2. Create a Diamond Pickaxe combination without needing a separate WoodenPickaxe class
        Tool diamondPickaxe = new Pickaxe(new DiamondMaterial());
        System.out.println("[System] Upgraded to high-tier tool:");
        diamondPickaxe.useTool("Obsidian Block");

        System.out.println("[System] === Test Completed Successfully ===");
    }
}
