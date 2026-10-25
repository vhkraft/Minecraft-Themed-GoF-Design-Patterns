package com.vhkraft.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the Block Factory.
 * Manages the flyweight pool, ensuring identical block types are shared in memory.
 */
public class BlockFactory {
    private static Map<String, BlockType> blockTypeCache = new HashMap<>();

    /**
     * Retrieves a shared BlockType instance from the cache, creating it if it doesn't exist.
     * 
     * @codesource Flyweight pattern cache mechanism
     * @param typeName the identifier for the block type
     * @return the shared BlockType instance
     */
    public static BlockType getBlockType(String typeName) {
        BlockType blockType = blockTypeCache.get(typeName);

        if (blockType == null) {
            System.out.println("[System] Cache miss for '" + typeName + "'. Creating new shared Flyweight instance.");
            if ("OakLeaves".equalsIgnoreCase(typeName)) {
                blockModelCreation: {
                    blockType = new OakLeafBlockType("oak_leaves.png", true, 1);
                }
            } else {
                // Default fallback block type
                blockType = new OakLeafBlockType("default_block.png", false, 15);
            }
            blockTypeCache.put(typeName, blockType);
        } else {
            System.out.println("[System] Cache hit! Reusing existing shared Flyweight for '" + typeName + "'.");
        }

        return blockType;
    }

    /**
     * Returns the total count of unique flyweight objects currently cached in memory.
     * 
     * @return total cached instances
     */
    public static int getCachedInstanceCount() {
        return blockTypeCache.size();
    }
}