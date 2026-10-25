package com.vhkraft.structural.bridge;

/**
 * Represents the Wooden material tier implementation.
 * Low durability and slow mining speed.
 */
public class WoodenMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 59;
    }

    @Override
    public float getMiningSpeed() {
        return 2.0f;
    }

    @Override
    public String getMaterialName() {
        return "Wooden";
    }
}