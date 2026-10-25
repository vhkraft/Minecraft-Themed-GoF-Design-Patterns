package com.vhkraft.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Client class simulating a Minecraft engine rendering a forest world
 * efficiently using the Flyweight pattern.
 */
public class TestFlyweight {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Forest World Flyweight Test ===");

        List<WorldBlock> worldBlocks = new ArrayList<>();

        // Simulate generating 10,000 oak leaves across a forest grid
        System.out.println("[System] Generating forest landscape with Oak Leaves...");
        
        for (int i = 0; i < 3; i++) {
            // Request shared flyweight instance from factory
            BlockType sharedOakLeaves = BlockFactory.getBlockType("OakLeaves");
            
            // Create world blocks with unique extrinsic coordinates (x, y, z) sharing the same flyweight
            worldBlocks.add(new WorldBlock(100 + i, 64, 200, sharedOakLeaves));
            worldBlocks.add(new WorldBlock(100 + i, 65, 200, sharedOakLeaves));
        }

        System.out.println("\n[System] --- Rendering World Blocks ---");
        for (WorldBlock block : worldBlocks) {
            block.render();
        }

        System.out.println("\n[System] Memory Efficiency Report:");
        System.out.println("[System] Total World Blocks Rendered: " + worldBlocks.size());
        System.out.println("[System] Unique Flyweight Instances in Memory: " + BlockFactory.getCachedInstanceCount());
        System.out.println("[System] === Test Completed Successfully ===");
    }
}