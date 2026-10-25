package com.vhkraft.structural.bridge;

/**
 * Represents the Diamond material tier implementation.
 * High durability and rapid mining speed.
 */
public class DiamondMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 1562;
    }

    @Override
    public float getMiningSpeed() {
        return 8.0f;
    }

    @Override
    public String getMaterialName() {
        return "Diamond";
    }
}