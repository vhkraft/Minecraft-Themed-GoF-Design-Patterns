package com.vhkraft.structural.bridge;

/**
 * Represents the ToolMaterial implementor interface in Minecraft.
 * Defines underlying tier statistics independently from tool behavior.
 */
public interface ToolMaterial {
    /**
     * Gets the durability multiplier of the material.
     * 
     * @return durability value
     */
    int getDurability();

    /**
     * Gets the mining speed tier of the material.
     * 
     * @return mining speed value
     */
    float getMiningSpeed();

    /**
     * Gets the name of the material tier.
     * 
     * @return material name string
     */
    String getMaterialName();
}