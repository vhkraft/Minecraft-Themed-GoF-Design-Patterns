package com.vhkraft.structural.decorator;

/**
 * Represents a standard, un-enchanted Diamond Sword in Minecraft.
 * Acts as the concrete component in the Decorator pattern.
 */
public class DiamondSword implements Weapon {

    @Override
    public void attack() {
        System.out.println("[Action Bar] *Swish!* Swing diamond sword for " + getDamage() + " damage.");
    }

    @Override
    public int getDamage() {
        return 7; // Base diamond sword damage in Minecraft
    }

    @Override
    public String getDescription() {
        return "Diamond Sword";
    }
}
